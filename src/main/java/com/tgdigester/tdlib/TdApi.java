package com.tgdigester.tdlib;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface TdApi extends Library {
    TdApi INSTANCE = Native.load("tdjson", TdApi.class);

    Pointer td_json_client_create();
    void td_json_client_destroy(Pointer client);
    void td_json_client_send(Pointer client, String request);
    String td_json_client_receive(Pointer client, double timeout);
}