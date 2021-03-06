/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.springframework.test.web.geb.pages

import org.springframework.test.web.mail.data.Message;

import geb.Page


/**
 * Represents the page that a {@link Message} is created on.
 *
 * @author Rob Winch
 *
 */
class CreateMessagePage extends Page {
	static at = { assert title == 'Messages : Create'; true }
	static url = 'messages/?form=1'
	static content =  {
		submit { $('input[type=submit]') }
		form { $('form') }
		errors(required:false) { $('label.error, .alert-error')?.text() }
	}
}