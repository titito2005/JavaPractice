package Practica.Tienda;
import java.util.ArrayList;
import java.util.List;

public class TiendaModel {
    private String name;
    private List<UserModel> users = new ArrayList<>();

    public TiendaModel(String name, List<UserModel> users){
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return this.name;
    }

    public List<UserModel> getUsers(){
        return this.users;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addUser(UserModel user){
        this.users.add(user);
    }
}
