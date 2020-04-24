package test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.service.CommentService;
import test.vo.Comment;


@WebServlet("/AddComment")
public class AddComment extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		int bNo = Integer.parseInt(request.getParameter("bNo"));
		String cUser = request.getParameter("cUser");
		String cComment = request.getParameter("cComment");
		
		System.out.println(bNo + " <-- AddComment.doPost().bNo");
		System.out.println(cUser + " <-- AddComment.doPost().cUser");
		System.out.println(cComment + " <-- AddComment.doPost().cComment");
		
		Comment c = new Comment();
		c.setbNo(bNo);
		c.setcUser(cUser);
		c.setcComment(cComment);
		
		CommentService cService = new CommentService();
		cService.AddComment(c);
		
		response.sendRedirect(request.getContextPath() + "/BoardListOne?bNo=" + bNo);
	}
}