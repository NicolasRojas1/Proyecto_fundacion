
package Proyecto_fundacion.vistas;

import javax.swing.JOptionPane;


public class Loggin extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

   
    public Loggin() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("USUARIO Y CONTRASEÑA");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBordeImagen = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        campo_usuario = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JLabel();
        campo_contrasena = new javax.swing.JPasswordField();
        txt_contraseña = new javax.swing.JLabel();
        jButtonIngresar = new javax.swing.JButton();
        jButtonOlvidoContraseña = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Mostar_Contraseña = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setResizable(false);

        jPanelBordeImagen.setBackground(new java.awt.Color(204, 204, 255));
        jPanelBordeImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanelBordeImagen.setPreferredSize(new java.awt.Dimension(620, 700));

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo fundaciónNH_400x400.jpg"))); // NOI18N
        jLabelImagen.setText("jLabel1");
        jLabelImagen.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanelBordeImagenLayout = new javax.swing.GroupLayout(jPanelBordeImagen);
        jPanelBordeImagen.setLayout(jPanelBordeImagenLayout);
        jPanelBordeImagenLayout.setHorizontalGroup(
            jPanelBordeImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBordeImagenLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanelBordeImagenLayout.setVerticalGroup(
            jPanelBordeImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBordeImagenLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabelImagen)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(420, 700));

        campo_usuario.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        campo_usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        campo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_usuarioActionPerformed(evt);
            }
        });

        txt_usuario.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txt_usuario.setText("USUARIO:");

        campo_contrasena.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        campo_contrasena.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txt_contraseña.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txt_contraseña.setText("CONTRASEÑA:");

        jButtonIngresar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonIngresar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jButtonIngresar.setText("INGRESAR");
        jButtonIngresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIngresarMouseClicked(evt);
            }
        });
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jButtonOlvidoContraseña.setBackground(new java.awt.Color(204, 204, 204));
        jButtonOlvidoContraseña.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jButtonOlvidoContraseña.setText("Olvido su Contraseña?");
        jButtonOlvidoContraseña.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonOlvidoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOlvidoContraseñaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/USUARIO.png"))); // NOI18N

        Mostar_Contraseña.setText("Mostrar Contraseña");
        Mostar_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostar_ContraseñaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(campo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(campo_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Mostar_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jButtonOlvidoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(campo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(campo_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Mostar_Contraseña)))
                .addGap(30, 30, 30)
                .addComponent(jButtonOlvidoContraseña))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelBordeImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelBordeImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresarMouseClicked
      this.dispose();
      //PerfilAdministrador ingresar = new PerfilAdministrador();
      //PerfilAdministrador ingresar = new PerfilAdministrador();
      //RegistroPersonas ingresar = new RegistroPersonas();
      //ingresar.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIngresarMouseClicked

    private void jButtonOlvidoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOlvidoContraseñaActionPerformed
        this.dispose();
      CambioContrasena entrar = new CambioContrasena();
     entrar.setVisible(true);
    }//GEN-LAST:event_jButtonOlvidoContraseñaActionPerformed

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
       String usuario= campo_usuario.getText();
        String contrasena= campo_contrasena.getText();
        if(usuario.equals("admin")&& contrasena.equals("1234")){
            PerfilAdministrador form= new PerfilAdministrador();
            form.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"error");
        }
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void Mostar_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostar_ContraseñaActionPerformed
       if(Mostar_Contraseña.isSelected()){
           campo_contrasena.setEchoChar((char)0);
       }else{
           campo_contrasena.setEchoChar('*');
       }
    }//GEN-LAST:event_Mostar_ContraseñaActionPerformed

    private void campo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_usuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Mostar_Contraseña;
    private javax.swing.JPasswordField campo_contrasena;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonOlvidoContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBordeImagen;
    private javax.swing.JLabel txt_contraseña;
    private javax.swing.JLabel txt_usuario;
    // End of variables declaration//GEN-END:variables
}
