package pkg1;

public class Ejercicio1{

    public static void main(String[] args) {
       
		char lletra;
		
			System.out.println("Escriu una lletra i jo et diré si és vocal o consonant....");                   
            
				lletra = Teclat.llegirChar();
			
				lletra = Character.toLowerCase(lletra); //Aquí diem que la lletra que ha posat el nostre usuari sigui minúsucula.
				
					if(lletra == 'a' || lletra == 'e' || lletra == 'i' || lletra == 'o' || lletra == 'u'){
						System.out.println("La lletra és vocal");
					}
					
					else{
						System.out.println("La lletra és consonant");
					}
		
    }
}
