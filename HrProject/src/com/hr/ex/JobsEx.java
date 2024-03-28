package HrProject.src.com.hr.ex;

import java.util.ArrayList;

import HrProject.src.com.hr.dto.JobsDto;
import HrProject.src.com.hr.model.Model;
import HrProject.src.com.hr.service.JobsService;
import HrProject.src.com.hr.view.JobsView;

public class JobsEx {

	public static void main(String[] args) {
		System.out.println("Jobs 프로그램");

		JobsView jobsView = new JobsView(); // 화면
		JobsService jobsService = new JobsService(); // 비즈니스 로직
		Model model = new Model(); // MVC에서 데이터 공유

		int input = 0;
		while (input != 5) {
			jobsView.mainView(model);
			input = (int) model.getAttribute("input");
			switch (input) {
			case 1:
				ArrayList<JobsDto> dtos = jobsService.select();
				model.setAttribute("dtos", dtos);
				jobsView.selectView(model);
				break;
			case 2:
				jobsView.insertView(model);
				jobsService.insert((JobsDto) model.getAttribute("dto"));
				break;
			case 3:
				jobsView.updateView(model);
				jobsService.update((String) model.getAttribute("job_id"),
						(String) model.getAttribute("job_title"));
				break;
			case 4:
				jobsView.deleteView(model);
				jobsService.delete((String) model.getAttribute("job_id"));
				break;
			default:
			}

		}
		System.out.println("프로그램 종료");

	}

}
