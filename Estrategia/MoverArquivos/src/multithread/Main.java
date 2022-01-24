package multithread;

import java.io.File;
import java.io.IOException;

public class Main {

    public static File[] listaFiles;

    public static void main(String[] args) throws IOException {
        final long startTime = System.currentTimeMillis();
        Main.getSingleTonListaFiles();
        int sizeThread = Main.listaFiles.length / 2;

        String[] filePath1 = new String[sizeThread];
        for (int i = 0; i < sizeThread; i++) {
            filePath1[i] = Main.listaFiles[i].getCanonicalPath();
        }
        String[] filePath2;
        if (Main.listaFiles.length % 2 == 0) {
            filePath2 = new String[sizeThread];
            for (int n = 0, j = sizeThread; j < Main.listaFiles.length; j++, n++) {
                filePath2[n] = Main.listaFiles[j].getCanonicalPath();
            }
        } else {
            filePath2 = new String[sizeThread + 1];
            for (int n = 0, k = sizeThread; k < ((sizeThread * 2) + 1); k++, n++) {
                filePath2[n] = Main.listaFiles[k].getCanonicalPath();
            }
        }

        Run run1 = new Run(filePath1);
        Run run2 = new Run(filePath2);

        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);

        t1.start();
        t2.start();
        final long elapsedTimeMillis = System.currentTimeMillis() - startTime;
        System.out.println("Multi Thread Time:" + elapsedTimeMillis + "ms");
    }

    public static synchronized File[] getSingleTonListaFiles() throws IOException
    {
        if(listaFiles == null){
            String current = new java.io.File(".").getCanonicalPath();
            File file = new File(current + "\\src\\origem");
            listaFiles = file.listFiles();
        }
        return listaFiles;
    }
}
