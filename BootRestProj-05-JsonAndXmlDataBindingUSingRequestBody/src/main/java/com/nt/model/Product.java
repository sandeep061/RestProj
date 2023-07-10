package com.nt.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
   private Integer pId;
   private String pName;
   private Double pPrice;
   private Integer qty;
   private LocalDateTime ldt;
}
