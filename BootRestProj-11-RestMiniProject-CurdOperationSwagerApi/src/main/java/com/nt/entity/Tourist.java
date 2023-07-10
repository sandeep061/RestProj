package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Tourest_Rest")
@Data
public class Tourist {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "reg2", allocationSize = 100,initialValue = 50)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
  private Integer tid;
  private String name;
  private String city;
  private String packageType;
  private Double budget;
}
