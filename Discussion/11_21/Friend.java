public class Friend {
    private String name;

    public Friend(String name) {
        this.name = name;
    }

    public Friend getFriendlier(Friend other) {
        return new Friend(this.name + "<-" + other.name);
    }

    public String toString() {
        return this.name;
    }
}
