package com.nt.model;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Customer {

	
	private Integer cid;
	private String [] favcolor;
	private List<String> nickname;
	private Map<String, Long>idProof;
}
