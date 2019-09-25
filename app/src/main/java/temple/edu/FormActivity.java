package temple.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Name = findViewById(R.id.name);
        final EditText Email = findViewById(R.id.email);
        final EditText Password = findViewById(R.id.password);
        final EditText ConfirmPassword = findViewById(R.id.confirmPassword);
        Button saveButton = findViewById(R.id.button);

        //Create lister for event

        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Name.getText().toString();
                String email = Email.getText().toString();
                String password = Password.getText().toString();
                String confirmpassword = ConfirmPassword.getText().toString();

                if (name.isEmpty() || email.isEmpty()
                        || password.isEmpty() || confirmpassword.isEmpty()){
                    Toast t = Toast.makeText( FormActivity.this, "Please fill in all emtpy box", Toast.LENGTH_SHORT);
                    t.show();
                }
                else if(!(password.equals(confirmpassword))){
                    Toast t = Toast.makeText( FormActivity.this, "The password does not match, reenter password", Toast.LENGTH_SHORT);
                    t.show();
                }
                else{
                    Toast t = Toast.makeText( FormActivity.this, "The information you entered has been saved", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        };
        saveButton.setOnClickListener(ocl);
    }
}
