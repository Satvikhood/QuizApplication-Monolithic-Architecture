package com.satvik.QuizApplication.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Response {
    public Integer id;
    public String response;
}
