package youtube.kreizygames.vocesdelmahe;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

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

	public void sonido(View v) {
		Intent maleta = new Intent(this, ListaSonidos.class);
		startActivity(maleta);
	}
}
