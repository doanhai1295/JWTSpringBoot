
package com.apps.model;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author doanhai
 *
 */
public enum Role implements GrantedAuthority {
	ROLE_ADMIN, ROLE_USER;

	public String getAuthority() {
		return name();
	}
}
