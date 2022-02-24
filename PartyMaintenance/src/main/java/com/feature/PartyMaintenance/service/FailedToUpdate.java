package com.feature.PartyMaintenance.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.METHOD_FAILURE)
public class FailedToUpdate extends RuntimeException
{

   public FailedToUpdate(String message)
   {
      super(message);
   }

}
