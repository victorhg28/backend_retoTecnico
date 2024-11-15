package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.BusModel;

@Repository
public interface IBusRepository extends JpaRepository<BusModel, Long>{

}
