package com.luckraw.voltus.mapper;

import com.luckraw.voltus.domain.dtos.SubscriptionDTO;
import com.luckraw.voltus.domain.entity.Subscription;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    SubscriptionDTO toDTO(Subscription subscription);

    List<SubscriptionDTO> toDTOList(List<Subscription> subscriptions);

    Subscription toEntity(SubscriptionDTO dto);

    void updateEntityFromDTO(SubscriptionDTO dto, @MappingTarget Subscription entity);
}
