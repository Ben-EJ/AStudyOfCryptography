/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sha1BruteForce;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author benja
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        clearText_btn = new javax.swing.JButton();
        generateSHA1_btn = new javax.swing.JButton();
        inputSHA1_txtb = new javax.swing.JTextField();
        setABrute_btn = new javax.swing.JButton();
        setBBrute_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputText = new javax.swing.JTextField();
        bruteForceText_btn = new javax.swing.JButton();
        bruteForceBCH_btn = new javax.swing.JButton();
        inputBCH = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        outputBCH = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        outputText = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clearText_btn.setText("Clear");
        clearText_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearText_btnActionPerformed(evt);
            }
        });
        getContentPane().add(clearText_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        generateSHA1_btn.setText("SHA-1");
        generateSHA1_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateSHA1_btnActionPerformed(evt);
            }
        });
        getContentPane().add(generateSHA1_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        inputSHA1_txtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSHA1_txtbActionPerformed(evt);
            }
        });
        getContentPane().add(inputSHA1_txtb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 166, -1));

        setABrute_btn.setText("Set A Brute Text Passwords");
        setABrute_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setABrute_btnActionPerformed(evt);
            }
        });
        getContentPane().add(setABrute_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        setBBrute_btn.setText("Set B Brute BCH");
        setBBrute_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setBBrute_btnActionPerformed(evt);
            }
        });
        getContentPane().add(setBBrute_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 367, 34));

        jLabel1.setText("Input to hash");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setText("SHA1 Output");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jLabel3.setText("Brute force SHA1 Hash Arrays in code");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        inputText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextActionPerformed(evt);
            }
        });
        getContentPane().add(inputText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 290, -1));

        bruteForceText_btn.setText("Brute Force Text");
        bruteForceText_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bruteForceText_btnActionPerformed(evt);
            }
        });
        getContentPane().add(bruteForceText_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 139, -1));

        bruteForceBCH_btn.setText("Brute force BCH");
        bruteForceBCH_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bruteForceBCH_btnActionPerformed(evt);
            }
        });
        getContentPane().add(bruteForceBCH_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 139, -1));
        getContentPane().add(inputBCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 291, -1));

        outputBCH.setColumns(20);
        outputBCH.setRows(5);
        jScrollPane3.setViewportView(outputBCH);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 391, 23));

        outputText.setColumns(20);
        outputText.setRows(5);
        jScrollPane4.setViewportView(outputText);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 391, 23));

        jLabel4.setText("Brute force Password SHA1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setText("Brute force BCH SHA1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel6.setText("SHA1 Input");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel7.setText("Output: Plain Text Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        jLabel8.setText("Output: Plain Text Password");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        jLabel9.setText("SHA1 Input");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel10.setText("==========================================================Generate SHA1==============================================================");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel11.setText("==========================================================Bruteforce SHA1==============================================================");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
Results of tests:
    
                Set A
Password Cracked, The Password: this
Cracked in: 723639300 ns
Password Cracked, The Password: is
Cracked in: 813400 ns
Password Cracked, The Password: very
Cracked in: 723438700 ns
Password Cracked, The Password: simple
Cracked in: 674410844800 ns
Password Cracked, The Password: fail7
Cracked in: 6030615400 ns
Password Cracked, The Password: 5you5
Cracked in: 31683656300 ns
Password Cracked, The Password: 3crack
Cracked in: 1017794178200 ns
Password Cracked, The Password: 1you1
Cracked in: 27648131900 ns
Password Cracked, The Password: 00if00
Cracked in: 1114834087000 ns
Password Cracked, The Password: cannot
Cracked in: 104605399500 ns
Password Cracked, The Password: 4this4
Cracked in: 1051127790699 ns
Password Cracked, The Password: 6will
Cracked in: 31975261000 ns    
*/
    
/* 
                  Set B
            Without validating
    
Password Cracked, The Password: 0000118435
Cracked in: 3285883200 ns
Password Cracked, The Password: 1111110565
racked in: 735715124400 ns
Password Cracked, The Password: 8888880747
Cracked in: 5747713047600 ns
    
            With validation
Password Cracked, The Password: 0000118435
Cracked in: 7755499 ns
Password Cracked, The Password: 1111110565
Cracked in: 173831300 ns
Password Cracked, The Password: 8888880747
Cracked in: 771245799 ns
*/
    
    //Function clears text boxes
    private void clearText_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearText_btnActionPerformed
        inputSHA1_txtb.setText("");
        display.setText("");
    }//GEN-LAST:event_clearText_btnActionPerformed

   
    /*
    Function converts a byte array to hex
    Takes an input as a byte array, converts it to hexadecimal 
    returns it as a string
    */
    private static String convertToHex(byte[] data) { 
        StringBuffer buf = new StringBuffer(); 
        for (int i = 0; i < data.length; i++) { 
        	int halfbyte = (data[i] >>> 4) & 0x0F; 
        	int two_halfs = 0; 
        	do { 
	            if ((0 <= halfbyte) && (halfbyte <= 9)) 
	                buf.append((char) ('0' + halfbyte)); 
	            else 
	            	buf.append((char) ('a' + (halfbyte - 10))); 
	            halfbyte = data[i] & 0x0F; 
        	} while(two_halfs++ < 1); 
        } 
        return buf.toString(); 
    } 
    /*
    Produces a SHA1 hash as output from a given string
    Takes in the input string in parameters and converts to sha1
    returns a SHA1 hash a string
    */
    public static String SHA1(String text)  
    throws NoSuchAlgorithmException, UnsupportedEncodingException  { 
	MessageDigest md; 
	md = MessageDigest.getInstance("SHA-1"); 
	byte[] sha1hash = new byte[40]; 
	md.update(text.getBytes("iso-8859-1"), 0, text.length()); 
	sha1hash = md.digest(); 
	return convertToHex(sha1hash); 
    
    }
    /*
    Button code to produce a SHA1 hash
    returns void
    */
    
    private void generateSHA1_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateSHA1_btnActionPerformed
        String userInput = inputSHA1_txtb.getText();
	try { 
            display.setText("SHA1 hash of string: " + SHA1(userInput)); 
	} catch (NoSuchAlgorithmException e) { 
            e.printStackTrace(); 
	} catch (UnsupportedEncodingException e) { 
            e.printStackTrace(); 
	}
    }//GEN-LAST:event_generateSHA1_btnActionPerformed

    private void inputSHA1_txtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSHA1_txtbActionPerformed
      
    }//GEN-LAST:event_inputSHA1_txtbActionPerformed

public boolean pwdCrackedSha = false;
//Uncomment and comment to choose char set for set_A
//ArrayList<String> SHA_ACharSet = new ArrayList<String>(Arrays.asList("a","b", "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"));
ArrayList<String> SHA_ACharSet = new ArrayList<String>(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));

/*
This function is use to brute force alphanumeric passwords
Takes the current password, current position, the password length needed to be generated and the sha1 hash that needs to be brute forced as input
returns error only if the password is not cracked
*/
String bruteSHA_A(String password, int currentPos, int sizeOfString, String shaToCrack) throws NoSuchAlgorithmException, UnsupportedEncodingException{
    //Generates all possible combitaions of given char set recursivly
    if (currentPos < sizeOfString) {// If the size of the current string is smaller than the current possition then:
       for(int i = 0; i < SHA_ACharSet.size(); i++){
           if(pwdCrackedSha == false){// If the password is cracked stop recursion.
               bruteSHA_A(password + SHA_ACharSet.get(i), currentPos + 1, sizeOfString, shaToCrack); //Recurse and add one charicter to string increment current pos
        }
    }
    }else{
        //System.out.println(password);
            if (shaToCrack.equals(SHA1(password))){// Checks to see if generated password hash is the same as input password hash if so the password has been found.
                System.out.println("Password Cracked, " + "The Password: " + password);
                pwdCrackedSha = true;// Sets true to prevent further recursion to save time
                passwordText = password;
            }
    }
    return "Error";
}
/*
This function is use to brute force alphanumeric passwords, it takes all hashes in the setA array list and brute forces them in sequentially
returns void
*/
    private void setABrute_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setABrute_btnActionPerformed
        pwdCrackedSha = false;
        ArrayList<String> setA = new ArrayList<String>(Arrays.asList(
       "c2543fff3bfa6f144c2f06a7de6cd10c0b650cae", "b47f363e2b430c0647f14deea3eced9b0ef300ce",
       "e74295bfc2ed0b52d40073e8ebad555100df1380", "0f7d0d088b6ea936fb25b477722d734706fe8b40",
       "77cfc481d3e76b543daf39e7f9bf86be2e664959", "5cc48a1da13ad8cef1f5fad70ead8362aabc68a1",
       "4bcc3a95bdd9a11b28883290b03086e82af90212", "7302ba343c5ef19004df7489794a0adaee68d285",
       "21e7133508c40bbdf2be8a7bdc35b7de0b618ae4", "6ef80072f39071d4118a6e7890e209d4dd07e504",
       "02285af8f969dc5c7b12be72fbce858997afe80a", "57864da96344366865dd7cade69467d811a7961b"));
        int passwordLen = 7;
        for(int x = 0; x < setA.size(); x++){//Loop through all password hash to be cracked
            long startTime = System.nanoTime();// Used to record time of completion
            pwdCrackedSha = false;
            
            for(int i = 0; i < passwordLen; i++){//Loops to generate passwords up to a password size of 7 
                if(pwdCrackedSha == false){// Checks to see if password has been cracked yet
                    try {
                        
                        bruteSHA_A("", 0, i, setA.get(x));//Brute force password hash
                        if(pwdCrackedSha == true){// If successful then
                            long endTime = System.nanoTime();// log time of completion
                            System.out.println("Cracked in: " + (endTime - startTime) + " ns");// Calculate the time it took in nano seconds
                        }
     
                    } catch (NoSuchAlgorithmException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedEncodingException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
       
    }//GEN-LAST:event_setABrute_btnActionPerformed

/*
Generates last four digits of BCH code, the first 6 digiets are taken in as a string
Returns the new 10 digit BCH number as a string.
*/
String gen4(String numberIn){
    
     ArrayList<Integer> number = new ArrayList<Integer>();
        for (int i = 0; i < numberIn.length(); i++){// Add each integer value to an array
               number.add(Integer.parseInt(String.valueOf(numberIn.charAt(i))));    
        }
        number.add((4*number.get(0)+10*number.get(1)+9*number.get(2)+2*number.get(3)+number.get(4)+7*number.get(5)) % 11);
        number.add((7*number.get(0)+8*number.get(1)+7*number.get(2)+number.get(3)+9*number.get(4)+6*number.get(5)) % 11); 
        number.add((9*number.get(0)+number.get(1)+7*number.get(2)+8*number.get(3)+7*number.get(4)+7*number.get(5)) % 11 );
	number.add((number.get(0)+2*number.get(1)+9*number.get(2)+10*number.get(3)+4*number.get(4)+number.get(5)) % 11);
        
        if(number.get(6) == 10 || number.get(7) == 10 || number.get(8) == 10 || number.get(9) == 10){// if any generated numbers are greater than 10 then the BCH code is invalid
          return "invalid";
        }else{
            StringBuilder newString = new StringBuilder();
            for (int i = 0; i < number.size(); i++){
                newString.append(number.get(i));
            }
           
            return String.valueOf(newString);
        }
}


/*
This function is use to brute force BCH codes.
Takes the current password, current position, the password length needed to be generated and the sha1 hash that needs to be brute forced as input
returns error if BCH code is not found
*/
public boolean pwdCrackedShaB = false;
String bruteSHA_B(String password, int currentPos, int sizeOfString, String shaToCrack) throws NoSuchAlgorithmException, UnsupportedEncodingException{
    ArrayList<String> string = new ArrayList<String>(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));
    //Generates all possible combitaions of given char set recursivly
    if (currentPos < sizeOfString) { // If the size of the current string is smaller than the current possition then: 
       for(int i = 0; i < string.size(); i++){
           if(pwdCrackedShaB == false){// If the password is cracked stop recursion.
              
               bruteSHA_B(password + string.get(i), currentPos + 1, sizeOfString, shaToCrack);  //Recurse and add one charicter to string, increment current pos.
           }
    }
    }else{
        String number = gen4(password);//Calculate last four digits of BHC code with the 6 generated
        if(number.equals("invalid")){//If the BCH code is invalid, ignore code
            
        }else{
             if (shaToCrack.equals(SHA1(String.valueOf(number) ) ) ){//if hashed found BCH code equals given hash, password found, stop recurtion
                System.out.println("Password Cracked, " + "The Password: " + number);  
                pwdCrackedShaB = true;
                passwordBCH = number;
            }
        }
           
    }
    return "Error";
}
/*
This function is use to brute force BCH codes, it takes all hashes in the setB array list and brute forces them in sequentially
returns void
*/
    private void setBBrute_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setBBrute_btnActionPerformed
        ArrayList<String> setB = new ArrayList<String>(Arrays.asList("902608824fae2a1918d54d569d20819a4288a4e4", "88d0b34055b79644196fce25f876bc1a5ef654d3","5b8f495b7f02b62eb228c5dbece7c2f81b60b9a3"));
        int passwordLen = 6;
        for(int x = 0; x < setB.size(); x++){// For each hash in set
            long startTime = System.nanoTime();// Start recording time
            pwdCrackedShaB = false;
            if(pwdCrackedShaB == false){// If the password has not been found then
                try {
                    bruteSHA_B("", 0, passwordLen, setB.get(x) );//Brute force hash
                    if(pwdCrackedShaB == true){// if password found, record time taken to do so
                        long endTime = System.nanoTime();
                            System.out.println("Cracked in: " + (endTime - startTime) + " ns");
                    }
     
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                 }
                }
            }
    }//GEN-LAST:event_setBBrute_btnActionPerformed
    public String passwordText = "";
    /*
    This function is use to brute force alphanumeric passwords, it takes an indervidual hash from user input and tries to crack it using the bruteSHA_A function
    returns void
    */
    private void bruteForceText_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bruteForceText_btnActionPerformed
        pwdCrackedSha = false;
        String inputHash = inputText.getText();
    
        long startTime = System.nanoTime();// Used to record time of completion
        pwdCrackedSha = false;
        int passwordLen = 9;
        for(int i = 0; i < passwordLen; i++){//Loops to generate passwords up to a password size of 7 
            if(pwdCrackedSha == false){// Checks to see if password has been cracked yet
                try {
                    bruteSHA_A("", 0, i, inputHash);    
                    
                    if(pwdCrackedSha == true){// If successful then
                        long endTime = System.nanoTime();// log time of completion
                        System.out.println("Cracked in: " + (endTime - startTime) + " ns");// Calculate the time it took in nano seconds
                        outputText.setText(passwordText);//Brute force password hash
                    }
     
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }  
    }//GEN-LAST:event_bruteForceText_btnActionPerformed
    public String passwordBCH = "";
    /*
    This function is use to brute force BCH codes, it takes an indervidual hash from user input and tries to crack it using the bruteSHA_B function
    returns void
    */
    private void bruteForceBCH_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bruteForceBCH_btnActionPerformed
            String inputHash = inputBCH.getText();
            int passwordLen = 6;
            long startTime = System.nanoTime();// Start recording time
            pwdCrackedShaB = false;
            if(pwdCrackedShaB == false){// If the password has not been found then
                try {
                    bruteSHA_B("", 0, passwordLen, inputHash);//Brute force hash
                    if(pwdCrackedShaB == true){// if password found, record time taken to do so
                        long endTime = System.nanoTime();
                            System.out.println("Cracked in: " + (endTime - startTime) + " ns");
                            outputBCH.setText(passwordBCH);
                    }
     
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                 }
                }
    }//GEN-LAST:event_bruteForceBCH_btnActionPerformed

    private void inputTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTextActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bruteForceBCH_btn;
    private javax.swing.JButton bruteForceText_btn;
    private javax.swing.JButton clearText_btn;
    private javax.swing.JTextArea display;
    private javax.swing.JButton generateSHA1_btn;
    private javax.swing.JTextField inputBCH;
    private javax.swing.JTextField inputSHA1_txtb;
    private javax.swing.JTextField inputText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea outputBCH;
    private javax.swing.JTextArea outputText;
    private javax.swing.JButton setABrute_btn;
    private javax.swing.JButton setBBrute_btn;
    // End of variables declaration//GEN-END:variables
}
