package com.nt.exception;

public class TouristNotFoundException extends RuntimeException {
  public TouristNotFoundException() {
	
}
  public TouristNotFoundException(String msg) {
		super(msg);
  }
}
