package com.dataart.ks.javaschool;

/**
 * Кроме того, для каждого клиента ещё должен быть определен номер лицензии.
 */
public class Individual extends Customer{

    private String licNum = "";

    public Individual(String id) {
        super(id);
    }

    public Individual(String id, String licNum) {
        super(id);
        this.licNum = licNum;
    }

    public String getLicNum() {
        return licNum;
    }

    /**
     *
     * @param licNum                                                    //Where is type info?
     */
    public void setLicNum(String licNum) {
        this.licNum = licNum;
    }

    @Override
    public String toString() {
        return "Individual{" +
                "name='" + this.getName() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", phone='" + this.getPhone() + '\'' +
                ", id='" + this.getId() + '\'' +
                ", licNum='" + this.getLicNum() + '\'' +
                '}';
    }
}
