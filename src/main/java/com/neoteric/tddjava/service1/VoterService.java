package com.neoteric.tddjava.service1;

import com.neoteric.tddjava.model1.VoterApplication;
import com.neoteric.tddjava.model1.VoterId;

import java.util.UUID;

public class VoterService {
    public VoterId getvoterService (VoterApplication applicationDetails){
      VoterId voterId=null;
      if (applicationDetails.age>=18){
          voterId=new VoterId();
          voterId.constituency="waradanapet";
          voterId.fathername="sadanandam";
          voterId.voteridNumber="111"+ UUID.randomUUID().toString();
      }
      return voterId;
    }
}
