package com.dypatil.bfhl_api.service;

import java.util.ArrayList;
import java.util.List;

import com.dypatil.bfhl_api.dto.RequestDTO;
import com.dypatil.bfhl_api.dto.ResponseDTO;

import org.springframework.stereotype.Service;

@Service
public class BfhlServiceImpl implements BfhlService {

    @Override
    public ResponseDTO process(RequestDTO request) {

        List<String> alphabets = new ArrayList<>();
        List<String> numbers = new ArrayList<>();
        List<String> specialCharacters = new ArrayList<>();

        for (String item : request.getData()) {

            if (item.matches("[A-Za-z]+")) {
                alphabets.add(item);
            }
            else if (item.matches("-?\\d+(\\.\\d+)?")) {
                numbers.add(item);
            }
            else {
                specialCharacters.add(item);
            }
        }

        ResponseDTO response = new ResponseDTO();

        response.setIs_success(true);
        response.setAlphabets(alphabets);
        response.setNumbers(numbers);
        response.setSpecialCharacters(specialCharacters);

        response.setAlphabetCount(alphabets.size());
        response.setNumberCount(numbers.size());
        response.setSpecialCharacterCount(specialCharacters.size());

        return response;
    }
}