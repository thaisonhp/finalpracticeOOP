package Object;

import java.util.ArrayList;

public class MobileManagerIMPL implements MobileManager {
	private ArrayList<Mobile> ListMobile ; 
	
	public MobileManagerIMPL() {
		this.ListMobile = new ArrayList<>() ; 
	}
	
	public MobileManagerIMPL(ArrayList<Mobile> ListMobile) {
		this.ListMobile = ListMobile ;
	}
	
	@Override
	public boolean addMobile(Mobile m) {
		// TODO Auto-generated method stub
		boolean find = false ; 
		for(Mobile i : this.ListMobile) {
			if(i.getProduct_id() == m.getProduct_id()) {
				find = true ;
				break ;
			}
		}
		if(find) return false; 
		else {
			this.ListMobile.add(m);
			return true ;
		}
	}

	@Override
	public boolean delMobile(Mobile m) {
		boolean result = false ;
		for(Mobile i :this.ListMobile) {
			if(i.getProduct_id() == m.getProduct_id()) {
				this.ListMobile.remove(i);
				result = true; 
				break; 
			}
		}
		return result;
	}

	public ArrayList<Mobile> searchMobile(String name) {
		ArrayList<Mobile> results = new  ArrayList<>() ; 
		this.ListMobile.forEach(go->{
			if(go.getProduct_name().contains(name)) {
				results.add(go);
			}
		});
		return results;
	}

	@Override
	public double getTotalStorage() {
		double result = 0  ; 
		// TODO Auto-generated method stub
		for(Mobile i : this.ListMobile) {
			result += i.getTotalPrice() ;
		}
		return result;
	}

}
