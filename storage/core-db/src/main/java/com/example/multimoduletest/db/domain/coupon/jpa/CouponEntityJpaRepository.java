package com.example.multimoduletest.db.domain.coupon.jpa;

import com.example.multimoduletest.db.domain.coupon.entity.CouponEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponEntityJpaRepository extends JpaRepository<CouponEntity, Long> {

}
