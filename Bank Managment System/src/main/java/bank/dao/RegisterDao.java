package bank.dao;

import java.util.List;

import bank.model.Register;

public interface RegisterDao {

	public int create(List<Register> lst);
	//public List<Register> retrive(int regNo);
	
}
