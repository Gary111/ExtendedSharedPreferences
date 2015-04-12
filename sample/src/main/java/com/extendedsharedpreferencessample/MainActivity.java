package com.extendedsharedpreferencessample;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.extendedsharedpreferences.ExtendedSharedPreferences;
import com.extendedsharedpreferences.converter.GsonConverter;
import com.google.common.base.Objects;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = MainActivity.class.getName();

    private ExtendedSharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = new ExtendedSharedPreferences.Builder(this)
                .setName("MyPrefs")
                .setMode(Context.MODE_PRIVATE)
                .setConverter(new GsonConverter())
                .build();

        // Create complex object
        final ComplexObject actual = new ComplexObject().fillSelf();
        // Write it to SharedPreferences
        sharedPreferences
                .edit()
                .putObject("test", ComplexObject.class, actual)
                .commit();
        // Get it from SharedPreferences
        ComplexObject expected = sharedPreferences.getObject("test", ComplexObject.class, null);
        // Check equality
        Log.d(TAG, "The result of comparison of 'actual' and 'expected' is " + Objects.equal(actual, expected));
        // Remove preference
        sharedPreferences
                .edit()
                .putObject("test", ComplexObject.class, null)
                .commit();
        // Try to get object from SharedPreferences
        expected = sharedPreferences.getObject("test", ComplexObject.class, null);
        // Check equality
        Log.d(TAG, "The result of comparison of 'null' and 'expected' is " + Objects.equal(null, expected));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
