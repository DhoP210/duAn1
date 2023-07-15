/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import DomainModels.ChatLieu;
import Services.ChatLieuService;
import java.awt.Color;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class ChatLieuView extends javax.swing.JFrame {

    private ChatLieuService chatLieuService = new ChatLieuService();
    private DefaultTableModel dtm;

    /**
     * Creates new form ChatLieuView
     */
    public ChatLieuView() {
        initComponents();
        setTitle("Chất liệu");
        dtm = (DefaultTableModel) tblTable.getModel();
        String[] header = {"ID", "Mã", "Tên"};
        dtm.setColumnIdentifiers(header);
        loadTable(chatLieuService.getAll());
    }

    public void loadTable(List<ChatLieu> chatLieus) {
        dtm.setRowCount(0);
        for (ChatLieu chatLieu : chatLieus) {
            Object[] load = new Object[]{
                chatLieu.getId(),
                chatLieu.getMa(),
                chatLieu.getTen()
            };
            dtm.addRow(load);
        }
    }

    public boolean check() {
        String check = "[a-zA-Z0-9 ]+";
        if (txtMa.getText().isEmpty()) {
            txtMa.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Trống mã");
            return false;
        } else if (false == txtMa.getText().matches(check)) {
            txtMa.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Mã không được chứa ký tự đặc biệt");
            return false;
        }
//        String ma = txtMa.getText();
//        List<ChatLieu> chatLieus = chatLieuService.getAll();
//        for (ChatLieu chatLieu : chatLieus) {
//            if (chatLieu.getMa().equalsIgnoreCase(ma)) {
//                txtMa.setBackground(Color.red);
//                JOptionPane.showMessageDialog(this, "Mã đã tồn tại");
//                return false;
//            }
//        }

        if (txtTen.getText().isEmpty()) {
            txtTen.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Trống tên");
            return false;
        } 
//        else if (false == txtTen.getText().matches(check)) {
//            txtTen.setBackground(Color.red);
//            JOptionPane.showMessageDialog(this, "Tên không được chứa ký tự đặc biệt");
//            return false;
//        }
        txtMa.setBackground(Color.white);
        txtTen.setBackground(Color.white);
        return true;
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
        txtMa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã");

        jLabel2.setText("Tên");

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTable);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel3.setText("Id");

        txtId.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        ChatLieu chatLieu = new ChatLieu();
        chatLieu.setMa(txtMa.getText());
        chatLieu.setTen(txtTen.getText());

        if (check()) {
            int error = JOptionPane.showConfirmDialog(this, "Cảnh báo", "Bạn chắc chắn muốn thêm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_OPTION);
            if (error == JOptionPane.YES_OPTION) {
                boolean add = chatLieuService.add(chatLieu);
                if (add == true) {

                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                    loadTable(chatLieuService.getAll());
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm thất bại");
                }
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTableMouseClicked
        // TODO add your handling code here:
        int index = tblTable.getSelectedRow();
        ChatLieu chatLieu = chatLieuService.getAll().get(index);
        txtId.setText(tblTable.getValueAt(index, 0).toString());
        txtMa.setText(tblTable.getValueAt(index, 1).toString());
        txtTen.setText(tblTable.getValueAt(index, 2).toString());
    }//GEN-LAST:event_tblTableMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int index = tblTable.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng để sửa");
            return;
        }
        ChatLieu chatLieu = new ChatLieu();
        chatLieu.setId(UUID.fromString(txtId.getText()));
        chatLieu.setMa(txtMa.getText());
        chatLieu.setTen(txtTen.getText());

        if (check()) {
            int error = JOptionPane.showConfirmDialog(this, "Cảnh báo", "Bạn chắc chắn muốn Sửa", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_OPTION);
            if (error == JOptionPane.YES_OPTION) {
                boolean update = chatLieuService.update(chatLieu);
                if (update == true) {
                    JOptionPane.showMessageDialog(this, "Sửa thành công");
                    loadTable(chatLieuService.getAll());
                } else {
                    JOptionPane.showMessageDialog(this, "Sửa thất bại");
                }
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int index = tblTable.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng để xóa");
            return;
        }
        ChatLieu chatLieu = new ChatLieu();
        chatLieu.setId(UUID.fromString(txtId.getText()));

        boolean delete = chatLieuService.delete(chatLieu);
        if (delete == true) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loadTable(chatLieuService.getAll());
        } else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }

    }//GEN-LAST:event_btnXoaActionPerformed

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
            java.util.logging.Logger.getLogger(ChatLieuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatLieuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatLieuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatLieuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatLieuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}