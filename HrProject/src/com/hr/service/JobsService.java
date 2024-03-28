package HrProject.src.com.hr.service;

import java.util.ArrayList;

import HrProject.src.com.hr.dao.JobsDao;
import HrProject.src.com.hr.dto.JobsDto;

public class JobsService {
	private JobsDao dao = new JobsDao();

	public ArrayList<JobsDto> select() {
		return dao.select();
	}

	public void insert(JobsDto dto) {
		dao.insert(dto);
	}

	public void update(String job_id, String job_title) {
		dao.update(job_id, job_title);
	}

	public void delete(String job_id) {
		dao.delete(job_id);
	}
}
