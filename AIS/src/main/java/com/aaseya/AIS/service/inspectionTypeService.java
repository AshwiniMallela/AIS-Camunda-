package com.aaseya.AIS.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaseya.AIS.dao.inspectionTypeRepository;
import com.aaseya.AIS.Model.Inspection_Type;
 
	@Service
	public class inspectionTypeService {
 
	   @Autowired
	    private inspectionTypeRepository repository;
 
	    public Inspection_Type addInspectionType(Inspection_Type inspectionType) {
	       System.out.println(inspectionType.getThreshold());

//	 	        	    	
//	        inspectionType.setInspectionTypeId(inspectionType.getInspectionTypeId());
//	        inspectionType.setInspectiontype(inspectionType.getInspectiontype());
//	        inspectionType.setThreshold(inspectionType.getThreshold());
//	        inspectionType.setDescription(inspectionType.getDescription());
//	        inspectionType.setHigh(inspectionType.getHigh());
//	        inspectionType.setMedium(inspectionType.getMedium());
//	        inspectionType.setLow(inspectionType.getLow());
	         return repository.save(inspectionType);
	    }

		public Inspection_Type saveInspection_Type(Inspection_Type inspectionType) {
			// TODO Auto-generated method stub
			return null;
		}		
	}		