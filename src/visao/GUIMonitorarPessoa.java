/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import dao.PacienteDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.Paciente;
import persistencia.Conexao;
import servicos.PacienteServicos;

/**
 *
 * @author user
 */
public class GUIMonitorarPessoa extends javax.swing.JInternalFrame {
    Vector<Integer> id_paciente = new Vector <Integer>();
    
    public void restaurarPacienteCBX(){
        try{
            PacienteDao paciente = new PacienteDao();
            ResultSet rs = paciente.buscarPaciente();
            
            while (rs.next()){
                id_paciente.addElement(rs.getInt(1));
                cbxPaciente.addItem(rs.getString(2));
            }
            
        }
        catch (SQLException e){
            
        }
    }
    
    public void buscarPaciente(){
        
         String sql = "select * from paciente where cod_paciente="+ id_paciente.get(cbxPaciente.getSelectedIndex()-1); 
        
        try{
          
           Connection con = Conexao.getConexao();
           Statement stat = con.createStatement(); 
           
           ResultSet rs = stat.executeQuery(sql);
           
           rs.next();
           
           String dt = rs.getString("inicio_isolamento");
           String med = rs.getString("medicacao");
           int sem_sintoma = rs.getInt("sem_sintomas");
           int febre = rs.getInt("febre");
           int tosse_seca = rs.getInt("tosse_seca");
           int dor_de_cabeca = rs.getInt("dor_de_cabeca");
           int cansaco = rs.getInt("cansaco");
           int dif_respirar = rs.getInt("dif_respirar");
           
           jftfData.setText(dt);
           jtMedicacao.setText(med);
           
           if (sem_sintoma<1){
               jcSemSintomas.setSelected(true);
           } else{
               jcSemSintomas.setSelected(false);
           }
           if (febre<1){
               jcFebre.setSelected(true);
           }else{
               jcFebre.setSelected(false);
           }
           
           if (tosse_seca<1){
               jcTosseSeca.setSelected(true);
           }else{
               jcTosseSeca.setSelected(false);
           }
           
           if (dor_de_cabeca<1){
               jcDorDeCabeça.setSelected(true);
           }else{
               jcDorDeCabeça.setSelected(false);
           }
           
           if (cansaco<1){
               jcCansaco.setSelected(true);
           }else{
               jcCansaco.setSelected(false);
           }
           
           if (dif_respirar<1){
               jcDificuldadeParaRespirar.setSelected(true);
           }else{
               jcDificuldadeParaRespirar.setSelected(false);
           }
           
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: "+e,"Erro",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    public void finalizarQuarentena(){
        try{
          PacienteServicos ps = servicos.ServicosFactory.getPacienteServicos();
          Integer codPaciente = id_paciente.get(cbxPaciente.getSelectedIndex()-1);
          
          int r = JOptionPane.showConfirmDialog(null, "Você deseja finalizar a quarentena?","Confirmação",JOptionPane.INFORMATION_MESSAGE);
           if (r==JOptionPane.YES_OPTION){
               ps.deletarPaciente(codPaciente);
               dispose();
               GUIMonitorarPessoa.this.setVisible(true);
           }else{
               JOptionPane.showMessageDialog(null, "Exclusão Cancelada!","Confirmação",JOptionPane.INFORMATION_MESSAGE);
           }
        }
        
        catch (SQLException e){
            
        }
    }
    
    public void alterarDados(){
        try{
          Paciente p = new Paciente();
          Integer codPaciente = id_paciente.get(cbxPaciente.getSelectedIndex()-1);
          p.setCod_paciente(codPaciente);
          p.setMedicacao(jtMedicacao.getText());
          
          if(jcFebre.isSelected()){
               p.setFebre(0);
            }
            else {
                p.setFebre(1);
            }
            
            if(jcTosseSeca.isSelected()){
                p.setTosse(0);
            }
            else{
                p.setTosse(1);
            }
            
            if(jcDorDeCabeça.isSelected()){
                p.setDorDeCabeca(0);
            }
            else{
                 p.setDorDeCabeca(1);
            }
            
            if(jcCansaco.isSelected()){
                p.setCansaco(0);
            }
            else{
                p.setCansaco(1);
            }
            
            if(jcDificuldadeParaRespirar.isSelected()){
                p.setDifRespirar(0);
            }
            else{
                p.setDifRespirar(1);
            }
            
            if(jcSemSintomas.isSelected()){
                p.setSemSintomas(0);
            }
            else{
                p.setSemSintomas(1);
            }
          
          PacienteServicos ps = new PacienteServicos();
          ps.alterarDadosPaciente(p);
          JOptionPane.showMessageDialog(null, "Alteração executada!","Confirmação",JOptionPane.INFORMATION_MESSAGE);
          
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: "+e,"Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void limparCampos(){
        cbxPaciente.setSelectedIndex(0);
        jcCansaco.setSelected(false);
        jcDificuldadeParaRespirar.setSelected(false);
        jcDorDeCabeça.setSelected(false);
        jcTosseSeca.setSelected(false);
        jcFebre.setSelected(false);
        jcSemSintomas.setSelected(false);
        jtMedicacao.setText(null);
        jftfData.setText(null);
    }
    
    
    public GUIMonitorarPessoa() {
        initComponents();

        
        restaurarPacienteCBX();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCabecalhoAdicionarPessoa = new javax.swing.JPanel();
        jlCabecalhoAdicionaPessoa = new javax.swing.JLabel();
        jlNomePessoa = new javax.swing.JLabel();
        jlDataInicio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlCabecalhoSintomas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jcFebre = new javax.swing.JCheckBox();
        jcTosseSeca = new javax.swing.JCheckBox();
        jcDorDeCabeça = new javax.swing.JCheckBox();
        jcCansaco = new javax.swing.JCheckBox();
        jcDificuldadeParaRespirar = new javax.swing.JCheckBox();
        jcSemSintomas = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMedicacao = new javax.swing.JTextArea();
        jbFimQuarentena = new javax.swing.JButton();
        cbxPaciente = new javax.swing.JComboBox<>();
        jbAtualizarDados = new javax.swing.JButton();
        jftfData = new javax.swing.JFormattedTextField();

        setClosable(true);

        jpCabecalhoAdicionarPessoa.setBackground(new java.awt.Color(51, 204, 255));

        jlCabecalhoAdicionaPessoa.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jlCabecalhoAdicionaPessoa.setForeground(new java.awt.Color(255, 255, 255));
        jlCabecalhoAdicionaPessoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCabecalhoAdicionaPessoa.setText("MONITORAR PESSOA");

        javax.swing.GroupLayout jpCabecalhoAdicionarPessoaLayout = new javax.swing.GroupLayout(jpCabecalhoAdicionarPessoa);
        jpCabecalhoAdicionarPessoa.setLayout(jpCabecalhoAdicionarPessoaLayout);
        jpCabecalhoAdicionarPessoaLayout.setHorizontalGroup(
            jpCabecalhoAdicionarPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCabecalhoAdicionarPessoaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlCabecalhoAdicionaPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jpCabecalhoAdicionarPessoaLayout.setVerticalGroup(
            jpCabecalhoAdicionarPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabecalhoAdicionarPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCabecalhoAdicionaPessoa)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jlNomePessoa.setText("Selecione o paciente:");

        jlDataInicio.setText("Data Início do Isolamento:");

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jlCabecalhoSintomas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlCabecalhoSintomas.setForeground(new java.awt.Color(255, 255, 255));
        jlCabecalhoSintomas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCabecalhoSintomas.setText("Sintomas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlCabecalhoSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCabecalhoSintomas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jcFebre.setBackground(new java.awt.Color(255, 255, 255));
        jcFebre.setText("Febre");

        jcTosseSeca.setBackground(new java.awt.Color(255, 255, 255));
        jcTosseSeca.setText("Tosse Seca");

        jcDorDeCabeça.setBackground(new java.awt.Color(255, 255, 255));
        jcDorDeCabeça.setText("Dor de Cabeça");

        jcCansaco.setBackground(new java.awt.Color(255, 255, 255));
        jcCansaco.setText("Casanço");

        jcDificuldadeParaRespirar.setBackground(new java.awt.Color(255, 255, 255));
        jcDificuldadeParaRespirar.setText("Dificuldade para respirar");

        jcSemSintomas.setBackground(new java.awt.Color(255, 255, 255));
        jcSemSintomas.setText("Sem Sintomas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcDorDeCabeça)
                    .addComponent(jcTosseSeca)
                    .addComponent(jcFebre))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jcDificuldadeParaRespirar)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcCansaco)
                            .addComponent(jcSemSintomas))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jcCansaco)
                        .addGap(18, 18, 18)
                        .addComponent(jcDificuldadeParaRespirar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcSemSintomas))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addComponent(jcFebre)
                        .addGap(18, 18, 18)
                        .addComponent(jcTosseSeca)
                        .addGap(18, 18, 18)
                        .addComponent(jcDorDeCabeça)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Medicação");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(164, 164, 164))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtMedicacao.setColumns(20);
        jtMedicacao.setRows(5);
        jScrollPane1.setViewportView(jtMedicacao);

        jbFimQuarentena.setBackground(new java.awt.Color(51, 204, 255));
        jbFimQuarentena.setText("Finalizar Quarentena");
        jbFimQuarentena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFimQuarentenaActionPerformed(evt);
            }
        });

        cbxPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPacienteActionPerformed(evt);
            }
        });

        jbAtualizarDados.setText("Atualizar Dados do Paciente");
        jbAtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarDadosActionPerformed(evt);
            }
        });

        try {
            jftfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftfDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCabecalhoAdicionarPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDataInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlNomePessoa, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxPaciente, 0, 174, Short.MAX_VALUE)
                            .addComponent(jftfData)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbFimQuarentena, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                            .addComponent(jbAtualizarDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCabecalhoAdicionarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomePessoa)
                    .addComponent(cbxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDataInicio)
                    .addComponent(jftfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jbAtualizarDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbFimQuarentena)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPacienteActionPerformed
        buscarPaciente();
    }//GEN-LAST:event_cbxPacienteActionPerformed

    private void jbFimQuarentenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFimQuarentenaActionPerformed
        finalizarQuarentena();
        
        
                
        
    }//GEN-LAST:event_jbFimQuarentenaActionPerformed

    private void jbAtualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarDadosActionPerformed
       alterarDados();
    }//GEN-LAST:event_jbAtualizarDadosActionPerformed

    private void jftfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftfDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtualizarDados;
    private javax.swing.JButton jbFimQuarentena;
    private javax.swing.JCheckBox jcCansaco;
    private javax.swing.JCheckBox jcDificuldadeParaRespirar;
    private javax.swing.JCheckBox jcDorDeCabeça;
    private javax.swing.JCheckBox jcFebre;
    private javax.swing.JCheckBox jcSemSintomas;
    private javax.swing.JCheckBox jcTosseSeca;
    private javax.swing.JFormattedTextField jftfData;
    private javax.swing.JLabel jlCabecalhoAdicionaPessoa;
    private javax.swing.JLabel jlCabecalhoSintomas;
    private javax.swing.JLabel jlDataInicio;
    private javax.swing.JLabel jlNomePessoa;
    private javax.swing.JPanel jpCabecalhoAdicionarPessoa;
    private javax.swing.JTextArea jtMedicacao;
    // End of variables declaration//GEN-END:variables
}
