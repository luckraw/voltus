package com.luckraw.voltus.mapper;

import com.luckraw.voltus.domain.dtos.SubscriptionDTO;
import com.luckraw.voltus.domain.entity.Subscription;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface SubscriptionMapper {


    SubscriptionDTO map(Subscription subscription);

    List<SubscriptionDTO> map(List<Subscription> subscriptions);
}
