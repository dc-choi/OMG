package test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.service.CommentService;

@WebServlet("/RemoveComment")
public class RemoveComment extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cNo = Integer.parseInt(request.getParameter("cNo"));
		int bNo = Integer.parseInt(request.getParameter("bNo"));
		
		System.out.println(cNo + " <-- RemoveComment.doGet().cNo");
		System.out.println(bNo + " <-- RemoveComment.doGet().bNo");
		
		CommentService cService = new CommentService();
		cService.RemoveComment(cNo);
		
		response.sendRedirect(request.getContextPath() + "/BoardListOne?bNo=" + bNo);
	}
}