package projects.richie.com.projects;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ListView forecastList;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        setHasOptionsMenu(true);

        String[] forecast_items = {"Today-Monday-21/6",
                "Tomorrow-Tuesday-22/61", "Tuesday-Sunday-21/6", "Tuesday-Sunday-21/6", "Tuesday-Sunday-21/6",
                "Tuesday-Sunday-21/6"
        };

        List<String> list = new ArrayList<String>(Arrays.asList(forecast_items));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, list);
        forecastList = (ListView) view.findViewById(R.id.listView_forecast);
        forecastList.setAdapter(adapter);

        return view;
    }
}
