package in.prac.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import in.prac.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	public Customer findByName(String name);
	
	
	public Customer findByPhno(Long phno);

}
