/**
 * 
 */
package com.rana.test.geekseat.service;

import org.springframework.stereotype.Service;

import com.rana.test.geekseat.model.VillagerData;
import com.rana.test.geekseat.model.VillagerDataList;

 

/**
 * @author ranadewadatta
 *
 */
@Service
public interface TestService {

	String findKillPeople(VillagerData person);

}
