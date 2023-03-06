package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Button btn = new Button();
        List list = new List();
        Mediator mediator = new ConcreteMediator(btn, list);
        btn.setMediator(mediator);
        list.setMediator(mediator);

        btn.changed();
        list.changed();

    }
}

abstract class Component{
    // 持有中介者引用，通过调用中介者实现需求委派
    private Mediator mediator;
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public void changed() {
        System.out.println(this + " changed");
        mediator.componentChanged(this);
    }

    // 定义子类的接口
    public abstract void update();
}

abstract class Mediator{
    public abstract void componentChanged(Component component);
}

class ConcreteMediator extends Mediator {
    private Button button;
    private List list;

    ConcreteMediator (Button button, List list) {
        this.button = button;
        this.list = list;
    }

    @Override
    public void componentChanged(Component component) {
        if(component == button){
            list.update();
        }
        if(component == list) {
            button.update();
        }
    }
}

class Button extends Component {
    public String id = "btn";

    @Override
    public void update() {
        //nothing here
        System.out.println("click button");
    }

    public void click() {

    }
}

class List extends Component {
    public String id = "list";

    @Override
    public void update() {
        System.out.println("List增加一项");
    }
}
