package usa.reto.chaquetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    Drawable drawable1,drawable2,drawable3,drawable4,drawable5,drawable6;
    ImageView chah1,chah2,chah3,cham1,cham2,cham3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //--------------chaquetas hombres---------------------
        Resources resh1 = getResources();
        drawable1 = resh1.getDrawable(R.drawable.chah1, getTheme());

        chah1 = (ImageView) findViewById(R.id.chah1);
        chah1.setImageDrawable(drawable1);

        Resources resh2 = getResources();
        drawable2 = resh2.getDrawable(R.drawable.chah2, getTheme());

        chah2 = (ImageView) findViewById(R.id.chah2);
        chah2.setImageDrawable(drawable2);

        Resources resh3 = getResources();
        drawable3 = resh3.getDrawable(R.drawable.chah3, getTheme());

        chah3 = (ImageView) findViewById(R.id.chah3);
        chah3.setImageDrawable(drawable3);
        //--------------chaquetas mujeres---------------------

        Resources resm4 = getResources();
        drawable4 = resm4.getDrawable(R.drawable.cham1, getTheme());

        cham1 = (ImageView) findViewById(R.id.cham1);
        cham1.setImageDrawable(drawable4);

        Resources resm5 = getResources();
        drawable5 = resm5.getDrawable(R.drawable.cham2, getTheme());

        cham2 = (ImageView) findViewById(R.id.cham2);
        cham2.setImageDrawable(drawable5);

        Resources resm6 = getResources();
        drawable6 = resm6.getDrawable(R.drawable.cham3, getTheme());

        cham3 = (ImageView) findViewById(R.id.cham3);
        cham3.setImageDrawable(drawable6);
    }
}