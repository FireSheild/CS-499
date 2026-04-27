package model;
public abstract class RescueAnimal{
    private final String id;
    private final String name;
    private boolean reserved;
    protected RescueAnimal(String id,String name){this.id=id;this.name=name;}
    public String getId(){return id;}
    public String getName(){return name;}
    public boolean isReserved(){return reserved;}
    public void reserve(){reserved=true;}
}