public class Reader {
    private String name;
    private String lastName;
    private String carnet_cedula;
    private String gmail;

    public Reader(String name, String lastName, String carnet_cedula, String gmail) {
        this.name = name;
        this.lastName = lastName;
        this.carnet_cedula = carnet_cedula;
        this.gmail = gmail;
    }

    public String getName() { return name; }
    public String getLastName() { return lastName; }
    public String getCarnet_cedula() { return carnet_cedula; }
    public String getGmail() { return gmail; }

    @Override
    public String toString() {
        return "Lector: " + name + " " + lastName + ", Carnet/Cédula: " + carnet_cedula + ", Gmail: " + gmail;
    }
}