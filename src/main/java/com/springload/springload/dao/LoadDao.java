package com.springload.springload.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springload.springload.entities.Load;

public interface LoadDao extends JpaRepository<Load, Long> {

}
