import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PersistentStorageDriver {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bin/Lab3Object.ser.txt"));
            PersistentStorage storage = (PersistentStorage)ois.readObject();
            ois.close();

            System.out.println(storage.getInstanceSecret());
            System.out.println(storage.getComputedSecret());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
