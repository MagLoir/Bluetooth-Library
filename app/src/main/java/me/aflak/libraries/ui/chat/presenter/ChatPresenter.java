package me.aflak.libraries.ui.chat.presenter;

import android.content.Intent;

/**
 * Created by Omar on 20/12/2017.
 */

public interface ChatPresenter {
    void onCreate(Intent intent);
    void onHelloWorld();
    void onStart();
    void onStop();
}
