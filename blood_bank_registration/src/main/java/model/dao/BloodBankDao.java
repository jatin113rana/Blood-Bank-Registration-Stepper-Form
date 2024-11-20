package model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import model.dto.DonorDetails;

public class BloodBankDao {
	
	
//	FileInputStream fis;
	Properties property=new Properties();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	Statement stm;
	{
		try {
//			Loading and Registering Driver
			Class.forName("org.postgresql.Driver");
//			Creating Connection
			String url ="jdbc:postgresql://ep-fancy-voice-a194iymw.ap-southeast-1.aws.neon.tech/blood_bank?user=blood_bank_owner&password=YL8EC6dSKUIl&sslmode=require";
			con =DriverManager.getConnection(url);
			
//			Creating Statement Object
			stm= con.createStatement();
			
			
			System.out.println("Connection done...");
			} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	Method to add all Details
	public boolean addAllDetails(DonorDetails dd) {
		String query = "insert into blood_bank(name,age,gender,phone,blood_group,last_donation_date,complications,state,city,pincode,full_address) values (?,?,?,?,?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(query);
			
			ps.setString(1,dd.getName());
			ps.setInt(2,dd.getAge());
			ps.setString(3, dd.getGender());
			ps.setLong(4, dd.getPhone());
			
			ps.setString(5, dd.getBlood_group());
			ps.setDate(6, Date.valueOf(dd.getLast_donation_date()));
			ps.setString(7, dd.getComplication());
			
			ps.setString(8, dd.getState());
			ps.setString(9, dd.getCity());
			ps.setInt(10, dd.getPincode());
			ps.setString(11, dd.getAddress());
			
			if(ps.executeUpdate()>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
//	Method to get all Donor Details
	public List<DonorDetails> getAllDonors(){
		List<DonorDetails> data = new ArrayList<DonorDetails>();
		String query = "select * from blood_bank";
		try {
			rs=stm.executeQuery(query);
			if(rs.next()) {
				do {
					data.add(new DonorDetails(rs.getString("name"),rs.getInt("age"),rs.getString("gender"),rs.getLong("phone"),rs.getString("blood_group"),rs.getString("last_donation_date"), rs.getString("complications"), rs.getString("state"), rs.getString("city"), rs.getInt("pincode"), rs.getString("full_address")));
				}while(rs.next());
				return data;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}

