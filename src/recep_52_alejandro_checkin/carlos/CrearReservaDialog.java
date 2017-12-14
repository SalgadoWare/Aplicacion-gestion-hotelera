/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recep_52_alejandro_checkin.carlos;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlos
 */
public class CrearReservaDialog extends javax.swing.JDialog {

	/**
	 * Creates new form CrearReservaDialog
	 */
	private CrearReservaDialog(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
		iniciarComponentesMio();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		labelFechaIni = new javax.swing.JLabel();
		labelFechaFin = new javax.swing.JLabel();
		dcFechaEntrada = new com.toedter.calendar.JDateChooser();
		dcFechaSalida = new com.toedter.calendar.JDateChooser();
		jLabel2 = new javax.swing.JLabel();
		bReservar = new javax.swing.JButton();
		bEliminar = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		tableHab = new javax.swing.JTable();
		jScrollPane2 = new javax.swing.JScrollPane();
		tableRes = new javax.swing.JTable();
		bConfirmar = new javax.swing.JButton();
		bCancelar = new javax.swing.JButton();
		cbModalidad = new javax.swing.JComboBox<>();
		labelFechaFin1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Crear reserva");

		labelFechaIni.setText("Fecha Entrada");

		labelFechaFin.setText("Fecha Salida");

		dcFechaEntrada.setDateFormatString("dd/MM/yyyy");
		dcFechaEntrada.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
			public void propertyChange(java.beans.PropertyChangeEvent evt) {
				dcFechaEntradaPropertyChange(evt);
			}
		});

		dcFechaSalida.setDateFormatString("dd/MM/yyyy");
		dcFechaSalida.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
			public void propertyChange(java.beans.PropertyChangeEvent evt) {
				dcFechaSalidaPropertyChange(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
		jLabel2.setText("Escoga las fechas en las que desea efectuar su reserva:");

		bReservar.setText("Reservar");
		bReservar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bReservarActionPerformed(evt);
			}
		});

		bEliminar.setText("Eliminar");
		bEliminar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bEliminarActionPerformed(evt);
			}
		});

		tableHab.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(tableHab);

		tableRes.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane2.setViewportView(tableRes);

		bConfirmar.setText("Confirmar");
		bConfirmar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bConfirmarActionPerformed(evt);
			}
		});

		bCancelar.setText("Cancelar");
		bCancelar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bCancelarActionPerformed(evt);
			}
		});

		cbModalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AD", "MP", "PC" }));

		labelFechaFin1.setText("Modalidad");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout
						.createSequentialGroup().addGap(21, 21, 21).addGroup(
								layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
										jLabel2)
										.addGroup(layout
												.createSequentialGroup()
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(labelFechaFin)
														.addComponent(labelFechaIni)
														.addComponent(dcFechaEntrada,
																javax.swing.GroupLayout.PREFERRED_SIZE, 140,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																dcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE,
																140, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(layout.createSequentialGroup().addGap(6, 6, 6)
																.addGroup(layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(bReservar)
																		.addComponent(bEliminar)))
														.addGroup(layout.createSequentialGroup().addGap(17, 17, 17)
																.addGroup(layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(labelFechaFin1)
																		.addComponent(cbModalidad,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addGap(18, 18, 18)
												.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(36, 36, 36).addComponent(jScrollPane2,
														javax.swing.GroupLayout.PREFERRED_SIZE, 478,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(bCancelar)
						.addGap(70, 70, 70).addComponent(bConfirmar).addGap(98, 98, 98)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(25, 25, 25).addComponent(jLabel2).addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(layout.createSequentialGroup().addGap(46, 46, 46).addComponent(labelFechaIni)
								.addGap(6, 6, 6)
								.addComponent(dcFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(labelFechaFin).addGap(6, 6, 6)
								.addComponent(dcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(labelFechaFin1)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(cbModalidad, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(bReservar).addGap(18, 18, 18).addComponent(bEliminar))
						.addGroup(layout.createSequentialGroup().addGap(34, 34, 34)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(bCancelar)
						.addComponent(bConfirmar))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void bConfirmarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bConfirmarActionPerformed
		if (estanVacios())
			JOptionPane.showMessageDialog(null, "Hay datos vacios");
		else {
			if (comprovarFecha(dcFechaEntrada.getDate(), dcFechaSalida.getDate())) {
				// Si todo está bien, pasamos a la ventana donde se registran
				// los datos del cliente

				// Si se ha pulsado aceptar

				// Recogemos el IdCliente y la tarjeta y los guardamos en los
				// atributos de la clase (TEMPORAL!)
				

				// Guardamos en los atributos de la clase los datos de la
				// reserva
				// Estos datos estan guardados en la tableRes
				// para cada una de las filas de tableRes, guardamos los datos
				// en la lista
				DefaultTableModel DTM_Res = (DefaultTableModel) tableRes.getModel();
				int numFilasTableRes = DTM_Res.getRowCount();

				listaReservaHabitacion.clear();// Borramos todo lo que habia en
												// la lista

				for (int fila = 0; fila < numFilasTableRes; fila++) {
					// Para cada fila de la tabla, sacamos sus datos
					String idHab = (String) DTM_Res.getValueAt(fila, 0);
					String tipo = (String) DTM_Res.getValueAt(fila, 1);
					String fechaEntrada_formateada = (String) DTM_Res.getValueAt(fila, 2);
					String fechaSalida_formateada = (String) DTM_Res.getValueAt(fila, 3);
					String modalidad = (String) DTM_Res.getValueAt(fila, 4);

					// Pasamos de la fecha formateada en String a un LocalDate
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate fechaEntrada = LocalDate.parse(fechaEntrada_formateada, dtf);
					LocalDate fechaSalida = LocalDate.parse(fechaSalida_formateada, dtf);

					ReservaHabitacion rh = new ReservaHabitacion(fechaEntrada, fechaSalida, idHab, modalidad);

					listaReservaHabitacion.add(rh);
				}

				// Tenemos que cerrar esta ventana
				POK = true;// Indicamos que se ha pulsado el boton de Aceptar
				this.setVisible(false);

			}

			else
				JOptionPane.showMessageDialog(null, "Error en las fechas");
		}
	}// GEN-LAST:event_bConfirmarActionPerformed

	private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bCancelarActionPerformed
		this.setVisible(false);
	}// GEN-LAST:event_bCancelarActionPerformed

	private void bReservarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bReservarActionPerformed
		int fila = tableHab.getSelectedRow();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaEntrada = getFechaEntrada();
		LocalDate fechaSalida = getFechaSalida();
		String fechaEntrada_formateada = dtf.format(fechaEntrada);
		String fechaSalida_formateada = dtf.format(fechaSalida);

		if (fila != -1 && fechaEntrada != null && fechaSalida != null) {
			// Cogemos los datos de la habitacion y los pasamos a la otra tabla
			// Habitacion hab = modeloHab.getHabitacion(fila);
			DefaultTableModel DTM_Hab = (DefaultTableModel) tableHab.getModel();
			String numHab = (String) DTM_Hab.getValueAt(fila, 0);
			String tipo = (String) DTM_Hab.getValueAt(fila, 1);
			String modalidad = getModalidad();

			DefaultTableModel DTM_Res = (DefaultTableModel) tableRes.getModel();
			Object[] s = { numHab, tipo, fechaEntrada_formateada, fechaSalida_formateada, modalidad };
			DTM_Res.addRow(s);

			// Borramos los datos de esta tabla
			DTM_Hab.removeRow(fila);

		}
	}// GEN-LAST:event_bReservarActionPerformed

	private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bEliminarActionPerformed
		int fila = tableRes.getSelectedRow();
		if (fila != -1) {
			// NO!!! Cogemos los datos de la habitacion y los pasamos a la
			// tableHab

			DefaultTableModel DTM_Res = (DefaultTableModel) tableRes.getModel();
			String numHab = (String) DTM_Res.getValueAt(fila, 0);
			String tipo = (String) DTM_Res.getValueAt(fila, 1);

			/*
			 * DefaultTableModel DTM_Hab = (DefaultTableModel)
			 * tableHab.getModel(); Object[] s = {numHab, tipo};
			 * DTM_Hab.addRow(s);
			 */

			// Borramos los datos de esta tabla
			DTM_Res.removeRow(fila);

			// Forzamos a actualizar la tablaHab
			cambianFechasReserva();

		}
	}// GEN-LAST:event_bEliminarActionPerformed

	private void dcFechaEntradaPropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_dcFechaEntradaPropertyChange
		cambianFechasReserva();
	}// GEN-LAST:event_dcFechaEntradaPropertyChange

	private void dcFechaSalidaPropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_dcFechaSalidaPropertyChange
		cambianFechasReserva();
	}// GEN-LAST:event_dcFechaSalidaPropertyChange

	private void cambianFechasReserva() {
		java.util.Date fechaEntrada = dcFechaEntrada.getDate();
		if (fechaEntrada != null) {
			fechaEntrada.setHours(0);
			fechaEntrada.setMinutes(0);
			fechaEntrada.setSeconds(0);
		}

		java.util.Date fechaSalida = dcFechaSalida.getDate();
		if (fechaSalida != null) {
			fechaSalida.setHours(0);
			fechaSalida.setMinutes(0);
			fechaSalida.setSeconds(0);
		}

		if (comprovarFecha(fechaEntrada, fechaSalida)) {
			try {
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate FechaEntrada_LD = fechaEntrada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				LocalDate FechaSalida_LD = fechaSalida.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				System.out.println("TRAZA cambianFechasReserva: fechaEntrada: " + dtf.format(FechaEntrada_LD)
						+ " fechaSalida: " + dtf.format(FechaSalida_LD));

				// List<Habitacion> habitaciones =
				// BD_jdbc.mostrarHabitacionesLibres(fechaEntrada, fechaSalida);
				List<HabitacionesReservaAnularReserva> habitaciones = BD_jdbc
						.mostrarHabitacionesLibres3(FechaEntrada_LD, FechaSalida_LD);
				DefaultTableModel DTM_Hab = (DefaultTableModel) tableHab.getModel();
				// modeloHab.setHabitaciones(habitaciones);

				// Borramos las habitaciones que habia antes en la tabla
				borrarTablaHab(DTM_Hab);

				// Añadimos las habitaciones a la tabla
				for (HabitacionesReservaAnularReserva habitacion : habitaciones) {
					String tipo = "";
					if (habitacion.getTipo() == 1)
						tipo = "sencilla";
					else if (habitacion.getTipo() == 2)
						tipo = "doble";
					else if (habitacion.getTipo() == 3)
						tipo = "triple";

					String[] s = { habitacion.getIdHabitacion(), "" + tipo };
					// (NO AÑADIR LAS HABITACIONES QUE YA ESTAN EN tableRes)
					if (!existeFilaEnTablaRes(s[0]))
						añadirFila(DTM_Hab, s);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private boolean existeFilaEnTablaRes(String idHab) {
		// Recorremos las filas de la tabla Res
		DefaultTableModel DTM_Res = (DefaultTableModel) tableRes.getModel();
		int numFilas = DTM_Res.getRowCount();
		for (int fila = 0; fila < numFilas; fila++) {
			// Para cada fila de la tabla Res, sacamos su idHabitacion
			String idHabRes = (String) DTM_Res.getValueAt(fila, 0);
			// Si el idHab que me pasan es igual que uno de los id de la tabla
			// res
			if (idHab.equals(idHabRes))
				return true;
		}
		return false;
	}

	private void borrarTablaHab(DefaultTableModel DTM_Hab) {
		int numFilas = DTM_Hab.getRowCount();
		for (int i = 0; i < numFilas; i++) {
			DTM_Hab.removeRow(0);// borramos en cada momento la fila de mas
									// arriba en la tabla
		}

	}

	private boolean comprovarFecha(java.util.Date fe, java.util.Date fs) {
		if (fe == null || fs == null) {
			return false;
		}

		if (fe.compareTo(fs) <= 0) {
			return true;
		} else
			return false;

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
			java.util.logging.Logger.getLogger(CrearReservaDialog.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CrearReservaDialog.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CrearReservaDialog.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CrearReservaDialog.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the dialog */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				CrearReservaDialog dialog = new CrearReservaDialog(new javax.swing.JFrame(), true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {
					@Override
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

	// Codigo mio
	private boolean POK;// Variable ¿pulsó OK?

	public CrearReservaDialog(int idCliente) {
		this(null, true);// Ventana modal
		this.idCliente = idCliente;

	}

	public boolean showDialog() {
		// Inicialización de la interfaz
		dcFechaEntrada.setDate(null);
		dcFechaSalida.setDate(null);

		inicializarTablas();

		POK = false;
		setVisible(true);// Mostramos la ventana
		// Es un codigo bloqueante
		// Como la ventana es modal se queda bloqueando la ventana anterior
		// La ventana antigua queda bloqueada porque el metodo setVisible no
		// termina
		return POK;// Aqui POK vale true si el usuario pulso el boton OK y false
					// si pulso Cancelar o cerro la ventana
	}

	private void inicializarTablas() {
		tableHab.setModel(new DefaultTableModel());
		DefaultTableModel DTM_Hab = (DefaultTableModel) tableHab.getModel();
		añadirColumnasHab(DTM_Hab);
		tableHab.setDefaultEditor(Object.class, null);
		tableHab.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		tableRes.setModel(new DefaultTableModel());
		DefaultTableModel DTM_Res = (DefaultTableModel) tableRes.getModel();
		añadirColumnasRes(DTM_Res);
		tableRes.setDefaultEditor(Object.class, null);
		tableRes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}

	private void iniciarComponentesMio() {
		dcFechaEntrada.setMinSelectableDate(Date.valueOf(LocalDate.now()));
		dcFechaSalida.setMinSelectableDate(Date.valueOf(LocalDate.now()));
	}

	/**
	 * Establece el numero de columnas de la tabla, así como el valor de las
	 * cabeceras
	 * 
	 * @param DTM
	 */
	private void añadirColumnasHab(javax.swing.table.DefaultTableModel DTM) {
		DTM.addColumn("Habitación");
		DTM.addColumn("Tipo");
	}

	private void añadirColumnasRes(javax.swing.table.DefaultTableModel DTM) {
		DTM.addColumn("Habitación");
		DTM.addColumn("Tipo");
		DTM.addColumn("Fecha entrada");
		DTM.addColumn("Fecha salida");
		DTM.addColumn("Modalidad");
	}

	private boolean estanVacios() {
		if (dcFechaEntrada.getDate() == null || dcFechaSalida.getDate() == null)
			return true;
		if (tableResVacia())// Si no hay nada en la tabla Res
			return true;

		return false;

	}

	private boolean tableResVacia() {
		DefaultTableModel DTM_Res = (DefaultTableModel) tableRes.getModel();
		if (DTM_Res.getRowCount() == 0)// Si no hay ninguna fila en la tabla es
										// que está vacía
			return true;
		else
			return false;
	}

	/**
	 * Recibe como parametros el DTM de la tabla a la que quieres añadir las
	 * columnas, y como demás parámetros, un número indefinido de vectores de
	 * String que van a ser las tuplas de la tabla. Los vectores han de ser del
	 * mismo tamaño que el número de columnas de la tabla
	 * 
	 * @param DTM
	 *            modelo de la tabla
	 * @param s
	 *            tuplas
	 */
	private void añadirFila(javax.swing.table.DefaultTableModel DTM, String[] s) {
		DTM.addRow(s);
	}

	private LocalDate getFechaEntrada() {
		java.util.Date fE = dcFechaEntrada.getDate();
		fE.setHours(0);
		fE.setMinutes(0);
		fE.setSeconds(0);
		LocalDate ld = fE.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return ld;
	}

	private LocalDate getFechaSalida() {
		java.util.Date fS = dcFechaSalida.getDate();
		fS.setHours(0);
		fS.setMinutes(0);
		fS.setSeconds(0);
		LocalDate ld = fS.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return ld;
	}

	private String getModalidad() {
		return cbModalidad.getSelectedItem().toString();
	}

	public int getIdCliente() {
		return idCliente;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public List<ReservaHabitacion> getListaReservaHabitacion() {
		return listaReservaHabitacion;
	}

	private int idCliente;
	private String tarjeta;
	private List<ReservaHabitacion> listaReservaHabitacion = new LinkedList<>();

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton bCancelar;
	private javax.swing.JButton bConfirmar;
	private javax.swing.JButton bEliminar;
	private javax.swing.JButton bReservar;
	private javax.swing.JComboBox<String> cbModalidad;
	private com.toedter.calendar.JDateChooser dcFechaEntrada;
	private com.toedter.calendar.JDateChooser dcFechaSalida;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JLabel labelFechaFin;
	private javax.swing.JLabel labelFechaFin1;
	private javax.swing.JLabel labelFechaIni;
	private javax.swing.JTable tableHab;
	private javax.swing.JTable tableRes;
	// End of variables declaration//GEN-END:variables
}
