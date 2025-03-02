package com.tgdigester.tdlib;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class TDLibConnector {
    public interface TDLib extends Library {
        TDLib INSTANCE = Native.load("tdjson", TDLib.class);

        Pointer td_json_client_create();
        void td_json_client_send(Pointer client, String request);
        String td_json_client_receive(Pointer client, double timeout);
        void td_json_client_destroy(Pointer client);
    }

    public static void main(String[] args) {
        Pointer client = TDLib.INSTANCE.td_json_client_create();

        // Пример запроса версии TDLib
        String request = "{\"@type\":\"getOption\",\"name\":\"version\"}";
        TDLib.INSTANCE.td_json_client_send(client, request);

        // Ожидание ответа
        String response;
        do {
            response = TDLib.INSTANCE.td_json_client_receive(client, 10);
        } while (response == null);

        System.out.println("TDLib Response: " + response);

        // Завершаем работу с TDLib
        TDLib.INSTANCE.td_json_client_destroy(client);
    }
}
