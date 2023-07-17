/**
 * 
 */
package com.practice.regionproject.base.reason.controller;

import com.practice.regionproject.base.Country;
import com.practice.regionproject.base.GlobeRegion;
import com.practice.regionproject.base.RegionUtils;

/**
 * @author Piyush Soni
 *
 */
public class RegionTest {

	public static void main(String[] args) {
		RegionTest regionTest = new RegionTest();
		System.out.println("Car Price is " + regionTest.getCarPrice("Germany"));
		System.out.println("Applied tax : " + regionTest.getTax("Germany"));
	}

	public String getRegion(String country) {
		return Country.valueOf(country).getRegion();

	}

	public int getCarPrice(String country) {

		String regionVal = this.getRegion(country);
		GlobeRegion region = RegionUtils.getRegionObject(regionVal);
		return region.getProductPrice();

	}

	public double getTax(String country) {

		String regionVal = this.getRegion(country);
		GlobeRegion region = RegionUtils.getRegionObject(regionVal);
		return region.getTax();

	}
}
