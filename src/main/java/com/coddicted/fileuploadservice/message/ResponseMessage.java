package com.coddicted.fileuploadservice.message;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ResponseMessage {
    private final String message;
}
