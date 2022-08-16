package com.stock.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.models.StockPrice;

@Repository
public interface StockPriceRepository extends JpaRepository<StockPrice, Integer>{
	List<StockPrice> findByCompidOrderByDate(int compid);
}
