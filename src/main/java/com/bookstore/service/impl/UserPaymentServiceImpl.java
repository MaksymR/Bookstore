package com.bookstore.service.impl;

import com.bookstore.repository.UserPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.domain.UserPayment;
import com.bookstore.service.UserPaymentService;

@Service
public class UserPaymentServiceImpl implements UserPaymentService {

    @Autowired
    private UserPaymentRepository userPaymentRepository;

    @Override
    public UserPayment findById(Long id) {

        return userPaymentRepository.findById(id).get();

    }

    @Override
    public void removeById(Long id) {

        userPaymentRepository.deleteById(id);

    }

}
