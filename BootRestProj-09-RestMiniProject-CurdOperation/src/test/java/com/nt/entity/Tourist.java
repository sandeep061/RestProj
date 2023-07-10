package com.nt.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
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
