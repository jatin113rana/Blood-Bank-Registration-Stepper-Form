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

@WebServlet("/address_details_controller")
public class AddressDetailsController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String state = req.getParameter("state");
		String city = req.getParameter("city");
		int pincode = Integer.parseInt(req.getParameter("pincode"));
		String address = req.getParameter("address");
		
		HttpSession session1 = req.getSession();
		DonorDetails dd =(DonorDetails)session1.getAttribute("dd");
		
		dd.setState(state);
		dd.setCity(city);
		dd.setPincode(pincode);
		dd.setAddress(address);
		

		
		RequestDispatcher rd = req.getRequestDispatcher("review_and_submit.jsp");
		rd.forward(req, resp);
		
	}
}
