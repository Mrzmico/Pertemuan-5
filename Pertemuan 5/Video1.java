class Mahasiswa{
    String nama;
    String nim;
    String jurusan;
    double ipk;
    int umur;

}



public class Video1 {
  
    public static void main(String[] args) throws Exception {

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "ucup";
        mahasiswa1.nim = "12313131";
        mahasiswa1.jurusan = "INF";
        mahasiswa1.ipk = 4.0;
        mahasiswa1.umur = 22;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.nim);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.ipk);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "otong";
        mahasiswa2.nim = "231312312";
        mahasiswa2.jurusan = "ARS";
        mahasiswa2.ipk = 3.0;
        mahasiswa2.umur = 23;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.nim);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.ipk);
        System.out.println(mahasiswa2.umur);
        
    }
  }