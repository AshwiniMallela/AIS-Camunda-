package com.aaseya.AIS.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aaseya.AIS.Model.Inspection_Type;
import com.aaseya.AIS.exception.errorCode;
import com.aaseya.AIS.exception.errorResponse;
import com.aaseya.AIS.service.inspectionTypeService;
 
@RestController
@RequestMapping
public class InspectionTypeController {
 
    @Autowired
    private inspectionTypeService inspectionTypeService;
     
 
    @PostMapping("/add/inspectionTypes")
    public ResponseEntity<?> createInspectionType(@RequestBody Inspection_Type inspectionType) {
        try {
            Inspection_Type savedInspectionType = inspectionTypeService.saveInspection_Type(inspectionType);
            return ResponseEntity.ok(savedInspectionType);
        } catch (Exception e) {
            return ResponseEntity.status(errorCode.SERVER_ERROR.getStatus())
                                 .body(new errorResponse(errorCode.SERVER_ERROR));
        }
    }
 
        
    }