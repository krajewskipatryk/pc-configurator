package com.wisepc.wisepc.configurator.http

import com.wisepc.wisepc.configurator.ConfiguratorService
import com.wisepc.wisepc.configurator.dto.ConfiguratorUpdateRequest
import com.wisepc.wisepc.session.SessionService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/configurator"])
class ConfiguratorController(
        private val sessionService: SessionService,
        private val configuratorService: ConfiguratorService) {

    @PostMapping(value = ["/update-configuration"], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun updateConfiguration(@RequestHeader(value = "sessionToken", required = true) sessionToken: String?,
                            @RequestBody configuratorUpdateRequest: ConfiguratorUpdateRequest?) {
        configuratorService.updateOrCreateSession(sessionToken, configuratorUpdateRequest)
    }
}