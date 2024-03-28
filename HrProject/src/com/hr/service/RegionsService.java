package HrProject.src.com.hr.service;

import java.util.ArrayList;
import HrProject.src.com.hr.dao.RegionsDao;
import HrProject.src.com.hr.dto.RegionsDto;

public class RegionsService {
	private RegionsDao dao = new RegionsDao();

	public ArrayList<RegionsDto> select() {
		return dao.select();
	}
	public void insert(RegionsDto dto) {
		dao.insert(dto);
	}

	public void update(int region_id, String region_name) {
		dao.update(region_id, region_name);
	}

	public void delete(int region_id) {
		dao.delete(region_id);
	}
	
}
