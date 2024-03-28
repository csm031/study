package HrProject.src.com.hr.view;

import java.util.ArrayList;

import HrProject.src.com.hr.dto.LocationsDto;
import HrProject.src.com.hr.model.Model;
import HrProject.src.com.hr.util.UserInput;



public class LocationsView {
	public void mainMenu(Model model) {
		String strMainMenu = "----- Locations 프로그램 -----\n";
		strMainMenu += "| 1.Select | 2.Insert | 3.Update | 4.Delete | 5.Exit |\n";
		System.out.println(strMainMenu);
		model.setAttribute("input", UserInput.inputInt("메뉴 선택"));		
	}

	public void selectView(Model model) {
		ArrayList<LocationsDto> dtos = (ArrayList<LocationsDto>) model.getAttribute("dtos");
		for(LocationsDto dto:dtos){
			System.out.println(dto);
		}
		
	}

	public void insertView(Model model) {
		System.out.println("Locations정보 입력");
		LocationsDto dto = new LocationsDto();
		dto.setLocation_id(UserInput.inputInt("location_id :"));
		dto.setCountry_id(UserInput.inputString("country_id :"));
		dto.setStreet_address(UserInput.inputString("street_address :"));
		dto.setPostal_code(UserInput.inputString("postal_code :"));
		dto.setCity(UserInput.inputString("city :"));
		dto.setState_province(UserInput.inputString("state_province :"));
		
		model.setAttribute("dto", dto);
		
	}

	public void updateView(Model model) {
		System.out.println("Locations정보 입력");
		int location_id=UserInput.inputInt("변경할 location_id:");
		String street_address = UserInput.inputString("변경할 street_address:");
		model.setAttribute("location_id", location_id);
		model.setAttribute("street_address", street_address);
	}

	public void deleteView(Model model) {
		System.out.println("Locations정보 입력");
		int location_id=UserInput.inputInt("삭제할 location_id:");
		model.setAttribute("location_id", location_id);
		
	}
}
