package com.feature.PartyMaintenance.bean;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;


public class PartyBean
{
   @Size(max=2)
   private int contId;
   private String name;
   @NotBlank
   private String email;
   @Past
   private Date dob;
   @NumberFormat
   private String contact;
   public int getContId()
   {
      return contId;
   }
   public void setContId(int contId)
   {
      this.contId = contId;
   }
   public String getName()
   {
      return name;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public String getEmail()
   {
      return email;
   }
   public void setEmail(String email)
   {
      this.email = email;
   }
   public Date getDob()
   {
      return dob;
   }
   public void setDob(Date dob)
   {
      this.dob = dob;
   }
   public String getContact()
   {
      return contact;
   }
   public void setContact(String contact)
   {
      this.contact = contact;
   }
   public PartyBean(@Size(max = 2) int contId, String name, @Email String email, @Past Date dob, String contact)
   {
      super();
      this.contId = contId;
      this.name = name;
      this.email = email;
      this.dob = dob;
      this.contact = contact;
   }

}
