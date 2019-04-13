package agusafriyanto.aa.gmail.listviewcustom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {
    //TODO 1: inisialiasi kelas layout dengan java
    ListView list;

    // TODO 2: Pembuatan Array untuk judul
    String[] maintitle = {
           "Youtebe", "Facebook","Email",
            "Github",

//TODO 3: Pembuatan Sub judul dengan Array
    };
    String[] subtitle = {
            "wwww.youtube.com/c/KesBer", "web.facebook.com/agusafriyanto.agus","agusafriyanto.aa@gmail.com",
            "https://github.com/agusafriyanto14",
    };

    //TODO 3: Pembuatan Sub judul dengan Array
    Integer[] imgid = {
           R.drawable.images,R.drawable.aa,R.drawable.bb,
            R.drawable.cc,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//TODO 5: Menampilkan layout Custem
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//TODO 6: menggabungkan Arrray  judul, sub judul dan gambar dengan activity
        MyListAdapter adapter = new MyListAdapter(this, maintitle, subtitle, imgid);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

// TODO 7: membuat autog enerated method
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(getApplicationContext(), "Place Your Second Option Code", Toast.LENGTH_SHORT).show();
/** TODO 8 : Menampilkan Toast(pesan/peringatan) "Place Your Third Option Code" saat menekan list yang berada pada index 0
* pesan yang ditampilkan hanyak sperskian detik. bisa juga memasukan perintah lain
 */

                } else if (position == 1) {
//code specific to 2nd list item
                    Toast.makeText(getApplicationContext(), "Place Your Second Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    Toast.makeText(getApplicationContext(), "Place Your Third Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 3) {
                    Toast.makeText(getApplicationContext(), "Place Your Forth Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 4) {
                    Toast.makeText(getApplicationContext(), "Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
                }
            }
        }
        );
    }
}