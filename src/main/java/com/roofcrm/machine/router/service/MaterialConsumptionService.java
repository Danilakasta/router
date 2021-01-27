package com.roofcrm.machine.router.service;

import com.roofcrm.machine.router.dao.MaterialConsumption;
import com.roofcrm.machine.router.dao.repositories.MaterialConsumptionRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialConsumptionService implements CrudService<MaterialConsumption> {

    private final MaterialConsumptionRepository materialConsumptionRepository;

    public MaterialConsumptionService(MaterialConsumptionRepository materialConsumptionRepository) {
        this.materialConsumptionRepository = materialConsumptionRepository;
    }

    @Override
    public JpaRepository<MaterialConsumption, Long> getRepository() {
        return materialConsumptionRepository;
    }

    @Override
    public MaterialConsumption createNew() {
        return new MaterialConsumption();
    }

    @Override
    public List<MaterialConsumption> findAll() {
        return getRepository().findAll();
    }
}
