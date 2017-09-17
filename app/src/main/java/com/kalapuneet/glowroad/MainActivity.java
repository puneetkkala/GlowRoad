package com.kalapuneet.glowroad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements FacebookCallback<LoginResult> {

    private AppCompatEditText emailEt;
    private AppCompatEditText passwordEt;
    private AppCompatTextView forgotPassword;
    private AppCompatTextView login;
    private LoginButton loginButton;
    private AppCompatTextView signUp;
    private AppCompatTextView learnMore;
    private AppCompatTextView aboutUs;
    private AppCompatTextView contact;
    private AppCompatTextView follow;
    private AppCompatTextView facebookLogin;
    private CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailEt = (AppCompatEditText) findViewById(R.id.email_et);
        passwordEt = (AppCompatEditText) findViewById(R.id.password_et);
        forgotPassword = (AppCompatTextView) findViewById(R.id.forgot_password);
        login = (AppCompatTextView) findViewById(R.id.login);
        facebookLogin = (AppCompatTextView) findViewById(R.id.facebook_login);
        loginButton = (LoginButton) findViewById(R.id.login_button);
        loginButton.setReadPermissions("email");
        callbackManager = CallbackManager.Factory.create();
        LoginManager.getInstance().registerCallback(callbackManager, this);
        signUp = (AppCompatTextView) findViewById(R.id.sign_up);
        learnMore = (AppCompatTextView) findViewById(R.id.learn_more);
        aboutUs = (AppCompatTextView) findViewById(R.id.about);
        contact = (AppCompatTextView) findViewById(R.id.contact);
        follow = (AppCompatTextView) findViewById(R.id.follow);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onSuccess(LoginResult loginResult) {
        FeedActivity.start(this);
    }

    @Override
    public void onCancel() {

    }

    @Override
    public void onError(FacebookException error) {

    }

    public void facebookLogin(View view) {
        loginButton.performClick();
    }

    public void normalLogin(View view) {
        if (!emailEt.getText().toString().isEmpty() && !passwordEt.getText().toString().isEmpty()) {
            FeedActivity.start(this);
        }
    }
}
