package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
 //sandeep
	  private Integer empid;
      private String empName;
      private String empAdd;
      private Double empSal;
      private Customer cust;
}
