package com.pbo;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class HelloWorldController {
    public Label label_pesan;
    public TextField text_pesan;
    public TextField text_angka1;
    public TextField text_angka2;
    public Label display_kalkulator;
    private int i=0;
    public void buttonPesanKlik(ActionEvent actionEvent) {
        String pesan;
        i++;
        //pesan = "Hello World ke-" + i;
        pesan = text_pesan.getText().toUpperCase();
        System.out.println(pesan);
        label_pesan.setText(pesan);
    }

    public void buttonBagiKlik(ActionEvent actionEvent) {
        double angka1, angka2, hasil;
        angka1 = Double.parseDouble(text_angka1.getText());
        angka2 = Double.parseDouble(text_angka2.getText());
        DecimalFormat df = new DecimalFormat("###.#");

        if (angka2 == 0){
            display_kalkulator.setText("Tak Hingga");
        } else {
            hasil = angka1 / angka2;
            display_kalkulator.setText(df.format(angka1) + " / " + df.format(angka2) + " = " + df.format(hasil));
        }
    }

    public void buttonKaliKlik(ActionEvent actionEvent) {
        double angka1, angka2, hasil;
        angka1 = Double.parseDouble(text_angka1.getText());
        angka2 = Double.parseDouble(text_angka2.getText());
        DecimalFormat df = new DecimalFormat("###.#");

        hasil = angka1 * angka2;
        display_kalkulator.setText(df.format(angka1) + " x " + df.format(angka2) + " = " + df.format(hasil));
    }

    public void buttonTambahKlik(ActionEvent actionEvent) {
        double angka1, angka2, hasil;
        angka1 = Double.parseDouble(text_angka1.getText());
        angka2 = Double.parseDouble(text_angka2.getText());
        DecimalFormat df = new DecimalFormat("###.#");

        hasil = angka1 + angka2;
        display_kalkulator.setText(df.format(angka1) + " + " + df.format(angka2) + " = " + df.format(hasil));
    }

    public void buttonKurangKlik(ActionEvent actionEvent) {
        double angka1, angka2, hasil;
        angka1 = Double.parseDouble(text_angka1.getText());
        angka2 = Double.parseDouble(text_angka2.getText());
        DecimalFormat df = new DecimalFormat("###.#");

        hasil = angka1 - angka2;
        display_kalkulator.setText(df.format(angka1) + " - " + df.format(angka2) + " = " + df.format(hasil));
    }

    public void hapusLayarKlik(ActionEvent actionEvent) {
        display_kalkulator.setText("");
    }
}
