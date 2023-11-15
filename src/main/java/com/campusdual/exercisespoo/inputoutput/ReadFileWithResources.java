//package com.campusdual.exercisespoo.inputoutput;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//public class ReadFileWithResources {
//    public static void main(String[] args) {
//
//        File file = new File("src/main/resources/filereader.txt");
//        try(BufferedReader br = new BufferedReader(new FileReader(file)) ){
//            String line;
//            while((line = br.readLine()) != null){
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
