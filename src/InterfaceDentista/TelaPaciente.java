package InterfaceDentista;


import Persistencia.BancoPaciente;
import Persistencia.ConexaoBD;
import Negocio.ModeloPaciente;
import Negocio.ModeloTabeladen;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class TelaPaciente extends javax.swing.JFrame {
    ModeloPaciente pac = new ModeloPaciente();
    BancoPaciente banco = new BancoPaciente();
    ConexaoBD conec = new ConexaoBD();
    int flag=0;
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPaciente() {
        initComponents();
        preencherTabela("select *from bdpaciente order by codigo");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxsexopaciente = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        novopaciente = new javax.swing.JButton();
        codigopaciente = new javax.swing.JTextField();
        salvarpaciente = new javax.swing.JButton();
        cancelarpaciente = new javax.swing.JButton();
        alterarpaciente = new javax.swing.JButton();
        excluirpaciente = new javax.swing.JButton();
        jFormattedcpfpaciente = new javax.swing.JFormattedTextField();
        jFormattedceppaciente = new javax.swing.JFormattedTextField();
        jComboBoxufpaciente = new javax.swing.JComboBox<>();
        jFormattedemailpaciente = new javax.swing.JFormattedTextField();
        endpaciente = new javax.swing.JTextField();
        nomepaciente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bairropaciente = new javax.swing.JTextField();
        jFormattedtelefonepaciente = new javax.swing.JFormattedTextField();
        cidadepaciente = new javax.swing.JTextField();
        pesquisapaciente = new javax.swing.JTextField();
        pesquisarpaciente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelapaciente = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tela de Paciente");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Codigo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 30, 50, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nome:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 20, 50, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(460, 30, 70, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Cidade:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 130, 80, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Endereço:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 80, 90, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Sexo:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(600, 20, 40, 40);

        jComboBoxsexopaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxsexopaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", " " }));
        jComboBoxsexopaciente.setEnabled(false);
        getContentPane().add(jComboBoxsexopaciente);
        jComboBoxsexopaciente.setBounds(600, 50, 60, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Cpf:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 80, 50, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Cep:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 130, 50, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("UF");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(290, 130, 50, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("E-mail:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(360, 130, 50, 20);

        novopaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        novopaciente.setText("Novo");
        novopaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novopacienteActionPerformed(evt);
            }
        });
        getContentPane().add(novopaciente);
        novopaciente.setBounds(10, 380, 100, 30);

        codigopaciente.setEnabled(false);
        getContentPane().add(codigopaciente);
        codigopaciente.setBounds(10, 50, 80, 30);

        salvarpaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        salvarpaciente.setText("Salvar");
        salvarpaciente.setEnabled(false);
        salvarpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarpacienteActionPerformed(evt);
            }
        });
        getContentPane().add(salvarpaciente);
        salvarpaciente.setBounds(120, 380, 100, 30);

        cancelarpaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelarpaciente.setText("Cancelar");
        cancelarpaciente.setEnabled(false);
        cancelarpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarpacienteActionPerformed(evt);
            }
        });
        getContentPane().add(cancelarpaciente);
        cancelarpaciente.setBounds(230, 380, 100, 30);

        alterarpaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        alterarpaciente.setText("Alterar");
        alterarpaciente.setEnabled(false);
        alterarpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarpacienteActionPerformed(evt);
            }
        });
        getContentPane().add(alterarpaciente);
        alterarpaciente.setBounds(340, 380, 100, 30);

        excluirpaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        excluirpaciente.setText("Excluir");
        excluirpaciente.setEnabled(false);
        excluirpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirpacienteActionPerformed(evt);
            }
        });
        getContentPane().add(excluirpaciente);
        excluirpaciente.setBounds(450, 380, 100, 30);

        try {
            jFormattedcpfpaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedcpfpaciente.setEnabled(false);
        jFormattedcpfpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedcpfpacienteActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedcpfpaciente);
        jFormattedcpfpaciente.setBounds(10, 100, 130, 30);

        try {
            jFormattedceppaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedceppaciente.setEnabled(false);
        jFormattedceppaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedceppacienteActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedceppaciente);
        jFormattedceppaciente.setBounds(10, 150, 130, 30);

        jComboBoxufpaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxufpaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UF", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", " " }));
        jComboBoxufpaciente.setEnabled(false);
        getContentPane().add(jComboBoxufpaciente);
        jComboBoxufpaciente.setBounds(290, 150, 60, 30);

        jFormattedemailpaciente.setEnabled(false);
        jFormattedemailpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedemailpacienteActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedemailpaciente);
        jFormattedemailpaciente.setBounds(360, 150, 300, 30);

        endpaciente.setEnabled(false);
        endpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endpacienteActionPerformed(evt);
            }
        });
        getContentPane().add(endpaciente);
        endpaciente.setBounds(150, 100, 300, 30);

        nomepaciente.setEnabled(false);
        getContentPane().add(nomepaciente);
        nomepaciente.setBounds(100, 50, 350, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Bairro:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(460, 80, 80, 20);

        bairropaciente.setEnabled(false);
        bairropaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairropacienteActionPerformed(evt);
            }
        });
        getContentPane().add(bairropaciente);
        bairropaciente.setBounds(460, 100, 200, 30);

        try {
            jFormattedtelefonepaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedtelefonepaciente.setEnabled(false);
        getContentPane().add(jFormattedtelefonepaciente);
        jFormattedtelefonepaciente.setBounds(460, 50, 130, 30);

        cidadepaciente.setEnabled(false);
        cidadepaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadepacienteActionPerformed(evt);
            }
        });
        getContentPane().add(cidadepaciente);
        cidadepaciente.setBounds(150, 150, 130, 30);

        pesquisapaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisapacienteActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisapaciente);
        pesquisapaciente.setBounds(120, 200, 280, 30);

        pesquisarpaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pesquisarpaciente.setText("Pesquisar");
        pesquisarpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarpacienteActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarpaciente);
        pesquisarpaciente.setBounds(10, 200, 110, 30);

        tabelapaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Cpf", "Telefone", "Endereço", "Sexo"
            }
        ));
        tabelapaciente.getTableHeader().setReorderingAllowed(false);
        tabelapaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelapacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelapaciente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 230, 650, 150);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Fechar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(560, 380, 100, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fundo_vida_1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 110, 670, 310);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fundo_vida_1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 320);

        setSize(new java.awt.Dimension(674, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void novopacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novopacienteActionPerformed
        flag=1;
        nomepaciente.setEnabled(true);
        jFormattedtelefonepaciente.setEnabled(true);
        jFormattedcpfpaciente.setEnabled(true);
        endpaciente.setEnabled(true);
        bairropaciente.setEnabled(true);
        cidadepaciente.setEnabled(true);
        jFormattedceppaciente.setEnabled(true);
        jComboBoxufpaciente.setEnabled(true);
        jFormattedemailpaciente.setEnabled(true);
        jComboBoxsexopaciente.setEnabled(true);
        salvarpaciente.setEnabled(true);
        cancelarpaciente.setEnabled(true);
        pesquisapaciente.setEnabled(false);
        pesquisarpaciente.setEnabled(false);
        codigopaciente.setText("");
        nomepaciente.setText("");
        jFormattedtelefonepaciente.setText("");
        jFormattedcpfpaciente.setText("");
        endpaciente.setText("");
        bairropaciente.setText("");
        cidadepaciente.setText("");
        jFormattedceppaciente.setText("");
        jFormattedemailpaciente.setText("");
    
    }//GEN-LAST:event_novopacienteActionPerformed

    private void salvarpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarpacienteActionPerformed
        if(nomepaciente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nome do paciente é obrigatório!!!");
            nomepaciente.requestFocus();
        }else if(jFormattedtelefonepaciente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Telefone do paciente é obrigatório!!!");
            jFormattedtelefonepaciente.requestFocus();
        }else if(jFormattedcpfpaciente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Cpf do paciente é obrigatório!!!");
            jFormattedcpfpaciente.requestFocus();
        }else if(endpaciente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Endereço do paciente é obrigatório!!!");
            endpaciente.requestFocus();
        }else if(cidadepaciente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Cidade do paciente é obrigatório!!!");
            cidadepaciente.requestFocus();
        }else if(jFormattedceppaciente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Cep do paciente é obrigatório!!!");
            jFormattedceppaciente.requestFocus();
        }else if(jFormattedemailpaciente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Email do paciente é obrigatório!!!");
            jFormattedemailpaciente.requestFocus();
        }else if(bairropaciente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Bairro do paciente é obrigatório!!!");
            bairropaciente.requestFocus();
        }

        else

        if(flag==1){
            pac.setNome(nomepaciente.getText());
            pac.setTelefone(jFormattedtelefonepaciente.getText());
            pac.setCpf(jFormattedcpfpaciente.getText());
            pac.setEndereco(endpaciente.getText());
            pac.setBairro(bairropaciente.getText());
            pac.setCidade(cidadepaciente.getText());
            pac.setCep(jFormattedceppaciente.getText());
            pac.setUf((String)jComboBoxufpaciente.getSelectedItem());
            pac.setEmail(jFormattedemailpaciente.getText());
            pac.setSexo((String)jComboBoxsexopaciente.getSelectedItem());
            
            banco.salvar(pac);
            nomepaciente.setText("");
            jFormattedtelefonepaciente.setText("");
            jFormattedcpfpaciente.setText("");
            endpaciente.setText("");
            bairropaciente.setText("");
            cidadepaciente.setText("");
            jFormattedceppaciente.setText("");
            jFormattedemailpaciente.setText("");
            
            nomepaciente.setEnabled(false);
            jFormattedtelefonepaciente.setEnabled(false);
            jFormattedcpfpaciente.setEnabled(false);
            endpaciente.setEnabled(false);
            bairropaciente.setEnabled(false);
            cidadepaciente.setEnabled(false);
            jFormattedceppaciente.setEnabled(false);
            jComboBoxufpaciente.setEnabled(false);
            jFormattedemailpaciente.setEnabled(false);
            jComboBoxsexopaciente.setEnabled(false);
            
            salvarpaciente.setEnabled(false);
            pesquisapaciente.setEnabled(true);
            pesquisarpaciente.setEnabled(true);
            cancelarpaciente.setEnabled(false);
            preencherTabela("select *from bdpaciente order by codigo");
        }else{
            pac.setCodigo((Integer.parseInt(codigopaciente.getText())));
            pac.setNome(nomepaciente.getText());
            pac.setTelefone(jFormattedtelefonepaciente.getText());
            pac.setCpf(jFormattedcpfpaciente.getText());
            pac.setEndereco(endpaciente.getText());
            pac.setBairro(bairropaciente.getText());
            pac.setCidade(cidadepaciente.getText());
            pac.setCep(jFormattedceppaciente.getText());
            pac.setUf((String)jComboBoxufpaciente.getSelectedItem());
            pac.setEmail(jFormattedemailpaciente.getText());
            pac.setSexo((String)jComboBoxsexopaciente.getSelectedItem());
            

            banco.Editar(pac);
            codigopaciente.setText("");
            nomepaciente.setText("");
            jFormattedtelefonepaciente.setText("");
            jFormattedcpfpaciente.setText("");
            endpaciente.setText("");
            bairropaciente.setText("");
            cidadepaciente.setText("");
            jFormattedceppaciente.setText("");
            jFormattedemailpaciente.setText("");
            
            nomepaciente.setEnabled(false);
            jFormattedtelefonepaciente.setEnabled(false);
            jFormattedcpfpaciente.setEnabled(false);
            endpaciente.setEnabled(false);
            bairropaciente.setEnabled(false);
            cidadepaciente.setEnabled(false);
            jFormattedceppaciente.setEnabled(false);
            jComboBoxufpaciente.setEnabled(false);
            jFormattedemailpaciente.setEnabled(false);
            jComboBoxsexopaciente.setEnabled(false);
            
            salvarpaciente.setEnabled(false);
            novopaciente.setEnabled(true);
            cancelarpaciente.setEnabled(false);
            pesquisarpaciente.setEnabled(true);
            pesquisapaciente.setEnabled(true);
            preencherTabela("select *from bdpaciente order by codigo");

        }
    }//GEN-LAST:event_salvarpacienteActionPerformed

    private void cancelarpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarpacienteActionPerformed
        nomepaciente.setEnabled(!true);
        jFormattedtelefonepaciente.setEnabled(!true);
        jFormattedcpfpaciente.setEnabled(!true);
        endpaciente.setEnabled(!true);
        bairropaciente.setEnabled(!true);
        cidadepaciente.setEnabled(!true);
        jFormattedceppaciente.setEnabled(!true);
        jComboBoxufpaciente.setEnabled(!true);
        jFormattedemailpaciente.setEnabled(!true);
        jComboBoxsexopaciente.setEnabled(!true);
        salvarpaciente.setEnabled(!true);
        cancelarpaciente.setEnabled(!true);
        novopaciente.setEnabled(true);
        alterarpaciente.setEnabled(false);
        excluirpaciente.setEnabled(false);
        pesquisapaciente.setEnabled(true);
        pesquisarpaciente.setEnabled(true);
    }//GEN-LAST:event_cancelarpacienteActionPerformed

    private void alterarpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarpacienteActionPerformed
        flag=2;
        nomepaciente.setEnabled(true);
        jFormattedtelefonepaciente.setEnabled(true);
        jFormattedcpfpaciente.setEnabled(true);
        endpaciente.setEnabled(true);
        bairropaciente.setEnabled(true);
        cidadepaciente.setEnabled(true);
        jFormattedceppaciente.setEnabled(true);
        jComboBoxufpaciente.setEnabled(true);
        jFormattedemailpaciente.setEnabled(true);
        jComboBoxsexopaciente.setEnabled(true);
        salvarpaciente.setEnabled(true);
        cancelarpaciente.setEnabled(true);
        alterarpaciente.setEnabled(false);
        excluirpaciente.setEnabled(false);
        pesquisapaciente.setEnabled(false);
        pesquisarpaciente.setEnabled(false);
        novopaciente.setEnabled(false);

        preencherTabela("select * from bdpaciente order by codigo");
    }//GEN-LAST:event_alterarpacienteActionPerformed

    private void excluirpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirpacienteActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir cadastro?");
        if(resposta==JOptionPane.YES_OPTION){
            pac.setCodigo(Integer.parseInt(codigopaciente.getText()));
            banco.Excluir(pac);
            codigopaciente.setText("");
            nomepaciente.setText("");
            jFormattedtelefonepaciente.setText("");
            jFormattedcpfpaciente.setText("");
            endpaciente.setText("");
            bairropaciente.setText("");
            cidadepaciente.setText("");
            jFormattedceppaciente.setText("");
            jFormattedemailpaciente.setText("");
           
            nomepaciente.setEnabled(false);
            jFormattedtelefonepaciente.setEnabled(false);
            jFormattedcpfpaciente.setEnabled(false);
            endpaciente.setEnabled(false);
            bairropaciente.setEnabled(false);
            cidadepaciente.setEnabled(false);
            jFormattedceppaciente.setEnabled(false);
            jComboBoxufpaciente.setEnabled(false);
            jFormattedemailpaciente.setEnabled(false);
            
            salvarpaciente.setEnabled(false);
            pesquisapaciente.setEnabled(true);
            pesquisarpaciente.setEnabled(true);
            alterarpaciente.setEnabled(false);
            excluirpaciente.setEnabled(false);
            preencherTabela("select *from bdpaciente order by codigo");

        }
    }//GEN-LAST:event_excluirpacienteActionPerformed

    private void jFormattedcpfpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedcpfpacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedcpfpacienteActionPerformed

    private void jFormattedceppacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedceppacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedceppacienteActionPerformed

    private void jFormattedemailpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedemailpacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedemailpacienteActionPerformed

    private void endpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endpacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endpacienteActionPerformed

    private void cidadepacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadepacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadepacienteActionPerformed

    private void pesquisapacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisapacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisapacienteActionPerformed

    private void pesquisarpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarpacienteActionPerformed
        pac.setPesquisa(pesquisapaciente.getText());
        ModeloPaciente modelo = banco.buscaPaciente(pac);
        codigopaciente.setText(String.valueOf(modelo.getCodigo()));
        nomepaciente.setText(modelo.getNome());
        jFormattedtelefonepaciente.setText(modelo.getTelefone());
        jFormattedcpfpaciente.setText(modelo.getCpf());
        endpaciente.setText(modelo.getEndereco());
        bairropaciente.setText(modelo.getBairro());
        cidadepaciente.setText(modelo.getCidade());
        jFormattedceppaciente.setText(modelo.getCep());
        jComboBoxufpaciente.setSelectedItem(modelo.getUf());
        jFormattedemailpaciente.setText(modelo.getEmail());
        jComboBoxsexopaciente.setSelectedItem(modelo.getSexo());
        alterarpaciente.setEnabled(true);
        excluirpaciente.setEnabled(true);
        alterarpaciente.setEnabled(false);
        excluirpaciente.setEnabled(false);
        preencherTabela("select * from bdpaciente where nome like'%"+pac.getPesquisa()+"%'");
    }//GEN-LAST:event_pesquisarpacienteActionPerformed

    private void tabelapacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelapacienteMouseClicked
        String nome =""+tabelapaciente.getValueAt(tabelapaciente.getSelectedRow(), 1);
        conec.conexao();
        conec.executaSql("select * from bdpaciente where nome='"+nome+"'");
        try {
            conec.rs.first();
            codigopaciente.setText(String.valueOf(conec.rs.getInt("codigo")));
            nomepaciente.setText(conec.rs.getString("nome"));
            jFormattedtelefonepaciente.setText(conec.rs.getString("telefone"));
            jFormattedcpfpaciente.setText(conec.rs.getString("cpf"));
            endpaciente.setText(conec.rs.getString("endereco"));
            bairropaciente.setText(conec.rs.getString("bairro"));
            cidadepaciente.setText(conec.rs.getString("cidade"));
            jFormattedceppaciente.setText(conec.rs.getString("cep"));
            jComboBoxufpaciente.setSelectedItem(conec.rs.getString("uf"));
            jFormattedemailpaciente.setText(conec.rs.getString("email"));
            jComboBoxsexopaciente.setSelectedItem(conec.rs.getString("sexo"));
            alterarpaciente.setEnabled(true);
            excluirpaciente.setEnabled(true);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel selecionar dados do Paciente!!!\n Erro"+ex.getMessage());
        }

        conec.desconectar();

    }//GEN-LAST:event_tabelapacienteMouseClicked

    private void bairropacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairropacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairropacienteActionPerformed

        public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"Codigo","Nome","Telefone","Cpf","Endereço","Bairro"};
        conec.conexao();
        conec.executaSql(Sql);
        
        try{
         conec.rs.first();
         do{
             
          dados.add(new Object[]{conec.rs.getInt("codigo"),conec.rs.getString("nome"),conec.rs.getString("telefone"),conec.rs.getString("cpf"),conec.rs.getString("endereco"),conec.rs.getString("bairro")});
         
         }while(conec.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane,"Tabela de Paciente sem registro");
        }
            ModeloTabeladen tabela = new ModeloTabeladen(dados,colunas);
            
            tabelapaciente.setModel(tabela);
            tabelapaciente.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelapaciente.getColumnModel().getColumn(0).setResizable(false);
            tabelapaciente.getColumnModel().getColumn(1).setPreferredWidth(160);
            tabelapaciente.getColumnModel().getColumn(1).setResizable(false);
            tabelapaciente.getColumnModel().getColumn(2).setPreferredWidth(95);
            tabelapaciente.getColumnModel().getColumn(2).setResizable(false);
            tabelapaciente.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabelapaciente.getColumnModel().getColumn(3).setResizable(false);
            tabelapaciente.getColumnModel().getColumn(4).setPreferredWidth(160);
            tabelapaciente.getColumnModel().getColumn(4).setResizable(false);
            tabelapaciente.getColumnModel().getColumn(5).setPreferredWidth(100);
            tabelapaciente.getColumnModel().getColumn(5).setResizable(false);
            tabelapaciente.getTableHeader().setReorderingAllowed(false);
            tabelapaciente.setAutoResizeMode(tabelapaciente.AUTO_RESIZE_OFF);
            tabelapaciente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            
        conec.desconectar();
        
    }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarpaciente;
    private javax.swing.JTextField bairropaciente;
    private javax.swing.JButton cancelarpaciente;
    private javax.swing.JTextField cidadepaciente;
    private javax.swing.JTextField codigopaciente;
    private javax.swing.JTextField endpaciente;
    private javax.swing.JButton excluirpaciente;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxsexopaciente;
    private javax.swing.JComboBox<String> jComboBoxufpaciente;
    private javax.swing.JFormattedTextField jFormattedceppaciente;
    private javax.swing.JFormattedTextField jFormattedcpfpaciente;
    private javax.swing.JFormattedTextField jFormattedemailpaciente;
    private javax.swing.JFormattedTextField jFormattedtelefonepaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomepaciente;
    private javax.swing.JButton novopaciente;
    private javax.swing.JTextField pesquisapaciente;
    private javax.swing.JButton pesquisarpaciente;
    private javax.swing.JButton salvarpaciente;
    private javax.swing.JTable tabelapaciente;
    // End of variables declaration//GEN-END:variables
}
