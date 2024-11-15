package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.BusModel;
import com.example.demo.services.BusService;

@RestController
@RequestMapping("/bus")
public class BusController {
    @Autowired
    private BusService busService;
    
    @GetMapping
    public ArrayList<BusModel> getBuses(){
        return this.busService.getBuses();
    }

    @PostMapping
    public BusModel saveBus(@RequestBody BusModel bus){
        return this.busService.saveBus(bus);
    }

    @GetMapping(path = "/{id}")
    public Optional<BusModel> getBusById(@PathVariable Long id){
        return this.busService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public BusModel updateBusById(@RequestBody BusModel request, @PathVariable("id") Long id){
        return this.busService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.busService.deleteBus(id);
        
        if(ok){
            return "bus con id: "+ id +" eliminado!";
        } else{
            return "Error, no se pudo eliminar bus con id:"+id;
        }
    }
}
