package com.example.flutter.controller;

import com.example.flutter.dto.ResponseDto;
import com.example.flutter.dto.SampleDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Slf4j
public class SampleController {
    @PostMapping("/test")
    public ResponseEntity<ResponseDto> testCotroller(@RequestBody SampleDto sampleDto){
        log.info("SampleDto.id : "+sampleDto.getId());
        log.info("SampleDto.name : "+sampleDto.getName());
        return new ResponseEntity<>(ResponseDto.builder()
                .id("1")
                .name("kang")
                .build(), HttpStatus.OK);
    }
}
