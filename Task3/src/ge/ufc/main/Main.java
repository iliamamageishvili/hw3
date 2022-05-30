package ge.ufc.main;

public class Main {

	public static void main(String[] args) {
		ge.ufc.ilia.Rectangle rc1 = new ge.ufc.ilia.Rectangle();
		rc1.setHeight(10);
		rc1.setWidth(5);
		
		ge.ufc.ilia.Rectangle rc2 = new ge.ufc.ilia.Rectangle();
		rc2.setHeight(12);
		rc2.setWidth(3);
		
		System.out.println(rc1.isEqual(rc2));
		
		
		ge.ufc.ilia1.Rectangle rc3 = new ge.ufc.ilia1.Rectangle();
		rc3.setHeight(10);
		rc3.setWidth(5);
		
		ge.ufc.ilia1.Rectangle rc4 = new ge.ufc.ilia1.Rectangle();
		rc4.setHeight(10);
		rc4.setWidth(5);
		System.out.println(ge.ufc.ilia1.Rectangle.isEqual(rc3,rc4));
	}

}
