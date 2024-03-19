package JAVA_0319.customer.src.com.human.service;

import java.util.ArrayList;

import JAVA_0319.customer.src.com.human.dao.CustomerDao;
import JAVA_0319.customer.src.com.human.dto.CustomerDto;


public class CustomerService {
	private CustomerDao dao=new CustomerDao();
	public ArrayList<CustomerDto> select() {
		return dao.select();
	}
	public void insert(CustomerDto dto) {
		dao.insert(dto);
	}
	public void update(String updateName, int updateid) {
		dao.update(updateName, updateid);
	}
	public void delete(int id) {
		dao.delete(id);
	}	
}
