package com.dataart.ks.javaschool;

/**
 * Клиентов нужно учитывать в создаваемой системе. На текущий момент для каждого клиента мы храним
 * следующую информацию: имя, адрес и телефон. Также каждому новому клиенту мы присваиваем уникальный ID.
 */
public class Customer {

	private String name;
	private String address;
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
