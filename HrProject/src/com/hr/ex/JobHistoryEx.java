package HrProject.src.com.hr.ex;

import java.util.ArrayList;

import HrProject.src.com.hr.dto.JobHistoryDto;
import HrProject.src.com.hr.model.Model;
import HrProject.src.com.hr.service.JobHistoryService;
import HrProject.src.com.hr.view.JobHistoryView;

public class JobHistoryEx {
	public static void main(String[] args) {

		System.out.println("JobHistory 프로그램");

		JobHistoryView jobHistoryView = new JobHistoryView(); // 화면
		JobHistoryService jobHistoryService = new JobHistoryService(); // 비즈니스 로직
		Model model = new Model(); // MVC에서 데이터 공유

		int input = 0;
		while (input != 5) {
			jobHistoryView.mainMenu(model);
			input = (int) model.getAttribute("input");
			switch (input) {
			case 1:
				ArrayList<JobHistoryDto> dtos = jobHistoryService.select();
				model.setAttribute("dtos", dtos);
				jobHistoryView.selectView(model);
				break;

			case 2:
				jobHistoryView.insertView(model);
				jobHistoryService.insert((JobHistoryDto) model.getAttribute("dto"));
				break;
			case 3:
				jobHistoryView.updateView(model);
				jobHistoryService.update((int) model.getAttribute("employee_id"),
						(String) model.getAttribute("start_date"), (String) model.getAttribute("job_id"));
				break;
			case 4:
				jobHistoryView.deleteView(model);
				jobHistoryService.delete((int) model.getAttribute("employee_id"),
						(String) model.getAttribute("start_date"));
				break;
			default:
			}

		}
		System.out.println("프로그램 종료");
	}
}
