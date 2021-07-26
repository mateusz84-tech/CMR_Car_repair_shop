package model;

import java.time.LocalDate;

public class Car {


    private int id_car;
    private int id_customer;
    private String model;
    private String mark;
    private LocalDate year_of_production;
    private String registration_number;
    private LocalDate technical_inspection_date;

    public Car() {
    }

    public Car(int id_customer, String model, String mark, LocalDate year_of_production,
               String registration_number, LocalDate technical_inspection_date) {
        this.id_customer = id_customer;
        this.model = model;
        this.mark = mark;
        this.year_of_production = year_of_production;
        this.registration_number = registration_number;
        this.technical_inspection_date = technical_inspection_date;
    }

    public int getId_car() {
        return id_car;
    }

    public void setId_car(int id_car) {
        this.id_car = id_car;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public LocalDate getYear_of_production() {
        return year_of_production;
    }

    public void setYear_of_production(LocalDate year_of_production) {
        this.year_of_production = year_of_production;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    public LocalDate getTechnical_inspection_date() {
        return technical_inspection_date;
    }

    public void setTechnical_inspection_date(LocalDate technical_inspection_date) {
        this.technical_inspection_date = technical_inspection_date;
    }

    @Override
    public String toString() {
        return String.format("Id: %d%nId klienta: %d%nModel: %s%nMarka: %s%nRok produkcji: %ty%nNumer Rejestracyjny: %s%nData przeglądu technicznego: %ty"
                ,getId_car(),getId_customer(),getModel(),getMark(), getYear_of_production(),getRegistration_number(),getTechnical_inspection_date());

    }

}
