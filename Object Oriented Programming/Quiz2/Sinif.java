import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.ListIterator;

public class Sinif {
	private String sinifAdi;
	private ArrayList<Ogrenci> Liste=new ArrayList<Ogrenci>();
	
	public Sinif(String sinifAdi) {
		this.sinifAdi=sinifAdi;
	}
	public void  ogrenciEkle(Ogrenci obj) {
		this.Liste.add(obj);
	}
	public boolean ogrenciSil(Ogrenci obj) {
		return this.Liste.remove(obj);	
	}
	public boolean sinifDosyasýOku(Sinif s,File dosya) {
		try {//Veri okuma
			BufferedReader br=new BufferedReader(new FileReader(dosya));
			String satir;
			while((satir=br.readLine())!=null){
				String[] dizi=satir.split(" ");
				Ogrenci ogr=new Ogrenci(dizi[0],dizi[1],dizi[2],Integer.valueOf(dizi[3]), dizi[4]);
				s.ogrenciEkle(ogr);
			}
			br.close();
			return true;
		}
		catch (Exception e) {
			System.err.println(e.toString());
			return false;
		}
	}
	
	public void sinifListesi() {
		System.out.println("Ad   Soyad   D.Tarihi    Ogr.No    Bölüm");
		System.out.println("----------------------------------------");
		ListIterator<Ogrenci> i=Liste.listIterator();
		while(i.hasNext()) {
			Ogrenci temp=(Ogrenci) i.next();
			temp.kisiBilgisiGetir();
		}
	}

	public static void main(String[] args) {
		File dosya =new File("C:\\Workspace\\Sinif.txt");
		Sinif s=new Sinif("bilisayar 1");
		s.sinifDosyasýOku(s,dosya);
		s.sinifListesi();
	}
}
