package HrProject.src.com.hr.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import HrProject.src.com.hr.dto.DepartmentsDto;
import HrProject.src.com.hr.util.DBConn;

public class DepartmentsDao {
	// select
			public ArrayList<DepartmentsDto> select() {
				ArrayList<DepartmentsDto> dtos = new ArrayList<DepartmentsDto>();
				ResultSet rs = DBConn.statementQuery("select * from departments");
				try {
					while (rs.next()) {
						dtos.add(new DepartmentsDto(
								rs.getInt("department_id"), 
								rs.getInt("location_id"),
								rs.getString("department_name"), 
								rs.getInt("manager_id") 
								));
						
					}
				} catch (Exception e) {
					System.out.println("예외발생");
					e.printStackTrace();
				}
				return dtos;
			}

			// insert
			public void insert(DepartmentsDto dtos) {
				String sql = String.format(
						"insert into departments values(%d,'%s', %d, %d)",
						dtos.getDepartment_id(), dtos.getDepartment_name(),
						dtos.getManager_id(),dtos.getLocation_id());
				DBConn.statementUpdate(sql);
			}

			// update
			public void update(int department_id, String department_name) {
				String sql = String.format("update departments set department_name='%s' where department_id='%s'", department_name, department_id);
				DBConn.statementUpdate(sql);
			}

			// delete
			public void delete(int department_id) {
				DBConn.statementUpdate(String.format("delete departments where department_id = '%s'", department_id));
			}

}
