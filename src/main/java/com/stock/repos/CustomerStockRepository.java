package com.stock.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.models.Company;
import com.stock.models.Customer;
import com.stock.models.CustomerStock;

@Repository
public interface CustomerStockRepository extends JpaRepository<CustomerStock, Integer> {
	CustomerStock findByCustomerAndCompany(Customer custid,Company compid);
	
	List<CustomerStock> findByCustomer(Customer custid);
	List<CustomerStock> findByCompany(Company compid);
	
}
