package meteo.dang.com.meteo;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class SettingsActivity extends PreferenceActivity {

    private final static String LOG_TAG = "SettingsActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_setting);
        // Display the fragment as the main content.
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsActivityFragment())
                .commit();
    }

    /*
    @Override
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.pref_headers, target);
    }*/

    @Override
    protected boolean isValidFragment(String fragmentName) {
        Log.i(LOG_TAG, fragmentName);
        if (fragmentName.equals(SettingsActivityFragment.class.getName()))
            return true;
        return super.isValidFragment(fragmentName);
    }
}
