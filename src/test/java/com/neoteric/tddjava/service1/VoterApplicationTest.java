package com.neoteric.tddjava.service1;

import com.neoteric.tddjava.model1.Address;
import com.neoteric.tddjava.model1.VoterApplication;
import com.neoteric.tddjava.model1.VoterId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VoterApplicationTest {
    @Test
    public void VoterAgeGreaterthan18(){
        VoterApplication applicationDetails=new VoterApplication();
        applicationDetails.name="sukumar nagabelly";
        applicationDetails.fathername="sadanandam";
        applicationDetails.DOB="23-2-1998";
        applicationDetails.constituency="wardannnapet";
        applicationDetails.age=26;
        applicationDetails.gender="male";

        Address address=new Address();
        address.houseNo="2-13/1";
        address.area="kphb";
        address.city="hyderabad";
        address.pincode="506015";
        address.street="green hills";
        VoterService voterService=new VoterService();
        VoterId voterId=voterService.getvoterService(applicationDetails);
     Assertions.assertNotNull(voterId.voteridNumber);
        Assertions.assertNotNull(voterId);
      Assertions.assertNotNull(voterId.constituency);







    }
}
