import java.io.File;

class Siblings {

    public static boolean areSiblings(File f1, File f2) {
       if (f1.getParent().equals(f2.getParent())) {
           System.out.println("true");
       } else System.out.println("false");
       return areSiblings(f1, f2);
    }

}