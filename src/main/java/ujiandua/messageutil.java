package ujiandua;

public class messageutil {
    private String message;

    public messageutil(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);
        return message;
    }
    public String salutationMessage() {
        message = "tutorialspoint" + message;
        System.out.println(message);
        return message;
    }

    public String exitMessage() {
        message = "www." + message;
        System.out.println(message);
        return message;
    }
}

