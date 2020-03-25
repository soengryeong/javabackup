package com.human.ex;

class ExchangeClass {
	public double exchangeRate1 = 1200;
	public double exchangeTax1 = 0;
	public double dollor1 = 0;
	public double won1 = 0;
	public double rDollor1 = 0;
	public double rWon1 = 0;

	public ExchangeClass() {};
	public ExchangeClass(double exchangeRate1, double exchangeTax1, double dollor1, double won1) {
		this.exchangeRate1 = exchangeRate1;
		this.exchangeTax1 = exchangeTax1;
		this.dollor1 = dollor1;
		this.won1 = won1;
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

//		public static double exchangeWonToDollar(double won, double rate, double tax) {
//			return won * (1 - tax) / rate;
//		}
//
//		public static double exchangeDollarToWon(double dollar, double rate, double tax) {
//			return dollar * rate * (1 - tax);
//			
//		}

		public void display() {
			System.out.println("exRate:" + exchangeRate1);
			System.out.println("exTax:" + exchangeTax1);
			System.out.println("dollor:" + dollor1);
			System.out.println("rDollor:" + rDollor1);
			System.out.println("won:" + won1);
			System.out.println("rWon:" + rWon1);
		}

		public static void display(String user, double rate, double tax, 
				double dollor, double rDollor, double won,double rWon) {
			System.out.println("exUser:" + user);
			System.out.println("exRate:" + rate);
			System.out.println("exTax:" + tax);
			System.out.println("dollor:" + dollor);
			System.out.println("rDollor:" + rDollor);
			System.out.println("won:" + won);
			System.out.println("rWon:" + rWon);
		}
	

		 public static void main(String[] args) {

//			ExchangeClass user1 = new ExchangeClass(1200, 0.05, 20, 20000);
//			ExchangeClass user2 = new ExchangeClass(1200, 0.05, 20, 20000);
//			ExchangeClass user3 = new ExchangeClass(1200, 0.05, 20, 20000);
//
//			exchangeWonToDollar(user1);// user1.exchangeWonToDollar()
//			exchangeWonToDollar(user2);
//			exchangeWonToDollar(user3);
			 
			user1.exchangeWonToDollar();
			user2.exchangeWonToDollar();
			user3.exchangeWonToDollar();

			user1.exchangeDollarToWon();
			user2.exchangeDollarToWon();
			user3.exchangeDollarToWon();
//			exchangeDollarToWon(user1);
//			exchangeDollarToWon(user2);
//			exchangeDollarToWon(user3);
			user1.display();
			user2.display();
			user3.display();
			

//			display(user1);
//			display(user2);
//			display(user3);

		}
	}
}
