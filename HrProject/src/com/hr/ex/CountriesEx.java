package HrProject.src.com.hr.ex;

import java.util.ArrayList;

import HrProject.src.com.hr.dto.CountriesDto;
import HrProject.src.com.hr.model.Model;
import HrProject.src.com.hr.service.CountriesService;
import HrProject.src.com.hr.view.CountriesView;



public class CountriesEx {

	public static void main(String[] args) {
System.out.println("고객관리 프로그램");
		
		CountriesView countriesView = new CountriesView(); //화면
		CountriesService countriesService = new CountriesService(); //비즈니스 로직
		Model model = new Model(); //MVC에서 데이터 공유
		
		int input = 0;
		while(input != 5){
			countriesView.mainMenu(model);
			input = (int)model.getAttribute("input");
			switch (input) {
			case 1:
				ArrayList<CountriesDto> dtos = countriesService.select();
				model.setAttribute("dtos", dtos);
				countriesView.selectView(model);
				break;
				
			case 2:
				countriesView.insertView(model);
				countriesService.insert((CountriesDto)model.getAttribute("dto"));
				break;
			case 3:
				countriesView.updateView(model);
				countriesService.update((String)model.getAttribute("country_id"), (String)model.getAttribute("country_name"));
				break;
			case 4:
				countriesView.deleteView(model);
				countriesService.delete((String)model.getAttribute("country_id"));
				break;
			default:
			}
			
			
		}
		System.out.println("프로그램 종료");
	}

}
