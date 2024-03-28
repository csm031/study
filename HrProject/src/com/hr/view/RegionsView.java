package HrProject.src.com.hr.view;

import java.util.ArrayList;

import HrProject.src.com.hr.dto.RegionsDto;
import HrProject.src.com.hr.model.Model;
import HrProject.src.com.hr.util.UserInput;


public class RegionsView {
	public void mainView(Model model){
		String strMainMenu = "~ Regions 프로그램 ~\n";
		strMainMenu += "| 1.Select | 2.Insert | 3.Update | 4.Delete | 5.Exit |\n";			
		model.setAttribute("input", UserInput.inputInt(strMainMenu));		
	}

	
	public void selectView(Model model) {
		System.out.println("------------------------------------------");	
			
		for (RegionsDto dto : (ArrayList<RegionsDto>) model.getAttribute("dtos")) {
			System.out.println(dto);
		}	
		
	}

	public void insertView(Model model) {
		System.out.println("------------------------------------------");
		System.out.println("생성할 Region 데이터 입력");
		RegionsDto dto = new RegionsDto();
		dto.setRegion_id(UserInput.inputInt("region_id 입력"));
		dto.setRegion_name(UserInput.inputString("region_name 이름 입력"));		
		model.setAttribute("dto", dto);
		
	}

	public void updateView(Model model) {
		System.out.println("------------------------------------------");
		System.out.println("region_id를 찾아 region_name을 변경한다.");
		int region_id =UserInput.inputInt("찾을 region_id 입력");			
		String region_name = UserInput.inputString("변경할 region_name 입력");
		model.setAttribute("region_id",region_id);
		model.setAttribute("region_name",region_name);
		
	}

	public void deleteView(Model model) {
		System.out.println("------------------------------------------");
		System.out.println("삭제할 region_id 입력");
		int region_id = UserInput.inputInt("region_id 입력");
		model.setAttribute("region_id", region_id);
	}
	
}
