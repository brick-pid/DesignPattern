
public class Main {
	public static void main(String[] args) {
		MenuComponent m1 = new MenuComposite("һ���˵�", "/");
		MenuComposite m2_1 = new MenuComposite("�����˵�1", "/2-1");
		MenuComposite m2_2 = new MenuComposite("�����˵�2", "/2-2");
		MenuComposite m3_1 = new MenuComposite("�����˵�1", "/3-1");
		MenuComponent i1 = new MenuItem("����", "�óԣ�");
		MenuComponent i2 = new MenuItem("����", "�óԣ�");
		MenuComponent i3 = new MenuItem("����", "�óԣ�");
		MenuComponent i4 = new MenuItem("ţ��", "�óԣ�");
		MenuComponent i5 = new MenuItem("����", "�óԣ�");
		
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
