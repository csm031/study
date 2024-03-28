package HrProject.src.com.hr.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import HrProject.src.com.hr.dto.LocationsDto;
import HrProject.src.com.hr.util.DBConn;



public class LocationsDao {
	// select
		public ArrayList<LocationsDto> select() {
			ArrayList<LocationsDto> dtos = new ArrayList<LocationsDto>();
			ResultSet rs = DBConn.statementQuery("select * from locations");
			try {
				while (rs.next()) {
					dtos.add(new LocationsDto(
							rs.getInt("location_id"),
							rs.getString("country_id"),
							rs.getString("street_address"),
							rs.getString("postal_code"),
							rs.getString("city"),
							rs.getString("state_province")
							));
				}
			} catch (Exception e) {
				System.out.println("예외발생");
				e.printStackTrace();
			}
			return dtos;
		}

		// insert
		public void insert(LocationsDto dtos) {
			String sql = String.format(
					"insert into locations values(%d, '%s', '%s','%s','%s','%s')",
					dtos.getLocation_id(), dtos.getStreet_address(),dtos.getPostal_code(), 
					dtos.getCity(),dtos.getState_province(), dtos.getCountry_id()					
					);
			DBConn.statementUpdate(sql);
		}

		// update
		public void update(int location_id, String street_address) {
			String sql = String.format("update locations set street_address='%s' where location_id=%d", street_address, location_id);
			DBConn.statementUpdate(sql);
		}

		// delete
		public void delete(int location_id) {
			DBConn.statementUpdate(String.format("delete locations where location_id = %d", location_id));
		}
}
