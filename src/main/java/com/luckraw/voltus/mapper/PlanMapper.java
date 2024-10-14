package com.luckraw.voltus.mapper;

import com.luckraw.voltus.domain.dtos.PlanDTO;
import com.luckraw.voltus.domain.entity.Plan;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PlanMapper {

    PlanDTO map(Plan plan);

    List<PlanDTO> map(List<Plan> plans);
}
