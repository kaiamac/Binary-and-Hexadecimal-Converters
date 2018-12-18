/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamac8665
 */
public class FormNumberSystems extends javax.swing.JFrame {

    /**
     * Creates new form FormNumberSystems
     */
    public FormNumberSystems() {
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

        TITLE = new javax.swing.JLabel();
        infolabel1 = new javax.swing.JLabel();
        infolabel2 = new javax.swing.JLabel();
        infolabel3 = new javax.swing.JLabel();
        infolabel4 = new javax.swing.JLabel();
        dectobininput = new javax.swing.JTextField();
        bintodecinput = new javax.swing.JTextField();
        dectohexinput = new javax.swing.JTextField();
        hextodecinput = new javax.swing.JTextField();
        info1 = new javax.swing.JLabel();
        info2 = new javax.swing.JLabel();
        DECTOBIN = new javax.swing.JButton();
        BINTODEC = new javax.swing.JButton();
        DECTOHEX = new javax.swing.JButton();
        HEXTODEC = new javax.swing.JButton();
        hextodecoutput = new javax.swing.JLabel();
        dectohexoutput = new javax.swing.JLabel();
        bintodecoutput = new javax.swing.JLabel();
        dectobinoutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TITLE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TITLE.setText("--NUMBER SYSTEMS--");

        infolabel1.setText("Enter a decimal number:");

        infolabel2.setText("Enter a binary number:");

        infolabel3.setText("Enter a decimal number:");

        infolabel4.setText("Enter a hexadecimal number:");

        info1.setText("Decimal to binary");

        info2.setText("hexadecimal to binary");

        DECTOBIN.setText("DEC TO BIN");
        DECTOBIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DECTOBINActionPerformed(evt);
            }
        });

        BINTODEC.setText("BIN TO DEC");
        BINTODEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BINTODECActionPerformed(evt);
            }
        });

        DECTOHEX.setText("DEC TO HEX");
        DECTOHEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DECTOHEXActionPerformed(evt);
            }
        });

        HEXTODEC.setText("HEX TO DEC");
        HEXTODEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HEXTODECActionPerformed(evt);
            }
        });

        hextodecoutput.setText("---");

        dectohexoutput.setText("---");

        bintodecoutput.setText("---");

        dectobinoutput.setText("---");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(infolabel2)
                        .addComponent(infolabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infolabel3)
                            .addComponent(infolabel4))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info2)
                    .addComponent(info1)
                    .addComponent(TITLE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hextodecinput, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HEXTODEC))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dectohexinput, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DECTOHEX))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dectobininput, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bintodecinput, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BINTODEC)
                                    .addComponent(DECTOBIN))))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dectobinoutput, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(bintodecoutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dectohexoutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hextodecoutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TITLE)
                .addGap(42, 42, 42)
                .addComponent(info1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infolabel1)
                    .addComponent(dectobininput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DECTOBIN)
                    .addComponent(dectobinoutput))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infolabel2)
                    .addComponent(bintodecinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BINTODEC)
                    .addComponent(bintodecoutput))
                .addGap(40, 40, 40)
                .addComponent(info2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dectohexinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DECTOHEX)
                    .addComponent(infolabel3)
                    .addComponent(dectohexoutput))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hextodecinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HEXTODEC)
                    .addComponent(hextodecoutput)
                    .addComponent(infolabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DECTOBINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DECTOBINActionPerformed
        int n, count = 0, a;
        String x = "";
        
        n = Integer.parseInt(dectobininput.getText());
        while(n > 0)
        {
            a = n % 2;
            if(a == 1)
            {
                count++;
            }
            x = x + "" + a;
            n = n / 2;
        }
        dectobinoutput.setText("binary number: " + x);
    }//GEN-LAST:event_DECTOBINActionPerformed

    public static int getDecimal(int binary){  
    int decimal = 0;  
    int n = 0;  
    while(true){  
      if(binary == 0){  
        break;  
      } else {  
          int temp = binary%10;  
          decimal += temp*Math.pow(2, n);  
          binary = binary/10;  
          n++;  
       }  
    }  
    return decimal;  
} 
    
    private void BINTODECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BINTODECActionPerformed
        
        int num;
        
        num = Integer.parseInt(bintodecinput.getText());
        
        bintodecoutput.setText("binary as decimal: " + getDecimal(num));
    }//GEN-LAST:event_BINTODECActionPerformed

    private void DECTOHEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DECTOHEXActionPerformed
        
        String string = dectohexinput.getText();
        int no = Integer.parseInt(string);
        String hex = Integer.toHexString(no);
        dectohexoutput.setText("hex value is: " + hex);
    }//GEN-LAST:event_DECTOHEXActionPerformed

    private void HEXTODECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HEXTODECActionPerformed
        String hexNumber;
        
        hexNumber = hextodecinput.getText();
        int decimal = Integer.parseInt(hexNumber, 16);
        hextodecoutput.setText("dec value is: " + decimal);
    }//GEN-LAST:event_HEXTODECActionPerformed


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
            java.util.logging.Logger.getLogger(FormNumberSystems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNumberSystems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNumberSystems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNumberSystems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNumberSystems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BINTODEC;
    private javax.swing.JButton DECTOBIN;
    private javax.swing.JButton DECTOHEX;
    private javax.swing.JButton HEXTODEC;
    private javax.swing.JLabel TITLE;
    private javax.swing.JTextField bintodecinput;
    private javax.swing.JLabel bintodecoutput;
    private javax.swing.JTextField dectobininput;
    private javax.swing.JLabel dectobinoutput;
    private javax.swing.JTextField dectohexinput;
    private javax.swing.JLabel dectohexoutput;
    private javax.swing.JTextField hextodecinput;
    private javax.swing.JLabel hextodecoutput;
    private javax.swing.JLabel info1;
    private javax.swing.JLabel info2;
    private javax.swing.JLabel infolabel1;
    private javax.swing.JLabel infolabel2;
    private javax.swing.JLabel infolabel3;
    private javax.swing.JLabel infolabel4;
    // End of variables declaration//GEN-END:variables
}
