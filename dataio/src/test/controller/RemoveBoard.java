package test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.service.BoardService;

@WebServlet("/RemoveBoard")
public class RemoveBoard extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bNo = Integer.parseInt(request.getParameter("bNo"));
		
		System.out.println(bNo + " <-- RemoveBoard.doGet().bNo");
		
		BoardService bService = new BoardService();
		bService.RemoveBoard(bNo);
		
		response.sendRedirect(request.getContextPath() + "/BoardList");
	}
}