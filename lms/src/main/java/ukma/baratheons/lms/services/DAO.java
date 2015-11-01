package ukma.baratheons.lms.services;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Service;

import ukma.baratheons.lms.data.Test;

@Service
public interface DAO {

	public void setDataSource(DataSource dataSource);
	
	public List<Test> getTest();
	
}