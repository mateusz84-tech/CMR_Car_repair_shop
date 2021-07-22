package model;

import java.security.SecureRandom;

public class Customer {

    private int id_customer;
    private String first_name;
    private String last_name;
    int repair_id;

    public Customer() {
    }

    public Customer(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
        SecureRandom random = new SecureRandom();
        this.repair_id = 1 + random.nextInt(16000000);
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getRepair_id() {
        return repair_id;
    }

    @Override
    public String toString() {
        return String.format("Id: %s%nImię: %s%nNazwisko: %s%nNumer naprawy: %d%n",
                getId_customer(),getFirst_name(),getLast_name(),getRepair_id());
    }

}
