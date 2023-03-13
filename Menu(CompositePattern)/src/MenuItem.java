
public class MenuItem implements MenuComponent{
	private String name;
	private String description;
	
	public MenuItem(String name, String desc) {
		this.name = name;
		this.description = desc;
	}
	
	@Override
	public void printConcent() {
		System.out.println("-- name: " + name + "; desc: " + description);
	}

	@Override
	public void addChild(MenuComponent c) {
		throw new UnsupportedOperationException("This is a Left node, cannot add Child");
		
	}

	@Override
	public void removeChild(MenuComponent c) {
		throw new UnsupportedOperationException("This is a Left node, cannot remove Child");
		
	}

	@Override
	public MenuComponent getChild(int index) {
		throw new UnsupportedOperationException("This is a Left node, cannot get Child");
	}
	
}
