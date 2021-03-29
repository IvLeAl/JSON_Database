import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine().trim();
        String[] strArr = line.split(" ");
        int count = 0;
           for (int i = 0; i < strArr.length; i++) {
           count++;
           }
        System.out.println(count);
        reader.close();
    }
}