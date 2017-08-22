package com.sc.chatbot.service;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Jin Sungjin on 2017-08-22.
 */

public class PushInstanceIdService extends FirebaseInstanceIdService{

    @Override
    public void onTokenRefresh() {
        String refreshToken = FirebaseInstanceId.getInstance().getToken();

        sendRegistrationToServer(refreshToken);
    }

    private void sendRegistrationToServer(String refreshToken) {

    }
}
