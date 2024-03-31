/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;
import java.io.Serializable;

/**
 *
 * @author ASUS ExpertBook
 */
public class Settings implements Serializable {
    private static final long serialVersionUID = 1L;
    private transient String sensitiveData; // menggunakan transient
    private static String staticData; // menggunakan static
    private final String finalData; // menggunakan final

    public Settings(String sensitiveData, String finalData) {
        this.sensitiveData = sensitiveData;
        this.finalData = finalData;
    }

    // getters dan setters (untuk finalData jika perlu)
}

