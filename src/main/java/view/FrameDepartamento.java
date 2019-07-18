package main.java.view;

import br.com.ap220191.ec04_controle_projetos.model.Departamento;
import br.com.ap220191.ec04_controle_projetos.model.Mobilidade;
import br.com.ap220191.ec04_controle_projetos.model.Telefone;
import java.util.ArrayList;

public class FrameDepartamento extends javax.swing.JFrame {
	
	MainFrame mainFrame;

	FrameDepartamento(MainFrame frame) {
		initComponents();
		
		this.mainFrame = frame;
		
		comboTelefone.removeAllItems();
		comboTelefone.addItem("SELECIONE");
		for (Mobilidade mobilidade : Mobilidade.values()) { 
			comboTelefone.addItem(mobilidade.toString());
		}

		inputNomeDepartamento.setEditable(false);
                inputDescricao.setEditable(false);
                inputOrcamento.setEditable(false);

                inputTelefone.setEditable(false);
		inputOperadora.setEnabled(false);
                comboTelefone.setEnabled(false);

                inputEmail.setEditable(false);

                botaoSalvar.setEnabled(false);
	}
	
	public FrameDepartamento() {
		initComponents();
	}

	/**
	 * Este método, gerado automaticamente, é chamado no construtor e
	 * inicializa o formulário. Não modifique o código.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                inputNomeDepartamento = new javax.swing.JTextField();
                inputTelefone = new javax.swing.JTextField();
                inputEmail = new javax.swing.JTextField();
                botaoEditar = new javax.swing.JButton();
                botaoSalvar = new javax.swing.JButton();
                inputDescricao = new javax.swing.JTextField();
                inputOrcamento = new javax.swing.JTextField();
                jSeparator1 = new javax.swing.JSeparator();
                comboTelefone = new javax.swing.JComboBox<>();
                inputOperadora = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                inputNomeDepartamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputNomeDepartamento.setText("Nome do departamento");
                inputNomeDepartamento.setToolTipText("Insira o nome completo");

                inputTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputTelefone.setText("Telefone");
                inputTelefone.setToolTipText("Insira o número de telefone");

                inputEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputEmail.setText("E-mail");
                inputEmail.setToolTipText("Insira o código de endereçamento postal (cep)");

                botaoEditar.setText("Editar");
                botaoEditar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoEditarActionPerformed(evt);
                        }
                });

                botaoSalvar.setText("Salvar");
                botaoSalvar.setEnabled(false);
                botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoSalvarActionPerformed(evt);
                        }
                });

                inputDescricao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputDescricao.setText("Descrição");
                inputDescricao.setToolTipText("Insira o dia de nascimento");

                inputOrcamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputOrcamento.setText("Orçamento");
                inputOrcamento.setToolTipText("Selecione a mobilidade");

                comboTelefone.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                inputOperadora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputOperadora.setText("Operadora");
                inputOperadora.setToolTipText("Insira o número de telefone");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(inputOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                                                                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(comboTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jSeparator1)
                                                        .addComponent(inputNomeDepartamento, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(inputOrcamento, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(inputDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(inputTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(inputEmail))
                                                .addGap(32, 32, 32))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(inputNomeDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(comboTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botaoEditar)
                                        .addComponent(botaoSalvar))
                                .addGap(23, 23, 23))
                );

                setSize(new java.awt.Dimension(418, 324));
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents
	
        private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
                inputNomeDepartamento.setEditable(true);
                inputDescricao.setEditable(true);
                inputOrcamento.setEditable(true);

                inputTelefone.setEditable(true);
                comboTelefone.setEnabled(true);
		inputOperadora.setEnabled(true);

                inputEmail.setEditable(true);

                botaoSalvar.setEnabled(true);
                inputNomeDepartamento.requestFocus();
        }//GEN-LAST:event_botaoEditarActionPerformed

        private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
		Departamento departamento = new Departamento();
		
		departamento.setNome(inputNomeDepartamento.getText());
		departamento.setDescricao(inputDescricao.getText());
		departamento.setOrcamento(Long.parseLong(inputOrcamento.getText()));
		departamento.setGerente(null);
		departamento.setColaboradores(null);
		departamento.setProjetos(null);
		
		Telefone telefone = new Telefone();

		telefone.setNumero(inputTelefone.getText());
		telefone.setOperadora(inputOperadora.getText());
		
		for (Mobilidade mobilidade : Mobilidade.values()) {
			if(comboTelefone.getSelectedItem().equals(mobilidade.toString())) {
				telefone.setTipo(mobilidade);
			}		
		}
		
		departamento.setTelefone(telefone);
		departamento.setEmail(inputEmail.getText());

		mainFrame.addDepartamento(departamento);
		this.dispose();
        }//GEN-LAST:event_botaoSalvarActionPerformed

	/**
	 * Código gerado automaticamente, é responsável pela aparência do
	 * JFrame. Selecione opcionalmente o template Look and feel.
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
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(FrameDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrameDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrameDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrameDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FrameDepartamento().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton botaoEditar;
        private javax.swing.JButton botaoSalvar;
        private javax.swing.JComboBox<String> comboTelefone;
        private javax.swing.JTextField inputDescricao;
        private javax.swing.JTextField inputEmail;
        private javax.swing.JTextField inputNomeDepartamento;
        private javax.swing.JTextField inputOperadora;
        private javax.swing.JTextField inputOrcamento;
        private javax.swing.JTextField inputTelefone;
        private javax.swing.JSeparator jSeparator1;
        // End of variables declaration//GEN-END:variables
}
