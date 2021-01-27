package com.roofcrm.machine.router.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@MappedSuperclass
@Getter
@Setter
public abstract class AbstractEntity implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id", unique = true, nullable = false)
	private Long id;


	public boolean isNew() {
		return id == null;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AbstractEntity(Long id) {
		this.id = id;
	}

	public AbstractEntity() {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AbstractEntity that = (AbstractEntity) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
