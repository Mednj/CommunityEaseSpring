package spring.pfa.g4.CommuteEase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.pfa.g4.CommuteEase.model.Agence;
import spring.pfa.g4.CommuteEase.model.Bus;
import spring.pfa.g4.CommuteEase.repository.BusRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BusServiceImpl implements BusService{

        @Autowired
        private BusRepository busRepository;


        @Override
        public void saveBus(Bus bus){
            this.busRepository.save(bus);

        }

        @Override
        public List<Bus> getAllBus() {
            return busRepository.findAll();
        }


        @Override
        public Bus getBusById(int id){
            return busRepository.findById(id).get();
        }

        @Override
        public void DeleteBusById(int id){
            this.busRepository.deleteById(id);

        }


    }
