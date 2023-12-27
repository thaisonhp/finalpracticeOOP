package Object;

import java.util.ArrayList;

public interface MobileManager {
	public boolean addMobile(Mobile m) throws NullPointerException;
	public boolean delMobile(Mobile m)throws NullPointerException; 
	public ArrayList<Mobile> searchMobile(String name)throws NullPointerException;
	public double getTotalStorage()throws NullPointerException;
}
