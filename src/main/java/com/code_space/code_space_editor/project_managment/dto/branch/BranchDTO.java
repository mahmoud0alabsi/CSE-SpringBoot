package com.code_space.code_space_editor.project_managment.dto.branch;

import java.time.Instant;
import java.util.List;

import com.code_space.code_space_editor.project_managment.dto.file.FileDTO;
import com.code_space.code_space_editor.project_managment.dto.project.ProjectDTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BranchDTO {
    private Long id;
    private String authorUsername;
    private Long authorId;

    private String name;
    private Long baseBranchId;

    private Instant createdAt;
    private Instant updatedAt;

    private ProjectDTO project;
    private List<FileDTO> files;
}
