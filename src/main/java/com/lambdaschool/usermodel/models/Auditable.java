package com.lambdaschool.usermodel.models;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
abstract class Auditable {

    @CreatedBy
    protected String createdby;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date createddate;

    @LastModifiedBy
    protected String lastmodifiedby;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date lastmodifieddate;
}
