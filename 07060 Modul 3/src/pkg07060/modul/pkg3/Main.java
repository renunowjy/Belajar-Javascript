
package pkg07060.modul.pkg3;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Pegawai> pegawaiArr = new ArrayList();
    static ArrayList<Pelanggan> pelangganArr = new ArrayList();
    static ArrayList<Cucian> cucianArr = new ArrayList();

    public static void main(String[] args) {
        
        int menu;
        
        do{
            System.out.println("\n\nSystem Informasi Laundry RPL!!!");
            Main.tampilkanData();
            
            System.out.println("\n\nMenu : ");
            System.out.println("1. Tambah Kasir");
            System.out.println("2. Tambah Pelanggan");
            System.out.println("3. Tambah Transaksi Cucian");
            System.out.println("0. Selesai");
            System.out.println("Masukkan Pilihan : ");
            menu = scan.nextInt();
            
            switch(menu){
                case 1:
                    Main.tambahKasir();
                    break;
                case 2:
                    Main.tambahPelanggan();
                    break;
                case 3:
                    Main.tambahCucian();
                    break;
                default:
                    menu = 0;
                    System.out.println("Terima Kasih telah Menggunakan System Informasi Laundry RPL!!!");
            }
            
        }while(menu!=0);

        }
     
    static void tampilkanData(){
        System.out.println("\n \nData Pegawai : ");
        for(int i=0;i<pegawaiArr.size();i++){
            System.out.println(" ID Pegawai : "+pegawaiArr.get(i).getId()+", Nama : "+pegawaiArr.get(i).getNama()+", No. HP : "+pegawaiArr.get(i).getNoHp());
        }
        System.out.println("\n \nData Pelanggan : ");
        for(int i=0;i<pelangganArr.size();i++){
            System.out.println(" ID Pelanggan : "+pelangganArr.get(i).getId()+", Nama : "+pelangganArr.get(i).getNama()+", No. HP : "+pelangganArr.get(i).getNoHp());
        }
        
        System.out.println("\n \nData Cucian : ");
        for(int i =0;i< cucianArr.size();i++){
            System.out.println("Nama Pegawai : "+cucianArr.get(i).getPegawai().getNama()+", Nama Pelanggan : "+pelangganArr.get(i).getNama()+", Berat Cucian : "+cucianArr.get(i).getBerat()+"KG, Harga Total Cucian : "+cucianArr.get(i).getHargaTotal());
        }
    }
    
    static void tambahKasir(){
        System.out.println("Tambah Data Pegawai!");
        Pegawai pegawai = new Pegawai();
        
        System.out.println("ID Pegawai : "+String.valueOf(pegawaiArr.size()+1));
        pegawai.setId(pegawaiArr.size()+1);
        System.out.println("Nama Pegawai : ");
        pegawai.setNama(scan.next());
        System.out.println("Kata Sandi Pegawai : ");
        pegawai.setKataSandi(scan.next());
        System.out.println("Nomor HP Pegawai : ");
        pegawai.setNoHp(scan.next());
        
        pegawaiArr.add(pegawai);
    }
    
    static void tambahPelanggan(){
        System.out.println("Tambah Data Pelanggan!");
        Pelanggan pelanggan = new Pelanggan();
        
        System.out.println("ID Pelanggan : "+String.valueOf(pelangganArr.size()+1));
        pelanggan.setId(pelangganArr.size()+1);
        System.out.println("Nama Pelanggan : ");
        pelanggan.setNama(scan.next());
        System.out.println("Nomor HP Pelanggan : ");
        pelanggan.setNoHp(scan.next());
        
        pelangganArr.add(pelanggan);
    }
    
    static void tambahCucian(){
        System.out.println("Tambah Data Cucian!");
        Cucian cucian = new Cucian();
        
        System.out.println("ID Pegawai : ");
        cucian.setPegawai(pegawaiArr.get(scan.nextInt()-1));
        System.out.println("ID Pelanggan : ");
        cucian.setPelanggan(pelangganArr.get(scan.nextInt()-1));
        System.out.println("Berat Cucian (KG) : ");
        cucian.setBerat(scan.nextFloat());
        
        System.out.println("Harga Total Adalah : Rp."+ cucian.getHargaTotal());
        cucianArr.add(cucian);
    }
    
    }
