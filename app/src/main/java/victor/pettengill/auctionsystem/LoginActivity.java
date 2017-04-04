package victor.pettengill.auctionsystem;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import victor.pettengill.auctionsystem.utils.Utils;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.email) TextInputEditText email;
    @BindView(R.id.password) TextInputEditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @OnClick(R.id.login)
    public void login() {

        boolean valid = false;

        if(Utils.isEmail(email.getText().toString())) {
            valid = true;
        } else {
            valid = false;
            email.setError(getString(R.string.invalidemail));
            email.requestFocus();
        }

        if(valid && password.getText().toString().equals("")) {
            valid = false;
            password.setError(getString(R.string.invalidpass));
            password.requestFocus();
        }

        if(valid) {

            //TODO log user

        }

    }

    @OnClick(R.id.signup)
    public void signUp() {

    }

}
