package repository;
import model.RescueAnimal;
import java.util.*;
public class AnimalRepository{
    protected final Map<String,RescueAnimal> data=new HashMap<>();
    public void save(RescueAnimal a){data.put(a.getId(),a);}
    public Optional<RescueAnimal> find(String id){return Optional.ofNullable(data.get(id));}
    public Collection<RescueAnimal> findAll(){return data.values();}
}