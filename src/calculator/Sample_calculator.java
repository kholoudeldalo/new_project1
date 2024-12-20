/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;
/**
 *
 * @author Soliman
 */
public class Sample_calculator extends javax.swing.JFrame {
    //first step declare var
    int num1;
    int num2;
    String total;
    String operator;
    int result;
    /**
     * Creates new form Sample_calculator
     */
    public Sample_calculator() {
        super.setTitle("Calculator");
        super.setResizable(false);
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

        jLabel1 = new javax.swing.JLabel();
        two_btn = new javax.swing.JButton();
        three_btn = new javax.swing.JButton();
        one_btn = new javax.swing.JButton();
        six_btn = new javax.swing.JButton();
        div_btn = new javax.swing.JButton();
        eight_btn = new javax.swing.JButton();
        seven_btn = new javax.swing.JButton();
        neg_btn = new javax.swing.JButton();
        nine_btn = new javax.swing.JButton();
        multy_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        equal_btn = new javax.swing.JButton();
        input_text = new javax.swing.JTextField();
        Five_btn = new javax.swing.JButton();
        four_btn = new javax.swing.JButton();
        Zero_btn = new javax.swing.JButton();
        puls_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Calculator");

        two_btn.setBackground(new java.awt.Color(153, 153, 153));
        two_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        two_btn.setText("2");
        two_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        two_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two_btnActionPerformed(evt);
            }
        });

        three_btn.setBackground(new java.awt.Color(153, 153, 153));
        three_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        three_btn.setText("3");
        three_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        three_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three_btnActionPerformed(evt);
            }
        });

        one_btn.setBackground(new java.awt.Color(153, 153, 153));
        one_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        one_btn.setText("1");
        one_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        one_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one_btnActionPerformed(evt);
            }
        });

        six_btn.setBackground(new java.awt.Color(153, 153, 153));
        six_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        six_btn.setText("6");
        six_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        six_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                six_btnActionPerformed(evt);
            }
        });

        div_btn.setBackground(new java.awt.Color(153, 153, 153));
        div_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        div_btn.setText("/");
        div_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        div_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div_btnActionPerformed(evt);
            }
        });

        eight_btn.setBackground(new java.awt.Color(153, 153, 153));
        eight_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eight_btn.setText("8");
        eight_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        eight_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eight_btnActionPerformed(evt);
            }
        });

        seven_btn.setBackground(new java.awt.Color(153, 153, 153));
        seven_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seven_btn.setText("7");
        seven_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        seven_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seven_btnActionPerformed(evt);
            }
        });

        neg_btn.setBackground(new java.awt.Color(153, 153, 153));
        neg_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        neg_btn.setText("-");
        neg_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        neg_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neg_btnActionPerformed(evt);
            }
        });

        nine_btn.setBackground(new java.awt.Color(153, 153, 153));
        nine_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nine_btn.setText("9");
        nine_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        nine_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nine_btnActionPerformed(evt);
            }
        });

        multy_btn.setBackground(new java.awt.Color(153, 153, 153));
        multy_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multy_btn.setText("*");
        multy_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        multy_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multy_btnActionPerformed(evt);
            }
        });

        clear_btn.setBackground(new java.awt.Color(153, 153, 153));
        clear_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clear_btn.setText("Clear");
        clear_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        equal_btn.setBackground(new java.awt.Color(153, 153, 153));
        equal_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equal_btn.setText("=");
        equal_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        equal_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equal_btnActionPerformed(evt);
            }
        });

        input_text.setEditable(false);
        input_text.setBackground(new java.awt.Color(204, 204, 204));
        input_text.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        input_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_textActionPerformed(evt);
            }
        });

        Five_btn.setBackground(new java.awt.Color(153, 153, 153));
        Five_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Five_btn.setText("5");
        Five_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Five_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Five_btnActionPerformed(evt);
            }
        });

        four_btn.setBackground(new java.awt.Color(153, 153, 153));
        four_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        four_btn.setText("4");
        four_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        four_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four_btnActionPerformed(evt);
            }
        });

        Zero_btn.setBackground(new java.awt.Color(153, 153, 153));
        Zero_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Zero_btn.setText("0");
        Zero_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Zero_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Zero_btnActionPerformed(evt);
            }
        });

        puls_btn.setBackground(new java.awt.Color(153, 153, 153));
        puls_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        puls_btn.setText("+");
        puls_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        puls_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puls_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(one_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(four_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(two_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(three_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(Five_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(six_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seven_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Zero_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(eight_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nine_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(multy_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(div_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(puls_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_text, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_text, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(three_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puls_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(six_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Five_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(four_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multy_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(div_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Zero_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(clear_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Five_btn, div_btn, eight_btn, equal_btn, four_btn, multy_btn, neg_btn, nine_btn, one_btn, puls_btn, seven_btn, six_btn, three_btn, two_btn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void three_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three_btnActionPerformed
        // TODO add your handling code here:
         total =input_text.getText();
        input_text.setText(total +"3");
    }//GEN-LAST:event_three_btnActionPerformed

    private void seven_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seven_btnActionPerformed
        // TODO add your handling code here:
         total =input_text.getText();
        input_text.setText(total +"7");
    }//GEN-LAST:event_seven_btnActionPerformed

    private void eight_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eight_btnActionPerformed
        // TODO add your handling code here:
         total =input_text.getText();
        input_text.setText(total +"8");
    }//GEN-LAST:event_eight_btnActionPerformed

    private void input_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_textActionPerformed

    private void one_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one_btnActionPerformed
        // TODO add your handling code here:
        total =input_text.getText();
        input_text.setText(total +"1");
    }//GEN-LAST:event_one_btnActionPerformed

    private void two_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two_btnActionPerformed
        // TODO add your handling code here:
         total =input_text.getText();
        input_text.setText(total +"2");
    }//GEN-LAST:event_two_btnActionPerformed

    private void six_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_six_btnActionPerformed
        // TODO add your handling code here:
         total =input_text.getText();
        input_text.setText(total +"6");
    }//GEN-LAST:event_six_btnActionPerformed

    private void nine_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nine_btnActionPerformed
        // TODO add your handling code here:
         total =input_text.getText();
        input_text.setText(total +"9");
    }//GEN-LAST:event_nine_btnActionPerformed

    private void neg_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neg_btnActionPerformed
        // TODO add your handling code here:
        
         operator="-";
        num1=Integer.parseInt(input_text.getText());
        input_text.setText("");
    }//GEN-LAST:event_neg_btnActionPerformed

    private void div_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div_btnActionPerformed
        // TODO add your handling code here:
        
         operator="/";
        num1=Integer.parseInt(input_text.getText());
   
        input_text.setText("");
    }//GEN-LAST:event_div_btnActionPerformed

    private void multy_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multy_btnActionPerformed
        // TODO add your handling code here:
         operator="*";
        num1=Integer.parseInt(input_text.getText());
        input_text.setText("");
    }//GEN-LAST:event_multy_btnActionPerformed

    private void equal_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equal_btnActionPerformed
        // TODO add your handling code here:
        try{
        num2=Integer.parseInt(input_text.getText());
        if(operator.equals("*")){
            result=num1*num2;
        }
        else if(operator.equals("+")){
            result=num1+num2;
        }
         else if(operator.equals("/")){
             if(num2!=0)
                result= num1/num2;
             else
               input_text.setText(" Erorr");    
         }
         else if(operator.equals("-")){
            result=num1-num2;
        }
        input_text.setText(result +" "); 
        }
        catch(Exception ex){
           ex.getMessage();
           }
    }//GEN-LAST:event_equal_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        // TODO add your handling code here:
        input_text.setText("");
        result=0;
        num1=0;
        num2=0;
    }//GEN-LAST:event_clear_btnActionPerformed

    private void Five_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Five_btnActionPerformed
        // TODO add your handling code here:
          total =input_text.getText();
        input_text.setText(total +"5");
        
    }//GEN-LAST:event_Five_btnActionPerformed

    private void four_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four_btnActionPerformed
        // TODO add your handling code here:
          total =input_text.getText();
        input_text.setText(total +"4");
    }//GEN-LAST:event_four_btnActionPerformed

    private void Zero_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Zero_btnActionPerformed
        // TODO add your handling code here:
          total =input_text.getText();
        input_text.setText(total +"0");
    }//GEN-LAST:event_Zero_btnActionPerformed

    private void puls_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puls_btnActionPerformed
        // TODO add your handling code here:
          operator="+";
        num1=Integer.parseInt(input_text.getText());
        input_text.setText("");
    }//GEN-LAST:event_puls_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Sample_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sample_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sample_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sample_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sample_calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Five_btn;
    private javax.swing.JButton Zero_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton div_btn;
    private javax.swing.JButton eight_btn;
    private javax.swing.JButton equal_btn;
    private javax.swing.JButton four_btn;
    private javax.swing.JTextField input_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton multy_btn;
    private javax.swing.JButton neg_btn;
    private javax.swing.JButton nine_btn;
    private javax.swing.JButton one_btn;
    private javax.swing.JButton puls_btn;
    private javax.swing.JButton seven_btn;
    private javax.swing.JButton six_btn;
    private javax.swing.JButton three_btn;
    private javax.swing.JButton two_btn;
    // End of variables declaration//GEN-END:variables
}
