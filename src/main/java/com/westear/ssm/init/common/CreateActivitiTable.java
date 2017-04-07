package com.westear.ssm.init.common;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;

public class CreateActivitiTable {

	public static void main(String[] args){
		ProcessEngine processEngine = ProcessEngineConfiguration
				.createProcessEngineConfigurationFromResource("configs/activiti/activiti-config.xml","processEngineConfiguration")
				.buildProcessEngine();
		System.out.println("processEngine:"+processEngine);
	}
}
