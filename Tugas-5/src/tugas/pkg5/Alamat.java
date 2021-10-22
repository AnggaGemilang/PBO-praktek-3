/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg5;

/**
 *
 * @author angga
 */
public class Alamat {
    private String jalan;
    private int rt;
    private int rw;
    private String kecamatan;
    private String kelurahan;
    private String provinsi;
    
    public Alamat(String jalan, int rt, int rw, 
            String kecamatan, 
            String kelurahan, String provinsi){
        this.jalan = jalan;
        this.rt = rt;
        this.rw = rw;
        this.kecamatan = kecamatan;
        this.kelurahan = kelurahan;
        this.provinsi = provinsi;
    }

    public String getJalan() {
        return jalan;
    }

    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    public int getRt() {
        return rt;
    }
    
    public void setRt(int rt) {
        this.rt = rt;
    }

    public int getRw() {
        return rw;
    }

    public void setRw(int rw) {
        this.rw = rw;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }
}
