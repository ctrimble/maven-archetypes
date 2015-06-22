#parse("variables.vm")
package ${package};

import com.google.inject.Stage;
import com.hubspot.dropwizard.guice.GuiceBundle;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * ${command_name} entry point
 */
public class ${application_name} extends Application<${configuration_name}> {

  public static final String PASSPHRASE_ENV_VAR = "${passphrase_env}";
  public static final String COMMAND_NAME = "${command_name}";

  public static void main(String[] args) throws Exception {
    new ${application_name}().run(args);
  }
  
  protected GuiceBundle guiceBundle;
	  
	         public ${application_name}() {
	         }
	  
	         @Override
	         public String getName() {
	                 return COMMAND_NAME;
	         }
	  
	         @Override
	         public void initialize(Bootstrap<${configuration_name}> bootstrap) {
	        	    GuiceBundle.Builder<${configuration_name}> builder = GuiceBundle.<${configuration_name}> newBuilder()
	        	    	      .setConfigClass(${configuration_name}.class)
	        	    	      .enableAutoConfig(getClass().getPackage().getName());
	        	    builder.addModule(new ${module_name}());
	        	    
	        	    bootstrap.addBundle(guiceBundle = builder.build(Stage.DEVELOPMENT));	  
	         }
	  
	         @Override
	         public void run(${configuration_name} configuration, Environment environment)
	                         throws Exception {
	  
	         }
}
