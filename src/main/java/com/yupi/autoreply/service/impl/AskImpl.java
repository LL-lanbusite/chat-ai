package com.yupi.autoreply.service.impl;

import com.yupi.autoreply.answerer.Answerer;
import com.yupi.autoreply.common.BaseResponse;
import com.yupi.autoreply.factory.AnswererFactory;
import com.yupi.autoreply.factory.MonitorFactory;
import com.yupi.autoreply.model.TaskListItem;
import com.yupi.autoreply.monitor.Monitor;
import com.yupi.autoreply.service.ask;
import org.springframework.stereotype.Service;

@Service
public class AskImpl implements ask {


    @Override
    public BaseResponse<String> ask(String question) {
        return null;
    }
}
