package ma;

import ma.gde.entities.User;
import ma.gde.repository.UserRepository;
import ma.gde.service.JwtUserDetailsService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class SpringBootJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtApplication.class, args);
	}

/*	@Bean
	CommandLineRunner start(JwtUserDetailsService userRepository) {
		return args -> {
			User user=new User(null,"jabrane","mourad",new Date(),"xjabrane@gmail.com","ADMIN", "xj123");
			userRepository.save(user);


		};
	}*/

}
