/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;
import java.io.*;

/**
 *
 * @author ASUS ExpertBook
 */
public class Deserialization {
    public static void main(String[] args) {
        Settings settings = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("settings.ser"))) {
            settings = (Settings) inputStream.readObject();
            System.out.println("Deserialization berhasil.");
            System.out.println("Sensitive Data: " + settings.getSensitiveData());
            System.out.println("Final Data: " + settings.getFinalData());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }   
}
