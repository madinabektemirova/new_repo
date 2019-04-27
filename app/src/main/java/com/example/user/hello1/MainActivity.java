package com.example.user.hello1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.webkit.WebView;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        wv = findViewById(R.id.wv);
        wv.loadUrl("file:///android_asset/menu.html");
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            wv.loadUrl("file:///android_asset/about.html");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.menu) {
            // Handle the camera action
            wv.loadUrl("file:///android_asset/menu.html");

        } else if (id == R.id.dars1) {
            wv.loadUrl("file:///android_asset/dars1.html");


        } else if (id == R.id.dars2) {
            wv.loadUrl("file:///android_asset/dars2.html");


        } else if (id == R.id.dars3) {
            wv.loadUrl("file:///android_asset/dars3.html");

        } else if (id == R.id.dars4) {
            wv.loadUrl("file:///android_asset/dars4.html");

        } else if (id == R.id.dars5) {
            wv.loadUrl("file:///android_asset/dars5.html");

        } else if (id == R.id.dars6) {
            wv.loadUrl("file:///android_asset/dars6.html");

        } else if (id == R.id.dars7) {
            wv.loadUrl("file:///android_asset/dars7.html");

        }else if (id == R.id.dars8) {
            wv.loadUrl("file:///android_asset/dars8.html");

        }else if (id == R.id.dars9) {
            wv.loadUrl("file:///android_asset/dars9.html");

        }else if (id == R.id.dars10) {
            wv.loadUrl("file:///android_asset/dars10.html");

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
