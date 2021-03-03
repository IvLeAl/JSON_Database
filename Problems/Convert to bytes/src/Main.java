import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        int r = inputStream.read();
        while(r != -1){
            System.out.print(r);
            r = inputStream.read();
        }
        inputStream.close();
    }
}