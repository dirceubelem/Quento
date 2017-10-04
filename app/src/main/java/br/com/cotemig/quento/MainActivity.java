package br.com.cotemig.quento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btnNumber1)
    Button btnNumber1;
    @BindView(R.id.btnNumber2)
    Button btnNumber2;
    @BindView(R.id.btnNumber3)
    Button btnNumber3;
    @BindView(R.id.btnNumber4)
    Button btnNumber4;
    @BindView(R.id.btnNumber5)
    Button btnNumber5;
    @BindView(R.id.btnOper1)
    Button btnOper1;
    @BindView(R.id.btnOper2)
    Button btnOper2;
    @BindView(R.id.btnOper3)
    Button btnOper3;
    @BindView(R.id.btnOper4)
    Button btnOper4;

    private List<Integer> values;

    private List<Match> ml;
    private Match match;
    private int index = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ml = Match.createListMatch();

        getMatch();

        ButterKnife.bind(this);

        values = new ArrayList<>();

        btnNumber1.setOnClickListener(this);
        btnNumber2.setOnClickListener(this);
        btnNumber3.setOnClickListener(this);
        btnNumber4.setOnClickListener(this);
        btnNumber5.setOnClickListener(this);
        btnOper1.setOnClickListener(this);
        btnOper2.setOnClickListener(this);
        btnOper3.setOnClickListener(this);
        btnOper4.setOnClickListener(this);

        criaNumero();
    }

    private void getMatch() {
        match = ml.get(index++);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, ((Button) v).getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void criaNumero() {

        int[] v = new int[5];

        for (int i = 0; i < v.length; i++) {

            boolean achou = true;
            int sorteio = 0;

            do {
                Random r = new Random();
                sorteio = r.nextInt(10);

                achou = false;

                for (int j = 0; j < i; j++) {
                    achou = sorteio == v[j];
                    if (achou) {
                        break;
                    }
                }

            } while (achou);

            v[i] = sorteio;

        }
    }


}
