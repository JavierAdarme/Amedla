/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;



import ame.aforo;
import ame.potrero;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Camilo
 */
public class ControlAforos extends javax.swing.JFrame {

    ArrayList<aforo> aforos = new ArrayList<aforo>();
    ArrayList<potrero> potreros = new ArrayList<potrero>();
    aforo afo = new aforo();
    potrero potre = new potrero();
    String tipoAforo, nombrePotrero, consultar;
    int no, aceptar, index, numeroMuestras, diasLibre, diasUso;
    boolean vacio;
    double tamanoPotrero, hojaAncha, hojaAngosta, otro, descubierto, bajo, medio, alto;

    public ControlAforos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void llenaAfo() {
        aforos = afo.getAforos();
    }

    public void llenaPotre() {
        potreros = potre.getPot();
    }

    public void deterPotrero(String nombrePotrero) {
        vacio = potreros.isEmpty();
        if (vacio == true) {
            JOptionPane.showMessageDialog(null, "No existe el registro de ningún potrero. Por favor, cree uno primero");
            aceptar = 0;

        } else {
            index = potreros.size();
            for (int i = 0; i <= index; i++) {
                if (nombrePotrero.equals(potreros.get(i).getNombrepo())) {
                    JOptionPane.showMessageDialog(null, "He encontrado al potrero");

                    aceptar = 1;
                    index = i;
                    break;
                } else if (index - 1 == i) {
                    JOptionPane.showMessageDialog(null, "El potrero '" + nombrePotrero + "' no existe. Verifique el nombre nuevamente");
                    aceptar = 2;
                    break;
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel1FlechaAtras = new javax.swing.JLabel();
        Desea = new javax.swing.JLabel();
        RegisAfo = new javax.swing.JButton();
        ConsulAfo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1Titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1Titulo.setText("CONTROL DE AFOROS");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aff.png"))); // NOI18N

        jLabel1FlechaAtras.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1FlechaAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Picture4.png"))); // NOI18N
        jLabel1FlechaAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1FlechaAtrasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1FlechaAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1Titulo)
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jLabel1FlechaAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 360, 530));

        Desea.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Desea.setForeground(new java.awt.Color(255, 255, 255));
        Desea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Desea.setText("¿Qué desea hacer?");
        getContentPane().add(Desea, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 460, -1));

        RegisAfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RegisAfo.setText("Registrar Aforo");
        RegisAfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisAfoActionPerformed(evt);
            }
        });
        getContentPane().add(RegisAfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 180, 50));

        ConsulAfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ConsulAfo.setText("Consultar Aforo");
        ConsulAfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsulAfoActionPerformed(evt);
            }
        });
        getContentPane().add(ConsulAfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 180, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 460, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1FlechaAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1FlechaAtrasMouseClicked
        menuJefe mF = new menuJefe();
        mF.show();
        dispose();
    }//GEN-LAST:event_jLabel1FlechaAtrasMouseClicked

    private void RegisAfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisAfoActionPerformed
        llenaAfo();
        llenaPotre();
        tipoAforo = JOptionPane.showInputDialog("¿Es un aforo de entrada o de salida?");
        aceptar = 0;
        nombrePotrero = JOptionPane.showInputDialog("Ingrese el nombre del potrero en que hará el aforo");
        do {
            JOptionPane.showMessageDialog(null, "Buscaré si el potrero existe");
            deterPotrero(nombrePotrero);

        } while (aceptar == 0);

        tamanoPotrero = potreros.get(index).getTamano();
        numeroMuestras = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas muestras por nivel de crecimiento tomará?"));
        diasLibre = Integer.parseInt(JOptionPane.showInputDialog("¿Durante cuantos dias ha estado libre el potrero?"));
        diasUso = Integer.parseInt(JOptionPane.showInputDialog("¿Durante cuantos dias espera que los animales se alimenten del potrero?"));

        vacio = potreros.isEmpty();
        if (vacio == false) {
            aforos.add(new aforo(tipoAforo, nombrePotrero, tamanoPotrero, numeroMuestras, diasUso, diasLibre));
            System.out.println("El registro de aforo fue añadido");
        } else {
            System.out.println("No es posible registrar un aforo sobre un potrero que no existe");
            return;
        }

        JOptionPane.showMessageDialog(null, "Empezaremos por calcular las hectáreas libres en el potrero");
        JOptionPane.showMessageDialog(null, "Por favor, digite la siguiente información según su evaluación");
        hojaAncha = Double.parseDouble(JOptionPane.showInputDialog("Porcentaje de maleza hoja ancha"));
        hojaAngosta = Double.parseDouble(JOptionPane.showInputDialog("Porcentaje de maleza hoja angosta"));
        otro = Double.parseDouble(JOptionPane.showInputDialog("Porcentaje de otro tipo de malezas"));
        descubierto = Double.parseDouble(JOptionPane.showInputDialog("Porcentaje de otro suelo descubierto"));

        aforos.get(index).calculoHectaLibres(hojaAncha, hojaAngosta, otro, descubierto);
        JOptionPane.showMessageDialog(null, "El potrero cuenta con: " + aforos.get(index).getHaLibres() + " Ha libres");

        JOptionPane.showMessageDialog(null, "Ahora ingresará los pesos de cada muestra en gr");
        JOptionPane.showMessageDialog(null, "Por favor, digite los pesos encontrados para el pasto de nivel bajo");
        aforos.get(index).setDatosBajo();
        JOptionPane.showMessageDialog(null, "Por favor, digite los pesos encontrados para el pasto de nivel medio");
        aforos.get(index).setDatosMedio();
        JOptionPane.showMessageDialog(null, "Por favor, digite los pesos encontrados para el pasto de nivel alto");
        aforos.get(index).setDatosAlto();
        aforos.get(index).calcularPromedioBajo();
        aforos.get(index).calcularPromedioMedio();
        aforos.get(index).calcularPromedioAlto();
        JOptionPane.showMessageDialog(null, "Ahora, tendrá que indicar la representación, en porcentaje, por nivel de crecimiento de cada nivel de pasto");
        JOptionPane.showMessageDialog(null, "Por favor, digite la representación para el pasto de nivel bajo");
        bajo = Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite la representación para el pasto de nivel bajo"));
        medio = Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite la representación para el pasto de nivel medio"));
        alto = Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite la representación para el pasto de nivel alto"));
        aforos.get(index).setRepresentaciones(bajo, medio, alto);
        aforos.get(index).haNiveles();

        JOptionPane.showMessageDialog(null, "Eso significa que el potrero posee:");
        JOptionPane.showMessageDialog(null, aforos.get(index).getHaCreciBajo() + " Hectáreas de pasto bajo");
        JOptionPane.showMessageDialog(null, aforos.get(index).getHaCreciMedio() + " Hectáreas de pasto medio");
        JOptionPane.showMessageDialog(null, aforos.get(index).getHaCreciAlto() + " Hectáreas de pasto alto");

        aforos.get(index).promPondeBajo();
        aforos.get(index).promPondeMedio();
        aforos.get(index).promPondeAlto();
        aforos.get(index).promPondeAforo();
        aforos.get(index).calcularKgForraje();
        aforos.get(index).calcularProduTotal();
        aforos.get(index).calcularProduDiaria();
        aforos.get(index).calcularDispoTotal();
        aforos.get(index).calcularUgg();
        aforos.get(index).calcularUgm();

        JOptionPane.showMessageDialog(null, "Durante los " + diasUso + " "
                + "días que piensa usar el potrero, podrá alimentar a un total "
                + "de: " + (int) aforos.get(index).getUgg() + " animales de 450 "
                + "kg o " + (int) aforos.get(index).getUgm() + " animales de 500 kg");

    }//GEN-LAST:event_RegisAfoActionPerformed

    private void ConsulAfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsulAfoActionPerformed
        consultar = JOptionPane.showInputDialog("¿De qué potrero desea consultar el aforo más reciente?");
        for (aforo r : aforos) {
            no = no + 1;

            if (r.getNombrePotrero().equals(consultar)) {
                JOptionPane.showMessageDialog(null, "Durante los " + diasUso + " "
                        + "días que piensa usar el potrero, podrá alimentar a un total "
                        + "de: " + (int) aforos.get(index).getUgg() + " animales de 450 "
                        + "kg o " + (int) aforos.get(index).getUgm() + " animales de 500 kg");
                no = 0;
                break;
            }

        }
        if (no == aforos.size()) {
            JOptionPane.showMessageDialog(null, "Ese potrero no presenta aforo alguno");
        }
    }//GEN-LAST:event_ConsulAfoActionPerformed

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
            java.util.logging.Logger.getLogger(ControlAforos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlAforos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlAforos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlAforos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlAforos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsulAfo;
    private javax.swing.JLabel Desea;
    private javax.swing.JButton RegisAfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1FlechaAtras;
    private javax.swing.JLabel jLabel1Titulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
