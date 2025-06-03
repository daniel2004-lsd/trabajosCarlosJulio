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


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getCarnet_cedula() {
        return carnet_cedula;
    }


    public void setCarnet_cedula(String carnet_cedula) {
        this.carnet_cedula = carnet_cedula;
    }


    public String getGmail() {
        return gmail;
    }


    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void showReader(){
        System.out.println("name: " + name);
        System.out.println("lastName: " + lastName);
        System.out.println("carnet_cedula: " + carnet_cedula);
        System.out.println("gmail: " + gmail);
    }
}

