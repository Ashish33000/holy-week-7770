package com.masai.service;

import java.util.List;

import com.masai.entity.Broker;
import com.masai.exception.BrokerException;
import com.masai.exception.LoginException;


public interface BrokerService {
	
	
	public Broker saveBroker(Broker broker)throws BrokerException;
	public Broker editBroker(Integer broId,Broker broker) throws BrokerException;
	public Broker removeBroker(Integer broId)throws BrokerException;
	public Broker viewBroker(Integer broId)throws BrokerException;
	public List<Broker> viewAllBrokers()throws BrokerException;
	

}
