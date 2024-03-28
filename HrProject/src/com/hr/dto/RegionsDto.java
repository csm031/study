package HrProject.src.com.hr.dto;

import java.util.Objects;

public class RegionsDto {
	private Integer region_id=0;
	private String region_name="";
	
	public RegionsDto(){}
	public RegionsDto(Integer region_id, String region_name) {
		super();
		this.region_id = region_id;
		this.region_name = region_name;
	}
	@Override
	public String toString() {
		return "RegionsDto [region_id=" + region_id + ", region_name=" + region_name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(region_id, region_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegionsDto other = (RegionsDto) obj;
		return Objects.equals(region_id, other.region_id) && Objects.equals(region_name, other.region_name);
	}
	public Integer getRegion_id() {
		return region_id;
	}
	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	
	

}
