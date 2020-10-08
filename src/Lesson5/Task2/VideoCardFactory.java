package Lesson5.Task2;


public class VideoCardFactory extends  ComponentFactory{
    @Override
    public Component createComponentPC() {
        return new VideoCard("", "", "", "", CoolingType.Active);
    }

}
