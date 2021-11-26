package mail_sender;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos;

    public MailBox() {
        infos = new ArrayList<>();
    }

    public void addMail(MailInfo info) {
        infos.add(info);
    }

    public void sendAll() throws IOException {
        for (MailInfo info : infos)
            System.out.println(info.getMailText());
        infos.clear();
    }
}
