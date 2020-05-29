package com.labor.spring.feign.auth;

import java.util.Set;

public interface AuthPermissionService {

	
	public Set<String> findUserPermissions(Long userid, String username);
	
	public Set<String> findUserPermissions(Long userid, String username, String type);
}
