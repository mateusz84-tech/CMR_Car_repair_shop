package model;

public class Employee {

    private int id_employee;
    private String first_name;
    private String last_name;
    private int number_phone;
    private String email;
    private String notes;
    private double hourly_rate;
    private String password;

    public Employee() {
    }

    public Employee(String first_name, String last_name, int number_phone, String email, String notes, double hourly_rate, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.number_phone = number_phone;
        this.email = email;
        this.notes = notes;
        this.hourly_rate = hourly_rate;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("ID: %d%nImię: %s%nNazwisko: %s%nNumer telefonu: %d%nNotakta: %s%nStawka godzinowa: %.2f%nEmail: %s%nHasło: %s"
                ,getId_employee(),getFirst_name(),getLast_name(),getNumber_phone(),getNotes(),getHourly_rate(),getEmail(),getPassword());
    }
}
