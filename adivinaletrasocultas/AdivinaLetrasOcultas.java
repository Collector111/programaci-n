import java.util.Scanner;
public class AdivinaLetrasOcultas {
		public static void main(String[] args) {//fraseParcialmenteOculta.
			/*
			Pasar la fraseOculta a fraseParcialmenteOculta;
			ocultando las letras sustituyendolas por asteriscos;
			
			
			*/
		Scanner entrada = new Scanner(System.in);
		// TODO: Check and accomplish variable declarations: 
		String fraseOculta;
        StringBuilder fraseParcialmenteOculta;
		char caracter;
        
        fraseOculta = entrada.nextLine();
        fraseParcialmenteOculta = new StringBuilder();
		for(int i=0;i<fraseOculta.length();i++){
			fraseOculta.charAt(i);
			if(Character.isLetter(fraseOculta.charAt(i))){
				fraseParcialmenteOculta.append('*');
			}else{
				fraseParcialmenteOculta.append(fraseOculta.charAt(i));
			}
		}
		System.out.println(fraseOculta);
		System.out.println(fraseParcialmenteOculta);
		// mientras el caracter leido sea diferente del caracter punto 
		caracter = entrada.nextLine().trim().charAt(0);
		while (caracter != '.') {
			// buscar el caracter dentro de la frase oculta
            if (){
				Desvelar el caracter oculto;
				System.out.println(la frase fraseParcialmenteOculta);
			}
			else
			{
				System.out.println("no está");
			}
			caracter = (new Scanner(System.in)).nextLine();
		}
		System.out.println(Felicidades lo has encontrado en X intentos);
		
	}

}