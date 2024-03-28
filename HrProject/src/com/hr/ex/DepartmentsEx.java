package HrProject.src.com.hr.ex;

import java.util.ArrayList;

import HrProject.src.com.hr.dto.DepartmentsDto;
import HrProject.src.com.hr.model.Model;
import HrProject.src.com.hr.service.DepartmentsService;
import HrProject.src.com.hr.view.DepartmentsView;

public class DepartmentsEx {

	public static void main(String[] args) {
		System.out.println("고객관리 프로그램");
		
		DepartmentsView departmentsView = new DepartmentsView(); //화면
		DepartmentsService departmentsService = new DepartmentsService(); //비즈니스 로직
		Model model = new Model(); //MVC에서 데이터 공유
		
		int input = 0;
		while(input != 5){
			departmentsView.mainMenu(model);
			input = (int)model.getAttribute("input");
			switch (input) {
			case 1:
				ArrayList<DepartmentsDto> dtos = departmentsService.select();
				model.setAttribute("dtos", dtos);
				departmentsView.selectView(model);
				break;
				
			case 2:
				departmentsView.insertView(model);
				departmentsService.insert((DepartmentsDto)model.getAttribute("dto"));
				break;
			case 3:
				departmentsView.updateView(model);
				departmentsService.update((int)model.getAttribute("department_id"), (String)model.getAttribute("department_name"));
				break;
			case 4:
				departmentsView.deleteView(model);
				departmentsService.delete((int)model.getAttribute("department_id"));
				break;
			default:
			}
			
			
			
		}
		System.out.println("프로그램 종료");

	}

}
