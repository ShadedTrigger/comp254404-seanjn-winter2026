import java.io.File;

public class FindFile {
    public static void find(String path, String filename) {
        File root = new File(path);
        if (root.isDirectory() && root.canRead()) {
            File[] files = root.listFiles();
            // Check files isn't null to avoid exception
            if (files == null)
                return;
            for (File child : files) {
                // Check if the file is a directory, if it is then recur the method with the new directory
                if (child.isDirectory())
                    find(child.getAbsolutePath(), filename);
                // Check if the file ends with filename and print it
                else if (child.getName().endsWith(filename))
                    System.out.println(child.getAbsolutePath());
            }
        }
    }
    public static void main (String[] args) {
        find("C:\\Windows", "notepad.exe");
    }
}
