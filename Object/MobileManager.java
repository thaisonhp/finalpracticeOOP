package Object;

import java.util.ArrayList;

public interface MobileManager {
	public boolean addMobile(Mobile m);
	public boolean delMobile(Mobile m); 
	public ArrayList<Mobile> searchMobile(String name);
	public double getTotalStorage();
}
