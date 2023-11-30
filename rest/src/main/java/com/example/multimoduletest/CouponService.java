package com.example.multimoduletest;

import com.example.multimoduletest.db.domain.coupon.entity.CouponEntity;
import com.example.multimoduletest.db.domain.coupon.jpa.CouponEntityJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CouponService {

    private final CouponEntityJpaRepository couponEntityJpaRepository;

    public CouponService(CouponEntityJpaRepository couponEntityJpaRepository) {
        this.couponEntityJpaRepository = couponEntityJpaRepository;
    }

    public void save() {
        CouponEntity coupon = CouponEntity.builder()
            .name("test1")
            .build();

        couponEntityJpaRepository.save(coupon);
    }
    public void getCoupons() {
        couponEntityJpaRepository.findAll();
    }
}
