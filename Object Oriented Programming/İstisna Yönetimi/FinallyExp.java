import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FinallyExp {

	public static void main(String[] args) {
		File dosya=new File("C:\\workspace\\kitap.txt");
		File dosya2=new File("C:\\workspace\\kitapkopya.txt");
		char data[]=new char[(int) dosya.length()];
		try(FileWriter yaz=new FileWriter(dosya2)) {
			FileReader reader=new FileReader(dosya);
			reader.read(data);
			yaz.write(data);
		}
		catch (IOException e) {
			e.printStackTrace();//Hata yýðýnýný ekrana basar
		}
		finally {
			System.out.println("Dosya kapatýldý");
		}
	}

}
