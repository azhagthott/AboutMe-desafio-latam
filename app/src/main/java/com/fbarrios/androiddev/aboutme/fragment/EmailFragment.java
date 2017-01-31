package com.fbarrios.androiddev.aboutme.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.fbarrios.androiddev.aboutme.R;

public class EmailFragment extends Fragment {

    public EmailFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_email, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Button contactButton = (Button) view.findViewById(R.id.contactButton);
        final TextInputLayout textInputLayoutWrapper = (TextInputLayout) view.findViewById(R.id.textInputLayoutWrapper);
        final EditText userInput = (EditText) view.findViewById(R.id.editTextMessage);
        final Button sendButton = (Button) view.findViewById(R.id.sendButton);

        textInputLayoutWrapper.setVisibility(View.GONE);
        sendButton.setVisibility(View.GONE);

        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactButton.setVisibility(View.GONE);
                textInputLayoutWrapper.setVisibility(View.VISIBLE);
                sendButton.setVisibility(View.VISIBLE);
            }
        });

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String msg = userInput.getText().toString();
                String subject = "Conctato desde About Me App.";

                if (msg.trim().length() > 0) {
                    Intent intent = new Intent(Intent.ACTION_SENDTO);
                    intent.setType("*/*");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"francisco.barrios@zecovery.com"});
                    intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                    intent.putExtra(Intent.EXTRA_TEXT, msg);
                    startActivity(intent);
                } else {

                }
            }
        });
    }
}
