package com.project.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.bankapp.model.Logger;
import com.project.bankapp.service.LoggerService;

@RestController
public class LoggerController {
	@Autowired
	private LoggerService loggerService;

	// addLog
	public void addLog(Logger logger) {
		loggerService.addLog(logger);
	}

	// showLog
	@GetMapping("/account/{acctID}/logs")
	public Logger showLog(@PathVariable int acctID) {
		return loggerService.showLog(acctID);
	}

	public void deleteLog(int acctID) {
		loggerService.deleteLog(acctID);
	}
}

