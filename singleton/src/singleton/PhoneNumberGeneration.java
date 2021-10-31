package singleton;

import  java.io.*;

public class PhoneNumberGeneration {
    private  static PhoneNumberGeneration instnace;
    private String number;


    private PhoneNumberGeneration() {

    }

    public synchronized static PhoneNumberGeneration getInstnace(){
        if (instnace == null) {
            instnace = new PhoneNumberGeneration();
        }

        return instnace;
    }

    public synchronized String getNextPhoneNumber() throws IOException {
        File file = new File("src/number.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        this.number = bufferedReader.readLine();
        int nextNumber = Integer.parseInt(this.number) + 1;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        String saveNextNumber = Integer.toString(nextNumber);
        bufferedWriter.write(saveNextNumber);
        bufferedWriter.flush();
        return this.number;
    }
}
