public class MSIManufacturer extends Company{
    @Override
    protected IComponent createMonitor() {
        return new MsiMonitor();
    }

    @Override
    protected IComponent createGPU() {
        return new MsiGpu();
    }
}
