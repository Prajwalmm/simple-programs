public class passwordCheker{
    static string ValidatePassword(string password)
    {
        if (password.Length != 8)
            return "Password must be at least 8 characters long.";

        bool hasUpper = false;
        bool hasLower = false;
        bool hasDigit = false;
     

        foreach (char c in password)
        {
            if (char.IsUpper(c)) hasUpper = true;
            else if (char.IsLower(c)) hasLower = true;
            else if (char.IsDigit(c)) hasDigit = true;
          
        }

        if (!hasUpper) return "Password must contain at least one uppercase letter.";
        if (!hasLower) return "Password must contain at least one lowercase letter.";
        if (!hasDigit) return "Password must contain at least one digit.";
       

        return "Valid";
    }
    static void Main(string[] args)
    {
        /*It is password checker where  It will check that below conditions
         * Password must contain 8 characters
         * It should include :
         * one capital letter 
         * one small letter
         * and one number 
         */
        Console.WriteLine("Enter the password to verify");
        String password= Console.ReadLine();
        Console.WriteLine(ValidatePassword(password));
        

    }
}