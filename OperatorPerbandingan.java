public class OperatorPerbandingan {
		public static void main (String[] args){
			int a = 10;
			int b = 2;
			String x = "Biru";
			String y = "Merah";
			
			System.out.println("hasil a = b  :" +(a==b));
			System.out.println("hasil a > b  :" +(a>b));
			System.out.println("hasil a < b  :" +(a<b));
			System.out.println("hasil a >= b :" +(a>=b));
			System.out.println("hasil a <= b :" +(a<=b));
			System.out.println("hasil a != b :" +(a!=b));
			System.out.println( );
			System.out.println("Sama Dengan (==) dan Tidak Sama Dengan (!=) digunakan hanya untuk String");
			System.out.println("hasil Merah = Biru  :" +(x==y));
			System.out.println("hasil Merah != Biru :" +(x!=y));
			
		}
}