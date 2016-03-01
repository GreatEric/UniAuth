package com.dianrong.common.uniauth.common.cons;

/**
 * Created by Arc on 26/1/16.
 */
public interface AppConstants {
    Byte ZERO_Byte = (byte)0;
    Byte ONE_Byte = (byte)1;
    byte ZERO_byte = (byte)0;
    byte ONE_byte = (byte)1;
    String GRP_ROOT = "GRP_ROOT";
    byte MAX_AUTH_FAIL_COUNT = 10;
    int MAX_PASSWORD_VALID_MONTH = 2;
    String DOMAIN_CODE_TECHOPS = "techops";
    
	String ZK_DOMAIN_PREFIX = "domains.";
	String SERVICE_LOGIN_POSTFIX = "/login/cas";
	String CAS_CAPTCHA_SESSION_KEY = "CAS_CAPTCHA_SESSION_KEY";
	
	String ROLE_ADMIN = "ROLE_ADMIN";
	String ROLE_SUPER_ADMIN = "ROLE_SUPER_ADMIN";
}