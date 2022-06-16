package hw6.task_2_try_variant2;

public class GearBoxSteer implements GearBox {

    @Override
    public void upGear() {
        System.out.println("gearUpped");
    }

    @Override
    public void downGear() {
        System.out.println("gearDowned");
    }
}
