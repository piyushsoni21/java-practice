/**
 * 
 */
package com.practice.regionproject.base;

/**
 * @author Piyush Soni
 *
 */
public interface GlobeRegion {

	int getProductPrice();

	int calculateProductPrice();
	double getTax();

	default int calculateTax(int productPrice, int taxPercentage) {
		return (productPrice * taxPercentage) / 100;

	}

	default void applyTaxes1(int taxValue) {
		taxValue = taxValue;
	}
}
