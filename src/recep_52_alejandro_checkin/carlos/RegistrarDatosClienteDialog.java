/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recep_52_alejandro_checkin.carlos;

/**
 *
 * @author carlos
 */
public class RegistrarDatosClienteDialog extends javax.swing.JDialog {

    
    
    /**
     * Creates new form RegistrarDatosClienteDialog
     */
    private RegistrarDatosClienteDialog(java.awt.Frame parent, boolean modal) {
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

        jLabel4 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfPasaporte = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbTipoTarjeta = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        tfNumeroTarjeta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        tfTelefonoFijo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfPoblacion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfCodigoPostal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfTelefonoMovil = new javax.swing.JTextField();
        dcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tfIdCliente = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfTarjeta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        bAceptarCP = new javax.swing.JButton();
        bCancelarCP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar datos del cliente");

        jLabel4.setText("Nombre");

        jLabel7.setText("Apellidos");

        jLabel8.setText("DNI");

        jLabel9.setText("Pasaporte");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Tarjeta de crédito/débito");

        jLabel2.setText("Tipo de tarjeta");

        cbTipoTarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visa", "Amex", "MasterCard" }));

        jLabel10.setText("Número");

        jLabel5.setText("Dirección");

        jLabel11.setText("Teléfono fijo");

        jLabel12.setText("Población");

        jLabel13.setText("Código postal");

        jLabel14.setText("E-mail");

        jLabel15.setText("Fecha de nacimiento");

        jLabel6.setText("Teléfono móvil");

        jLabel16.setText("IDCLIENTE:");

        tfIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdClienteActionPerformed(evt);
            }
        });

        jLabel17.setText("TARJETA");

        tfTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTarjetaActionPerformed(evt);
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

        bCancelarCP.setBackground(new java.awt.Color(100, 100, 100));
        bCancelarCP.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        bCancelarCP.setForeground(new java.awt.Color(255, 255, 255));
        bCancelarCP.setText("Cancelar");
        bCancelarCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarCPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbTipoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTelefonoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(dcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTelefonoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(tfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(tfTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(bCancelarCP)
                        .addGap(18, 18, 18)
                        .addComponent(bAceptarCP)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(tfTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(tfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelarCP)
                    .addComponent(bAceptarCP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefonoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfTelefonoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdClienteActionPerformed

    private void tfTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTarjetaActionPerformed

    private void bAceptarCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarCPActionPerformed
        
        //Aqui hacemos todas las comprobaciones de los datos antes de cerrar la ventana
        /*
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
        */
        //else{//Si el valor está bien

            POK=true;//Indicamos que se ha pulsado el boton de Aceptar
            this.setVisible(false);
        //}
    }//GEN-LAST:event_bAceptarCPActionPerformed

    private void bCancelarCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarCPActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bCancelarCPActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarDatosClienteDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarDatosClienteDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarDatosClienteDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarDatosClienteDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarDatosClienteDialog dialog = new RegistrarDatosClienteDialog(new javax.swing.JFrame(), true);
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
    
    public RegistrarDatosClienteDialog(){
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
    
    public void iniciarComponentesMio(){
        //Inicializamos la interfaz
        tfIdCliente.setText("");
        tfTarjeta.setText("");
        tfNombre.setText("");
        tfApellidos.setText("");
        tfDni.setText("");
        tfPasaporte.setText("");
        cbTipoTarjeta.setSelectedIndex(0);
        tfNumeroTarjeta.setText("");
        tfDireccion.setText("");
        tfPoblacion.setText("");
        tfCodigoPostal.setText("");
        tfTelefonoFijo.setText("");
        tfTelefonoMovil.setText("");
        tfEmail.setText("");
        dcFechaNacimiento.setDate(null);
        
    }

    public Integer getIdCliente(){
        String texto = tfIdCliente.getText();
        if(texto.isEmpty())
            return null;
        else
            return Integer.parseInt(texto);
    }
    
    public String getTarjeta(){
        String texto = tfTarjeta.getText();
        if(texto.isEmpty())
            return null;
        else
            return texto;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptarCP;
    private javax.swing.JButton bCancelarCP;
    private javax.swing.JComboBox<String> cbTipoTarjeta;
    private com.toedter.calendar.JDateChooser dcFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCodigoPostal;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfIdCliente;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNumeroTarjeta;
    private javax.swing.JTextField tfPasaporte;
    private javax.swing.JTextField tfPoblacion;
    private javax.swing.JTextField tfTarjeta;
    private javax.swing.JTextField tfTelefonoFijo;
    private javax.swing.JTextField tfTelefonoMovil;
    // End of variables declaration//GEN-END:variables
}