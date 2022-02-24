package com.feature.PartyMaintenance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feature.PartyMaintenance.bean.PartyBean;
import com.feature.PartyMaintenance.service.PartyServiceImpl;

@RestController
public class PartyController
{
   @Autowired
   PartyServiceImpl partyImpl;
   @GetMapping("/getParty/{id}")
   public PartyBean getParty(@PathVariable int id)
   {
      
      return partyImpl.getParty(id);
   }
   @GetMapping("/getAllParties")
   public List<PartyBean> getAllParties()
   {
      
      return partyImpl.getAllParties();
   }

   @PostMapping("/addParty")
   public List<PartyBean> addParty(@RequestBody PartyBean beanVal)
   {
      return  partyImpl.addParty(beanVal);

   }
   @PostMapping("/updateParty")
   public PartyBean updateParty(@RequestBody PartyBean beanVal)
   {
      return partyImpl.updateParty(beanVal);
   }
   @GetMapping("/deleteParty")
   public String deleteParty()
   {
      return "Delete Party Called";
   }
}
