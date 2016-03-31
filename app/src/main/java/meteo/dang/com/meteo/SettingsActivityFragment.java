package meteo.dang.com.meteo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.PreferenceFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SettingsActivityFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SettingsActivityFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SettingsActivityFragment extends PreferenceFragment {


    public SettingsActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_general);
        EditTextPreference editTextPreference = (EditTextPreference) findPreference(getString(R.string.pref_location_key));
        ListPreference listPreference = (ListPreference) findPreference(getString(R.string.pref_unit_key));
    }

}
