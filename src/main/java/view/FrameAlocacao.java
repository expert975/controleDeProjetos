package main.java.view;

import br.com.ap220191.ec04_controle_projetos.model.Alocacao;
import br.com.ap220191.ec04_controle_projetos.model.Colaborador;
import br.com.ap220191.ec04_controle_projetos.model.EstadoAlocacao;
import br.com.ap220191.ec04_controle_projetos.model.Projeto;
import java.util.ArrayList;

public class FrameAlocacao extends javax.swing.JFrame {
	MainFrame mainFrame;
	
	FrameAlocacao(MainFrame frame) {
		initComponents();
		
		this.mainFrame = frame;
		
		comboProjeto.removeAllItems();
		comboProjeto.addItem("SELECIONE O PROJETO");
		for (Projeto projeto : mainFrame.getProjetos()) { 
			comboProjeto.addItem(projeto.getNome());
		}
		
		comboEstadoAlocacao.removeAllItems();
		comboEstadoAlocacao.addItem("ESTADO DA ALOCACAO");
		for (EstadoAlocacao estado : EstadoAlocacao.values()) { 
			comboEstadoAlocacao.addItem(estado.toString());
		}

		comboColaborador.removeAllItems();
		comboColaborador.addItem("SELECIONE O COLABORADOR");
		for (Colaborador colaborador : mainFrame.getColaboradores()) { 
			comboColaborador.addItem(colaborador.getNome());
		}
		
		comboProjeto.setEnabled(false);
		comboEstadoAlocacao.setEnabled(false);

                inputCargaHoraria.setEditable(false);
		comboColaborador.setEnabled(false);

                botaoSalvar.setEnabled(false);
	}

	public FrameAlocacao() {
		initComponents();

		comboProjeto.removeAllItems();
		comboProjeto.addItem("SELECIONE O PROJETO");
		
		comboEstadoAlocacao.removeAllItems();
		comboEstadoAlocacao.addItem("ESTADO DA ALOCACAO");

		comboColaborador.removeAllItems();
		comboColaborador.addItem("SELECIONE O COLABORADOR");
		
		comboProjeto.setEnabled(false);
		comboEstadoAlocacao.setEnabled(false);

                inputCargaHoraria.setEditable(false);
		comboColaborador.setEnabled(false);

                botaoSalvar.setEnabled(false);
	}
	/**
	 * Este método, gerado automaticamente, é chamado no construtor e
	 * inicializa o formulário. Não modifique o código.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                inputCargaHoraria = new javax.swing.JTextField();
                botaoEditar = new javax.swing.JButton();
                botaoSalvar = new javax.swing.JButton();
                jSeparator1 = new javax.swing.JSeparator();
                jSeparator2 = new javax.swing.JSeparator();
                comboProjeto = new javax.swing.JComboBox<>();
                comboColaborador = new javax.swing.JComboBox<>();
                comboEstadoAlocacao = new javax.swing.JComboBox<>();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                inputCargaHoraria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputCargaHoraria.setText("Carga Horária");
                inputCargaHoraria.setToolTipText("Insira a carga horária");

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

                comboProjeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                comboProjeto.setToolTipText("Selecione o projeto");

                comboColaborador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                comboEstadoAlocacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                comboEstadoAlocacao.setToolTipText("Selecione o estado de alocação");
                comboEstadoAlocacao.setName(""); // NOI18N

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                                                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator1)
                                        .addComponent(inputCargaHoraria, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboProjeto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboEstadoAlocacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboColaborador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(comboProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboEstadoAlocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(comboColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botaoEditar)
                                        .addComponent(botaoSalvar))
                                .addGap(23, 23, 23))
                );

                setSize(new java.awt.Dimension(418, 277));
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
		comboProjeto.setEnabled(true);
		comboEstadoAlocacao.setEnabled(true);

                inputCargaHoraria.setEditable(true);
		comboColaborador.setEnabled(true);

                botaoSalvar.setEnabled(true);
        }//GEN-LAST:event_botaoEditarActionPerformed

        private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
		Alocacao aloca = new Alocacao();

		for (Projeto projeto : mainFrame.getProjetos()) {
			if(comboProjeto.getSelectedItem().equals(projeto.getNome())) {
				aloca.setProjeto(projeto);
			}
		}

		for (EstadoAlocacao estado : EstadoAlocacao.values()) { 
			if(comboEstadoAlocacao.getSelectedItem().equals(estado.toString())) {
				aloca.setEstado(estado);
			}		
		}

		aloca.setCargaHoraria(Integer.parseInt(inputCargaHoraria.getText()));

		for (Colaborador colaborador : mainFrame.getColaboradores()) {
			if(comboColaborador.getSelectedItem().equals(colaborador.getNome())) {
				aloca.setColaborador(colaborador);
			}
		}

		mainFrame.alocaColaboradorNoProjeto(aloca);
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
			java.util.logging.Logger.getLogger(FrameAlocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrameAlocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrameAlocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrameAlocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FrameAlocacao().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton botaoEditar;
        private javax.swing.JButton botaoSalvar;
        private javax.swing.JComboBox<String> comboColaborador;
        private javax.swing.JComboBox<String> comboEstadoAlocacao;
        private javax.swing.JComboBox<String> comboProjeto;
        private javax.swing.JTextField inputCargaHoraria;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSeparator jSeparator2;
        // End of variables declaration//GEN-END:variables
}
