package com.human.ex;

class ExchangeClass {
	public static double exchangeRate1 = 1200;
	public double exchangeTax1 = 0;
	public double dollor1 = 0;
	public double won1 = 0;
	public double rDollor1 = 0;
	public double rWon1 = 0;

	public ExchangeClass() {};
	public ExchangeClass(double exchangeRate1, double exchangeTax1, 
			double dollor1, double won1) {
		this.exchangeRate1 = exchangeRate1;
		this.exchangeTax1 = exchangeTax1;
		this.dollor1 = dollor1;
		this.won1 = won1;
	}
	
	public static void changeExchangeRate() {
		ExchangeClass.exchangeRate1=ExchangeClass.exchangeRate1*1.1;
	}
	public static void changeExchangeRate2() {
		ExchangeClass.exchangeRate1=ExchangeClass.exchangeRate1*1.1;
	}
	public double exchangeWonToDollar() {
		this.rDollor1 = this.won1 * (1 - this.exchangeTax1) / this.exchangeRate1;
		return this.rDollor1;
	}

	public double exchangeDollarToWon() {
		this.rWon1 = this.dollor1 * this.exchangeRate1 * (1 - this.exchangeTax1);
		return this.rWon1;
	}

	public class ClassStart6 {
		// 1. 관련있는 코드 묶고
		// 2. 관련있는 메소드들을 묶고
		// 3. 생성자 만들고
		// 4. 공유되는 data를 static
		// 5. static메소드를 이용해서 static필드값을 사용하고

		public void display() {
			System.out.println("exRate:" + exchangeRate1);
			System.out.println("exTax:" + exchangeTax1);
			System.out.println("dollor:" + dollor1);
			System.out.println("rDollor:" + rDollor1);
			System.out.println("won:" + won1);
			System.out.println("rWon:" + rWon1);
		}
		}
	    public static void main(String[] args)  {
		System.out.println(ExchangeClass.exchangeRate1);
		ExchangeClass.changeExchangeRate();
		System.out.println(ExchangeClass.exchangeRate1);
		(new ExchangeClass()).changeExchangeRate2();
	}
}
