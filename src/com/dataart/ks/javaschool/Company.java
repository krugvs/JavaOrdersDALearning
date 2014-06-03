package com.dataart.ks.javaschool;

/**
 * Если наш клиент – компания, то мы ещё храним имя контактного лица и величину скидки.
 */
public class Company extends Customer{

    private String contactName = "";
    private int discount = 0;

    public Company(String id) {
        super(id);
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String name) {
        this.contactName = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + this.getName() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", phone='" + this.getPhone() + '\'' +
                ", id='" + this.getId() + '\'' +
                ", contactName='" + this.getContactName() + '\'' +
                ", discount=" + this.getDiscount() +
                '}';
    }
}
