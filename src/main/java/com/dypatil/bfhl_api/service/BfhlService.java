package com.dypatil.bfhl_api.service;

import com.dypatil.bfhl_api.dto.RequestDTO;
import com.dypatil.bfhl_api.dto.ResponseDTO;

public interface BfhlService {

    ResponseDTO process(RequestDTO request);
}