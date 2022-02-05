package org.edu;

public class Arts extends Education{
	private void bSc(int number) {
		System.out.println("Number of Students in BSC is "+number + " in 2021");

	}
	private void bEd(int number) {
		System.out.println("Number of Students in BED is "+number + " in 2021");

	}
	private void bA(int number) {
		System.out.println("Number of Students in BA is "+number + " in 2021");

	}
	private void bBA(int number) {
		System.out.println("Number of Students in BBA is "+number + " in 2021");

	}
	@Override
	public void ug(int number) {
		System.out.println();
		super.ug(100);
		System.out.println("Number of Students in UG is "+number + " in 2021");
		
	}
	@Override
	public void pg(int number) {
		System.out.println();
		super.pg(150);
		System.out.println("Number of Students in PG is "+number + " in 2021");
		
	}
	public static void main(String[] args) {
		Arts a=new Arts();
		a.bSc(200);
		a.bEd(250);
		a.bA(300);
		a.bBA(350);
		a.ug(200);
		a.pg(250);
		
		
	}

}
