package com.g.l.mvc.service.impl;


import com.g.l.mvc.dto.request.RequestProjectDTO;
import com.g.l.mvc.dto.response.ResponseProjectDTO;
import com.g.l.mvc.mapper.ProjectMapper;
import com.g.l.mvc.model.Project;
import com.g.l.mvc.repository.ProjectRepository;
import com.g.l.mvc.service.CRUDService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements CRUDService<ResponseProjectDTO, RequestProjectDTO> {

    private final ProjectRepository repository;

    private final ProjectMapper mapper;

    public ProjectServiceImpl(ProjectRepository repository, ProjectMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public ResponseProjectDTO create(RequestProjectDTO object) {
        Project project = mapper.requestProjectDtoToProject(object);
        repository.save(project);
        return mapper.projectToResponseProjectDto(project);
    }
}
