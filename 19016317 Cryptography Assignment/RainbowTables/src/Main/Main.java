package Main;

import java.awt.Color;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import rainbowTables.RainbowUtils;
import passwords.PasswordHandle;
import rainbowTables.RainbowCracking;
import rainbowTables.RainbowTable;
import utils.FileHandle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benja
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Rainbow
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buildTable_Btn = new javax.swing.JButton();
        pullRainbowTable_btn = new javax.swing.JButton();
        crackPassword_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        outputRainbowTable_btn = new javax.swing.JButton();
        hashToCrack_tf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        chainLen_txt = new javax.swing.JTextField();
        amtOfChains_txt = new javax.swing.JTextField();
        pwdLen_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        charAZZeroNine_btn = new javax.swing.JButton();
        charSetZeroNine_btn = new javax.swing.JButton();
        charSetAToZ_btn = new javax.swing.JButton();
        charSet_Label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buildTable_Btn.setText("Build Rainbow Table");
        buildTable_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildTable_BtnActionPerformed(evt);
            }
        });

        pullRainbowTable_btn.setText("Pull Rainbow Table");
        pullRainbowTable_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pullRainbowTable_btnActionPerformed(evt);
            }
        });

        crackPassword_btn.setText("Crack Password Hash");
        crackPassword_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crackPassword_btnActionPerformed(evt);
            }
        });

        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        outputRainbowTable_btn.setText("Output Rainbow Table");
        outputRainbowTable_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputRainbowTable_btnActionPerformed(evt);
            }
        });

        jLabel1.setText("Input Hash to crack");

        chainLen_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chainLen_txtActionPerformed(evt);
            }
        });

        jLabel2.setText("Chain length");

        jLabel3.setText("Ammount of Chains");

        jLabel4.setText("Password Length");

        charAZZeroNine_btn.setText("A-Z, 0-9");
        charAZZeroNine_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charAZZeroNine_btnActionPerformed(evt);
            }
        });

        charSetZeroNine_btn.setText("0-9");
        charSetZeroNine_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charSetZeroNine_btnActionPerformed(evt);
            }
        });

        charSetAToZ_btn.setText("A-Z");
        charSetAToZ_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charSetAToZ_btnActionPerformed(evt);
            }
        });

        charSet_Label.setBackground(new java.awt.Color(255, 0, 0));
        charSet_Label.setForeground(new java.awt.Color(255, 0, 0));
        charSet_Label.setText("Charset not Selected");

        jLabel6.setText("Select charset");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hashToCrack_tf, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(crackPassword_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chainLen_txt)
                            .addComponent(amtOfChains_txt)
                            .addComponent(pwdLen_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(charAZZeroNine_btn))
                            .addComponent(charSet_Label, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(charSetAToZ_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addComponent(charSetZeroNine_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(21, 21, 21))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(buildTable_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(pullRainbowTable_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45))
                    .addComponent(outputRainbowTable_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chainLen_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(charAZZeroNine_btn)
                        .addComponent(jLabel2))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amtOfChains_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(charSetZeroNine_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdLen_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(charSetAToZ_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(charSet_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buildTable_Btn)
                    .addComponent(pullRainbowTable_btn))
                .addGap(18, 18, 18)
                .addComponent(outputRainbowTable_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hashToCrack_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(crackPassword_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //============================================Storage============================================
    public LinkedHashMap<String, String> rainbowTable = new LinkedHashMap<String, String>();
    //============================================Params============================================
    public int chainSize = 0;// Length of chain to generate
    public int rowSize = 0;
    public int passwordLen = 0; // Length of desired password
    public String sha1HashToCrack = "";

    //============================================Char set============================================
    public ArrayList<String> charSetAZZeroNine = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
    public ArrayList<String> charSetZeroNine = new ArrayList<String>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
    public ArrayList<String> charSetAZ = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
    public ArrayList<String> alpha = new ArrayList<String>();
    public int charSetUsed = 0;
    //============================================AutoSet============================================
    public BigInteger PwSpSize = new BigInteger("0"); //Password space
    public BigInteger alphabetLen = new BigInteger("0");
    public ArrayList<String> passwords = new ArrayList<String>();
    //============================================Input Checking Variables============================================
    public boolean checksPassed = false;
    public boolean charsetSelected = false;

    /*
    Creates the starter set of passwords that will be used to generate the table, the ammount generated will depend on the value given in the function parameter ammountOfRows
    returns ArrayList<String> of generated passwords
    */
    public static ArrayList<String> createPasswordSeeds(int ammountOfRows) {
        ArrayList<String> passwords = new ArrayList<String>();
        Random rand = new Random();
        int upperbound = 2147483647;
        for (int i = 0; i < ammountOfRows; i++) {
            int int_random = rand.nextInt(upperbound);
            // 
            passwords.add(Integer.toString(int_random));
        }
        return passwords;
    }

    /*
    Checks to see if user inputed data is valid
    returns boolean true if user has entered all required data correctly and false if not to prevent rainbow table from building
    */
    public boolean checksInputValid() {
        if (RainbowUtils.checkIfNumber(chainLen_txt.getText()) == false) {
            outputArea.setText("Please check chain size");
            return false;
        } else if (RainbowUtils.checkIfNumber(amtOfChains_txt.getText()) == false) {
            outputArea.setText("Please check row ammount");
            return false;
        } else if (RainbowUtils.checkIfNumber(pwdLen_txt.getText()) == false) {
            outputArea.setText("Please check password len");
            return false;
        } else if (alpha.size() == 0) {
            outputArea.setText("Please select a char set");
            return false;
        } else {
            return true;
        }
    }

    /*
    Creates rainbow table
    This functions implements a slelection of functions used to generate in inital rainbow table, including generating starter passwords, calculating password space and generating a prime number.
    returns void
    */
    private void buildTable_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildTable_BtnActionPerformed

        if (checksInputValid() == true) {
            long startTime = System.nanoTime();// Used to record time of completion
            chainSize = Integer.parseInt(chainLen_txt.getText());
            rowSize = Integer.parseInt(amtOfChains_txt.getText());
            passwordLen = Integer.parseInt(pwdLen_txt.getText()); // Length of desired password

            System.out.println("passwordLen " + passwordLen);
            BigInteger passwordSpace = PasswordHandle.PwSpSizeGen(passwordLen, alphabetLen);
            System.out.println("Password Space: " + passwordSpace);
            PwSpSize = PasswordHandle.findPrime(passwordSpace);

            passwords = createPasswordSeeds(rowSize);
            System.out.println("Rows: " + passwords.size());
            rainbowTable = RainbowTable.createRainbowTable(passwords, chainSize, PwSpSize, alpha);// Creates rainbow table

            outputArea.append("RainbowTable Complete" + System.getProperty("line.separator"));
            System.out.println("RainbowTable Complete");

            FileHandle.writeRainbowToFile(rainbowTable);// Writes rainbow table to file.
            FileHandle.writeConfigFile(chainSize, passwordLen, charSetUsed, rowSize);
            long endTime = System.nanoTime();// log time of completion
            outputArea.append("Built in: " + (endTime - startTime) + " ns" + System.getProperty("line.separator"));// Calculate the time it took in nano seconds
        }
    }//GEN-LAST:event_buildTable_BtnActionPerformed

    /*
    This function pulls the rainbow table from a file and its configurations from file
    returns void
    */
    private void pullRainbowTable_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pullRainbowTable_btnActionPerformed
        try {
            ArrayList<String> config = FileHandle.readConfigFile();

            chainSize = Integer.valueOf(config.get(0));
            chainLen_txt.setText(config.get(0));

            passwordLen = Integer.valueOf(config.get(1));
            pwdLen_txt.setText(config.get(1));

            rowSize = Integer.valueOf(config.get(3));
            amtOfChains_txt.setText(config.get(3));

            if (Integer.valueOf(config.get(2)) == 0) {
                alpha = charSetAZZeroNine;
                alphabetLen = new BigInteger(Integer.toString(alpha.size()));
                charSet_Label.setText("Charset Selected: A-Z,0-9");
                charSet_Label.setForeground(Color.green);
            } else if (Integer.valueOf(config.get(2)) == 1) {
                alpha = charSetZeroNine;
                alphabetLen = new BigInteger(Integer.toString(alpha.size()));
                charSet_Label.setText("Charset Selected: 0-9");
                charSet_Label.setForeground(Color.green);
            } else if (Integer.valueOf(config.get(2)) == 2) {
                alpha = charSetAZ;
                alphabetLen = new BigInteger(Integer.toString(alpha.size()));
                charSet_Label.setText("Charset Selected: A-Z");
                charSet_Label.setForeground(Color.green);
            }

            alphabetLen = new BigInteger(Integer.toString(alpha.size()));
            rainbowTable = FileHandle.readRainbowFile();

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pullRainbowTable_btnActionPerformed

    /*
    This function uses the RainbowCracking class and the crack password function there in to crack a given hash also generates a prime number to use using the findPrime function
    returns void
    */
    private void crackPassword_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackPassword_btnActionPerformed

        long startTime = System.nanoTime();// Used to record time of completion

        sha1HashToCrack = hashToCrack_tf.getText();
        PwSpSize = PasswordHandle.findPrime(PasswordHandle.PwSpSizeGen(passwordLen, alphabetLen));
        try {
            RainbowCracking rc = new RainbowCracking(rainbowTable, chainSize, PwSpSize, alpha);
            boolean passwordIsFound = rc.crackPassword(sha1HashToCrack);// Crack Password
            long endTime = System.nanoTime();// log time of completion
            if (passwordIsFound == true) {
                outputArea.append("Found Password: " + rc.foundPassword + System.getProperty("line.separator"));
                outputArea.append("Finished in: " + (endTime - startTime) + " ns" + System.getProperty("line.separator"));// Calculate the time it took in nano seconds
            } else {
                outputArea.append("Password not found" + System.getProperty("line.separator"));
            }

        } catch (UnsupportedEncodingException | NoSuchAlgorithmException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_crackPassword_btnActionPerformed
    //Outputs whole rainbow table
    private void outputRainbowTable_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputRainbowTable_btnActionPerformed
        RainbowUtils.outputRainbowTable(rainbowTable);
    }//GEN-LAST:event_outputRainbowTable_btnActionPerformed

    private void chainLen_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chainLen_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chainLen_txtActionPerformed
    /*
    When this button is clicked it sets the char set to letters and numbers [A-Z][0-9]
    returns void
    */
    private void charAZZeroNine_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charAZZeroNine_btnActionPerformed
        alpha = charSetAZZeroNine;
        alphabetLen = new BigInteger(Integer.toString(alpha.size()));
        charSet_Label.setText("Charset Selected: A-Z,0-9");
        charSet_Label.setForeground(Color.green);
        charSetUsed = 0;
        charsetSelected = true;
    }//GEN-LAST:event_charAZZeroNine_btnActionPerformed
    /*
    When this button is clicked it sets the char set to numbers [0-9]
    returns void
    */
    private void charSetZeroNine_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charSetZeroNine_btnActionPerformed
        alpha = charSetZeroNine;
        alphabetLen = new BigInteger(Integer.toString(alpha.size()));
        charSet_Label.setText("Charset Selected: 0-9");
        charSet_Label.setForeground(Color.green);
        charSetUsed = 1;
        charsetSelected = true;
    }//GEN-LAST:event_charSetZeroNine_btnActionPerformed
    /*
    When this button is clicked it sets the char set to letters [A-Z]
    returns void
    */
    private void charSetAToZ_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charSetAToZ_btnActionPerformed
        alpha = charSetAZ;
        alphabetLen = new BigInteger(Integer.toString(alpha.size()));
        charSet_Label.setText("Charset Selected: A-Z");
        charSet_Label.setForeground(Color.green);
        charsetSelected = true;
        charSetUsed = 2;
    }//GEN-LAST:event_charSetAToZ_btnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amtOfChains_txt;
    private javax.swing.JButton buildTable_Btn;
    private javax.swing.JTextField chainLen_txt;
    private javax.swing.JButton charAZZeroNine_btn;
    private javax.swing.JButton charSetAToZ_btn;
    private javax.swing.JButton charSetZeroNine_btn;
    private javax.swing.JLabel charSet_Label;
    private javax.swing.JButton crackPassword_btn;
    private javax.swing.JTextField hashToCrack_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JButton outputRainbowTable_btn;
    private javax.swing.JButton pullRainbowTable_btn;
    private javax.swing.JTextField pwdLen_txt;
    // End of variables declaration//GEN-END:variables
}
