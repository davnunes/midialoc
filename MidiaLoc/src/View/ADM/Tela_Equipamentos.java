package View.ADM;

import Model.Bean.Equipamentos;
import Model.DAO.EquipamentoDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Tela_Equipamentos extends javax.swing.JPanel {

    public Tela_Equipamentos() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTEquipamentos.getModel();
        jTEquipamentos.setRowSorter(new TableRowSorter(modelo));
        
        /*===== CORES QUE ESTARÃO NO JCOMBOBOX =====*/
        cor.addItem("");
        cor.addItem("Amarelo");
        cor.addItem("Azul");
        cor.addItem("Branco");
        cor.addItem("Cinza");
        cor.addItem("Preto");
        cor.addItem("Outro");
        
        /* INICIA A LEITURA AO INICIAR O PROJETO */
        read();
    }
    
    /*==== FUNÇÃO PARA LEITURA ====*/
    public void read(){
        DefaultTableModel modelo = (DefaultTableModel) jTEquipamentos.getModel();
        modelo.setNumRows(0);
        EquipamentoDAO edao = new EquipamentoDAO();
        
        for(Equipamentos e: edao.read()){
             modelo.addRow(new Object[]{
                 e.getCod(),
                 e.getNome(),
                 e.getMarca(),
                 e.getModelo(),
                 e.getCor(),
                 e.getStatus()    
             });
        }
    }
    public void search(String pesquisa){
        DefaultTableModel modelo = (DefaultTableModel) jTEquipamentos.getModel();
        modelo.setNumRows(0);
        EquipamentoDAO edao = new EquipamentoDAO();
        
        for(Equipamentos e: edao.search(pesquisa)){
             modelo.addRow(new Object[]{
                 e.getCod(),
                 e.getNome(),
                 e.getMarca(),
                 e.getModelo(),
                 e.getCor(),
                 e.getStatus()
             });
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtpesquisa = new javax.swing.JTextField();
        bt_cadastrar = new RsButtomMetro.RSButtonMetro();
        bt_excluir = new RsButtomMetro.RSButtonMetro();
        bt_busca = new RsButtomMetro.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        cor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTEquipamentos = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(204, 217, 227));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel1.setText("Pesquisar:");

        txtpesquisa.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

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

        bt_busca.setText("Buscar");
        bt_busca.setColorHover(new java.awt.Color(204, 204, 204));
        bt_busca.setColorNormal(new java.awt.Color(148, 168, 235));
        bt_busca.setColorPressed(new java.awt.Color(153, 153, 153));
        bt_busca.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        bt_busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(82, 142, 226));

        jLabel6.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Equipamentos");

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

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel2.setText("Nome:");

        marca.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        marca.setHighlighter(null);

        cor.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        cor.setBorder(null);
        cor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel3.setText("Marca:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel4.setText("Cor:");

        nome.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        nome.setHighlighter(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel5.setText("Modelo:");

        modelo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        modelo.setHighlighter(null);
        modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jTEquipamentos.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTEquipamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Marca", "Modelo", "Cor", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTEquipamentos.setRowHeight(25);
        jTEquipamentos.setRowMargin(0);
        jTEquipamentos.setShowHorizontalLines(false);
        jTEquipamentos.setShowVerticalLines(false);
        jTEquipamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTEquipamentosMouseClicked(evt);
            }
        });
        jTEquipamentos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTEquipamentosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTEquipamentos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bt_busca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator6)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nome)
                        .addComponent(modelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)))
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );

        marca.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarActionPerformed
       
       Equipamentos p = new Equipamentos();
       EquipamentoDAO dao = new EquipamentoDAO();
       
       if(nome.getText().isEmpty() || marca.getText().isEmpty() || modelo.getText().isEmpty() || cor.getSelectedItem().toString().isEmpty()){
           JOptionPane.showMessageDialog(null,"Preencha todos os campos!", "MídiaLoc informa...", JOptionPane.INFORMATION_MESSAGE);
       }
       else{
          
        p.setNome(nome.getText());
        p.setMarca(marca.getText());
        p.setModelo(modelo.getText());
        p.setCor(String.valueOf(cor.getSelectedItem()));
        p.setStatus("Disponível");

        dao.create(p);
        
        nome.setText("");
        marca.setText("");
        modelo.setText("");
        cor.setSelectedItem("");
        
        read();
       }
    }//GEN-LAST:event_bt_cadastrarActionPerformed

    private void modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        if(jTEquipamentos.getSelectedRow() != -1){
            //TELA DE CONFIRMAÇÃO PARA EXCLUSÃO
            int op = JOptionPane.showConfirmDialog(null,"Realmente deseja excluir esse equipamento?","MídiaLoc informa...", JOptionPane.YES_NO_OPTION);
                //SE SIM
                if(op == JOptionPane.YES_OPTION){
                    Equipamentos e = new Equipamentos();
                    EquipamentoDAO dao = new EquipamentoDAO();

                    e.setCod((int) jTEquipamentos.getValueAt(jTEquipamentos.getSelectedRow(), 0));

                    dao.delete(e);

                     nome.setText("");
                     marca.setText("");
                     modelo.setText("");
                     cor.setSelectedItem("");

                     read();
                }
                //SE NÃO
                else if(op == JOptionPane.NO_OPTION){
                    /*==== NÃO ACONTECE NADA! ====*/
                }
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um equipamento na tabela para excluir", "MídiaLoc informa...", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void jTEquipamentosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEquipamentosKeyReleased
        if(jTEquipamentos.getSelectedRow() != -1){
            nome.setText(jTEquipamentos.getValueAt(jTEquipamentos.getSelectedRow(), 1).toString());
            marca.setText(jTEquipamentos.getValueAt(jTEquipamentos.getSelectedRow(), 2).toString());
            modelo.setText(jTEquipamentos.getValueAt(jTEquipamentos.getSelectedRow(), 3).toString());
            cor.setSelectedItem(jTEquipamentos.getValueAt(jTEquipamentos.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_jTEquipamentosKeyReleased

    private void bt_buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscaActionPerformed
        search(txtpesquisa.getText());
    }//GEN-LAST:event_bt_buscaActionPerformed

    private void jTEquipamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTEquipamentosMouseClicked
        if(jTEquipamentos.getSelectedRow() != -1){
            nome.setText(jTEquipamentos.getValueAt(jTEquipamentos.getSelectedRow(), 1).toString());
            marca.setText(jTEquipamentos.getValueAt(jTEquipamentos.getSelectedRow(), 2).toString());
            modelo.setText(jTEquipamentos.getValueAt(jTEquipamentos.getSelectedRow(), 3).toString());
            cor.setSelectedItem(jTEquipamentos.getValueAt(jTEquipamentos.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_jTEquipamentosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RsButtomMetro.RSButtonMetro bt_busca;
    private RsButtomMetro.RSButtonMetro bt_cadastrar;
    private RsButtomMetro.RSButtonMetro bt_excluir;
    private javax.swing.JComboBox<String> cor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTEquipamentos;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField txtpesquisa;
    // End of variables declaration//GEN-END:variables
}
