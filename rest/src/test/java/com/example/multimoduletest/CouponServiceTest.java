package com.example.multimoduletest;

import static org.junit.jupiter.api.Assertions.*;

import com.example.multimoduletest.db.domain.coupon.entity.CouponEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CouponServiceTest {

    @Autowired
    private CouponService couponService;

    @Test
    void save() throws Exception {
        couponService.save();
    }

}