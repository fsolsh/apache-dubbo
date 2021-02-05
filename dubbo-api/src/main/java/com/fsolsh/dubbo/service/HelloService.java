package com.fsolsh.dubbo.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.protocol.rest.support.ContentType;

import javax.ws.rs.*;

@Path("demo")
@Produces({ContentType.APPLICATION_JSON_UTF_8})
@Consumes({ContentType.APPLICATION_JSON_UTF_8})
@DubboService(protocol = {"rest", "rpc"})
public interface HelloService {
    /**
     * sayHello
     *
     * @param name
     * @return
     */
    @Path("sayHello")
    @GET
    String sayHello(@QueryParam("name") String name);

}
