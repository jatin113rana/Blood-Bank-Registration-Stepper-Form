package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.BloodBankDao;
import model.dto.DonorDetails;

@WebServlet("/personal_details")
public class PersonalDetailsController extends HttpServlet{
	BloodBankDao bDao = new BloodBankDao();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String gender = req.getParameter("gender");
		long phone = Long.parseLong(req.getParameter("phone"));
		
		DonorDetails dd = new DonorDetails();
		dd.setName(name);
		dd.setAge(age);
		dd.setGender(gender);
		dd.setPhone(phone);

		HttpSession session1 = req.getSession();
		session1.setAttribute("dd", dd);
		
	
	
	RequestDispatcher rd =req.getRequestDispatcher("blood_details.jsp");
	rd.forward(req, resp);
	
	
	
	
	
	}
	

}
