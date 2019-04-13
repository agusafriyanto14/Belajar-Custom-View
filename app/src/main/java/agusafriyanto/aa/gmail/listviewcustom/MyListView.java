package agusafriyanto.aa.gmail.listviewcustom;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
class MyListAdapter extends ArrayAdapter<String> {
    // TODO 1: membuat kelas yang tidak bisa diturunkan (extends)
    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;

    //TODO 2: megabungkan array  judul, sub judul dan gambar kedalam  MyListAdapter
    public MyListAdapter(Activity context, String[] maintitle,String[] subtitle, Integer[] imgid)
    {
        super(context, R.layout.mylis, maintitle);
// TODO 3: Auto-generated constructor stub
        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imgid=imgid;
    }
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylis, null,true);

        //TODO 4: mengkoneksikan layout dengan Kelas java
        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);

//TODO 5:melakan judul, sub judul dan gambar sesuia dengan index
        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);
        return rowView;
    };
}