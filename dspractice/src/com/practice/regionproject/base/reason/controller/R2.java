/**
 * 
 */
package com.practice.regionproject.base.reason.controller;

import com.practice.regionproject.base.GlobeRegion;
import com.practice.regionproject.base.Vehicle;

/**
 * @author Piyush Soni
 *
 */
public class R2 implements GlobeRegion {

	@Override
	public int getProductPrice() {

		return 700000;
	}

	@Override
	public int calculateProductPrice() {
		return 0;
	}

	@Override
	public double getTax() {
		
		return calculateTax(400000, 40);
	}
}
