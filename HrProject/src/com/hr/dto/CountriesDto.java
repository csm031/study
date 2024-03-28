package HrProject.src.com.hr.dto;

import java.util.Objects;

public class CountriesDto {
	private String country_id="";
	private Integer region_id=0;
	private String country_name="";
	
	public CountriesDto(){}
	public CountriesDto(String country_id, Integer region_id, String country_name) {
		super();
		this.country_id = country_id;
		this.region_id = region_id;
		this.country_name = country_name;
	}
	@Override
	public String toString() {
		return "CountriesDto [country_id=" + country_id + ", region_id=" + region_id + ", country_name=" + country_name
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(country_id, country_name, region_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountriesDto other = (CountriesDto) obj;
		return Objects.equals(country_id, other.country_id) && Objects.equals(country_name, other.country_name)
				&& Objects.equals(region_id, other.region_id);
	}
	public String getCountry_id() {
		return country_id;
	}
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
	public Integer getRegion_id() {
		return region_id;
	}
	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	

	
	
}
