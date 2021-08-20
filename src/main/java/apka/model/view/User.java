package apka.model.view;

public class User {

    private String role;
    private int idUser;
    private String name;

    public User() {
    }

    public User(String role, int idUser, String name) {
        this.role = role;
        this.idUser = idUser;
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
