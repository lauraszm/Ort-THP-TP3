package ejercicio2;

import java.util.ArrayList;

public class Compania {
	private ArrayList<Area> areas;
	
	public Compania() {
		this.areas = new ArrayList<>();
	}
	
	public boolean agregarArea(Area area) {
		return this.areas.add(area);
	}
}
