/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package serialisasi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 *
 * @author ASUS ExpertBook
 */
public class MainForm extends javax.swing.JFrame {

    public static product product;
    private final String path;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        product = new product();
        path = System.getProperty("user.dir") + File.separator
                + "product.ser";
    }
    private void lihatHasilSerialization(){
        FileReader fileReader;
        BufferedReader bufferedReader;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            File file = new File(path);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\r\n");
            }
            bufferedReader.close();
            fileReader.close();
        }catch (IOException e) {
        }
        jTextArea1.setText(stringBuilder.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEntriData = new javax.swing.JButton();
        btnDoSerialization = new javax.swing.JButton();
        btnDoDeserialization = new javax.swing.JButton();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lihatHasilSerialization = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnEntriData.setBackground(new java.awt.Color(255, 255, 0));
        btnEntriData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEntriData.setForeground(new java.awt.Color(255, 255, 255));
        btnEntriData.setText("ENTRI DATA PRODUK");
        btnEntriData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntriDataActionPerformed(evt);
            }
        });

        btnDoSerialization.setBackground(new java.awt.Color(51, 255, 51));
        btnDoSerialization.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDoSerialization.setForeground(new java.awt.Color(255, 255, 255));
        btnDoSerialization.setText("LAKUKAN SERIALISASI");
        btnDoSerialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoSerializationActionPerformed(evt);
            }
        });

        btnDoDeserialization.setBackground(new java.awt.Color(255, 0, 51));
        btnDoDeserialization.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDoDeserialization.setForeground(new java.awt.Color(255, 255, 255));
        btnDoDeserialization.setText("LAKUKAN DESERIALISASI");
        btnDoDeserialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoDeserializationActionPerformed(evt);
            }
        });

        jSplitPane2.setDividerLocation(400);
        jSplitPane2.setOneTouchExpandable(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jSplitPane2.setRightComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        lihatHasilSerialization.setText("HASIL SERIALIZATION");
        jPanel3.add(lihatHasilSerialization, java.awt.BorderLayout.PAGE_START);

        jSplitPane2.setLeftComponent(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSplitPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEntriData, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDoSerialization, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDoDeserialization, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntriData, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoSerialization, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoDeserialization, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntriDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntriDataActionPerformed
       AddProduct add = new AddProduct (this, true);
       add.setVisible(true);
    }//GEN-LAST:event_btnEntriDataActionPerformed

    private void btnDoSerializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoSerializationActionPerformed
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream(new File(path));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
            fos.close();
            
            lihatHasilSerialization();
        }catch (FileNotFoundException e) {
        }catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnDoSerializationActionPerformed

    private void btnDoDeserializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoDeserializationActionPerformed
         FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream(new File(path));
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            product k2 = (product) obj;
            jTextArea2.setText(k2.toString());
            ois.close();
            fis.close();
        }catch (FileNotFoundException e) {
        }catch (IOException ex ) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDoDeserializationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       try {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
       }catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e ){
           
       }
        java.awt.EventQueue.invokeLater(() -> {
                new MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoDeserialization;
    private javax.swing.JButton btnDoSerialization;
    private javax.swing.JButton btnEntriData;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lihatHasilSerialization;
    // End of variables declaration//GEN-END:variables
}