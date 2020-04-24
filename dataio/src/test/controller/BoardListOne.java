package test.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.service.BoardService;
import test.service.CommentService;
import test.vo.Board;
import test.vo.Comment;

@WebServlet("/BoardListOne")
public class BoardListOne extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bNo = Integer.parseInt(request.getParameter("bNo"));
		System.out.println(bNo + " <-- BoardListOne.doGet().bNo");
		
		BoardService bService = new BoardService();
		List<Board> list = bService.BoardListOne(bNo);
		
		CommentService cService = new CommentService();
		List<Comment> list2 = cService.CommentList(bNo);
		
		System.out.println(list2);
		
		request.setAttribute("bNo", bNo);
		request.setAttribute("BoardList", list);
		request.setAttribute("CommentList", list2);
		
		request.getRequestDispatcher("/WEB-INF/views/boardListOne.jsp").forward(request, response);
	}
}