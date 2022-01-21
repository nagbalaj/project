package technoserve.c2tc;
import technoserve.c2tc.b5.Softskill;
import technoserve.c2tc.b5.Technical;
public class Placement_support {
	String Trainer_name ="avijit";
	public static void main(String[] args) {
		Placement_support p = new Placement_support();
		Softskill s = new Softskill();
		technoserve.c2tc.b5.Technical t= new Technical(); //fully qualified
		System.out.println("the placement_support trainer name is :"+p.Trainer_name);
		System.out.println("the Softskill trainer name is :"+s.Trainer_name);
		System.out.println("the placement_support trainer name is :"+t.Trainer_name);
	}

}
