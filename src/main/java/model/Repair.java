package model;

public class Repair {

    private int id_repair;
    private int id_employee;
    private int id_status;
    private int id_car;
    private int repair_date_year;
    private int repair_date_month;
    private int repair_date_day;
    private String description_repair;
    private double repair_parts_cost;
    private double repair_hourly_rate;
    private double repair_cost;
    private int working_hours;

    public Repair(int id_employee, int id_status, int id_car, int repair_date_year,
                  int repair_date_month, int repair_date_day, String description_repair,
                  double repair_parts_cost, double repair_hourly_rate, double repair_cost, int working_hours) {

        if(repair_date_year < 0){
            throw new IllegalArgumentException("Rok nie może być < 0");
        }
        if(repair_date_month < 1 || repair_date_month > 12){
            throw new IllegalArgumentException("Miesią musi być >=1 i <=12");
        }
        if(repair_date_day < 1 || repair_date_day > 31){
            throw new IllegalArgumentException("Dzień musi być > 1 i < 31");
        }
        if(repair_parts_cost < 0.0){
            throw new IllegalArgumentException("Koszt części musi być > 0");
        }
        if(repair_hourly_rate < 0){
            throw new IllegalArgumentException("Koszt godziny naprawy musi być > 0");
        }
        if(repair_cost < 0.0){
            throw new IllegalArgumentException("Ogólny koszt naprawy musi być > 0");
        }
        if(working_hours < 0){
            throw new IllegalArgumentException("Liczba roboczogodzin musi być > 0");
        }
        this.id_employee = id_employee;
        this.id_status = id_status;
        this.id_car = id_car;
        this.repair_date_year = repair_date_year;
        this.repair_date_month = repair_date_month;
        this.repair_date_day = repair_date_day;
        this.description_repair = description_repair;
        this.repair_parts_cost = repair_parts_cost;
        this.repair_hourly_rate = repair_hourly_rate;
        this.repair_cost = repair_cost;
        this.working_hours = working_hours;
    }

    public int getId_repair() {
        return id_repair;
    }

    public void setId_repair(int id_repair) {
        this.id_repair = id_repair;
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public int getId_status() {
        return id_status;
    }

    public void setId_status(int id_status) {
        this.id_status = id_status;
    }

    public int getId_car() {
        return id_car;
    }

    public void setId_car(int id_car) {
        this.id_car = id_car;
    }

    public int getRepair_date_year() {
        return repair_date_year;
    }

    public void setRepair_date_year(int repair_date_year) {
        if(repair_date_year < 0){
            throw new IllegalArgumentException("Rok nie może być < 0");
        }
        this.repair_date_year = repair_date_year;
    }

    public int getRepair_date_month() {
        return repair_date_month;
    }

    public void setRepair_date_month(int repair_date_month) {
        if(repair_date_month < 1 || repair_date_month > 12){
            throw new IllegalArgumentException("Miesią musi być >=1 i <=12");
        }
        this.repair_date_month = repair_date_month;
    }

    public int getRepair_date_day() {
        return repair_date_day;
    }

    public void setRepair_date_day(int repair_date_day) {
        if(repair_date_day < 1 || repair_date_day > 31){
            throw new IllegalArgumentException("Dzień musi być > 1 i < 31");
        }
        this.repair_date_day = repair_date_day;
    }

    public String getDescription_repair() {
        return description_repair;
    }

    public void setDescription_repair(String description_repair) {
        this.description_repair = description_repair;
    }

    public double getRepair_parts_cost() {
        return repair_parts_cost;
    }

    public void setRepair_parts_cost(double repair_parts_cost) {
        if(repair_parts_cost < 0.0){
            throw new IllegalArgumentException("Koszt części musi być > 0");
        }
        this.repair_parts_cost = repair_parts_cost;
    }

    public double getRepair_hourly_rate() {
        return repair_hourly_rate;
    }

    public void setRepair_hourly_rate(double repair_hourly_rate) {
        if(repair_hourly_rate < 0){
            throw new IllegalArgumentException("Koszt godziny naprawy musi być > 0");
        }
        this.repair_hourly_rate = repair_hourly_rate;
    }

    public double getRepair_cost() {
        return repair_cost;
    }

    public void setRepair_cost(double repair_cost) {
        if(repair_cost < 0.0){
            throw new IllegalArgumentException("Ogólny koszt naprawy musi być > 0");
        }

        this.repair_cost = repair_cost;
    }

    public int getWorking_hours() {
        return working_hours;
    }

    public void setWorking_hours(int working_hours) {
        if(working_hours < 0){
            throw new IllegalArgumentException("Liczba roboczogodzin musi być > 0");
        }
        this.working_hours = working_hours;
    }

    @Override
    public String toString() {
        return String.format("Id: %d%nId klienta: %d%nId status: %d%nId samochód: %d%n" +
                        "Rok naprawy: %d%n,Miesiąc naprawy: %d%nDzień naprawy: %d%n" +
                        "Opis naprawy: %s%nKoszt cześci: %.3f%nStawka godzinowa: %.3f%n" +
                        "Całkowity koszt: %.3f%nCzas naprawy: %d%n",
                getId_repair(),getId_employee(),getId_status(),getId_car(),
                getRepair_date_year(),getRepair_date_month(),getRepair_date_day(),
                getDescription_repair(),getRepair_parts_cost(),getRepair_hourly_rate(),getRepair_cost(), getWorking_hours());
    }
}
