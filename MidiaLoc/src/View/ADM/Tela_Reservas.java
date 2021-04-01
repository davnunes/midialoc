package View.ADM;

import conection.ConnectionFactory;
import Model.Bean.Ambientes;
import Model.Bean.Equipamentos;
import Model.Bean.Professores;
import Model.Bean.Reservas;
import Model.Bean.Turmas;
import Model.DAO.AmbienteDAO;
import Model.DAO.EquipamentoDAO;
import Model.DAO.ProfessorDAO;
import Model.DAO.ReservaDAO;
import Model.DAO.TurmaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Tela_Reservas extends javax.swing.JPanel {

    PreparedStatement pst = null;
    ResultSet rs = null;
    Connection con = ConnectionFactory.getConnection();
    
    public Tela_Reservas() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jT_Reservas.getModel();
        jT_Reservas.setRowSorter(new TableRowSorter(modelo));
        readJTable();
        exibir_disciplina();
        exibir_turma();
        

        /*Adiciona as turmas ao Combo box*/
        TurmaDAO dao2 = new TurmaDAO();
        for(Turmas h: dao2.read()){
            jCB_Turmas.addItem(String.valueOf(h));
        }
        
        /*Adiciona os ambientes ao Combo box*/
        AmbienteDAO dao3 = new AmbienteDAO();
        for(Ambientes h: dao3.read()){
            jCB_Ambientes.addItem(String.valueOf(h));
        }
        
        /*Adiciona os professores ao Combo box*/
        ProfessorDAO dao4 = new ProfessorDAO();
        for(Professores h: dao4.read()){
            jCB_Professores.addItem(String.valueOf(h));
        }
        
        /*Adiciona os equipamentos ao Combo box*/
        EquipamentoDAO dao5 = new EquipamentoDAO();
        for(Equipamentos h: dao5.readCondicao()){
            jCB_Equipamentos.addItem(String.valueOf(h));
        }
        
    }
    
    
    /*==== FUNÇÃO PARA LEITURA ====*/
    public void readJTable() {    
        DefaultTableModel modelo = (DefaultTableModel) jT_Reservas.getModel();
        modelo.setNumRows(0);
        ReservaDAO pdao = new ReservaDAO();

        for (Reservas p : pdao.read()) {
            modelo.addRow(new Object[]{
                p.getCod(),
                p.getEquipamento(),
                p.getProfessor(),
                p.getAmbiente(),
                p.getTurma(),
                p.getDia()
            });
        }
    }
    public void readJTableForDesc(String desc) {
        
        DefaultTableModel modelo = (DefaultTableModel) jT_Reservas.getModel();
        modelo.setNumRows(0);
        ReservaDAO pdao = new ReservaDAO();

        for (Reservas p : pdao.readForDesc(desc)) {

            modelo.addRow(new Object[]{
                p.getCod(),
                p.getEquipamento(),
                p.getProfessor(),
                p.getAmbiente(),
                p.getTurma(),
                p.getDia()
            });
        }
    }
    
    /*==== FUNÇÃO PARA EXIBIR A DISCIPLINA DO PROFESSOR ====*/
    public void exibir_disciplina(){
        String tmp = (String)jCB_Professores.getSelectedItem();
        String sql = "SELECT disciplina FROM professores WHERE  nome = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = pst.executeQuery();
            if(rs.next()){jTF_Disciplina.setText(rs.getString("disciplina"));}
        }
        catch(Exception ex) {System.out.println("Erro! "+ex);}
        finally{
            try{
                rs.close();
                pst.close();
            }catch (Exception ex) {System.out.println("Erro! "+ex);}
        }
    }
    /*==== FUNÇÃO PARA EXIBIR O ANO DA TURMA ====*/
    public void exibir_turma(){
        String tmp = (String)jCB_Turmas.getSelectedItem();
        String sql = "SELECT ano FROM turmas WHERE turma = ?";

        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = pst.executeQuery();

            if(rs.next()){
                jTF_Ano.setText(rs.getString("ano"));  
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Reservas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jCB_Equipamentos = new javax.swing.JComboBox<>();
        jCB_Professores = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jCB_Turmas = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCB_Ambientes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        bt_excluir = new RsButtomMetro.RSButtonMetro();
        bt_cadastrar = new RsButtomMetro.RSButtonMetro();
        jSeparator6 = new javax.swing.JSeparator();
        bt_editar = new RsButtomMetro.RSButtonMetro();
        bt_busca = new RsButtomMetro.RSButtonMetro();
        jCB_Dias = new javax.swing.JComboBox<>();
        jTF_Disciplina = new javax.swing.JTextField();
        jTF_Ano = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jCB_Mes = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTF_Busca = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(204, 217, 227));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel1.setText("Pesquisar:");

        jT_Reservas.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jT_Reservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Equipamento", "Professor", "Ambiente", "Turma", "Dia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_Reservas.setRowHeight(25);
        jT_Reservas.setRowMargin(0);
        jT_Reservas.setShowHorizontalLines(false);
        jT_Reservas.setShowVerticalLines(false);
        jT_Reservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_ReservasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_Reservas);
        if (jT_Reservas.getColumnModel().getColumnCount() > 0) {
            jT_Reservas.getColumnModel().getColumn(0).setPreferredWidth(30);
            jT_Reservas.getColumnModel().getColumn(1).setPreferredWidth(100);
            jT_Reservas.getColumnModel().getColumn(2).setPreferredWidth(100);
            jT_Reservas.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        jPanel2.setBackground(new java.awt.Color(82, 142, 226));

        jLabel6.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Reservas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jCB_Equipamentos.setBackground(new java.awt.Color(204, 217, 227));
        jCB_Equipamentos.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jCB_Equipamentos.setBorder(null);

        jCB_Professores.setBackground(new java.awt.Color(204, 217, 227));
        jCB_Professores.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jCB_Professores.setBorder(null);
        jCB_Professores.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jCB_ProfessoresPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel12.setText("Dia:");

        jCB_Turmas.setBackground(new java.awt.Color(204, 217, 227));
        jCB_Turmas.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jCB_Turmas.setBorder(null);
        jCB_Turmas.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jCB_TurmasPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel10.setText("Turma:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel2.setText("Professor:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel4.setText("Equipamento:");

        jCB_Ambientes.setBackground(new java.awt.Color(204, 217, 227));
        jCB_Ambientes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jCB_Ambientes.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel5.setText("Ambiente:");

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

        jCB_Dias.setBackground(new java.awt.Color(204, 217, 227));
        jCB_Dias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        jTF_Disciplina.setEditable(false);
        jTF_Disciplina.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTF_Disciplina.setText(" ");

        jTF_Ano.setEditable(false);
        jTF_Ano.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel11.setText("Ano:");

        jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel13.setText("Disciplina:");

        jCB_Mes.setBackground(new java.awt.Color(204, 217, 227));
        jCB_Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel14.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel14.setText("Mês:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF_Busca, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(bt_busca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jCB_Equipamentos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCB_Ambientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTF_Disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(13, 303, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCB_Professores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCB_Turmas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jTF_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCB_Dias, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jCB_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCB_Professores, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCB_Turmas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTF_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCB_Ambientes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCB_Equipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCB_Dias, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCB_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTF_Disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTF_Busca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(bt_busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(267, 267, 267)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(297, Short.MAX_VALUE)))
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
        Calendar hora = Calendar.getInstance();
        SimpleDateFormat day = new SimpleDateFormat("dd");
        SimpleDateFormat mounth = new SimpleDateFormat("MM");

        String professor = jCB_Professores.getSelectedItem().toString();
        String equipamento = jCB_Equipamentos.getSelectedItem().toString();
        String ambiente = jCB_Ambientes.getSelectedItem().toString();
        String turma = jCB_Turmas.getSelectedItem().toString();
        String serie = jTF_Ano.getText();
        String dia = jCB_Dias.getSelectedItem().toString();
        String mes = jCB_Mes.getSelectedItem().toString();
        
        Reservas p = new Reservas();
        ReservaDAO dao = new ReservaDAO();

        if(jCB_Professores.getSelectedItem() == "" || jCB_Equipamentos.getSelectedItem() == "" || jCB_Ambientes.getSelectedItem() == "" || jCB_Turmas.getSelectedItem() == ""){
            JOptionPane.showMessageDialog(null,"Preencha todos os campos!", "MídiaLoc informa...", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String turma_comp = turma+" "+serie;
            
            //CONVERSÃO DE STRING PARA INT NA DATA(DIA)
            int dia_cal = Integer.valueOf(day.format(hora.getTime()));
            int dia_sel = Integer.valueOf(dia);
            //CONVERSÃO DE STRING PARA INT NA DATA(MÊS)
            int mes_cal = Integer.valueOf(mounth.format(hora.getTime()));
            int mes_sel = Integer.valueOf(mes);
            if(mes_sel < mes_cal){
                JOptionPane.showMessageDialog(null, "Data inválida!", "MídiaLoc", JOptionPane.ERROR_MESSAGE);
            }
            else{
                String data = dia+"/"+mes;
                if(dia_sel < 10 && dia_sel > 1 || mes_sel < 10 && mes_sel > 1){    
                    data = "0"+dia+"/0"+mes;
                    
                    p.setProfessor(professor);
                    p.setEquipamento(equipamento);
                    p.setAmbiente(ambiente);
                    p.setTurma(turma_comp);
                    p.setDia(data);       
                    dao.create(p);

                    Equipamentos e = new Equipamentos();
                    EquipamentoDAO equi = new EquipamentoDAO();

                    String indispo = "Indisponível";
                    e.setStatus(indispo);
                    e.setNome(equipamento);       
                    equi.update(e);

                    readJTable();
                }
                else{
                    p.setProfessor(professor);
                    p.setEquipamento(equipamento);
                    p.setAmbiente(ambiente);
                    p.setTurma(turma_comp);
                    p.setDia(data);       
                    dao.create(p);

                    Equipamentos e = new Equipamentos();
                    EquipamentoDAO equi = new EquipamentoDAO();

                    String indispo = "Indisponível";
                    e.setStatus(indispo);
                    e.setNome(equipamento);       
                    equi.update(e);

                    readJTable();
                }
            }
        }
    }//GEN-LAST:event_bt_cadastrarActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        if (jT_Reservas.getSelectedRow() != -1) {
            int op = JOptionPane.showConfirmDialog(null,"Realmente deseja apagar essa reserva?","MídiaLoc informa...", JOptionPane.YES_NO_OPTION);
            //SE SIM
            if(op == JOptionPane.YES_OPTION){
                Equipamentos e = new Equipamentos();
                EquipamentoDAO equi = new EquipamentoDAO(); 
                String dispo = "Disponível";
                e.setStatus(dispo);
                e.setNome((String) jT_Reservas.getValueAt(jT_Reservas.getSelectedRow(), 1));
                equi.update(e);

                Reservas p = new Reservas();
                ReservaDAO dao = new ReservaDAO();
                p.setCod((int) jT_Reservas.getValueAt(jT_Reservas.getSelectedRow(), 0));
                dao.delete(p);

                readJTable();    
            }
        }else{JOptionPane.showMessageDialog(null, "Selecione uma reserva para excluir.");}
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void jCB_ProfessoresPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCB_ProfessoresPopupMenuWillBecomeInvisible
        exibir_disciplina();
    }//GEN-LAST:event_jCB_ProfessoresPopupMenuWillBecomeInvisible

    private void bt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarActionPerformed
         if (jT_Reservas.getSelectedRow() != -1) {
                if(jCB_Turmas.getSelectedItem().toString().isEmpty()){
                JOptionPane.showMessageDialog(null, "Selecione todos os campos", "MídiaLoc informa...", JOptionPane.ERROR_MESSAGE);
                }else{
                Reservas p = new Reservas();
                ReservaDAO dao = new ReservaDAO();
                p.setTurma(jCB_Turmas.getSelectedItem().toString());
                p.setEquipamento(jCB_Equipamentos.getSelectedItem().toString());
                p.setProfessor(jCB_Professores.getSelectedItem().toString());
                p.setAmbiente(jCB_Ambientes.getSelectedItem().toString());
                p.setDia(jCB_Dias.getSelectedItem().toString());
                p.setCod((int) jT_Reservas.getValueAt(jT_Reservas.getSelectedRow(), 0));
                //JOptionPane.showMessageDialog(null,jCB_Turmas.getSelectedItem().toString()); 
//                p.setCod((int) jT_Ambientes.getValueAt(jT_Ambientes.getSelectedRow(), 0));
                dao.update(p);
 

                readJTable();
                }
            }
    }//GEN-LAST:event_bt_editarActionPerformed

    private void bt_buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscaActionPerformed
        String SelecionadoDia = jTF_Busca.getText();
        readJTableForDesc(SelecionadoDia);
        
        if(jT_Reservas.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Não há nehuma reserva para este dia");
        }

    }//GEN-LAST:event_bt_buscaActionPerformed

    private void jT_ReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_ReservasMouseClicked
        if (jT_Reservas.getSelectedRow() != -1) {
            jCB_Turmas.setSelectedItem(jT_Reservas.getValueAt(jT_Reservas.getSelectedRow(), 4).toString());
            jCB_Professores.setSelectedItem(jT_Reservas.getValueAt(jT_Reservas.getSelectedRow(), 2).toString());
            jCB_Equipamentos.setSelectedItem(jT_Reservas.getValueAt(jT_Reservas.getSelectedRow(), 1).toString());
            jCB_Ambientes.setSelectedItem(jT_Reservas.getValueAt(jT_Reservas.getSelectedRow(), 3).toString());
            jCB_Dias.setSelectedItem(jT_Reservas.getValueAt(jT_Reservas.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_jT_ReservasMouseClicked

    private void jCB_TurmasPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCB_TurmasPopupMenuWillBecomeInvisible
        exibir_turma();
    }//GEN-LAST:event_jCB_TurmasPopupMenuWillBecomeInvisible


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RsButtomMetro.RSButtonMetro bt_busca;
    private RsButtomMetro.RSButtonMetro bt_cadastrar;
    private RsButtomMetro.RSButtonMetro bt_editar;
    private RsButtomMetro.RSButtonMetro bt_excluir;
    private javax.swing.JComboBox<String> jCB_Ambientes;
    private javax.swing.JComboBox<String> jCB_Dias;
    private javax.swing.JComboBox<String> jCB_Equipamentos;
    private javax.swing.JComboBox<String> jCB_Mes;
    private javax.swing.JComboBox<String> jCB_Professores;
    private javax.swing.JComboBox<String> jCB_Turmas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTF_Ano;
    private javax.swing.JTextField jTF_Busca;
    private javax.swing.JTextField jTF_Disciplina;
    private javax.swing.JTable jT_Reservas;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
