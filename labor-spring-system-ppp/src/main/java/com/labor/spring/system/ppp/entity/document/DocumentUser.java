package com.labor.spring.system.ppp.entity.document;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.labor.spring.base.AbstractEntity;
@Entity
@Table(name = "tbl_doc_user")
public class DocumentUser extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = -7087189796104482109L;
	@Id
    @GeneratedValue 
    @Column(name="dusr_id")
    private Integer id;
	
    @Column(name="doc_id")
    private Integer docId;
	
    @Column(name="user_id")
    private Integer userId;
    
    @Column(name="user_name")
    private String name; 

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDocId() {
		return docId;
	}

	public void setDocId(Integer docId) {
		this.docId = docId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
    
}