package com.woopt.api.model;

import java.util.List;

public class UserModel {

	private User user;
	private Address address;
	private Device device;
	private List<FamilyMember> familyMembers;
	private List<FamilyMember> partofFamily;
	private List<MyService> myServices;

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the device
	 */
	public Device getDevice() {
		return device;
	}

	/**
	 * @param device
	 *            the device to set
	 */
	public void setDevice(Device device) {
		this.device = device;
	}

	/**
	 * @return the familyMembers
	 */
	public List<FamilyMember> getFamilyMembers() {
		return familyMembers;
	}

	/**
	 * @param familyMembers
	 *            the familyMembers to set
	 */
	public void setFamilyMembers(List<FamilyMember> familyMembers) {
		this.familyMembers = familyMembers;
	}

	/**
	 * @return the partofFamily
	 */
	public List<FamilyMember> getPartofFamily() {
		return partofFamily;
	}

	/**
	 * @param partofFamily
	 *            the partofFamily to set
	 */
	public void setPartofFamily(List<FamilyMember> partofFamily) {
		this.partofFamily = partofFamily;
	}

	/**
	 * @return the myServices
	 */
	public List<MyService> getMyServices() {
		return myServices;
	}

	/**
	 * @param myServices
	 *            the myServices to set
	 */
	public void setMyServices(List<MyService> myServices) {
		this.myServices = myServices;
	}

	@Override
	public String toString() {
		return "UserModel [user=" + user + ", address=" + address + ", device=" + device + ", familyMembers="
				+ familyMembers + ", partofFamily=" + partofFamily + ", myServices=" + myServices + "]";
	}
}