
public class Main {
	public static void main(String[] args) {
		MenuComponent m1 = new MenuComposite("一级菜单", "/");
		MenuComposite m2_1 = new MenuComposite("二级菜单1", "/2-1");
		MenuComposite m2_2 = new MenuComposite("二级菜单2", "/2-2");
		MenuComposite m3_1 = new MenuComposite("三级菜单1", "/3-1");
		MenuComponent i1 = new MenuItem("汉堡", "好吃！");
		MenuComponent i2 = new MenuItem("薯条", "好吃！");
		MenuComponent i3 = new MenuItem("可乐", "好吃！");
		MenuComponent i4 = new MenuItem("牛奶", "好吃！");
		MenuComponent i5 = new MenuItem("饼干", "好吃！");
		
		m2_1.addChild(i5);
		m2_1.addChild(i4);
		
		m2_2.addChild(i3);
		m2_2.addChild(i2);
		
		m3_1.addChild(i1);
		
		m1.addChild(m2_1);
		m1.addChild(m2_2);

		m2_1.addChild(m3_1);
		
		m1.printConcent();
		
	}
}
