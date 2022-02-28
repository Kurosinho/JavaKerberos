package bus.kerberosproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.kerberos.authentication.sun.GlobalSunJaasKerberosConfig;

/**
 * <p>
 * <b> Additional Configuration for Kerberos. Specifically location of the
 * krb5.conf file This configuration must be in a separate configuration file
 * to the main kerberos config to prevent instantiation ordering issues</b>
 * </p>
 */

@Configuration
public class GlobalSecurityConfig {

    @Bean
    public GlobalSunJaasKerberosConfig globalSunJaasKerberosConfig() {
        GlobalSunJaasKerberosConfig globalConfig = new GlobalSunJaasKerberosConfig();
        globalConfig.setDebug(true);
        globalConfig.setKrbConfLocation("usr/local/kerby-2.0.1/conf/krb5.conf");
        return globalConfig;
    }
}
