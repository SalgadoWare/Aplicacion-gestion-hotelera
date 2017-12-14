/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos.historias_8_9_10.gert47;

import carlos.historias_8_9_10.BD_jdbc;
import java.awt.Color;
import java.awt.Image;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class CrearHabitacionesDialog extends javax.swing.JDialog {

    /**
     * Creates new form CrearHabitacionesDialog
     */
    private CrearHabitacionesDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        lpintando = (LabelPintando) lPaint;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCancelar = new javax.swing.JButton();
        bAceptar = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelImagenPL = new javax.swing.JPanel();
        lPaint = new LabelPintando();
        bCargarImagen = new javax.swing.JButton();
        bAniadirImagen = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfIdHabitacion = new javax.swing.JTextField();
        tfPlanta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        labelNumImagenes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bCancelar.setBackground(new java.awt.Color(100, 100, 100));
        bCancelar.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        bCancelar.setForeground(new java.awt.Color(255, 255, 255));
        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bAceptar.setBackground(new java.awt.Color(43, 110, 232));
        bAceptar.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        bAceptar.setForeground(new java.awt.Color(255, 255, 255));
        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sencilla", "doble", "triple" }));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(80, 80, 80));
        jLabel3.setText("Descripción");

        taDescripcion.setColumns(20);
        taDescripcion.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        taDescripcion.setForeground(java.awt.Color.lightGray);
        taDescripcion.setRows(5);
        taDescripcion.setText("Escribe aquí la descripción de la habitación");
        taDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                taDescripcionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                taDescripcionFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(taDescripcion);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(80, 80, 80));
        jLabel4.setText("Número habitación:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(80, 80, 80));
        jLabel5.setText("Imágen");

        panelImagenPL.setBackground(new java.awt.Color(255, 255, 255));
        panelImagenPL.setLayout(new java.awt.GridLayout(1, 0));
        panelImagenPL.add(lPaint);

        bCargarImagen.setBackground(new java.awt.Color(153, 153, 153));
        bCargarImagen.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        bCargarImagen.setForeground(new java.awt.Color(255, 255, 255));
        bCargarImagen.setText("Cargar imágen");
        bCargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCargarImagenActionPerformed(evt);
            }
        });

        bAniadirImagen.setBackground(new java.awt.Color(153, 153, 153));
        bAniadirImagen.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        bAniadirImagen.setForeground(new java.awt.Color(255, 255, 255));
        bAniadirImagen.setText("Añadir imágen");
        bAniadirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAniadirImagenActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(80, 80, 80));
        jLabel6.setText("Tipo:");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(80, 80, 80));
        jLabel7.setText("Planta:");

        tfIdHabitacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfIdHabitacionFocusLost(evt);
            }
        });

        jLabel8.setText("Número de imágenes que se van a añadir: ");

        labelNumImagenes.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(bCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(bAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(panelImagenPL, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfIdHabitacion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(134, 134, 134)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(tfPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bCargarImagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAniadirImagen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNumImagenes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(panelImagenPL, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAniadirImagen)
                    .addComponent(bCargarImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNumImagenes)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bAceptar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed

        //comprobamos que idHabitacion no esté vacio
        if(getIdHabitacion()==null){
            JOptionPane.showMessageDialog(null,"Has de introducir un valor para el campo Número habitación", "Campo Número habitación vacío",JOptionPane.WARNING_MESSAGE);
        }
        //comprobamos que planta no esté vacio
        else if(getPlanta()==null){
            JOptionPane.showMessageDialog(null,"Has de introducir un valor para el campo Planta", "Campo Planta vacío",JOptionPane.WARNING_MESSAGE);
        }
        //comprobamos que descrpicion no esté vacio
        else if(getDescripcion()==null){
            JOptionPane.showMessageDialog(null,"Has de introducir un valor para el campo Descripción", "Campo Descripción vacío",JOptionPane.WARNING_MESSAGE);
        }
        //Comprobamos que no existe en la BD una habitacion con el mismo id
        else if(BD_jdbc.isHabitacionConElMismoIdEnLaBD(getIdHabitacion())){
            JOptionPane.showMessageDialog(null,"Ya existe una habitación con el mismo número", "No se puede dar de alta la habitación",JOptionPane.WARNING_MESSAGE);
        }

        else{//Si todo está bien
            
            //Le advertimos al usuario si mapaActual NO es vacio, es decir, que ha cargado una imagen
            //pero quizas se ha olvidado de añadirla
            if(! mapaActual.isEmpty()){
                int opcion_seleccioanda = JOptionPane.showConfirmDialog(null,"Has cargado una foto pero no la has añadido\n¿Quieres añadir esa foto a la habitación?", "Foto no añadida",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                //Si el usuario elige si
                if(opcion_seleccioanda==JOptionPane.YES_OPTION){
                    //Tenemos que añadir la foto, cuya informacion esta guardada en mapaActual
                    this.bAniadirImagenActionPerformed(evt);
                }
                    
            }
            
            POK=true;//Indicamos que se ha pulsado el boton de Aceptar
            this.setVisible(false);
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    private void taDescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_taDescripcionFocusGained
        //Si el texto pone "Escribe aquí la descripción de la habitación" en gris y ponemos el focus sobre el ta nos deja escribir la descripcion
        if(taDescripcion.getText().equalsIgnoreCase("Escribe aquí la descripción de la habitación") && taDescripcion.getForeground().equals(Color.LIGHT_GRAY)){
            PonerTexto("", taDescripcion, Color.black);
        }
    }//GEN-LAST:event_taDescripcionFocusGained

    private void taDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_taDescripcionFocusLost
        //Si el texto es vacio y quitamos el focus del ta ponemos el texto de fondo de ayuda (de color gris)
        if(taDescripcion.getText().equalsIgnoreCase("")){
            PonerTextoFondo("Escribe aquí la descripción de la habitación", taDescripcion);
        }
    }//GEN-LAST:event_taDescripcionFocusLost

    private void bCargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCargarImagenActionPerformed
        
        //Antes el usuario ha de haber introducido el numero de la habitacion para poder renombrar las imagenes
        if(getIdHabitacion()==null){
            JOptionPane.showMessageDialog(null,"Has de introducir un valor para el campo Número habitación\nantes de cargar imagenes", "Campo Número habitación vacío",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //Mostramos un dialogo para seleccionar una imagen
        JFileChooser FC = new JFileChooser();
        FC.showOpenDialog(null);

        String ruta = null;
        //Si se ha seleccionado un fichero
        if(FC.getSelectedFile()!=null){
            System.out.println("Se ha seleccionado una imagen");
            
            //Sacamos la ruta de la imagen
            ruta = FC.getSelectedFile().getAbsolutePath();
            System.out.println("Ruta:" + ruta);
            
            //Sacamos el nombre de la imagen y lo cambiamos (añadimos delante el idHabitacion y un guión bajo)
            String nombre = FC.getSelectedFile().getName();
            System.out.println("Nombre imagen (antiguo):" + nombre);
            String nuevoNombre = this.getIdHabitacion() + "_" + nombre;
            System.out.println("Nombre imagen (nuevo):" + nuevoNombre);
            
            //Guardamos temporalmente estos datos en la variable mapaActual
            //(no se va a guardar los datos de la imagen en la lista hasta que no se pulse el boto Añadir)
            mapaActual.put("ruta", ruta);
            mapaActual.put("nuevoNombre", nuevoNombre);
            mapaActual.put("nuevaRuta", "imagenes/" + nuevoNombre);
        }
        
        //Ponemos la imagen de la foto actual seleccionada
        if(ruta!=null)
            PonerIconoAjustado(lPaint, ruta);
        
    }//GEN-LAST:event_bCargarImagenActionPerformed

    private void bAniadirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAniadirImagenActionPerformed
        //Antes el usuario ha de haber introducido el numero de la habitacion para poder renombrar las imagenes
        if(getIdHabitacion()==null){
            JOptionPane.showMessageDialog(null,"Has de introducir un valor para el campo Número habitación\nantes de añadir imagenes", "Campo Número habitación vacío",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //Si el mapaActual esta vacio mostramos un dialogo y salimos
        if(mapaActual.isEmpty()){
            JOptionPane.showMessageDialog(null,"No has cargado ninguna foto,\no la foto cargada ya ha sido añadida", "No se puede cargar la foto",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //Comprobamos que la ruta de esa imagen no este ya en algun mapa de la lista
        for (Map<String, Object> map : listaMapasRutaNuevoNombre) {
            if(map.get("ruta").equals(mapaActual.get("ruta"))){
                JOptionPane.showMessageDialog(null,"Esa foto ya ha sido añadida", "No se puede cargar la foto",JOptionPane.WARNING_MESSAGE);
                return;
            }
                
        }
        
        //Guardamos en una lista de mapas estos datos --> (rutaImagen,nuevoNombre,nuevaRuta),es decir, el mapa actual
        //Las imagenes no se van a copiar aqui, se copian en la clase que llama a este dialogo
        //(antes hay que pulsar el boton de aceptar y comprobar que el ideHabitacion no existe ya en la BD)
        //listaMapasRutaNuevoNombre.add(mapaActual); NO PODEMOS AÑADIRLO DIRECTAMENTE PORQUE ES MODIFICABLE, ES UNA REFERENCIA
        //Hay que añadir una copia
        listaMapasRutaNuevoNombre.add(new HashMap<>(mapaActual));
        
        //Borramos todos los elementos del mapa para que si vuelven a pulsar el boton no se añada la misma imagen sin llamar al dialogo otra vez
        mapaActual.clear();
        
        //Incrementamos el numero de imagenes añadidas
        numImagenes++;
        this.labelNumImagenes.setText(""+numImagenes);
    }//GEN-LAST:event_bAniadirImagenActionPerformed

    private void tfIdHabitacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIdHabitacionFocusLost
        //Comprobamos que no existe en la BD una habitacion con el mismo id
        if(getIdHabitacion()!=null && BD_jdbc.isHabitacionConElMismoIdEnLaBD(getIdHabitacion())){
            JOptionPane.showMessageDialog(null,"Ya existe una habitación con el mismo número", "No se puede dar de alta la habitación",JOptionPane.WARNING_MESSAGE);
            tfIdHabitacion.setText("");
            mapaActual.clear();
            lPaint.setIcon(null);
        }
    }//GEN-LAST:event_tfIdHabitacionFocusLost

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
            java.util.logging.Logger.getLogger(CrearHabitacionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearHabitacionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearHabitacionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearHabitacionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearHabitacionesDialog dialog = new CrearHabitacionesDialog(new javax.swing.JFrame(), true);
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
    
    private void PonerIconoAjustado(javax.swing.JLabel label, String rutaIcono){
        ImageIcon imagen = new ImageIcon(rutaIcono);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icono);
    }
    
    private void PonerTexto(String texto, javax.swing.text.JTextComponent comp, Color color){
        comp.setText(texto);
        comp.setForeground(color);
    }
    
    private void PonerTextoFondo(String texto, javax.swing.text.JTextComponent comp){
        PonerTexto(texto, comp, Color.LIGHT_GRAY);
    }
    
    private boolean POK;//Variable ¿pulsó OK?
    
    public CrearHabitacionesDialog(){
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
    
    public String getIdHabitacion(){
        String texto = tfIdHabitacion.getText();
        if(texto.isEmpty())//Si esta vacio devolvemos null
            return null;
        else
            return texto;
    }
    
    public int getTipo(){
        String tipoString = (String) cbTipo.getSelectedItem();
        if(tipoString.equals("sencilla"))
            return 1;
        else if(tipoString.equals("doble"))
            return 2;
        else//triple
            return 3;
    }
    
    public Integer getPlanta(){
        String texto = tfPlanta.getText();
        if(texto.isEmpty())//Si esta vacio devolvemos null
            return null;
        else
            return Integer.parseInt(texto);
    }
    
    public String getDescripcion(){
        String texto = taDescripcion.getText();
        //Si la descripcion tiene el valor por defecto de ayuda (en gris) devolvemos null
        if(texto.equalsIgnoreCase("Escribe aquí la descripción de la habitación") && taDescripcion.getForeground().equals(Color.LIGHT_GRAY))
            return null;
        else if(texto.isEmpty())//Si esta vacio devolvemos null (Esto en realidad no deberia hacer falta ya que cuando pulsamos aceptar el ta pierde el foco y deberia ponerse el texto por defecto de nuevo
            return null;
        else
            return texto;
    }
    
    public List<Map<String,Object>> getPathsImagenes(){
        return listaMapasRutaNuevoNombre;
    }
    
    
    public void iniciarComponentesMio(){
        tfIdHabitacion.setText("");
        cbTipo.setSelectedIndex(0);
        tfPlanta.setText("");
        
        taDescripcion.setForeground(Color.LIGHT_GRAY);
        taDescripcion.setText("Escribe aquí la descripción de la habitación");
        
        lpintando.setIcon(null);
        lpintando.borra();
           
        listaMapasRutaNuevoNombre = new LinkedList<>();
        mapaActual = new HashMap<>();
        numImagenes = 0;
        labelNumImagenes.setText(""+numImagenes);
    }

    private LabelPintando lpintando;
    private List<Map<String,Object>> listaMapasRutaNuevoNombre;
    private Map<String,Object> mapaActual;
    private int numImagenes;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bAniadirImagen;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bCargarImagen;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lPaint;
    private javax.swing.JLabel labelNumImagenes;
    private javax.swing.JPanel panelImagenPL;
    private javax.swing.JTextArea taDescripcion;
    private javax.swing.JTextField tfIdHabitacion;
    private javax.swing.JTextField tfPlanta;
    // End of variables declaration//GEN-END:variables
}
