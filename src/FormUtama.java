/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DONI SETIAWAN
 */
public class FormUtama extends javax.swing.JFrame {

    /**
     * Creates new form FormUtama
     */
    public FormUtama() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_File = new javax.swing.JMenu();
        Menu_FormData = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Menu_LogOut = new javax.swing.JMenuItem();
        Menu_About = new javax.swing.JMenu();
        Menu_Info = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        Menu_File.setText("File");

        Menu_FormData.setText("Form Data");
        Menu_FormData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_FormDataActionPerformed(evt);
            }
        });
        Menu_File.add(Menu_FormData);
        Menu_File.add(jSeparator1);

        Menu_LogOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Menu_LogOut.setText("Log Out");
        Menu_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_LogOutActionPerformed(evt);
            }
        });
        Menu_File.add(Menu_LogOut);

        jMenuBar1.add(Menu_File);

        Menu_About.setText("About");

        Menu_Info.setText("Info");
        Menu_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_InfoActionPerformed(evt);
            }
        });
        Menu_About.add(Menu_Info);

        jMenuBar1.add(Menu_About);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_FormDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_FormDataActionPerformed
        // TODO add your handling code here:
        FormData Fdata = new FormData();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Fdata);
        Fdata.setVisible(true);
    }//GEN-LAST:event_Menu_FormDataActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(FormUtama.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void Menu_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_InfoActionPerformed
        // TODO add your handling code here:
        FormInfo Finfo = new FormInfo();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Finfo);
        Finfo.setVisible(true);
    }//GEN-LAST:event_Menu_InfoActionPerformed

    private void Menu_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_LogOutActionPerformed
        // TODO add your handling code here:
        FormLogin login = new FormLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Menu_LogOutActionPerformed

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
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu_About;
    private javax.swing.JMenu Menu_File;
    private javax.swing.JMenuItem Menu_FormData;
    private javax.swing.JMenuItem Menu_Info;
    private javax.swing.JMenuItem Menu_LogOut;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
