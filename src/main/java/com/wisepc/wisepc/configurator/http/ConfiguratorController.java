package com.wisepc.wisepc.configurator.http;

import com.wisepc.wisepc.configurator.ConfiguratorService;
import com.wisepc.wisepc.configurator.model.ComputerUpdateRequest;
import com.wisepc.wisepc.session.SessionService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/configurator")
@RequiredArgsConstructor
class ConfiguratorController {
    private final SessionService sessionService;
    private final ConfiguratorService configuratorService;

    @PostMapping(value = "/update-configuration")
    public @ResponseBody String updateConfiguration(
                                @RequestHeader(value = "sessionToken", required = true) String sessionToken,
                                @RequestBody ComputerUpdateRequest computerUpdateRequest) {

        try {
            if (sessionService.validateSession(sessionToken)) {
                return configuratorService.updateComputerConfiguration(sessionToken, computerUpdateRequest);
            } else {
                // TODO: Replace with SessionTokenExpiredException/NoDataFoundException/SessionValidationFailedException
                throw new RuntimeException("Session token failed validation");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e.toString());
        }
    }
}
