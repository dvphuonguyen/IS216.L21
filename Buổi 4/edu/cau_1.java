/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.la2_thuchanh;

/**
 *
 * @author phuon
 */
public class cau_1 extends javax.swing.JFrame {

    /**
     * Creates new form cau_1
     */
    public cau_1() {
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

        lbHienThi = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnSo7 = new javax.swing.JButton();
        btnSo8 = new javax.swing.JButton();
        btnSo9 = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnSo4 = new javax.swing.JButton();
        btnSo5 = new javax.swing.JButton();
        btnSo6 = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnSo1 = new javax.swing.JButton();
        btnSo2 = new javax.swing.JButton();
        btnSo3 = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnSo0 = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbHienThi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbHienThi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbHienThi.setText("0");
        lbHienThi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel1.setLayout(new java.awt.GridLayout(4, 4));

        btnSo7.setText("7");
        btnSo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo7);

        btnSo8.setText("8");
        btnSo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo8);

        btnSo9.setText("9");
        btnSo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo9);

        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        jPanel1.add(btnDiv);

        btnSo4.setText("4");
        btnSo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo4);

        btnSo5.setText("5");
        btnSo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo5);

        btnSo6.setText("6");
        btnSo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo6);

        btnMul.setText("X");
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });
        jPanel1.add(btnMul);

        btnSo1.setText("1");
        btnSo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo1);

        btnSo2.setText("2");
        btnSo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo2);

        btnSo3.setText("3");
        btnSo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo3);

        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        jPanel1.add(btnSub);

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel1.add(btnC);

        btnSo0.setText("0");
        btnSo0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo0ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo0);

        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });
        jPanel1.add(btnEqual);

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbHienThi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private long kq = 0;
    String phepToan = "";
    private void tinh(){
        if(phepToan.equals("")){
            kq = Long.parseLong(lbHienThi.getText());
        }else{
            switch (phepToan){
                case "+":
                    kq += Long.parseLong(lbHienThi.getText());
                    break;
                case "-":
                    kq -= Long.parseLong(lbHienThi.getText());
                    break;
                case "*":
                    kq *= Long.parseLong(lbHienThi.getText());
                    break;
                case "/":
                    kq /= Long.parseLong(lbHienThi.getText());
                    break;
                
            }
        }
    }
    private void btnSo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo7ActionPerformed
        // TODO add your handling code here:
        String giatri = this.lbHienThi.getText();
        if (giatri.length()<10){
            if(giatri.equals("0")){
                giatri = "";
            }
            lbHienThi.setText(giatri+ btnSo7.getText());
        }
    }//GEN-LAST:event_btnSo7ActionPerformed

    private void btnSo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo8ActionPerformed
        // TODO add your handling code here:
        String giatri = this.lbHienThi.getText();
        if (giatri.length()<10){
            if(giatri.equals("0")){
                giatri = "";
            }
            lbHienThi.setText(giatri+ btnSo8.getText());
        }
    }//GEN-LAST:event_btnSo8ActionPerformed

    private void btnSo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo9ActionPerformed
        // TODO add your handling code here:
        String giatri = this.lbHienThi.getText();
        if (giatri.length()<10){
            if(giatri.equals("0")){
                giatri = "";
            }
            lbHienThi.setText(giatri+ btnSo9.getText());
        }
    }//GEN-LAST:event_btnSo9ActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        // TODO add your handling code here:
        phepToan = "/";
        tinh();
        //reset lai gia tri
        lbHienThi.setText("0");
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnSo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo4ActionPerformed
        // TODO add your handling code here:
        String giatri = this.lbHienThi.getText();
        if (giatri.length()<10){
            if(giatri.equals("0")){
                giatri = "";
            }
            lbHienThi.setText(giatri+ btnSo4.getText());
        }
    }//GEN-LAST:event_btnSo4ActionPerformed

    private void btnSo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo5ActionPerformed
        // TODO add your handling code here:
        String giatri = this.lbHienThi.getText();
        if (giatri.length()<10){
            if(giatri.equals("0")){
                giatri = "";
            }
            lbHienThi.setText(giatri+ btnSo5.getText());
        }
    }//GEN-LAST:event_btnSo5ActionPerformed

    private void btnSo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo6ActionPerformed
        // TODO add your handling code here:
        String giatri = this.lbHienThi.getText();
        if (giatri.length()<10){
            if(giatri.equals("0")){
                giatri = "";
            }
            lbHienThi.setText(giatri+ btnSo6.getText());
        }
    }//GEN-LAST:event_btnSo6ActionPerformed

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed
        // TODO add your handling code here:
        phepToan = "*";
        tinh();
        //reset lai gia tri
        lbHienThi.setText("0");
    }//GEN-LAST:event_btnMulActionPerformed

    private void btnSo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo1ActionPerformed
        // TODO add your handling code here:
        String giatri = this.lbHienThi.getText();
        if (giatri.length()<10){
            if(giatri.equals("0")){
                giatri = "";
            }
            lbHienThi.setText(giatri+ btnSo1.getText());
        }
    }//GEN-LAST:event_btnSo1ActionPerformed

    private void btnSo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo2ActionPerformed
        // TODO add your handling code here:
        String giatri = this.lbHienThi.getText();
        if (giatri.length()<10){
            if(giatri.equals("0")){
                giatri = "";
            }
            lbHienThi.setText(giatri+ btnSo2.getText());
        }
    }//GEN-LAST:event_btnSo2ActionPerformed

    private void btnSo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo3ActionPerformed
        // TODO add your handling code here:
        String giatri = this.lbHienThi.getText();
        if (giatri.length()<10){
            if(giatri.equals("0")){
                giatri = "";
            }
            lbHienThi.setText(giatri+ btnSo3.getText());
        }
    }//GEN-LAST:event_btnSo3ActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        // TODO add your handling code here:
        phepToan = "-";
        tinh();
        //reset lai gia tri
        lbHienThi.setText("0");
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
        lbHienThi.setText("0");
        kq = 0;
    }//GEN-LAST:event_btnCActionPerformed

    private void btnSo0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo0ActionPerformed
        // TODO add your handling code here:
        String giatri = this.lbHienThi.getText();
        if (giatri.length()<10){
            if(giatri.equals("0")){
                giatri = "";
            }
            lbHienThi.setText(giatri+ btnSo0.getText());
        }
    }//GEN-LAST:event_btnSo0ActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        // TODO add your handling code here:
        tinh();
        lbHienThi.setText(String.valueOf(kq));
        kq = 0;
    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        phepToan = "+";
        tinh();
        //reset lai gia tri
        lbHienThi.setText("0");
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(cau_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cau_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cau_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cau_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cau_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnSo0;
    private javax.swing.JButton btnSo1;
    private javax.swing.JButton btnSo2;
    private javax.swing.JButton btnSo3;
    private javax.swing.JButton btnSo4;
    private javax.swing.JButton btnSo5;
    private javax.swing.JButton btnSo6;
    private javax.swing.JButton btnSo7;
    private javax.swing.JButton btnSo8;
    private javax.swing.JButton btnSo9;
    private javax.swing.JButton btnSub;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbHienThi;
    // End of variables declaration//GEN-END:variables
}
