/*
 * Copyright 2015-2023 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package ru.example.projects.firstproject;

import com.microsoft.playwright.Page;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.example.framework.testclasses.BaseWebTest;

import java.nio.file.Paths;

import static ru.example.framework.allure.AllureUtil.logToAllure;
import static ru.example.framework.allure.AllureUtil.makeScreenshot;

@DisplayName("Первый suite")
class FirstTest extends BaseWebTest {

	@Test
	@DisplayName("1 : Тест первый")
	@Description("Описание")
	void simpleTest() {
		page.navigate("https://playwright.dev/");
		//page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
		logToAllure("just test step");
		makeScreenshot(page,"1");
	}

	@Test
	@DisplayName("2 : Тест второй")
	@Description("Описание")
	void simpleTest2() {
		page.navigate("https://playwright.dev/");
		//page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
	}
}
