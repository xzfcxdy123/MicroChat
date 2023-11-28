package com.web.microchat.server.websocket;

import javax.websocket.Session;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface WebSocketHandler {

    List<Map<String, Session>> sessionStorage = new ArrayList<>();

}
