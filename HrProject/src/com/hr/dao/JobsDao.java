package HrProject.src.com.hr.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import HrProject.src.com.hr.dto.JobsDto;
import HrProject.src.com.hr.util.DBConn;

public class JobsDao {
	// select
			public ArrayList<JobsDto> select() {
				ArrayList<JobsDto> dtos = new ArrayList<JobsDto>();
				ResultSet rs = DBConn.statementQuery("select * from jobs");
				try {
					while (rs.next()) {
						dtos.add(new JobsDto(
								rs.getString("job_id"), 
								rs.getString("job_title"), 
								rs.getInt("min_salary"), 
								rs.getInt("max_salary")
								));
						
					}
				} catch (Exception e) {
					System.out.println("예외발생");
					e.printStackTrace();
				}
				return dtos;
			}

			// insert
			public void insert(JobsDto dtos) {
				String sql = String.format(
						"insert into jobs values('%s', '%s', %d, %d)",
						dtos.getJob_id(), dtos.getJob_title(),
						dtos.getMin_salary(), dtos.getMax_salary());
				DBConn.statementUpdate(sql);
			}

			// update
			public void update(String job_id, String job_title) {
				String sql = String.format("update jobs set job_title='%s' where job_id='%s'", job_title, job_id);
				DBConn.statementUpdate(sql);
			}

			// delete
			public void delete(String job_id) {
				DBConn.statementUpdate(String.format("delete jobs where job_id = '%s'", job_id));
			}
}
