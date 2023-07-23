/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import DomainModels.ChatLieu;
import DomainModels.ChiTietSP;
import DomainModels.LoaiSP;
import DomainModels.MauSac;
import DomainModels.NSX;
import DomainModels.SanPham;
import DomainModels.Size;
import Services.ChiTietSPServiceImpl;
import Services.LoaiSPService;
import Services.MauSacService;
import Services.SanPhamService;
import Services.SizeService;
import Services.impl.ChiTietSPService;
import Services.impl.SanPhamImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//hjsdjdhf

/**
 *
 * @author ThanhSociu
 *
 */
public class QuanLySanPham extends javax.swing.JFrame {

    /**
     * Creates new form QuanLySanPham
     */
    private DefaultTableModel defaultTableModel;

    private DefaultComboBoxModel dcmms;
    private DefaultComboBoxModel dcmloaisp;
    private DefaultComboBoxModel dcmsanp;
    private DefaultComboBoxModel dcmsize;
    private DefaultComboBoxModel dcmtt;
    private DefaultComboBoxModel dcmcl;
    private DefaultComboBoxModel dcmnsx;
    private DefaultComboBoxModel dcmTT;
    private MauSacService mauSacService = new MauSacService();
    private SizeService sizeService = new SizeService();
    private LoaiSPService loaiSPService = new LoaiSPService();
    private SanPhamService sanPhamService = new SanPhamImpl();
    private ChiTietSPService chiTietSPService = new ChiTietSPServiceImpl();

    public QuanLySanPham() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Hệ Thống Quản Lý  Bán Giày TTN");
        loadDatadssp(chiTietSPService.getAllData());
        loadCbbloaisp(chiTietSPService.getListLoaiSP());
        loadCbbmausac(chiTietSPService.getListMauSac());
        loadCbbsanpham(chiTietSPService.getListSP());
        loadCbbsize(chiTietSPService.getListSize());
        txtid.disable();
        loadCbbCL(chiTietSPService.getListCL());
        loadCbbNsx(chiTietSPService.getListNSX());
       
    }

    public void loadCbbmausac(List<MauSac> list) {
        dcmms = (DefaultComboBoxModel) cbbmsac.getModel();
        for (MauSac mauSac : list) {
            dcmms.addElement(mauSac.getTen());
        }
    }

    public void loadCbbloaisp(List<LoaiSP> list) {
        dcmloaisp = (DefaultComboBoxModel) cbbloaisp.getModel();
        for (LoaiSP loaiSP : list) {
            dcmloaisp.addElement(loaiSP.getTen());
        }
    }

    public void loadCbbsize(List<Size> list) {
        dcmsize = (DefaultComboBoxModel) cbbsize.getModel();
        for (Size size : list) {
            dcmsize.addElement(size.getTen());
        }
    }

    public void loadCbbsanpham(ArrayList<SanPham> list) {
        dcmsanp = (DefaultComboBoxModel) cbbsp.getModel();
        for (SanPham sanPham : list) {
            dcmsanp.addElement(sanPham.getTen());
        }
    }

    public void loadCbbNsx(List<NSX> list) {
        dcmnsx = (DefaultComboBoxModel) cbbNsx.getModel();
        for (NSX nsx : list) {
            dcmnsx.addElement(nsx.getTen());
        }
    }

    public void loadCbbCL(List<ChatLieu> list) {
        dcmcl = (DefaultComboBoxModel) cbbChatLieu.getModel();
        for (ChatLieu cl : list) {
            dcmcl.addElement(cl.getTen());
        }
    }
    

    public void loadDatadssp(List<ChiTietSP> list) {
        defaultTableModel = (DefaultTableModel) tblctsp.getModel();
        defaultTableModel.setRowCount(0);
        for (ChiTietSP chiTietSP : list) {
            try {
                defaultTableModel.addRow(new Object[]{
                    chiTietSP.getId(),
                    chiTietSP.getIdMauSac().getTen(),
                    chiTietSP.getIdLoaiSP().getTen(),
                    chiTietSP.getIdMauSac().getTen(),
                    chiTietSP.getIdSize().getTen(),
                    chiTietSP.getNamBH(),
                    chiTietSP.getSoLuongTon(),
                    chiTietSP.getMoTa(),
                    chiTietSP.getGiaNhap(),
                    chiTietSP.getGiaBan(),
                    chiTietSP.getIdChatLieu().getTen(),
                    chiTietSP.getIdNhaSanXuat().getTen(),
                    chiTietSP.getTT()

                });
            } catch (Exception e) {
            }
        }

    }

    public boolean checkdl() {
        if (txtnambh.getText().isEmpty()) {
            txtnambh.setText("Năm BH không được để trống");
            return false;
        } else if (txtnambh.getText().matches("[0-9]+") == false) {
            txtnambh.setText("Năm BH phải là số");
            return false;
        } else if (txtmota.getText().isEmpty()) {
            txtmota.setText("Mô tả không được để trống");
            return false;
        } else if (txtmota.getText().matches("[a-z A-Z]+") == false) {
            txtmota.setText("Mô tả phải là chữ");
            return false;
        } else if (txtsoluong.getText().isEmpty()) {
            txtsoluong.setText("Số lượng tồn không được để trống");
            return false;
        } else if (txtsoluong.getText().matches("[0-9]+") == false) {
            txtsoluong.setText("Số lượng tồn phải là số");
            return false;
        } else if (txtgianhap.getText().isEmpty()) {
            txtgianhap.setText("Gía nhập không được để trống");
            return false;
        } else if (txtgianhap.getText().matches("[0-9]+") == false) {
            txtgianhap.setText("Gía nhập phải là số");
            return false;
        } else if (txtgiaban.getText().isEmpty()) {
            txtgiaban.setText("Gía bán không được để trống");
            return false;
        } else if (txtgiaban.getText().matches("[0-9]+") == false) {
            txtgiaban.setText("Gía bán phải là số");
            return false;
        }
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

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnlammoi = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cbbtt = new javax.swing.JComboBox<>();
        txtgiaban = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtgianhap = new javax.swing.JTextField();
        cbbloaisp = new javax.swing.JComboBox<>();
        cbbsize = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtnambh = new javax.swing.JTextField();
        txtsoluong = new javax.swing.JTextField();
        txtmota = new javax.swing.JTextField();
        cbbsp = new javax.swing.JComboBox<>();
        cbbmsac = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cbbChatLieu = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbbNsx = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblctsp = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnAnSP = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel11.setText("Sản Phẩm");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Quản Lý Sản Phẩm");

        jLabel2.setText("Tìm kiếm");

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnlammoi.setText("Mới");
        btnlammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoiActionPerformed(evt);
            }
        });

        jButton5.setText("<=");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("<<");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText(">>");

        jButton8.setText("=>");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setText("Trạng Thái");

        cbbtt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tạm Ngưng", "Đang Hoạt Động" }));

        jLabel16.setText("Giá Nhập");

        jLabel18.setText("Giá Bán");

        jLabel19.setText("Loại SP");

        jLabel20.setText("Size");

        jLabel14.setText("Sản Phẩm");

        jLabel21.setText("Số Lượng Tồn");

        jLabel22.setText("Mô Tả");

        jLabel9.setText("Màu Sắc");

        jLabel23.setText("Năm BH");

        jLabel17.setText("ID");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jLabel24.setText("Chất Liệu");

        jLabel10.setText("NSX");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel19)
                                .addComponent(jLabel20)
                                .addComponent(jLabel17))
                            .addGap(24, 24, 24)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbbsize, 0, 320, Short.MAX_VALUE)
                                .addComponent(cbbloaisp, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtgiaban)
                                .addComponent(txtid)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbbtt, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtgianhap))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(cbbChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbbmsac, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbsp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnambh, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(cbbNsx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtsoluong)
                                .addGap(126, 126, 126)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbmsac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnambh, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbloaisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblctsp.setBackground(new java.awt.Color(204, 204, 204));
        tblctsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Sản Phẩm", "Loại SP", "Màu Sắc", "Size", "Năm BH", "Số Lượng Tồn", "Mô Tả", "Giá Nhập", "Giá Bán", "Chất Liệu", "NSX", "Trạng Thái"
            }
        ));
        tblctsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblctspMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblctsp);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1406, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
        );

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnAnSP.setText("Ẩn SP");
        btnAnSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnSPActionPerformed(evt);
            }
        });

        jButton1.setText("Xem Sp An");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Làm Mới Table");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Them");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(589, 589, 589))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jButton3)
                .addGap(27, 27, 27)
                .addComponent(btnsua)
                .addGap(52, 52, 52)
                .addComponent(btnxoa)
                .addGap(48, 48, 48)
                .addComponent(btnlammoi)
                .addGap(55, 55, 55)
                .addComponent(btnAnSP)
                .addGap(83, 83, 83)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(53, 53, 53)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnTimKiem)
                        .addGap(984, 984, 984))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem)
                    .addComponent(btnTimKiem))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnsua)
                                    .addComponent(btnxoa)
                                    .addComponent(btnlammoi)
                                    .addComponent(jButton5)
                                    .addComponent(jButton6)
                                    .addComponent(jButton7)
                                    .addComponent(jButton8)
                                    .addComponent(btnAnSP)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jButton2)))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:

        if (checkdl()) {
            int r = tblctsp.getSelectedRow();
            ChiTietSP ctsp = new ChiTietSP();
            ctsp.setIdLoaiSP((LoaiSP) cbbloaisp.getSelectedItem());
            ctsp.setIdSanPham((SanPham) cbbsp.getSelectedItem());
            ctsp.setIdSize((Size) cbbsize.getSelectedItem());
            ctsp.setIdMauSac((MauSac) cbbmsac.getSelectedItem());
            ctsp.setMoTa(txtmota.getText());
            ctsp.setSoLuongTon(Integer.valueOf(txtsoluong.getText()));
            ctsp.setNamBH(Integer.valueOf(txtnambh.getText()));
            ctsp.setGiaNhap(BigDecimal.valueOf(Double.valueOf(txtgianhap.getText())));
            ctsp.setGiaBan(BigDecimal.valueOf(Double.valueOf(txtgiaban.getText())));
            ctsp.setIdChatLieu((ChatLieu) cbbmsac.getSelectedItem());
            ctsp.setIdNhaSanXuat((NSX) cbbmsac.getSelectedItem());
            String result = chiTietSPService.update(ctsp);
            JOptionPane.showMessageDialog(this, result);
            loadDatadssp(chiTietSPService.getAllData());
        }

    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        int r = tblctsp.getSelectedRow();
        String id = tblctsp.getValueAt(r, 0).toString();
     JOptionPane.showMessageDialog(this,    chiTietSPService.delete(id));
        
        loadDatadssp(chiTietSPService.getAllData());
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnlammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoiActionPerformed
        // TODO add your handling code here:
       lamMoi();
    }//GEN-LAST:event_btnlammoiActionPerformed

    public void lamMoi(){
         int r = tblctsp.getSelectedRow();
        txtid.setText("");
        txtgiaban.setText("");
        txtgianhap.setText("");
        txtmota.setText("");
        txtnambh.setText("");
        txtsoluong.setText("");
        cbbloaisp.setSelectedIndex(0);
        cbbmsac.setSelectedIndex(0);
        cbbsize.setSelectedIndex(0);
        cbbsp.setSelectedIndex(0);
    }
    private void tblctspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblctspMouseClicked
        // TODO add your handling code here:
        int index = tblctsp.getSelectedRow();
        ChiTietSP ctsp = chiTietSPService.getAllData().get(index);
        txtid.setText(String.valueOf(ctsp.getId()));
        txtgiaban.setText(String.valueOf(ctsp.getGiaBan()));
        cbbsize.setSelectedItem(ctsp.getIdSize().getTen());
        cbbloaisp.setSelectedItem(ctsp.getIdLoaiSP().getTen().toString());
        cbbmsac.setSelectedItem(ctsp.getIdMauSac().getTen().toString());
        cbbsp.setSelectedItem(ctsp.getIdSanPham().getTen().toString());
        cbbChatLieu.setSelectedItem(ctsp.getIdChatLieu().getTen().toString());
        cbbNsx.setSelectedItem(ctsp.getIdNhaSanXuat().getTen().toString());
        txtnambh.setText(String.valueOf(ctsp.getNamBH()));
        txtsoluong.setText(String.valueOf(ctsp.getSoLuongTon()));
        txtmota.setText(ctsp.getMoTa());
        txtgianhap.setText(String.valueOf(ctsp.getGiaNhap()));
        cbbtt.setSelectedItem(ctsp.getTrangThai());
    }//GEN-LAST:event_tblctspMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        
        
 
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnAnSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnSPActionPerformed
        // TODO add your handling code here:
        
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn ẩn sản phẩm này không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            if (chiTietSPService.anSanPham(txtid.getText() ,0)) {
                loadDatadssp(chiTietSPService.getAllData());
                lamMoi();
                JOptionPane.showMessageDialog(this, "Ẩn thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Ẩn thất bại");
            }
        }
    }//GEN-LAST:event_btnAnSPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new XemSanPhamAn().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // TODO add your handling code here:
        loadDatadssp(chiTietSPService.getAllData());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (checkdl()) {
            ChiTietSP ctsp = new ChiTietSP();
            ctsp.setIdLoaiSP((LoaiSP) cbbloaisp.getSelectedItem());
            ctsp.setIdSanPham((SanPham) cbbsp.getSelectedItem());
            ctsp.setIdSize((Size) cbbsize.getSelectedItem());
            ctsp.setIdMauSac((MauSac) cbbmsac.getSelectedItem());
            ctsp.setMoTa(txtmota.getText());
            ctsp.setSoLuongTon(Integer.valueOf(txtsoluong.getText()));
            ctsp.setNamBH(Integer.valueOf(txtnambh.getText()));
            ctsp.setGiaNhap(BigDecimal.valueOf(Double.valueOf(txtgianhap.getText())));
            ctsp.setGiaBan(BigDecimal.valueOf(Double.valueOf(txtgiaban.getText())));
            ctsp.setIdChatLieu((ChatLieu) cbbmsac.getSelectedItem());
            ctsp.setIdNhaSanXuat((NSX) cbbmsac.getSelectedItem());
            String result = chiTietSPService.add(ctsp);
            JOptionPane.showMessageDialog(this, result);
            loadDatadssp(chiTietSPService.getAllData());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLySanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLySanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnSP;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnlammoi;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbbChatLieu;
    private javax.swing.JComboBox<String> cbbNsx;
    private javax.swing.JComboBox<String> cbbloaisp;
    private javax.swing.JComboBox<String> cbbmsac;
    private javax.swing.JComboBox<String> cbbsize;
    private javax.swing.JComboBox<String> cbbsp;
    private javax.swing.JComboBox<String> cbbtt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblctsp;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtgiaban;
    private javax.swing.JTextField txtgianhap;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmota;
    private javax.swing.JTextField txtnambh;
    private javax.swing.JTextField txtsoluong;
    // End of variables declaration//GEN-END:variables
}
