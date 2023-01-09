import controllers.LoginController;
import models.UserModel;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        initialDataDummy();
        run();
    }

    private static void run()
    {
        LoginController _loginC = new LoginController();
        _loginC.toView();
    }

    private static void initialDataDummy()
    {
        UserModel.initialUser();
    }
}
