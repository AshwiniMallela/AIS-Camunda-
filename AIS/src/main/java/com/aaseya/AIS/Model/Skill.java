package com.aaseya.AIS.Model;
 
import java.util.Set;
 
import com.fasterxml.jackson.annotation.JsonBackReference;
 
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "skill")
public class Skill {
	@Id
	@Column(name ="skillId")
	private String skillId;
	@Column(name ="skill")
	private String Skill;
	@Column(name ="isActive")
    private Boolean isActive;
	
	public String getSkillId() {
		return skillId;
	}
	public void setSkillId(String skillId) {
		this.skillId = skillId;
	}
	public String getSkill() {
		return Skill;
	}
	public void setSkill(String skill) {
		Skill = skill;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Set<Inspection_Type> getInspection_Types() {
		return inspection_Types;
	}
	public void setInspection_Types(Set<Inspection_Type> inspection_Types) {
		this.inspection_Types = inspection_Types;
	}
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "skills")
	@JsonBackReference
	private Set<Inspection_Type>inspection_Types;{
	}
}