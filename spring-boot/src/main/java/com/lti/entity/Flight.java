//package com.lti.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "flights")
//@SequenceGenerator(name = "flSeq", sequenceName = "flight_seq", initialValue = 101)
//public class Flight {
//
//	@Id
//	@Column(name = "flight_no")
//	@GeneratedValue(generator = "flSeq",strategy = GenerationType.SEQUENCE)
//	private int flightNo;
//	
//	@Column(length = 30)
//	private String carrier;
//	@Column(name = "kaha_se", length = 20)
//	private String source;
//	
//	@Column(name = "kaha_tak", length = 20)
//	private String destiny;
//
//	public int getFlightNo() {
//		return flightNo;
//	}
//
//	public void setFlightNo(int flightNo) {
//		this.flightNo = flightNo;
//	}
//
//	public String getCarrier() {
//		return carrier;
//	}
//
//	public void setCarrier(String carrier) {
//		this.carrier = carrier;
//	}
//
//	public String getSource() {
//		return source;
//	}
//
//	public void setSource(String source) {
//		this.source = source;
//	}
//
//	public String getDestiny() {
//		return destiny;
//	}
//
//	public void setDestiny(String destiny) {
//		this.destiny = destiny;
//	}
//	
//	
//}