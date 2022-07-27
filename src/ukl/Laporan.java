/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

/**
 *
 * @author N a n d a
 */
public class Laporan {

    public void laporan(JenisLaundry jenisLaundry) {
        int x = jenisLaundry.getJmlhLaundry();

        System.out.println();
        System.out.println("Tabel Jenis Laundry");
        System.out.println();
        System.out.println("Jenis Laundry \tDurasi \tHarga");
        for (int i = 0; i < x; i++) {
            System.out.println(jenisLaundry.getjenisLaundry(i) + "\t"
                    + jenisLaundry.getDurasi(i) + "\t" + jenisLaundry.getHarga(i));
        }
    }

    public void laporan(Client client) {
        int x = client.getJmlhClient();

        System.out.println();
        System.out.println("Tabel Client");
        System.out.println();
        System.out.println("Nama \tAlamat \t\tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(client.getNama(i) + "\t"
                    + client.getAlamat(i) + "\t" + client.getTelepon(i) + "\t"
                    + client.getSaldo(i));
        }
    }

    public void laporan(Transaksi transaksi, JenisLaundry jenisLaundry) {
        int x = transaksi.getJmlTransaksi();

        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.println("Jenis Laundry\tQty \tHarga \tJumlah");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyaknya(i) * jenisLaundry.getHarga(transaksi.getIdjenisLaundry(i));
            total += jumlah;

            System.out.println(jenisLaundry.getjenisLaundry(transaksi.getIdjenisLaundry(i)) + "\t"
                    + transaksi.getBanyaknya(i) + "\t" + jenisLaundry.getHarga(transaksi.getIdjenisLaundry(i)) + "\t"
                    + jumlah);
        }
        System.out.println("Total Pendapatan = " + total);
    }
}
