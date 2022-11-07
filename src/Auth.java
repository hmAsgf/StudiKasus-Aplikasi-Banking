public class Auth
{
    static User userLogged = null;

    public static User getUserLogged()
    {
        return userLogged;
    }

    // =-=-=-=-=-=-=-=-=-=-   I N I T I A L   U S E R   -=-=-=-=-=-=-=-=-=-=
    public static void initialUser()
    {
        User user = new User("admin", "-", "-",
         "-", "admin123", "admin");

        Rekening rekening = new Rekening("0123456789", "123456");

        user.buatRekening(rekening);
        Bank.users.add(user);
    }

    // =-=-=-=-=-=-=-=-=-=-   R E G I S T R A S I   U S E R   -=-=-=-=-=-=-=-=-=-=
    public static boolean registrasi(String nama, String nik, String noTelp, String email, String username, String password, String pin)
    {
        if((cekNik(nik)) && (cekNoTelp(noTelp)) && (cekEmail(email)))
        {
            User userBaru = new User(nama, noTelp, nik, email, password, username);
            Rekening rekeningBaru = new Rekening(RandomNumString.getNumeric(10), pin);
            userBaru.buatRekening(rekeningBaru);
            Bank.users.add(userBaru);
            return true;
        }

        return false;
    }

    // =-=-=-=-=-=-=-=-=-=-   L O G I N   U S E R   -=-=-=-=-=-=-=-=-=-=
    public static boolean login(String username, String password)
    {
        for(User user : Bank.users)
        {
            if((user.username.equals(username)) && (user.password.equals(password)))
            {
                userLogged = user;
                return true;
            }
        }

        return false;
    }

    // =-=-=-=-=-=-=-=-=-=-   C E K   D A T A   U S E R   -=-=-=-=-=-=-=-=-=-=
    public static boolean cekNik(String nik)
    {
        for(User user : Bank.users)
        {
            if(user.nik.equals(nik))
            {
                return false;
            }
        }

        return true;
    }

    public static boolean cekNoTelp(String noTelp)
    {
        for(User user : Bank.users)
        {
            if(user.noTelp.equals(noTelp))
            {
                return false;
            }
        }
        
        return true;
    }

    public static boolean cekEmail(String email)
    {
        for(User user : Bank.users)
        {
            if(user.email.equals(email))
            {
                return false;
            }
        }
        
        return true;
    }

    public static boolean cekfPin(String pin)
    {
        return userLogged.rekening.pin.equals(pin);
    }

    public static void cariRekening(String rekening)
    {
    }

    public static void logout()
    {
        userLogged = null;
    }
}
