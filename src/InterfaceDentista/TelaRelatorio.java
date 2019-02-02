package InterfaceDentista;


import Persistencia.BancoConsulta;
import Persistencia.ConexaoBD;
import Negocio.ModeloConsulta;
import Negocio.ModeloTabeladen;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import static com.itextpdf.text.PageSize.A4;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAILSON
 */
public class TelaRelatorio extends javax.swing.JFrame {

   ConexaoBD conect = new ConexaoBD();
   ModeloConsulta consulta = new ModeloConsulta();
   BancoConsulta banc = new BancoConsulta();
    String datahoje;
    String status;
    
    
    public TelaRelatorio() {
        initComponents();
        Calendar data = Calendar.getInstance();
        Date d = data.getTime();
        SimpleDateFormat datefor = new SimpleDateFormat("yyyy/MM/dd");
        datefor.format(d);
        status = "AGUARDANDO";
        
        datahoje = datefor.format(d);
        preencherTabela("select * from bdconsulta where data='"+datahoje+"'and status='"+status+"' order by registro");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        finalizar = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        gerarpdf = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelarelatorio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tela De Consultas Marcadas");
        setResizable(false);
        getContentPane().setLayout(null);

        finalizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        finalizar.setText("Finalizar");
        finalizar.setEnabled(false);
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });
        getContentPane().add(finalizar);
        finalizar.setBounds(440, 380, 100, 30);

        fechar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fechar.setText("Fechar");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });
        getContentPane().add(fechar);
        fechar.setBounds(540, 380, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Consultas Marcadas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 10, 200, 22);

        gerarpdf.setBackground(new java.awt.Color(255, 255, 255));
        gerarpdf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gerarpdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/impressora.png"))); // NOI18N
        gerarpdf.setText("Imprimir");
        gerarpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarpdfActionPerformed(evt);
            }
        });
        getContentPane().add(gerarpdf);
        gerarpdf.setBounds(510, 20, 130, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Consultas do dia:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 50, 150, 20);

        tabelarelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
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
                "Registro", "Codigo Paciente", "Nome Paciente", "Nome Dentista", "Status", "Data"
            }
        ));
        tabelarelatorio.getTableHeader().setReorderingAllowed(false);
        tabelarelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelarelatorioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelarelatorio);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 640, 290);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fundo_vida_1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 260, 670, 160);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fundo_vida_1.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 670, 330);

        getAccessibleContext().setAccessibleName("Tela De Consulta Marcadas");
        getAccessibleContext().setAccessibleDescription("Tela de Relatorio");

        setSize(new java.awt.Dimension(659, 449));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelarelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelarelatorioMouseClicked
      String registro =""+tabelarelatorio.getValueAt(tabelarelatorio.getSelectedRow(), 0);
        conect.conexao();
        conect.executaSql("select * from bdconsulta where registro='"+registro+"'");
        
        try {
            
            conect.rs.first();
           consulta.setStatus("ATENDIDO");
           consulta.setRegistro(conect.rs.getInt("registro"));
          finalizar.setEnabled(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel selecionar dados!!!\n Erro"+ex.getMessage());
        }
        
        conect.desconectar();  
    }//GEN-LAST:event_tabelarelatorioMouseClicked

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
       
        
          banc.Editar(consulta);
          preencherTabela("select * from bdconsulta inner join bdpaciente on codigo=codigo_paciente where data='"+datahoje+"'and status='"+status+"' order by registro");
          this.dispose();
      
    }//GEN-LAST:event_finalizarActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_fecharActionPerformed

    private void gerarpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarpdfActionPerformed
        Document doc = new Document();
        Font f = new Font(FontFamily.COURIER, 20, Font.BOLD);
        Font f1 = new Font(FontFamily.COURIER, 14, Font.BOLD);

            
        try {
            
            PdfWriter.getInstance(doc, new FileOutputStream("Relatorio de consultas.pdf"));
            doc.open();
            doc.setPageSize(A4);
            
            
            try {
            Paragraph p1 = new Paragraph("Data: "+datahoje, f1);
            p1.setAlignment(Element.ALIGN_RIGHT);
            doc.add(p1); 
            
             Image img = Image.getInstance("logoclinica.png");
             img.setAlignment(Element.ALIGN_CENTER);
             doc.add(img);
            } catch (BadElementException | IOException ex) {
                System.out.println("Erro!!!"+ex);
            }
             
            
//            Paragraph p = new Paragraph("CLINICA ODONTOLOGICA DOM PEDRO II\n\n",f);
//            p.setAlignment(Element.ALIGN_CENTER);
//            doc.add(p);
            
            PdfPTable tabela = new PdfPTable(6);
            
            tabela = new PdfPTable(new float[] { 0.2f, 0.2f, 0.6f, 0.4f, 0.4f, 0.3f });
            tabela.setTotalWidth(550);
            tabela.setLockedWidth(true);
            PdfPCell cabecalho = new PdfPCell(new Paragraph("Consultas do dia:", f));
            cabecalho.setHorizontalAlignment(Element.ALIGN_CENTER);
           
            cabecalho.setBackgroundColor(BaseColor.GREEN);
            cabecalho.setColspan(6);
            tabela.addCell(cabecalho);
            tabela.addCell("Registro");
            tabela.addCell("Cod. paciente");
            tabela.addCell("Nome paciente");
            tabela.addCell("Nome dentista");
            tabela.addCell("status");
            tabela.addCell("Data");
            conect.conexao();
            conect.executaSql("select * from bdconsulta where data='"+datahoje+"'order by status");
            try {
                while(conect.rs.next()){
                    try {

                        tabela.addCell(conect.rs.getString("registro"));
                        tabela.addCell(conect.rs.getString("codigo_paciente"));
                        tabela.addCell(conect.rs.getString("nome_paciente"));
                        tabela.addCell(conect.rs.getString("nome_dentista"));
                        tabela.addCell(conect.rs.getString("status"));
                        tabela.addCell(conect.rs.getString("data"));
                    } catch (SQLException ex) {
                        System.out.println("Erro!!!"+ex);
                    }
                }
            } catch (SQLException ex) {
                System.out.println("Erro!!!"+ex);
            }

            doc.add(tabela);

        } catch (DocumentException | FileNotFoundException ex) {
            System.out.println("Erro!!!"+ex);
        }finally{
            doc.close();
        }
        try {
            Desktop.getDesktop().open(new File("Relatorio de consultas.pdf"));
        } catch (IOException ex) {
            System.out.println("Erro!!!"+ex);
        }conect.desconectar();
    }//GEN-LAST:event_gerarpdfActionPerformed

    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"Registro","Codigo Paciente","Nome do Paciente","Nome do Dentista","Status","Data"};
        conect.conexao();
        conect.executaSql(Sql);
        
        try{
         conect.rs.first();
         do{
             
          dados.add(new Object[]{conect.rs.getInt("registro"),conect.rs.getInt("codigo_paciente"),conect.rs.getString("nome_paciente"),conect.rs.getString("nome_dentista"),conect.rs.getString("status"),conect.rs.getDate("data")});
         
         }while(conect.rs.next());
        }catch(SQLException ex){
            
         //  JOptionPane.showMessageDialog(rootPane,"Não existe consulta marcada para hoje!!!");
        }
            ModeloTabeladen tabela = new ModeloTabeladen(dados,colunas);
            
            tabelarelatorio.setModel(tabela);
            tabelarelatorio.getColumnModel().getColumn(0).setPreferredWidth(60);
            tabelarelatorio.getColumnModel().getColumn(0).setResizable(false);
            tabelarelatorio.getColumnModel().getColumn(1).setPreferredWidth(110);
            tabelarelatorio.getColumnModel().getColumn(1).setResizable(false);
            tabelarelatorio.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabelarelatorio.getColumnModel().getColumn(2).setResizable(false);
            tabelarelatorio.getColumnModel().getColumn(3).setPreferredWidth(150);
            tabelarelatorio.getColumnModel().getColumn(3).setResizable(false);
            tabelarelatorio.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabelarelatorio.getColumnModel().getColumn(4).setResizable(false);
            tabelarelatorio.getColumnModel().getColumn(5).setPreferredWidth(90);
            tabelarelatorio.getColumnModel().getColumn(5).setResizable(false);
            tabelarelatorio.getTableHeader().setReorderingAllowed(false);
            tabelarelatorio.setAutoResizeMode(tabelarelatorio.AUTO_RESIZE_OFF);
            tabelarelatorio.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            
        conect.desconectar();
        
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
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fechar;
    private javax.swing.JButton finalizar;
    private javax.swing.JButton gerarpdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelarelatorio;
    // End of variables declaration//GEN-END:variables
}
