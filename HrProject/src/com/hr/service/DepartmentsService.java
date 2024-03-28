package HrProject.src.com.hr.service;

import java.util.ArrayList;

import HrProject.src.com.hr.dao.DepartmentsDao;
import HrProject.src.com.hr.dto.DepartmentsDto;

public class DepartmentsService {
private DepartmentsDao dao = new DepartmentsDao();
	
	public ArrayList<DepartmentsDto> select(){
		ArrayList<DepartmentsDto> dtos = dao.select();
		return dtos;
	}
	
	public void insert(DepartmentsDto dto){
		dao.insert(dto);
	}
	
	public void delete(int department_id){
		dao.delete(department_id);
	}
	
	public void update(int department_id,String department_name){
		dao.update(department_id, department_name);
	}
}
