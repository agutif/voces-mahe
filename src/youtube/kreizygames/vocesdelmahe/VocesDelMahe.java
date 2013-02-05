package youtube.kreizygames.vocesdelmahe;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class VocesDelMahe extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voces_del_mahe);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_voces_del_mahe, menu);
        return true;
    }
    
    public double sumar(int num1, double num2) {
    	double total = num1+num2;
    	return total;
    	
    }
    
    public void bitches(View v) {
    	double resultadoSuma = sumar(8, 8.8);
    	Toast.makeText(getApplicationContext(), "Total de suma " + resultadoSuma, Toast.LENGTH_LONG).show();
    	// ola k ase
    }
}
