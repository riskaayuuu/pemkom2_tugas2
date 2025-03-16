/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author My Asus
 */
public class Barang<T extends Number> {
    private String idBarang;
    private String namaBarang;
    private T jumlahStok;
    private T harga;

    public Barang(String idBarang, String namaBarang, T jumlahStok, T harga) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.jumlahStok = jumlahStok;
        this.harga = harga;
    }

    public String getIdBarang() { return idBarang; }
    public String getNamaBarang() { return namaBarang; }
    public T getJumlahStok() { return jumlahStok; }
    public T getHarga() { return harga; }
}


//    String path, fileName, fileSize, extention;
//    
//    /**
//     *
//     * @param p
//     * @param fn
//     * @param fs
//     * @param e
//     */
//    public Barang(String p, String fn, String fs, String e) {
//        this.path = p;
//        this.fileName = fn;
//        this.fileSize = fs;
//        this.extention = e;
//    }
//    
//    public String getPath(){
//        return path;
//    }
//    
//    public String getFileName(){
//        return fileName;
//    }
//    
//    public String getFileSize() {
//        return fileSize;
//    }
//    
//    public String getExtention() {
//        return extention;
//    }
