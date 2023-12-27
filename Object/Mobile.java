package Object;

public class Mobile extends Product{
	private String mobile_manufacturer ; 
	private double mobile_ram ;
	
	
	
	public Mobile() {
		
	}



	public Mobile(int product_id, String product_name, int product_price, int product_total, String mobile_manufacturer,
			double mobile_ram) {
		super(product_id, product_name, product_price, product_total);
		this.mobile_manufacturer = mobile_manufacturer;
		this.mobile_ram = mobile_ram;
	}


	
	public String getMobile_manufacturer() {
		return mobile_manufacturer;
	}



	public void setMobile_manufacturer(String mobile_manufacturer) {
		this.mobile_manufacturer = mobile_manufacturer;
	}



	public double getMobile_ram() {
		return mobile_ram;
	}



	public void setMobile_ram(double mobile_ram) {
		this.mobile_ram = mobile_ram;
	}


	
	@Override
	public String toString() {
		return "Mobile ["+super.toString()+" mobile_manufacturer=" + mobile_manufacturer + ", mobile_ram=" + mobile_ram + "]";
	}



	@Override
	public double getTotalPrice() {
		// TODO Auto-generated method stub
		double result = this.getProduct_total()*this.getProduct_price() ; 
		return result*1.2;
	}
	
}

