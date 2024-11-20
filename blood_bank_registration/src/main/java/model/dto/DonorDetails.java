package model.dto;




public class DonorDetails {
	private String name;
	private int age;
	private String gender;
	private long phone;
	private String blood_group ;
	private String last_donation_date;
	private String complication;
	private String state;
	private String city;
	private int pincode;
	private String address;
	
	
	
	public DonorDetails(String name, int age, String gender, long phone, String blood_group, String last_donation_date,
			String complication, String state, String city, int pincode, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.blood_group = blood_group;
		this.last_donation_date = last_donation_date;
		this.complication = complication;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.address = address;
	}
	
	
	public DonorDetails() {
		
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	public String getLast_donation_date() {
		return last_donation_date;
	}
	public void setLast_donation_date(String last_donation_date) {
		this.last_donation_date = last_donation_date;
	}
	public String getComplication() {
		return complication;
	}
	public void setComplication(String medical_complication) {
		this.complication = medical_complication;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
