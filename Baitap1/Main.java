package Baitap1;

public class Main {
	public static void main(String[] args) {
		HePt hpt= new HePt();
		hpt.Input();
		if(!ThuatToan.checkHePTVN(hpt)) {
			System.out.println("Hệ phương trình vô nghiệm hoặc vô số nghiệm");
		}
		else {
			System.out.println("Nghiệm của hệ phương trình là ");
		
		double D[]=ThuatToan.Dinhthuc(hpt);
		System.out.println("x= "+D[1]/D[0]);
		System.out.println("y= "+D[2]/D[0]);
		System.out.println("z= "+D[3]/D[0]);
		}
	}
}
