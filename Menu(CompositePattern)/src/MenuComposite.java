import java.util.ArrayList;
import java.util.List;

public class MenuComposite implements MenuComponent{
	private List<MenuComponent> childrenList;
	private String name;
	private String description;
	
	public MenuComposite(String name, String desc) {
		this.name = name;
		this.description = desc;
		this.childrenList = new ArrayList<>();
	}

	@Override
	public void printConcent() {
		System.out.println("print content of " + name + " " + description);
		for(MenuComponent c : childrenList) {
			System.out.println("  |");
			System.out.print("  --");
			c.printConcent();
		}
	}

	@Override
	public void addChild(MenuComponent c) {
		this.childrenList.add(c);
		
	}

	@Override
	public void removeChild(MenuComponent c) {
		this.childrenList.remove(c);
		
	}

	@Override
	public MenuComponent getChild(int index) {
		return this.childrenList.get(index);
		
	}
	
}
