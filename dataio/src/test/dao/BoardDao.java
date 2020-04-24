package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import test.vo.Board;

public class BoardDao {
	
	public List<Board> BoardList() {
		return this.getSqlSession().selectList("test.dao.SampleMapper.BoardList");
	}
	public List<Board> BoardListOne(int bNo) {
		return this.getSqlSession().selectList("test.dao.SampleMapper.BoardListOne", bNo);
	}
	public void InsertBoard(Board b) {
		SqlSession sqlSession = this.getSqlSession();
		sqlSession.insert("test.dao.SampleMapper.InsertBoard", b);
		sqlSession.commit();
	}
	public void DeleteBoard(int bNo) {
		SqlSession sqlSession = this.getSqlSession();
		sqlSession.delete("test.dao.SampleMapper.DeleteBoard", bNo);
		sqlSession.commit();
	}
	public void UpdateBoard(Board b) {
		SqlSession sqlSession = this.getSqlSession();
		sqlSession.delete("test.dao.SampleMapper.UpdateBoard", b);
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