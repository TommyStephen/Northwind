package study.specification;

import java.time.LocalDate;

import org.springframework.data.jpa.domain.Specification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import study.model.Employees;


public class EmployeeSpecification {

    @SuppressWarnings("serial")
	public static Specification<Employees> hasShashtipoorthyDone(int years) {
        return new Specification<Employees>() {
			@Override
            public Predicate toPredicate(Root<Employees> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                LocalDate cutOffDate = LocalDate.now().minusYears(years);
                return criteriaBuilder.lessThanOrEqualTo(root.get("birthDate"), cutOffDate);
            }
        };
    }
    public static Specification<Employees> getEmployeesByExperience(Integer years){
    	return (root, cq, cb)->{
			cq.orderBy(cb.asc(root.get("firstName")));
			 LocalDate cutOffDate = LocalDate.now().minusYears(years);
    		return cb.greaterThan(root.get("birthDate"), cutOffDate);
    	};
    }
    
    
    
}
