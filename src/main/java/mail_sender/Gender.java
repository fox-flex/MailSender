package mail_sender;

import lombok.Getter;

@Getter
public enum Gender {
    MALE("Mr."),
    FEMALE("Ms.");

    private final String beforeName;

    Gender(String beforeName) {
        this.beforeName = beforeName;
    }
}
