package com.feature.PartyMaintenance.service;

import java.util.List;

import com.feature.PartyMaintenance.bean.PartyBean;

public interface PartyService
{
 
 public PartyBean getParty(int id);
 public List<PartyBean> getAllParties();
 public List<PartyBean> addParty(PartyBean bean);
 public PartyBean updateParty(PartyBean bean);

   
   
}
