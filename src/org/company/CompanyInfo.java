package org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("company name");

	}
	
	private void companyName(int id) {
		System.out.println("company id:"+id);

	}
	private void companyName(int id, int yoj) {
		System.out.println("Company id:"+ id);
		
	System.out.println("Year of Joining:"+ yoj);

	}
	private void info() {
		
		System.out.println("regarding model info is to print");
		System.out.println("regarding model info is to print");
	}
	private void companyName(String name, long mobile) {
		System.out.println("Client name:"+name);
		System.out.println("mobile number:"+mobile);

	}
	private void companyName(long mobile, float rating) {
		System.out.println("Company rating:"+rating);
		System.out.println("mobile number:"+mobile);

	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName();
		c.companyName(123);
		c.companyName(435, 2020);
		c.companyName(9876598765l, 4.5f);
		c.companyName("Sathya", 89898989l);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
