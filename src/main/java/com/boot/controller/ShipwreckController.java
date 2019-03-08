package com.boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Shipwreck;

/**
 * All the end points start with api/v1, so put that on class level
 * @author bandana.singh
 *
 */
@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {
	
	/**
	 * Getter method for all the list of Shipwrecks.
	 * Method level RequestMapping values will be appende to the class level value
	 * @return
	 */
	@RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
	public List<Shipwreck> list() {
		return ShipwreckStub.list();
	}
	/**
	 * Post method for adding a shipwreck
	 * @param shipwreck
	 * @return
	 */
	@RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck shipwreck) {
		return ShipwreckStub.create(shipwreck);
	}
	/**
	 * Get a shipwreck based on id
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
	public Shipwreck get(@PathVariable Long id) {
		return ShipwreckStub.get(id);
	}
	/**
	 * Update a Shipwreck data
	 * @param id
	 * @param shipwreck
	 * @return
	 */
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
	public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
		return ShipwreckStub.update(id, shipwreck);
	}
	/**
	 * Delete a Shipwreck from list
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "shiwrecks/{id}", method = RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable Long id) {
		return ShipwreckStub.delete(id);
	}
}
