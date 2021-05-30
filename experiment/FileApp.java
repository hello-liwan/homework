import java.io.File;
import java.util.List;

public class FileApp {
    public static void FileAppDemo() {
        String parent = "E:\\新建文件夹";
        File path = new File(parent);
        String[] pathlist = path.list();
        for (int i = 0; i < pathlist.length; i++) {
            File f = new File(pathlist[i]);
            System.out.println(f.getName());
            new CopyThread(parent, pathlist[i], "F:\\").start();
        }
    }
}
