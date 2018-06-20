
import java.text.DecimalFormat;

/*
 * This is the simple calculator. The user will be able to preform basic math
 * operation. 
 */

/**
 *
 * @author Hildana
 */


public class NewJFrame1 extends javax.swing.JFrame {
    
    
    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
        initComponents();
        
        //sets the program in the middle of the screen 
        this.setLocationRelativeTo(null);
 
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonBackCal = new javax.swing.JButton();
        textNum1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        labelSimpleCalculator = new javax.swing.JLabel();
        textNum2 = new javax.swing.JTextField();
        labelNum1 = new javax.swing.JLabel();
        labelNum2 = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();
        buttonSub = new javax.swing.JButton();
        buttonMul = new javax.swing.JButton();
        buttonDiv = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        labelOutput = new javax.swing.JLabel();
        labelResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 0));

        buttonBackCal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonBackCal.setText("Back");
        buttonBackCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackCalActionPerformed(evt);
            }
        });

        textNum1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNum1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        labelSimpleCalculator.setFont(new java.awt.Font("Sitka Heading", 0, 48)); // NOI18N
        labelSimpleCalculator.setText("Simple Calculator ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSimpleCalculator)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSimpleCalculator)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textNum2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNum2ActionPerformed(evt);
            }
        });

        labelNum1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelNum1.setText("First Number: ");

        labelNum2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelNum2.setText("Second Number:");

        buttonAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonAdd.setText("Additon");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonSub.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonSub.setText("Subtraction");
        buttonSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubActionPerformed(evt);
            }
        });

        buttonMul.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonMul.setText("Mutiplication");
        buttonMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMulActionPerformed(evt);
            }
        });

        buttonDiv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonDiv.setText("Division");
        buttonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivActionPerformed(evt);
            }
        });

        buttonClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonClear.setText("Clear");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("INSTRUCTION\n\n1. Type in the first number.\n\n2. Type in the second number\n\n3. Press which ever button you need to use. ");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelOutput.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(labelOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelOutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        labelResult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelResult.setText("Result");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(buttonBackCal))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNum1)
                                    .addComponent(labelNum2))
                                .addGap(53, 53, 53)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonAdd)
                                .addGap(37, 37, 37)
                                .addComponent(buttonSub)
                                .addGap(35, 35, 35)
                                .addComponent(buttonMul))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelResult)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(buttonDiv))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(buttonClear)
                                .addGap(13, 13, 13)))))
                .addGap(18, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNum1))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonAdd)
                            .addComponent(buttonSub)
                            .addComponent(buttonMul)
                            .addComponent(buttonDiv))
                        .addGap(18, 18, 18)
                        .addComponent(buttonClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonBackCal))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelResult)
                                .addGap(6, 6, 6)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 85, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackCalActionPerformed
        
        //When user presses this button, it should go back to the homepage 
        this.setVisible(false);
        new  FrameCalculatorGadget_Culminating().setVisible(true);
        
    }//GEN-LAST:event_buttonBackCalActionPerformed

    private void textNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNum1ActionPerformed

    private void textNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNum2ActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        double num1, num2, total;
        
        //round the output to two decimal places
        DecimalFormat round = new DecimalFormat ("###.###");
        
        //assign the number the user inputed to these variables 
        num1 = Double.parseDouble(textNum1.getText());
        num2 = Double.parseDouble(textNum2.getText());
        
        //Formula for addition 
        total = num1 + num2;  
        
        //result 
        labelOutput.setText( num1 + " + " + num2 + " = " + round.format(total));
   
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubActionPerformed
        double num1, num2, total;
        
        //round the output to two decimal places
        DecimalFormat round = new DecimalFormat ("###.###");
        
        //assign the number the user inputed to these variables 
        num1 = Double.parseDouble(textNum1.getText());
        num2 = Double.parseDouble(textNum2.getText());
        
        //Formula for subtraction  
        total = num1 - num2;   
        
        //result 
        labelOutput.setText( num1 + " - " + num2 + " = " + round.format(total));
        
    }//GEN-LAST:event_buttonSubActionPerformed

    private void buttonMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMulActionPerformed
        double num1, num2, total;
        
        //round the output to two decimal places
        DecimalFormat round = new DecimalFormat ("###.###");
        
        //assign the number the user inputed to these variables 
        num1 = Double.parseDouble(textNum1.getText());
        num2 = Double.parseDouble(textNum2.getText());
        
        //Formula for multiplication   
        total = num1 * num2;   
        
        //result 
        labelOutput.setText( num1 + " x " + num2 + " = " + round.format(total));
        
    }//GEN-LAST:event_buttonMulActionPerformed

    private void buttonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivActionPerformed
        double num1, num2, total;
        
        //round the output to two decimal places
        DecimalFormat round = new DecimalFormat ("###.###");
        
        //assign the number the user inputed to these variables 
        num1 = Double.parseDouble(textNum1.getText());
        num2 = Double.parseDouble(textNum2.getText());
        
        //Formula for division  
        total = num1 / num2;   
        
        //result 
        labelOutput.setText( num1 + " / " + num2 + " = " + round.format(total));   
       
    }//GEN-LAST:event_buttonDivActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
      
       //clears the input and output boxes
       textNum1.setText("");
       textNum2.setText(" ");
       labelOutput.setText(" ");
        
    }//GEN-LAST:event_buttonClearActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonBackCal;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonDiv;
    private javax.swing.JButton buttonMul;
    private javax.swing.JButton buttonSub;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelNum1;
    private javax.swing.JLabel labelNum2;
    private javax.swing.JLabel labelOutput;
    private javax.swing.JLabel labelResult;
    private javax.swing.JLabel labelSimpleCalculator;
    private javax.swing.JTextField textNum1;
    private javax.swing.JTextField textNum2;
    // End of variables declaration//GEN-END:variables
}