package youtube.kreizygames.vocesdelmahe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Adapter extends ArrayAdapter<Sonido> {

	private Context context;

	public Adapter(Context context, Sonido[] sonidos) {
		super(context, R.layout.estilo_fila, sonidos);
		this.context = context;
	}

	@Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View rowView = inflater.inflate(R.layout.estilo_fila, parent, false);
	    
	    Sonido sonido = getItem(position);
	    
	    TextView titulo = (TextView) rowView.findViewById(R.id.textView1);
	    TextView comentario = (TextView) rowView.findViewById(R.id.textView2);
	    
	    titulo.setText(sonido.getTitulo());
	    comentario.setText(sonido.getComentario());
	    
	    return rowView;
	}
}
