package agenda;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TelaPrincipal extends javax.swing.JFrame {

    private DefaultListModel<Contato> listaContatos;
    private boolean editarContato = false;

    public TelaPrincipal() {
        initComponents();
        this.listaContatos = new DefaultListModel();
        lstContatos.addListSelectionListener(new ListSelectionListenerImpl() {
            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                CarregarContatoSelecionado();

            }
        });
    }

    private void CarregarContatoSelecionado() {
        Contato contato = lstContatos.getSelectedValue();

        if (contato != null) {
            txtNome.setText(contato.getName());
            txtTelefone.setText(contato.getTelefone());
            txtEmail.setText(contato.getEmail());
            txtEndereco.setText(contato.getEndereco());
        }
    }

    private void limparCampos() {
        txtNome.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        txtEndereco.setText("");
    }

    private void habilitarCampos(boolean ok) {
        txtNome.setEnabled(ok);
        txtTelefone.setEnabled(ok);
        txtEmail.setEnabled(ok);
        txtEndereco.setEnabled(ok);

        txtNome.setFocusable(ok);
    }

    private void addContatoModel(Contato contato) {
        listaContatos.addElement(contato);
        lstContatos.setModel(listaContatos);
        lstContatos.setSelectedIndex(listaContatos.size() - 1);
    }

    private void editContatoModel(Contato contato) {
        int indiceEditContato = lstContatos.getSelectedIndex();
        listaContatos.setElementAt(contato, indiceEditContato);
        lstContatos.setSelectedIndex(indiceEditContato);
    }

    private void deleteContatoModel(int indice) {
        listaContatos.remove(indice);
        lstContatos.setModel(listaContatos);
        lstContatos.setSelectedIndex(listaContatos.size() - 1);
        editarContato = false;
        limparCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstContatos = new javax.swing.JList<>();
        btnNovo = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdite = new javax.swing.JButton();
        btnSalve = new javax.swing.JButton();
        btnCancele = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");

        lstContatos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstContatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(lstContatos);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdite.setText("Edite");
        btnEdite.setEnabled(false);
        btnEdite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditeActionPerformed(evt);
            }
        });

        btnSalve.setText("Salve");
        btnSalve.setEnabled(false);
        btnSalve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalveActionPerformed(evt);
            }
        });

        btnCancele.setText("Cancele");
        btnCancele.setEnabled(false);
        btnCancele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanceleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nome Completo:");

        txtNome.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("E-mail:");

        txtEmail.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Telefone:");

        txtTelefone.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Endereço:");

        txtEndereco.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(btnSalve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdite, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalve, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancele, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limparCampos();

        btnNovo.setEnabled(false);
        btnDelete.setEnabled(false);
        btnEdite.setEnabled(false);
        btnSalve.setEnabled(true);
        btnCancele.setEnabled(true);

        editarContato = false;

        habilitarCampos(true);

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCanceleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanceleActionPerformed
        limparCampos();
        btnNovo.setEnabled(true);
        
        if (!listaContatos.isEmpty()){
            btnDelete.setEnabled(true);
            btnEdite.setEnabled(true);   
        }else{
            btnDelete.setEnabled(false);
            btnEdite.setEnabled(false);
        }
               
        btnSalve.setEnabled(false);
        btnCancele.setEnabled(false);
        habilitarCampos(false);
        
    }//GEN-LAST:event_btnCanceleActionPerformed

    private void btnSalveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalveActionPerformed
         
        Contato contato = new Contato(
                txtNome.getText(),
                txtTelefone.getText(),
                txtEmail.getText(),
                txtEndereco.getText()
        );

        if (contato.getName().isEmpty() || contato.getTelefone().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome e telefone são obrigatórios!");
            return;
        }

        if (!this.editarContato) {
            addContatoModel(contato);
        } else {
            editContatoModel(contato);
            
        }

        editarContato = false;
        limparCampos();
        
       
        btnNovo.setEnabled(true);
        btnDelete.setEnabled(true);
        btnEdite.setEnabled(true);
        btnSalve.setEnabled(false);
        btnCancele.setEnabled(false);
        habilitarCampos(false);

    }//GEN-LAST:event_btnSalveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int indice = lstContatos.getSelectedIndex();

        if (indice == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o contato que deseja deletar!");
            return;
        }

        if (JOptionPane.showConfirmDialog(this,
                "Dejesa realmente apagar esse contato?") == JOptionPane.YES_OPTION)
            deleteContatoModel(indice);
        
        if (!listaContatos.isEmpty()){
            btnDelete.setEnabled(true);
            btnEdite.setEnabled(true);   
        }else{
            btnDelete.setEnabled(false);
            btnEdite.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditeActionPerformed
        int indiceSelecionado = lstContatos.getSelectedIndex();

        if (indiceSelecionado == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o contato que deseja editar!");
            return;
        }

        editarContato = true;
        CarregarContatoSelecionado();
        habilitarCampos(true);
        
        btnNovo.setEnabled(false);
        btnEdite.setEnabled(true);
        btnSalve.setEnabled(true);
        btnDelete.setEnabled(false);
        btnCancele.setEnabled(true);

    }//GEN-LAST:event_btnEditeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancele;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdite;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Contato> lstContatos;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private static abstract class ListSelectionListenerImpl implements ListSelectionListener {

        public ListSelectionListenerImpl() {
        }
    }
}
