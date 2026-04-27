package repository;
import db.DatabaseManager;
import model.*;
import java.sql.*;import java.util.*;
public class AnimalRepository{
    public AnimalRepository(){
        try(Connection c=DatabaseManager.connect();Statement s=c.createStatement()){
            s.executeUpdate("CREATE TABLE IF NOT EXISTS animals(id TEXT PRIMARY KEY,name TEXT,type TEXT,reserved INTEGER);");
        }catch(Exception e){e.printStackTrace();}
    }
    public void save(RescueAnimal a){
        String sql="INSERT OR REPLACE INTO animals(id,name,type,reserved) VALUES(?,?,?,?)";
        try(Connection c=DatabaseManager.connect();PreparedStatement ps=c.prepareStatement(sql)){
            ps.setString(1,a.getId());
            ps.setString(2,a.getName());
            ps.setString(3,a.getClass().getSimpleName());
            ps.setInt(4,a.isReserved()?1:0);
            ps.executeUpdate();
        }catch(Exception e){e.printStackTrace();}
    }
    public List<RescueAnimal> findAll(){
        List<RescueAnimal> list=new ArrayList<>();
        try(Connection c=DatabaseManager.connect();Statement st=c.createStatement();ResultSet rs=st.executeQuery("SELECT * FROM animals")){
            while(rs.next()){
                String type=rs.getString("type");
                RescueAnimal a;
                if("Dog".equals(type))a=new Dog(rs.getString("id"),rs.getString("name"));
                else if("Cat".equals(type))a=new Cat(rs.getString("id"),rs.getString("name"));
                else if("Monkey".equals(type))a=new Monkey(rs.getString("id"),rs.getString("name"));
                else continue;
                if(rs.getInt("reserved")==1)a.reserve();
                list.add(a);
            }
        }catch(Exception e){e.printStackTrace();}
        return list;
    }
    public Optional<RescueAnimal> find(String id){
        return findAll().stream().filter(a->a.getId().equals(id)).findFirst();
    }
}