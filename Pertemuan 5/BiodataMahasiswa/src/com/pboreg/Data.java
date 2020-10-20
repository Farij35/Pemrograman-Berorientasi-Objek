package com.pboreg;

class biodata {
    private String NIM;
    private String nama;
    private String jurusan;
    private String angkatan;

    public String tampilkanNIM(){
        return this.NIM;
    }

    public String tampilkanNama(){
        return this.nama;
    }

    public String tampilkanJurusan(){
        return this.jurusan;
    }

    public String tampilkanAngkatan(){
        return this.angkatan;
    }

    public void inputNIM(String data){
        this.NIM = data;
    }

    public void inputNama(String data){
        this.nama = data;
    }

    public void inputJurusan(String data){
        this.jurusan = data;
    }

    public void inputAngkatan(String data){
        this.angkatan = data;
    }
}
