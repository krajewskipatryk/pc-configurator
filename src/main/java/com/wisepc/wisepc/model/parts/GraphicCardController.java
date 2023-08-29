package com.wisepc.wisepc.model.parts;

import com.wisepc.wisepc.model.parts.PartCreationDao;
import com.wisepc.wisepc.model.parts.PartQueryDao;
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
    private final PartQueryDao partQueryDao;
    private final PartCreationDao partCreationDao;

    @PostMapping(value = "/create-graphic-card", consumes = MediaType.APPLICATION_JSON_VALUE)
    GraphicCardCreationRequest createGraphicCard(@RequestBody GraphicCardCreationRequest graphicCardCreationRequest) {
        partCreationDao.createGraphicCard(graphicCardCreationRequest);
    }
}
