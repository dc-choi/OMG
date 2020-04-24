package test.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.service.BoardService;
import test.vo.Board;

@WebServlet("/BoardList")
public class BoardList extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardService bService = new BoardService();
		List<Board> list = bService.BoardList();
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("/WEB-INF/views/boardList.jsp").forward(request, response);
	}
}