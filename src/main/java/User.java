public class User {
    private String name;
    private int credit;

    public User(String name) {
        this.name = name;
    }

    public void setCredit(int credit) {
        this.credit = credit + this.credit;
    }

    public int getCredit() {
        return this.credit;
    }

    public String getName() {
        return this.name;
    }
}
