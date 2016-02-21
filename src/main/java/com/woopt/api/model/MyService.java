package com.woopt.api.model;

public class MyService {
	
	private int shop_id;
	
	private String shop_name;
	
    private String shop_address_area;
    
    private String shop_address_city;
    
    private int shop_status;
    
    private int shop_verification_status;
    
    private int shop_open_status;

	/**
	 * @return the shop_id
	 */
	public int getShop_id() {
		return shop_id;
	}

	/**
	 * @param shop_id the shop_id to set
	 */
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}

	/**
	 * @return the shop_name
	 */
	public String getShop_name() {
		return shop_name;
	}

	/**
	 * @param shop_name the shop_name to set
	 */
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}

	/**
	 * @return the shop_address_area
	 */
	public String getShop_address_area() {
		return shop_address_area;
	}

	/**
	 * @param shop_address_area the shop_address_area to set
	 */
	public void setShop_address_area(String shop_address_area) {
		this.shop_address_area = shop_address_area;
	}

	/**
	 * @return the shop_address_city
	 */
	public String getShop_address_city() {
		return shop_address_city;
	}

	/**
	 * @param shop_address_city the shop_address_city to set
	 */
	public void setShop_address_city(String shop_address_city) {
		this.shop_address_city = shop_address_city;
	}

	/**
	 * @return the shop_status
	 */
	public int getShop_status() {
		return shop_status;
	}

	/**
	 * @param shop_status the shop_status to set
	 */
	public void setShop_status(int shop_status) {
		this.shop_status = shop_status;
	}

	/**
	 * @return the shop_verification_status
	 */
	public int getShop_verification_status() {
		return shop_verification_status;
	}

	/**
	 * @param shop_verification_status the shop_verification_status to set
	 */
	public void setShop_verification_status(int shop_verification_status) {
		this.shop_verification_status = shop_verification_status;
	}

	/**
	 * @return the shop_open_status
	 */
	public int getShop_open_status() {
		return shop_open_status;
	}

	/**
	 * @param shop_open_status the shop_open_status to set
	 */
	public void setShop_open_status(int shop_open_status) {
		this.shop_open_status = shop_open_status;
	}

	@Override
	public String toString() {
		return "MyService [shop_id=" + shop_id + ", shop_name=" + shop_name + ", shop_address_area=" + shop_address_area
				+ ", shop_address_city=" + shop_address_city + ", shop_status=" + shop_status
				+ ", shop_verification_status=" + shop_verification_status + ", shop_open_status=" + shop_open_status
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((shop_address_area == null) ? 0 : shop_address_area.hashCode());
		result = prime * result + ((shop_address_city == null) ? 0 : shop_address_city.hashCode());
		result = prime * result + shop_id;
		result = prime * result + ((shop_name == null) ? 0 : shop_name.hashCode());
		result = prime * result + shop_open_status;
		result = prime * result + shop_status;
		result = prime * result + shop_verification_status;
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
		if (!(obj instanceof MyService)) {
			return false;
		}
		MyService other = (MyService) obj;
		if (shop_address_area == null) {
			if (other.shop_address_area != null) {
				return false;
			}
		} else if (!shop_address_area.equals(other.shop_address_area)) {
			return false;
		}
		if (shop_address_city == null) {
			if (other.shop_address_city != null) {
				return false;
			}
		} else if (!shop_address_city.equals(other.shop_address_city)) {
			return false;
		}
		if (shop_id != other.shop_id) {
			return false;
		}
		if (shop_name == null) {
			if (other.shop_name != null) {
				return false;
			}
		} else if (!shop_name.equals(other.shop_name)) {
			return false;
		}
		if (shop_open_status != other.shop_open_status) {
			return false;
		}
		if (shop_status != other.shop_status) {
			return false;
		}
		if (shop_verification_status != other.shop_verification_status) {
			return false;
		}
		return true;
	}
}
