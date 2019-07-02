package e.yunus.pantiasuhansurabaya;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //auto home
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new homeFragment()).commit();

        BottomNavigationView bottonNav = findViewById(R.id.navigation);
        bottonNav.setOnNavigationItemSelectedListener(navListener);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragment_container,new schoolFragment());

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null ;

                    switch (item.getItemId()){
                        case R.id.navigation_home:
                            selectedFragment = new homeFragment();
                            break;

                        case R.id.navigation_dashboard:
                            selectedFragment = new dashboardFragment();
                            break;

                        case R.id.navigation_school:
                            selectedFragment = new schoolFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };


    //kefragmentdasboarddetail

    public void fl(String s) {
        FragmentManager manager1 = getSupportFragmentManager();
        FragmentTransaction tl = manager1.beginTransaction();
        dasboardDetailFragment f2 = new dasboardDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("s", s);
        f2.setArguments(bundle);
        tl.replace(R.id.fragment_container,f2);
        tl.commit();
    }


}
