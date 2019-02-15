package newpackage;

import java.util.ArrayList;

public class Storage {

	private int maxSpace = 5;
	

	

	private ArrayList<Box> boxlist = new ArrayList<>();
	
	
	public int getMaxSpace() {
		return maxSpace;
	}

	public void addBox(Box box) {
		if(!inList(box.getId()))
			boxlist.add(box);
	
	}
	
	public boolean inList(int id) {
		
		for (Box box : boxlist) {
			if(box.getId()==id)
			return true;
		}
		return false;
	}

	public void removeBox(int id) {
		boxlist.remove(id);
	}

	
	
	public ArrayList<Box> getBoxlist() {
		return boxlist;
	}

	public boolean freeSpace() {
		return maxSpace == boxlist.size();
	}

	
	
}
