package com.elsevier.eols.provisioning.service;

import com.elsevier.eols.provisioning.model.User;

/**
 * Created by txiong on 1/15/2015.
 */
public interface ProvisioningService {
	/**
	 * Return a user based on the fields sent.
	 * 
	 * @param {@link
	 * 			com.elseveir.eols.provisioning.model.User}
	 * @return {@link com.elsevier.eols.provisioning.model.User}
	 */
	public User getUser(User user);

	/**
	 * Add (Provision) a user
	 * 
	 * @param {@link
	 * 			com.elseveir.eols.provisioning.model.User}
	 * @return {@link com.elsevier.eols.provisioning.model.User}
	 */
	public User AddUser(User user);

	/**
	 * Remove a user from the system.
	 * 
	 * @param {@link
	 * 			com.elseveir.eols.provisioning.model.User}
	 */
	public void removeUser(User user);
}
