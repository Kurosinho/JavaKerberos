package bus.kerberosproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.security.kerberos.client.KerberosRestTemplate;
import org.springframework.web.client.RestTemplate;

public class KerberosConfig extends RestTemplate {

    @Value("${app.user-principal:adminprotocol/localhost@EXAMPLE.COM}")
    private String principal;

    @Value("${app.keytab-location}")
    private String keytabLocation;

    @Bean
    public KerberosRestTemplate restTemplate() {
        return new KerberosRestTemplate(keytabLocation, principal);
    }
}
