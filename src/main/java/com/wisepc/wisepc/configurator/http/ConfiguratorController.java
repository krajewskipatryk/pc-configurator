package com.wisepc.wisepc.configurator.http;

import com.wisepc.wisepc.configurator.ConfiguratorService;
import com.wisepc.wisepc.configurator.model.ConfiguratorUpdateRequest;
import com.wisepc.wisepc.session.SessionService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/configurator")
@RequiredArgsConstructor
class ConfiguratorController {
    private final SessionService sessionService;
    private final ConfiguratorService configuratorService;

    @PostMapping(value = "/update-configuration")
    public void updateConfiguration(@RequestHeader(value = "sessionToken", required = true) String sessionToken,
                                    @RequestBody ConfiguratorUpdateRequest configuratorUpdateRequest) {

        configuratorService.updateOrCreateSession(sessionToken, configuratorUpdateRequest);
    }
}
