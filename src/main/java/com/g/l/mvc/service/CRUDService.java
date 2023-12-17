package com.g.l.mvc.service;

import com.g.l.mvc.dto.request.RequestBlueprintDTO;
import com.g.l.mvc.dto.response.ResponseBlueprintDTO;

public interface CRUDService {

    ResponseBlueprintDTO create(RequestBlueprintDTO blueprint);


}