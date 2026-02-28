import goodpractice.EmailTemplate;
import goodpractice.EmailTemplateRegistry;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        EmailTemplate welcomeEmail1 = EmailTemplateRegistry.getTemplate("welcome-email");
        welcomeEmail1.setContent("Hello Person1. How are you?");
        welcomeEmail1.send("person1@gmail.com");


        EmailTemplate welcomeEmail2 = EmailTemplateRegistry.getTemplate("welcome-email");
        welcomeEmail2.setContent("Hello Person2, How are you?");
        welcomeEmail2.send("person2@gmail.com");

        System.out.println(welcomeEmail1);
        System.out.println(welcomeEmail2);



    }

}