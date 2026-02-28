package goodpractice;

public interface EmailTemplate extends Cloneable{
    EmailTemplate clone(); //deep-copy
    void setContent(String content);
    void send(String to);
}
