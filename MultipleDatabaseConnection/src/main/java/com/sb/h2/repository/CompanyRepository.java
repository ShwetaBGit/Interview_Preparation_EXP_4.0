package com.sb.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
