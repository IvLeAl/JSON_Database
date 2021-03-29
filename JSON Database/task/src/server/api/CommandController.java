package server.api;

import server.data.JsonRepository;

import java.util.Objects;
import java.util.Scanner;

public class CommandController {
    private final JsonRepository jsonRepository;
    private String operation;
    private int index;
    private String value;

    public CommandController(JsonRepository jsonRepository) {
        this.jsonRepository = jsonRepository;
    }

    public void startListener() {
        do {
            getOperation();
            switch (operation) {
                case "get":
                    String result = jsonRepository.get(index);
                    System.out.println(Objects.requireNonNullElse(result, "ERROR"));
                    break;
                case "set":
                    System.out.println(jsonRepository.set(index, value) ? "OK" : "ERROR");
                    break;
                case "delete":
                    System.out.println(jsonRepository.delete(index) ? "OK" : "ERROR");
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        } while (!"exit".equals(operation));
    }

    public void getOperation() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] parts = str.split(" ", 3);
        operation = parts.length > 0 ? parts[0] : "";
        index = parts.length > 1 ? Integer.parseInt(parts[1]) : 0;
        value = parts.length > 2 ? parts[2] : "";
    }
}
