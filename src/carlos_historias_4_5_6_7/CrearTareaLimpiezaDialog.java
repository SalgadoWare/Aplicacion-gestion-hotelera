/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos_historias_4_5_6_7;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.BD;

/**
 *
 * @author carlos
 */
public class CrearTareaLimpiezaDialog extends javax.swing.JDialog {

    /**
     * Creates new form CrearTareaLimpiezaDialog
     */
    private CrearTareaLimpiezaDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoLimpieza = new javax.swing.ButtonGroup();
        bCancelarCP = new javax.swing.JButton();
        bAceptarCP = new javax.swing.JButton();
        labelFechaIni = new javax.swing.JLabel();
        dcFechaTarea = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        cbHabitacion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObservaciones = new javax.swing.JTextArea();
        checkPrioritaria = new javax.swing.JCheckBox();
        rbLimpiezaCompleta = new javax.swing.JRadioButton();
        rbOtro = new javax.swing.JRadioButton();
        rbBañoRopaCamaYToallas = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        bCancelarCP.setBackground(new java.awt.Color(100, 100, 100));
        bCancelarCP.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        bCancelarCP.setForeground(new java.awt.Color(255, 255, 255));
        bCancelarCP.setText("Cancelar");
        bCancelarCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarCPActionPerformed(evt);
            }
        });

        bAceptarCP.setBackground(new java.awt.Color(43, 110, 232));
        bAceptarCP.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        bAceptarCP.setForeground(new java.awt.Color(255, 255, 255));
        bAceptarCP.setText("Aceptar");
        bAceptarCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarCPActionPerformed(evt);
            }
        });

        labelFechaIni.setText("Fecha Tarea:");

        dcFechaTarea.setDateFormatString("dd/MM/yyyy");

        jLabel1.setText("Habitación:");

        cbHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Observaciones:");

        taObservaciones.setColumns(20);
        taObservaciones.setRows(5);
        jScrollPane1.setViewportView(taObservaciones);

        checkPrioritaria.setText("Prioritaria");

        bgTipoLimpieza.add(rbLimpiezaCompleta);
        rbLimpiezaCompleta.setSelected(true);
        rbLimpiezaCompleta.setText("Limpieza completa");

        bgTipoLimpieza.add(rbOtro);
        rbOtro.setText("Otro");

        bgTipoLimpieza.add(rbBañoRopaCamaYToallas);
        rbBañoRopaCamaYToallas.setText("Baño, cambio de ropa de cama y toallas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbBañoRopaCamaYToallas)
                    .addComponent(rbOtro)
                    .addComponent(rbLimpiezaCompleta)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(checkPrioritaria)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bCancelarCP)
                        .addGap(18, 18, 18)
                        .addComponent(bAceptarCP))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcFechaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFechaIni))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelFechaIni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcFechaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(rbLimpiezaCompleta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbBañoRopaCamaYToallas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOtro)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkPrioritaria)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelarCP)
                    .addComponent(bAceptarCP))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarCPActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bCancelarCPActionPerformed

    private void bAceptarCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarCPActionPerformed
        java.util.Date fecha=dcFechaTarea.getDate();//Si no hay valor en la casilla devuelve null

        //comprobamos que la fecha no es menor que el dia actual
        if(fecha!=null && fecha.compareTo(Date.valueOf(LocalDate.now() ) ) < 0 ){
            JOptionPane.showMessageDialog(null,"La Fecha no puede ser anterior al día actual", "Fecha errónea",JOptionPane.WARNING_MESSAGE);
        }
        //Comprobamos que si está marcada la opción "Otro" haya algun texto en "Observacoines"
        else if(rbOtro.isSelected() && taObservaciones.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Si la tarea es del tipo \"Otro\" has de introducir información en el campo \"Observaciones\"", "Campo observaciones vacío",JOptionPane.WARNING_MESSAGE);
        }

        else{//Si todo está bien
            POK=true;//Indicamos que se ha pulsado el boton de Aceptar
            this.setVisible(false);
        }
    }//GEN-LAST:event_bAceptarCPActionPerformed

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
            java.util.logging.Logger.getLogger(CrearTareaLimpiezaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearTareaLimpiezaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearTareaLimpiezaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearTareaLimpiezaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearTareaLimpiezaDialog dialog = new CrearTareaLimpiezaDialog(new javax.swing.JFrame(), true);
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
    private boolean POK;//Variable ¿pulsó OK?
    
    public CrearTareaLimpiezaDialog(){
        this(null,true);//Ventana modal
    }
    
    public boolean showDialog(){
        // Inicialización de la interfaz        
        iniciarComponentesMio();
        
        POK=false;
        setVisible(true);//Mostramos la ventana
        //Es un codigo bloqueante
        //Como la ventana es modal se queda bloqueando la ventana anterior
        //La ventana antigua queda bloqueada porque el metodo setVisible no termina
        return POK;//Aqui POK vale true si el usuario pulso el boton OK y false si pulso Cancelar o cerro la ventana
    }
    
    private void añadirHabitacionesCB(){
        //Borramos todos los items del cb (si habia)
        cbHabitacion.removeAllItems();
        //Añadimos los numeros de las habitaciones (me los da la consulta)
        List<String> listaNumeroHabitaciones = BD.dameNumeroHabitaciones();
        for (String numHabitacion : listaNumeroHabitaciones) {
            cbHabitacion.addItem(numHabitacion);
        }
        
    }
    
    public String getHabitacion(){
        return cbHabitacion.getSelectedItem().toString();
    }
    
    /**
     * Devuelve un timeStamp con la fecha indicada por el usuario en la que se ha de realizar la tarea
     * o null si ese campo está vacio
     * @return 
     */
    public java.sql.Timestamp getFechaTarea(){
        java.util.Date fechaDate = dcFechaTarea.getDate();//Si no hay valor en la casilla devuelve null
        if(fechaDate==null)
            return null;
        else{
            java.sql.Timestamp ts =  new Timestamp(fechaDate.getTime());
            ts.setHours(0);
            ts.setMinutes(0);
            ts.setSeconds(0);
            return ts;
        }
    }
    
    /**
     * Devuelve un timeStamp con la fecha y hora en la que se crea la tarea
     * @return 
     */
    public java.sql.Timestamp getMomentoInformada(){
        return BD.getCurrentTimeStamp();
    }
    
    public String getObservaciones(){
        return taObservaciones.getText();
    }
    
    public boolean isPrioritaria(){
        return checkPrioritaria.isSelected();
    }
    
    public String getTipoTarea(){
        if(rbLimpiezaCompleta.isSelected())
            return "LC";
        else if(rbBañoRopaCamaYToallas.isSelected())
            return "BCT";
        else//si "Otro"
            return "O";
    }
    
    public void iniciarComponentesMio(){
        dcFechaTarea.setMinSelectableDate(Date.valueOf(LocalDate.now()));
        dcFechaTarea.setDate(null);
        taObservaciones.setText("");
        checkPrioritaria.setSelected(false);
        rbLimpiezaCompleta.setSelected(true);
        
        //Inicializamos el comboBox con el numero de todas las habitaciones del hotel
        añadirHabitacionesCB();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptarCP;
    private javax.swing.JButton bCancelarCP;
    private javax.swing.ButtonGroup bgTipoLimpieza;
    private javax.swing.JComboBox<String> cbHabitacion;
    private javax.swing.JCheckBox checkPrioritaria;
    private com.toedter.calendar.JDateChooser dcFechaTarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFechaIni;
    private javax.swing.JRadioButton rbBañoRopaCamaYToallas;
    private javax.swing.JRadioButton rbLimpiezaCompleta;
    private javax.swing.JRadioButton rbOtro;
    private javax.swing.JTextArea taObservaciones;
    // End of variables declaration//GEN-END:variables
}
