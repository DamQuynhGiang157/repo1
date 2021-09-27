package Baitap1;

public class ThuatToan {
	
	/*Từ hệ phương trình ta có ma trận A, gọi định thức ma trận A là D[0]
	 * Tương tự ta có D[1] = Dx
	 * 				  D[2] = Dy
	 * 				  D[3] = Dz
	*/
	public static double[] Dinhthuc(HePt hpt){
				double D[]= new double[4];
				D[0]=hpt.a1*(hpt.b2*hpt.c3-hpt.c2*hpt.b3)-hpt.b1*(hpt.a2*hpt.c3-hpt.c2*hpt.a3)+hpt.c1*(hpt.a2*hpt.b3-hpt.b2*hpt.a3);
				D[1]=hpt.d1*(hpt.b2*hpt.c3-hpt.c2*hpt.b3)-hpt.b1*(hpt.d2*hpt.c3-hpt.c2*hpt.d3)+hpt.c1*(hpt.d2*hpt.b3-hpt.b2*hpt.d3);
				D[2]=hpt.a1*(hpt.d2*hpt.c3-hpt.c2*hpt.d3)-hpt.d1*(hpt.a2*hpt.c3-hpt.c2*hpt.a3)+hpt.c1*(hpt.a2*hpt.d3-hpt.d2*hpt.a3);
				D[3]=hpt.a1*(hpt.b2*hpt.d3-hpt.d2*hpt.b3)-hpt.b1*(hpt.a2*hpt.d3-hpt.d2*hpt.a3)+hpt.d1*(hpt.a2*hpt.b3-hpt.b2*hpt.a3);
		return D;		
	}
	public static boolean checkHePTVN(HePt hpt) {
		if((hpt.a1*(hpt.b2*hpt.c3-hpt.c2*hpt.b3)-hpt.b1*(hpt.a2*hpt.c3-hpt.c2*hpt.a3)+hpt.c1*(hpt.a2*hpt.b3-hpt.b2*hpt.a3))!=0) {
			return true;
		}
		else return false;
	}
}
