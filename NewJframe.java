public class NewJFrame extends javax.swing.JFrame {
public NewJFrame() {
        initComponents();
    }
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int tot = Integer.parseInt(jTextField7.getText());
        
        int per = tot/5;
        
        jTextField8.setText(""+per);
    }
private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
    }
private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }
private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double per = Double.parseDouble(jTextField8.getText());
        
        char Grade;
        
        if (per >= 90)
            Grade = 'A';
        else
            if (per >= 70)
                Grade = 'B';
            else
                if (per >= 50)
                    Grade = 'C';
                else
                    if (per >= 33)
                        Grade = 'D';
                    else
                        Grade = 'F';
        
        jTextField9.setText(""+Grade);
    }
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int eng = Integer.parseInt(jTextField2.getText());
        int mat = Integer.parseInt(jTextField3.getText());
        int oops = Integer.parseInt(jTextField4.getText());
        int ds = Integer.parseInt(jTextField5.getText());
        int ite = Integer.parseInt(jTextField6.getText());
        
        int tot = eng+mat+oops+ds+ite;
        
        jTextField7.setText(""+tot);
    }
public static void main(String args[]) {
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration                   
}
