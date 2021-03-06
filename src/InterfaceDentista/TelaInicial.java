package InterfaceDentista;


import Persistencia.ConexaoBD;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauro
 */
public class TelaInicial extends javax.swing.JFrame {
    //GridBagLayout layout = new GridBagLayout();
    
    ConexaoBD conecta = new ConexaoBD();
    TelaDentista dentista = new TelaDentista();
    TelaFuncionario funcionario = new TelaFuncionario();
    TelaPaciente paciente = new TelaPaciente();
    TelaConsulta consulta = new TelaConsulta();
    TelaRelatorio relatorio = new TelaRelatorio();
   
    public TelaInicial(String usu) {
        initComponents();
        
        
        
       apresentacao.setVisible(false);

        jLabelusuario.setText(usu);
       conecta.conexao();
    }

    private TelaInicial() {
      //getContentPane().setLayout(layout);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnrelatorio = new javax.swing.JButton();
        btnpaciente = new javax.swing.JButton();
        btndentista = new javax.swing.JButton();
        btnfuncionario = new javax.swing.JButton();
        btnfechar = new javax.swing.JButton();
        btnconsulta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        apresentacao = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelusuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menudentista = new javax.swing.JMenuItem();
        menufuncionario = new javax.swing.JMenuItem();
        menupaciente = new javax.swing.JMenuItem();
        menuconsulta = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tela Inicial");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Usuario:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 630, 50, 30);

        btnrelatorio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnrelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/relatorio.png"))); // NOI18N
        btnrelatorio.setText("Relatorio");
        btnrelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnrelatorio.setVerifyInputWhenFocusTarget(false);
        btnrelatorio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnrelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnrelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(btnrelatorio);
        btnrelatorio.setBounds(620, 80, 120, 80);

        btnpaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnpaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/paciente.png"))); // NOI18N
        btnpaciente.setText("Paciente");
        btnpaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpaciente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnpaciente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnpaciente);
        btnpaciente.setBounds(310, 80, 150, 80);

        btndentista.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndentista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/dentista.png"))); // NOI18N
        btndentista.setText("Dentista");
        btndentista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndentista.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btndentista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btndentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndentistaActionPerformed(evt);
            }
        });
        getContentPane().add(btndentista);
        btndentista.setBounds(10, 80, 140, 80);

        btnfuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnfuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/tec.png"))); // NOI18N
        btnfuncionario.setText("Funcionario");
        btnfuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnfuncionario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnfuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnfuncionario);
        btnfuncionario.setBounds(160, 80, 140, 80);

        btnfechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnfechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/sair.png"))); // NOI18N
        btnfechar.setText("Fechar");
        btnfechar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnfechar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnfechar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfecharActionPerformed(evt);
            }
        });
        getContentPane().add(btnfechar);
        btnfechar.setBounds(750, 80, 100, 80);

        btnconsulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnconsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/consulta.png"))); // NOI18N
        btnconsulta.setText("Consulta");
        btnconsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnconsulta.setVerifyInputWhenFocusTarget(false);
        btnconsulta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnconsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultaActionPerformed(evt);
            }
        });
        getContentPane().add(btnconsulta);
        btnconsulta.setBounds(470, 80, 140, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Clinica Odontologica Dom Pedro");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 10, 520, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fundo_vida.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 870, 200);

        apresentacao.setMinimumSize(new java.awt.Dimension(600, 600));
        apresentacao.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Professor: Pedro kislansky ");
        apresentacao.add(jLabel5);
        jLabel5.setBounds(100, 240, 260, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Marca-Salvador-SITE2_copy_6.png"))); // NOI18N
        apresentacao.add(jLabel6);
        jLabel6.setBounds(60, 10, 370, 140);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sistema desenvolvido por Felipe Alves e Nailson Melo");
        apresentacao.add(jLabel7);
        jLabel7.setBounds(6, 160, 474, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sistema de Clinica Odontologica");
        apresentacao.add(jLabel8);
        jLabel8.setBounds(80, 290, 290, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Atividade da matéria Programação II");
        apresentacao.add(jLabel9);
        jLabel9.setBounds(60, 200, 340, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/img03.jpg"))); // NOI18N
        apresentacao.add(jLabel10);
        jLabel10.setBounds(0, 0, 490, 380);

        getContentPane().add(apresentacao);
        apresentacao.setBounds(180, 220, 490, 380);

        jLabelusuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelusuario.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jLabelusuario);
        jLabelusuario.setBounds(420, 630, 160, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fundo_vida_1_2.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 200, 860, 490);

        jMenu1.setText("Cadastro");

        menudentista.setText("Dentista");
        menudentista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menudentistaMouseClicked(evt);
            }
        });
        menudentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menudentistaActionPerformed(evt);
            }
        });
        jMenu1.add(menudentista);

        menufuncionario.setText("Funcionario");
        menufuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menufuncionarioMouseClicked(evt);
            }
        });
        menufuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menufuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(menufuncionario);

        menupaciente.setText("Paciente");
        menupaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menupacienteActionPerformed(evt);
            }
        });
        jMenu1.add(menupaciente);

        menuconsulta.setText("Consulta");
        menuconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuconsultaActionPerformed(evt);
            }
        });
        jMenu1.add(menuconsulta);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Relatorio");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Apresentação");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu2.setText("Sair");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(864, 722));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfuncionarioActionPerformed
        try {
            conecta.executaSql("select * from bdfuncionario where usuario= '"+jLabelusuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("funcao").equals("ADMINISTRADOR")){
              if(funcionario==null){
                   funcionario=new TelaFuncionario();
                   funcionario.setVisible(true);
                   funcionario.setResizable(false);
                   dentista.dispose();
                   relatorio.dispose();
                   consulta.dispose();
                   paciente.dispose();
                   apresentacao.setVisible(false);
                }else{
                  funcionario.setVisible(true);
                  funcionario.setResizable(false);
                  dentista.dispose();
                  relatorio.dispose();
                  consulta.dispose();
                  paciente.dispose();
                  apresentacao.setVisible(false);
                }  
            }else{
                JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para acessar a Tela de Cadastro do Funcionario!!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para acessar a Tela de Cadastro do Funcionario!!");
        }
    }//GEN-LAST:event_btnfuncionarioActionPerformed

    private void btndentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndentistaActionPerformed
       try {
            conecta.executaSql("select * from bdfuncionario where usuario= '"+jLabelusuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("funcao").equals("ADMINISTRADOR")){
              if(dentista==null){
                   dentista=new TelaDentista();
                   dentista.setVisible(true);
                   dentista.setResizable(false);
                   funcionario.dispose();
                   consulta.dispose();
                   paciente.dispose();
                   relatorio.dispose();
                   apresentacao.setVisible(false);
                }else{
                  dentista.setVisible(true);
                  dentista.setResizable(false); 
                  funcionario.dispose();
                  consulta.dispose();
                  paciente.dispose();
                  relatorio.dispose();
                  apresentacao.setVisible(false);
                } 
            }else{
                JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para acessar a Tela de Cadastro do Dentista!!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para acessar a Tela de Cadastro do Dentista!!");
        }
        
    }//GEN-LAST:event_btndentistaActionPerformed

    private void btnfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfecharActionPerformed
        conecta.desconectar();
        System.exit(0);
    }//GEN-LAST:event_btnfecharActionPerformed

    private void btnpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpacienteActionPerformed
        try {
            conecta.executaSql("select * from bdfuncionario where usuario like '"+jLabelusuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("funcao").equals("RECEPCIONISTA")||conecta.rs.getString("funcao").equals("ADMINISTRADOR")){
              if(funcionario==null){
                   paciente=new TelaPaciente();
                   paciente.setVisible(true);
                   paciente.setResizable(false);
                   dentista.dispose();
                   relatorio.dispose();
                   consulta.dispose();
                   funcionario.dispose();
                   apresentacao.setVisible(false);
                }else{
                  paciente.setVisible(true);
                  paciente.setResizable(false);
                  dentista.dispose();
                  relatorio.dispose();
                  consulta.dispose();
                  funcionario.dispose();
                  apresentacao.setVisible(false);
                }  
            }else{
                JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para acessar a Tela de Cadastro do Paciente!!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para acessar a Tela de Cadastro do Paciente!!");
        }
    }//GEN-LAST:event_btnpacienteActionPerformed

    private void btnconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultaActionPerformed
        try {
            conecta.executaSql("select * from bdfuncionario where usuario= '"+jLabelusuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("funcao").equals("RECEPCIONISTA")||conecta.rs.getString("funcao").equals("ADMINISTRADOR")|| conecta.rs.getString("funcao").equals("DENTISTA")){
              if(funcionario==null){
                   consulta=new TelaConsulta();
                   consulta.setVisible(true);
                   consulta.setResizable(false);
                   dentista.dispose();
                   relatorio.dispose();
                   paciente.dispose();
                   funcionario.dispose();
                   apresentacao.setVisible(false);
                }else{
                  consulta.setVisible(true);
                  consulta.setResizable(false);
                  dentista.dispose();
                  relatorio.dispose();
                  paciente.dispose();
                  funcionario.dispose();
                  apresentacao.setVisible(false);
                }  
            }else{
                JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para acessar a Tela de Cadastro do Consulta!!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para acessar a Tela de Cadastro do Consulta!!");
        }
    }//GEN-LAST:event_btnconsultaActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void menudentistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menudentistaMouseClicked
     
    }//GEN-LAST:event_menudentistaMouseClicked

    private void menufuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menufuncionarioMouseClicked
      
    }//GEN-LAST:event_menufuncionarioMouseClicked

    private void menupacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menupacienteActionPerformed
       try {
            conecta.executaSql("select * from bdfuncionario where usuario= '"+jLabelusuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("funcao").equals("RECEPCIONISTA")||conecta.rs.getString("funcao").equals("ADMINISTRADOR")){
              if(funcionario==null){
                   paciente=new TelaPaciente();
                   paciente.setVisible(true);
                   paciente.setResizable(false);
                   dentista.dispose();
                   relatorio.dispose();
                   consulta.dispose();
                   funcionario.dispose();
                   apresentacao.setVisible(false);
                }else{
                  paciente.setVisible(true);
                  paciente.setResizable(false);
                  dentista.dispose();
                  relatorio.dispose();
                  consulta.dispose();
                  funcionario.dispose();
                  apresentacao.setVisible(false);
                }  
            }else{
                JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para acessar a Tela de Cadastro do Paciente!!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para acessar a Tela de Cadastro do Paciente!!");
        }
    }//GEN-LAST:event_menupacienteActionPerformed

    private void menudentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menudentistaActionPerformed
        
        try {
            conecta.executaSql("select * from bdfuncionario where usuario= '"+jLabelusuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("funcao").equals("ADMINISTRADOR")){
                if(dentista==null){
                   dentista=new TelaDentista();
                   dentista.setVisible(true);
                   dentista.setResizable(false);
                   funcionario.dispose();
                   consulta.dispose();
                   paciente.dispose();
                   relatorio.dispose();
                   apresentacao.setVisible(false);
                }else{
                  dentista.setVisible(true);
                  dentista.setResizable(false); 
                  funcionario.dispose();
                  consulta.dispose();
                  paciente.dispose();
                  relatorio.dispose();
                  apresentacao.setVisible(false);
                }
              
            }else{
                JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para acessar a Tela de Cadastro do Dentista!!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para acessar a Tela de Cadastro do Dentista!!");
        }
        
    }//GEN-LAST:event_menudentistaActionPerformed

    private void menufuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menufuncionarioActionPerformed
      try {
            conecta.executaSql("select * from bdfuncionario where usuario= '"+jLabelusuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("funcao").equals("ADMINISTRADOR")){
              if(funcionario==null){
                   funcionario=new TelaFuncionario();
                   funcionario.setVisible(true);
                   funcionario.setResizable(false);
                   dentista.dispose();
                   relatorio.dispose();
                   consulta.dispose();
                   paciente.dispose();
                   apresentacao.setVisible(false);
                }else{
                  funcionario.setVisible(true);
                  funcionario.setResizable(false);
                  dentista.dispose();
                  relatorio.dispose();
                  consulta.dispose();
                  paciente.dispose();
                  apresentacao.setVisible(false);
                }   
            }else{
                JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para acessar a Tela de Cadastro do Funcionario!!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para acessar a Tela de Cadastro do Funcionario!!");
        }
        
          
    }//GEN-LAST:event_menufuncionarioActionPerformed

    private void menuconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuconsultaActionPerformed
        try {
            conecta.executaSql("select * from bdfuncionario where usuario= '"+jLabelusuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("funcao").equals("RECEPCIONISTA")||conecta.rs.getString("funcao").equals("ADMINISTRADOR")){
              if(funcionario==null){
                   consulta=new TelaConsulta();
                   consulta.setVisible(true);
                   consulta.setResizable(false);
                   dentista.dispose();
                   relatorio.dispose();
                   paciente.dispose();
                   funcionario.dispose();
                   apresentacao.setVisible(false);
                }else{
                  consulta.setVisible(true);
                  consulta.setResizable(false);
                  dentista.dispose();
                  relatorio.dispose();
                  paciente.dispose();
                  funcionario.dispose();
                  apresentacao.setVisible(false);
                }  
            }else{
                JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para acessar a Tela de Cadastro do Consulta!!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para acessar a Tela de Cadastro do Consulta!!");
        }
    }//GEN-LAST:event_menuconsultaActionPerformed

    private void btnrelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrelatorioActionPerformed
        if(relatorio==null){
                   relatorio=new TelaRelatorio();
                   relatorio.setVisible(true);
                   relatorio.setResizable(false);
                   funcionario.dispose();
                   consulta.dispose();
                   paciente.dispose();
                   dentista.dispose();
                   apresentacao.setVisible(false);
                }else{
                  relatorio.setVisible(true);
                  relatorio.setResizable(false);
                  funcionario.dispose();
                  consulta.dispose();
                  paciente.dispose();
                  dentista.dispose();
                  apresentacao.setVisible(false);
                }   
        
    }//GEN-LAST:event_btnrelatorioActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        if(relatorio==null){
                   relatorio=new TelaRelatorio();
                   relatorio.setVisible(true);
                   relatorio.setResizable(false);
                   funcionario.dispose();
                   consulta.dispose();
                   paciente.dispose();
                   dentista.dispose();
                   apresentacao.setVisible(false);
                }else{
                  relatorio.setVisible(true);
                  relatorio.setResizable(false);
                  funcionario.dispose();
                  consulta.dispose();
                  paciente.dispose();
                  dentista.dispose();
                  apresentacao.setVisible(false);
                }   
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
//        GridBagConstraints c = new GridBagConstraints();
//        add(apresentacao,c);    
//        ap.setVisible(true);
       apresentacao.setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel apresentacao;
    private javax.swing.JButton btnconsulta;
    private javax.swing.JButton btndentista;
    private javax.swing.JButton btnfechar;
    private javax.swing.JButton btnfuncionario;
    private javax.swing.JButton btnpaciente;
    private javax.swing.JButton btnrelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelusuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuconsulta;
    private javax.swing.JMenuItem menudentista;
    private javax.swing.JMenuItem menufuncionario;
    private javax.swing.JMenuItem menupaciente;
    // End of variables declaration//GEN-END:variables
}
