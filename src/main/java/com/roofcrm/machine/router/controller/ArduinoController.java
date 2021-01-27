package com.roofcrm.machine.router.controller;

import com.roofcrm.machine.router.dao.MaterialConsumption;
import com.roofcrm.machine.router.service.MaterialConsumptionService;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Log
public class ArduinoController {

   private final MaterialConsumptionService materialConsumptionService;

    public ArduinoController(MaterialConsumptionService materialConsumptionService) {
        this.materialConsumptionService = materialConsumptionService;
    }

    @PostMapping(path = "/encoderData")
    public ResponseEntity<String> materialWorkLength(@RequestBody MaterialConsumption materialConsumption) {
           materialConsumptionService.save(materialConsumption);
           log.info("Post Response  " + materialConsumption.toString());
           return new ResponseEntity<String>("Post Response", HttpStatus.OK);
    }



}
