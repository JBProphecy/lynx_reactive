package com.example.lynx.app.services;

import org.springframework.stereotype.Service;

import com.example.lynx.app.constants.JaxAppConstants;
import com.example.lynx.app.wrapper.email.JaxAccountEmail;
import com.example.lynx.app.wrapper.email.JaxEmail;
import com.example.lynx.app.wrapper.opaque.token.value.JaxEmailVerificationToken;
import com.example.lynx.back.packages.generation.wrapper.output.JaxEmailVerificationCode;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public final class JaxAccountEmailVerificationService {
  
  private final JaxEmailSenderService jaxEmailSenderService;

  private static final JaxEmail FROM = JaxEmail.assign("jackbpiatt@gmail.com");

  public boolean checkDoEmailVerificationCodesMatch(JaxEmailVerificationCode c1, JaxEmailVerificationCode c2) {
    return c1.equals(c2);
  }

  public Mono<Void> sendVerificationCodeEmail(JaxAccountEmail to, JaxEmailVerificationToken emailVerificationToken, JaxEmailVerificationCode emailVerificationCode) {
    String emailVerificationLinkString = "https://google.com?token=" + JaxEmailVerificationToken.extract(emailVerificationToken);
    return this.jaxEmailSenderService.sendSimpleEmail(
      JaxAccountEmail.require(to),
      JaxEmail.require(FROM),
      "Account Registration - Verification Code",
      "Your verification code is: " + JaxEmailVerificationCode.extract(emailVerificationCode) + "\n\n" +
      "This code will expire in " + JaxAppConstants.EMAIL_VERIFICATION_WINDOW_MINUTES.toMinutes() + " minutes.\n\n" +
      "You can proceed with the verification process on the original page or on a new page through this link: " + emailVerificationLinkString
    );
  }
  
  public Mono<Void> sendEmailUnavailableEmail(JaxAccountEmail to) {
    return this.jaxEmailSenderService.sendSimpleEmail(
      JaxAccountEmail.require(to),
      JaxEmail.require(FROM),
      "Account Registration - Email Unavailable",
      "This email is already registered to an account.\n\n" +
      "If you did not attempt to register an account with this email, please be aware that someone else did."
    );
  }
}
