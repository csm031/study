package HrProject.src.com.hr.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import HrProject.src.com.hr.dto.CountriesDto;
import HrProject.src.com.hr.util.DBConn;


public class CountriesDao {

	// select
		public ArrayList<CountriesDto> select() {
			ArrayList<CountriesDto> dtos = new ArrayList<CountriesDto>();
			ResultSet rs = DBConn.statementQuery("select * from countries");
			try {
				while (rs.next()) {
					dtos.add(new CountriesDto(
							rs.getString("country_id"), 
							rs.getInt("region_id"), 
							rs.getString("country_name")));
					
				}
			} catch (Exception e) {
				System.out.println("예외발생");
				e.printStackTrace();
			}
			return dtos;
		}

		// insert
		public void insert(CountriesDto dtos) {
			String sql = String.format(
					"insert into countries values('%s', '%s', %d)",
					dtos.getCountry_id(), dtos.getCountry_name(),
					dtos.getRegion_id());
			DBConn.statementUpdate(sql);
		}

		// update
		public void update(String country_id, String country_name) {
			String sql = String.format("update countries set country_name='%s' where country_id='%s'", country_name, country_id);
			DBConn.statementUpdate(sql);
		}

		// delete
		public void delete(String country_id) {
			DBConn.statementUpdate(String.format("delete countries where country_id = '%s'", country_id));
		}

	
}
