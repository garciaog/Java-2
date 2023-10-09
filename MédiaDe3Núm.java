package LenonDeBoné;
import java.util.Scanner;
public class MédiaDe3Núm {
    public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int count = 0;
	int [] num = new int [10];
	for (int i = 0; i < num.length; i++){
		System.out.print("Digite 10 numeros inteiro: ");
		num [i] = input.nextInt();
		if(num[i] % 3 == 0){
                           // Não sei o que deve ser colocado aki 
			
		} else {
			System.out.println(" " + num[i]);
		}
		}

}
}
