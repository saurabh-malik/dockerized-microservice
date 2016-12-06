/**
 * 
 */
package com.gl.docker.microservice.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.GsonBuilder;
import com.gl.docker.microservice.config.MicroserviceConfig;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author sorabhkumar.sahu
 *
 */
@Validated
@RestController
@RequestMapping("/api/Demo")
@Api("Demo Controller for dockerization")
public class DemoController {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);


	@Autowired
	private MicroserviceConfig config;


	/**
	 * @param wfType
	 * @param tenantId
	 * @param projectId
	 * @param jsonBody
	 * @return
	 */
	@ApiOperation(value = "Mocked API for test", notes = "Mocked API")
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Map<String, String>> test(@RequestParam String message) {
		LOGGER.info("Controller processInit !");
		Map<String, String> response = new HashMap<>();
		response.put("message", "Hi this is mocked response for your message - " + message);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}


}
