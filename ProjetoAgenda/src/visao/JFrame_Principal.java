/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelos.*;
import persistencia.ContatoDao;


public class JFrame_Principal extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_Principal
     */
    public JFrame_Principal() {
        initComponents();
        setLocationRelativeTo(null);
        setupEmailFieldPlaceholder();

        JTable_Tabela.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent event) {
            if (!event.getValueIsAdjusting() && JTable_Tabela.getSelectedRow() != -1) {
                int row = JTable_Tabela.getSelectedRow();
                JTextField_Nome.setText(JTable_Tabela.getValueAt(row, 0).toString());
                JTextField_Telefone.setText(JTable_Tabela.getValueAt(row, 1).toString());
                JTextField_Email.setText(JTable_Tabela.getValueAt(row, 2).toString());
                String enderecoCompleto = JTable_Tabela.getValueAt(row, 3).toString();
                String[] partesEndereco = enderecoCompleto.split(",");
                JTextField_Logradouro.setText(partesEndereco[0]); // Logradouro
                JTextField_Numero.setText(partesEndereco[1]); // Número
                // Verifica se o complemento existe antes de tentar usá-lo
                if (partesEndereco.length > 2) {
                    JTextField_Complemento.setText(partesEndereco[2]); // Complemento
                } else {
                    JTextField_Complemento.setText(""); // Limpa o campo se não houver complemento
                }
                JTextField_Cidade.setText(partesEndereco[3]); // Cidade
                JTextField_Estado.setText(partesEndereco[4]); // Estado
                JTextField_CEP.setText(partesEndereco[5]); // CEP
            }
        }
        });
    }
    
    private void setupEmailFieldPlaceholder() {
        JTextField_Email.setText("exemplo@dominio.com.br");
        JTextField_Email.setForeground(Color.GRAY);
        JTextField_Email.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (JTextField_Email.getText().equals("exemplo@dominio.com.br")) {
                    JTextField_Email.setText("");
                    JTextField_Email.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (JTextField_Email.getText().isEmpty()) {
                    JTextField_Email.setForeground(Color.GRAY);
                    JTextField_Email.setText("exemplo@dominio.com.br");
                }
            }
        });
    }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTextField_Email = new javax.swing.JTextField();
        JTextField_Nome = new javax.swing.JTextField();
        JButton_Alterar = new javax.swing.JButton();
        JButton_Incluir = new javax.swing.JButton();
        JButton_Listar = new javax.swing.JButton();
        JButton_Consultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Tabela = new javax.swing.JTable();
        JButton_Excluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTextField_Logradouro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTextField_Numero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JTextField_Complemento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JTextField_Cidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JTextField_Estado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JTextField_CEP = new javax.swing.JTextField();
        JTextField_Telefone = new javax.swing.JTextField();

        jTextField3.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("AGENDA DESORGANIZA");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Nome Completo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("Telefone:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("Email:");

        JTextField_Email.setForeground(new java.awt.Color(0, 0, 0));

        JButton_Alterar.setBackground(new java.awt.Color(0, 153, 0));
        JButton_Alterar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        JButton_Alterar.setForeground(new java.awt.Color(255, 255, 255));
        JButton_Alterar.setText("Alterar");

        JButton_Incluir.setBackground(new java.awt.Color(0, 153, 0));
        JButton_Incluir.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        JButton_Incluir.setForeground(new java.awt.Color(255, 255, 255));
        JButton_Incluir.setText("Incluir");
        JButton_Incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_IncluirActionPerformed(evt);
            }
        });

        JButton_Listar.setBackground(new java.awt.Color(0, 153, 0));
        JButton_Listar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        JButton_Listar.setForeground(new java.awt.Color(255, 255, 255));
        JButton_Listar.setText("Listar");
        JButton_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_ListarActionPerformed(evt);
            }
        });

        JButton_Consultar.setBackground(new java.awt.Color(0, 153, 0));
        JButton_Consultar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        JButton_Consultar.setForeground(new java.awt.Color(255, 255, 255));
        JButton_Consultar.setText("Consultar");
        JButton_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_ConsultarActionPerformed(evt);
            }
        });

        JTable_Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome completo", "Telefone", "Email", "Endereço"
            }
        ));
        jScrollPane1.setViewportView(JTable_Tabela);

        JButton_Excluir.setBackground(new java.awt.Color(0, 153, 0));
        JButton_Excluir.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        JButton_Excluir.setForeground(new java.awt.Color(255, 255, 255));
        JButton_Excluir.setText("Excluir");
        JButton_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_ExcluirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 51));
        jLabel5.setText("ENDEREÇO:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 51));
        jLabel6.setText("Logradouro:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 51));
        jLabel7.setText("Numero:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 51));
        jLabel8.setText("Complemento:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 51));
        jLabel9.setText("Cidade:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 51));
        jLabel10.setText("Estado:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setText("CEP:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 102, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(JButton_Incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JButton_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JButton_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JButton_Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JButton_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTextField_Cidade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextField_Logradouro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTextField_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JTextField_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextField_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTextField_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(JTextField_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(400, 400, 400))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTextField_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(JTextField_Logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(JTextField_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(JTextField_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JTextField_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(JTextField_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(JTextField_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButton_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton_Incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton_Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_IncluirActionPerformed
        String nome = JTextField_Nome.getText();
        String telefoneCompleto = JTextField_Telefone.getText();
        String email = JTextField_Email.getText();
        String endereco;
        //Componentes do endereço
        String logradouro = JTextField_Logradouro.getText();
        String numerocasa = JTextField_Numero.getText();
        String complemento = JTextField_Complemento.getText();
        String cidade = JTextField_Cidade.getText();
        String estado = JTextField_Estado.getText();
        String cep = JTextField_CEP.getText();
        if("".equals(JTextField_Complemento.getText())){
            endereco = logradouro + "," + numerocasa + "," + "SEM COMPLEMENTO" + "," + cidade + "," + estado + "," + cep;
        }else{
            endereco = logradouro + "," + numerocasa + "," + complemento + "," + cidade + "," + estado + "," + cep;
        }

        // Divide o telefone em DDI, DDD e número
        String[] partes = telefoneCompleto.split(" ");
        String ddi = partes[0];
        String ddd = partes[1];
        String numero = partes[2];

        // Cria um novo objeto Telefone com os dados inseridos
        Telefone tel = new Telefone(Integer.parseInt(ddi), Integer.parseInt(ddd), Integer.parseInt(numero));

        // Cria um novo objeto Contato com os dados inseridos
        Contato cont = new Contato(nome, tel, email, endereco);

        try {
            // Inclui o novo contato
            cont.incluir(nome, tel, email, endereco);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, email);
        }
    }//GEN-LAST:event_JButton_IncluirActionPerformed

    private void JButton_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_ListarActionPerformed
    //instância da sua classe Contato
    Contato contato = new Contato();

    // Obtém o modelo da tabela
    DefaultTableModel model = (DefaultTableModel) JTable_Tabela.getModel();
    model.setRowCount(0); // Limpa a tabela antes de adicionar novos dados
        try {
            // Chama o método listar para preencher a tabela com os dados dos contatos
            contato.listar(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_JButton_ListarActionPerformed

    private void JButton_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_ConsultarActionPerformed
        try {
            // Cria uma instância do ContatoDao
            ContatoDao contatoDao = new ContatoDao();

            // Obtém o modelo da JTable
            DefaultTableModel model = (DefaultTableModel) JTable_Tabela.getModel();

            // Limpa a tabela antes de adicionar novos dados
            model.setRowCount(0);

            // Chama o método consultar
            contatoDao.consultar(JTextField_Nome.getText(), model);
        } catch (Exception erro) {
            // Trate o erro aqui, por exemplo, mostrando uma mensagem de erro
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JButton_ConsultarActionPerformed

    private void JButton_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_ExcluirActionPerformed
        if (JTable_Tabela.getSelectedRow() != -1) {
        // Obtém os dados do contato selecionado
        int row = JTable_Tabela.getSelectedRow();
        String nome = JTable_Tabela.getValueAt(row, 0).toString();
        String telefoneStr = JTable_Tabela.getValueAt(row, 1).toString();
        String email = JTable_Tabela.getValueAt(row, 2).toString();
        String endereco = JTable_Tabela.getValueAt(row, 3).toString();

        // Converte a String do telefone para o objeto Telefone
        String[] telefoneParts = telefoneStr.split(" ");
        Telefone telefone = new Telefone(
            Integer.parseInt(telefoneParts[0]), // ddi
            Integer.parseInt(telefoneParts[1]), // ddd
            Integer.parseInt(telefoneParts[2])  // numero
        );

        // Cria um novo Contato com os dados obtidos
        Contato contato = new Contato();
        contato.setNomeCompleto(nome);
        contato.setTelefone(telefone);
        contato.setEmail(email);
        contato.setEndereco(endereco);

        try {
            // Chama a função excluir
            contato.excluir(contato);
            
            // Limpa a tabela
            DefaultTableModel model = (DefaultTableModel) JTable_Tabela.getModel();
            model.setRowCount(0);

            // Lê todos os contatos do arquivo CSV
            ArrayList<String> linhas = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("agenda.csv"))) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    linhas.add(linha);
                }
            } catch (Exception erro) {
                throw new Exception("Contato - Excluir - erro ao abrir o arquivo!");
            }

            // Adiciona os contatos restantes à tabela
            for (String linha : linhas) {
                String[] contatoData = linha.split(";");
                model.addRow(contatoData);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(rootPane, "Nenhum contato selecionado");
    }
    }//GEN-LAST:event_JButton_ExcluirActionPerformed

    
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
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_Alterar;
    private javax.swing.JButton JButton_Consultar;
    private javax.swing.JButton JButton_Excluir;
    private javax.swing.JButton JButton_Incluir;
    private javax.swing.JButton JButton_Listar;
    private javax.swing.JTable JTable_Tabela;
    private javax.swing.JTextField JTextField_CEP;
    private javax.swing.JTextField JTextField_Cidade;
    private javax.swing.JTextField JTextField_Complemento;
    private javax.swing.JTextField JTextField_Email;
    private javax.swing.JTextField JTextField_Estado;
    private javax.swing.JTextField JTextField_Logradouro;
    private javax.swing.JTextField JTextField_Nome;
    private javax.swing.JTextField JTextField_Numero;
    private javax.swing.JTextField JTextField_Telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
