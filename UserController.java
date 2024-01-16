public interface UserController <T extends User> {
    T create (String firsName, String secondName, String lastName);
}
