/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.ChiTietChuongTrinhGiamGiaBUS;
import BUS.ChiTietHoaDonBUS;
import BUS.ChuongTrinhGiamGiaBUS;
import BUS.HoaDonBUS;
import BUS.KhachHangBUS;
import BUS.SanPhamBUS;
import DTO.ChiTietChuongTrinhGiamGiaDTO;
import DTO.ChiTietHoaDonDTO;
import DTO.ChuongTrinhGiamGiaDTO;
import DTO.HoaDonDTO;
import DTO.KhachHangDTO;
import DTO.NhanVienDTO;
import DTO.SQLConnection;
import DTO.SanPhamDTO;
import com.mysql.cj.protocol.Message;
import java.awt.event.ActionEvent;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Quoc Huy
 */
public class ThanhToan_HoaDon extends javax.swing.JPanel {

    /**
     * Creates new form ThanhToan_HoaDon
     */
    public ThanhToan_HoaDon(NhanVienDTO nhanVien, List<SanPhamDTO> dsSanPham, KhachHangDTO khachHang, List<SanPhamDTO> dsspkho) throws SQLException, ParseException {
        nv = nhanVien;
        giohang = (ArrayList<SanPhamDTO>) dsSanPham;
        kh = khachHang;
        this.dsspkho = dsspkho;
        initComponents();
        setThongTin();
    }
    private NhanVienDTO nv;
    private ArrayList<SanPhamDTO> giohang;
    private List<SanPhamDTO> dsspkho;
    private KhachHangDTO kh;
    int sotienduocgiam = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_IDHoaDOn = new javax.swing.JFormattedTextField();
        txt_NgayTao = new javax.swing.JFormattedTextField();
        txt_IDNV = new javax.swing.JFormattedTextField();
        txt_TenKH = new javax.swing.JFormattedTextField();
        txt_SDT = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txt_TongTienSanPham = new javax.swing.JFormattedTextField();
        btn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_SoTienGiamGia = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_tongTienHoaDon = new javax.swing.JFormattedTextField();

        setPreferredSize(new java.awt.Dimension(740, 740));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/QRthanhtoan (2).jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Hóa đơn");

        jLabel3.setText("Số HD");

        jLabel4.setText("Ngày tạo");

        jLabel5.setText("ID Nhân viên");

        jLabel7.setText("SDT");

        jLabel8.setText("Tên khách hàng");

        txt_NgayTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NgayTaoActionPerformed(evt);
            }
        });

        txt_IDNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDNVActionPerformed(evt);
            }
        });

        txt_SDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SDTActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên", "Số lượng", "Giá", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Số tiền được giảm");

        txt_TongTienSanPham.setForeground(new java.awt.Color(255, 153, 153));
        txt_TongTienSanPham.setText("000000");
        txt_TongTienSanPham.setCaretColor(new java.awt.Color(153, 255, 153));
        txt_TongTienSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_TongTienSanPham.setSelectedTextColor(new java.awt.Color(204, 204, 0));
        txt_TongTienSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TongTienSanPhamActionPerformed(evt);
            }
        });

        btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn.setText("Hoàn tất");
        btn.setActionCommand("Thanh toán hoàn tất");
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMouseClicked(evt);
            }
        });
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Tổng tiền sản phẩm");

        txt_SoTienGiamGia.setForeground(new java.awt.Color(255, 153, 153));
        txt_SoTienGiamGia.setText("000000");
        txt_SoTienGiamGia.setCaretColor(new java.awt.Color(153, 255, 153));
        txt_SoTienGiamGia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_SoTienGiamGia.setSelectedTextColor(new java.awt.Color(204, 204, 0));
        txt_SoTienGiamGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SoTienGiamGiaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Tổng hóa đơn");

        txt_tongTienHoaDon.setForeground(new java.awt.Color(255, 153, 153));
        txt_tongTienHoaDon.setText("000000");
        txt_tongTienHoaDon.setCaretColor(new java.awt.Color(153, 255, 153));
        txt_tongTienHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_tongTienHoaDon.setSelectedTextColor(new java.awt.Color(204, 204, 0));
        txt_tongTienHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tongTienHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                        .addGap(89, 89, 89))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel3))
                                                .addGap(31, 31, 31))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(12, 12, 12)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_IDNV, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                            .addComponent(txt_NgayTao, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_IDHoaDOn, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_TenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(txt_SDT)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_TongTienSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_SoTienGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_tongTienHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_IDHoaDOn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_NgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_IDNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_SoTienGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn)
                            .addComponent(txt_TongTienSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tongTienHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 157, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_IDNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDNVActionPerformed

    private void txt_NgayTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NgayTaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NgayTaoActionPerformed

    private void txt_TongTienSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TongTienSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TongTienSanPhamActionPerformed

    private void txt_SDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SDTActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActionPerformed
    Map<Integer, Integer> idQuantityMap = new HashMap<>();

    public void thanhtoanbtn() throws SQLException {
        SanPhamBUS sanphamBUS = new SanPhamBUS();
        for (SanPhamDTO spdto : dsspkho) {
            for (Map.Entry<Integer, Integer> entry : idQuantityMap.entrySet()) {
                int id = entry.getKey();
                int totalQuantity = entry.getValue();
                if (spdto.getIdSP() == id) {
                    spdto.setSoLuongSpConLai(spdto.getSoLuongSpConLai() - totalQuantity);
                    try {
                        sanphamBUS.capNhat(spdto);
                    } catch (SQLException ex) {
                        Logger.getLogger(ThanhToan_HoaDon.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        HoaDonBUS hoaDonBUS = new HoaDonBUS();
        ChiTietHoaDonBUS chiTietHoaDonBUS = new ChiTietHoaDonBUS();
        KhachHangBUS khachHangBUS = new KhachHangBUS();
        HoaDonDTO hoaDonDTO;
        hoaDonDTO = new HoaDonDTO(1, Integer.parseInt(txt_tongTienHoaDon.getText()),
                sotienduocgiam, txt_NgayTao.getText(), Integer.parseInt(txt_IDNV.getText()), Integer.parseInt(txt_SDT.getText()));
        System.out.println(hoaDonDTO.toString());
        try {
            if (khachHangBUS.timKiem(Integer.parseInt(txt_SDT.getText())) == null) {
                KhachHangDTO khachHangDTO = new KhachHangDTO(1, (txt_SDT.getText()), txt_TenKH.getText(), 1);
                System.out.println(khachHangDTO.toString());

                try {
                    khachHangBUS.them(khachHangDTO);
                } catch (SQLException ex) {
                    System.out.println(" loi khi them khach hang: " + ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThanhToan_HoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            hoaDonBUS.them(hoaDonDTO);
        } catch (SQLException ex) {
            System.out.println(" loi khi them hoa don: " + ex);
        }
        int idhd = Integer.parseInt(txt_IDHoaDOn.getText());
        for (SanPhamDTO sp : giohang) {
            ChiTietHoaDonDTO cthd = new ChiTietHoaDonDTO(1, sp.getDonGia(), sp.getSoLuongSpConLai(), sp.getDonGia() * sp.getSoLuongSpConLai(), idhd);
            System.out.println(cthd.toString());
            try {
                chiTietHoaDonBUS.them(cthd);
            } catch (SQLException ex) {
                System.out.println(" loi khi them chi tiet: " + ex);
            }
        }
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);

        frame.dispose();
    }

    public void inAn() throws PrinterException {

        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new InvoicePrinter(txt_IDHoaDOn.getText(), txt_TenKH.getText(), txt_NgayTao.getText(), txt_SDT.getText(), txt_IDNV.getText(), giohang, txt_SoTienGiamGia.getText(), txt_TongTienSanPham.getText(), txt_tongTienHoaDon.getText()));

        boolean doPrint = job.printDialog();
        if (doPrint) {
            try {
                job.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }
    }
    private void btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseClicked
        try {
            thanhtoanbtn();
        } catch (SQLException ex) {
            Logger.getLogger(ThanhToan_HoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            inAn();
        } catch (PrinterException ex) {
            Logger.getLogger(ThanhToan_HoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnMouseClicked

    private void txt_SoTienGiamGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SoTienGiamGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoTienGiamGiaActionPerformed

    private void txt_tongTienHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tongTienHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tongTienHoaDonActionPerformed
    public void SetTienGiamGia() throws SQLException, ParseException {
        for (SanPhamDTO product : giohang) {
            int id = product.getIdSP();
            int quantity = product.getSoLuongSpConLai();
            System.out.println("so luong; " + product.getSoLuongSpConLai());
            if (idQuantityMap.containsKey(id)) {
                // Nếu ID đã tồn tại trong Map, cộng thêm số lượng vào tổng
                int currentQuantity = idQuantityMap.get(id);
                idQuantityMap.put(id, currentQuantity + quantity);
            } else {
                // Nếu ID chưa tồn tại trong Map, thêm ID mới và gán số lượng
                idQuantityMap.put(id, quantity);
            }
        }
        float sotiengiamgia = 0f;

        ChiTietChuongTrinhGiamGiaBUS chiTietChuongTrinhGiamGiaBUS = new ChiTietChuongTrinhGiamGiaBUS();
        ChuongTrinhGiamGiaBUS ChuongTrinhGiamGiaBUS = new ChuongTrinhGiamGiaBUS();
        ArrayList<ChiTietChuongTrinhGiamGiaDTO> dsctctgg = null;
        ArrayList<ChuongTrinhGiamGiaDTO> dsChuongTrinhGiamGia = ChuongTrinhGiamGiaBUS.docDSCTGG();
        try {
            dsChuongTrinhGiamGia = ChuongTrinhGiamGiaBUS.docDSCTGG();
            dsctctgg = chiTietChuongTrinhGiamGiaBUS.docDSChiTietCTGG();

        } catch (SQLException ex) {
            Logger.getLogger(ThanhToan_HoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (ChiTietChuongTrinhGiamGiaDTO chiTietChuongTrinhGiamGiaDTO : dsctctgg) {

            for (Map.Entry<Integer, Integer> entry : idQuantityMap.entrySet()) {
                int id = entry.getKey();
                int totalQuantity = entry.getValue();
                if (chiTietChuongTrinhGiamGiaDTO.getIdSanPham() == id) {
                    if (chiTietChuongTrinhGiamGiaDTO.getLoaiGiam() == 1) {
                        sotiengiamgia += totalQuantity * chiTietChuongTrinhGiamGiaDTO.getSoTienGiam();
                    } else {
                        for (SanPhamDTO spdto : giohang) {
                            if (spdto.getIdSP() == id) {
                                for (ChuongTrinhGiamGiaDTO ctggdto : dsChuongTrinhGiamGia) {
                                    if (ctggdto.getIdChuongTrinh() == chiTietChuongTrinhGiamGiaDTO.getIdChuongTrinh()) {
                                        String dateFormat = "dd-MM-yyyy";

                                        DateFormat formatter = new SimpleDateFormat(dateFormat);

                                        Date date = formatter.parse(ctggdto.getEnd());

                                        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                                        Date currentDate = new Date();
                                        int comparisonResult = currentDate.compareTo(date);
                                        System.out.println(date);
                                        if (comparisonResult < 0) {
                                            sotiengiamgia += chiTietChuongTrinhGiamGiaDTO.getPhanTramGiam() * spdto.getDonGia() * 0.01f;
                                        }
                                    }
                                }

                            }
                        }
                    }

                }

            }

        }

        txt_SoTienGiamGia.setText(String.valueOf((int) (sotiengiamgia)));

    }

    public void setThongTin() throws SQLException, ParseException {
        SetTienGiamGia();

        Random random = new Random();
        HoaDonBUS hoaDonBUS = new HoaDonBUS();
        ArrayList<HoaDonDTO> dshd = hoaDonBUS.docDSHoaDon();
        HoaDonDTO idhd = dshd.get(dshd.size() - 1);
        Date d = new Date();
        txt_IDHoaDOn.setText(String.valueOf(idhd.getIdHoaDon() + 1));
        txt_IDNV.setText(String.valueOf(nv.getIdNhanVien()));
        txt_SDT.setText(kh.getSDT());
        txt_TenKH.setText(kh.getTen());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String ngayTaoString = dateFormat.format(d);
        txt_NgayTao.setText(ngayTaoString);
        Vector header = new Vector();
        header.add("STT");
        header.add("Tên Sản Phẩm");
        header.add("Đơn Giá");
        header.add("Số Lượng");
        header.add("Thành tiền");
        model = new DefaultTableModel(header, 0);
        model.setRowCount(0);
        int s[] = new int[100];
        int j = 0;
        int i = 1;
        for (SanPhamDTO sp : giohang) {
            Vector row = new Vector();
            row.add(i);
            row.add(sp.getTenSP());
            row.add(sp.getDonGia());
            row.add(sp.getSoLuongSpConLai());
            s[j] = sp.getDonGia() * sp.getSoLuongSpConLai();
            row.add(s[j]);
            j++;
            model.addRow(row);
            i = i + 1;
        }
        jTable1.setModel(model);
        int sum = 0;
        for (int k : s) {
            sum += k;
        }
        txt_TongTienSanPham.setText(String.valueOf(sum));
        int t1 = Integer.parseInt(txt_SoTienGiamGia.getText());
        int t2 = Integer.parseInt(txt_TongTienSanPham.getText());

        txt_tongTienHoaDon.setText(String.valueOf(t2 - t1));
    }

    public static void main(String[] args) throws SQLException, ParseException {
        NhanVienDTO nhanVien = new NhanVienDTO();
        List<SanPhamDTO> dsSanPham = new ArrayList<>();
        KhachHangDTO k = new KhachHangDTO();
        ThanhToan_HoaDon t = new ThanhToan_HoaDon(nhanVien, dsSanPham, k, null);
        JFrame j = new JFrame();
        j.add(t);
        j.setVisible(true);
//        j.setLayout(null);
        j.setSize(780, 650);
        j.setLocationRelativeTo(null);
    }
    DefaultTableModel model = new DefaultTableModel();

    JFrame j = new JFrame();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField txt_IDHoaDOn;
    private javax.swing.JFormattedTextField txt_IDNV;
    private javax.swing.JFormattedTextField txt_NgayTao;
    private javax.swing.JFormattedTextField txt_SDT;
    private javax.swing.JFormattedTextField txt_SoTienGiamGia;
    private javax.swing.JFormattedTextField txt_TenKH;
    private javax.swing.JFormattedTextField txt_TongTienSanPham;
    private javax.swing.JFormattedTextField txt_tongTienHoaDon;
    // End of variables declaration//GEN-END:variables
}
