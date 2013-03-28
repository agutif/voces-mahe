package youtube.kreizygames.vocesdelmahe;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class ListaSonidos extends Activity {
	
	private MediaPlayer reproSonido;
	
	 public void onCreate(Bundle icicle) {
		 super.onCreate(icicle);
		 setContentView(R.layout.lista_sonidos);
		 
		 ListView lista = (ListView) findViewById(R.id.listView1);
		 final Sonido[] sonidos = generarSonidos();
		 lista.setAdapter(new Adapter(this, sonidos));
		 lista.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int posicion,
					long arg3) {
				try {
					reproSonido.stop();
				} catch (NullPointerException e) {
				}
				try{
					reproSonido = MediaPlayer.create(ListaSonidos.this, sonidos[posicion].getIdSonido());
					reproSonido.start();
				}catch (NotFoundException e) {
					Toast.makeText(ListaSonidos.this, "Sonido no encontrado", Toast.LENGTH_SHORT).show();
					// Faltaria borrarlo del ListView
				}
			}
		});
	 }
	 
	private Sonido[] generarSonidos(){
		 Sonido[] sonidos = new Sonido[3];
		 sonidos[0] = new Sonido("Gatito liiiindo", R.raw.gato, "");
		 sonidos[1] = new Sonido("smsmsmsmsms", R.raw.sms, "Horrible por cierto");
		 sonidos[2] = new Sonido("Nada", 500, "De nada");
		 return sonidos;
	 }
}
