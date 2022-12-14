/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proyecto_fundacion.vistas;
import Proyecto_fundacion.models.Personas;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;
import Proyecto_fundacion.controller.PersonasController;
import com.mycompany.proyecto_fundacion.Main;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
public class Perfil_estudiante extends javax.swing.JFrame {

    /**
     * Creates new form Perfil_estudiante
     */
    public Perfil_estudiante() {
        initComponents();
        this.setLocationRelativeTo(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("PERFIL DEL ESTUDIANTE");
    }
//Instanciar para poder utilizar
    Perfil_estudiante pestudiante = new Perfil_estudiante(); 
    
    //Asi accedo a los metodos del registro
    Perfil_estudiante registro = new Perfil_estudiante();
    private String date;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        NomFunda2 = new javax.swing.JLabel();
        NombreEst2 = new javax.swing.JLabel();
        CNombreEst2 = new javax.swing.JTextField();
        ApelliEst3 = new javax.swing.JLabel();
        CApelliEst3 = new javax.swing.JTextField();
        CodigoEst2 = new javax.swing.JLabel();
        CCodiest2 = new javax.swing.JTextField();
        DatGene2 = new javax.swing.JLabel();
        DocumenEst2 = new javax.swing.JLabel();
        CdocumEst4 = new javax.swing.JComboBox<>();
        FechaNacEst2 = new javax.swing.JLabel();
        NumeroEst2 = new javax.swing.JLabel();
        CNumEst2 = new javax.swing.JTextField();
        Ciudad2 = new javax.swing.JLabel();
        CCiudad2 = new javax.swing.JTextField();
        DatMed2 = new javax.swing.JLabel();
        Sisben2 = new javax.swing.JLabel();
        CSisben2 = new javax.swing.JTextField();
        Eps2 = new javax.swing.JLabel();
        CEps2 = new javax.swing.JTextField();
        TipoSangre2 = new javax.swing.JLabel();
        Discapacidad2 = new javax.swing.JLabel();
        CTipoSangre2 = new javax.swing.JTextField();
        CdocumEst5 = new javax.swing.JComboBox<>();
        NonbreIncap2 = new javax.swing.JLabel();
        CNomInca2 = new javax.swing.JLabel();
        AlerMedic2 = new javax.swing.JLabel();
        CAlerMedi2 = new javax.swing.JComboBox<>();
        CAlergMed2 = new javax.swing.JLabel();
        CAlerAlim4 = new javax.swing.JLabel();
        AlerAlim4 = new javax.swing.JLabel();
        CAlergAlim4 = new javax.swing.JComboBox<>();
        AlerAlim5 = new javax.swing.JLabel();
        CAlergAlim5 = new javax.swing.JComboBox<>();
        CAlerAlim5 = new javax.swing.JLabel();
        DatAcudi2 = new javax.swing.JLabel();
        NombresAcud2 = new javax.swing.JLabel();
        CNomAcud4 = new javax.swing.JTextField();
        Apellidos2 = new javax.swing.JLabel();
        CNomAcud5 = new javax.swing.JTextField();
        Direcci??nAcud2 = new javax.swing.JLabel();
        CDireccAcud2 = new javax.swing.JTextField();
        BarrioAcud2 = new javax.swing.JLabel();
        CBarrioAcud2 = new javax.swing.JTextField();
        CalularAcud2 = new javax.swing.JLabel();
        CCelularAcud2 = new javax.swing.JTextField();
        FijoAcud2 = new javax.swing.JLabel();
        CFijoAcud2 = new javax.swing.JTextField();
        DatAcademicos2 = new javax.swing.JLabel();
        Teatro2 = new javax.swing.JLabel();
        CTeatro2 = new javax.swing.JTextField();
        Danzas2 = new javax.swing.JLabel();
        CDanzas2 = new javax.swing.JTextField();
        Musica2 = new javax.swing.JLabel();
        CMusica2 = new javax.swing.JTextField();
        EducComplemen2 = new javax.swing.JLabel();
        CEducCompleme2 = new javax.swing.JTextField();
        EducAlmas2 = new javax.swing.JLabel();
        CEducAlmas2 = new javax.swing.JTextField();
        AlimentoConAmor2 = new javax.swing.JLabel();
        CAlimenConAmor2 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        ImagenEst2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        siguiente2 = new javax.swing.JButton();
        jBAnterior2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setPreferredSize(new java.awt.Dimension(1070, 2000));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NomFunda2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        NomFunda2.setText("PERFIL ESTUDIANTE");
        jPanel7.add(NomFunda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 190, 20));

        NombreEst2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        NombreEst2.setText("Nombre:");
        jPanel7.add(NombreEst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));
        jPanel7.add(CNombreEst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 410, -1));

        ApelliEst3.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        ApelliEst3.setText("Apellidos:");
        jPanel7.add(ApelliEst3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));
        jPanel7.add(CApelliEst3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 410, -1));

        CodigoEst2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        CodigoEst2.setText("C??digo:");
        jPanel7.add(CodigoEst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));
        jPanel7.add(CCodiest2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 410, -1));

        DatGene2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        DatGene2.setText("Datos Generales");
        jPanel7.add(DatGene2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 160, 20));

        DocumenEst2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        DocumenEst2.setText("Documento:");
        jPanel7.add(DocumenEst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 80, -1));

        CdocumEst4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo" }));
        jPanel7.add(CdocumEst4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 140, -1));

        FechaNacEst2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        FechaNacEst2.setText("Fecha Nacimiento:");
        jPanel7.add(FechaNacEst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 120, -1));

        NumeroEst2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        NumeroEst2.setText("N??mero:");
        jPanel7.add(NumeroEst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, 30));
        jPanel7.add(CNumEst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 150, -1));

        Ciudad2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        Ciudad2.setText("Ciudad:");
        jPanel7.add(Ciudad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 480, -1, -1));
        jPanel7.add(CCiudad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 480, 150, -1));

        DatMed2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        DatMed2.setText("Datos M??dicos");
        jPanel7.add(DatMed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, 140, 20));

        Sisben2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        Sisben2.setText("Sisben:");
        jPanel7.add(Sisben2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));
        jPanel7.add(CSisben2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 130, -1));

        Eps2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        Eps2.setText("Eps:");
        jPanel7.add(Eps2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 630, -1, -1));
        jPanel7.add(CEps2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 140, -1));

        TipoSangre2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        TipoSangre2.setText("Tipo de Sangre:");
        jPanel7.add(TipoSangre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, 100, -1));

        Discapacidad2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        Discapacidad2.setText("Discapacidad :");
        jPanel7.add(Discapacidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 630, 100, 20));
        jPanel7.add(CTipoSangre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 630, 130, -1));

        CdocumEst5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo" }));
        jPanel7.add(CdocumEst5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 630, 140, -1));

        NonbreIncap2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        NonbreIncap2.setText("Nombre la incapacidad:");
        jPanel7.add(NonbreIncap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 200, -1));

        CNomInca2.setText("Describa cual o cuales");
        CNomInca2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(CNomInca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, 1030, 40));

        AlerMedic2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        AlerMedic2.setText("Alergico a alg??n medicamento:");
        jPanel7.add(AlerMedic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 750, 220, -1));

        CAlerMedi2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opci??n" }));
        jPanel7.add(CAlerMedi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 750, 230, -1));

        CAlergMed2.setText("Describa cual o cuales");
        CAlergMed2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(CAlergMed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 780, 1030, 40));

        CAlerAlim4.setText("Describa cual o cuales");
        CAlerAlim4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(CAlerAlim4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 880, 1030, 40));

        AlerAlim4.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        AlerAlim4.setText("Alergico a alg??n alimento:");
        jPanel7.add(AlerAlim4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 840, 220, -1));

        CAlergAlim4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opci??n" }));
        jPanel7.add(CAlergAlim4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 840, 230, -1));

        AlerAlim5.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        AlerAlim5.setText("Toma alg??n medicameno:");
        jPanel7.add(AlerAlim5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 930, 220, -1));

        CAlergAlim5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opci??n" }));
        jPanel7.add(CAlergAlim5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 930, 230, -1));

        CAlerAlim5.setText("Describa cual o cuales");
        CAlerAlim5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(CAlerAlim5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 960, 1030, 40));

        DatAcudi2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        DatAcudi2.setText("Datos Acudiente");
        jPanel7.add(DatAcudi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1040, 160, 20));

        NombresAcud2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        NombresAcud2.setText("Nombres:");
        jPanel7.add(NombresAcud2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1070, -1, -1));
        jPanel7.add(CNomAcud4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1070, 170, -1));

        Apellidos2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        Apellidos2.setText("Apellidos:");
        jPanel7.add(Apellidos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 1070, -1, -1));
        jPanel7.add(CNomAcud5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1070, 200, -1));

        Direcci??nAcud2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        Direcci??nAcud2.setText("Direcci??n:");
        jPanel7.add(Direcci??nAcud2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 1070, -1, -1));
        jPanel7.add(CDireccAcud2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 1070, 170, -1));

        BarrioAcud2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        BarrioAcud2.setText("Barrio:");
        jPanel7.add(BarrioAcud2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 1070, -1, 20));
        jPanel7.add(CBarrioAcud2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 1070, 190, -1));

        CalularAcud2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        CalularAcud2.setText("Celular:");
        jPanel7.add(CalularAcud2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1110, -1, -1));
        jPanel7.add(CCelularAcud2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1110, 170, -1));

        FijoAcud2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        FijoAcud2.setText("Fijo:");
        jPanel7.add(FijoAcud2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 1110, -1, -1));
        jPanel7.add(CFijoAcud2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1110, 200, -1));

        DatAcademicos2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        DatAcademicos2.setText("Datos Acad??micos");
        jPanel7.add(DatAcademicos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1170, 170, 20));

        Teatro2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        Teatro2.setText("Teatro:");
        jPanel7.add(Teatro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1180, -1, -1));

        CTeatro2.setText("Observaciones....");
        jPanel7.add(CTeatro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1200, 1010, 30));

        Danzas2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        Danzas2.setText("Danzas:");
        jPanel7.add(Danzas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1240, -1, -1));

        CDanzas2.setText("Observaciones....");
        jPanel7.add(CDanzas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1260, 1010, 30));

        Musica2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        Musica2.setText("M??sica :");
        jPanel7.add(Musica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1300, -1, -1));

        CMusica2.setText("Observaciones....");
        jPanel7.add(CMusica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1320, 1010, 30));

        EducComplemen2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        EducComplemen2.setText("Educaci??n Complementaria:");
        jPanel7.add(EducComplemen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1360, -1, -1));

        CEducCompleme2.setText("Observaciones....");
        jPanel7.add(CEducCompleme2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1380, 1010, 30));

        EducAlmas2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        EducAlmas2.setText("Educando Almas:");
        jPanel7.add(EducAlmas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1420, -1, -1));

        CEducAlmas2.setText("Observaciones....");
        jPanel7.add(CEducAlmas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1440, 1010, 30));

        AlimentoConAmor2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        AlimentoConAmor2.setText("Alimento con amor:");
        jPanel7.add(AlimentoConAmor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1480, -1, -1));

        CAlimenConAmor2.setText("Observaciones....");
        jPanel7.add(CAlimenConAmor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1500, 1010, 30));
        jPanel7.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, -1, -1));

        ImagenEst2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.add(ImagenEst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 170, 210));

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoFNH2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 140));

        jPanel9.setBackground(new java.awt.Color(204, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 660, 60));

        siguiente2.setBackground(new java.awt.Color(204, 204, 204));
        siguiente2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        siguiente2.setText("siguiente");
        siguiente2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        siguiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguiente2ActionPerformed(evt);
            }
        });
        jPanel7.add(siguiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 1600, 100, 30));

        jBAnterior2.setBackground(new java.awt.Color(204, 204, 204));
        jBAnterior2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jBAnterior2.setText("Anterior");
        jBAnterior2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBAnterior2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnterior2ActionPerformed(evt);
            }
        });
        jPanel7.add(jBAnterior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 1600, 100, 30));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 1040, -1));

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 1050, -1));

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1020, 1040, -1));

        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1150, 1060, -1));

        jScrollPane1.setViewportView(jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 2000, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        //Metodo para cambiar el formato de fecha
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = sdf.format(Date_fecha_naci.getDate());
        
        // Para setear (llenar) la informacion en el modelo Personas
        pestudiante.setPeestNombres((String) box_tipo_documento.getSelectedItem());
        persona.setPerNumerodeDocumento(Campo_num_documento.getText());
        persona.setPerLugardeExpedicion(Campo_lugar_expe1.getText());
        persona.setPerNombres(Campo_nombres1.getText());
        persona.setPerApellidos(Campo_apellidos1.getText());
        persona.setPerFotografia(Campo_foto.getText());
        persona.setPerFechadeNacimiento(date);
        persona.setPerEdad(Campo_edad.getText());
        persona.setPerCiudadNacimiento(Campo_ciudad_nacimiento.getText());
        persona.setPerDomicilio(Campo_domicilio.getText());
        persona.setPerBarrio(Campo_barrio.getText());
        persona.setPerLocalidad(Campo_localidad.getText());        
        persona.setPerEstrato(Campo_estrato1.getText());       
        persona.setPerEps(Campo_eps.getText());
        if(Radio_sisben_si.isSelected()) {
                persona.setPerSisben(true);
        };
        if(Radio_sisben_no.isSelected()) {
            persona.setPerSisben(false);
        }
        persona.setPerSisbenCategoria(Campo_categoria_sis1.getText());
        
        
        
        boolean respuesta = registro.registrar(persona);
        
        //Si se guardo con exito, entonces
        if(respuesta) {
            
           //QUe le muestre al usuario una ventana
           JOptionPane.showMessageDialog(rootPane, "Se guard?? con ??xito", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
           
           //Y aqui que limpie
           box_tipo_documento.setSelectedIndex(0);
           Campo_num_documento.setText("");
           Campo_lugar_expe1.setText("");
           Campo_nombres1.setText("");
           Campo_apellidos1.setText("");
           Campo_foto.setText("");
           Date_fecha_naci.setDateFormatString("01-01-2000"); //revisar
           Campo_edad.setText(""); 
           Campo_ciudad_nacimiento.setText("");
           Campo_domicilio.setText("");
           Campo_barrio.setText("");
           Campo_localidad.setText("");
           Campo_estrato1.setText("");
           Campo_eps.setText("");
           Campo_categoria_sis1.setText("");
   
        }
         
    }                               
    private void siguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente2ActionPerformed
        this.dispose();
        Notificaciones  abrir= new Notificaciones();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_siguiente2ActionPerformed

    private void jBAnterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnterior2ActionPerformed
        this.dispose();
        PerfilAdministrador  abrir= new PerfilAdministrador();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBAnterior2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlerAlim4;
    private javax.swing.JLabel AlerAlim5;
    private javax.swing.JLabel AlerMedic2;
    private javax.swing.JLabel AlimentoConAmor2;
    public javax.swing.JLabel ApelliEst3;
    private javax.swing.JLabel Apellidos2;
    private javax.swing.JLabel BarrioAcud2;
    private javax.swing.JLabel CAlerAlim4;
    private javax.swing.JLabel CAlerAlim5;
    private javax.swing.JComboBox<String> CAlerMedi2;
    private javax.swing.JComboBox<String> CAlergAlim4;
    private javax.swing.JComboBox<String> CAlergAlim5;
    private javax.swing.JLabel CAlergMed2;
    private javax.swing.JTextField CAlimenConAmor2;
    public javax.swing.JTextField CApelliEst3;
    private javax.swing.JTextField CBarrioAcud2;
    private javax.swing.JTextField CCelularAcud2;
    private javax.swing.JTextField CCiudad2;
    public javax.swing.JTextField CCodiest2;
    private javax.swing.JTextField CDanzas2;
    private javax.swing.JTextField CDireccAcud2;
    private javax.swing.JTextField CEducAlmas2;
    private javax.swing.JTextField CEducCompleme2;
    private javax.swing.JTextField CEps2;
    private javax.swing.JTextField CFijoAcud2;
    private javax.swing.JTextField CMusica2;
    private javax.swing.JTextField CNomAcud4;
    private javax.swing.JTextField CNomAcud5;
    private javax.swing.JLabel CNomInca2;
    public javax.swing.JTextField CNombreEst2;
    private javax.swing.JTextField CNumEst2;
    private javax.swing.JTextField CSisben2;
    private javax.swing.JTextField CTeatro2;
    private javax.swing.JTextField CTipoSangre2;
    private javax.swing.JLabel CalularAcud2;
    private javax.swing.JComboBox<String> CdocumEst4;
    private javax.swing.JComboBox<String> CdocumEst5;
    private javax.swing.JLabel Ciudad2;
    public javax.swing.JLabel CodigoEst2;
    private javax.swing.JLabel Danzas2;
    private javax.swing.JLabel DatAcademicos2;
    private javax.swing.JLabel DatAcudi2;
    private javax.swing.JLabel DatGene2;
    private javax.swing.JLabel DatMed2;
    private javax.swing.JLabel Direcci??nAcud2;
    private javax.swing.JLabel Discapacidad2;
    private javax.swing.JLabel DocumenEst2;
    private javax.swing.JLabel EducAlmas2;
    private javax.swing.JLabel EducComplemen2;
    private javax.swing.JLabel Eps2;
    private javax.swing.JLabel FechaNacEst2;
    private javax.swing.JLabel FijoAcud2;
    private javax.swing.JLabel ImagenEst2;
    private javax.swing.JLabel Musica2;
    public javax.swing.JLabel NomFunda2;
    public javax.swing.JLabel NombreEst2;
    private javax.swing.JLabel NombresAcud2;
    private javax.swing.JLabel NonbreIncap2;
    private javax.swing.JLabel NumeroEst2;
    private javax.swing.JLabel Sisben2;
    private javax.swing.JLabel Teatro2;
    private javax.swing.JLabel TipoSangre2;
    private javax.swing.JButton jBAnterior2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton siguiente2;
    // End of variables declaration//GEN-END:variables
}
