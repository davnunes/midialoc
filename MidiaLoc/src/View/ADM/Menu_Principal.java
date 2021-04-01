package View.ADM;

import Panels.CambiaPanel;
import View.Login.Login;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Menu_Principal extends javax.swing.JFrame {
 
    int mouseX, mouseY;
    
    public Menu_Principal() {
        initComponents();
        setLocationRelativeTo( null );  
        setIcon();
    }
    
    class hora implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            Calendar now = Calendar.getInstance();
            jHora.setText(String.format("%1$tH:%1tM:%1$tS",now));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        JFrame = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        bt_sair = new RsButtomMetro.RSButtonMetro();
        jLabel3 = new javax.swing.JLabel();
        bt_reservas = new RsButtomMetro.RSButtonMetro();
        bt_professores = new RsButtomMetro.RSButtonMetro();
        bt_turmas = new RsButtomMetro.RSButtonMetro();
        bt_equipamentos = new RsButtomMetro.RSButtonMetro();
        bt_ambientes = new RsButtomMetro.RSButtonMetro();
        btn_relatorio = new RsButtomMetro.RSButtonMetro();
        barra_superior = new javax.swing.JPanel();
        bt_close = new RsButtomMetro.RSButtonMetro();
        bt_minimizar = new RsButtomMetro.RSButtonMetro();
        jHora = new javax.swing.JLabel();
        jData = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        principal = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JFrame.setBackground(new java.awt.Color(51, 144, 195));

        jPanel1.setBackground(new java.awt.Color(71, 127, 229));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("© Copyright 2019 | MídiaLoc, Inc");

        bt_sair.setBackground(new java.awt.Color(71, 127, 229));
        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Exit_24px.png"))); // NOI18N
        bt_sair.setText("Sair");
        bt_sair.setToolTipText("Logout");
        bt_sair.setColorHover(new java.awt.Color(114, 150, 206));
        bt_sair.setColorNormal(new java.awt.Color(71, 127, 229));
        bt_sair.setColorPressed(new java.awt.Color(93, 119, 229));
        bt_sair.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        bt_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_sairMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Todos os direitos reservados.");

        bt_reservas.setBackground(new java.awt.Color(71, 127, 229));
        bt_reservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Edit Property_28px.png"))); // NOI18N
        bt_reservas.setText(" Reservas");
        bt_reservas.setToolTipText("Reservas");
        bt_reservas.setColorHover(new java.awt.Color(114, 150, 206));
        bt_reservas.setColorNormal(new java.awt.Color(71, 127, 229));
        bt_reservas.setColorPressed(new java.awt.Color(93, 119, 229));
        bt_reservas.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        bt_reservas.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bt_reservas.setIconTextGap(5);
        bt_reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reservasActionPerformed(evt);
            }
        });

        bt_professores.setBackground(new java.awt.Color(71, 127, 229));
        bt_professores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/School Director_28px.png"))); // NOI18N
        bt_professores.setText("Professores");
        bt_professores.setToolTipText("Professores");
        bt_professores.setColorHover(new java.awt.Color(114, 150, 206));
        bt_professores.setColorNormal(new java.awt.Color(71, 127, 229));
        bt_professores.setColorPressed(new java.awt.Color(93, 119, 229));
        bt_professores.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        bt_professores.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bt_professores.setIconTextGap(5);
        bt_professores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_professoresActionPerformed(evt);
            }
        });

        bt_turmas.setBackground(new java.awt.Color(71, 127, 229));
        bt_turmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Classroom_28px.png"))); // NOI18N
        bt_turmas.setText("Turmas");
        bt_turmas.setToolTipText("Turmas");
        bt_turmas.setColorHover(new java.awt.Color(114, 150, 206));
        bt_turmas.setColorNormal(new java.awt.Color(71, 127, 229));
        bt_turmas.setColorPressed(new java.awt.Color(93, 119, 229));
        bt_turmas.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        bt_turmas.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bt_turmas.setIconTextGap(5);
        bt_turmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_turmasActionPerformed(evt);
            }
        });

        bt_equipamentos.setBackground(new java.awt.Color(71, 127, 229));
        bt_equipamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Print_28px.png"))); // NOI18N
        bt_equipamentos.setText("Equipamentos");
        bt_equipamentos.setToolTipText("Equipamentos");
        bt_equipamentos.setColorHover(new java.awt.Color(114, 150, 206));
        bt_equipamentos.setColorNormal(new java.awt.Color(71, 127, 229));
        bt_equipamentos.setColorPressed(new java.awt.Color(93, 119, 229));
        bt_equipamentos.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        bt_equipamentos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bt_equipamentos.setIconTextGap(5);
        bt_equipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_equipamentosActionPerformed(evt);
            }
        });

        bt_ambientes.setBackground(new java.awt.Color(71, 127, 229));
        bt_ambientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Door_28px.png"))); // NOI18N
        bt_ambientes.setText("Ambientes");
        bt_ambientes.setToolTipText("Ambientes");
        bt_ambientes.setColorHover(new java.awt.Color(114, 150, 206));
        bt_ambientes.setColorNormal(new java.awt.Color(71, 127, 229));
        bt_ambientes.setColorPressed(new java.awt.Color(93, 119, 229));
        bt_ambientes.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        bt_ambientes.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bt_ambientes.setIconTextGap(5);
        bt_ambientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ambientesActionPerformed(evt);
            }
        });

        btn_relatorio.setBackground(new java.awt.Color(71, 127, 229));
        btn_relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-documento-28.png"))); // NOI18N
        btn_relatorio.setText("Gerar Relatório");
        btn_relatorio.setToolTipText("Ambientes");
        btn_relatorio.setColorHover(new java.awt.Color(114, 150, 206));
        btn_relatorio.setColorNormal(new java.awt.Color(71, 127, 229));
        btn_relatorio.setColorPressed(new java.awt.Color(93, 119, 229));
        btn_relatorio.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btn_relatorio.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_relatorio.setIconTextGap(5);
        btn_relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_relatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(bt_reservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_professores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_turmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_equipamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_ambientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_relatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(bt_reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_professores, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_turmas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_equipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_ambientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        barra_superior.setBackground(new java.awt.Color(0, 95, 220));
        barra_superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_superiorMouseDragged(evt);
            }
        });
        barra_superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_superiorMousePressed(evt);
            }
        });

        bt_close.setBackground(new java.awt.Color(0, 95, 220));
        bt_close.setText("X");
        bt_close.setToolTipText("Fechar");
        bt_close.setColorHover(new java.awt.Color(255, 0, 0));
        bt_close.setColorNormal(new java.awt.Color(0, 95, 220));
        bt_close.setColorPressed(new java.awt.Color(255, 153, 153));
        bt_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_closeActionPerformed(evt);
            }
        });

        bt_minimizar.setBackground(new java.awt.Color(0, 95, 220));
        bt_minimizar.setText("_");
        bt_minimizar.setToolTipText("Minimizar");
        bt_minimizar.setColorHover(new java.awt.Color(204, 204, 204));
        bt_minimizar.setColorNormal(new java.awt.Color(0, 95, 220));
        bt_minimizar.setColorPressed(new java.awt.Color(153, 173, 175));
        bt_minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_minimizarActionPerformed(evt);
            }
        });

        jHora.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jHora.setForeground(new java.awt.Color(255, 255, 255));
        jHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jHora.setText("hh:mm:ss");

        jData.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jData.setForeground(new java.awt.Color(255, 255, 255));
        jData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jData.setText("dd/mm/yyyy");

        jLabel4.setText(" ");

        javax.swing.GroupLayout barra_superiorLayout = new javax.swing.GroupLayout(barra_superior);
        barra_superior.setLayout(barra_superiorLayout);
        barra_superiorLayout.setHorizontalGroup(
            barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra_superiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jHora, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barra_superiorLayout.setVerticalGroup(
            barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra_superiorLayout.createSequentialGroup()
                .addGroup(barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_close, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(barra_superiorLayout.createSequentialGroup()
                .addGroup(barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barra_superiorLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jHora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(barra_superiorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        principal.setBackground(new java.awt.Color(255, 255, 255));
        principal.setLayout(new javax.swing.BoxLayout(principal, javax.swing.BoxLayout.LINE_AXIS));

        jPanel5.setBackground(new java.awt.Color(148, 197, 249));
        jPanel5.setPreferredSize(new java.awt.Dimension(610, 545));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo-mid.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        principal.add(jPanel5);

        javax.swing.GroupLayout JFrameLayout = new javax.swing.GroupLayout(JFrame);
        JFrame.setLayout(JFrameLayout);
        JFrameLayout.setHorizontalGroup(
            JFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra_superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JFrameLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JFrameLayout.setVerticalGroup(
            JFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JFrameLayout.createSequentialGroup()
                .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(JFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_reservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reservasActionPerformed
        CambiaPanel cambiaPanel = new CambiaPanel(principal, new Tela_Reservas());
    }//GEN-LAST:event_bt_reservasActionPerformed

    private void bt_professoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_professoresActionPerformed
        CambiaPanel cambiaPanel = new CambiaPanel(principal, new Tela_Professor());
    }//GEN-LAST:event_bt_professoresActionPerformed

    private void bt_turmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_turmasActionPerformed
        CambiaPanel cambiaPanel = new CambiaPanel(principal, new Tela_Turmas());
    }//GEN-LAST:event_bt_turmasActionPerformed

    private void bt_equipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_equipamentosActionPerformed
        CambiaPanel cambiaPanel = new CambiaPanel(principal, new Tela_Equipamentos());
    }//GEN-LAST:event_bt_equipamentosActionPerformed

    private void bt_ambientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ambientesActionPerformed
        CambiaPanel cambiaPanel = new CambiaPanel(principal, new Tela_Ambientes());
    }//GEN-LAST:event_bt_ambientesActionPerformed

    private void bt_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_closeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Data
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jData.setText(formato.format(dataSistema));
        
        //Hora
        Timer timer = new Timer(1000, new Menu_Principal.hora());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void bt_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sairMouseClicked
        int conf = JOptionPane.showConfirmDialog(null,"Realmente deseja sair?","MídiaLoc Informa...",JOptionPane.YES_NO_OPTION);
        
        if(conf == JOptionPane.YES_OPTION){
            Login back = new Login();
            back.setVisible(true);
            dispose();
        }else{
            //NÃO ACONTECE NADA!
        }
        
    }//GEN-LAST:event_bt_sairMouseClicked

    private void bt_minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_minimizarActionPerformed
        this.setState(Menu_Principal.ICONIFIED);
    }//GEN-LAST:event_bt_minimizarActionPerformed

    private void btn_relatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_relatorioActionPerformed
        Connection conn= conection.ConnectionFactory.getConnection();
        String src="./src/Modelo_relatorio/Relatorio.jasper";
        
        JasperPrint jasperPrint= null;
        
        try {
            jasperPrint= JasperFillManager.fillReport(src, null, conn);
        } catch (JRException ex) {
            System.out.println("Error: "+ex);
        }
        
        JasperViewer view= new JasperViewer(jasperPrint,false);
        view.setVisible(true);
        
        //SALVA O RELATORIO NUMA PASTA
        try {
            JasperReport jasperReport= JasperCompileManager.compileReport("./src/Modelo_relatorio/Relatorio.jrxml");
            
            Date data= new Date();
            SimpleDateFormat form= new SimpleDateFormat("ddMMyyy");
            
            JasperExportManager.exportReportToPdfFile(jasperPrint,"./Relatorios/"+form.format(data)+".pdf");
        } catch (JRException ex) {
            System.out.println("Error: "+ex);
        }
    }//GEN-LAST:event_btn_relatorioActionPerformed

    private void barra_superiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superiorMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_barra_superiorMousePressed

    private void barra_superiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superiorMouseDragged
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        
        this.setLocation(X-mouseX, Y-mouseY);
    }//GEN-LAST:event_barra_superiorMouseDragged

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JFrame;
    private javax.swing.JPanel barra_superior;
    private RsButtomMetro.RSButtonMetro bt_ambientes;
    private RsButtomMetro.RSButtonMetro bt_close;
    private RsButtomMetro.RSButtonMetro bt_equipamentos;
    private RsButtomMetro.RSButtonMetro bt_minimizar;
    private RsButtomMetro.RSButtonMetro bt_professores;
    private RsButtomMetro.RSButtonMetro bt_reservas;
    private RsButtomMetro.RSButtonMetro bt_sair;
    private RsButtomMetro.RSButtonMetro bt_turmas;
    private RsButtomMetro.RSButtonMetro btn_relatorio;
    private javax.swing.JLabel jData;
    private javax.swing.JLabel jHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/logo3.png")));
    }
    
}
