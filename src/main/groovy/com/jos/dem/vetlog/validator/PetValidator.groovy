package com.jos.dem.vetlog.validator

import org.springframework.validation.Validator
import org.springframework.validation.Errors
import org.springframework.stereotype.Component
import org.springframework.beans.factory.annotation.Autowired

import com.jos.dem.vetlog.command.PetCommand

@Component
class PetValidator implements Validator {

  @Override
  boolean supports(Class<?> clazz) {
    PetCommand.class.equals(clazz)
  }

  @Override
  void validate(Object target, Errors errors) {
    PetCommand petCommand = (PetCommand) target
  }
}
