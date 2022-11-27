/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proyecto_fundacion.vistas;

/**
 *
 * @author USUARIO
 */
public class psicologia extends javax.swing.JFrame {

    /**
     * Creates new form psicologia
     */
    public psicologia() {
        initComponents();
         setVisible(true);
        setLocationRelativeTo(null);
        setTitle("PSICOLOGÍA");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Psicología = new javax.swing.JLabel();
        NombrePsicologo = new javax.swing.JLabel();
        SeleccioneEstudiante = new javax.swing.JComboBox<>();
        NombreEstu = new javax.swing.JLabel();
        Alerta = new javax.swing.JLabel();
        CampoAlerta = new javax.swing.JComboBox<>();
        CampoPrimSec = new java.awt.TextArea();
        CampoPrimSes = new javax.swing.JLabel();
        SegundaSesion = new javax.swing.JLabel();
        CampoSegSes = new java.awt.TextArea();
        CampoTercSes = new javax.swing.JLabel();
        CampoTercSec = new java.awt.TextArea();
        CampoObser = new javax.swing.JLabel();
        CampoObse = new java.awt.TextArea();
        CampoNomPsico1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BotSigPsi = new javax.swing.JButton();
        jBIrANotificaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Psicología.setBackground(new java.awt.Color(255, 255, 255));
        Psicología.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Psicología.setText("PSICOLOGÍA");
        jPanel1.add(Psicología, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 150, -1));

        NombrePsicologo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        NombrePsicologo.setText("Nombre Psicólogo");
        jPanel1.add(NombrePsicologo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 30));

        SeleccioneEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el Estudiante" }));
        SeleccioneEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccioneEstudianteActionPerformed(evt);
            }
        });
        jPanel1.add(SeleccioneEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 260, 30));

        NombreEstu.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        NombreEstu.setText("Nombre Estudiante");
        jPanel1.add(NombreEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        Alerta.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Alerta.setText("Alerta creada por");
        jPanel1.add(Alerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, -1, -1));

        jPanel1.add(CampoAlerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 220, 30));
        jPanel1.add(CampoPrimSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 950, 70));

        CampoPrimSes.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        CampoPrimSes.setText("Primera sesión:");
        jPanel1.add(CampoPrimSes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        SegundaSesion.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        SegundaSesion.setText("Segunda sesión");
        jPanel1.add(SegundaSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));
        jPanel1.add(CampoSegSes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 950, 60));

        CampoTercSes.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        CampoTercSes.setText("Tercera sesión");
        jPanel1.add(CampoTercSes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));
        jPanel1.add(CampoTercSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 950, 70));

        CampoObser.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        CampoObser.setText("Observaciones:");
        jPanel1.add(CampoObser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));
        jPanel1.add(CampoObse, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 950, 70));

        CampoNomPsico1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el Psicólogo" }));
        CampoNomPsico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomPsico1ActionPerformed(evt);
            }
        });
        jPanel1.add(CampoNomPsico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 260, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoFNH2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 110));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 660, 60));

        BotSigPsi.setBackground(new java.awt.Color(204, 204, 204));
        BotSigPsi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        BotSigPsi.setText("IR AL PERFIL COORD");
        BotSigPsi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotSigPsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotSigPsiMouseClicked(evt);
            }
        });
        jPanel1.add(BotSigPsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 661, 160, 30));

        jBIrANotificaciones.setBackground(new java.awt.Color(204, 204, 204));
        jBIrANotificaciones.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jBIrANotificaciones.setText("IR A NOTIFICACIONES");
        jBIrANotificaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBIrANotificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIrANotificacionesActionPerformed(evt);
            }
        });
        jPanel1.add(jBIrANotificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 660, 180, 30));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccioneEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccioneEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeleccioneEstudianteActionPerformed

    private void CampoNomPsico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomPsico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomPsico1ActionPerformed

    private void BotSigPsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotSigPsiMouseClicked
        this.dispose();
        PerfilCoordinador abrir = new PerfilCoordinador();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotSigPsiMouseClicked

    private void jBIrANotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIrANotificacionesActionPerformed
        this.dispose();
        Notificaciones abrir = new Notificaciones();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBIrANotificacionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alerta;
    private javax.swing.JButton BotSigPsi;
    private javax.swing.JComboBox<String> CampoAlerta;
    private javax.swing.JComboBox<String> CampoNomPsico1;
    private java.awt.TextArea CampoObse;
    private javax.swing.JLabel CampoObser;
    private java.awt.TextArea CampoPrimSec;
    private javax.swing.JLabel CampoPrimSes;
    private java.awt.TextArea CampoSegSes;
    private java.awt.TextArea CampoTercSec;
    private javax.swing.JLabel CampoTercSes;
    private javax.swing.JLabel NombreEstu;
    private javax.swing.JLabel NombrePsicologo;
    private javax.swing.JLabel Psicología;
    private javax.swing.JLabel SegundaSesion;
    private javax.swing.JComboBox<String> SeleccioneEstudiante;
    private javax.swing.JButton jBIrANotificaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}