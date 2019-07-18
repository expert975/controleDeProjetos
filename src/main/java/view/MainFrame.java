package main.java.view;

import br.com.ap220191.ec04_controle_projetos.model.Alocacao;
import br.com.ap220191.ec04_controle_projetos.model.AlteracaoSituacao;
import br.com.ap220191.ec04_controle_projetos.model.Colaborador;
import br.com.ap220191.ec04_controle_projetos.model.Departamento;
import br.com.ap220191.ec04_controle_projetos.model.Gerente;
import br.com.ap220191.ec04_controle_projetos.model.Projeto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import main.java.view.FrameAlocacao;
import main.java.view.FrameAlteracaoSituacao;
import main.java.view.FrameColaborador;
import main.java.view.FrameDepartamento;
import main.java.view.FrameProjeto;

public class MainFrame extends javax.swing.JFrame {

		ArrayList<Gerente> gerentes;
		ArrayList<Departamento> departamentos;
		ArrayList<Colaborador> colaboradores;
		ArrayList<Projeto> projetos;
		ArrayList<Alocacao> colaboraNoProjeto;
		ArrayList<AlteracaoSituacao> historia;
	
	public MainFrame() {
		initComponents();
		
		departamentos = new ArrayList<>();
		gerentes = new ArrayList<>();
		colaboradores = new ArrayList<>();
		projetos = new ArrayList<>();
		colaboraNoProjeto= new ArrayList<>();
		historia = new ArrayList<>();
	}

	/**
	 * Este método, gerado automaticamente, é chamado no construtor e
	 * inicializa o formulário. Não modifique o código.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jMenuBar1 = new javax.swing.JMenuBar();
                MenuHome = new javax.swing.JMenu();
                MenuDepartamento = new javax.swing.JMenu();
                botaoCriarDepartamento = new javax.swing.JMenuItem();
                MenuColaborador = new javax.swing.JMenu();
                botaoAdicionaColaborador = new javax.swing.JMenuItem();
                botaoAlocaColaborador = new javax.swing.JMenuItem();
                MenuProjetos = new javax.swing.JMenu();
                botaoAddProjeto = new javax.swing.JMenuItem();
                botaoMudarHistoria = new javax.swing.JMenuItem();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                MenuHome.setText("Home");
                jMenuBar1.add(MenuHome);

                MenuDepartamento.setText("Departamento");

                botaoCriarDepartamento.setText("Criar");
                botaoCriarDepartamento.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoCriarDepartamentoActionPerformed(evt);
                        }
                });
                MenuDepartamento.add(botaoCriarDepartamento);

                jMenuBar1.add(MenuDepartamento);

                MenuColaborador.setText("Colaborador");

                botaoAdicionaColaborador.setText("Adicionar");
                botaoAdicionaColaborador.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoAdicionaColaboradorActionPerformed(evt);
                        }
                });
                MenuColaborador.add(botaoAdicionaColaborador);

                botaoAlocaColaborador.setText("Alocar ao projeto");
                botaoAlocaColaborador.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoAlocaColaboradorActionPerformed(evt);
                        }
                });
                MenuColaborador.add(botaoAlocaColaborador);

                jMenuBar1.add(MenuColaborador);

                MenuProjetos.setText("Controle de Projetos");

                botaoAddProjeto.setText("Criar");
                botaoAddProjeto.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoAddProjetoActionPerformed(evt);
                        }
                });
                MenuProjetos.add(botaoAddProjeto);

                botaoMudarHistoria.setText("Alterar situação");
                botaoMudarHistoria.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoMudarHistoriaActionPerformed(evt);
                        }
                });
                MenuProjetos.add(botaoMudarHistoria);

                jMenuBar1.add(MenuProjetos);

                setJMenuBar(jMenuBar1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 274, Short.MAX_VALUE)
                );

                setSize(new java.awt.Dimension(418, 347));
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

	public void addGerente(Gerente novoGerente) {
		this.gerentes.add(novoGerente);
		//Verificando funcionamento no console
		gerentes.forEach((gerente) -> {
			System.out.println(gerente);
		});
	}

	public void addDepartamento(Departamento novoDepartamento){
		this.departamentos.add(novoDepartamento);
		//Verificando funcionamento no console
		departamentos.forEach((departamento) -> {
			System.out.println(departamento);
		});
	}

	public void addColaborador(Colaborador novoColaborador) {
		this.colaboradores.add(novoColaborador);
		//Verificando funcionamento no console
		colaboradores.forEach((colaborador) -> {
			System.out.println(colaborador);
		});
	}

	public void addProjeto(Projeto novoProjeto){
		this.projetos.add(novoProjeto);
		//Verificando funcionamento no console
		projetos.forEach((projeto) -> {
			System.out.println(projeto);
		});
	}

	public void alocaColaboradorNoProjeto(Alocacao aloca) {
		this.colaboraNoProjeto.add(aloca);
		//Verificando funcionamento no console
		colaboraNoProjeto.forEach((colaboradorAlocado) -> {
			System.out.println(colaboradorAlocado);
		});
	}

	public void alteraSituacao(int i, Projeto projetoAlterado, AlteracaoSituacao novaSituacao) {
		this.historia.add(novaSituacao);
		this.projetos.set(i, projetoAlterado);
		//Verificando funcionamento no console
		historia.forEach((situacao) -> {
			System.out.println(situacao);
		});
	}

	public ArrayList<Departamento> getDepartamentos(){
		return this.departamentos;
	}	

	public ArrayList<Colaborador> getColaboradores(){
		return this.colaboradores;
	}

	public ArrayList<Projeto> getProjetos(){
		return this.projetos;
	}

        private void botaoCriarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarDepartamentoActionPerformed
		FrameDepartamento frameDepartamento = new FrameDepartamento(this);
		frameDepartamento.setVisible(true);
        }//GEN-LAST:event_botaoCriarDepartamentoActionPerformed

        private void botaoAdicionaColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionaColaboradorActionPerformed
                if(departamentos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "É necessário criar um departamento");
		} else {
			FrameColaborador frameColaborador = new FrameColaborador(this);
			frameColaborador.setVisible(true);
		}
        }//GEN-LAST:event_botaoAdicionaColaboradorActionPerformed

        private void botaoAddProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddProjetoActionPerformed
		if(departamentos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "É necessário criar um departamento");
		} else {
			FrameProjeto frameProjeto = new FrameProjeto(this);
			frameProjeto.setVisible(true);
		}
        }//GEN-LAST:event_botaoAddProjetoActionPerformed

        private void botaoMudarHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMudarHistoriaActionPerformed
		if(projetos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "É necessário criar um projeto");
		} else {
			FrameAlteracaoSituacao frameAlteraSituacao = new FrameAlteracaoSituacao(this);
			frameAlteraSituacao.setVisible(true);
		}
        }//GEN-LAST:event_botaoMudarHistoriaActionPerformed

        private void botaoAlocaColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlocaColaboradorActionPerformed
		if(projetos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "É necessário criar um projeto");
		} else {
			FrameAlocacao frameAlocacao = new FrameAlocacao(this);
			frameAlocacao.setVisible(true);
		}
        }//GEN-LAST:event_botaoAlocaColaboradorActionPerformed

	/**
	 * Código gerado automaticamente, é responsável pela aparência do
	 * JFrame. Selecione opcionalmente o template Look and feel.
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
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrame().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JMenu MenuColaborador;
        private javax.swing.JMenu MenuDepartamento;
        private javax.swing.JMenu MenuHome;
        private javax.swing.JMenu MenuProjetos;
        private javax.swing.JMenuItem botaoAddProjeto;
        private javax.swing.JMenuItem botaoAdicionaColaborador;
        private javax.swing.JMenuItem botaoAlocaColaborador;
        private javax.swing.JMenuItem botaoCriarDepartamento;
        private javax.swing.JMenuItem botaoMudarHistoria;
        private javax.swing.JMenuBar jMenuBar1;
        // End of variables declaration//GEN-END:variables
}
