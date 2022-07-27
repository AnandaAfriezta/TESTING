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
public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Petugas petugas = new Petugas();
        JenisLaundry jenisLaundry = new JenisLaundry();
        Transaksi transaksi = new Transaksi();
        Laporan lap = new Laporan();
        
        lap.laporan(client);
        lap.laporan(jenisLaundry);
        lap.laporan(transaksi, jenisLaundry);
        transaksi.prosesTransaksi(client, transaksi, jenisLaundry);
        lap.laporan(transaksi, jenisLaundry);
        lap.laporan(jenisLaundry);
        lap.laporan(client);
    }
}
