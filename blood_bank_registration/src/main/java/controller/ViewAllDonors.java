package controller;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.BloodBankDao;
import model.dto.DonorDetails;

@WebServlet("/view_all_donors")
public class ViewAllDonors extends HttpServlet{
	BloodBankDao bDao = new BloodBankDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<DonorDetails> dds = bDao.getAllDonors();
		
		RequestDispatcher rd = req.getRequestDispatcher("view_all_donors.jsp");
		req.setAttribute("donors", dds);
		rd.forward(req, resp);
	}

}
