package ukma.baratheons.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ukma.baratheons.lms.dao.RoomDao;
import ukma.baratheons.lms.entity.Room;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomDao roomDao;

	public List<Room> getAll() {
		return roomDao.getAll();
	}

}
