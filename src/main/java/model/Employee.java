package model;

public class Employee {

    private int id_employee;
    private String first_name;
    private String last_name;
    private int number_phone;
    private String notes;
    private double hourly_rate;
    private String email;

    public Employee() {
    }

    public Employee(String first_name, String last_name, int number_phone, String notes, double hourly_rate, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.number_phone = number_phone;
        this.notes = notes;
        this.hourly_rate = hourly_rate;
        this.email = email;
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
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

    public int getNumber_phone() {
        return number_phone;
    }

    public void setNumber_phone(int number_phone) {
        this.number_phone = number_phone;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public double getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(double hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("ID: %d%nImię: %s%nNazwisko: %s%nNumer telefonu: %d%nNotakta: %s%n,Stawka godzinowa: %.2f%nEmail: %s%n"
                ,getId_employee(),getFirst_name(),getLast_name(),getNumber_phone(),getNotes(),getHourly_rate(),getEmail());
    }
}
