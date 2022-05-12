package jdbcapp.files;

public class User {
    private int id;
    private String name;
    private String email;
    private String [] roles;
    private boolean admin;
    private boolean employee;

    public User(int id, String name, String email, String[] roles, boolean admin, boolean employee) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.roles = roles;
        this.admin = admin;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isEmployee() {
        return employee;
    }

    public void setEmployee(boolean employee) {
        this.employee = employee;
    }
}
