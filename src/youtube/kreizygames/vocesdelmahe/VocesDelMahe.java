package youtube.kreizygames.vocesdelmahe;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class VocesDelMahe extends Activity {

	private MediaPlayer reproSonido;
	
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
		reproSonido.stop();
		reproSonido = seleccionSonido(v);
		reproSonido.start();
	}
	
	private MediaPlayer seleccionSonido(View v){
		MediaPlayer sonido = null;
		switch (v.getId()) {
		case R.id.gato:
			sonido = MediaPlayer.create(VocesDelMahe.this,R.raw.gato);
			break;
		case R.id.sms:
			sonido = MediaPlayer.create(VocesDelMahe.this,R.raw.sms);
			break;
		}
		return reproSonido;
	}
}
