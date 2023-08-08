public class UserManagementApp {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Presenter presenter = new Presenter(model, view);

        presenter.performCalculation();
    }
}