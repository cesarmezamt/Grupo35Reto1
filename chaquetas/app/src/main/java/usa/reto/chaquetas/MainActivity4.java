package usa.reto.chaquetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {

    Drawable drawable1,drawable2;
    ImageView almacen1,almacen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //--------------almacen1 chaquetas---------------------
        Resources tienda1 = getResources();
        drawable1 = tienda1.getDrawable(R.drawable.almacen1, getTheme());

        almacen1 = (ImageView) findViewById(R.id.almacen1);
        almacen1.setImageDrawable(drawable1);

        //--------------almacen2 chaquetas---------------------
        Resources tienda2 = getResources();
        drawable2 = tienda2.getDrawable(R.drawable.almacen2, getTheme());

        almacen2 = (ImageView) findViewById(R.id.almacen2);
        almacen2.setImageDrawable(drawable2);
    }
}