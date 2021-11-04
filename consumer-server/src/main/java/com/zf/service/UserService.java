package com.zf.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service  // 放到容器中
public class UserService {

    // 想拿到provider的票,要到注册中心拿到我们的服务

    // 本地的项目饮用就是   @Autowired

//     如果是分布式服务，在远程， 使用

    @Reference  // 引用，，，正常开发情况下，我们是用pom坐标，可以订阅路径相同的接口名称
    TicketService TICKET_SERVICE;
    

    public void buyTicket(){
        String ticket = TICKET_SERVICE.getTicket();
        System.out.println("在注册中心拿到了一张票=》"+ ticket);
    }




    
}
