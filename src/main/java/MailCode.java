import java.nio.file.Path;
import java.nio.file.Paths;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() {
        // Read file
        // Inject client data
        // Return text
        return "";
    }
}
