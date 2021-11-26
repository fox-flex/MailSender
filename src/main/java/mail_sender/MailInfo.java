package mail_sender;

/*
* information about mail
* */

import lombok.AllArgsConstructor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String getMailText() throws IOException {
        String text = mailCode.getText();
        HashMap<String, String> template = new HashMap<>();
        template.put("%NAME%", this.client.getName());
        template.put("%AGE%", "" + this.client.getAge()+1);
        for (String key : template.keySet())
            text = text.replace(key, template.get(key));
        return text;
    }

    public String getMail() {
        return this.client.getEmail();
    }

    public String getName() {
        return this.client.getName();
    }

//    public static void main(String[] args) throws IOException {
//        System.out.println(new MailInfo(new Client("Alarara", Gender.FEMALE, 22, "ala.rara@ucu.edu.ua"), MailCode.BIRTHDAY).getMailText());
//    }
}
