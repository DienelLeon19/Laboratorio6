package lab6;

import ClassAtributos.Curso;
import ClassAtributos.Profesores;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

public class JProfesor extends javax.swing.JFrame {
    
    private GestorCursos padre;
    private Curso NuevoCurs;    
    private int index;
    
    DefaultListModel Profe  = new DefaultListModel();
    List<Profesores> DProf = new ArrayList<>();
    
    
    public JProfesor()
    {   initComponents();   }
    
    public JProfesor(GestorCursos padre) 
    {   
        initComponents();
        this.padre = padre;
    }
     public JProfesor(GestorCursos padre,Curso NuevoCurs, int index) 
    {
        initComponents();
        this.padre = padre;
        this.NuevoCurs = NuevoCurs;
        this.index = index;
        TraerProfesores();
    }
     
     
    public void Nombrar(Curso Ncurso)
    {
        CursoName.setText(Ncurso.getNombre());
        
    }
    
    public void Esconder()
    {
        btn_x.setVisible(false);
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CursoName = new javax.swing.JLabel();
        btn_Buscar = new javax.swing.JButton();
        txt_Datos = new javax.swing.JTextField();
        btn_x = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Profesores = new javax.swing.JList<>();
        btn_Agregar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/profesor de _.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, 40));

        CursoName.setText("curso");
        jPanel1.add(CursoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Group 15.png"))); // NOI18N
        btn_Buscar.setBorder(null);
        btn_Buscar.setContentAreaFilled(false);
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 116, -1));

        txt_Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DatosActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 182, 30));

        btn_x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/x.png"))); // NOI18N
        btn_x.setBorder(null);
        btn_x.setContentAreaFilled(false);
        btn_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xActionPerformed(evt);
            }
        });
        jPanel1.add(btn_x, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jScrollPane1.setViewportView(lst_Profesores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 290, 158));

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Agregar.png"))); // NOI18N
        btn_Agregar.setBorder(null);
        btn_Agregar.setContentAreaFilled(false);
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 315, -1, -1));

        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Eliminar.png"))); // NOI18N
        btn_Eliminar.setBorder(null);
        btn_Eliminar.setContentAreaFilled(false);
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/salir.png"))); // NOI18N
        btn_Salir.setBorder(null);
        btn_Salir.setContentAreaFilled(false);
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        btn_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Editar.png"))); // NOI18N
        btn_Editar.setBorder(null);
        btn_Editar.setContentAreaFilled(false);
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        String name =  txt_Datos.getText().trim();
        if (name.isEmpty())
        {   TraerProfesores();
            btn_x.setVisible(false);
        }else{
            Profe.clear();
            for (Profesores profesor : NuevoCurs.getProfesores()) 
            {   if (profesor != null)
                {
                    if (profesor.getNombre().equals(name))
                    {   String fullName = "Nombre: " + profesor.getNombre();
                        Profe.addElement(fullName);}
                }
            }
            lst_Profesores.setModel(Profe);
            btn_x.setVisible(true);
        }      
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void txt_DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DatosActionPerformed
    
    }//GEN-LAST:event_txt_DatosActionPerformed

    private void btn_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xActionPerformed

        txt_Datos.setText("");  // Limpiar el contenido del JTextField
        btn_BuscarActionPerformed(evt);
    }//GEN-LAST:event_btn_xActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        MostrarNewProfe();
    }//GEN-LAST:event_btn_AgregarActionPerformed
    
    private void MostrarNewProfe()
    {
        NewProfesor AgreProfe = new NewProfesor(this,NuevoCurs);
        AgreProfe.setLocationRelativeTo(null);
        AgreProfe.setVisible(true);
        AgreProfe.apagarventana2();
        this.setVisible(false);
    }
    
  
    
    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int inde = lst_Profesores.getSelectedIndex();
            if (inde != -1) 
            {      
            NuevoCurs.eliminarProfesor(inde);
            Profe.removeElementAt(inde);
            }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        this.padre.setVisible(true);
        this.dispose();          
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        int inde = lst_Profesores.getSelectedIndex();
        Profesores[] profesores = NuevoCurs.getProfesores();
        Profesores profesor  = profesores[inde] ;
        MostrarN(NuevoCurs,profesor ,  inde);
        
    }//GEN-LAST:event_btn_EditarActionPerformed

      
    public void agregar(Profesores NuevoProfe){
        DProf.add(NuevoProfe);
        Profe.addElement(NuevoProfe.Texto());     
        lst_Profesores.setModel(Profe);       
    } 
    
    public void agregarprofe(Profesores NuevoProfe){
        NuevoCurs.agregarProfesor(NuevoProfe);
    } 
 
    public void TraerProfesores(){
        Profe.clear(); 
        Profesores[] profesores = NuevoCurs.getProfesores();

        for (Profesores profesor : profesores) {
            if (profesor != null) {
                Profe.addElement(profesor.Texto());
            }
        }
        lst_Profesores.setModel(Profe);
    }  
    
    private void MostrarN(Curso NuevoCurs,Profesores NProfe, int index) {
        NewProfesor editProfesor = new NewProfesor(this,
                NProfe, index, NuevoCurs);
        
        editProfesor.setLocationRelativeTo(null);
        editProfesor.setVisible(true);
        editProfesor.apagarventana();
        this.setVisible(false);
    }

    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(JProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CursoName;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_x;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst_Profesores;
    private javax.swing.JTextField txt_Datos;
    // End of variables declaration//GEN-END:variables
}
