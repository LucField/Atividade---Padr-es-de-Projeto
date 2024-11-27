public class ElectricTransportFactory extends TransportFactory {

    @Override
    public Transport createElectricBike() {
        ElectricBike eb = new ElectricBike();
        return eb;
    }

    @Override
    public Transport createElectricScooter() {
        ElectricScooter es = new ElectricScooter();
        return es;
    }

    // Sem uso
    public Transport createBicycle() {
        return null;
    }

    public Transport createRollerSkates() {
        return null;
    }
    
    public Transport createSkateboard() {
        return null;
    }

  
}
