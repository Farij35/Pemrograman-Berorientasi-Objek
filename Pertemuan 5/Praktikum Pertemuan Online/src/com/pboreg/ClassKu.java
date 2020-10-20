package com.pboreg;

class ClassKu {
    //Atribute
    public int x = 5; //atribut ini boleh diakses secara langsung dari luar classku
    int y = 15; //atribut ini dapat diakses secara lagsung dari luar classku dalam 1 package
    private int z = 20; //atribut ini boleh diakses secara langsung dari luar classku

    //method
    public int tampilkanZ(){
        return this.z;
    }

}

