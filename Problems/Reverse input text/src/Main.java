import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String reader1 = reader.readLine();
        StringBuilder reader2 = new StringBuilder();
        reader2.append(reader1);
        reader2.reverse();
        System.out.println(reader2);
    }
}