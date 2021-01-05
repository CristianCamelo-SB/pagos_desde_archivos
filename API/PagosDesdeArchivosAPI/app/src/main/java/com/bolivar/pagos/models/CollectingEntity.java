package pagos.models;

public class CollectingEntity {
    private final int id;
    private final String nit;
    private final String name;
    private final String address;

    public CollectingEntity (int id, String nit, String name, String address){
        this.id = id;
        this.nit = nit;
        this.name = name;
        this.address = address;
    }

    public int getId (){
        return id;
    }

    public String getNit (){
        return nit;
    }

    public String getName (){
        return name;
    }

    public String getAddress (){
        return address;
    }
}