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

@WebServlet("/ModifyBoard")
public class ModifyBoard extends HttpServlet {
	private BoardService bService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bNo = Integer.parseInt(request.getParameter("bNo"));
		System.out.println(bNo + " <-- ModifyComment.doGet().bNo");
		
		bService = new BoardService();
		List<Board> list = bService.BoardListOne(bNo);
		request.setAttribute("list", list);
		
		request.setAttribute("bNo", bNo);
		
		request.getRequestDispatcher("/WEB-INF/views/modifyBoardForm.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		int bNo = Integer.parseInt(request.getParameter("bNo"));
		String bTitle = request.getParameter("bTitle");
		String bUser = request.getParameter("bUser");
		String bContext = request.getParameter("bContext");
		String bDate = request.getParameter("bDate");
		
		System.out.println(bNo + " <-- ModifyComment.doPost().bNo");
		System.out.println(bTitle + " <-- ModifyComment.doPost().bTitle");
		System.out.println(bUser + " <-- ModifyComment.doPost().bUser");
		System.out.println(bContext + " <-- ModifyComment.doPost().bContext");
		System.out.println(bDate + " <-- ModifyComment.doPost().bDate");
		
		Board b = new Board();
		b.setbNo(bNo);
		b.setbTitle(bTitle);
		b.setbUser(bUser);
		b.setbContext(bContext);
		b.setbDate(bDate);
		
		bService = new BoardService();
		bService.ModifyBoard(b);
		
		response.sendRedirect(request.getContextPath() + "/BoardListOne?bNo=" + bNo);
	}
}