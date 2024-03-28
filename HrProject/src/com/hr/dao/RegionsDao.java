package HrProject.src.com.hr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import HrProject.src.com.hr.dto.RegionsDto;
import HrProject.src.com.hr.util.DBConn;

public class RegionsDao {
	public ArrayList<RegionsDto> select() {
	ArrayList<RegionsDto> resultDtos = new ArrayList<RegionsDto>();
	ResultSet rs = DBConn.statementQuery(String.format("select * from regions"));
	try {
		while (rs.next()) {
			resultDtos.add(new RegionsDto(rs.getInt("region_id"), rs.getString("region_name")));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return resultDtos;
}	

public void insert(RegionsDto dto) {
	String sql = String.format("insert into regions values(%d,'%s')", dto.getRegion_id(), dto.getRegion_name());
	DBConn.statementUpdate(sql);
	System.out.println("[입력완료]");
}

public void delete(int region_id) {
	String sql = String.format("delete regions where region_id=%d", region_id);
	DBConn.statementUpdate(sql);
	System.out.println("[삭제완료]");
}

public void update(int region_id, String region_name) {
	String sql = String.format("update regions set region_name='%s' where region_id=%d ", region_name, region_id);
	DBConn.statementUpdate(sql);
	System.out.println("[수정 완료]");
}

}
