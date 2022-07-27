/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

import java.util.ArrayList;

/**
 *
 * @author N a n d a
 */
public class JenisLaundry {

    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public JenisLaundry() {
        this.jenisLaundry.add("Baju Koko");
        this.harga.add(10000);
        this.durasi.add(8);

        this.jenisLaundry.add("Celana Kain");
        this.harga.add(7500);
        this.durasi.add(10);

        this.jenisLaundry.add("Kaos Oblong");
        this.harga.add(5000);
        this.durasi.add(5);

        this.jenisLaundry.add("Celana Jeans");
        this.harga.add(8000);
        this.durasi.add(14);

    }

    public int getJmlhLaundry() {
        return this.jenisLaundry.size();

    }

    public void setJenisLaundry(String jenisLaundry) {
        this.jenisLaundry.add(jenisLaundry);

    }

    public String getjenisLaundry(int idjenisLaundry) {
        return this.jenisLaundry.get(idjenisLaundry);

    }

    public void setDurasi(int durasi) {
        this.durasi.add(durasi);

    }

    public int getDurasi(int idjenisLaundry) {
        return this.durasi.get(idjenisLaundry);

    }

    public void editDurasi(int idjenisLaundry, int durasi) {
        this.durasi.set(idjenisLaundry, durasi);

    }

    public void setHarga(int harga) {
        this.harga.add(harga);

    }

    public int getHarga(int idjenisLaundry) {
        return this.harga.get(idjenisLaundry);
    }
}
