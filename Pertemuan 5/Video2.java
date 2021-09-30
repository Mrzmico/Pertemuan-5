class Polos{
    String dataString;
    int dataInteger;
}

class Mahasiswa{
    String nama;
    String nim;
    String jurusan;

    //ini adalah constructor
    //Mahasiswa(){
        //System.out.println("Constructor");
    //}

    Mahasiswa(String inputNama, String inputnim, String inputjurusan){
        nama = inputNama;
        nim = inputnim;
        jurusan = inputjurusan;

        System.out.println(nama);
        System.out.println(nim);
        System.out.println(jurusan);
    }
}

public class Video2 {
  
    public static void main(String[] args) throws Exception {

        Mahasiswa mahasiswa1 = new Mahasiswa("ucup", "1231313", "INF");
        Mahasiswa mahasiswa2 = new Mahasiswa("otong", "2312313", "ARS\n");
        

        Polos objectPolos = new Polos();
        objectPolos.dataString ="polos";
        objectPolos.dataInteger =0;

        System.out.println(objectPolos.dataString);
        System.out.println(objectPolos.dataInteger);
    }
  }