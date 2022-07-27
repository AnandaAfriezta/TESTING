/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author N a n d a
 */
public class Transaksi {

    private ArrayList<Integer> idjenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idClient = new ArrayList<Integer>();

    public Transaksi() {
        this.idClient.add(0);
        this.idjenisLaundry.add(0);
        this.banyak.add(2);
        this.idClient.add(0);
        this.idjenisLaundry.add(1);
        this.banyak.add(3);
        this.idClient.add(1);
        this.idjenisLaundry.add(0);
        this.banyak.add(1);
        this.idClient.add(1);
        this.idjenisLaundry.add(2);
        this.banyak.add(2);
    }

    public void prosesTransaksi(Client client, Transaksi transaksi, JenisLaundry jenisLaundry) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Silahkan belanja ");
        System.out.println(" Masukkan ID Member ");
        int idClient = scan.nextInt();
        System.out.println(" Selamat datang" + client.getNama(idClient));
        ArrayList<Integer> idjenisLaundry = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        System.out.print("Masukkan Jenis Laundry : ");
        temp = scan.nextInt();
        do {
            
                idjenisLaundry.add(temp);
                System.out.print(jenisLaundry.getjenisLaundry(idjenisLaundry.get(i)) + " sebanyak : ");
                banyak.add(scan.nextInt());
                System.out.print("Masukkan Jenis Laundry : ");
                temp = scan.nextInt();
                i++;
            
        } while (temp !=99);

        System.out.println(" Transaksi Laundry " + client.getNama(idClient) + " sebagai berikut ");
        System.out.println(" Nama Jenis Laundry \tQty \tHarga \tJumlah \t ");

        int total = 0;
        int x = idjenisLaundry.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * jenisLaundry.getHarga(idjenisLaundry.get(j));
            total += jumlah;
            System.out.println(jenisLaundry.getjenisLaundry(idjenisLaundry.get(j)) + "\t"
                    + idjenisLaundry.get(j) + "\t"
                    + jenisLaundry.getHarga(idjenisLaundry.get(j)) + "\t"
                    + jumlah);
            transaksi.setTransaksi(jenisLaundry, idClient, idjenisLaundry.get(j),
                    banyak.get(j));
        }
        System.out.println("Total Laundry : " + total);
        client.editSaldo(idClient, client.getSaldo(idClient) - total);
    }

    public void setTransaksi(JenisLaundry jenisLaundry, int idClient, int idjenisLaundry, int banyaknya) {
        this.idClient.add(idClient);
        this.idjenisLaundry.add(idjenisLaundry);
        this.banyak.add(banyaknya);
        jenisLaundry.editDurasi(idjenisLaundry, jenisLaundry.getDurasi(idjenisLaundry) - banyaknya);
    }

    public int getIdjenisLaundry(int id) {
        return this.idjenisLaundry.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getIdMember(int id) {
        return this.idClient.get(id);
    }

    public int getJmlTransaksi() {
        return this.idClient.size();

    }
}

