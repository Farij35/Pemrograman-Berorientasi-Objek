package com.pboreg;

import java.util.ArrayList;

class dataMobil{
    private ArrayList<String> mobil = new ArrayList<String>();
    public void setMobil(String data) {
        this.mobil.add(data);
    }

    public void viewAll1(){
        System.out.println("List Mobil : ");
        for(int i=0; i < mobil.size(); i++){
            System.out.println("- " + mobil.get(i));
        }
    }
    public void viewAll2(){
        System.out.println("List Mobil : ");
        for(String data:mobil){
            System.out.println("- " + data);
        }
    }

    public void cariData(String cari){
        if (mobil.contains(cari)){
            System.out.println("Data Ketemu");
        }
        else {
            System.out.println("Data Tidak Ketemu");
        }
    }

    public void gantiMobil(int index, String data){
        this.mobil.set(index, data);
    }

    public void gantiMobil2(String dataAsli, String dataGanti){
        int i;
        if (mobil.contains(dataAsli)){
            i = mobil.indexOf(dataAsli);
            mobil.set(i,dataGanti);
        }
        else {
            System.out.println("Data Asli Tidak Ketemu, Maka Data Tidak Dapat Diganti");
        }
    }

    public void hapusMobil(String dataAsli){
        int i;
        if (mobil.contains(dataAsli)){
            i = mobil.indexOf(dataAsli);
            mobil.remove(i);
        }
        else {
            System.out.println("Data tidak ketemu, maka data tidak dapat dihapus");
        }
    }
}

public class ArrList2 {
    public static void main(String[] args) {
        dataMobil dm = new dataMobil();
        dm.setMobil("Volvo");
        dm.setMobil("BMW");
        dm.setMobil("Opel");
        dm.viewAll1();
        dm.cariData("Opel");
        dm.gantiMobil(0, "Opel");
        dm.viewAll2();
        dm.gantiMobil2("BMW", "Mazda");
        dm.viewAll2();
        dm.hapusMobil("Mazda");
        dm.viewAll2();
    }
}
