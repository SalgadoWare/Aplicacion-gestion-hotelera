package historia1.vistas;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import historia1.negocio.TipoHabitacion;
import launcher.GerenteFrame;

public class GUIAltaTarifa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	GUIAltaTarifa2 gui2;
	private Date inicioTarifa, finTarifa, hoy;

	/**
	 * Creates new form NewJFrame
	 */
	public GUIAltaTarifa() {
		initComponents();
		hoy = new Date();
		gui2 = new GUIAltaTarifa2(this);
		WindowAdapter exitListener = new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				GerenteFrame.main(null);
			}
		};

		addWindowListener(exitListener);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	@SuppressWarnings("deprecation")
	private void initComponents() {


		jPanel4 = new javax.swing.JPanel();
		jLabel8 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel9 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jPanel3 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jPanel6 = new javax.swing.JPanel();
		calendario_inicio = new com.toedter.calendar.JCalendar();
		calendario_inicio.setMinSelectableDate(java.sql.Date.valueOf(LocalDate.now()));
		jPanel12 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		calendario_final = new com.toedter.calendar.JCalendar();
		calendario_final.setMinSelectableDate(java.sql.Date.valueOf(LocalDate.now()));
		jPanel5 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jPanel10 = new javax.swing.JPanel();
		jButton2 = new javax.swing.JButton();
		jPanel8 = new javax.swing.JPanel();
		jButton3 = new javax.swing.JButton();
		jPanel9 = new javax.swing.JPanel();
		jButton4 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Alta tarifa");
		setBackground(new java.awt.Color(102, 255, 255));
		getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

		jPanel4.setBackground(new java.awt.Color(204, 255, 255));
		jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.PAGE_AXIS));

		jLabel8.setBackground(new java.awt.Color(102, 102, 255));
		jLabel8.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 36)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(255, 102, 102));
		jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel8.setText("Alta  de  tarifa  segun  el  tipo  de  habitacion");
		jLabel8.setToolTipText("");
		jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
		jPanel4.add(jLabel8);

		jPanel1.setBackground(new java.awt.Color(204, 255, 255));
		jPanel1.setMinimumSize(new java.awt.Dimension(20, 20));
		jPanel1.setPreferredSize(new java.awt.Dimension(20, 20));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 953, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 20, Short.MAX_VALUE));

		jPanel4.add(jPanel1);

		jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel9.setText("Selecciona el inicio y el fin en el calendario de la nueva tarifa que vas a registrar");
		jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
		jLabel9.setAlignmentY(20.0F);
		jPanel4.add(jLabel9);

		jPanel2.setBackground(new java.awt.Color(204, 255, 255));
		jPanel2.setPreferredSize(new java.awt.Dimension(20, 20));
		jPanel2.setRequestFocusEnabled(false);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 953, Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 20, Short.MAX_VALUE));

		jPanel4.add(jPanel2);

		getContentPane().add(jPanel4);

		jPanel3.setBackground(new java.awt.Color(204, 255, 255));
		jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

		jLabel2.setText("DESDE");
		jPanel3.add(jLabel2);

		jPanel6.setBackground(new java.awt.Color(204, 255, 255));
		jPanel6.setPreferredSize(new java.awt.Dimension(20, 20));

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 20, Short.MAX_VALUE));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 187, Short.MAX_VALUE));

		jPanel3.add(jPanel6);

		calendario_inicio.setBackground(new java.awt.Color(204, 255, 255));
		calendario_inicio.setDecorationBackgroundColor(new java.awt.Color(51, 255, 255));
		jPanel3.add(calendario_inicio);

		jPanel12.setBackground(new java.awt.Color(204, 255, 255));
		jPanel12.setPreferredSize(new java.awt.Dimension(20, 20));

		javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
		jPanel12.setLayout(jPanel12Layout);
		jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 20, Short.MAX_VALUE));
		jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 187, Short.MAX_VALUE));

		jPanel3.add(jPanel12);

		jLabel1.setText("HASTA");
		jPanel3.add(jLabel1);

		jPanel7.setBackground(new java.awt.Color(204, 255, 255));
		jPanel7.setPreferredSize(new java.awt.Dimension(20, 20));

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 20, Short.MAX_VALUE));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 187, Short.MAX_VALUE));

		jPanel3.add(jPanel7);

		calendario_final.setDecorationBackgroundColor(new java.awt.Color(51, 255, 255));
		calendario_final.setMinSelectableDate(java.sql.Date.valueOf(LocalDate.now()));
		jPanel3.add(calendario_final);

		getContentPane().add(jPanel3);

		jPanel5.setBackground(new java.awt.Color(204, 255, 255));
		jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

		jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
		jLabel3.setText("Ahora selecciona el tipo de habitacion");
		jPanel5.add(jLabel3);

		jPanel10.setBackground(new java.awt.Color(204, 255, 255));
		jPanel10.setMinimumSize(new java.awt.Dimension(5, 5));
		jPanel10.setPreferredSize(new java.awt.Dimension(5, 5));

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
		jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 18, Short.MAX_VALUE));
		jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));

		jPanel5.add(jPanel10);

		jButton2.setBackground(new java.awt.Color(204, 204, 255));
		jButton2.setLabel("Sencilla");
		jButton2.setPreferredSize(new java.awt.Dimension(200, 100));
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jPanel5.add(jButton2);

		jPanel8.setBackground(new java.awt.Color(204, 255, 255));
		jPanel8.setPreferredSize(new java.awt.Dimension(5, 5));

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 18, Short.MAX_VALUE));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));

		jPanel5.add(jPanel8);

		jButton3.setBackground(new java.awt.Color(204, 204, 255));
		jButton3.setText("Doble");
		jButton3.setPreferredSize(new java.awt.Dimension(200, 100));
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jPanel5.add(jButton3);

		jPanel9.setBackground(new java.awt.Color(204, 255, 255));
		jPanel9.setPreferredSize(new java.awt.Dimension(5, 5));

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 18, Short.MAX_VALUE));
		jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));

		jPanel5.add(jPanel9);

		jButton4.setBackground(new java.awt.Color(204, 204, 255));
		jButton4.setText("Triple");
		jButton4.setPreferredSize(new java.awt.Dimension(200, 100));
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		jPanel5.add(jButton4);

		getContentPane().add(jPanel5);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		// TODO add your handling code here:
		// sencilla
		if (checkDates()) {
			setVisible(false);
			gui2.showInfo(inicioTarifa, finTarifa, TipoHabitacion.sencilla);
		} else {
			JOptionPane.showMessageDialog(null, "Las fechas no son correctas");
		}
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		// TODO add your handling code here:
		// doble
		if (checkDates()) {
			setVisible(false);
			gui2.showInfo(inicioTarifa, finTarifa, TipoHabitacion.doble);
		} else {
			JOptionPane.showMessageDialog(null, "Las fechas no son correctas");
		}
	}// GEN-LAST:event_jButton3ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		// TODO add your handling code here:
		// triple
		if (checkDates()) {
			setVisible(false);
			gui2.showInfo(inicioTarifa, finTarifa, TipoHabitacion.triple);
		} else {
			JOptionPane.showMessageDialog(null, "Las fechas no son correctas");
		}
	}// GEN-LAST:event_jButton4ActionPerformed

	private boolean checkDates() {
		inicioTarifa = calendario_inicio.getDate();
		finTarifa = calendario_final.getDate();
		return finTarifa.after(inicioTarifa) && finTarifa.after(hoy);
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
			java.util.logging.Logger.getLogger(GUIAltaTarifa.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUIAltaTarifa.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUIAltaTarifa.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUIAltaTarifa.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUIAltaTarifa().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private com.toedter.calendar.JCalendar calendario_final;
	private com.toedter.calendar.JCalendar calendario_inicio;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel12;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	// End of variables declaration//GEN-END:variables

}
