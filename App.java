package demo.EmailSending;

public class App 
{
    public static void main( String[] args )
    {
        Email email=new Email();
        String to="maazpatelx@gmail.com";
        String from="patelmaaz6394@gmail.com";
        String sunject="Sending mail using java";
        String text=" this is example mail";
        boolean b=email.sendEmail(to, from, sunject, text);
        
        if(b)
        {
        	System.out.println("Email send successfully");
        }
        else
        {
        	System.out.println("Their is problem");
        }
    }
}
