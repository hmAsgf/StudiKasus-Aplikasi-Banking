import controllers.StartController;
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
        StartController startC = new StartController();
        startC.toView();
    }

    private static void initialDataDummy()
    {
        UserModel.initialUser();
    }
}
