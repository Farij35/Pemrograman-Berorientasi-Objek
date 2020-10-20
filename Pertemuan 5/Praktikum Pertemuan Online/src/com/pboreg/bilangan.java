package com.pboreg;

class bilangan {
    private int a = 35;
    private int b = 40;
    private int c = 45;

    public int tampilkanA(){
        return this.a;
    }

    public int tampilkanB(){
        return this.b;
    }

    public int tampilkanC(){
        return this.c;
    }

    public void inputA(int nilai){
        this.a = nilai;
    }

    public void inputB(int nilai){
        this.b = nilai;
    }

    public void inputC(int nilai){
        this.c = nilai;
    }

    public int tambah(){
        int hasil = this.a + this.b + this.c;
        return hasil;
    }

    public int kurang(){
        int hasil = this.a - this.b - this.c;
        return hasil;
    }

    public int kali(){
        int hasil = this.a * this.b * this.c;
        return hasil;
    }

    public double bagi(){
        double hasil = (double) this.a /(double) this.b /(double) this.c;
        return hasil;
    }

    public void inputData(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

}