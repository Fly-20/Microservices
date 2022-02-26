package com.feature.PartyMaintenance.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.feature.PartyMaintenance.bean.PartyBean;

@Service
public class PartyServiceImpl implements PartyService
{
   private static List<PartyBean> users = new ArrayList<PartyBean>();
int count=2;
   static {

      users.add(new PartyBean(1,"Nidhi","nsingla152@gmail.com", new Date(), "09898"));
      users.add(new PartyBean(2,"Umang","umd@gmail.com", new Date(), "09898"));

   }
   @Override
   public PartyBean getParty(int id)
   {
     for(PartyBean bean: users)
     {
        if(bean.getContId()==id)
           return bean;
     }
      return null;
   }
   @Override
   public List<PartyBean> getAllParties()
   {
      return users;
   }
   @Override
   public List<PartyBean> addParty(PartyBean bean)
   {
     
      if(bean.getContId()==0)
      {
         bean.setContId(++count);
      }
      users.add(bean);
      return users;
   }
   @Override
   public PartyBean updateParty(PartyBean bean)
   {

      for(PartyBean partybean: users)
      {
         if(partybean.getContId()==bean.getContId())
         {
            partybean.setContact(bean.getContact());
            partybean.setName(bean.getName());
            partybean.setEmail(bean.getEmail());

            return partybean;
         }
      }
      throw new FailedToUpdate("Invalid data");
   }

}
