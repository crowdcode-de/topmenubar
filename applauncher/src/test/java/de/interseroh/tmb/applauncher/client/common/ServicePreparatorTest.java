/*
 *
 *  * Licensed to the Apache Software Foundation (ASF) under one
 *  * or more contributor license agreements.  See the NOTICE file
 *  * distributed with this work for additional information
 *  * regarding copyright ownership.  The ASF licenses this file
 *  * to you under the Apache License, Version 2.0 (the
 *  * "License"); you may not use this file except in compliance
 *  * with the License.  You may obtain a copy of the License at
 *  *
 *  *  http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing,
 *  * software distributed under the License is distributed on an
 *  * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  * KIND, either express or implied.  See the License for the
 *  * specific language governing permissions and limitations
 *  * under the License.
 *
 */

package de.interseroh.tmb.applauncher.client.common;

import org.fusesource.restygwt.client.RestServiceProxy;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import com.google.gwtmockito.GwtMockitoTestRunner;

import de.interseroh.tmb.applauncher.client.domain.AppConfigurationClient;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

@RunWith(GwtMockitoTestRunner.class)
public class ServicePreparatorTest {

	private ServicePreparator servicePreparator;

	@Mock(extraInterfaces = RestServiceProxy.class)
	private AppConfigurationClient appConfigurationClient;

	@Before
	public void setUp() throws Exception {
		servicePreparator = new ServicePreparator(appConfigurationClient);
	}

	@Test
	public void testGettingAppConfigurationClient() throws Exception {
		servicePreparator.prepare("http://localhost:9014/applauncher");
		assertThat(servicePreparator.getAppConfigurationClient(),
				is(notNullValue()));
	}
}