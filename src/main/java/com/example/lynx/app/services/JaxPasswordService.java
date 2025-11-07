package com.example.lynx.app.services;

import java.util.function.Function;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.lynx.app.wrapper.password.JaxAbstractActualPassword;
import com.example.lynx.app.wrapper.password.JaxAbstractHashedPassword;
import com.example.lynx.app.wrapper.password.JaxActualAccountPassword;
import com.example.lynx.app.wrapper.password.JaxActualProfilePassword;
import com.example.lynx.app.wrapper.password.JaxHashedAccountPassword;
import com.example.lynx.app.wrapper.password.JaxHashedProfilePassword;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public final class JaxPasswordService
{
  private final PasswordEncoder passwordEncoder;

  // public String hash(String actual) {
  //   JaxString.require(actual);
  //   return this.passwordEncoder.encode(actual);
  // }

  // public boolean compare(String actual, String hashed) {
  //   JaxString.require(actual);
  //   JaxString.require(hashed);
  //   return this.passwordEncoder.matches(actual, hashed);
  // }

  public <A extends JaxAbstractActualPassword, H extends JaxAbstractHashedPassword> H hash(A actual, Function<String, H> function) {
    return function.apply(this.passwordEncoder.encode(A.extract(actual)));
  }

  public <A extends JaxAbstractActualPassword, H extends JaxAbstractHashedPassword> boolean compare(A actual, H hashed) {
    return this.passwordEncoder.matches(A.extract(actual), H.extract(hashed));
  }

  public JaxHashedAccountPassword hash(JaxActualAccountPassword actual) {
    return this.hash(actual, JaxHashedAccountPassword::assign);
  }

  public JaxHashedProfilePassword hash(JaxActualProfilePassword actual) {
    return this.hash(actual, JaxHashedProfilePassword::assign);
  }
}
