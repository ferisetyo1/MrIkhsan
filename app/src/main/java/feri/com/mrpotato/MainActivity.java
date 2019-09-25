package feri.com.mrpotato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView body, hair, eyebrow, eye, moustache, beard;
    Button btn_body, btn_hair, btn_eyebrow, btn_eye, btn_moustache, btn_beard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //declare imgview
        body=findViewById(R.id.body);
        hair=findViewById(R.id.hair);
        eyebrow=findViewById(R.id.eyebrow);
        eye=findViewById(R.id.eye);
        beard=findViewById(R.id.beard);
        moustache=findViewById(R.id.moustache);
        //declare button
        btn_body=findViewById(R.id.btn_body);
        btn_eyebrow=findViewById(R.id.btn_eyebrow);
        btn_hair=findViewById(R.id.btn_hair);
        btn_eye=findViewById(R.id.btn_eye);
        btn_moustache=findViewById(R.id.btn_moustache);
        btn_beard=findViewById(R.id.btn_beard);
        //set event
        btn_body.setOnClickListener(this);
        btn_eyebrow.setOnClickListener(this);
        btn_beard.setOnClickListener(this);
        btn_hair.setOnClickListener(this);
        btn_moustache.setOnClickListener(this);
        btn_eye.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_body:
                if (body.getVisibility()!=View.VISIBLE){
                    body.setVisibility(View.VISIBLE);
                    setColor(btn_body,true);
                }else{
                    body.setVisibility(View.INVISIBLE);
                    setColor(btn_body,false);
                }
                break;
            case R.id.btn_hair:
                if (hair.getVisibility()!=View.VISIBLE){
                    hair.setVisibility(View.VISIBLE);
                    setColor(btn_hair,true);
                }else{
                    hair.setVisibility(View.INVISIBLE);
                    setColor(btn_hair,false);
                }
                break;
            case R.id.btn_eyebrow:
                if (eyebrow.getVisibility()!=View.VISIBLE){
                    eyebrow.setVisibility(View.VISIBLE);
                    setColor(btn_eyebrow,true);
                }else{
                    eyebrow.setVisibility(View.INVISIBLE);
                    setColor(btn_eyebrow,false);
                }
                break;
            case R.id.btn_eye:
                if (eye.getVisibility()!=View.VISIBLE){
                    eye.setVisibility(View.VISIBLE);
                    setColor(btn_eye,true);
                }else{
                    eye.setVisibility(View.INVISIBLE);
                    setColor(btn_eye,false);
                }
                break;
            case R.id.btn_moustache:
                if (moustache.getVisibility()!=View.VISIBLE){
                    moustache.setVisibility(View.VISIBLE);
                    setColor(btn_moustache,true);
                }else{
                    moustache.setVisibility(View.INVISIBLE);
                    setColor(btn_moustache,false);
                }
                break;
            case R.id.btn_beard:
                if (beard.getVisibility()!=View.VISIBLE){
                    beard.setVisibility(View.VISIBLE);
                    setColor(btn_beard,true);
                }else{
                    beard.setVisibility(View.INVISIBLE);
                    setColor(btn_beard,false);
                }
                break;
        }
    }

    private void setColor(Button btn, boolean b){
        if (b){
            btn.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        }else{
            btn.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        }
    };
}
