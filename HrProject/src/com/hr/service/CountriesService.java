package HrProject.src.com.hr.service;

import java.util.ArrayList;

import HrProject.src.com.hr.dao.CountriesDao;
import HrProject.src.com.hr.dto.CountriesDto;


public class CountriesService {
private CountriesDao dao = new CountriesDao();
	
	public ArrayList<CountriesDto> select(){
		ArrayList<CountriesDto> dtos = dao.select();
		return dtos;
	}
	
	public void insert(CountriesDto dto){
		dao.insert(dto);
	}
	
	public void delete(String country_id){
		dao.delete(country_id);
	}
	
	public void update(String country_id,String country_name){
		dao.update(country_id, country_name);
	}

}
