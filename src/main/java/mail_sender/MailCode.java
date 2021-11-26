package mail_sender;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public enum MailCode {
    SALE("mail_template/sale_info.txt"),
    BIRTHDAY("mail_template/happy_birthday.txt");

    private final String filename;

    MailCode(String string) {
        this.filename = string;
    }

    public String getText() throws IOException {
        return Files.readString(Paths.get(this.filename));
    }

//    private static void main(String[] args) throws IOException {
//        System.out.println(MailCode.SALE.getText());
//    }
}
