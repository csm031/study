package HrProject.src.com.hr.dto;

import java.time.LocalDateTime;
import java.util.Objects;

public class JobHistoryDto {
	private Integer employee_id = 0;
	private LocalDateTime start_date;
	private LocalDateTime end_date;
	private String job_id="";
	private Integer department_id=0;
	
	public JobHistoryDto(){}

	public JobHistoryDto(Integer employee_id, LocalDateTime start_date, LocalDateTime end_date, String job_id,
			Integer department_id) {
		super();
		this.employee_id = employee_id;
		this.start_date = start_date;
		this.end_date = end_date;
		this.job_id = job_id;
		this.department_id = department_id;
	}

	@Override
	public String toString() {
		return "JobHistoryDto [employee_id=" + employee_id + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", job_id=" + job_id + ", department_id=" + department_id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(department_id, employee_id, end_date, job_id, start_date);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobHistoryDto other = (JobHistoryDto) obj;
		return Objects.equals(department_id, other.department_id) && Objects.equals(employee_id, other.employee_id)
				&& Objects.equals(end_date, other.end_date) && Objects.equals(job_id, other.job_id)
				&& Objects.equals(start_date, other.start_date);
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public LocalDateTime getStart_date() {
		return start_date;
	}

	public void setStart_date(LocalDateTime start_date) {
		this.start_date = start_date;
	}

	public LocalDateTime getEnd_date() {
		return end_date;
	}

	public void setEnd_date(LocalDateTime end_date) {
		this.end_date = end_date;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	
}
