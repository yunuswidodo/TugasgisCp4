package e.yunus.pantiasuhansurabaya;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Collections;

public class dashboardFragment extends Fragment {
    ListView lv;

    SearchView searchView;
    ArrayAdapter<String> adapter;
    ArrayList<String> data;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        lv = (ListView) view.findViewById(R.id.list_item);
        data = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_activated_1,data);
        lv.setAdapter(adapter);
        data.add("Panti Asuhan Arif Rahman Hakim");
        data.add("Panti Asuhan Undaan Surabaya");
        data.add("Panti Asuhan Yatim Piatu Al Mu'Min");
        data.add("Panti Asuhan At Taqwa");
        data.add("Panti Asuhan Al-Fatih");
        data.add("Panti Asuhan Al Kahfi");
        data.add("Panti Asuhan BJ Habibie");
        data.add("Panti Asuhan KH. AR. FAKHRUDDIN");
        data.add("Panti Asuhan Karya Asih");
        data.add("Panti Asuhan Ibnu Sina Kertajaya");
        data.add("Panti Asuhan Yatim Cahaya Insani");
        data.add("Griya Yatim & Dhuafa surabaya");
        data.add("Panti Asuhan Wachid Hasyim");
        data.add("Panti Al-Hikmah Muhammadiyah Kedung Asem");
        data.add("Panti Asuhan Amanah");
        data.add("Yayasan Panti Asuhan Sabilillah Surabaya");
        data.add("Rumah Anak Pondok Kasih");
        data.add("Panti Asuhan Lydia");
        data.add("Panti Asuhan Yatim Aisyiyah");
        data.add("Panti Asuhan Al Jabbar");
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s = data.get(position);
                MainActivity mnl =(MainActivity) getActivity();
                mnl.fl(s);

            }
        });

        return view;
    }

}
