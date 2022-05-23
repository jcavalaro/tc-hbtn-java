public class NumerosPares {
    public static void main(String[] args) {

		int contador = 99;
		
		for (int i=0; i<=contador; i++) {
			
			if(i%2==0) {
				if(i<98) {
					System.out.print(i +", ");
				}else {
					System.out.println(i);	
				}
			}
		}
	}
}
