package e.yunus.pantiasuhansurabaya;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class homeFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;
    SupportMapFragment mapFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View v= inflater.inflate(R.layout.fragment_home, container, false);
        mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment == null){
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft= fm.beginTransaction();
            mapFragment= SupportMapFragment.newInstance();
            ft.replace(R.id.map, mapFragment).commit();
        }
        mapFragment.getMapAsync(this);
        return v;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng panti1 = new LatLng(-7.2902234,112.7794138);
        mMap.addMarker(new MarkerOptions().position(panti1).title("Panti Asuhan Arif Rahman Hakim "));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti1,10));

        LatLng panti2 = new LatLng(-7.2545151,112.7408265);
        mMap.addMarker(new MarkerOptions().position(panti2).title("Asuhan Undaan Surabaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti2,10));

        LatLng panti3 = new LatLng(-7.3065817,112.650608);
        mMap.addMarker(new MarkerOptions().position(panti3).title("Panti Asuhan Yatim Piatu Al Mu'Min"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti3,10));

        LatLng panti4 = new LatLng(-7.3065803,112.6177769);
        mMap.addMarker(new MarkerOptions().position(panti4).title("Panti Asuhan At Taqwa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti4,10));

        LatLng panti5 = new LatLng(-7.242592,112.7440283);
        mMap.addMarker(new MarkerOptions().position(panti5).title("Panti Asuhan Al-Fatih"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti5,10));

        LatLng panti6 = new LatLng(-7.242592,112.7440283);
        mMap.addMarker(new MarkerOptions().position(panti6).title("Panti Asuhan Al Kahfi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti6,10));

        LatLng panti7 = new LatLng(-7.2936014,112.7994235);
        mMap.addMarker(new MarkerOptions().position(panti7).title("Panti Asuhan BJ Habibie"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti7,10));

        LatLng panti8 = new LatLng(-7.288612,112.7975723);
        mMap.addMarker(new MarkerOptions().position(panti8).title("Panti Asuhan Muhammadiyah KH. AR. FAKHRUDDIN "));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti8,10));

        LatLng panti9 = new LatLng(-7.243167,112.7484893);
        mMap.addMarker(new MarkerOptions().position(panti9).title("Panti Asuhan Karya Asih"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti9,10));

        LatLng panti10 = new LatLng(-7.2804469,112.753454);
        mMap.addMarker(new MarkerOptions().position(panti10).title("Panti Asuhan Ibnu Sina Kertajaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti10,10));

        LatLng panti11 = new LatLng(-7.2770789,112.7496016);
        mMap.addMarker(new MarkerOptions().position(panti11).title("Panti Asuhan Yatim Cahaya Insani"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti11,10));

        LatLng panti12 = new LatLng(-7.334136,112.7732053);
        mMap.addMarker(new MarkerOptions().position(panti12).title("Griya Yatim & Dhuafa surabaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti12,10));

        LatLng panti13 = new LatLng(-7.3380664,112.7653644);
        mMap.addMarker(new MarkerOptions().position(panti13).title("Panti Asuhan Wachid Hasyim"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti13,10));

        LatLng panti14 = new LatLng(-7.3187317,112.7799045);
        mMap.addMarker(new MarkerOptions().position(panti14).title("Panti Al-Hikmah Muhammadiyah Kedung Asem"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti14,10));

        LatLng panti15 = new LatLng(-7.3246005,112.7811344);
        mMap.addMarker(new MarkerOptions().position(panti15).title("Panti Asuhan Amanah"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti15,10));

        LatLng panti16 = new LatLng(-7.3283804,112.7837322);
        mMap.addMarker(new MarkerOptions().position(panti16).title("Yayasan Panti Asuhan Sabilillah Surabaya  "));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti16,10));

        LatLng panti17 = new LatLng(-7.3351046,112.7235705);
        mMap.addMarker(new MarkerOptions().position(panti17).title("Rumah Anak Pondok Kasih"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti17,10));

        LatLng panti18 = new LatLng(-7.3327424,112.7215929);
        mMap.addMarker(new MarkerOptions().position(panti18).title("Panti Asuhan Lydia "));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti18,10));

        LatLng panti19 = new LatLng(-7.3327421,112.7062719);
        mMap.addMarker(new MarkerOptions().position(panti19).title("Panti Asuhan Yatim Aisyiyah"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti19,10));

        LatLng panti20 = new LatLng(-7.3177833,112.7827882);
        mMap.addMarker(new MarkerOptions().position(panti20).title("Panti Asuhan Al Jabbar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panti20,10));



    }
}
