package com.yupi.autoreply.service;

import com.yupi.autoreply.common.BaseResponse;
import org.springframework.stereotype.Service;


public interface ask {
    BaseResponse<String> ask(String question);
}
