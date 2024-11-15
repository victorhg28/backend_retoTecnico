package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.BusModel;
import com.example.demo.repositories.IBusRepository;

@Service
public class BusService {
    @Autowired
    IBusRepository busRepository;

    public ArrayList <BusModel> getBuses(){
        return (ArrayList<BusModel>) busRepository.findAll();
    }

    public BusModel saveBus (BusModel bus){
        return busRepository.save(bus);
    }

    public Optional<BusModel> getById(Long id){
        return busRepository.findById(id);
    }

    public BusModel updateById(BusModel request, Long id){
        BusModel bus = busRepository.findById(id).get();
        
        //bus.setMarca(request.getMarca());
        bus.setCaracteristicas(request.getCaracteristicas());
        bus.setPlaca(request.getPlaca());
        
        return bus;
    }

    public Boolean deleteBus(Long id){
        try{
            busRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
