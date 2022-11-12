package com.equitasit.ms.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RespData {
	
	private String msg;
	
	private String ipAddr;
	
	private Date date;

}
