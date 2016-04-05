package com.elsevier.eols.provisioning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elsevier.eols.provisioning.model.User;
import com.elsevier.eols.provisioning.service.ProvisioningService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Created by txiong on 1/15/2015.
 */
@RestController
@RequestMapping("/api/provision")
@Api(value = "Provisioning", description = "Provisioning Users.")
public class ProvisioningController {
	private ProvisioningService provisioningService;

	@Autowired
	public void setBookService(ProvisioningService provisioningService) {
		this.provisioningService = provisioningService;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "POST", notes = "Provision a User.")
	public ResponseEntity<User> provisionUser(@RequestBody(required = true) User user) {
		ResponseEntity<User> response;
		HttpStatus responseCode = HttpStatus.OK;
		HttpHeaders headers = new HttpHeaders();
		User result = provisioningService.AddUser(user);

		response = new ResponseEntity<User>(result, headers, responseCode);
		return response;
	}

	@RequestMapping(method = RequestMethod.DELETE)
	@ApiOperation(value = "DELETE", notes = "Remove a User.")
	public ResponseEntity<Void> removeUser(@RequestBody(required = true) User user) {
		ResponseEntity<Void> response;
		HttpStatus responseCode = HttpStatus.NO_CONTENT;
		HttpHeaders headers = new HttpHeaders();
		
		provisioningService.removeUser(user);

		response = new ResponseEntity<Void>(headers, responseCode);

		return response;
	}

}
