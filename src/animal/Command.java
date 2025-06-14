package src.animal;

public enum Command {
    ADD, LIST, EXIT;

    public static Command fromString(String input) {
        switch (input.trim().toLowerCase()) {
            case "add":
                return ADD;
            case "list":
                return LIST;
            case "exit":
                return EXIT;
            default:
                return null;
        }
    }
}
