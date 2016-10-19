package com.example.repository;

import com.example.model.Boss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
@Table(name = "Boss")
public interface BossRepository extends JpaRepository<Boss, Long> {
}
