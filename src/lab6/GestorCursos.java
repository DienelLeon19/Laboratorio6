package lab6; 

    import java.util.ArrayList;
    import java.util.List;
    import javax.swing.DefaultListModel;
    import ClassAtributos.Curso;
    

    public class GestorCursos extends javax.swing.JFrame {
        
        DefaultListModel Cur  = new DefaultListModel();
        List<Curso> Datos = new ArrayList<>();
        //Para hacer la busqueda
        DefaultListModel NCur = new DefaultListModel();
        List<Curso> verlist = new ArrayList<>();
    
    public GestorCursos() 
    {initComponents();}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Datos = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_x = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Cursos = new javax.swing.JList<>();
        btn_Agregar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Profesor = new javax.swing.JButton();
        btn_Estudiante = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DatosActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 79, 182, 30));

        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Group 15.png"))); // NOI18N
        btn_Buscar.setBorder(null);
        btn_Buscar.setContentAreaFilled(false);
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 78, 116, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Gestor de Cursos.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 26, 227, -1));

        btn_x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/x.png"))); // NOI18N
        btn_x.setBorder(null);
        btn_x.setContentAreaFilled(false);
        btn_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xActionPerformed(evt);
            }
        });
        jPanel1.add(btn_x, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 78, -1, -1));

        jScrollPane1.setViewportView(lst_Cursos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 290, 158));

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Agregar.png"))); // NOI18N
        btn_Agregar.setBorder(null);
        btn_Agregar.setContentAreaFilled(false);
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Eliminar.png"))); // NOI18N
        btn_Eliminar.setBorder(null);
        btn_Eliminar.setContentAreaFilled(false);
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 375, -1, -1));

        btn_Profesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Profesores.png"))); // NOI18N
        btn_Profesor.setBorder(null);
        btn_Profesor.setContentAreaFilled(false);
        btn_Profesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProfesorActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 315, -1, -1));

        btn_Estudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Estudiantes.png"))); // NOI18N
        btn_Estudiante.setBorder(null);
        btn_Estudiante.setContentAreaFilled(false);
        btn_Estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EstudianteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 375, -1, -1));

        btn_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Editar.png"))); // NOI18N
        btn_Editar.setBorder(null);
        btn_Editar.setContentAreaFilled(false);
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DatosActionPerformed
     
    }//GEN-LAST:event_txt_DatosActionPerformed
   
    private void btn_ProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProfesorActionPerformed
        int index = lst_Cursos.getSelectedIndex();
        Curso NuevoCurso = Datos.get(index);
        MostrarJProfesor(NuevoCurso, index);
    }//GEN-LAST:event_btn_ProfesorActionPerformed
     private void MostrarJProfesor(Curso NuevoCurso,int index)
    {
        JProfesor Jprof = new JProfesor(this,NuevoCurso,index);
        Jprof.setLocationRelativeTo(null);
        Jprof.setVisible(true);
        Jprof.Nombrar(NuevoCurso);
        Jprof.Esconder();
        this.setVisible(false);
    }
    
    private void MostrarJEstudiante(Curso NuevoCurso,int index)
    {
        JEstudiante Jestu = new JEstudiante(this,NuevoCurso,index);
        Jestu.setLocationRelativeTo(null);        
        Jestu.setVisible(true);
        Jestu.Nombrar(NuevoCurso);
        Jestu.Esconder();
        this.setVisible(false);
    }
    
    
    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        MostrarNewCurso();
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int index = lst_Cursos.getSelectedIndex();
        Datos.remove(index);
        Cur.removeElementAt(index);
        
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed

        //eliminamos} los espacios en blanco con trim
         String name =  txt_Datos.getText().trim();
        
        if (name.isEmpty()) 
        {
            lst_Cursos.setModel(Cur);
            btn_x.setVisible(false);
        }else{
            verlist.clear();
            NCur.clear();
            for (Curso NuevoCurso : Datos) {
                Curso Nodo = new Curso();
                Nodo.setNombre(NuevoCurso.getNombre());
                Nodo.setCreditos(NuevoCurso.getCreditos());
                Nodo.setCodigo(NuevoCurso.getCodigo());
                
                if (Nodo.getNombre().equals(name)) 
                {
                    verlist.add(Nodo);
                    NCur.addElement(NuevoCurso.Texto()); 
                }
                lst_Cursos.setModel(NCur);
                btn_x.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xActionPerformed
        
        txt_Datos.setText(""); 
        btn_BuscarActionPerformed(evt);
    }//GEN-LAST:event_btn_xActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        
        int index = lst_Cursos.getSelectedIndex();
        Curso NuevoCurso = Datos.get(index);
        MostrarNewCurso(index,NuevoCurso); 
        
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_EstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EstudianteActionPerformed
        int index = lst_Cursos.getSelectedIndex();
        Curso NuevoCurso = Datos.get(index);
        MostrarJEstudiante(NuevoCurso, index);      
    }//GEN-LAST:event_btn_EstudianteActionPerformed
    
    private void MostrarNewCurso(int index,Curso NuevoCurso)
    {
        NewCurso AgreCursos = new NewCurso(this, NuevoCurso,index);               
        AgreCursos.setLocationRelativeTo(null);
        AgreCursos.setVisible(true);
        AgreCursos.apagarventana();
        this.setVisible(false);
      
        
    }
    
    
    public void rempla(int indice,Curso NuevoCurso)
    {
        if (indice >= 0 && indice < Datos.size()) {
        Curso nodo = Datos.get(indice);

        nodo.setNombre(NuevoCurso.getNombre());
        nodo.setCreditos(NuevoCurso.getCreditos());
        nodo.setCodigo(NuevoCurso.getCodigo());

        // Actualizar el modelo de la lista
        Cur.setElementAt(NuevoCurso.Texto(), indice);
        lst_Cursos.setModel(Cur);
        
  
        }
    }

    public void agregar(Curso NuevoCurso)
    {
        Datos.add(NuevoCurso);
        Cur.addElement(NuevoCurso.Texto());
        lst_Cursos.setModel(Cur);
    } 
    private void MostrarNewCurso()
    {
        NewCurso AgreCurso = new NewCurso(this);
        AgreCurso.setLocationRelativeTo(null);
        AgreCurso.setVisible(true);
        AgreCurso.apagarventana2();
        this.setVisible(false);
    }
    
    public void esconder()
    {
        btn_x.setVisible(false);
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
            java.util.logging.Logger.getLogger(GestorCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorCursos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Estudiante;
    private javax.swing.JButton btn_Profesor;
    private javax.swing.JButton btn_x;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst_Cursos;
    private javax.swing.JTextField txt_Datos;
    // End of variables declaration//GEN-END:variables
}
