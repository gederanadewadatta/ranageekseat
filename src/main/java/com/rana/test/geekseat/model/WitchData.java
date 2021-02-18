package com.rana.test.geekseat.model;

public class WitchData {
	private int age;
	private int kill;
	public WitchData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WitchData(int age, int kill) {
		super();
		this.age = age;
		this.kill = kill;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the kill
	 */
	public int getKill() {
		return kill;
	}
	/**
	 * @param kill the kill to set
	 */
	public void setKill(int kill) {
		this.kill = kill;
	}
	@Override
    public boolean equals(Object obj) {
        if (obj instanceof WitchData) {
        	WitchData otherCustomer = (WitchData) obj;
            if (getAge() == otherCustomer.getAge())
                return true;
        }
        return false;
    }
}
