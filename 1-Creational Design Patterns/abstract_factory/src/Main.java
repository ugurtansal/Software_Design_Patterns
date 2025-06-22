//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Company c1=new AsusManufacturer();
        IComponent asusMonitor=c1.createMonitor();

        asusMonitor.assemble();

        Company c2=new MSIManufacturer();
        IComponent msiGpu=c2.createGPU();
        msiGpu.assemble();

    }
}