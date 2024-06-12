package com.aaseya.AIS.Model;
 
 
 
import java.util.List;
import java.util.Set;
 
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="inspection_type")
public class Inspection_Type {
	@Id
	private String ins_type_id;
	@Column(name ="name")
	private String name;
	@Column(name ="Threshold")
	private String threshold;
	@Column(name ="isActive")
	private Boolean isActive;
	@Column(name ="High")
	private String high;
	@Column(name ="Low")
	private String low;
	@Column(name ="Medium")
	private String medium;
	
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Skill.class)
	@JoinTable(name ="Inspection_Type_Skill", joinColumns = {
			@JoinColumn(name ="ins_type_id", referencedColumnName ="ins_type_id" )
	},
	inverseJoinColumns = {
			@JoinColumn(name ="skillId", referencedColumnName = "skillId")
	})
	private Set<Skill> skills;
	private List<Inspection_SLA> inspection_SLAs;
	
	
	public String getIns_type_id() {
		return ins_type_id;
	}


	public void setIns_type_id(String ins_type_id) {
		this.ins_type_id = ins_type_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getThreshold() {
		return threshold;
	}


	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}


	public String getHigh() {
		return high;
	}


	public void setHigh(String high) {
		this.high = high;
	}


	public String getLow() {
		return low;
	}


	public void setLow(String low) {
		this.low = low;
	}


	public String getMedium() {
		return medium;
	}


	public void setMedium(String medium) {
		this.medium = medium;
	}


	public Set<Skill> getSkills() {
		return skills;
	}


	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}


	public List<Inspection_SLA> getInspection_SLAs() {
		return inspection_SLAs;
	}


	public void setInspection_SLAs(List<Inspection_SLA> inspection_SLAs) {
		this.inspection_SLAs = inspection_SLAs;
	}


	@Override
	public String toString() {
		return "Inspection_Type [ins_type_id=" + ins_type_id + ", name=" + name + ", threshold=" + threshold
				+ ", isActive=" + isActive + ", high=" + high + ", low=" + low + ", medium=" + medium + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
 
}