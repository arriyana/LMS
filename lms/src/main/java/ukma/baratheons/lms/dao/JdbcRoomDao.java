package ukma.baratheons.lms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import ukma.baratheons.lms.entity.Room;

@Repository
public class JdbcRoomDao implements RoomDao {
	
	private static final String TABLE_NAME = "test";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Room> getAll() {
		String sql = "select * from " + TABLE_NAME;
		List<Room> rooms = jdbcTemplate.query(sql, new RoomMapper());
		return rooms;
	}
	
	private static final class RoomMapper implements RowMapper<Room> {

	    public Room mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	Room room = new Room();
	    	room.setId(rs.getLong("id"));
	    	room.setNumber(rs.getInt("number"));
	        return room;
	    }
	    
	}

}