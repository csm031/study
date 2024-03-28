package HrProject.src.com.hr.ex;

import java.util.ArrayList;

import HrProject.src.com.hr.dto.RegionsDto;
import HrProject.src.com.hr.model.Model;
import HrProject.src.com.hr.service.RegionsService;
import HrProject.src.com.hr.view.RegionsView;



public class RegionsEx {

	public static void main(String[] args) {
System.out.println("Regions 프로그램");
		
		RegionsView regionsView = new RegionsView(); //화면
		RegionsService regionsService = new RegionsService(); //비즈니스 로직
		Model model = new Model(); //MVC에서 데이터 공유
		
		int input = 0;
		while(input != 5){
			regionsView.mainView(model);
			input = (int)model.getAttribute("input");
			switch (input) {
			case 1:
				ArrayList<RegionsDto> dtos = regionsService.select();
				model.setAttribute("dtos", dtos);
				regionsView.selectView(model);
				break;
			case 2:
				regionsView.insertView(model);
				regionsService.insert((RegionsDto)model.getAttribute("dto"));
				break;
			case 3:
				regionsView.updateView(model);
				regionsService.update((int)model.getAttribute("region_id"), (String)model.getAttribute("region_name"));
				break;
			case 4:
				regionsView.deleteView(model);
				regionsService.delete((int)model.getAttribute("region_id"));
				break;
			default:
			}
			
			
			
			
			
			
		}
		System.out.println("프로그램 종료");
	}

}
