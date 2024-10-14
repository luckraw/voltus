package com.luckraw.voltus.service;

import com.luckraw.voltus.domain.dtos.PlanDTO;
import com.luckraw.voltus.domain.entity.Plan;
import com.luckraw.voltus.mapper.PlanMapper;
import com.luckraw.voltus.repositories.PlanRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlanService {

    private final PlanRepository planRepository;
    private final PlanMapper planMapper;

    public List<PlanDTO> getAllPlans() {
        List<Plan> plans = planRepository.findAll();
        return planMapper.toDTOList(plans);
    }

    public PlanDTO getPlanById(Long id) {
        Plan plan = planRepository.findById(id).orElseThrow();
        return planMapper.toDTO(plan);
    }

    public PlanDTO createPlan(PlanDTO dto) {
        Plan plan = planMapper.toEntity(dto);
        plan = planRepository.save(plan);
        return planMapper.toDTO(plan);
    }

    public PlanDTO updatePlan(Long id, PlanDTO dto) {
        Plan plan = planRepository.findById(id).orElseThrow();
        planMapper.updateEntityFromDTO(dto, plan);
        plan = planRepository.save(plan);
        return planMapper.toDTO(plan);
    }

    public void deletePlan(Long id) {
        planRepository.deleteById(id);
    }
}
