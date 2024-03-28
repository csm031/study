package HrProject.src.com.hr.view;

import java.util.ArrayList;

import HrProject.src.com.hr.dto.DepartmentsDto;
import HrProject.src.com.hr.model.Model;
import HrProject.src.com.hr.util.UserInput;

public class DepartmentsView {
	public void mainMenu(Model model) {
		String strMainMenu = "----- Departments 프로그램 -----\n";
		strMainMenu += "| 1.Select | 2.Insert | 3.Update | 4.Delete | 5.Exit |\n";
		System.out.println(strMainMenu);
		model.setAttribute("input", UserInput.inputInt("메뉴 선택"));		
	}

	public void selectView(Model model) {
		ArrayList<DepartmentsDto> dtos = (ArrayList<DepartmentsDto>) model.getAttribute("dtos");
		for(DepartmentsDto dto:dtos){
			System.out.println(dto);
		}
		
	}

	public void insertView(Model model) {
		System.out.println("Departments정보 입력");
		DepartmentsDto dto = new DepartmentsDto();
		dto.setDepartment_id(UserInput.inputInt("department_id :"));
		dto.setDepartment_name(UserInput.inputString("department_name :"));
		dto.setManager_id(UserInput.inputInteger("manager_id :"));
		dto.setLocation_id(UserInput.inputInt("location_id :"));
		
		model.setAttribute("dto", dto);
		
	}

	public void updateView(Model model) {
		System.out.println("Departments정보 입력");
		int department_id=UserInput.inputInt("변경할 department_id:");
		String department_name = UserInput.inputString("변경할 department_name:");
		model.setAttribute("department_id", department_id);
		model.setAttribute("department_name", department_name);
	}

	public void deleteView(Model model) {
		System.out.println("Departments정보 입력");
		int department_id=UserInput.inputInt("삭제할 department_id:");
		model.setAttribute("department_id", department_id);
		
	}
}
