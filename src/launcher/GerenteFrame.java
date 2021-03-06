/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import carlos.historias_1_2_3.*;
import carlos.historias_8_9_10.BD_jdbc;
import carlos.historias_8_9_10.gert47.CrearHabitacionesDialog;
import historia1.vistas.GUIAltaTarifa;
import historia2.vistas.GUIAltaModalidad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import jdbc.BD;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.awt.event.ActionEvent;

/**
 *
 * @author alex
 */
public class GerenteFrame extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form GerenteFrame
	 */
	public GerenteFrame() {
		initComponents();
		iniciarComponentesCarlos();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel3 = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		jPanel6 = new javax.swing.JPanel();
		jPanel8 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		jPanel5 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Selecciona una accion");
		setBackground(new java.awt.Color(204, 255, 255));

		jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

		jPanel3.setBackground(new java.awt.Color(204, 255, 255));
		jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.PAGE_AXIS));

		jPanel4.setBackground(new java.awt.Color(204, 255, 255));

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 649, Short.MAX_VALUE));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));

		jPanel3.add(jPanel4);

		jPanel6.setBackground(new java.awt.Color(204, 255, 255));
		jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

		jPanel8.setBackground(new java.awt.Color(204, 255, 255));
		jPanel8.setPreferredSize(new java.awt.Dimension(150, 119));

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 236, Short.MAX_VALUE));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 103, Short.MAX_VALUE));

		jPanel6.add(jPanel8);

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(0, 51, 51));
		jLabel1.setText("Bienvenido gerente");
		jPanel6.add(jLabel1);

		jPanel7.setBackground(new java.awt.Color(204, 255, 255));
		jPanel7.setPreferredSize(new java.awt.Dimension(150, 89));

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 236, Short.MAX_VALUE));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 103, Short.MAX_VALUE));

		jPanel6.add(jPanel7);

		jPanel3.add(jPanel6);

		jPanel5.setBackground(new java.awt.Color(204, 255, 255));

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 649, Short.MAX_VALUE));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));

		jPanel3.add(jPanel5);

		jPanel1.add(jPanel3);

		jPanel2.setBackground(new java.awt.Color(204, 255, 255));
		jPanel2.setLayout(new java.awt.GridLayout(3, 2, 5, 5));

		jButton1.setText("Alta Tarifas por tipo de habitacion");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton1);

		jButton2.setText("Asignar suplementos por modalidad");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton2);

		jButton5.setText("Crear promociones");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bCrearPromocionesActionPerformed(evt);
			}
		});
		jPanel2.add(jButton5);

		jButton3.setText("Crear suplementos");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bCrearSuplementosActionPerformed(evt);
			}
		});
		jPanel2.add(jButton3);

		jButton4.setText("Consultar promociones o suplementos");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bConsultarPromocionesSuplementosActionPerformed(evt);
			}
		});
		jPanel2.add(jButton4);

		jButton7.setText("Cambiar tipo habitacion");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton7);

		jButton8.setText("Ver trabajadores");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton8);

		jPanel1.add(jPanel2);
		
		bCrearHabitaciones = new JButton();
		bCrearHabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bCrearHabitacionesActionPerformed(e);
			}
		});
		bCrearHabitaciones.setText("Crear habitaciones");
		jPanel2.add(bCrearHabitaciones);
		jButton6 = new javax.swing.JButton();
		
				jButton6.setText("Atras");
				jButton6.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButton6ActionPerformed(evt);
					}
				});
				jPanel2.add(jButton6);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
		// TODO add your handling code here:
		dispose();
		ActoresFrame.main(null);
	}// GEN-LAST:event_jButton6ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		// TODO add your handling code here:
		dispose();
		GUIAltaModalidad.main(null);
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:
		dispose();
		GUIAltaTarifa.main(null);

	}// GEN-LAST:event_jButton1ActionPerformed

	private void bConsultarPromocionesSuplementosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
		// Lanzamos el diálogo
		consultarPromocionesSuplementosDialog.showDialog();
	}// GEN-LAST:event_jButton5ActionPerformed

	private void bCrearPromocionesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		try {
			// Lanzamos el diálogo
			if (crearPromocionesDialog.showDialog()) {
				// Si se ha pulsado aceptar tenemos que guardar toda la info en
				// la BD
				int diaInicio;
				int diaFin;
				int mesInicio;
				int mesFin;
				int anoInicio;
				int anoFin;
				double porcentaje = crearPromocionesDialog.getDescuento();

				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				// SimpleDateFormat formateador = new
				// SimpleDateFormat("dd/MM/yyyy");

				if (crearPromocionesDialog.isFechaUnica()) {
					// Traza
					System.out.println("\nPromoción:");
					System.out.println("Fecha Unica: " + crearPromocionesDialog.isFechaUnica());
					System.out.println("Fecha: " + dtf.format(crearPromocionesDialog.getFechaUnica()));
					System.out.println("Descuento: " + crearPromocionesDialog.getDescuento());
					// Sacamos los datos
					diaInicio = diaFin = crearPromocionesDialog.getFechaUnica().getDayOfMonth();
					mesInicio = mesFin = crearPromocionesDialog.getFechaUnica().getMonthValue();
					anoInicio = anoFin = crearPromocionesDialog.getFechaUnica().getYear();
				} else {
					// Traza
					System.out.println("\nPromoción:");
					System.out.println("Rango de Fechas: " + !crearPromocionesDialog.isFechaUnica());
					LocalDate[] fechas = crearPromocionesDialog.getFechasIniFin();
					System.out.println("Fecha Inicio: " + dtf.format(fechas[0]));
					System.out.println("Fecha Fin: " + dtf.format(fechas[1]));
					System.out.println("Descuento: " + crearPromocionesDialog.getDescuento());
					// Sacamos los datos
					diaInicio = fechas[0].getDayOfMonth();
					mesInicio = fechas[0].getMonthValue();
					anoInicio = fechas[0].getYear();

					diaFin = fechas[1].getDayOfMonth();
					mesFin = fechas[1].getMonthValue();
					anoFin = fechas[1].getYear();
				}

				// Guardamos la info en la BD (hay que restarle 1 al mes porque
				// los meses en java.sql empiezan en 0
				boolean creada = BD.crearPromocion(new java.sql.Date(anoInicio, mesInicio - 1, diaInicio),
						new java.sql.Date(anoFin, mesFin - 1, diaFin), porcentaje);
				if (creada)
					System.out.println("Se ha creado la promoción");
				else
					System.out.println("Error creando la promoción");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// GEN-LAST:event_jButton3ActionPerformed

	private void bCrearSuplementosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		try {
			// Lanzamos el diálogo
			if (crearSuplementosDialog.showDialog()) {
				// Si se ha pulsado aceptar tenemos que guardar toda la info en
				// la BD
				int diaInicio;
				int diaFin;
				int mesInicio;
				int mesFin;
				int anoInicio;
				int anoFin;
				double porcentaje = crearSuplementosDialog.getDescuento();

				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

				if (crearSuplementosDialog.isFechaUnica()) {
					// Traza
					System.out.println("\nSuplemento:");
					System.out.println("Fecha Unica: " + crearSuplementosDialog.isFechaUnica());
					System.out.println("Fecha: " + dtf.format(crearSuplementosDialog.getFechaUnica()));
					System.out.println("Descuento: " + crearSuplementosDialog.getDescuento());
					// Sacamos los datos
					diaInicio = diaFin = crearSuplementosDialog.getFechaUnica().getDayOfMonth();
					mesInicio = mesFin = crearSuplementosDialog.getFechaUnica().getMonthValue();
					anoInicio = anoFin = crearSuplementosDialog.getFechaUnica().getYear();
				} else {
					// Traza
					System.out.println("\nSuplemento:");
					System.out.println("Rango de Fechas: " + !crearSuplementosDialog.isFechaUnica());
					LocalDate[] fechas = crearSuplementosDialog.getFechasIniFin();
					System.out.println("Fecha Inicio: " + dtf.format(fechas[0]));
					System.out.println("Fecha Fin: " + dtf.format(fechas[1]));
					System.out.println("Descuento: " + crearSuplementosDialog.getDescuento());
					// Sacamos los datos
					diaInicio = fechas[0].getDayOfMonth();
					mesInicio = fechas[0].getMonthValue();
					anoInicio = fechas[0].getYear();

					diaFin = fechas[1].getDayOfMonth();
					mesFin = fechas[1].getMonthValue();
					anoFin = fechas[1].getYear();
				}

				// Guardamos la info en la BD (hay que restarle 1 al mes porque
				// los meses en java.sql empiezan en 0
				boolean creada = BD.crearSuplemento(new java.sql.Date(anoInicio, mesInicio - 1, diaInicio),
						new java.sql.Date(anoFin, mesFin - 1, diaFin), porcentaje);
				if (creada)
					System.out.println("Se ha creado el suplemento");
				else
					System.out.println("Error creando el suplemento");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// GEN-LAST:event_jButton4ActionPerformed
	
	private void bCrearHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		try {
			// Lanzamos el diálogo
			if (crearHabitacionesDialog.showDialog()) {
				// Si se ha pulsado aceptar tenemos que guardar toda la info en
				// la BD
				String idHabitacion=crearHabitacionesDialog.getIdHabitacion();
				int tipo=crearHabitacionesDialog.getTipo();
				int planta=crearHabitacionesDialog.getPlanta();
				String descripcion=crearHabitacionesDialog.getDescripcion();
				List<Map<String,Object>> pathsImagenes=crearHabitacionesDialog.getPathsImagenes();
				
				// Traza
				System.out.println("\nTRAZA: Datos recogidos de la habitacion a crear:");
				System.out.println("idHabitacion: " + idHabitacion);
				System.out.println("tipo: " + tipo);
				System.out.println("planta: " + planta);
				System.out.println("descripcion: " + descripcion);
				System.out.println("Datos de las imágenes:");
				
				//Recorremos la lista de mapas
				for (Map<String, Object> map : pathsImagenes) {
					//Para cada mapa, sacamos los datos que tiene
					String ruta = (String) map.get("ruta");
					String nuevoNombre = (String) map.get("nuevoNombre");
                                        String rutaDestino = (String) map.get("nuevaRuta");
					
					//Traza
					System.out.println("Ruta: " + ruta);
					System.out.println("NuevoNombre: " + nuevoNombre);
					
					FileInputStream fis=null; FileOutputStream fos=null;
					//Copiamos esa imagen a la carpeta imagenes
		            try{
		                fis = new FileInputStream(ruta); //Le pasamos la ruta de la imagen
		                fos = new FileOutputStream(rutaDestino); //outFile -> Copia del archivo
		                
		                FileChannel inChannel = fis.getChannel(); 
		                FileChannel outChannel = fos.getChannel(); 
		                inChannel.transferTo(0, inChannel.size(), outChannel); 
		                
		            }catch (IOException ioe) {
		                System.out.println("Error al Generar Copia");
                                System.out.println(ioe.getMessage());
		            }finally{
		            	if(fis!=null) fis.close(); 
		                if(fos!=null) fos.close();
		            }
		            
				}
				
				List<String> listaPaths = new LinkedList<>();
				for (Map<String, Object> map : pathsImagenes) {
					listaPaths.add( (String) map.get("nuevaRuta") );
				}


				boolean creada = BD_jdbc.crearHabitacion(idHabitacion, tipo, planta, descripcion, listaPaths);
				if (creada)
					System.out.println("Se ha creado la habitacion");
				else
					System.out.println("Error creando la habitacion");
			}
		} catch (Exception e) {
			e.printStackTrace();
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
			java.util.logging.Logger.getLogger(GerenteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GerenteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GerenteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GerenteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GerenteFrame().setVisible(true);
			}
		});
	}

	// Creamos los dialogos
	private CrearPromocionesDialog crearPromocionesDialog;
	private CrearSuplementosDialog crearSuplementosDialog;
	private ConsultarPromocionesSuplementosDialog consultarPromocionesSuplementosDialog;
	private CrearHabitacionesDialog crearHabitacionesDialog;

	public void iniciarComponentesCarlos() {
		crearPromocionesDialog = new CrearPromocionesDialog();
		crearSuplementosDialog = new CrearSuplementosDialog();
		consultarPromocionesSuplementosDialog = new ConsultarPromocionesSuplementosDialog();
		crearHabitacionesDialog = new CrearHabitacionesDialog();
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		dispose();
		gert_44_alejandro.GUI.main(null);
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		dispose();
		gert_41_alejandro.GUI.main(null);
	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private JButton bCrearHabitaciones;
	// End of variables declaration
}
