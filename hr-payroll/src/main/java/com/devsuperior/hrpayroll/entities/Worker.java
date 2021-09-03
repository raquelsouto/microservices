package com.devsuperior.hrpayroll.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Worker implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Double dailyIncome;

}
