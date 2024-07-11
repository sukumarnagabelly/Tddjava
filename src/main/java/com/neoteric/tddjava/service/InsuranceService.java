package com.neoteric.tddjava.service;

import com.neoteric.tddjava.model.Insurance;
import com.neoteric.tddjava.model.InsuranceForm;

import java.util.UUID;


    public class InsuranceService {
        public Insurance getinsurance (InsuranceForm details1){
            Insurance insurance=null;
            if(details1.age>=20){
                insurance=new Insurance();
                insurance.policyNumber="axis"+ UUID.randomUUID().toString();
                insurance.chosenFrequency="Yearly";
                insurance.policyTerm="20Years";

            }
            return insurance;
        }
    }


