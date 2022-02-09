package dao;

public class Product {
	
	
	  private int pno;
	  private String pitem;
	  private String pprint;
	  private String pcoating;
	  private String phab;
	  private String pjub;
	  private String ppo;
	  private String pdate1;
	  private String pdate2;
	  
	  public Product() {
		
	  }
	  
	  public String update(String abc) {
		  if(abc.equals("작업중")) {
			  return "-";
		  }
		  return abc;
	  }
	  

	public Product(int pno, String pitem, String pprint, String pcoating, String phab, String pjub, String ppo,
			String pdate1, String pdate2) {
		super();
		this.pno = pno;
		this.pitem = pitem;
		this.pprint = pprint;
		this.pcoating = pcoating;
		this.phab = phab;
		this.pjub = pjub;
		this.ppo = ppo;
		this.pdate1 = pdate1;
		this.pdate2 = pdate2;
	}
	
	
	public Product(int pno, String pitem, String pprint, String pcoating, String phab, String pjub, String ppo,
			String pdate1, String pdate2,int abc) {
		super();
		this.pno = pno;
		this.pitem = update(pitem);
		this.pprint = update(pprint);
		this.pcoating = update(pcoating);
		this.phab = update(phab);
		this.pjub = update(pjub);
		this.ppo = update(ppo);
		this.pdate1 = update(pdate1);
		this.pdate2 = update(pdate2);
	}

	



	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPitem() {
		return pitem;
	}

	public void setPitem(String pitem) {
		this.pitem = pitem;
	}

	public String getPprint() {
		return pprint;
	}

	public void setPprint(String pprint) {
		this.pprint = pprint;
	}

	public String getPcoating() {
		return pcoating;
	}

	public void setPcoating(String pcoating) {
		this.pcoating = pcoating;
	}

	public String getPhab() {
		return phab;
	}

	public void setPhab(String phab) {
		this.phab = phab;
	}

	public String getPjub() {
		return pjub;
	}

	public void setPjub(String pjub) {
		this.pjub = pjub;
	}

	public String getPpo() {
		return ppo;
	}

	public void setPpo(String ppo) {
		this.ppo = ppo;
	}

	public String getPdate1() {
		return pdate1;
	}

	public void setPdate1(String pdate1) {
		this.pdate1 = pdate1;
	}

	public String getPdate2() {
		return pdate2;
	}

	public void setPdate2(String pdate2) {
		this.pdate2 = pdate2;
	}
	  
	  
	  
	  
}
