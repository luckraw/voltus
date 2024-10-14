package com.luckraw.voltus.service;

import com.luckraw.voltus.domain.dtos.SubscriptionDTO;
import com.luckraw.voltus.domain.entity.Subscription;
import com.luckraw.voltus.mapper.SubscriptionMapper;
import com.luckraw.voltus.repositories.SubscriptionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;
    private final SubscriptionMapper subscriptionMapper;

    public List<SubscriptionDTO> getAllSubscriptions() {
        List<Subscription> subscriptions = subscriptionRepository.findAll();
        return subscriptionMapper.toDTOList(subscriptions);
    }

    public SubscriptionDTO getSubscriptionById(Long id) {
        Subscription subscription = subscriptionRepository.findById(id).orElseThrow();
        return subscriptionMapper.toDTO(subscription);
    }

    public SubscriptionDTO createSubscription(SubscriptionDTO subscriptionDTO) {
        Subscription newSubscription = subscriptionMapper.toEntity(subscriptionDTO);
        newSubscription = subscriptionRepository.save(newSubscription);
        return subscriptionMapper.toDTO(newSubscription);
    }

    public SubscriptionDTO updateSubscription(Long id, SubscriptionDTO subscriptionDTO) {
        Subscription subscription = subscriptionRepository.findById(id).orElseThrow();
        subscriptionMapper.updateEntityFromDTO(subscriptionDTO, subscription);
        subscription = subscriptionRepository.save(subscription);
        return subscriptionMapper.toDTO(subscription);
    }

    public void deleteSubscription(Long id) {
        subscriptionRepository.deleteById(id);
    }
}
