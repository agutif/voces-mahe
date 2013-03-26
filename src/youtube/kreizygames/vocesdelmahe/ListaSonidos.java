package youtube.kreizygames.vocesdelmahe;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ListaSonidos extends Activity {
	 public void onCreate(Bundle icicle) {
		 super.onCreate(icicle);
		 setContentView(R.layout.lista_sonidos);
		 ListView lista = (ListView) findViewById(R.id.listView1);
		 Sonido[] sonidos = generarSonidos();
		 lista.setAdapter(new Adapter(this, sonidos));
	 }
	 
	private Sonido[] generarSonidos(){
		 Sonido[] sonidos = new Sonido[3];
		 sonidos[0] = new Sonido("Sonido1", 50, "comentario1");
		 sonidos[1] = new Sonido("Sonido2", 500, "comentario2");
		 sonidos[2] = new Sonido("Sonido3", 500, "comentario3");
		 return sonidos;
	 }
}
