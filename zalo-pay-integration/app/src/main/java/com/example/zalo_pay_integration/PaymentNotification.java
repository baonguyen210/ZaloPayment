package com.example.zalo_pay_integration;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;

public class PaymentNotification extends AppCompatActivity {
    private static final String TAG = "ZaloPay_Debug";

    TextView txtNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_notification);

        Log.d(TAG, "PaymentNotification Activity Started");

        txtNotification = findViewById(R.id.textViewNotify);

        Intent intent = getIntent();
        txtNotification.setText(intent.getStringExtra("result"));
    }
}


