package test.service;

import java.util.List;

import test.dao.CommentDao;
import test.vo.Comment;

public class CommentService {
	private CommentDao cDao;
	
	public List<Comment> CommentList(int bNo) {
		cDao = new CommentDao();
		return cDao.CommentList(bNo);
	}
	public List<Comment> CommentListOne(int cNo) {
		cDao = new CommentDao();
		return cDao.CommentListOne(cNo);
	}
	public void AddComment(Comment c) {
		cDao = new CommentDao();
		cDao.InsertComment(c);
	}
	public void RemoveComment(int cNo) {
		cDao = new CommentDao();
		cDao.DeleteComment(cNo);
	}
	public void RemoveCommentFromBoard(int bNo) {
		cDao = new CommentDao();
		cDao.DeleteComment(bNo);
	}
	public void ModifyComment(Comment c) {
		cDao = new CommentDao();
		cDao.UpdateComment(c);
	}
}