package dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.Product;

public class Productdao {
	
	protected Connection connection;
	protected ResultSet resultSet;
	protected PreparedStatement preparedStatement;	
	
	public Productdao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3307/test01?serverTimezone=UTC" , 
					"root" , "1234");
			System.out.println("연동");
		}
		catch (Exception e) {
			System.out.println("*db 연동 실패");
		}
	}
	
	public static Productdao productdao = new Productdao();
	
	public static Productdao getproductdao() {
		return productdao;
	}
	
	public boolean productwrite(Product product) {
		String sql = "insert into product (pno,pitem,pprint,pcoating,phab,pjub,ppo,pdate1,pdate2)"
				+ "value(?,?,?,?,?,?,?,?,?)";
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, product.getPno());
			preparedStatement.setString(2, product.getPitem());
			preparedStatement.setString(3, product.getPprint());
			preparedStatement.setString(4, product.getPcoating());
			preparedStatement.setString(5, product.getPhab());
			preparedStatement.setString(6, product.getPjub());
			preparedStatement.setString(7, product.getPpo());
			preparedStatement.setString(8, product.getPdate1());
			preparedStatement.setString(9, product.getPdate2());
			preparedStatement.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("product db 오류");
			return false;
		}
	}
	
	public int getpno() {
		String sql = "SELECT count(*) from product";
		try {
			preparedStatement=connection.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				return resultSet.getInt(1);
			}else {
				return 0;
			}
		}catch (Exception e) {
			return 0;
		}
	}
	
	public ArrayList<Product> getlist(){
		ArrayList<Product> product = new ArrayList<Product>();
		String sql = "SELECT * FROM product;";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product2 = new Product(resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getString(6),
						resultSet.getString(7),
						resultSet.getString(8),
						resultSet.getString(9));
				product.add(product2);
			}
			return product;
		} catch (Exception e) {
			System.out.println("getlist 오류");
		}
		return null;
	}

	
}































