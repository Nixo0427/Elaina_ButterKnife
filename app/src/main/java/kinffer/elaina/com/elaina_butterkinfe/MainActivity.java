package kinffer.elaina.com.elaina_butterkinfe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import kinffer.elaina.com.elaina_butterkinfe.ButterKnife.Anno.BindView;
import kinffer.elaina.com.elaina_butterkinfe.ButterKnife.Anno.onClick;
import kinffer.elaina.com.elaina_butterkinfe.ButterKnife.Reflex.BindProcessor;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tv_test)
    TextView tvTest;

    int index = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindProcessor.bind(this);
        tvTest.setText("Elainna - ButterKinfe");
        tvTest.setTextSize(20.0f);

    }

    @onClick({R.id.tv_test})
    public void onViewClicked(View view) {

        switch (view.getId()){
            case R.id.tv_test:
                index++;
                if(index % 2 == 0){
                    tvTest.setText("伊蕾娜");
                }else{
                    tvTest.setText("Elainna - ButterKinfe");
                }

        }

    }
}
