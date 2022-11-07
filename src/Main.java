public class Main
{
    public static void main(String[] args) throws Exception
    {
        Auth.initialUser();
        new HomePage();

        for(User user : Bank.users)
        {
            user.dataUser();
            System.out.println();
        }
    }
}
