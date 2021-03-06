package myexam.th.lth.newpaper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import myexam.th.lth.newpaper.fragment.PaperFragmentFour;
import myexam.th.lth.newpaper.fragment.PaperFragmentOne;
import myexam.th.lth.newpaper.fragment.PaperFragmentThree;
import myexam.th.lth.newpaper.fragment.PaperFragmentTwo;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        BottomNavigationView bot = (BottomNavigationView)findViewById( R.id.bottomNav );
        bot.setOnNavigationItemSelectedListener( this );

        loadFragment( new PaperFragmentOne() );
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment;
        switch (item.getItemId()) {
            case R.id.navigation_hot:
                fragment = new PaperFragmentOne();
                loadFragment(fragment);
                return true;
            case R.id.navigation_trend:
                fragment = new PaperFragmentTwo();
                loadFragment(fragment);
                return true;
            case R.id.navigation_news:
                fragment = new PaperFragmentThree();
                loadFragment(fragment);
                return true;
            case R.id.navigation_profile:
                fragment = new PaperFragmentFour();
                loadFragment(fragment);
                return true;
        }
        return false;
    }

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.commit();
    }
}
