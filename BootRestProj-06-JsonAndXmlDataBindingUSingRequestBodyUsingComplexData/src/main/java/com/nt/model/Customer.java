package com.nt.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Customer {
   private Integer cno;
   private String cname;
   private String [] favColors;
   private List<String>friends;
   private Set<String>mobile;
   private Map<String, Integer>idproof;
   //Has-A property
   private Address add;
}
