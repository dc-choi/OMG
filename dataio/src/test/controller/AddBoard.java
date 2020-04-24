package test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.service.BoardService;
import test.vo.Board;

@WebServlet("/AddBoard")
public class AddBoard extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/addBoardForm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String bTitle = request.getParameter("bTitle");
		String bUser = request.getParameter("bUser");
		String bContext = request.getParameter("bContext");
		
		System.out.println(bTitle + " <-- AddBoard.doPost().bTitle");
		System.out.println(bUser + " <-- AddBoard.doPost().bUser");
		System.out.println(bContext + " <-- AddBoard.doPost().bContext");
		
		Board b = new Board();
		b.setbTitle(bTitle);
		b.setbUser(bUser);
		b.setbContext(bContext);
		
		BoardService bSerivce = new BoardService();
		bSerivce.AddBoard(b);
		
		response.sendRedirect(request.getContextPath() + "/BoardList");
	}
}