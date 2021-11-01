package com.example.server.app.service;

import com.example.server.app.model.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;

public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    List<Server> list (int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
