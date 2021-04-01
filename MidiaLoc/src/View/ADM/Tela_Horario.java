package View.ADM;

import Model.Bean.Horarios;
import Model.DAO.HorarioDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Tela_Horario extends javax.swing.JPanel {

    public Tela_Horario() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jT_Horarios.getModel();
        jT_Horarios.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
    
    /*==== FUNÇÃO PARA LEITURA ====*/
    public void readJTable() {    
        DefaultTableModel modelo = (DefaultTableModel) jT_Horarios.getModel();
        modelo.setNumRows(0);
        HorarioDAO pdao = new HorarioDAO();

        for (Horarios p : pdao.read()) {
            modelo.addRow(new Object[]{
                p.getCod(),
                p.getHorario()     
            });
        }
    }
    public void readJTableForDesc(String desc) {
        
        DefaultTableModel modelo = (DefaultTableModel) jT_Horarios.getModel();
        modelo.setNumRows(0);
        HorarioDAO pdao = new HorarioDAO();

        for (Horarios p : pdao.readForDesc(desc)) {

            modelo.addRow(new Object[]{
                p.getCod(),
                p.getHorario()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTF_Buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Horarios = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bt_cadastrar = new RsButtomMetro.RSButtonMetro();
        bt_excluir = new RsButtomMetro.RSButtonMetro();
        jB_Buscar = new RsButtomMetro.RSButtonMetro();
        jLabel2 = new javax.swing.JLabel();
        jFTF_Horario = new javax.swing.JFormattedTextField();
        jSeparator6 = new javax.swing.JSeparator();
        bt_editar = new RsButtomMetro.RSButtonMetro();

        jPanel1.setBackground(new java.awt.Color(204, 217, 227));

        jTF_Buscar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        jT_Horarios.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jT_Horarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia da semana", "Horário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_Horarios.setRowHeight(25);
        jT_Horarios.setRowMargin(0);
        jT_Horarios.setShowHorizontalLines(false);
        jT_Horarios.setShowVerticalLines(false);
        jT_Horarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_HorariosMouseClicked(evt);
            }
        });
        jT_Horarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jT_HorariosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jT_Horarios);

        jPanel2.setBackground(new java.awt.Color(82, 142, 226));

        jLabel6.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Horários");

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

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel2.setText("Horário:");

        try {
            jFTF_Horario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:## às ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTF_Horario.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator6)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jFTF_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTF_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jB_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTF_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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
       Horarios h = new Horarios();
       HorarioDAO dao = new HorarioDAO();

       if(jFTF_Horario.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Preencha todos os campos!", "MídiaLoc informa...", JOptionPane.INFORMATION_MESSAGE);
       }
       else{
          
        h.setHorario(jFTF_Horario.getText());
        //h.setDia(Dia);

        dao.create(h);
        
        jFTF_Horario.setText("");
        //jCB_Dias.setSelectedItem(null);
        
        readJTable();
        
        
        /*Cadastrar_Horario cadastrar = new Cadastrar_Horario();
        cadastrar.setVisible(true);*/
       }
    }//GEN-LAST:event_bt_cadastrarActionPerformed

    private void jT_HorariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_HorariosMouseClicked
        if (jT_Horarios.getSelectedRow() != -1) {
            jFTF_Horario.setText(jT_Horarios.getValueAt(jT_Horarios.getSelectedRow(), 1).toString());
            //jCB_Dias.setSelectedItem(jT_Horarios.getValueAt(jT_Horarios.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_jT_HorariosMouseClicked

    private void jT_HorariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_HorariosKeyReleased
        if (jT_Horarios.getSelectedRow() != -1) {
            jFTF_Horario.setText(jT_Horarios.getValueAt(jT_Horarios.getSelectedRow(), 1).toString());
            //jCB_Dias.setSelectedItem(jT_Horarios.getValueAt(jT_Horarios.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_jT_HorariosKeyReleased

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        if (jT_Horarios.getSelectedRow() != -1) {

            Horarios p = new Horarios();
            HorarioDAO dao = new HorarioDAO();

            p.setCod((int) jT_Horarios.getValueAt(jT_Horarios.getSelectedRow(), 0));
            
            dao.delete(p);

            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void bt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarActionPerformed
        if (jT_Horarios.getSelectedRow() != -1) {
                if(jFTF_Horario.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Selecione todos os campos", "PetMania informa...", JOptionPane.ERROR_MESSAGE);
                }else{
                Horarios p = new Horarios();
                HorarioDAO dao = new HorarioDAO();

                p.setHorario(jFTF_Horario.getText());
                p.setCod((int) jT_Horarios.getValueAt(jT_Horarios.getSelectedRow(), 0));
                dao.update(p);

                jFTF_Horario.setText("");

                readJTable();
                }
            }
    }//GEN-LAST:event_bt_editarActionPerformed

    private void jB_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuscarActionPerformed
        if(jTF_Buscar.getText() ==""){
            JOptionPane.showMessageDialog(null, "Selecione horário disponível", "PetMania informa...", JOptionPane.ERROR_MESSAGE);
        }else{
            readJTableForDesc(jTF_Buscar.getText());
        }
    }//GEN-LAST:event_jB_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RsButtomMetro.RSButtonMetro bt_cadastrar;
    private RsButtomMetro.RSButtonMetro bt_editar;
    private RsButtomMetro.RSButtonMetro bt_excluir;
    private RsButtomMetro.RSButtonMetro jB_Buscar;
    private javax.swing.JFormattedTextField jFTF_Horario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTF_Buscar;
    private javax.swing.JTable jT_Horarios;
    // End of variables declaration//GEN-END:variables
}
