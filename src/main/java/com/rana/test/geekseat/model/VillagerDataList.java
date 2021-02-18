/**
 * 
 */
package com.rana.test.geekseat.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anitamarsafira
 *
 */
public class VillagerDataList {
	private List<VillagerData> data;

	@Override
	public String toString() {
		return "VillagerDataList [data=" + data + "]";
	}

	/**
	 * @return the data
	 */
	public List<VillagerData> getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<VillagerData> data) {
		this.data = data;
	}
	public VillagerDataList() {
		// TODO Auto-generated constructor stub
		data = new ArrayList<>();
	}
	
}
