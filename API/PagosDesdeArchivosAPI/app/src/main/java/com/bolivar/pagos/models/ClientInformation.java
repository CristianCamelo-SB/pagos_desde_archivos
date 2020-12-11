package pagos.models;

public class ClientInformation {
    private final String name;
    private final int id;
    private final String address;
    private final String city;
    private final String country;

    public ClientInformation (String name, int id, String address, String city, String country){
        this.name = name;
        this.id = id;
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public String getName (){
        return name;
    }

    public int getId (){
        return id;
    }

    public String getAddres (){
        return address;
    }

    public String getCity (){
        return city;
    }

    public String getCountry (){
        return country;
    }
}