package week1;

public class JavaDersi14 {

	public static void main(String[] args) {
		
		String[] öğrenciler=new String[4];
		öğrenciler[0]="Ali";
		öğrenciler[1]="Engin";
		öğrenciler[2]="Veli";
		öğrenciler[3]="Can";
		for(int i=0;i<öğrenciler.length;i++) {
			System.out.println(öğrenciler[i]);
		}
		
		System.out.println("--------------------------------------------------");
		
		for(String ogrenciler:öğrenciler) {
			System.out.println(ogrenciler);
		}
	}
}
