package JAVA_0319.customer.src.com.human.view;

import java.util.ArrayList;

import JAVA_0319.customer.src.com.human.dto.CustomerDto;
import JAVA_0319.customer.src.com.human.model.Model;
import JAVA_0319.customer.src.com.human.util.UserInput;

public class HumanView {
	public HumanView() {
		// private 생성자로 인스턴스화 방지
	}

	public void exitOutputView(Model model) {
		System.out.println("------------------------------------------");
		System.out.println("프로그램을 종료합니다.");
		model.setAttribute("input", 5);
	}

	public void mainMenuView(Model model) {
		String strMainMenu = "~ Customer Service 프로그램 ~";
		strMainMenu += "| 1.Select | 2.Insert | 3.Update | 4.Delete | 5.Exit |";
		model.setAttribute("input", UserInput.inputInt(strMainMenu));

	}

	public void deleteInputView(Model model) {
		System.out.println("------------------------------------------");
		System.out.println("삭제할 데이터 입력");
		int id = UserInput.inputInt("id 입력");
		model.setAttribute("id", id);
	}

	public void errorOutputView(Model model) {
		System.out.println("보기에 있는 숫자를 입력하세요");
	}

	public void insertInputView(Model model) {
		System.out.println("------------------------------------------");
		System.out.println("생성할 Customer 데이터 입력");
		CustomerDto dto = new CustomerDto();
		dto.setId(UserInput.inputInt("id 입력"));
		dto.setName(UserInput.inputString("이름 입력"));
		dto.setHeight(UserInput.inputDouble("키 입력"));
		dto.setBirthday(UserInput.inputLocalDateTime("생일 입력"));
		model.setAttribute("dto", dto);
	}

	public void selectResultView(Model model) {
		System.out.println("------------------------------------------");
		for (CustomerDto dto : (ArrayList<CustomerDto>) model.getAttribute("resultDtos")) {
			System.out.println(dto);
		}
	}

	public void updateInputView(Model model) {
		System.out.println("------------------------------------------");
		System.out.println("이름으로 찾아 찾은 사람의 id를 변경한다.");
		String updatename = UserInput.inputString("찾을 이름 입력");
		int updateid = UserInput.inputInt("변경할 id 입력");
		model.setAttribute("updateid", updateid);
		model.setAttribute("updatename", updatename);
	}
}
