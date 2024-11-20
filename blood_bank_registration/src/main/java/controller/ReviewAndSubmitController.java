package controller;

import java.io.IOException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.BloodBankDao;
import model.dto.DonorDetails;

@WebServlet("/review_and_submit")
public class ReviewAndSubmitController extends HttpServlet{
	BloodBankDao bDao = new BloodBankDao();
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	HttpSession session1 = req.getSession();
	DonorDetails dd =(DonorDetails)session1.getAttribute("dd");
	
	if(bDao.addAllDetails(dd)) {
		RequestDispatcher rd = req.getRequestDispatcher("form_submission.jsp");
		rd.forward(req, resp);
		
	}
	
	
	
}

}
