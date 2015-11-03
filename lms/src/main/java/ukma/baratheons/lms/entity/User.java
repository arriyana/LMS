package ukma.baratheons.lms.entity;

/**
 * Created by user on 03.11.2015.
 */
public class User {
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private long lastOnline;
    private long regDate;
    private String password;
    private boolean isActive;
    private int penaltyScore;
    private int rights;
    private int userRole;
    private boolean receiveEmail;

    public User() {
    }

    public User(String email, String firstName, String lastName, int lastOnline,
                int regDate, String password, boolean isActive, int penaltyScore,
                int rights, int userRole, boolean receiveEmail) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastOnline = lastOnline;
        this.regDate = regDate;
        this.password = password;
        this.isActive = isActive;
        this.penaltyScore = penaltyScore;
        this.rights = rights;
        this.userRole = userRole;
        this.receiveEmail = receiveEmail;
    }

    public User(int id, String email, String firstName, String lastName, int lastOnline,
                int regDate, String password, boolean isActive, int penaltyScore,
                int rights, int userRole, boolean receiveEmail) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastOnline = lastOnline;
        this.regDate = regDate;
        this.password = password;
        this.isActive = isActive;
        this.penaltyScore = penaltyScore;
        this.rights = rights;
        this.userRole = userRole;
        this.receiveEmail = receiveEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getLastOnline() {
        return lastOnline;
    }

    public void setLastOnline(long lastOnline) {
        this.lastOnline = lastOnline;
    }

    public long getRegDate() {
        return regDate;
    }

    public void setRegDate(long regDate) {
        this.regDate = regDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getPenaltyScore() {
        return penaltyScore;
    }

    public void setPenaltyScore(int penaltyScore) {
        this.penaltyScore = penaltyScore;
    }

    public int getRights() {
        return rights;
    }

    public void setRights(int rights) {
        this.rights = rights;
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public boolean isReceiveEmail() {
        return receiveEmail;
    }

    public void setReceiveEmail(boolean receiveEmail) {
        this.receiveEmail = receiveEmail;
    }
}
