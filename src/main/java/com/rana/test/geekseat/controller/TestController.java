/**
 * 
 */
package com.rana.test.geekseat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rana.test.geekseat.model.VillagerData;
import com.rana.test.geekseat.model.VillagerDataList;
import com.rana.test.geekseat.service.TestService;

/**
 * @author ranadewadatta
 *
 */

@RestController
@RequestMapping("/api")
public class TestController {

	@Autowired
	TestService testService;

	@PostMapping(value = "/kill", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<String> findAvgKillPeople(@RequestBody VillagerData person) {
		String result = null;
		try {
			if (person.getAgedeath() < 1) {
				result = "return -1";
			} else {
				result = testService.findKillPeople(person);

			}
			return new ResponseEntity<>(result, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
