package com.elsevier.eols.provisioning.service;

import org.springframework.stereotype.Service;

import com.elsevier.eols.provisioning.model.User;

/**
 * Provision a user
 */
@Service
public class ProvisioningServiceImpl implements ProvisioningService {

	@Override
	public User getUser(User user) {
		return user;
	}

	@Override
	public User AddUser(User user) {
		return user;
	}

	@Override
	public void removeUser(User user) {

	}
}
