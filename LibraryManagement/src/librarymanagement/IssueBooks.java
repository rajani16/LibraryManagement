/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rajani
 */
public class IssueBooks extends javax.swing.JFrame {

    /**
     * Creates new form IssueBooks
     */
    public IssueBooks() {
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
        BackIssue = new javax.swing.JLabel();
        saveIssue = new javax.swing.JLabel();
        bookid2 = new javax.swing.JTextField();
        studentid2 = new javax.swing.JTextField();
        issuedate2 = new javax.swing.JTextField();
        duedate2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagement/Issue books.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        BackIssue.setText("jLabel2");
        BackIssue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackIssueMouseClicked(evt);
            }
        });
        getContentPane().add(BackIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 390, 60, 20));

        saveIssue.setText("jLabel2");
        saveIssue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveIssueMouseClicked(evt);
            }
        });
        getContentPane().add(saveIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 385, 80, 30));

        bookid2.setBackground(new java.awt.Color(193, 193, 224));
        getContentPane().add(bookid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 130, 370, -1));

        studentid2.setBackground(new java.awt.Color(193, 193, 224));
        getContentPane().add(studentid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 190, 370, -1));

        issuedate2.setBackground(new java.awt.Color(193, 193, 224));
        getContentPane().add(issuedate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 250, 370, -1));

        duedate2.setBackground(new java.awt.Color(193, 193, 224));
        getContentPane().add(duedate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 310, 370, -1));

        setSize(new java.awt.Dimension(916, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i=0.0; i<=1.0; i=0.1+i)
        {
         String val = i+"";
         float f =Float.valueOf(val);
         this.setOpacity(f);
         try
         {
             Thread.sleep(50);
         }
         catch(InterruptedException e)
                 {
                     
                 }
        }
    }//GEN-LAST:event_formWindowOpened

    private void BackIssueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackIssueMouseClicked
        new FrontPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackIssueMouseClicked

    private void saveIssueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveIssueMouseClicked
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement", "root", "");
            Statement stmt = (Statement) con.createStatement();
            String query = "insert into issuebooks (BookID, StudentID, IssueDate, DueDate) values ('"+bookid2.getText()+"', '"+studentid2.getText()+"', '"+issuedate2.getText()+"', '"+duedate2.getText()+"')";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data successfullly inserted");
                       
        }
        catch(HeadlessException | ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" +ex);
        }
    }//GEN-LAST:event_saveIssueMouseClicked

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
            java.util.logging.Logger.getLogger(IssueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new IssueBooks().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackIssue;
    private javax.swing.JTextField bookid2;
    private javax.swing.JTextField duedate2;
    private javax.swing.JTextField issuedate2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel saveIssue;
    private javax.swing.JTextField studentid2;
    // End of variables declaration//GEN-END:variables
}

