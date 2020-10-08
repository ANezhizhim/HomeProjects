package Lesson5.Task2;

public class RAMFactory extends ComponentFactory{
    @Override
    public Component createComponentPC (){
        return new RAM("","","","",0);
    }

}
