public class OperatorLogika {
		public static void main (String[] args){
			boolean a = true;
			boolean b = false;
			
			System.out.println("hasil a AND b  :" +(a && b));
			System.out.println("hasil a OR b   :" +(a || b));
			System.out.println("hasil a NOT b  :" +(!a));
			System.out.println( );
			System.out.println("hasil          :" +(!a && b));
			System.out.println("hasil          :" +(!(a && b)));
			
		}
}