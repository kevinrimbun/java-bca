public class App {
    public static void main(String[] args) {
        System.out.println("kevin");
        Nama nama = new Nama();
        String name = nama.getNama();
        System.out.println(name);
    }
}
class Nama {
	private String nama = "Kevin";

	public String getNama() {
	    return nama;
	}
}