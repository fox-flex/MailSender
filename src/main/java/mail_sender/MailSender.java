package mail_sender;

import java.io.IOException;

public class MailSender {
    private static void sendMail(MailInfo mailInfo) throws IOException {
        System.out.println("Send mail:" + mailInfo.getMailText());
    }

    public static void main(String[] args) throws IOException {
        MailSender.sendMail(new MailInfo(new Client("Faaa", Gender.FEMALE, 21,"ala.rara@ucu.edu.ua"), MailCode.BIRTHDAY));
    }
}
