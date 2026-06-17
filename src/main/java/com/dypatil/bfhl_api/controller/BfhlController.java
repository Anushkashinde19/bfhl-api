package com.dypatil.bfhl_api.controller;

import com.dypatil.bfhl_api.dto.RequestDTO;
import com.dypatil.bfhl_api.dto.ResponseDTO;
import com.dypatil.bfhl_api.service.BfhlService;

import org.springframework.web.bind.annotation.*;

@RestController
public class BfhlController {

    private final BfhlService service;

    public BfhlController(BfhlService service) {
        this.service = service;
    }

    @PostMapping("/bfhl")
    public ResponseDTO process(
            @RequestBody RequestDTO request) {

        return service.process(request);
    }
}