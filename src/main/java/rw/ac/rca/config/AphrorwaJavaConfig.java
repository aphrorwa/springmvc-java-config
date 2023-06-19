/**
 * 
 */
package rw.ac.rca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author Aphrodice Rwagaju
 *
 */
@Configuration
@ComponentScan({"rw.ac.rca.controller"})
@EnableWebMvc//Using Java Annotation
public class AphrorwaJavaConfig {
	
	@Bean
	//This is not mandatory if the page is outside WEB-INF
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setPrefix("/WEB-INF/");
		irvr.setSuffix(".jsp");
		return irvr;
		
	}

}
