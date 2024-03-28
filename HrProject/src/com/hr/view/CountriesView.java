package HrProject.src.com.hr.view;

import java.util.ArrayList;

import HrProject.src.com.hr.dto.CountriesDto;
import HrProject.src.com.hr.model.Model;
import HrProject.src.com.hr.util.UserInput;



public class CountriesView {
	public void mainMenu(Model model) {
		String strMainMenu = "----- Countries 프로그램 -----\n";
		strMainMenu += "| 1.Select | 2.Insert | 3.Update | 4.Delete | 5.Exit |\n";
		System.out.println(strMainMenu);
		model.setAttribute("input", UserInput.inputInt("메뉴 선택"));		
	}

	public void selectView(Model model) {
		ArrayList<CountriesDto> dtos = (ArrayList<CountriesDto>) model.getAttribute("dtos");
		for(CountriesDto dto:dtos){
			System.out.println(dto);
		}
		
	}

	public void insertView(Model model) {
		System.out.println("Countries정보 입력");
		CountriesDto dto = new CountriesDto();
		dto.setCountry_id(UserInput.inputString("country_id :"));
		dto.setRegion_id(UserInput.inputInt("region_id :"));
		dto.setCountry_name(UserInput.inputString("country_name :"));
		
		model.setAttribute("dto", dto);
		
	}

	public void updateView(Model model) {
		System.out.println("Countries정보 입력");
		String country_id=UserInput.inputString("변경할 country_id:");
		String country_name = UserInput.inputString("변경할 country_name:");
		model.setAttribute("country_id", country_id);
		model.setAttribute("country_name", country_name);
	}

	public void deleteView(Model model) {
		System.out.println("Countries정보 입력");
		String country_id=UserInput.inputString("삭제할 country_id:");
		model.setAttribute("country_id", country_id);
		
	}
}
