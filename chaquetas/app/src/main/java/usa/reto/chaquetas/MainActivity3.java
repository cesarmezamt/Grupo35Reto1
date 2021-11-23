package usa.reto.chaquetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    Drawable drawable1,drawable2;
    ImageView medida,domicilio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //--------------medida chaquetas---------------------
        Resources medida1 = getResources();
        drawable1 = medida1.getDrawable(R.drawable.medidas, getTheme());

        medida = (ImageView) findViewById(R.id.medidas);
        medida.setImageDrawable(drawable1);

        //--------------domicilios chaquetas---------------------
        Resources domicilios1 = getResources();
        drawable2 = domicilios1.getDrawable(R.drawable.domicilio, getTheme());

        domicilio = (ImageView) findViewById(R.id.domicilio);
        domicilio.setImageDrawable(drawable2);

    }
}