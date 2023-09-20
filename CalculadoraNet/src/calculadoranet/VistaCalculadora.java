package calculadoranet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * Clase VistaCalculadora que genera la interfaz gráfica de una calculadora utilizando las clases Metodos y InAPos.
 * @author Andrés Álvarez, Nicolás Álvarez, Luis Arguelles, Andrés Sámano.
 */
public class VistaCalculadora extends javax.swing.JFrame {

    //atributos de la calculadora propia
    private String cadena="";
    private double resp;
    
    /**
     * Construye una nueva forma de la VistaCalculadora.
     */
    public VistaCalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btUno = new javax.swing.JButton();
        btCuatro = new javax.swing.JButton();
        btCero = new javax.swing.JButton();
        btDos = new javax.swing.JButton();
        btCinco = new javax.swing.JButton();
        btOcho = new javax.swing.JButton();
        btSiete = new javax.swing.JButton();
        btSeis = new javax.swing.JButton();
        btNueve = new javax.swing.JButton();
        btTres = new javax.swing.JButton();
        btPunto = new javax.swing.JButton();
        btIgual = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        btPotencia = new javax.swing.JButton();
        btDivision = new javax.swing.JButton();
        btMultiplicacion = new javax.swing.JButton();
        btResta = new javax.swing.JButton();
        btSuma = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btParIzquierdo = new javax.swing.JButton();
        btParDerecho = new javax.swing.JButton();
        btCambioSigno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(100, 100, 100, 100));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 0));

        btUno.setBackground(new java.awt.Color(153, 153, 153));
        btUno.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btUno.setText("1");
        btUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUnoActionPerformed(evt);
            }
        });

        btCuatro.setBackground(new java.awt.Color(153, 153, 153));
        btCuatro.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btCuatro.setText("4");
        btCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCuatroActionPerformed(evt);
            }
        });

        btCero.setBackground(new java.awt.Color(153, 153, 153));
        btCero.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btCero.setText("0");
        btCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCeroActionPerformed(evt);
            }
        });

        btDos.setBackground(new java.awt.Color(153, 153, 153));
        btDos.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btDos.setText("2");
        btDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDosActionPerformed(evt);
            }
        });

        btCinco.setBackground(new java.awt.Color(153, 153, 153));
        btCinco.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btCinco.setText("5");
        btCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCincoActionPerformed(evt);
            }
        });

        btOcho.setBackground(new java.awt.Color(153, 153, 153));
        btOcho.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btOcho.setText("8");
        btOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOchoActionPerformed(evt);
            }
        });

        btSiete.setBackground(new java.awt.Color(153, 153, 153));
        btSiete.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btSiete.setText("7");
        btSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSieteActionPerformed(evt);
            }
        });

        btSeis.setBackground(new java.awt.Color(153, 153, 153));
        btSeis.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btSeis.setText("6");
        btSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeisActionPerformed(evt);
            }
        });

        btNueve.setBackground(new java.awt.Color(153, 153, 153));
        btNueve.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btNueve.setText("9");
        btNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNueveActionPerformed(evt);
            }
        });

        btTres.setBackground(new java.awt.Color(153, 153, 153));
        btTres.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btTres.setText("3");
        btTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTresActionPerformed(evt);
            }
        });

        btPunto.setBackground(new java.awt.Color(153, 153, 153));
        btPunto.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btPunto.setText(".");
        btPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPuntoActionPerformed(evt);
            }
        });

        btIgual.setBackground(new java.awt.Color(153, 51, 255));
        btIgual.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btIgual.setText("=");
        btIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIgualActionPerformed(evt);
            }
        });

        btLimpiar.setBackground(new java.awt.Color(51, 102, 255));
        btLimpiar.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        btPotencia.setBackground(new java.awt.Color(153, 51, 255));
        btPotencia.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btPotencia.setText("^");
        btPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPotenciaActionPerformed(evt);
            }
        });

        btDivision.setBackground(new java.awt.Color(153, 51, 255));
        btDivision.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btDivision.setText("/");
        btDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDivisionActionPerformed(evt);
            }
        });

        btMultiplicacion.setBackground(new java.awt.Color(153, 51, 255));
        btMultiplicacion.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btMultiplicacion.setText("x");
        btMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicacionActionPerformed(evt);
            }
        });

        btResta.setBackground(new java.awt.Color(153, 51, 255));
        btResta.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btResta.setText("-");
        btResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRestaActionPerformed(evt);
            }
        });

        btSuma.setBackground(new java.awt.Color(153, 51, 255));
        btSuma.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btSuma.setText("+");
        btSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSumaActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Helvetica Neue", 0, 28)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btParIzquierdo.setBackground(new java.awt.Color(51, 102, 255));
        btParIzquierdo.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btParIzquierdo.setText("(");
        btParIzquierdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btParIzquierdoActionPerformed(evt);
            }
        });

        btParDerecho.setBackground(new java.awt.Color(51, 102, 255));
        btParDerecho.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btParDerecho.setText(")");
        btParDerecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btParDerechoActionPerformed(evt);
            }
        });

        btCambioSigno.setBackground(new java.awt.Color(153, 51, 255));
        btCambioSigno.setFont(new java.awt.Font("Helvetica Neue", 0, 40)); // NOI18N
        btCambioSigno.setText("±");
        btCambioSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCambioSignoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btUno, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btDos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btTres, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btResta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCero, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(btDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btCambioSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btParIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btParDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btParIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(btParDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btDivision, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(btCambioSigno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btSiete, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(btOcho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btNueve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btCuatro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addComponent(btCinco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSeis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btResta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btTres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btDos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addComponent(btUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCero, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCeroActionPerformed
        cadena = cadena + "0"; //añade un 0 a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btCeroActionPerformed

    private void btPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPuntoActionPerformed
        cadena= cadena + "."; //añade un . a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btPuntoActionPerformed

    private void btUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUnoActionPerformed
        cadena = cadena + "1"; //añade un 1 a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btUnoActionPerformed

    private void btDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDosActionPerformed
        cadena = cadena + "2"; //añade un 2 a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btDosActionPerformed

    private void btTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTresActionPerformed
        cadena = cadena + "3"; //añade un 3 a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btTresActionPerformed

    private void btCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCuatroActionPerformed
        cadena = cadena + "4"; //añade un 4 a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btCuatroActionPerformed

    private void btCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCincoActionPerformed
        cadena = cadena + "5"; //añade un 5 a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btCincoActionPerformed

    private void btSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeisActionPerformed
        cadena = cadena + "6"; //añade un 6 a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btSeisActionPerformed

    private void btSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSieteActionPerformed
        cadena = cadena + "7"; //añade un 7 a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btSieteActionPerformed

    private void btOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOchoActionPerformed
        cadena = cadena + "8"; //añade un 8 a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btOchoActionPerformed

    private void btNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNueveActionPerformed
        cadena = cadena + "9"; //añade un 9 a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btNueveActionPerformed

    private void btSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSumaActionPerformed
        cadena = cadena + "+"; //añade un + a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btSumaActionPerformed

    private void btRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRestaActionPerformed
        cadena = cadena + "-"; //añade un - a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btRestaActionPerformed

    private void btMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicacionActionPerformed
        cadena = cadena + "x"; //añade un x a la cadena
        jTextArea1.setText(cadena);
    }//GEN-LAST:event_btMultiplicacionActionPerformed

    private void btDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDivisionActionPerformed
        cadena = cadena + "/"; //añade un / a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btDivisionActionPerformed

    private void btPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPotenciaActionPerformed
        cadena = cadena + "^"; //añade un  a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btPotenciaActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        cadena = "";
        jTextArea1.setText(cadena); //imprime la cadena limpia en el JTextArea
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btParIzquierdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btParIzquierdoActionPerformed
        cadena = cadena + "("; //añade un ( a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btParIzquierdoActionPerformed

    private void btParDerechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btParDerechoActionPerformed
        cadena = cadena + ")"; //añade un ) a la cadena
        jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btParDerechoActionPerformed

    /**
     * Método que recibe una cadena y cambia el signo del último número insertado en la cadena.
     * @see Metodos.jeraquia.
     * @param cadena una cadena que es una expresión matemática en notación infija.
     * @return String con la conversión de la cadena a notación postfija.
     */
    public String cambiaSigno(String cadena) {
       if(cadena.equals("")) {
           jTextArea1.setText("INGRESA UNA OPERACIÓN");
           ExcepcionColeccionVacia error = new ExcepcionColeccionVacia("ERROR no hay ninguna entrada ");
           throw error;
       }
       int i=cadena.length()-1, j=0, n;
       String aux1="", aux2="", auxCadena="", auxCadena2="";
       int contador=0;
       boolean bandera = false;
       while(i>=0 && !bandera) {
           if(Metodos.jerarquia(cadena.charAt(i))>=3) {
               bandera=true;
               i++;
           }
           i--;
       }
       
       for(j=0; j<=i; j++) {
           aux1 = aux1 + cadena.charAt(j);
       }
       for(j=i+1; j<cadena.length(); j++) {
           aux2 = aux2 + cadena.charAt(j);
       }
       
       if(Metodos.jerarquia(cadena.charAt(j-1))!=1) {
       aux1=aux1 + "(" + "-";
       aux2=aux2 + ")";
       cadena=aux1 + aux2;
       } else {
           j--;
           i=0;
           while(cadena.charAt(i)!='(' || cadena.charAt(i+1)!='-') {
               auxCadena=auxCadena + cadena.charAt(i);
               i++;
           }
           while(cadena.charAt(j)!= '(' ) {
               contador++;
               j--;
           } 
           contador--;
           n=j+contador;
           for(i=j+2; i<=n; i++) {
               auxCadena2=auxCadena2+cadena.charAt(i);
           }
           auxCadena=auxCadena+auxCadena2;
           cadena = auxCadena;
        }
       return cadena;
    }
    
    //cambia el signo de la cadena con la ayuda del método auxiliar cambiaSigno
    private void btCambioSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCambioSignoActionPerformed
       cadena=cambiaSigno(cadena);
       jTextArea1.setText(cadena); //imprime la cadena en el JTextArea
    }//GEN-LAST:event_btCambioSignoActionPerformed
    
    /**
     * <pre>
     * Método que recibe de la JTextArea una cadena en notación infija.
     * Convierte la cadena en notación infija a postfija con el método Inapos de la clase InAPos.
     * Calcula la expresión en notacióin postfija con el método calcula de la clase InAPos.
     * Si es válida la expresión, imprime la cadena en la JTextArea, si no, imprimer "ERROR".
     * </pre>
     * @see Metodos.revisorCadena y InAPos.calcula, InAPos.Inapos
     * @param cadena1 una cadena que es una expresión matemática.
     * @return double, la respuesta de la operación en notación postfija.
     */
    public double respuesta(String cadena1) {
        if(cadena.equals("")) {
           jTextArea1.setText("INGRESA UNA OPERACIÓN");
           ExcepcionColeccionVacia error = new ExcepcionColeccionVacia("ERROR no hay ninguna entrada ");
           throw error;
       }
        if(Metodos.revisorCadena(cadena1)) {
            try {
            resp = InAPos.calcula(InAPos.InaPos(cadena1)); //intenta calcular haciendo la conversion de infijo a postfijo y luego calculando postfijo  
            } catch (ExcepcionColeccionVacia error){
                cadena="";
                jTextArea1.setText("ERROR");
                error = new ExcepcionColeccionVacia("ERROR");
                throw error;
            }
        } else {
            cadena="";
            jTextArea1.setText("ERROR");
            ExcepcionColeccionVacia error = new ExcepcionColeccionVacia("ERROR");
            throw error;
        }
        return resp;
    }
    
    private void btIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIgualActionPerformed
        resp =respuesta(cadena); //calcula el resultado con la ayuda del método auxiliar respuesta
        if(resp>=0) {
            cadena=String.valueOf(resp);
        } else {
            cadena="(" + String.valueOf(resp) + ")";
        }
        jTextArea1.setText(cadena); //imprime el resultado en la jTextArea1
    }//GEN-LAST:event_btIgualActionPerformed

    /**
     * Main que ejecuta y corre la vista de la calculadora
     * @param args la línea de comando de los argumentos.
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
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCalculadora().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCambioSigno;
    private javax.swing.JButton btCero;
    private javax.swing.JButton btCinco;
    private javax.swing.JButton btCuatro;
    private javax.swing.JButton btDivision;
    private javax.swing.JButton btDos;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btMultiplicacion;
    private javax.swing.JButton btNueve;
    private javax.swing.JButton btOcho;
    private javax.swing.JButton btParDerecho;
    private javax.swing.JButton btParIzquierdo;
    private javax.swing.JButton btPotencia;
    private javax.swing.JButton btPunto;
    private javax.swing.JButton btResta;
    private javax.swing.JButton btSeis;
    private javax.swing.JButton btSiete;
    private javax.swing.JButton btSuma;
    private javax.swing.JButton btTres;
    private javax.swing.JButton btUno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
