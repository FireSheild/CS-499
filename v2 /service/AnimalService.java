package service;
import repository.AnimalRepository;
import model.RescueAnimal;
public class AnimalService{
    private final AnimalRepository repo;
    public AnimalService(AnimalRepository repo){this.repo=repo;}
    public void add(RescueAnimal a){repo.save(a);}
    public void reserve(String id){repo.find(id).ifPresent(a->{if(!a.isReserved())a.reserve();});}
    public void printAll(){repo.findAll().forEach(a->System.out.println(a.getId()+" | "+a.getName()+" | reserved="+a.isReserved()));}
}