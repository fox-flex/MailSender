package mail_sender;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class Client {
    @Getter(AccessLevel.NONE)
    private String name;
    private Gender sex;
    private int age;
    private String email;
    private final int id;

    public Client(String name, Gender sex, int age, String email) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.email = email;
        this.id = IDGenerator.generateNewID();
    }

    public String getName() {
        return this.sex.getBeforeName() + " " + this.name;
    }

    private static class IDGenerator {
        private static int idCount = 0;
        public static int generateNewID() {
            return idCount++;
        }
    }

}
