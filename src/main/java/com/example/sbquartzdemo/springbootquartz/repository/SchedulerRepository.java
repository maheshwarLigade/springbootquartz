package com.example.sbquartzdemo.springbootquartz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbquartzdemo.springbootquartz.entity.SchedulerJobInfo;

public interface SchedulerRepository extends JpaRepository<SchedulerJobInfo, Long> {

}
