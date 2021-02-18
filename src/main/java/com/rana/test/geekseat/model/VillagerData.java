/**
 * 
 */
package com.rana.test.geekseat.model;

/**
 * @author ranadewadatta
 *
 */
public class VillagerData {
	private int agedeath;
	private int yeardeath;
	@Override
	public String toString() {
		return "VillagerData [agedeath=" + agedeath + ", yeardeath=" + yeardeath + "]";
	}
	/**
	 * @return the agedeath
	 */
	public int getAgedeath() {
		return agedeath;
	}
	/**
	 * @param agedeath the agedeath to set
	 */
	public void setAgedeath(int agedeath) {
		this.agedeath = agedeath;
	}
	/**
	 * @return the yeardeath
	 */
	public int getYeardeath() {
		return yeardeath;
	}
	/**
	 * @param yeardeath the yeardeath to set
	 */
	public void setYeardeath(int yeardeath) {
		this.yeardeath = yeardeath;
	}
	public VillagerData(int agedeath, int yeardeath) {
		super();
		this.agedeath = agedeath;
		this.yeardeath = yeardeath;
	}
	public VillagerData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
