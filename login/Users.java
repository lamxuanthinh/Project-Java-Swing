package login;

public class Users {

    private String username;
    private String email;
    private String password;
    private int  role_id;
    private int  active;

    public Users() {
    }

    public Users(String username, String email, String password, int role_id, int active) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role_id = role_id;
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

}