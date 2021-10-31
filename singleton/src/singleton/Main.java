package singleton;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PhoneNumberGeneration phoneNumber = PhoneNumberGeneration.getInstnace();

        System.out.println("Phone Number 1: " + phoneNumber.getNextPhoneNumber());
        System.out.println("Phone Number 2: " + phoneNumber.getNextPhoneNumber());
        System.out.println("Phone Number 3: " + phoneNumber.getNextPhoneNumber());
    }
}
