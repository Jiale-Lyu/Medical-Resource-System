/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.doctor;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Jiale Lyu
 */
public class DoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorJPanel
     */
    JPanel mainWorkArea;
    public DoctorJPanel(JPanel mainWorkArea) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        lblWelcome.setText("Welcome to Doctor Page!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        menuBar = new javax.swing.JPanel();
        btnEncounter = new javax.swing.JButton();
        btnManageProfile = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        menuBar.setBackground(new java.awt.Color(255, 255, 255));

        btnEncounter.setText("Encounter");
        btnEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncounterActionPerformed(evt);
            }
        });

        btnManageProfile.setText("Manage Profile");
        btnManageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProfileActionPerformed(evt);
            }
        });

        lblWelcome.setText("<WelcomeMsg>");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEncounter)
                .addGap(19, 19, 19)
                .addComponent(btnManageProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEncounter)
                    .addComponent(btnManageProfile)
                    .addComponent(lblWelcome)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        jSplitPane1.setTopComponent(menuBar);

        workArea.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workArea);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncounterActionPerformed
        EncounterJPanel panel = new EncounterJPanel(workArea);
        workArea.add("EncounterJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        

    }//GEN-LAST:event_btnEncounterActionPerformed

    private void btnManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProfileActionPerformed
        ProfileJPanel panel = new ProfileJPanel(workArea);
        workArea.add("ProfileJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);

    }//GEN-LAST:event_btnManageProfileActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
//        LoginJPanel loginPanel = (LoginJPanel) component;
//        loginPanel.populateSupplierCombo();
        
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEncounter;
    private javax.swing.JButton btnManageProfile;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel menuBar;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}