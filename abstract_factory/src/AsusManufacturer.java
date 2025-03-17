public class AsusManufacturer extends Company{
    @Override
   protected  IComponent createMonitor() {
        return new AsusMonitor();
    }

    @Override
    protected IComponent createGPU() {
        return new AsusGpu();
    }
}
