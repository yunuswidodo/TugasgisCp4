package e.yunus.pantiasuhansurabaya;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class dasboardDetailFragment extends Fragment {

    public dasboardDetailFragment() {
        // Required empty public constructor
    }
    TextView Getnama, Getjam, Gettelp, Getalamat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dasboard_detail, container, false);
        Getnama = (TextView) view.findViewById(R.id.getnama);
        Getjam = (TextView) view.findViewById(R.id.getJam);
        Gettelp = (TextView) view.findViewById(R.id.getTlp);
        Getalamat = (TextView) view.findViewById(R.id.getAlamat);

        Bundle b = getArguments();
        if (b!=null){
            String s=b.getString("s");
            Getnama.setText(s);
            switch (s){
                case"Panti Asuhan Arif Rahman Hakim":
                Getjam.setText ("Buka 24 jam");
                Gettelp.setText("(031) 5928244");
                Getalamat.setText("Jalan Arief Rachman Hakim Gang II/12, Kampung Deles, Klampis Ngasem, Kec. Sukolilo, Kota SBY, Jawa Timur 60117");
                break;

                case"Panti Asuhan Undaan Surabaya":
                    Getjam.setText ("07.00–20.00");
                    Gettelp.setText("(031) 5341627");
                    Getalamat.setText("Jl. Undaan Kulon, Peneleh, Kec. Genteng, Kota SBY, Jawa Timur 60274");
                    break;

                case"Panti Asuhan Yatim Piatu Al Mu'Min":
                    Getjam.setText ("Buka 24 jam");
                    Gettelp.setText("(031) 7526153");
                    Getalamat.setText("Jl Wisma Lidah Kulon B-C No.125, Lidah Kulon, Kec. Lakarsantri, Kota SBY, Jawa Timur 60213");
                    break;

                case"Panti Asuhan At Taqwa":
                    Getjam.setText ("07.00–21.00");
                    Gettelp.setText("(031) 7457103");
                    Getalamat.setText("No 27, Jl. Manukan Rukun No.26, Manukan Kulon, Surabaya Barat, Kota SBY, Jawa Timur 60197");
                    break;

                case"Panti Asuhan Al-Fatih":
                    Getjam.setText ("07.30–15.30 minggu TUTUP");
                    Gettelp.setText("0812-3030-3980");
                    Getalamat.setText("PERUMAHAN CITRA GRAHA MANDIRI, BLOK G NO, Jl. Greges, 4, Greges, Kec. Pabean Cantian, Kota SBY, Jawa Timur 60183");
                    break;

                case"Panti Asuhan Al Kahfi":
                    Getjam.setText ("Buka 24 jam");
                    Gettelp.setText("(031) 5944461");
                    Getalamat.setText("Jl. Nginden Baru IV No.22, Ngenden Jangkungan, Kec. Sukolilo, Kota SBY, Jawa Timur 60118");
                    break;

                case"Panti Asuhan BJ Habibie":
                    Getjam.setText ("TANPA KETERANGAN");
                    Gettelp.setText("(031) 5950362");
                    Getalamat.setText("Jl. Keputih Tegal I No.25, Keputih, Kec. Sukolilo, Kota SBY, Jawa Timur 60111");
                    break;

                case"Panti Asuhan KH. AR. FAKHRUDDIN":
                    Getjam.setText ("Buka 24 jam");
                    Gettelp.setText("TANPA KETERANGAN");
                    Getalamat.setText("Gang Nomer 23-, Jalan Keputih II No.25, Keputih, Kec. Sukolilo, Kota SBY, Jawa Timur 6011");
                    break;

                case"Panti Asuhan Karya Asih":
                    Getjam.setText ("TANPA KETERANGAN");
                    Gettelp.setText("(031) 3712478");
                    Getalamat.setText("Jalan Gembong 4 No.26, Kapasan, Kec. Simokerto, Kota SBY, Jawa Timur 60141");
                    break;

                case"Panti Asuhan Ibnu Sina Kertajaya":
                    Getjam.setText ("08.00–20.00 minggu TUTUP");
                    Gettelp.setText("(031) 99022923");
                    Getalamat.setText("Jl. Gubeng Kertajaya VI D No.11, Kertajaya, Kec. Gubeng, Kota SBY, Jawa Timur 60282");
                    break;

                case"Panti Asuhan Yatim Cahaya Insani":
                    Getjam.setText ("07.00–22.00");
                    Gettelp.setText("(031) 5022818");
                    Getalamat.setText("Jl. Gubeng Kertajaya III No.3A, Gubeng, Kec. Gubeng, Kota SBY, Jawa Timur 60246");
                    break;

                case"Griya Yatim & Dhuafa surabaya":
                    Getjam.setText ("08.00–21.00");
                    Gettelp.setText("0881-1359-431");
                    Getalamat.setText("Jalan Rungkut Mapan, Blok FD No. 4, Rungkut Tengah, Surabaya, Kota SBY, Jawa Timur 60293");
                    break;

                case"Panti Asuhan Wachid Hasyim":
                    Getjam.setText ("00.00–21.00");
                    Gettelp.setText("(031) 8415943");
                    Getalamat.setText("Jl. Rungkut Menanggal No.40, Rungkut Menanggal, Kec. Gn. Anyar, Kota SBY, Jawa Timur 60234");
                    break;

                case"Panti Al-Hikmah Muhammadiyah Kedung Asem":
                    Getjam.setText ("06.00–21.00 selasa 24 JAM");
                    Gettelp.setText("(031) 8713074");
                    Getalamat.setText("Wisma Kedung Asem Indah No.F-41, Kedung Baruk, Kec. Rungkut, Kota SBY, Jawa Timur 60298");
                    break;

                case"Panti Asuhan Amanah":
                    Getjam.setText ("TANPA KETERANGAN");
                    Gettelp.setText("(031) 8700580");
                    Getalamat.setText("Gg. II No.30b, Penjaringan Sari, Kec. Rungkut, Kota SBY, Jawa Timur 60297");
                    break;

                case"Yayasan Panti Asuhan Sabilillah Surabaya":
                    Getjam.setText ("06.00–22.00");
                    Gettelp.setText("(031) 8705574");
                    Getalamat.setText("Perum YKP, Jl. Rungkut Lrg. Gg. 5 No.E/13, Kali Rungkut, Kec. Rungkut, Kota SBY, Jawa Timur 60293");
                    break;

                case"Rumah Anak Pondok Kasih":
                    Getjam.setText ("08.00–16.00 minggu TUTUP");
                    Gettelp.setText("(031) 8273250");
                    Getalamat.setText("Jl. Gayungan PTT No.66, Gayungan, Kec. Gayungan, Kota SBY, Jawa Timur 60235");
                    break;

                case"Panti Asuhan Lydia":
                    Getjam.setText ("TANPA KETERANGAN");
                    Gettelp.setText("(031) 8280936");
                    Getalamat.setText("Jl. Gayungsari V No.17-21, Gayungan, Kec. Gayungan, Kota SBY, Jawa Timur 60235");
                    break;

                case"Panti Asuhan Yatim Aisyiyah":
                    Getjam.setText ("TANPA KETERANGAN");
                    Gettelp.setText("(031) 8282488");
                    Getalamat.setText("Jl. Kebonsari Baru No.36 A, Kebonsari, Kec. Jambangan, Kota SBY, Jawa Timur 60233");
                    break;

                case"Panti Asuhan Al Jabbar":
                    Getjam.setText ("TANPA KETERANGAN");
                    Gettelp.setText("(031) 71111475");
                    Getalamat.setText("Jl. Penjaringan Tim. XIV Blok PM No.32, Penjaringan Sari, Rungkut, Surabaya City, East Java 60297");
                    break;


            }
        }
     return view;

    }


}
