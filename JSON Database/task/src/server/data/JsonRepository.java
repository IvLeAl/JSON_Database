package server.data;

public interface JsonRepository {
    String get(int index);
    boolean set(int index, String value);
    boolean delete(int index);
}

