package clase10;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Agenda extends javax.swing.JFrame {

    private ArrayList<Contacto> alContactos = new ArrayList();
    ArrayList<Contacto> alBuscados;
    DefaultTableModel modelo;

    public Agenda() {
        initComponents();
        //PARA AJUSTAR LA VENTANA EN EL CENTRO DE LA PANTALLA
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContactos = new javax.swing.JTable();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnBuscador = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Telefono");

        jLabel4.setText("Email");

        tablaContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Telefono", "Email"
            }
        ));
        jScrollPane1.setViewportView(tablaContactos);

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });

        jtfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfApellidoActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscador.setText("Buscador");
        btnBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscadorActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("AGENDA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscadorActionPerformed

        String apellido = this.jtfApellido.getText();
        String telefono = this.jtfTelefono.getText();
        String nombre = this.jtfNombre.getText();
        String mail = this.jtfEmail.getText();
        ;
        if (apellido.isEmpty() && nombre.isEmpty() && telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Para buscar, debe completar al menos un campos.");
        } else {
            if (apellido.length() > 0) {
                alBuscadosPorApellido(apellido);
            }
            if (nombre.length() > 0) {
                alBuscadosPorNombre(nombre);
            }
            if (mail.length() > 0) {
                alBuscadosPorEmail(mail);
            }
            if (telefono.length() > 0) {
                alBuscadosPorTelefono(telefono);
            }
            imprimirArray(alBuscados);
            cargarContactosEnTabla(alBuscados);

        }


    }//GEN-LAST:event_btnBuscadorActionPerformed

    private void jtfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfApellidoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String apellido = this.jtfApellido.getText();
        String nombre = this.jtfNombre.getText();
        String telefono = this.jtfTelefono.getText();
        String mail = this.jtfEmail.getText();
        Contacto contacto;
        if (apellido.isEmpty() && nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete los campos 'Nombre y Apellido.");
            System.out.println("Complete los datos.");
        } else if (apellido.isEmpty() && telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete los campos 'Apellido y Telefono.");
            System.out.println("Complete los datos.");
        } else if (nombre.isEmpty() && telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete los campos 'Nombre y Telefono.");
            System.out.println("Complete los datos.");
        } else if (apellido.isEmpty() && nombre.isEmpty() && telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete los campos.");
            System.out.println("Complete los datos.");
        } else if (apellido.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete el campo 'Apellido'.");
            System.out.println("Complete los datos.");
        } else if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete el campo 'Nombre'.");
            System.out.println("Complete los datos.");
        } else if (telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete el campo 'Telefono'.");
            System.out.println("Complete los datos.");
        } else {
            contacto = new Contacto(nombre, apellido, telefono, mail);
            this.agregarContacto(contacto);
            cargarContactosEnTabla(alContactos);
            limpiarCampos();
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //DEVUELVE QUE FILA ESTA SELECCIONADO.
        int fila = this.tablaContactos.getSelectedRow();
        //DEL MODELO AGARRO SU VALOR, EN CADA POSICION.
        String nombre = modelo.getValueAt(fila, 0).toString();
        String apellido = modelo.getValueAt(fila, 1).toString();
        String telefono = modelo.getValueAt(fila, 2).toString();
        String mail = modelo.getValueAt(fila, 3).toString();
        Contacto contacto = new Contacto(nombre, apellido, telefono, mail);
        borrarContacto(contacto);
        cargarContactosEnTabla(this.alContactos);

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed
    //AGREGO UN CONTACTO NUEVO, LUEGO LO IMPRIMO.
    public void agregarContacto(Contacto contactoNuevo) {
        this.alContactos.add(contactoNuevo);
        this.imprimirArray(alContactos);
    }

    public void imprimirArray(ArrayList<Contacto> al) {
        System.out.println("El array Tiene: ");
        for (int i = 0; i < al.size(); i++) {
            System.out.println("Apellido: " + al.get(i).getApellido() + "\tNombre: " + al.get(i).getNombre() + "\tTelefono: " + al.get(i).getTelefono() + "\tEmail: " + al.get(i).getMail());
        }
        limpiarCampos();
    }

    public void alBuscadosPorApellido(String apellidoBuscado) {
        this.alBuscados = new ArrayList();
        for (int i = 0; i < this.alContactos.size(); i++) {
            if (alContactos.get(i).getApellido().equals(apellidoBuscado)) {
                this.alBuscados.add(alContactos.get(i));
            }
        }
    }

    public void alBuscadosPorNombre(String nombreBuscado) {
        this.alBuscados = new ArrayList();
        for (int i = 0; i < this.alContactos.size(); i++) {
            if (alContactos.get(i).getNombre().equals(nombreBuscado)) {
                this.alBuscados.add(alContactos.get(i));
            }
        }
    }

    public void alBuscadosPorEmail(String emailBuscado) {
        this.alBuscados = new ArrayList();
        for (int i = 0; i < this.alContactos.size(); i++) {
            if (alContactos.get(i).getMail().equals(emailBuscado)) {
                this.alBuscados.add(alContactos.get(i));
            }
        }
    }

    public void alBuscadosPorTelefono(String telefonoBuscado) {
        this.alBuscados = new ArrayList();
        for (int i = 0; i < this.alContactos.size(); i++) {
            if (alContactos.get(i).getTelefono().equals(telefonoBuscado)) {
                this.alBuscados.add(alContactos.get(i));
            }
        }
    }

    public void limpiarCampos() {
        this.jtfNombre.setText("");
        this.jtfEmail.setText("");
        this.jtfApellido.setText("");
        this.jtfTelefono.setText("");
    }

    void cargarContactosEnTabla(ArrayList<Contacto> lista) {
        //PARSEO LA TABLA
        modelo = (DefaultTableModel) this.tablaContactos.getModel();
        //GUARDO TODO LO QUE ESTA VISIBLE
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            //AGREGO CADA FILA
            modelo.addRow(new Object[]{lista.get(i).getNombre(), lista.get(i).getApellido(), lista.get(i).getTelefono(), lista.get(i).getMail()});
        }
    }

    void borrarContacto(Contacto c) {
        for (int i = 0; i < this.alContactos.size(); i++) {
            if (alContactos.get(i).getApellido().equals(c.getApellido())) {
                if (alContactos.get(i).getNombre().equals(c.getNombre())) {
                    alContactos.remove(i);
                }
            }
        }
    }

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscador;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    private javax.swing.JTable tablaContactos;
    // End of variables declaration//GEN-END:variables
}
