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
public class Client implements User {

    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> Saldo = new ArrayList<Integer>();

    public Client() {
        this.namaClient.add("Sukri");
        this.alamat.add("Pandaran");
        this.telepon.add("083117932865");
        this.Saldo.add(200000);

        this.namaClient.add("Siti");
        this.alamat.add("Kebonjaya");
        this.telepon.add("085749046280");
        this.Saldo.add(100000);

        this.namaClient.add("Budi");
        this.alamat.add("Sumberejo");
        this.telepon.add("083153797003");
        this.Saldo.add(150000);

        this.namaClient.add("Andi");
        this.alamat.add("Plumpang");
        this.telepon.add("083177458257");
        this.Saldo.add(250000);

    }

    public void setSaldo(int saldo) {
        this.Saldo.add(saldo);

    }

    public int getSaldo(int idClient) {
        return this.Saldo.get(idClient);

    }

    public void editSaldo(int idClient, int saldo) {
        this.Saldo.set(idClient, saldo);

    }

    public int getJmlhClient() {
        return this.Saldo.size();

    }

    @Override
    public void setNama(String namaClient) {
        this.namaClient.add(namaClient);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idClient) {
        return this.namaClient.get(idClient);
    }

    @Override
    public String getAlamat(int idClient) {
        return this.alamat.get(idClient);
    }

    @Override
    public String getTelepon(int idClient) {
        return this.telepon.get(idClient);

    }
}
