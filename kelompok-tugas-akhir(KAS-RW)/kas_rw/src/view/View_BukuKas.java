/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller_Buku;
import javax.swing.JTable;

/**
 *
 * @author naufa
 */
public class View_BukuKas extends javax.swing.JInternalFrame {
    
    public static Controller_Buku cb;
    /**
     * Creates new form View_BukuKas
     */
    public View_BukuKas() {
        initComponents();
        cb = new Controller_Buku(this);
        cb.refreshTable("date");
    }

    public JTable getTable_kas() {
        return table_kas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_kas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_byName = new javax.swing.JButton();
        btn_byDate = new javax.swing.JButton();
        btn_byHouse = new javax.swing.JButton();
        btn_byRt = new javax.swing.JButton();
        btn_byMoney = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buku Kas");

        table_kas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(table_kas);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Filter");

        btn_byName.setText("By Nama");
        btn_byName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_byNameActionPerformed(evt);
            }
        });

        btn_byDate.setText("By Tanggal");
        btn_byDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_byDateActionPerformed(evt);
            }
        });

        btn_byHouse.setText("By Rumah");
        btn_byHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_byHouseActionPerformed(evt);
            }
        });

        btn_byRt.setText("By RT");
        btn_byRt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_byRtActionPerformed(evt);
            }
        });

        btn_byMoney.setText("By Uang");
        btn_byMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_byMoneyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_byDate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_byName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_byHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_byRt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_byMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_byName)
                        .addComponent(btn_byHouse)
                        .addComponent(btn_byRt)
                        .addComponent(btn_byDate)
                        .addComponent(btn_byMoney)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_byNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_byNameActionPerformed
        cb.refreshTable("name");
    }//GEN-LAST:event_btn_byNameActionPerformed

    private void btn_byDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_byDateActionPerformed
        cb.refreshTable("date");
    }//GEN-LAST:event_btn_byDateActionPerformed

    private void btn_byHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_byHouseActionPerformed
        cb.refreshTable("house");
    }//GEN-LAST:event_btn_byHouseActionPerformed

    private void btn_byRtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_byRtActionPerformed
        cb.refreshTable("rt");
    }//GEN-LAST:event_btn_byRtActionPerformed

    private void btn_byMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_byMoneyActionPerformed
        cb.refreshTable("money");
    }//GEN-LAST:event_btn_byMoneyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_byDate;
    private javax.swing.JButton btn_byHouse;
    private javax.swing.JButton btn_byMoney;
    private javax.swing.JButton btn_byName;
    private javax.swing.JButton btn_byRt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_kas;
    // End of variables declaration//GEN-END:variables
}