package nezet;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class GuiNezet extends javax.swing.JFrame {

    public GuiNezet() {
        initComponents();
    }

    public void megjelenit(String uzenet) {
        txaLeiras.setText(uzenet);
    }

    public void visszajelzes(String uzenet) {
        JOptionPane.showMessageDialog(rootPane, uzenet);
    }

    public int bekeres() {
        int valasztas = -1;

        if (rdbArany.isSelected()) {
            valasztas = 0;
        }

        if (rdbEzust.isSelected()) {
            valasztas = 1;
        }

        if (rdbBronz.isSelected()) {
            valasztas = 2;
        }

        return valasztas;
    }

    public JButton getBtnValaszt() {
        return btnValaszt;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaLeiras = new javax.swing.JTextArea();
        rdbArany = new javax.swing.JRadioButton();
        rdbEzust = new javax.swing.JRadioButton();
        rdbBronz = new javax.swing.JRadioButton();
        btnValaszt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txaLeiras.setColumns(20);
        txaLeiras.setRows(5);
        jScrollPane1.setViewportView(txaLeiras);

        buttonGroup1.add(rdbArany);
        rdbArany.setText("Aranyláda");

        buttonGroup1.add(rdbEzust);
        rdbEzust.setText("Ezüstláda");

        buttonGroup1.add(rdbBronz);
        rdbBronz.setText("Bronzláda");

        btnValaszt.setText("Választ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdbBronz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnValaszt))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbArany)
                            .addComponent(rdbEzust))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbArany)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbEzust)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbBronz)
                    .addComponent(btnValaszt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnValaszt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbArany;
    private javax.swing.JRadioButton rdbBronz;
    private javax.swing.JRadioButton rdbEzust;
    private javax.swing.JTextArea txaLeiras;
    // End of variables declaration//GEN-END:variables
}
