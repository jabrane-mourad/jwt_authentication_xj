package ma.gde.service;

import ma.gde.entities.User;
import ma.gde.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByNom(username);
		Collection<GrantedAuthority> authorities=new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(user.getRole()));

		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		System.out.println(authorities);
		return new org.springframework.security.core.userdetails.User(user.getNom(), user.getPassword(),
				authorities);

	}
	public User save(User user) {
		user.setPassword(bcryptEncoder.encode(user.getPassword()));
		//user.setDateNaissance(new Date());
		return userRepository.save(user);
	}
}