package youtube.kreizygames.vocesdelmahe;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
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

	public void voz1(View v) {
		MediaPlayer reproSonido = MediaPlayer.create(VocesDelMahe.this,
				R.raw.gato);
		reproSonido.start();
	}
	
	public void voz2(View v) {
		MediaPlayer reproSonido = MediaPlayer.create(VocesDelMahe.this,
				R.raw.sms);
		reproSonido.start();
	}
}
