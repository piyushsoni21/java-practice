/**
 * 
 */
package com.practice.regionproject.base.reason.controller;

import com.practice.regionproject.base.GlobeRegion;

/**
 * @author Piyush Soni
 *
 */
public class R3 implements GlobeRegion {

	@Override
	public int getProductPrice() {

		return 800000;
	}

	@Override
	public int calculateProductPrice() {
		return 0;
	}

	@Override
	public double getTax() {

		return calculateTax(400000, 45);
	}

}
