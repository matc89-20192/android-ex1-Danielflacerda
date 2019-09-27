package matc89.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String aux;
    private Button bt;
    private EditText et;
    private TextView tv;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt = (Button) findViewById(R.id.btnCumprimentar);
        et = (EditText) findViewById(R.id.editNome);
        tv = (TextView) findViewById(R.id.labelMensagem);
        bt.setOnClickListener(new View.OnClickListener(){
        @Override
            public void onClick(View v){
                aux = et.getText().toString();
                tv.setText("Alô, " + et.getText().toString() + "!");
            }
        });
    }
    protected void onSaveInstanceState(Bundle state)
    {
        super.onSaveInstanceState(state);
        state.putString("aux", aux);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        tv.setText("Alô, " + savedInstanceState.getString("aux") + "!");
    }
}
