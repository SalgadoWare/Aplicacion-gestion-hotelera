/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos.historias_1_2_3;

import java.time.*;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import jdbc.BD;

/**
 *
 * @author carlos
 */
public class CrearPromocionesDialog extends javax.swing.JDialog {
 
    
    /**
     * Creates new form CrearPromocionesDialog
     */
    private CrearPromocionesDialog(java.awt.Frame parent, boolean modal) {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgFechas = new javax.swing.ButtonGroup();
        rbFechaUnica = new javax.swing.JRadioButton();
        rbRangoDeFechas = new javax.swing.JRadioButton();
        labelFechaIni = new javax.swing.JLabel();
        labelFechaFin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bCancelarCP = new javax.swing.JButton();
        bAceptarCP = new javax.swing.JButton();
        dcFechaIni = new com.toedter.calendar.JDateChooser();
        dcFechaFin = new com.toedter.calendar.JDateChooser();
        tfDescuento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Promociones");
        setResizable(false);

        bgFechas.add(rbFechaUnica);
        rbFechaUnica.setSelected(true);
        rbFechaUnica.setText("Fecha Única");
        rbFechaUnica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFechaUnicaActionPerformed(evt);
            }
        });

        bgFechas.add(rbRangoDeFechas);
        rbRangoDeFechas.setText("Rango de Fechas");
        rbRangoDeFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRangoDeFechasActionPerformed(evt);
            }
        });

        labelFechaIni.setText("Fecha");

        labelFechaFin.setText("Fecha Fin");

        jLabel3.setText("Descuento (%)");

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

        dcFechaIni.setDateFormatString("dd/MM/yyyy");

        dcFechaFin.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(rbFechaUnica)
                        .addGap(53, 53, 53)
                        .addComponent(rbRangoDeFechas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(bCancelarCP)
                        .addGap(18, 18, 18)
                        .addComponent(bAceptarCP))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDescuento)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFechaIni))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFechaFin)
                            .addComponent(dcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbFechaUnica)
                    .addComponent(rbRangoDeFechas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFechaIni)
                    .addComponent(labelFechaFin))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelarCP)
                    .addComponent(bAceptarCP))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbRangoDeFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRangoDeFechasActionPerformed
        //Si está seleccionado tenemos que cambiar la label de "Día" por "Fecha Inicio"
        //y activar el otro DateChooser
        labelFechaIni.setText("Fecha Inicio");
        dcFechaFin.setVisible(true);
        labelFechaFin.setVisible(true);
    }//GEN-LAST:event_rbRangoDeFechasActionPerformed

    private void rbFechaUnicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFechaUnicaActionPerformed
        //Si está seleccionado tenemos que cambiar la label de "Fecha Inicio" por "Día"
        //y desactivar el otro DateChooser
        labelFechaIni.setText("Fecha");
        dcFechaFin.setVisible(false);
         labelFechaFin.setVisible(false);
    }//GEN-LAST:event_rbFechaUnicaActionPerformed

    private void bCancelarCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarCPActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bCancelarCPActionPerformed

    private void bAceptarCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarCPActionPerformed
        java.util.Date fechaIni=dcFechaIni.getDate();//Si no hay valor en la casilla devuelve null
        java.util.Date fechaFin = dcFechaFin.getDate();//Si no hay valor en la casilla (bien porque esta oculta o porque el usuario no le da valor) devuelve null
        boolean esFechaUnica = rbFechaUnica.isSelected();
        boolean esRangoDeFechas = rbRangoDeFechas.isSelected(); 
        Double descuento = getDescuento();
        
        //Comprobamos que los campos fecha no son vacios
        if(esFechaUnica && fechaIni==null){
            JOptionPane.showMessageDialog(null,"Has de introducir un valor para el campo Fecha", "Campo Fecha vacío",JOptionPane.WARNING_MESSAGE);
        }
        else if(esRangoDeFechas && fechaIni==null && fechaFin==null){
            JOptionPane.showMessageDialog(null,"Has de introducir un valor para los campos Fecha Inicio y Fecha Fin", "Campos Fecha vacíos",JOptionPane.WARNING_MESSAGE);
        }
        else if(esRangoDeFechas && fechaIni==null){
            JOptionPane.showMessageDialog(null,"Has de introducir un valor para el campo Fecha Inicio", "Campo Fecha Inicio vacío",JOptionPane.WARNING_MESSAGE);
        }
        else if(esRangoDeFechas && fechaFin==null){
            JOptionPane.showMessageDialog(null,"Has de introducir un valor para el campo Fecha Fin", "Campo Fecha Fin vacío",JOptionPane.WARNING_MESSAGE);
        }
        //comprobamos que las fechas son correctas
        else if(fechaIni.compareTo(Date.valueOf(LocalDate.now() ) ) < 0 ){
            JOptionPane.showMessageDialog(null,"La Fecha no puede ser anterior al día actual", "Fecha errónea",JOptionPane.WARNING_MESSAGE);
        }
        else if(esRangoDeFechas && fechaIni.compareTo(fechaFin) > 0){
                JOptionPane.showMessageDialog(null,"La fecha introducida en FechaFin no puede ser anterior a la introducida en FechaInicio", "Rango de fechas erróneo",JOptionPane.WARNING_MESSAGE);
        }
        //Comprobamos que el porcentaje es correcto
        else if(descuento==null){
            JOptionPane.showMessageDialog(null,"Has de introducir un valor numérico para el campo porcentaje", "Campo porcentaje sin valor numérico",JOptionPane.WARNING_MESSAGE);
        }
        else if(descuento < 0|| descuento>100){
            JOptionPane.showMessageDialog(null,"El valor del porcentaje ha de estar entre 0 y 100", "Porcentaje erróneo",JOptionPane.WARNING_MESSAGE);
        }
        //Comprobamos que no se superpone con otras promociones
        else if(esFechaUnica && !BD.fechasPromocionesValidoParaTodosLosRangosDeLaBD(fechaIni.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), fechaIni.toInstant().atZone(ZoneId.systemDefault()).toLocalDate())){
            JOptionPane.showMessageDialog(null,"Esa fecha no se puede introducir.\nYa hay una promoción que se superpone con esa fecha", "Fecha errónea",JOptionPane.WARNING_MESSAGE);
        }
        else if(esRangoDeFechas && !BD.fechasPromocionesValidoParaTodosLosRangosDeLaBD(fechaIni.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), fechaFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate())){
            JOptionPane.showMessageDialog(null,"Ese rango de fechas no se puede introducir.\nYa hay una promoción que se superpone con esas fechas", "Rango de fechas erróneo",JOptionPane.WARNING_MESSAGE);
        }
        else{//Si el valor está bien
            LocalDate Ini; LocalDate Fin;
            if(esFechaUnica){
                Ini = fechaIni.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                Fin = fechaIni.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            }else{
                Ini = fechaIni.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                Fin = fechaFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            }
            
            //Comprobamos que no se superpone con otros suplementos
            //En caso afirmativo mostramos un warning y que el usuario decida
            if(!BD.fechasSuplementosValidoParaTodosLosRangosDeLaBD(Ini, Fin)){
                int opcion_seleccioanda = JOptionPane.showConfirmDialog(null,"Existe un suplemento que se superpone en fechas con la promoción que quieres crear.\n¿Quieres crear la promoción de todas formas?", "Fecha se superpone con suplemento",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                //Si el usuario elige no, es como si no pulsase el boton
                if(opcion_seleccioanda==JOptionPane.NO_OPTION)
                    return;
            }
            
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
            java.util.logging.Logger.getLogger(CrearPromocionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearPromocionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearPromocionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearPromocionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearPromocionesDialog dialog = new CrearPromocionesDialog(new javax.swing.JFrame(), true);
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
    
    public CrearPromocionesDialog(){
        this(null,true);//Ventana modal
    }
    
    public boolean showDialog(){
        // Inicialización de la interfaz
        rbFechaUnica.setSelected(true);
        //rbRangoDeFechasActionPerformed(null);
        labelFechaIni.setText("Fecha");
        dcFechaFin.setVisible(false);
        labelFechaFin.setVisible(false);
        
        dcFechaIni.setDate(null);
        dcFechaFin.setDate(null);
        tfDescuento.setText("");
        
        POK=false;
        setVisible(true);//Mostramos la ventana
        //Es un codigo bloqueante
        //Como la ventana es modal se queda bloqueando la ventana anterior
        //La ventana antigua queda bloqueada porque el metodo setVisible no termina
        return POK;//Aqui POK vale true si el usuario pulso el boton OK y false si pulso Cancelar o cerro la ventana
    }

    public void iniciarComponentesMio(){
        dcFechaIni.setMinSelectableDate(Date.valueOf(LocalDate.now()));
        dcFechaFin.setMinSelectableDate(Date.valueOf(LocalDate.now()));
    }
    
    /**
     * Devuelve cierto si la promocion se aplica a una única fecha (a un solo día) y falso si se aplica a un rango de fechas
     * @return 
     */
    public boolean isFechaUnica(){
        return rbFechaUnica.isSelected();
    }
    
    /**
     * Devuelve la fecha unica si esta seleccionada el modo fecha unica y una excepcion en caso contrario
     * @return LocalDate con la fecha
     * @throws IllegalAccessException 
     */
    public LocalDate getFechaUnica() throws Exception{
        if(isFechaUnica()){
            java.util.Date fechaDate = dcFechaIni.getDate();
            return fechaDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
        else throw new Exception("Fecha Unica no estaba seleccionado");
    }
    
    /**
     * Devuelve un vector con dos fechas si está seleccionado el modo Rango de fechas y una excepcion en caso contrario
     * En la posicion 0 del vector tenemos la Fecha de Inicio y en la posicion 1 la Fecha de Fin
     * @return vector de LocalDate con dos posiciones, la 0 la fecha de Inicio y la 1 la Fecha de Fin
     * @throws IllegalAccessException 
     */
    public LocalDate[] getFechasIniFin() throws Exception{
        if(isFechaUnica())
            throw new Exception("Rango de Fechas no estaba seleccionado");
        
        LocalDate[] vectorLocalDate = new LocalDate[2];
        vectorLocalDate[0]=dcFechaIni.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        vectorLocalDate[1]=dcFechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        return vectorLocalDate;
    }
    
    public Double getDescuento(){
        String texto = tfDescuento.getText();
        if(texto.isEmpty())//Si esta vacio devolvemos null
            return null;
        if(texto.matches("\\d*"))//Si en el tf hay un numero, parseamos el numero y lo devolvemos
            return Double.parseDouble(tfDescuento.getText());
        else//Si en el tf no hay un numero devolvemos null
            return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptarCP;
    private javax.swing.JButton bCancelarCP;
    private javax.swing.ButtonGroup bgFechas;
    private com.toedter.calendar.JDateChooser dcFechaFin;
    private com.toedter.calendar.JDateChooser dcFechaIni;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelFechaFin;
    private javax.swing.JLabel labelFechaIni;
    private javax.swing.JRadioButton rbFechaUnica;
    private javax.swing.JRadioButton rbRangoDeFechas;
    private javax.swing.JTextField tfDescuento;
    // End of variables declaration//GEN-END:variables
}
