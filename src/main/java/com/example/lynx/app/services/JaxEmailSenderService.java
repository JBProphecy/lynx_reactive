package com.example.lynx.app.services;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.lynx.app.wrapper.email.JaxAbstractEmail;
import com.example.lynx.core.c.utility.types.JaxString;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
@AllArgsConstructor
public class JaxEmailSenderService
{
  private final JavaMailSender mailSender;

  public Mono<Void> sendSimpleEmail(JaxAbstractEmail to, JaxAbstractEmail from, String subject, String body) {
    return Mono.<Void>fromRunnable(() -> {
      SimpleMailMessage message = new SimpleMailMessage();
      message.setTo(JaxAbstractEmail.extract(to));
      message.setFrom(JaxAbstractEmail.extract(from));
      message.setSubject(JaxString.require(subject));
      message.setText(JaxString.require(body));
      this.mailSender.send(message);
    }).subscribeOn(Schedulers.boundedElastic());
  }
}
