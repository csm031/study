package HrProject.src.com.hr.ex;

import java.util.ArrayList;

import HrProject.src.com.hr.dto.LocationsDto;
import HrProject.src.com.hr.model.Model;
import HrProject.src.com.hr.service.LocationsService;
import HrProject.src.com.hr.view.LocationsView;


public class LocationsEx {

	public static void main(String[] args) {
System.out.println("고객관리 프로그램");
		
		LocationsView locationsView = new LocationsView(); //화면
		LocationsService locationsService = new LocationsService(); //비즈니스 로직
		Model model = new Model(); //MVC에서 데이터 공유
		
		int input = 0;
		while(input != 5){
			locationsView.mainMenu(model);
			input = (int)model.getAttribute("input");
			switch (input) {
			case 1:
				ArrayList<LocationsDto> dtos = locationsService.select();
				model.setAttribute("dtos", dtos);
				locationsView.selectView(model);
				break;
			case 2:
				locationsView.insertView(model);
				locationsService.insert((LocationsDto)model.getAttribute("dto"));
				break;
			case 3:
				locationsView.updateView(model);
				locationsService.update((int)model.getAttribute("location_id"), (String)model.getAttribute("street_address"));
				break;
			case 4:
				locationsView.deleteView(model);
				locationsService.delete((int)model.getAttribute("location_id"));
				break;
			default:
			}
			
			
			
			
			
			
		}
		System.out.println("프로그램 종료");

	}

}
