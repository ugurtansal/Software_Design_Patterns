public class User {
    private String name;
    private boolean isAuthenticated;


    public User(String name, boolean isAuthenticated) {
        this.name = name;
        this.isAuthenticated = isAuthenticated;
    }

    public String getName() {
        return name;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

}
