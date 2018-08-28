package ph.edu.iicsust.tan.kylealen.labact1compare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button compare = (Button) findViewById(R.id.compare);
        compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText FirstNumber = (EditText) findViewById(R.id.FirstNumber);
                EditText SecondNumber = (EditText) findViewById(R.id.SecondNumber);
                TextView Result = (TextView) findViewById(R.id.Result);
                int firstNum = Integer.parseInt(FirstNumber.getText().toString());
                int secondNum = Integer.parseInt(SecondNumber.getText().toString());
                if (firstNum > secondNum) {
                    String result= firstNum + " is the Higher Number";
                    Result.setText(result + "");
                }
                else if (firstNum < secondNum) {
                    String result= secondNum + " is the Higher Number";
                    Result.setText(result + "");
                }
                else if (firstNum == secondNum) {
                    String result= "Both are equal to each other";
                    Result.setText(result + "");
                }


            }
        });

    }
}
