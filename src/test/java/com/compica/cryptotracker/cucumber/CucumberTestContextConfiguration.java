package com.compica.cryptotracker.cucumber;

import com.compica.cryptotracker.JcryptotrackerApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = JcryptotrackerApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
