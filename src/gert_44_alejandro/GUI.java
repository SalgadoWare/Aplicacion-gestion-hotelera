package gert_44_alejandro;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import launcher.GerenteFrame;

public class GUI extends JFrame {
	private List<TransferTarifa> l;
	private List<TransferHAbitacionPlus> li;

	/*
	 * To change this license header, choose License Headers in Project
	 * Properties. To change this template file, choose Tools | Templates and
	 * open the template in the editor.
	 */

	/**
	 * Creates new form GUI
	 */
	public GUI() {
		initComponents();
	     WindowAdapter exitListener = new WindowAdapter() {

				@Override
				public void windowClosing(WindowEvent e) {
					dispose();
					GerenteFrame.main(null);
				}
			};

			addWindowListener(exitListener);
			setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		fillData();
	}

	private void fillData() {
		// TODO Auto-generated method stub
		jLabelFails.setText(null);
		DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
		int i = 0;
		while (i < dtm.getRowCount()) {
			dtm.removeRow(0);
		}
		l = BD.realAllTipos();

		for (TransferTarifa t : l) {
			
			String tipo = null;
			switch (t.tipo) {
			case 1:
				tipo = "Individual";
				break;
			case 2:
				tipo = "Doble";
				break;
			case 3 :
				tipo = "triple";
				break;

			default:
				break;
			}
			
			
			Object[] s = { (Object) tipo, t.getFechaIni(), t.getFechaFin(), t.getPrecio() };
			dtm.addRow(s);
		}

		DefaultTableModel dtm1 = (DefaultTableModel) jTable1.getModel();
		int j = 0;
		while (j < dtm1.getRowCount()) {
			dtm1.removeRow(0);
		}
		li = BD.realAllRoomsPlus();

		for (TransferHAbitacionPlus ta : li) {
			
			String tipo = null;
			switch (ta.tipo) {
			case 1:
				tipo = "Individual";
				break;
			case 2:
				tipo = "Doble";
				break;
			case 3 :
				tipo = "Triple";
				break;

			default:
				break;
			}
			
			
			Object[] s = { (Object) ta.id, ta.estado, tipo, ta.ini, ta.fin, ta.tarifa };
			dtm1.addRow(s);
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jLabel2 = new javax.swing.JLabel();
		jLabelFails = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Numero", "Estado", "Tipo", "Iinicio", "Fin", "Tarifa" }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class, java.lang.Integer.class };
			boolean[] canEdit = new boolean[] { false, false, false, false, false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(jTable1);

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Selecciona el nuevo tipo que tendra la habitacion");

		jTable2.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Tipo", "Fecha Inicio", "Fecha Fin", "Tarifa" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.Object.class, java.lang.Object.class,
					java.lang.Integer.class };
			boolean[] canEdit = new boolean[] { false, false, false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane2.setViewportView(jTable2);

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("Selecciona una habitacion a la que cambiar el tipo");

		jLabelFails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabelFails.setForeground(new java.awt.Color(255, 0, 0));

		jButton1.setText("Cambiar");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
						.addComponent(jScrollPane2)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jLabelFails, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(18, 18, 18).addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 399,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(34, 34, 34).addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
								.addComponent(jLabelFails, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(29, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	String id;
	Integer idth;

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			jLabelFails.setText(null);
			if (((String) jTable1.getValueAt(jTable1.getSelectedRow(), 1)).equalsIgnoreCase("ocupada")) {
				jLabelFails.setText("La habitacion seleccionada esta ocupada");
			} else {
				id = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
				idth = l.get(jTable2.getSelectedRow()).id;
				System.out.println(id);
				System.out.println(idth);
				BD.updateHTH(id,idth);
				fillData();
				JOptionPane.showMessageDialog(new JFrame(), "Cambio aplicado correctamente");
			}
		} catch (Exception e) {
			// TODO: handle exception
			jLabelFails.setText("Datos mal introducidos");
		}
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUI().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabelFails;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	// End of variables declaration
}
