package mini_projects;

public class User {
    private String adSoyad;
    private String username;
    private String email;
    private String password;

    public User(String adSoyad, String username, String email, String password) {  //constructor lar
        this.adSoyad = adSoyad;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
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

    @Override
    public String toString() {
        return "User{" +
                "adSoyad='" + adSoyad + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
