package com.example.server.app.service;

import com.example.server.app.model.Server;

import java.util.List;

public interface ServerService {
    Server create(Server server);
    List<Server> list (int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
