package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.exception.CustomerException;
import com.masai.exception.LoginException;
import com.masai.model.Customer;
@Service

public class CustomerServiceImpl implements CustomerService {
	

	@Override
	public Customer addCoustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer editCoustomer(Customer customer, String key) throws CustomerException, LoginException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer removeCoustomer(Integer custId, String key) throws CustomerException, LoginException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer viewCoustomer(Integer custId) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> viewAllCoustomer() throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}
	


}
