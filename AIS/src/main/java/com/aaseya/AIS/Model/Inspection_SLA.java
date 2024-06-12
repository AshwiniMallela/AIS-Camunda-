package com.aaseya.AIS.Model;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="inspection_SLA")
public class Inspection_SLA {
	@Id
	@Column(name ="inspection_SLA_id")
	private String inspection_SLA_id;
	@Column(name ="Inspection_Type_Id")
	private String inspection_type_id;
	@Column(name ="Entity_Size")
	private String entity_size;
	@Column(name ="InspectorGoal")
	private String inspectorGoal;
	@Column(name ="InspectorDeadline")
	private String inspectorDeadline;
	@Column(name ="ReveiwerGoal")
	private String reveiwerGoal;
	@Column(name ="ReveiwerDeadline")
	private String reveiwerDeadline;
	@Column(name ="ApproverGoal")
	private String approverGoal;
	@Column(name ="ApproverDeadline")
	private String approverDeadline;
	@Column(name ="CaseGoal")
	private String caseGoal;
	@Column(name ="CaseDeadline")
	private String caseDeadline;
	
	
	public String getInspection_SLA_id() {
		return inspection_SLA_id;
	}


	public void setInspection_SLA_id(String inspection_SLA_id) {
		this.inspection_SLA_id = inspection_SLA_id;
	}


	public String getInspection_type_id() {
		return inspection_type_id;
	}


	public void setInspection_type_id(String inspection_type_id) {
		this.inspection_type_id = inspection_type_id;
	}


	public String getEntity_size() {
		return entity_size;
	}


	public void setEntity_size(String entity_size) {
		this.entity_size = entity_size;
	}


	public String getInspectorGoal() {
		return inspectorGoal;
	}


	public void setInspectorGoal(String inspectorGoal) {
		this.inspectorGoal = inspectorGoal;
	}


	public String getInspectorDeadline() {
		return inspectorDeadline;
	}


	public void setInspectorDeadline(String inspectorDeadline) {
		this.inspectorDeadline = inspectorDeadline;
	}


	public String getReveiwerGoal() {
		return reveiwerGoal;
	}


	public void setReveiwerGoal(String reveiwerGoal) {
		this.reveiwerGoal = reveiwerGoal;
	}


	public String getReveiwerDeadline() {
		return reveiwerDeadline;
	}


	public void setReveiwerDeadline(String reveiwerDeadline) {
		this.reveiwerDeadline = reveiwerDeadline;
	}


	public String getApproverGoal() {
		return approverGoal;
	}


	public void setApproverGoal(String approverGoal) {
		this.approverGoal = approverGoal;
	}


	public String getApproverDeadline() {
		return approverDeadline;
	}


	public void setApproverDeadline(String approverDeadline) {
		this.approverDeadline = approverDeadline;
	}


	public String getCaseGoal() {
		return caseGoal;
	}


	public void setCaseGoal(String caseGoal) {
		this.caseGoal = caseGoal;
	}


	public String getCaseDeadline() {
		return caseDeadline;
	}


	public void setCaseDeadline(String caseDeadline) {
		this.caseDeadline = caseDeadline;
	}


	@Override
	public String toString() {
		return "Inspection_SLA [Id=" + inspection_SLA_id + ", inspection_type_id=" + inspection_type_id + ", entity_size="
				+ entity_size + ", inspectorGoal=" + inspectorGoal + ", inspectorDeadline=" + inspectorDeadline
				+ ", reveiwerGoal=" + reveiwerGoal + ", reveiwerDeadline=" + reveiwerDeadline + ", approverGoal="
				+ approverGoal + ", approverDeadline=" + approverDeadline + ", caseGoal=" + caseGoal + ", caseDeadline="
				+ caseDeadline + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
 
}