package test.service;

import java.util.List;

import test.dao.BoardDao;
import test.dao.CommentDao;
import test.vo.Board;

public class BoardService {
	private BoardDao bDao;
	
	public List<Board> BoardList() {
		bDao = new BoardDao();
		return bDao.BoardList();
	}
	public List<Board> BoardListOne(int bNo) {
		bDao = new BoardDao();
		return bDao.BoardListOne(bNo);
	}
	public void AddBoard(Board b) {
		bDao = new BoardDao();
		bDao.InsertBoard(b);
	}
	public void RemoveBoard (int bNo) {
		CommentDao cDao = new CommentDao();
		bDao = new BoardDao();
		int row = ((int)(cDao.DeleteCommentFromBoard(bNo)));
		System.out.println(row + " <-- BoardService.RemoveBoard.row");
		if(row != 0) {
			bDao.DeleteBoard(bNo);
		} else {
			System.out.println("댓글만 삭제되었습니다...");
		}
	}
	public void ModifyBoard(Board b) {
		bDao = new BoardDao();
		bDao.UpdateBoard(b);
	}
}