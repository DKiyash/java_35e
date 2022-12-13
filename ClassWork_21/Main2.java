package java_35e_HW.ClassWork_21;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        File fileA = new File("./A.txt");
        File fileB = new File("./B.txt");
        FileWriter writerFileA = new FileWriter(fileA);
        writerFileA.write(", my name is Dima");
        writerFileA.flush();
        writerFileA.close();
        FileWriter writerFileB = new FileWriter(fileB);
        writerFileB.write("Hello world");
        writerFileB.flush();
        writerFileB.close();

        FileOutputStream fos = new FileOutputStream(fileB, true);
        FileInputStream fis = new FileInputStream(fileA);
        fis.transferTo(fos);
        fos.flush();
        fis.close();
        fos.close();
//        DataInputStream dfis = new DataInputStream(new FileInputStream(fileB, true));
    }
}

//TODO
// Используя FileInputStream, прочитайте данные из файла A
// И с помощью FileOutputStream допишете их в конец файла B

// File A: ", my name is <ваше имя>"
// File B: "Hello world"

//fis.transferTo(fos)

