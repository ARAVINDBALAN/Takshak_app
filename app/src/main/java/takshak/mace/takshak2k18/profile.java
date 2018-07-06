package takshak.mace.takshak2k18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class profile extends AppCompatActivity {
    TextView name,phone,rank;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        rank=(TextView)findViewById(R.id.rank);
        name=(TextView)findViewById(R.id.name);
        phone=(TextView)findViewById(R.id.number);
        rank.setText("unknown");
        name.setText("unknown");
        phone.setText("unknown");
    }
}
