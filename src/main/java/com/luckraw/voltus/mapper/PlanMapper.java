package com.luckraw.voltus.mapper;

import com.luckraw.voltus.domain.dtos.PlanDTO;
import com.luckraw.voltus.domain.entity.Plan;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlanMapper {

    Plan toEntity(PlanDTO planDTO);

    PlanDTO toDTO(Plan plan);

    List<PlanDTO> toDTOList(List<Plan> plans);

    void updateEntityFromDTO(PlanDTO dto, @MappingTarget Plan plan);
}
