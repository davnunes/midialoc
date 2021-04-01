package View.ADM;

import Model.Bean.Ambientes;
import Model.DAO.AmbienteDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Tela_Ambientes extends javax.swing.JPanel {

    public Tela_Ambientes() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jT_Ambientes.getModel();
        jT_Ambientes.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
    
    /*==== FUNÇÃO PARA LEITURA ====*/
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jT_Ambientes.getModel();
        modelo.setNumRows(0);
        AmbienteDAO pdao = new AmbienteDAO();

        for (Ambientes p : pdao.read()) {

            modelo.addRow(new Object[]{
                p.getCod(),
                p.getAmbiente()     
            });

        }

    }
    public void readJTableForDesc(String desc) {
        
        DefaultTableModel modelo = (DefaultTableModel) jT_Ambientes.getModel();
        modelo.setNumRows(0);
        AmbienteDAO pdao = new AmbienteDAO();

        for (Ambientes p : pdao.readForDesc(desc)) {

            modelo.addRow(new Object[]{
                p.getCod(),
                p.getAmbiente()
            });

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        barra_busca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Ambientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_editar = new RsButtomMetro.RSButtonMetro();
        bt_cadastrar = new RsButtomMetro.RSButtonMetro();
        bt_excluir = new RsButtomMetro.RSButtonMetro();
        jSeparator6 = new javax.swing.JSeparator();
        rSButtonMetro3 = new RsButtomMetro.RSButtonMetro();
        jTF_Ambiente = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(71, 150, 226));

        jPanel4.setBackground(new java.awt.Color(204, 217, 227));

        barra_busca.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        jT_Ambientes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jT_Ambientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ambiente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_Ambientes.setRowHeight(25);
        jT_Ambientes.setRowMargin(0);
        jT_Ambientes.setShowHorizontalLines(false);
        jT_Ambientes.setShowVerticalLines(false);
        jT_Ambientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_AmbientesMouseClicked(evt);
            }
        });
        jT_Ambientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jT_AmbientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jT_Ambientes);

        jPanel2.setBackground(new java.awt.Color(82, 142, 226));

        jLabel6.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Salas");

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
        jLabel2.setText("Sala:");

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

        rSButtonMetro3.setText("Buscar");
        rSButtonMetro3.setColorHover(new java.awt.Color(204, 204, 204));
        rSButtonMetro3.setColorNormal(new java.awt.Color(148, 168, 235));
        rSButtonMetro3.setColorPressed(new java.awt.Color(153, 153, 153));
        rSButtonMetro3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N

        jTF_Ambiente.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTF_Ambiente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(barra_busca, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSButtonMetro3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Ambiente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(barra_busca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMetro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if(jTF_Ambiente.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Selecione todos os campos", "PetMania informa...", JOptionPane.ERROR_MESSAGE);
        }else{
            Ambientes p = new Ambientes();
            AmbienteDAO dao = new AmbienteDAO();

            p.setAmbiente(jTF_Ambiente.getText());
            dao.create(p);

            jTF_Ambiente.setText("");

            readJTable();
        }
    }//GEN-LAST:event_bt_cadastrarActionPerformed

    private void bt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarActionPerformed
        if (jT_Ambientes.getSelectedRow() != -1) {
                if(jTF_Ambiente.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Selecione todos os campos", "MídiaLoc informa...", JOptionPane.ERROR_MESSAGE);
                }else{
                Ambientes p = new Ambientes();
                AmbienteDAO dao = new AmbienteDAO();

                p.setAmbiente(jTF_Ambiente.getText());
                p.setCod((int) jT_Ambientes.getValueAt(jT_Ambientes.getSelectedRow(), 0));
                dao.update(p);

                jTF_Ambiente.setText("");

                readJTable();
                }
            }
    }//GEN-LAST:event_bt_editarActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        if (jT_Ambientes.getSelectedRow() != -1) {

            Ambientes p = new Ambientes();
            AmbienteDAO dao = new AmbienteDAO();

            p.setCod((int) jT_Ambientes.getValueAt(jT_Ambientes.getSelectedRow(), 0));
            
            dao.delete(p);
            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um ambiente para excluir.");
        }
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void jT_AmbientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_AmbientesMouseClicked
        if (jT_Ambientes.getSelectedRow() != -1) {
            jTF_Ambiente.setText(jT_Ambientes.getValueAt(jT_Ambientes.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_jT_AmbientesMouseClicked

    private void jT_AmbientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_AmbientesKeyReleased
        if (jT_Ambientes.getSelectedRow() != -1) {
            jTF_Ambiente.setText(jT_Ambientes.getValueAt(jT_Ambientes.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_jT_AmbientesKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barra_busca;
    private RsButtomMetro.RSButtonMetro bt_cadastrar;
    private RsButtomMetro.RSButtonMetro bt_editar;
    private RsButtomMetro.RSButtonMetro bt_excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTF_Ambiente;
    private javax.swing.JTable jT_Ambientes;
    private RsButtomMetro.RSButtonMetro rSButtonMetro3;
    // End of variables declaration//GEN-END:variables
}
