package HrProject.src.com.hr.dao;

import java.sql.ResultSet;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import HrProject.src.com.hr.dto.JobHistoryDto;
import HrProject.src.com.hr.util.DBConn;

public class JobHistoryDao {
	// select
				public ArrayList<JobHistoryDto> select() {
					ArrayList<JobHistoryDto> dtos = new ArrayList<JobHistoryDto>();
					ResultSet rs = DBConn.statementQuery("select * from job_history");
					try {
						while (rs.next()) {
							dtos.add(new JobHistoryDto(
									rs.getInt("employee_id"), 
									rs.getTimestamp("start_date").toLocalDateTime(),
									rs.getTimestamp("end_date").toLocalDateTime(),
									rs.getString("job_id"), 
									rs.getInt("department_id") 
									));
							
						}
					} catch (Exception e) {
						System.out.println("예외발생");
						e.printStackTrace();
					}
					return dtos;
					
				}

				// insert
				public void insert(JobHistoryDto dtos) {
					String sql = String.format(
							"insert into job_history values(%d,to_date('%s','YYYY-MM-DD HH24:MI:SS'),to_date('%s','YYYY-MM-DD HH24:MI:SS'),'%s', %d)",
							dtos.getEmployee_id(),
							dtos.getStart_date().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")),
							dtos.getEnd_date().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")),
							dtos.getJob_id(),
							dtos.getDepartment_id());
					DBConn.statementUpdate(sql);
				}

				// update
				public void update(int employee_id,String start_date, String job_id) {
					String sql = String.format("update job_history set job_id='%s' where employee_id=%d and start_date=to_date('%s','YYYY-MM-DD HH24:MI:SS')", job_id, employee_id,start_date);
					DBConn.statementUpdate(sql);
				}

				// delete
				public void delete(int employee_id,String start_date) {
					DBConn.statementUpdate(String.format("delete job_history where employee_id=%d and start_date=to_date('%s','YYYY-MM-DD HH24:MI:SS')", employee_id,start_date));
				}
}
