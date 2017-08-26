/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.ui;

import com.lowagie.text.Document;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.DefaultFontMapper;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfTemplate;
import com.lowagie.text.pdf.PdfWriter;
import com.tienda.dao.GenericDAO;
import com.tienda.entities.Productos;
import com.tienda.entities.Ventas;
import com.tienda.util.PDFUtil;
import com.tienda.util.Util;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author MBN USER
 */
public class ReporteProductosMasVendidos extends javax.swing.JInternalFrame {

    private GenericDAO dao;
    JFreeChart chart;

    public ReporteProductosMasVendidos(GenericDAO dao) {
        initComponents();

        //Se recibe el dao desde el jframe inicio
        this.dao = dao;
        btnPDF.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        panelParametros = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateFechaFin = new org.jdesktop.swingx.JXDatePicker();
        dateFechaInicio = new org.jdesktop.swingx.JXDatePicker();
        btnGenerarGrafico = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        panelGrafico = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Estadísticas de venta por producto");

        panelParametros.setBorder(javax.swing.BorderFactory.createTitledBorder("Parámetros de generación"));

        jLabel1.setText("Fecha inicio:");

        jLabel2.setText("Fecha fin:");

        btnGenerarGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tienda/iconos/graph.png"))); // NOI18N
        btnGenerarGrafico.setText("Generar gráfico");
        btnGenerarGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarGraficoActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tienda/iconos/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tienda/iconos/pdf .png"))); // NOI18N
        btnPDF.setText("Generar PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelParametrosLayout = new javax.swing.GroupLayout(panelParametros);
        panelParametros.setLayout(panelParametrosLayout);
        panelParametrosLayout.setHorizontalGroup(
            panelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParametrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerarGrafico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
        );
        panelParametrosLayout.setVerticalGroup(
            panelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParametrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(dateFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGenerarGrafico)
                    .addComponent(btnPDF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelGrafico.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelParametros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelParametros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarGraficoActionPerformed
        if (dateFechaInicio.getDate() == null || dateFechaFin.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ingrese la fecha de inicio y fin de reporte", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        btnPDF.setEnabled(true);

        panelGrafico.removeAll();
        panelGrafico.revalidate();
        panelGrafico.repaint();

        this.setSize(850, 550);

        //Se crea una nueva lista con productos del inventario
        List<Productos> productosEnInventario = dao.buscarTodosProductos();
        List<Ventas> resumenVentas = new ArrayList<>();
        for (Productos p : productosEnInventario) {
            Ventas venta = new Ventas();
            venta.setProductos(p);
            resumenVentas.add(venta);
        }

        //Se obtiene la lista de ventas realizadas
        List<Ventas> ventasRealizadas = dao.buscarVentasEntreFechas(Util.formatearFecha(dateFechaInicio.getDate()), Util.formatearFecha(dateFechaFin.getDate()));
        for (Ventas venta : ventasRealizadas) {
            for (Ventas resVenta : resumenVentas) {
                if (resVenta.getProductos().getProductoId().equals(venta.getProductos().getProductoId())) {
                    resVenta.setMonto(resVenta.getMonto() + venta.getMonto());
                }
            }
        }

        // Fuente de Datos
        DefaultPieDataset data = new DefaultPieDataset();
        for (Ventas v : resumenVentas) {
            data.setValue(v.getProductos().getNombre() + " - $" + v.getMonto(), v.getMonto());
        }

        // Creando el Grafico
        chart = ChartFactory.createPieChart(
                "Productos vendidos",
                data,
                true,
                true,
                false);

        // Crear el Panel del Grafico con ChartPanel
        ChartPanel chartPanel = new ChartPanel(chart);
        panelGrafico.add(chartPanel);
        panelGrafico.revalidate();
        panelGrafico.repaint();
    }//GEN-LAST:event_btnGenerarGraficoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar destino");
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            PDFUtil.crearGraficaPDF(fileToSave.getAbsolutePath() + ".pdf", chart);
        }

    }//GEN-LAST:event_btnPDFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerarGrafico;
    private javax.swing.JButton btnPDF;
    private org.jdesktop.swingx.JXDatePicker dateFechaFin;
    private org.jdesktop.swingx.JXDatePicker dateFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private javax.swing.JPanel panelGrafico;
    private javax.swing.JPanel panelParametros;
    // End of variables declaration//GEN-END:variables
}
