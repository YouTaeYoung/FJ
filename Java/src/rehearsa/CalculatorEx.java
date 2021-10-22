package rehearsa;

	class CalculatorEx {
		
		int add, min, mul, div;
		
		void init() {
			add = min = mul = div = 0;
		}
		
		void showOpCount() {
			System.out.println("덧셈횟수:"+ add);
			System.out.println("뺄셈횟수:"+ min);
			System.out.println("곱셈횟수:"+ mul);
			System.out.println("나눗셈횟수:"+ div);
		}
		
		double add(double x, double y) {
			add++;
			return x+y;
		}
		double min(double x, double y) {
			min++;
			return x-y;
		}
		double mul(double x, double y) {
			mul++;
			return x*y;
		}
		double div(double x, double y) {
			div++;
			return x/y;
		}
		public static void main(String[] args) {
			
			CalculatorEx cal = new CalculatorEx();
			cal.init();
			System.out.println("1 + 2 = " + cal.add(1 , 2));
			System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
			System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
			System.out.println("100 / 25 = " + cal.div(100 , 25));
			System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
			cal.showOpCount();
}
	}
	