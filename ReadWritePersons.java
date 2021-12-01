package org.itstep;

import java.io.*;
import java.util.Arrays;

public class ReadWritePersons {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }

    static void write() throws IOException {
        FileOutputStream fos = new FileOutputStream("src/date/file.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person person = new Person(1, "Vlad", "+375336065444");
        person.setEmails(Arrays.asList("2mail.ru", "1mail.ru", "3mail.com", "4mail.com"));
        oos.writeObject(person);

        Person person2 = new Person(2, "Demo", "+375335451365");
        person2.setEmails(Arrays.asList("12mail.ru", "11mail.ru", "13mail.com", "14mail.com"));
        oos.writeObject(person2);

        oos.close();
        fos.close();
    }

    static void read() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src/date/file.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person = null;
        try {

            while ((person = (Person) ois.readObject()) != null) {
                System.out.println(person.toString());
            }
        } catch (EOFException e) {

        }
    }
}
