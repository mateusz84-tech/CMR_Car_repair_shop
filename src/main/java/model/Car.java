package model;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

public class Car {


    private int id_car;
    private int id_customer;
    private String model;
    private String mark;
    private int year_of_production;
    private String registration_number;
    private int technical_inspection_year;
    private int technical_inspection_month;
    private int technical_inspection_day;

    public Car() {
    }

    public Car(int id_customer, String model, String mark, int year_of_production,
               String registration_number, int technical_inspection_year, int technical_inspection_month, int technical_inspection_day) {
        this.id_customer = id_customer;
        this.model = model;
        this.mark = mark;
        this.year_of_production = year_of_production;
        this.registration_number = registration_number;
        this.technical_inspection_year = technical_inspection_year;
        this.technical_inspection_month = technical_inspection_month;
        this.technical_inspection_day = technical_inspection_day;
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

    public int getYear_of_production() {
        return year_of_production;
    }

    public void setYear_of_production(int year_of_production) {
        this.year_of_production = year_of_production;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    public int getTechnical_inspection_year() {
        return technical_inspection_year;
    }

    public void setTechnical_inspection_year(int technical_inspection_year) {
        this.technical_inspection_year = technical_inspection_year;
    }

    public int getTechnical_inspection_month() {
        return technical_inspection_month;
    }

    public void setTechnical_inspection_month(int technical_inspection_month) {
        this.technical_inspection_month = technical_inspection_month;
    }

    public int getTechnical_inspection_day() {
        return technical_inspection_day;
    }

    public void setTechnical_inspection_day(int technical_inspection_day) {
        this.technical_inspection_day = technical_inspection_day;
    }

    @Override
    public String toString() {
        return String.format("Id: %d%nId klienta: %d%nModel: %s%nMarka: %s%nRok produkcji: %d%nNumer Rejestracyjny: %s%nData przeglądu technicznego: %d:%d:%d"
                ,getId_car(),getId_customer(),getModel(),getMark(), getYear_of_production(),getRegistration_number(),
                getTechnical_inspection_year(), getTechnical_inspection_month(),getTechnical_inspection_day());

    }

}
