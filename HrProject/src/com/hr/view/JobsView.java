package HrProject.src.com.hr.view;

import java.util.ArrayList;

import HrProject.src.com.hr.dto.JobsDto;
import HrProject.src.com.hr.model.Model;
import HrProject.src.com.hr.util.UserInput;

public class JobsView {
	public void mainView(Model model) {
		String strMainMenu = "~ Jobs 프로그램 ~\n";
		strMainMenu += "| 1.Select | 2.Insert | 3.Update | 4.Delete | 5.Exit |\n";
		model.setAttribute("input", UserInput.inputInt(strMainMenu));
	}

	public void selectView(Model model) {
		System.out.println("------------------------------------------");

		for (JobsDto dto : (ArrayList<JobsDto>) model.getAttribute("dtos")) {
			System.out.println(dto);
		}

	}

	public void insertView(Model model) {
		System.out.println("------------------------------------------");
		System.out.println("생성할 Jobs 데이터 입력");
		JobsDto dto = new JobsDto();
		dto.setJob_id(UserInput.inputString("job_id 입력"));
		dto.setJob_title(UserInput.inputString("job_title 입력"));
		dto.setMin_salary(UserInput.inputInt("min_salary 입력"));
		dto.setMax_salary(UserInput.inputInt("max_salary 입력"));
		
		model.setAttribute("dto", dto);

	}

	public void updateView(Model model) {
		System.out.println("------------------------------------------");
		System.out.println("job_id로 찾아 job_title을 변경한다.");
		String job_id = UserInput.inputString("찾을 job_id 입력");
		String job_title = UserInput.inputString("변경할 job_title 입력");
		model.setAttribute("job_id", job_id);
		model.setAttribute("job_title", job_title);

	}

	public void deleteView(Model model) {
		System.out.println("------------------------------------------");
		System.out.println("삭제할 job_id 입력");
		String job_id = UserInput.inputString("job_id 입력");
		model.setAttribute("job_id", job_id);
	}
}
