package JAVA_0319.customer.src.com.human.ex;

import java.util.ArrayList;

import JAVA_0319.customer.src.com.human.dto.CustomerDto;
import JAVA_0319.customer.src.com.human.model.Model;
import JAVA_0319.customer.src.com.human.service.CustomerService;
import JAVA_0319.customer.src.com.human.view.HumanView;

public class DbConnEx {

	public static void main(String[] args) throws Exception {
		CustomerService customerService=new CustomerService();
		HumanView humanView = new HumanView();
		Model model=new Model();
		
		int input=0;		
		while(input!=5) {
			
			humanView.mainMenuView(model);
			input=(int)model.getAttribute("input");
			
			switch(input) {
			case 1:
				ArrayList<CustomerDto> resultDtos= customerService.select();
				model.setAttribute("resultDtos", resultDtos);
				humanView.selectResultView(model);
				break;
			
			case 2:
				humanView.insertInputView(model);
				customerService.insert((CustomerDto)model.getAttribute("dto"));
				break;
			
			case 3:
				humanView.updateInputView(model);
				customerService.update((String)model.getAttribute("updatename"), (int)model.getAttribute("updateid"));
				break;
				
			case 4:
				humanView.deleteInputView(model);
				customerService.delete((int)model.getAttribute("id"));
				break;
				
			case 5:
				humanView.exitOutputView(model);
				
				input=(int)model.getAttribute("input");
				break;
				
			default:
				humanView.errorOutputView(model);
				break;
				
			}
	
		}

	}

}
