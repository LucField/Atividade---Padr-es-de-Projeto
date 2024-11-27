public abstract class TransportFactory {
    //Esforço humano
    abstract Transport createBicycle();
    abstract Transport createRollerSkates();
    abstract Transport createSkateboard();

    //Bateria
    abstract Transport createElectricBike();
    abstract Transport createElectricScooter();
}
