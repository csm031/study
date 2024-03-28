package HrProject.src.com.hr.service;

import java.util.ArrayList;

import HrProject.src.com.hr.dao.LocationsDao;
import HrProject.src.com.hr.dto.LocationsDto;



public class LocationsService {
private LocationsDao dao = new LocationsDao();
	
	public ArrayList<LocationsDto> select(){
		ArrayList<LocationsDto> dtos = dao.select();
		return dtos;
	}
	
	public void insert(LocationsDto dto){
		dao.insert(dto);
	}
	
	public void delete(int location_id){
		dao.delete(location_id);
	}
	
	public void update(int location_id,String street_address){
		dao.update(location_id, street_address);
	}
}
