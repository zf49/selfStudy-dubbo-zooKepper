package com.zf.service;


import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


  // zookeeper: 服务注册与发现

@Component // 使用dubbo后尽量不要使用@Service
@Service
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {
        return "王治方 Chris";
    }


    
}
