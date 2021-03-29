package server.data;
import java.util.Arrays;

public class JsonRepositoryArray implements JsonRepository {
    private final String[] dataSource;
    private final int size;

    public JsonRepositoryArray(int size) {
        this.size = size;
        dataSource = new String[size];
        Arrays.fill(dataSource, "");
    }

    @Override
    public String get(int index) {
        if (isValidIndex(index) && !dataSource[index - 1].isEmpty()) {
            return dataSource[index - 1];
        }
        return null;
    }

    @Override
    public boolean set(int index, String value) {
        if (isValidIndex(index)) {
            dataSource[index - 1] = value;
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int index) {
        return set(index, "");
    }

    public boolean isValidIndex(int index) {
        return index >= 1 && index <= size;
    }

}

