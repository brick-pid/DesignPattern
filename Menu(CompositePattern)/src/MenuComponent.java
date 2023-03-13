
public interface MenuComponent {
	public void printConcent();
	public void addChild(MenuComponent c);
	public void removeChild(MenuComponent c);
	public MenuComponent getChild(int index);
}
