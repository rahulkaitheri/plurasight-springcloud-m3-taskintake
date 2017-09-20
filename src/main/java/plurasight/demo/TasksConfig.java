package plurasight.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TasksConfig {
	
	@Bean
	public TaskProcessor taskProcessor() {
		return new TaskProcessor();
	}

}
