package com.labor.spring.core;

import java.io.FileNotFoundException;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.labor.common.constants.CommonConstants;
import com.labor.common.util.StringUtil;
import com.labor.common.util.TokenUtil;
import com.labor.spring.base.BaseProperties;
import com.labor.spring.constants.WebConstants;
import com.labor.spring.core.api.fingerprint.FingerprintServiceIntf;
import com.labor.spring.core.api.sysconfig.SysconfigConstants;
import com.labor.spring.core.api.sysconfig.SysconfigServiceIntf;
import com.labor.spring.core.api.user.UserServiceIntf;
import com.labor.spring.core.entity.User;
import com.labor.spring.util.WebUtil;

@Component
@Order(value = 1)
public class StarterRunner implements ApplicationRunner {
	
	@Autowired
	private SysconfigServiceIntf sysconfigService;
	@Autowired
	private FingerprintServiceIntf fingerprintService;
	@Autowired
	private BaseProperties baseProperties;
	
	@Override
    public void run(ApplicationArguments args) throws Exception {
		LogManager.getLogger().info("*****StarterRunner init service*****:");
		
		//init sysconfig
		sysconfigService.initialization();
		
		fingerprintService.deleteOnlineSession();
		
		GlobalInfo.CONTEXT_PATH = baseProperties.CONTEXT_PATH;

    }
}