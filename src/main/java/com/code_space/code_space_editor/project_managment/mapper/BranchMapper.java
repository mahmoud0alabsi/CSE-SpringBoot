package com.code_space.code_space_editor.project_managment.mapper;

import org.mapstruct.Mapper;

import com.code_space.code_space_editor.project_managment.dto.branch.BranchDTO;
import com.code_space.code_space_editor.project_managment.entity.sql.Branch;

@Mapper(componentModel = "spring")
public interface BranchMapper {
    // @Mapping(target = "project", ignore = true)
    // @Mapping(target = "files", ignore = true)
    BranchDTO toDTO(Branch branch);

    Branch toEntity(BranchDTO dto);
}
