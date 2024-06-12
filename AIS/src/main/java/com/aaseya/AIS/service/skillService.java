package com.aaseya.AIS.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.aaseya.AIS.dao.skillRepository;
import com.aaseya.AIS.Model.Skill;
 
 
@Service
public class skillService {
 
    @Autowired
    private skillRepository skillRepository;
 
    @Transactional
    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }
}