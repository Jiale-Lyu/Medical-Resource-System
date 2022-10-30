/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package ui.admin;

//import model.SupplierDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import model.DoctorDirectory;
import model.PatientDirectory;
import ui.LoginJPanel;
import ui.community.CommunityJPanel;
import ui.doctor.DoctorJPanel;
import ui.hospital.HospitalAdminJPanel;
import ui.patient.PatientJPanel;

/**
 *
 * @author  Rushabh
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    JPanel mainWorkArea;
    DoctorDirectory doctorDirectory;
    PatientDirectory patientDirectory;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel mainWorkArea, DoctorDirectory doctorDirectory, PatientDirectory patientDirectory) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.doctorDirectory = doctorDirectory;
        this.patientDirectory = patientDirectory;
        lblWelcome.setText("Welcome to System Admin!");
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        menuBar = new javax.swing.JPanel();
        btnManageSuppliers = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        workArea = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnDoctor = new javax.swing.JButton();
        btnPatient = new javax.swing.JButton();
        btnCommunity = new javax.swing.JButton();
        btnHospital = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        splitPane.setDividerLocation(50);
        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        menuBar.setBackground(new java.awt.Color(255, 255, 255));

        btnManageSuppliers.setText("Manage Suppliers");
        btnManageSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliersActionPerformed(evt);
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        lblWelcome.setText("<WelcomeMsg>");

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                .addComponent(btnManageSuppliers)
                .addGap(19, 19, 19)
                .addComponent(btnLogOut)
                .addGap(46, 46, 46))
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageSuppliers)
                    .addComponent(btnLogOut)
                    .addComponent(lblWelcome))
                .addContainerGap())
        );

        splitPane.setTopComponent(menuBar);

        workArea.setBackground(new java.awt.Color(255, 255, 255));
        workArea.setLayout(new java.awt.CardLayout());

        btnDoctor.setText("Doctor");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        btnPatient.setText("Patient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        btnCommunity.setText("Community Admin");
        btnCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityActionPerformed(evt);
            }
        });

        btnHospital.setText("Hospital Admin");
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCommunity)
                    .addComponent(btnDoctor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPatient, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHospital, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoctor)
                    .addComponent(btnPatient))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCommunity)
                    .addComponent(btnHospital))
                .addContainerGap(300, Short.MAX_VALUE))
        );

        workArea.add(jPanel1, "card2");

        splitPane.setRightComponent(workArea);

        add(splitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliersActionPerformed
        // TODO add your handling code here:
//        ManageSuppliers panel = new ManageSuppliers(workArea, supplierDirectory);
//        workArea.add("ManageSupplierAdministrative", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
     
    }//GEN-LAST:event_btnManageSuppliersActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
//        LoginJPanel loginPanel = (LoginJPanel) component;
//        loginPanel.populateSupplierCombo();
        
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
 
                
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
       DoctorJPanel doctorJPanel = new DoctorJPanel(mainWorkArea);
       mainWorkArea.add("doctorJPanel", doctorJPanel);
       CardLayout layout = (CardLayout) mainWorkArea.getLayout();
       layout.next(mainWorkArea);
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
       PatientJPanel patientJPanel = new PatientJPanel(mainWorkArea);
       mainWorkArea.add("patientJPanel", patientJPanel);
       CardLayout layout = (CardLayout) mainWorkArea.getLayout();
       layout.next(mainWorkArea);
    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityActionPerformed
       CommunityJPanel communityJPanel = new CommunityJPanel(mainWorkArea);
       mainWorkArea.add("communityJPanel", communityJPanel);
       CardLayout layout = (CardLayout) mainWorkArea.getLayout();
       layout.next(mainWorkArea);
    }//GEN-LAST:event_btnCommunityActionPerformed

    private void btnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalActionPerformed
        HospitalAdminJPanel hospitalAdminJPanel = new HospitalAdminJPanel(mainWorkArea, doctorDirectory, patientDirectory);
       mainWorkArea.add("hospitalJPanel", hospitalAdminJPanel);
       CardLayout layout = (CardLayout) mainWorkArea.getLayout();
       layout.next(mainWorkArea);
    }//GEN-LAST:event_btnHospitalActionPerformed

    @Override
    public String toString(){
        return "Administrator";
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommunity;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnHospital;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManageSuppliers;
    private javax.swing.JButton btnPatient;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel menuBar;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
    
}
