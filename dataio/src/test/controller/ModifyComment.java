package test.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.service.CommentService;
import test.vo.Comment;

@WebServlet("/ModifyComment")
public class ModifyComment extends HttpServlet {
	private CommentService cService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cNo = Integer.parseInt(request.getParameter("cNo"));
		int bNo = Integer.parseInt(request.getParameter("bNo"));
		
		System.out.println(cNo + " <-- ModifyComment.doGet().cNo");
		System.out.println(bNo + " <-- ModifyComment.doGet().bNo");
		
		cService = new CommentService();
		List<Comment> list = cService.CommentListOne(cNo);
		request.setAttribute("list", list);
		
		request.setAttribute("bNo", bNo);
		
		request.getRequestDispatcher("/WEB-INF/views/modifyCommentForm.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		int cNo = Integer.parseInt(request.getParameter("cNo"));
		int bNo = Integer.parseInt(request.getParameter("bNo"));
		String cUser = request.getParameter("cUser");
		String cComment = request.getParameter("cComment");
		String cDate = request.getParameter("cDate");
		
		System.out.println(cNo + " <-- ModifyComment.doGet().cNo");
		System.out.println(bNo + " <-- ModifyComment.doGet().bNo");
		System.out.println(cUser + " <-- ModifyComment.doGet().cUser");
		System.out.println(cComment + " <-- ModifyComment.doGet().cComment");
		System.out.println(cDate + " <-- ModifyComment.doGet().cDate");
		
		Comment c = new Comment();
		c.setcNo(cNo);
		c.setbNo(bNo);
		c.setcUser(cUser);
		c.setcComment(cComment);
		c.setcDate(cDate);
		
		CommentService cService = new CommentService();
		cService.ModifyComment(c);
		
		response.sendRedirect(request.getContextPath() + "/BoardListOne?bNo=" + bNo);
	}
}
