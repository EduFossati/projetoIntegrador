/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author user
 */
public class GUIMonitorar extends javax.swing.JInternalFrame {

    modelo.Paciente mp = new modelo.Paciente();
    
    public GUIMonitorar() {
        jlNome.setText(mp.getNome());
        initComponents();
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCabecalhoAdicionarPessoa = new javax.swing.JPanel();
        jlCabecalhoAdicionaPessoa = new javax.swing.JLabel();
        jlNomePessoa = new javax.swing.JLabel();
        jlDataInicio = new javax.swing.JLabel();
        jtfDataInicio = new javax.swing.JTextField();
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
        jTextArea1 = new javax.swing.JTextArea();
        jbSalvarPessoa = new javax.swing.JButton();
        jlNome = new javax.swing.JLabel();

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
            .addGroup(jpCabecalhoAdicionarPessoaLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jlCabecalhoAdicionaPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCabecalhoAdicionarPessoaLayout.setVerticalGroup(
            jpCabecalhoAdicionarPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabecalhoAdicionarPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCabecalhoAdicionaPessoa)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jlNomePessoa.setText("Nome:");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jlCabecalhoSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jbSalvarPessoa.setBackground(new java.awt.Color(51, 204, 255));
        jbSalvarPessoa.setText("Salvar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCabecalhoAdicionarPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDataInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlNomePessoa, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jlNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jbSalvarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCabecalhoAdicionarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlNomePessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDataInicio)
                    .addComponent(jtfDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSalvarPessoa)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbSalvarPessoa;
    private javax.swing.JCheckBox jcCansaco;
    private javax.swing.JCheckBox jcDificuldadeParaRespirar;
    private javax.swing.JCheckBox jcDorDeCabeça;
    private javax.swing.JCheckBox jcFebre;
    private javax.swing.JCheckBox jcSemSintomas;
    private javax.swing.JCheckBox jcTosseSeca;
    private javax.swing.JLabel jlCabecalhoAdicionaPessoa;
    private javax.swing.JLabel jlCabecalhoSintomas;
    private javax.swing.JLabel jlDataInicio;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNomePessoa;
    private javax.swing.JPanel jpCabecalhoAdicionarPessoa;
    private javax.swing.JTextField jtfDataInicio;
    // End of variables declaration//GEN-END:variables
}
