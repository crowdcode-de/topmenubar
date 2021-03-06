/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package de.interseroh.tmb.applauncher.server.controller;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.interseroh.tmb.applauncher.shared.json.TargetApplication;

/**
 * Test for testing ApplauncherConfiguration controller
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplauncherConfigurationControllerDefaultTest {

	private static final String PORTAL_URL = "http://www.google.de";

	private static final int ITEMS_AMOUNT = 5;

	@Autowired
	private ApplauncherConfigurationController appConfig;

	@Test
	public void testApplauncherJsonConfiguration() throws Exception {
		List<TargetApplication> configuration = appConfig.getConfiguration();
		Assert.assertNotNull(configuration);
		Assert.assertEquals(ITEMS_AMOUNT, configuration.size());
		Assert.assertEquals(PORTAL_URL,
				configuration.get(0).getApplicationURL());
	}

}
