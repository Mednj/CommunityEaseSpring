package spring.pfa.g4.CommuteEase.service;

import spring.pfa.g4.CommuteEase.model.Agence;
import spring.pfa.g4.CommuteEase.model.Bus;

import java.util.List;

public interface BusService {

    public void saveBus(Bus bus);

    public List<Bus> getAllBus();
    public Bus getBusById(int id);

    public void DeleteBusById(int id);
}
