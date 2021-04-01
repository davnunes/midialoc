package View.ADM;

import Model.Bean.Professores;
import Model.DAO.ProfessorDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Tela_Professor extends javax.swing.JPanel {

    public Tela_Professor() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jT_Professores.getModel();
        jT_Professores.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
    
    /*==== FUNÇÃO PARA LEITURA ====*/
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jT_Professores.getModel();
        modelo.setNumRows(0);
        ProfessorDAO pdao = new ProfessorDAO();

        for (Professores p : pdao.read()) {

            modelo.addRow(new Object[]{
                p.getCod(),
                p.getNome(),
                p.getDisciplina()      
            });

        }

    }
    public void readJTableForDesc(String desc) {
        
        DefaultTableModel modelo = (DefaultTableModel) jT_Professores.getModel();
        modelo.setNumRows(0);
        ProfessorDAO pdao = new ProfessorDAO();

        for (Professores p : pdao.readForDesc(desc)) {

            modelo.addRow(new Object[]{
                p.getCod(),
                p.getNome(),
                p.getDisciplina()
            });

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Professores = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTF_Buscar = new javax.swing.JTextField();
        bt_cadastrar = new RsButtomMetro.RSButtonMetro();
        bt_excluir = new RsButtomMetro.RSButtonMetro();
        bt_buscar = new RsButtomMetro.RSButtonMetro();
        jSeparator6 = new javax.swing.JSeparator();
        jTF_Professor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTF_Disciplina = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 217, 227));

        jT_Professores.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jT_Professores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Disciplina"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_Professores.setRowHeight(25);
        jT_Professores.setRowMargin(0);
        jT_Professores.setShowHorizontalLines(false);
        jT_Professores.setShowVerticalLines(false);
        jT_Professores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_ProfessoresMouseClicked(evt);
            }
        });
        jT_Professores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jT_ProfessoresKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jT_Professores);
        if (jT_Professores.getColumnModel().getColumnCount() > 0) {
            jT_Professores.getColumnModel().getColumn(0).setPreferredWidth(50);
            jT_Professores.getColumnModel().getColumn(1).setPreferredWidth(200);
            jT_Professores.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        jPanel2.setBackground(new java.awt.Color(82, 142, 226));

        jLabel6.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Professores");

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

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("Pesquisar:");

        jTF_Buscar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

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

        bt_buscar.setText("Buscar");
        bt_buscar.setColorHover(new java.awt.Color(204, 204, 204));
        bt_buscar.setColorNormal(new java.awt.Color(148, 168, 235));
        bt_buscar.setColorPressed(new java.awt.Color(153, 153, 153));
        bt_buscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jTF_Professor.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTF_Professor.setAutoscrolls(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel4.setText("Professor(a):");

        jTF_Disciplina.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTF_Disciplina.setAutoscrolls(false);
        jTF_Disciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_DisciplinaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel3.setText("Disciplina:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTF_Professor, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTF_Disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTF_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTF_Professor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTF_Disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTF_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
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
        if(jTF_Professor.getText().isEmpty()||jTF_Disciplina.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Selecione todos os campos", "PetMania informa...", JOptionPane.ERROR_MESSAGE);
        }else{
            Professores p = new Professores();
            ProfessorDAO dao = new ProfessorDAO();

            p.setNome(jTF_Professor.getText());
            p.setDisciplina(jTF_Disciplina.getText());
            dao.create(p);

            jTF_Professor.setText("");
            jTF_Disciplina.setText("");

            readJTable();
        }
    }//GEN-LAST:event_bt_cadastrarActionPerformed

    private void jTF_DisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_DisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_DisciplinaActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        if (jT_Professores.getSelectedRow() != -1) {

            Professores p = new Professores();
            ProfessorDAO dao = new ProfessorDAO();

            p.setCod((int) jT_Professores.getValueAt(jT_Professores.getSelectedRow(), 0));
            
            dao.delete(p);

            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void jT_ProfessoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_ProfessoresMouseClicked
        if (jT_Professores.getSelectedRow() != -1) {
            jTF_Professor.setText(jT_Professores.getValueAt(jT_Professores.getSelectedRow(), 1).toString());
            jTF_Disciplina.setText(jT_Professores.getValueAt(jT_Professores.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_jT_ProfessoresMouseClicked

    private void jT_ProfessoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_ProfessoresKeyReleased
        if (jT_Professores.getSelectedRow() != -1) {
            jTF_Professor.setText(jT_Professores.getValueAt(jT_Professores.getSelectedRow(), 1).toString());
            jTF_Disciplina.setText(jT_Professores.getValueAt(jT_Professores.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_jT_ProfessoresKeyReleased

    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
        readJTableForDesc(jTF_Buscar.getText());
    }//GEN-LAST:event_bt_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RsButtomMetro.RSButtonMetro bt_buscar;
    private RsButtomMetro.RSButtonMetro bt_cadastrar;
    private RsButtomMetro.RSButtonMetro bt_excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTF_Buscar;
    private javax.swing.JTextField jTF_Disciplina;
    private javax.swing.JTextField jTF_Professor;
    private javax.swing.JTable jT_Professores;
    // End of variables declaration//GEN-END:variables
}
