package Library__Management;
import Library__Management.*;

class UserFactory {
    public static User createUser(String userType, String name) {
        switch (userType.toLowerCase()) {
            case "visitor":
                return new Visitor(name);
            case "member":
                return new Member(name);
            case "librarian":
                return new Librarian(name);
            default:
                throw new IllegalArgumentException("Invalid user type.");
        }
    }
}