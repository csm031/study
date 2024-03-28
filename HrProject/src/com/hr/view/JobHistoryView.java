package HrProject.src.com.hr.view;

import java.util.ArrayList;

import HrProject.src.com.hr.dto.JobHistoryDto;
import HrProject.src.com.hr.model.Model;
import HrProject.src.com.hr.util.UserInput;

public class JobHistoryView {
	public void mainMenu(Model model) {
		String strMainMenu = "----- JobHistory 프로그램 -----\n";
		strMainMenu += "| 1.Select | 2.Insert | 3.Update | 4.Delete | 5.Exit |\n";
		System.out.println(strMainMenu);
		model.setAttribute("input", UserInput.inputInt("메뉴 선택"));		
	}

	public void selectView(Model model) {
		ArrayList<JobHistoryDto> dtos = (ArrayList<JobHistoryDto>) model.getAttribute("dtos");
		for(JobHistoryDto dto:dtos){
			System.out.println(dto);
		}
		
	}

	public void insertView(Model model) {
		System.out.println("Countries정보 입력");
		JobHistoryDto dto = new JobHistoryDto();
		dto.setEmployee_id(UserInput.inputInt("employee_id :"));
		dto.setStart_date(UserInput.inputLocalDateTime("start_date :"));
		dto.setEnd_date(UserInput.inputLocalDateTime("end_date :"));
		dto.setJob_id(UserInput.inputString("job_id :"));
		dto.setDepartment_id(UserInput.inputInt("department_id :"));
		
		model.setAttribute("dto", dto);
		
	}

	public void updateView(Model model) {
		System.out.println("employee_id,start_date정보 입력받아 job_id변경");
		int employee_id=UserInput.inputInt("변경할 employee_id:");
		String start_date=UserInput.inputString("변경할 start_date:");
		String job_id = UserInput.inputString("수정할 job_id:");
		model.setAttribute("employee_id", employee_id);
		model.setAttribute("start_date", start_date);
		model.setAttribute("job_id", job_id);
	}

	public void deleteView(Model model) {
		System.out.println("삭제할 JobHistory정보 입력");
		int employee_id=UserInput.inputInt("삭제할 employee_id:");
		String start_date=UserInput.inputString("삭제할 start_date:");
		model.setAttribute("employee_id", employee_id);
		model.setAttribute("start_date", start_date);
		
	}
}
