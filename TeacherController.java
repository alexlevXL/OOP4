public class TeacherController implements UserController<Teacher>{

    @Override
    public Teacher create(String firsName, String secondName, String lastName) {
        return new Teacher(0, lastName, secondName, lastName);
    }
}
