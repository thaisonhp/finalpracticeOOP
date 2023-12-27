package Object;

import java.util.ArrayList;

public class Test {
	private static ArrayList<Mobile> ListMobile ; 
	
	public void generateList(int n) {
		Test.ListMobile = new ArrayList<>(); 
		String[] name = {"ip11","ss22","oppo21","xiaomi03","ip12prm","ip12","ipx"};
		String[] manufacturer = {"ip","ss","xiaomi","lg"};
 		int cnt ; 
 		for(int i = 1 ; i <= n ; i++ )
		{
 			Mobile m = new Mobile(); 
			m.setProduct_id(i);
			cnt = (int)(Math.random()*(name.length));
			m.setProduct_name(name[cnt]);
			m.setProduct_price((int)(Math.random()*1000));
			m.setProduct_total((int)(Math.random()*100));
			cnt = (int)(Math.random()*manufacturer.length) ; 
			m.setMobile_manufacturer(manufacturer[cnt]);
			m.setMobile_ram(Math.random()*10);
			ListMobile.add(m);
		}
 		
	}
	public void printList() {
		Test.ListMobile.forEach(go->{
			System.out.println(go);
		});
	}
	public void printList(ArrayList<Mobile> list) {
		list.forEach(go->{
			System.out.println(go);
		});
	}
	public static void main(String[] args) {
		Test o1 = new Test() ; 
		o1.generateList(5);
		o1.printList();
		MobileManagerIMPL manager = new MobileManagerIMPL(ListMobile);
		manager.addMobile(new Mobile(6,"ip6",1000,10,"ip",2));
		System.out.println("Ket qua tim kiem:");
		ArrayList<Mobile> results = manager.searchMobile("ip6");
		o1.printList(results);
		manager.delMobile(new Mobile(6,"ip6",1000,10,"ip",2));
		System.out.print(manager.getTotalStorage());
	}
}
