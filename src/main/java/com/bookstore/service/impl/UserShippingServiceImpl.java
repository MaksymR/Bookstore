package com.bookstore.service.impl;

import com.bookstore.domain.UserShipping;
import com.bookstore.service.UserShippingService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserShippingServiceImpl implements UserShippingService {

    @Autowired
    private UserShippingRepository userShippingRepository;


    @Override
    public UserShipping findById(Long id) {

        return null;

    }

}
