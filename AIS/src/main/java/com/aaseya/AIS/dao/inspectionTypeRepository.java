package com.aaseya.AIS.dao;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.aaseya.AIS.Model.Inspection_Type;
 
 
@Repository
public interface inspectionTypeRepository extends JpaRepository<Inspection_Type, Long> {

 
}