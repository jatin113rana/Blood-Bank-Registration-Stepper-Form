package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dto.DonorDetails;

@WebServlet("/blood_details_controller")
public class BloodDetailsController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String blood_group = req.getParameter("blood_group");
		String donation_date = req.getParameter("donation_date");
		String complication = req.getParameter("complication");
		
		HttpSession session1 = req.getSession();
		DonorDetails dd =(DonorDetails)session1.getAttribute("dd");
		
		dd.setBlood_group(blood_group);
		dd.setLast_donation_date(donation_date);
		dd.setComplication(complication);

		
		RequestDispatcher rd = req.getRequestDispatcher("address_details.jsp");
		rd.forward(req, resp);
		
		
		
	}

}
