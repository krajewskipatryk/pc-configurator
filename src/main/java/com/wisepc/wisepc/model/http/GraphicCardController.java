package com.wisepc.wisepc.model.http;

import com.wisepc.wisepc.model.parts.dao.PartDao;
import com.wisepc.wisepc.model.parts.request.GraphicCardCreationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/part/gpu")
class GraphicCardController {
    private final PartDao partDao;

    @PostMapping(value = "/create-graphic-card", consumes = MediaType.APPLICATION_JSON_VALUE)
    void createGraphicCard(@RequestBody GraphicCardCreationRequest graphicCardCreationRequest) {
        partDao.createGraphicCard(graphicCardCreationRequest);
    }
}
