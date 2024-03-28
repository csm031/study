package HrProject.src.com.hr.service;

import java.util.ArrayList;

import HrProject.src.com.hr.dao.JobHistoryDao;
import HrProject.src.com.hr.dto.JobHistoryDto;



public class JobHistoryService {
private JobHistoryDao dao = new JobHistoryDao();
	
	public ArrayList<JobHistoryDto> select(){
		ArrayList<JobHistoryDto> dtos = dao.select();
		return dtos;
	}
	
	public void insert(JobHistoryDto dto){
		dao.insert(dto);
	}
	
	public void update(int employee_id, String start_date,String job_id){
		dao.update(employee_id, start_date,job_id);
	}

	public void delete(int employee_id,String start_date){
		dao.delete(employee_id,start_date);
	}
	
	
}
