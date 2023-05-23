package me.fileworking;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
//        File file = new File("A.txt");
//        file.createNewFile();
//        if (file.isDirectory()){
//            System.out.println("dir");
//        }
//        if (file.isFile()){
//            System.out.println("file");
//        }
//        if (file.exists()){
//            System.out.println("exist");
//        }

        FileWriter fileWriter = new FileWriter("A.txt", true);
        fileWriter.write("111\n");
        fileWriter.write("222\n");
        fileWriter.write("333\n");
        fileWriter.flush();
//        fileWriter.close();

        FileReader fileReader = new FileReader("A.txt");
        char[] chars = new char[40];
        fileReader.read(chars);
        System.out.println(chars);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("444");
        bufferedWriter.newLine();
        bufferedWriter.write("555");
        bufferedWriter.newLine();
        bufferedWriter.write("666");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }


    }
}