package server;
import server.api.CommandController;
import server.data.JsonRepositoryArray;

public class Main {

    public static void main(String[] args) {
        CommandController commandController = new CommandController(new JsonRepositoryArray(100));
        commandController.startListener();
    }
}
