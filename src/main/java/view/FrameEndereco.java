package main.java.view;

import br.com.ap220191.ec04_controle_projetos.model.ApiCorreios;
import br.com.ap220191.ec04_controle_projetos.model.CorreiosException;
import java.awt.Color;
import java.awt.event.KeyEvent;
import br.com.ap220191.ec04_controle_projetos.model.Endereco;

public class FrameEndereco extends javax.swing.JFrame {
	
	private FrameColaborador frameColaborador;
	private Endereco endereco;
	
	public FrameEndereco(FrameColaborador frame, String cep) throws CorreiosException {
		initComponents();
		
		this.frameColaborador = frame;

		ApiCorreios cliente = ApiCorreios.getInstance();
		endereco = new Endereco();
		try{
		endereco = cliente.buscaEndereco(cep);
		} catch(CorreiosException exception) {
			exception.printStackTrace();
		} 

		inputTipoLogradouro.setText(endereco.getTipo());
                inputLogradouro.setText(endereco.getNome());
                inputBairro.setText(endereco.getBairro());
                inputCidade.setText(endereco.getCidade());
                inputEstado.setText(endereco.getEstado());
		
		botaoEditar.requestFocus();
		botaoSalvar.setEnabled(false);
		inputTipoLogradouro.setEditable(false);
		inputLogradouro.setEditable(false);
		inputNumero.setEditable(false);
		inputComplemento.setEditable(false);
		inputBairro.setEditable(false);
		inputCidade.setEditable(false);
		inputEstado.setEditable(false);
	}
	
	public FrameEndereco() {
		initComponents();
		
		botaoEditar.requestFocus();
		botaoSalvar.setEnabled(false);
		inputTipoLogradouro.setEditable(false);
		inputLogradouro.setEditable(false);
		inputNumero.setEditable(false);
		inputComplemento.setEditable(false);
		inputBairro.setEditable(false);
		inputCidade.setEditable(false);
		inputEstado.setEditable(false);
	}
		
	/**
	 * Este método, gerado automaticamente, é chamado no construtor e
	 * inicializa o formulário. Não modifique o código.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                inputTipoLogradouro = new javax.swing.JTextField();
                inputNumero = new javax.swing.JTextField();
                inputComplemento = new javax.swing.JTextField();
                inputBairro = new javax.swing.JTextField();
                inputCidade = new javax.swing.JTextField();
                inputEstado = new javax.swing.JTextField();
                botaoEditar = new javax.swing.JButton();
                botaoSalvar = new javax.swing.JButton();
                inputLogradouro = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setUndecorated(true);

                inputTipoLogradouro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputTipoLogradouro.setText("Tipo");
                inputTipoLogradouro.setToolTipText("Tipo de logradouro");
                inputTipoLogradouro.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                inputTipoLogradouroFocusLost(evt);
                        }
                });
                inputTipoLogradouro.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                inputTipoLogradouroKeyPressed(evt);
                        }
                });

                inputNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputNumero.setText("Número");
                inputNumero.setToolTipText("Insira o número");
                inputNumero.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                inputNumeroFocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                inputNumeroFocusLost(evt);
                        }
                });
                inputNumero.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                inputNumeroKeyPressed(evt);
                        }
                });

                inputComplemento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputComplemento.setText("Complemento");
                inputComplemento.setToolTipText("Insira o complemento");
                inputComplemento.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                inputComplementoFocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                inputComplementoFocusLost(evt);
                        }
                });
                inputComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                inputComplementoKeyPressed(evt);
                        }
                });

                inputBairro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputBairro.setText("Bairro");
                inputBairro.setToolTipText("Bairro");
                inputBairro.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                inputBairroFocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                inputBairroFocusLost(evt);
                        }
                });
                inputBairro.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                inputBairroKeyPressed(evt);
                        }
                });

                inputCidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputCidade.setText("Cidade");
                inputCidade.setToolTipText("Cidade");
                inputCidade.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                inputCidadeFocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                inputCidadeFocusLost(evt);
                        }
                });
                inputCidade.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                inputCidadeKeyPressed(evt);
                        }
                });

                inputEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputEstado.setText("Estado");
                inputEstado.setToolTipText("Estado");
                inputEstado.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                inputEstadoFocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                inputEstadoFocusLost(evt);
                        }
                });
                inputEstado.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                inputEstadoKeyPressed(evt);
                        }
                });

                botaoEditar.setText("Editar");
                botaoEditar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoEditarActionPerformed(evt);
                        }
                });

                botaoSalvar.setText("Salvar");
                botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoSalvarActionPerformed(evt);
                        }
                });

                inputLogradouro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputLogradouro.setText("Logradouro");
                inputLogradouro.setToolTipText("Logradouro");
                inputLogradouro.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                inputLogradouroFocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                inputLogradouroFocusLost(evt);
                        }
                });
                inputLogradouro.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                inputLogradouroKeyPressed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(148, Short.MAX_VALUE)
                                .addComponent(inputLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                                                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(inputCidade)
                                                .addComponent(inputEstado)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(inputTipoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(15, 15, 15)
                                                        .addComponent(inputComplemento))
                                                .addComponent(inputBairro))
                                        .addGap(34, 34, 34)))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(inputLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(225, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(inputTipoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(inputComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(botaoEditar)
                                                .addComponent(botaoSalvar))
                                        .addContainerGap(53, Short.MAX_VALUE)))
                );

                setSize(new java.awt.Dimension(400, 300));
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
		inputTipoLogradouro.setEditable(true);
		inputLogradouro.setEditable(true);
		inputNumero.setEditable(true);
		inputComplemento.setEditable(true);
		inputBairro.setEditable(true);
		inputCidade.setEditable(true);
		inputEstado.setEditable(true);
		
		if(inputNumero.getText().equals("Número")) {
			inputNumero.setBackground(Color.orange);
			inputComplemento.setBackground(Color.orange);
			inputNumero.requestFocus();
		}

		botaoSalvar.setEnabled(true);
        }//GEN-LAST:event_botaoEditarActionPerformed

        private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed

		endereco.setTipo(inputTipoLogradouro.getText());
		endereco.setNome(inputLogradouro.getText());
		endereco.setNumero(Integer.parseInt(inputNumero.getText()));
		endereco.setComplemento(inputComplemento.getText());
		endereco.setBairro(inputBairro.getText());
		endereco.setCidade(inputCidade.getText());
		endereco.setEstado(inputEstado.getText());

		if(frameColaborador != null) {
			if(frameColaborador.isGerente()) {
				frameColaborador.setGerente(endereco);
			} else {
				frameColaborador.setColaborador(endereco);
			}
		}
		this.dispose();
        }//GEN-LAST:event_botaoSalvarActionPerformed

        private void inputTipoLogradouroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTipoLogradouroFocusLost
		if(inputTipoLogradouro.getText().isEmpty()) {
			inputTipoLogradouro.setBackground(Color.red);
			inputTipoLogradouro.grabFocus();
		} else {
			inputTipoLogradouro.setBackground(Color.white);
			inputLogradouro.setEditable(true);
		}
        }//GEN-LAST:event_inputTipoLogradouroFocusLost

        private void inputTipoLogradouroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTipoLogradouroKeyPressed
		if(evt.getKeyCode() == KeyEvent.VK_ENTER){
			inputLogradouro.requestFocus();
		}
        }//GEN-LAST:event_inputTipoLogradouroKeyPressed

        private void inputLogradouroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputLogradouroFocusGained
                // TODO add your handling code here:
        }//GEN-LAST:event_inputLogradouroFocusGained

        private void inputLogradouroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputLogradouroFocusLost
		if(inputLogradouro.getText().isEmpty() && !inputTipoLogradouro.getText().isEmpty()) {
			inputLogradouro.setBackground(Color.red);
			inputLogradouro.grabFocus();
		} else {
			inputLogradouro.setBackground(Color.white);
			inputNumero.setEditable(true);
		}
        }//GEN-LAST:event_inputLogradouroFocusLost

        private void inputLogradouroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputLogradouroKeyPressed
		if(evt.getKeyCode() == KeyEvent.VK_ENTER){
			inputNumero.requestFocus();
		}
        }//GEN-LAST:event_inputLogradouroKeyPressed

        private void inputNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNumeroFocusGained
                inputNumero.setBackground(Color.orange);
		inputNumero.setText(null);
        }//GEN-LAST:event_inputNumeroFocusGained

        private void inputNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNumeroFocusLost
		if(inputNumero.getText().isEmpty() && !inputLogradouro.getText().isEmpty()) {
			inputNumero.setBackground(Color.red);
			inputNumero.grabFocus();
		} else {
			inputNumero.setBackground(Color.white);
			inputComplemento.setEditable(true);
		}
        }//GEN-LAST:event_inputNumeroFocusLost

        private void inputNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNumeroKeyPressed
		if(evt.getKeyCode() == KeyEvent.VK_ENTER){
			inputComplemento.requestFocus();
		}
        }//GEN-LAST:event_inputNumeroKeyPressed

        private void inputComplementoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputComplementoFocusGained
                inputComplemento.setBackground(Color.orange);
		inputComplemento.setText(null);
        }//GEN-LAST:event_inputComplementoFocusGained

        private void inputComplementoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputComplementoFocusLost
		if(inputComplemento.getText().isEmpty() && !inputNumero.getText().isEmpty()) {
			inputComplemento.setBackground(Color.red);
			inputComplemento.grabFocus();
		} else {
			inputComplemento.setBackground(Color.white);
			//inputBairro.setEditable(true);
		}
        }//GEN-LAST:event_inputComplementoFocusLost

        private void inputComplementoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputComplementoKeyPressed
		if(evt.getKeyCode() == KeyEvent.VK_ENTER){
			botaoSalvar.setEnabled(true);
			botaoSalvar.requestFocus();
			//inputBairro.requestFocus();
		}
        }//GEN-LAST:event_inputComplementoKeyPressed

        private void inputBairroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputBairroFocusGained
                // TODO add your handling code here:
        }//GEN-LAST:event_inputBairroFocusGained

        private void inputBairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputBairroFocusLost
		if(inputBairro.getText().isEmpty() && !inputComplemento.getText().isEmpty()) {
			inputBairro.setBackground(Color.red);
			inputBairro.grabFocus();
		} else {
			inputBairro.setBackground(Color.white);
			inputCidade.setEditable(true);
		}
        }//GEN-LAST:event_inputBairroFocusLost

        private void inputBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBairroKeyPressed
		if(evt.getKeyCode() == KeyEvent.VK_ENTER){
			inputCidade.requestFocus();
		}
        }//GEN-LAST:event_inputBairroKeyPressed

        private void inputCidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCidadeFocusGained
                // TODO add your handling code here:
        }//GEN-LAST:event_inputCidadeFocusGained

        private void inputCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCidadeFocusLost
		if(inputCidade.getText().isEmpty() && !inputBairro.getText().isEmpty()) {
			inputCidade.setBackground(Color.red);
			inputCidade.grabFocus();
		} else {
			inputCidade.setBackground(Color.white);
			inputEstado.setEditable(true);
		}
        }//GEN-LAST:event_inputCidadeFocusLost

        private void inputCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCidadeKeyPressed
		if(evt.getKeyCode() == KeyEvent.VK_ENTER){
			inputEstado.requestFocus();
		}        }//GEN-LAST:event_inputCidadeKeyPressed

        private void inputEstadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputEstadoFocusGained
                // TODO add your handling code here:
        }//GEN-LAST:event_inputEstadoFocusGained

        private void inputEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputEstadoFocusLost
		if(inputEstado.getText().isEmpty() && !inputCidade.getText().isEmpty()) {
			inputEstado.setBackground(Color.red);
			inputEstado.grabFocus();
		} else {
			inputEstado.setBackground(Color.white);
			botaoSalvar.setEnabled(true);
		}
        }//GEN-LAST:event_inputEstadoFocusLost

        private void inputEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputEstadoKeyPressed
		if(evt.getKeyCode() == KeyEvent.VK_ENTER){
			botaoSalvar.requestFocus();
		}
        }//GEN-LAST:event_inputEstadoKeyPressed

	/**
	 * Código gerado automaticamente, é responsável pela aparência do
	 * JFrame. Selecione opcionalmente o template Look and feel.
	 * @param args the command line arguments
	 */
	public static void main(String args[]){
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
			java.util.logging.Logger.getLogger(FrameEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrameEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrameEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrameEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FrameEndereco().setVisible(true);
			}
		});
		
	}


	
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton botaoEditar;
        private javax.swing.JButton botaoSalvar;
        private javax.swing.JTextField inputBairro;
        private javax.swing.JTextField inputCidade;
        private javax.swing.JTextField inputComplemento;
        private javax.swing.JTextField inputEstado;
        private javax.swing.JTextField inputLogradouro;
        private javax.swing.JTextField inputNumero;
        private javax.swing.JTextField inputTipoLogradouro;
        // End of variables declaration//GEN-END:variables
}
