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
	public boolean addMobile(Mobile m)  throws NullPointerException {
		// TODO Auto-generated method stub
		boolean find = false ; 
		try {
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
		}catch(NullPointerException ex) {
			ex.getStackTrace();
			return false ;
		}
	}

	@Override
	public boolean delMobile(Mobile m) throws NullPointerException {
		boolean result = false ;
		try {
			for(Mobile i :this.ListMobile) {
				if(i.getProduct_id() == m.getProduct_id()) {
					this.ListMobile.remove(i);
					result = true; 
					break; 
				}
			}
			return result ;
		}catch( NullPointerException ex) {
			ex.getStackTrace();
			return false;
		}
	}

	public ArrayList<Mobile> searchMobile(String name)  throws NullPointerException{
		ArrayList<Mobile> results = new  ArrayList<>() ; 
		try { 
			this.ListMobile.forEach(go->{
				if(go.getProduct_name().contains(name)) {
					results.add(go);
				}
			});
			return results;
		}catch( NullPointerException ex) {
			ex.getStackTrace();
			return null;
		}
	}

	@Override
	public double getTotalStorage() throws NullPointerException{
		double result = 0  ;
		try {
			// TODO Auto-generated method stub
			for(Mobile i : this.ListMobile) {
				result += i.getTotalPrice() ;
			}
			return result ;
		}catch( NullPointerException ex) {
			ex.getStackTrace();
			return 0.0;
		}
	}
}
