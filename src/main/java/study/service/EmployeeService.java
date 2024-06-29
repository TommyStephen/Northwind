package study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import study.model.Employees;
import study.repository.EmployeeRepository;
import study.specification.EmployeeSpecification;

@Service
public class EmployeeService {

	@Autowired
    private EmployeeRepository employeeRepository;
	
	public List<Employees> getShashtipportyList(int years) {
        Specification<Employees> shashipoorthyList = 
        		EmployeeSpecification.hasShashtipoorthyDone(years);
        return employeeRepository.findAll(shashipoorthyList);
    }
    public List<Employees> getEmployeesByExperience(Integer years){
    	Specification<Employees> spec = 
    			EmployeeSpecification.getEmployeesByExperience(years);
    	return employeeRepository.findAll(spec);
    }
    
    
    
}
