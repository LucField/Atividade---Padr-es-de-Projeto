public class HumanPoweredTransportFactory extends TransportFactory{

    @Override
    public Transport createBicycle() {
        Bicycle bi = new Bicycle();
        return bi;
    }

    @Override
    public Transport createRollerSkates() {
        RollerSkates rs = new RollerSkates();
        return rs;
    }
    
    @Override
    public Transport createSkateboard() {
        Skateboard sb = new Skateboard();
        return sb;
    }

    // Sem uso
    public Transport createElectricBike() {
        return null;
    }


    public Transport createElectricScooter() {
        return null;
    }

}
