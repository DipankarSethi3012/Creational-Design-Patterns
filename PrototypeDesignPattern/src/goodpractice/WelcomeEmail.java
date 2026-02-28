package goodpractice;

import java.util.ArrayList;

public class WelcomeEmail implements EmailTemplate {
    private String subject;
    private String content;

    public WelcomeEmail() {
        this.subject = "Welcome to TUF+";
        this.content = "Hello Student";
    }

    @Override
    public EmailTemplate clone() {
        try {
            WelcomeEmail copy =  (WelcomeEmail) super.clone();
            //if have some maps, lists etc. instead of String we also do this
            //copy.someList = new someList<>(this.someList)
            return copy;
        } catch (Exception e) {
            throw new RuntimeException("Clone not supported: " + e.getMessage());
        }
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void send(String to) {
        System.out.println("Sending email to: " + to);
    }


    public String getContent() {
        return content;
    }
}