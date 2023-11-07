package com.jsp.wfm.Dao;

import com.jsp.wfm.Models.Entities.CustomerProfileRequest;
import com.jsp.wfm.Models.Entities.CustomerProfile;

import java.util.List;
import java.util.TreeMap;

public class CustomerProfileDao {

    TreeMap<Long,CustomerProfile> profileTreeMap = new TreeMap<>();
    int c = 1;

    public CustomerProfileDao()
    {
//        List<String> numbers = new ArrayList<>();
//        numbers.add("9311044233");
//        numbers.add("9331112340");
//        String address = "304 Alanis Parkway, Boylemouth, Virginia";
//        List<String> referralCodes = new ArrayList<>();
//        referralCodes.add("VtYxq8m0Op0M");
//        referralCodes.add("LyJMqECNr3vn");
//        referralCodes.add("650wm3aKyOwx");
//        referralCodes.add("8LJILw5hfuPH");
//        referralCodes.add("jMGOEhv8hOMU");
//        referralCodes.add("7Ffb8QoG4gLG");
//
//        CustomerProfile customerProfile = new CustomerProfile(1,
//                "John doe", new Date("1998-9-25"), "john.doe@gmail.com",
//                numbers, address, referralCodes);
//        profileTreeMap.put(1L,customerProfile);
    }

    public CustomerProfile fetchCustomerProfile(long customerID)
    {
        return this.profileTreeMap.get(customerID);
    }

    public CustomerProfile save(CustomerProfileRequest saveRequest)
    {
        CustomerProfile profile = new CustomerProfile(c++,saveRequest.getCustomerName(),
                saveRequest.getDateOfBirth(),saveRequest.getEmail(),List.of(saveRequest.getPrimaryNumber()), saveRequest.getAddress(), saveRequest.getCodes());
        return save(profile);
    }

    public CustomerProfile save(CustomerProfile profile) {
        this.profileTreeMap.put(profile.getCustomerId(),profile);
        return profile;
    }

    public CustomerProfile removeCustomer(long customerID) {
        CustomerProfile profile = profileTreeMap.get(customerID);
        profileTreeMap.remove(customerID);
        return profile;
    }
}
