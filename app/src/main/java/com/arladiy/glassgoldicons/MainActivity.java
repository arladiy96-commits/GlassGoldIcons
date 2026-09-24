package com.arladiy.glassgoldicons;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView view = new TextView(this);
        view.setText("Glass Gold Icons\n\nHyperIcons test pack\n\nTelegram\nWhatsApp\nYouTube\nChatGPT");
        view.setTextSize(20);
        view.setPadding(48, 96, 48, 48);
        setContentView(view);
    }
}
