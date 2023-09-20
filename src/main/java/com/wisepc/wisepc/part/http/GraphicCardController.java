package com.wisepc.wisepc.part.http;

import com.wisepc.wisepc.part.request.GraphicCardCreationRequest;
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

//    @PostMapping(value = "/create-graphic-card", consumes = MediaType.APPLICATION_JSON_VALUE)
//    GraphicCardCreationRequest createGraphicCard(@RequestBody GraphicCardCreationRequest graphicCardCreationRequest) {
//        partCreationDao.createGraphicCard(graphicCardCreationRequest);
//    }
}
