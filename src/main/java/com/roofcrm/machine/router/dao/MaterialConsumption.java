package com.roofcrm.machine.router.dao;

import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class MaterialConsumption extends AbstractEntity{

    private Long orderId;

    private String machineIp;

    private Long machineId;

    private Long materialId;

    private Double length ;

    @Column(name = "created")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @Column(name = "modified")
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;

}
