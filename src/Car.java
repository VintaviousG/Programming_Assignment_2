

public class Car   implements Comparable<Car> {

    private int CityMpg;
    private  String Classification;
    private  String Driveline;
    private  String EngineType;
    private  String FuelType;
    private  int Height;
    private int HighwayMpg;
    private  int Horsepower;
    private  String Hybrid;
    private  String ID;
    private  int length;
    private  String Make;
    private  String ModelYear;
    private  int ForwardGears;
    private  int Torque;
    private  String Transmission;
    private  int Width;
    private  int Year;




    //


    public int getCityMpg() {
        return CityMpg;
    }

    public void setCityMpg(int cityMpg) {
        CityMpg = cityMpg;
    }

    public String getClassification() {
        return Classification;
    }

    public void setClassification(String classification) {
        Classification = classification;
    }

    public String getDriveline() {
        return Driveline;
    }

    public void setDriveline(String driveline) {
        Driveline = driveline;
    }

    public String getEngineType() {
        return EngineType;
    }

    public void setEngineType(String engineType) {
        EngineType = engineType;
    }

    public String getFuelType() {
        return FuelType;
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getHighwayMpg() {
        return HighwayMpg;
    }

    public void setHighwayMpg(int highwayMpg) {
        HighwayMpg = highwayMpg;
    }

    public int getHorsepower() {
        return Horsepower;
    }

    public void setHorsepower(int horsepower) {
        Horsepower = horsepower;
    }

    public String getHybrid() {
        return Hybrid;
    }

    public void setHybrid(String hybrid) {
        Hybrid = hybrid;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModelYear() {
        return ModelYear;
    }

    public void setModelYear(String modelYear) {
        ModelYear = modelYear;
    }

    public int getForwardGears() {
        return ForwardGears;
    }

    public void setForwardGears(int forwardGears) {
        ForwardGears = forwardGears;
    }

    public int getTorque() {
        return Torque;
    }

    public void setTorque(int torque) {
        Torque = torque;
    }

    public String getTransmission() {
        return Transmission;
    }

    public void setTransmission(String transmission) {
        Transmission = transmission;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CityMpg=" + getCityMpg() +
                ", Classification='" + getClassification() + '\'' +
                ", Driveline='" + getDriveline() + '\'' +
                ", EngineType='" + getEngineType() + '\'' +
                ", FuelType='" + getFuelType() + '\'' +
                ", Height=" + getHeight() +
                ", HighwayMpg=" + getHighwayMpg() +
                ", Horsepower=" + getHorsepower() +
                ", Hybrid='" + getHybrid() + '\'' +
                ", ID='" + getID() + '\'' +
                ", length=" + getLength() +
                ", Make='" + getMake() + '\'' +
                ", ModelYear='" + getModelYear() + '\'' +
                ", ForwardGears=" + getForwardGears() +
                ", Torque=" + getTorque() +
                ", Transmission='" + getTransmission() + '\'' +
                ", Width=" + getWidth() +
                ", Year=" + getYear() +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }




}



