package HrProject.src.com.hr.dto;

import java.util.Objects;

public class DepartmentsDto {
	private Integer department_id = 0;
	private Integer location_id = 0;
	private String department_name = "";
	private Integer manager_id=0;
	
	public DepartmentsDto(){}

	public DepartmentsDto(Integer department_id, Integer location_id, String department_name, Integer manager_id) {
		super();
		this.department_id = department_id;
		this.location_id = location_id;
		this.department_name = department_name;
		this.manager_id = manager_id;
	}

	@Override
	public String toString() {
		return "DepartmentsDto [department_id=" + department_id + ", location_id=" + location_id + ", department_name="
				+ department_name + ", manager_id=" + manager_id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(department_id, department_name, location_id, manager_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartmentsDto other = (DepartmentsDto) obj;
		return Objects.equals(department_id, other.department_id)
				&& Objects.equals(department_name, other.department_name)
				&& Objects.equals(location_id, other.location_id) && Objects.equals(manager_id, other.manager_id);
	}

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public Integer getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public Integer getManager_id() {
		return manager_id;
	}

	public void setManager_id(Integer manager_id) {
		this.manager_id = manager_id;
	}
	

}
