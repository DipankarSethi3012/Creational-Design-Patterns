package goodpractice;

import java.util.HashMap;
import java.util.Map;

public class EmailTemplateRegistry {
    private static final Map<String, EmailTemplate> templates = new HashMap<>();

    static {
        templates.put("welcome-email", new WelcomeEmail());
    }

    public static EmailTemplate getTemplate(String template) {
        return templates.get(template).clone(); //clone to avoid modifying original
    }
}
