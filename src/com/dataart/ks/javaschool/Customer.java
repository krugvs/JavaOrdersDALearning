package com.dataart.ks.javaschool;

/**
 * Клиентов нужно учитывать в создаваемой системе. На текущий момент для каждого клиента мы храним
 * следующую информацию: имя, адрес и телефон. Также каждому новому клиенту мы присваиваем уникальный ID.
 */
abstract public class Customer {

    private String name = "";
    private String address ="";
    private String phone = "";
    private final String id;

    public Customer(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

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

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
