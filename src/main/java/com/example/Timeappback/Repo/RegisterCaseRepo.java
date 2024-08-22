package com.example.Timeappback.Repo;

import com.example.Timeappback.Entity.RegisterCaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RegisterCaseRepo extends JpaRepository<RegisterCaseEntity, Integer> {


}