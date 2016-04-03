package com.woopt.api.model;

import java.util.Arrays;

public class UserModel {
	
	private User user;
	
	private Address address;
	
	private Device device;
	
	private FamilyMember[] familyMembers;
	
	private FamilyMember[] partofFamily;
	
	private MyService[] myServices;

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
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
	 * @param address the address to set
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
	 * @param device the device to set
	 */
	public void setDevice(Device device) {
		this.device = device;
	}

	/**
	 * @return the familyMembers
	 */
	public FamilyMember[] getFamilyMembers() {
		return familyMembers;
	}

	/**
	 * @param familyMembers the familyMembers to set
	 */
	public void setFamilyMembers(FamilyMember[] familyMembers) {
		this.familyMembers = familyMembers;
	}

	/**
	 * @return the partofFamily
	 */
	public FamilyMember[] getPartofFamily() {
		return partofFamily;
	}

	/**
	 * @param partofFamily the partofFamily to set
	 */
	public void setPartofFamily(FamilyMember[] partofFamily) {
		this.partofFamily = partofFamily;
	}

	/**
	 * @return the myServices
	 */
	public MyService[] getMyServices() {
		return myServices;
	}

	/**
	 * @param myServices the myServices to set
	 */
	public void setMyServices(MyService[] myServices) {
		this.myServices = myServices;
	}

	@Override
	public String toString() {
		return "UserModel [user=" + user + ", address=" + address + ", device=" + device + ", familyMembers="
				+ Arrays.toString(familyMembers) + ", partofFamily=" + Arrays.toString(partofFamily) + ", myServices="
				+ Arrays.toString(myServices) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((device == null) ? 0 : device.hashCode());
		result = prime * result + Arrays.hashCode(familyMembers);
		result = prime * result + Arrays.hashCode(myServices);
		result = prime * result + Arrays.hashCode(partofFamily);
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof UserModel)) {
			return false;
		}
		UserModel other = (UserModel) obj;
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!address.equals(other.address)) {
			return false;
		}
		if (device == null) {
			if (other.device != null) {
				return false;
			}
		} else if (!device.equals(other.device)) {
			return false;
		}
		if (!Arrays.equals(familyMembers, other.familyMembers)) {
			return false;
		}
		if (!Arrays.equals(myServices, other.myServices)) {
			return false;
		}
		if (!Arrays.equals(partofFamily, other.partofFamily)) {
			return false;
		}
		if (user == null) {
			if (other.user != null) {
				return false;
			}
		} else if (!user.equals(other.user)) {
			return false;
		}
		return true;
	}
}