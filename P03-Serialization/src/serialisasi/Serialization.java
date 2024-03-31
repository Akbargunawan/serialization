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
public class Serialization {
    public static void main(String[] args) {
        Settings settings = new Settings("data rahasia", "data final");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("settings.ser"))) {
            outputStream.writeObject(settings);
            System.out.println("Serialization berhasil.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
}
