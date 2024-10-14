package com.luckraw.voltus.repositories;

import com.luckraw.voltus.domain.entity.Subscription;
import com.luckraw.voltus.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription,Long> {

    List<Subscription> findByUserId(Long userId);
}
