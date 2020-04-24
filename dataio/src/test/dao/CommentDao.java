package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import test.vo.Comment;

public class CommentDao {
	public List<Comment> CommentList(int bNo) {
		return this.getSqlSession().selectList("test.dao.SampleMapper.CommentList", bNo);
	}
	public List<Comment> CommentListOne(int cNo) {
		return this.getSqlSession().selectList("test.dao.SampleMapper.CommentListOne", cNo);
	}
	public void InsertComment(Comment c) {
		SqlSession sqlSession = this.getSqlSession();
		sqlSession.insert("test.dao.SampleMapper.InsertComment", c);
		sqlSession.commit();
	}
	public void DeleteComment(int cNo) {
		SqlSession sqlSession = this.getSqlSession();
		sqlSession.delete("test.dao.SampleMapper.DeleteComment", cNo);
		sqlSession.commit();
	}
	public int DeleteCommentFromBoard(int bNo) {
		int row = 0;
		SqlSession sqlSession = this.getSqlSession();
		row = sqlSession.delete("test.dao.SampleMapper.DeleteCommentFromBoard", bNo);
		System.out.println(row + " <-- CommentDao.DeleteCommentFromBoard.");
		sqlSession.commit();
		return row;
	}
	public void UpdateComment(Comment c) {
		SqlSession sqlSession = this.getSqlSession();
		sqlSession.update("test.dao.SampleMapper.UpdateComment", c);
		sqlSession.commit();
	}
	
	private SqlSession getSqlSession() {
		InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            System.out.println("mybatis-config.xml파일 못 찾음.");
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
	}
}