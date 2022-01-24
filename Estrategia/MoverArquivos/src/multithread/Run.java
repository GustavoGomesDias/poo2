package multithread;

import java.io.*;
import java.nio.channels.FileChannel;

public class Run implements Runnable{
    private String[] filePath;

    public Run(String[] filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {

        try {
            for (String path : this.filePath) {
                File origem = new File(path);
                String destinationFile = path;
                destinationFile = destinationFile.replace("origem", "destino");
                copyFile(origem, new File(destinationFile));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] getFilePath() {
        return filePath;
    }

    public void setFilePath(String[] filePath) {
        this.filePath = filePath;
    }

    public void copyFile(File sourceFile, File destFile) throws IOException {

        if (!sourceFile.exists()) {
            return;
        }
        if (!destFile.exists()) {
            destFile.createNewFile();
        }
        FileChannel source = null;
        FileChannel destination = null;
        source = new FileInputStream(sourceFile).getChannel();
        destination = new FileOutputStream(destFile).getChannel();
        if (destination != null && source != null) {
            destination.transferFrom(source, 0, source.size());
        }
        if (source != null) {
            source.close();
        }
        if (destination != null) {
            destination.close();
        }
    }
}
