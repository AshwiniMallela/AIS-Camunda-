package com.aaseya.AIS.dao;
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.aaseya.AIS.Model.Skill;
 
public interface skillRepository extends JpaRepository<Skill, Long> {
}