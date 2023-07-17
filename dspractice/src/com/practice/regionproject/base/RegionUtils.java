/**
 * 
 */
package com.practice.regionproject.base;

import java.util.HashMap;
import java.util.Map;

import com.practice.regionproject.base.reason.controller.R1;
import com.practice.regionproject.base.reason.controller.R2;
import com.practice.regionproject.base.reason.controller.R3;

/**
 * @author Piyush Soni
 *
 */
public class RegionUtils {

	private static Map<String, GlobeRegion> regionMapping = new HashMap<>();

	static {
		regionMapping.put("R1", new R1());
		regionMapping.put("R2", new R2());
		regionMapping.put("R3", new R3());

	}

	public static GlobeRegion getRegionObject(String regionVal) {
		return regionMapping.get(regionVal);
	}
}
