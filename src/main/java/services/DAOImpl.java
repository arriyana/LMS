package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import data.Test;

@Repository
public class DAOImpl implements DAO{

	private DataSource dataSource;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Test> getTest() {
		String sql = "select * from test";
		
		Connection conn = null;
		try{
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			List<Test> tests = new ArrayList<Test>();
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				tests.add(new Test(rs.getInt("id"),rs.getInt("number")));
			}
			rs.close();
			ps.close();
			return tests;
		}catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
        	if (conn != null) {
        		try {
        			conn.close();
        			} catch (SQLException e) {}
        		}
        	}
	}

	
	
}
