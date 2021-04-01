package View.ADM;

import Model.Bean.Turmas;
import Model.DAO.TurmaDAO;
import conection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Tela_Turmas extends javax.swing.JPanel {

    PreparedStatement pst = null;
    ResultSet rs = null;
    Connection con = ConnectionFactory.getConnection();
    
    public Tela_Turmas() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jT_Turmas.getModel();
        jT_Turmas.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
    
    /*==== FUNÇÃO PARA LEITURA ====*/
    public void readJTable() {    
        DefaultTableModel modelo = (DefaultTableModel) jT_Turmas.getModel();
        modelo.setNumRows(0);
        TurmaDAO pdao = new TurmaDAO();

        for (Turmas p : pdao.read()) {
            modelo.addRow(new Object[]{
                p.getCod(),
                p.getTurma(),
                p.getAno()
            });
        }
    }
    public void readJTableForDesc(String desc) {
        
        DefaultTableModel modelo = (DefaultTableModel) jT_Turmas.getModel();
        modelo.setNumRows(0);
        TurmaDAO pdao = new TurmaDAO();

        for (Turmas p : pdao.readForDesc(desc)) {

            modelo.addRow(new Object[]{
                p.getCod(),
                p.getTurma(),
                p.getAno()
            });
        }
    }
    
    /*==== FUNÇÃO PARA EXIBIR A DISCIPLINA DO PROFESSOR ====*/
    public void exibir_disciplina(){
        String tmp = (String)jTF_Turma.getText();
        String sql = "SELECT ano FROM turmas WHERE  turma = ?";

        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = pst.executeQuery();

            if(rs.next()){
                jCB_Anos.setSelectedItem(rs.getString("ano"));  
            }
        }
        catch(Exception ex) {
            System.out.println("Erro! "+ex);
        }
        finally{
            try{
                rs.close();
                pst.close();
            }
            catch (Exception ex) {
                System.out.println("Erro! "+ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTF_Buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Turmas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_editar = new RsButtomMetro.RSButtonMetro();
        bt_cadastrar = new RsButtomMetro.RSButtonMetro();
        bt_excluir = new RsButtomMetro.RSButtonMetro();
        jSeparator6 = new javax.swing.JSeparator();
        jB_Buscar = new RsButtomMetro.RSButtonMetro();
        jTF_Turma = new javax.swing.JTextField();
        jCB_Anos = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(204, 217, 227));

        jTF_Buscar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        jT_Turmas.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jT_Turmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Turmas", "Ano"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_Turmas.setRowHeight(25);
        jT_Turmas.setRowMargin(0);
        jT_Turmas.setShowHorizontalLines(false);
        jT_Turmas.setShowVerticalLines(false);
        jT_Turmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_TurmasMouseClicked(evt);
            }
        });
        jT_Turmas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jT_TurmasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jT_Turmas);
        if (jT_Turmas.getColumnModel().getColumnCount() > 0) {
            jT_Turmas.getColumnModel().getColumn(0).setPreferredWidth(60);
            jT_Turmas.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jPanel2.setBackground(new java.awt.Color(82, 142, 226));

        jLabel6.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Turmas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel1.setText("Pesquisar:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel2.setText("Turma:");

        bt_editar.setText("Editar");
        bt_editar.setColorHover(new java.awt.Color(255, 154, 157));
        bt_editar.setColorNormal(new java.awt.Color(148, 168, 235));
        bt_editar.setColorPressed(new java.awt.Color(204, 0, 0));
        bt_editar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        bt_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editarActionPerformed(evt);
            }
        });

        bt_cadastrar.setText("Cadastrar");
        bt_cadastrar.setColorHover(new java.awt.Color(102, 230, 151));
        bt_cadastrar.setColorNormal(new java.awt.Color(148, 168, 235));
        bt_cadastrar.setColorPressed(new java.awt.Color(0, 153, 51));
        bt_cadastrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        bt_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastrarActionPerformed(evt);
            }
        });

        bt_excluir.setText("Excluir");
        bt_excluir.setColorHover(new java.awt.Color(255, 154, 157));
        bt_excluir.setColorNormal(new java.awt.Color(148, 168, 235));
        bt_excluir.setColorPressed(new java.awt.Color(204, 0, 0));
        bt_excluir.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jB_Buscar.setText("Buscar");
        jB_Buscar.setColorHover(new java.awt.Color(204, 204, 204));
        jB_Buscar.setColorNormal(new java.awt.Color(148, 168, 235));
        jB_Buscar.setColorPressed(new java.awt.Color(153, 153, 153));
        jB_Buscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jB_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuscarActionPerformed(evt);
            }
        });

        jTF_Turma.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        jCB_Anos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º Ano", "2º Ano", "3º Ano" }));
        jCB_Anos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_AnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator6)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTF_Turma, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCB_Anos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTF_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jB_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCB_Anos)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTF_Turma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTF_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarActionPerformed
        String ano = jCB_Anos.getSelectedItem().toString();
        
        Turmas p = new Turmas();
        TurmaDAO dao = new TurmaDAO();
       
        if(jTF_Turma.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Preencha todos os campos!", "MídiaLoc informa...", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
          
        p.setTurma(jTF_Turma.getText());
        p.setAno(ano);

        dao.create(p);
        
        jTF_Turma.setText("");
        
        readJTable();
        }
    }//GEN-LAST:event_bt_cadastrarActionPerformed

    private void bt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarActionPerformed
        if (jT_Turmas.getSelectedRow() != -1) {
                if(jTF_Turma.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Selecione todos os campos", "MídiaLoc informa...", JOptionPane.ERROR_MESSAGE);
                }else{
                Turmas p = new Turmas();
                TurmaDAO dao = new TurmaDAO();
                
                p.setAno(jCB_Anos.getSelectedItem().toString());
                p.setTurma(jTF_Turma.getText());
                p.setCod((int) jT_Turmas.getValueAt(jT_Turmas.getSelectedRow(), 0));
                dao.update(p);

                jTF_Turma.setText("");

                readJTable();
                }
            }
    }//GEN-LAST:event_bt_editarActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        if (jT_Turmas.getSelectedRow() != -1) {

            Turmas p = new Turmas();
            TurmaDAO dao = new TurmaDAO();

            p.setCod((int) jT_Turmas.getValueAt(jT_Turmas.getSelectedRow(), 0));
            
            dao.delete(p);

            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void jT_TurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_TurmasMouseClicked
        if (jT_Turmas.getSelectedRow() != -1) {
            jTF_Turma.setText(jT_Turmas.getValueAt(jT_Turmas.getSelectedRow(), 1).toString());        
        }
    }//GEN-LAST:event_jT_TurmasMouseClicked

    private void jT_TurmasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_TurmasKeyReleased
        if (jT_Turmas.getSelectedRow() != -1) {
            jTF_Turma.setText(jT_Turmas.getValueAt(jT_Turmas.getSelectedRow(), 1).toString()); 
            exibir_disciplina();
        }
    }//GEN-LAST:event_jT_TurmasKeyReleased

    private void jB_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuscarActionPerformed
        if(jTF_Buscar.getText() ==""){
            JOptionPane.showMessageDialog(null, "Selecione horário disponível", "PetMania informa...", JOptionPane.ERROR_MESSAGE);
        }else{
            readJTableForDesc(jTF_Buscar.getText());
        }
    }//GEN-LAST:event_jB_BuscarActionPerformed

    private void jCB_AnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_AnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCB_AnosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RsButtomMetro.RSButtonMetro bt_cadastrar;
    private RsButtomMetro.RSButtonMetro bt_editar;
    private RsButtomMetro.RSButtonMetro bt_excluir;
    private RsButtomMetro.RSButtonMetro jB_Buscar;
    private javax.swing.JComboBox<String> jCB_Anos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTF_Buscar;
    private javax.swing.JTextField jTF_Turma;
    private javax.swing.JTable jT_Turmas;
    // End of variables declaration//GEN-END:variables
}
