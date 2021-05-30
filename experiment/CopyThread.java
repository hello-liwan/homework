import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyThread extends Thread{
    String parent;
    String filename;
    String destination;

    public CopyThread(String parent, String filename, String destination) {
        this.parent = parent;
        this.filename = filename;
        this.destination = destination;
    }

    @Override
    public void run() {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(parent + "\\" + filename);
            out = new FileOutputStream(destination + "\\" + filename);
            int c;
            while ((c = in.read()) != 0){
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
