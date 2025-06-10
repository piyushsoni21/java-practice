/**
 * 
 */
package com.practice.regionproject.base;

/**
 * @author Piyush Soni
 *
 */
public enum Country {

	India("R1"), Germany("R2"), USA("R3");
	
	

	private String region;

	/**
	 * @param string
	 */
	Country(String region) {
		this.region = region;
	}

	public String getRegion() {
		return region;
	}

}
