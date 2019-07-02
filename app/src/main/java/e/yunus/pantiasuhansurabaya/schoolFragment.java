package e.yunus.pantiasuhansurabaya;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class schoolFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_school, container, false);

        Button btnFragementyunus= (Button)view.findViewById(R.id.et_yunus);
        Button btnFragementlukman= (Button)view.findViewById(R.id.et_lukman);
        Button btnFragmentsholi = (Button)view.findViewById(R.id.et_sholi);

        btnFragmentsholi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new sholiFragment());
                fr.commit();
            }
        });


        btnFragementlukman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new lukmanFragment());
                fr.commit();
            }
        });

        btnFragementyunus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new yunusFragment());
                fr.commit();
            }
        });
        return view;

    }
}
