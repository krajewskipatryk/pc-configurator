package com.wisepc.wisepc.session.http;

import com.wisepc.wisepc.session.SessionService;
import com.wisepc.wisepc.model.session.domain.Session;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/session")
@RequiredArgsConstructor
class SessionCreationController {
    private final SessionService sessionService;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public String createSession() {
        Session newSession = sessionService.createSession();

        return newSession.getSessionToken();
    }
}
