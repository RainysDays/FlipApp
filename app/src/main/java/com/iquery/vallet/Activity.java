package com.iquery.vallet;

import android.app.SearchManager;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

public class Activity extends android.app.Activity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);

        //Add SearchWidget
        MenuItem mi = menu.findItem(R.id.action_search);
        SearchManager sm = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView sv = (SearchView)menu.findItem(R.id.action_search).getActionView();
        sv.setSearchableInfo(sm.getSearchableInfo(getComponentName()));
        mi.expandActionView();
        return super.onCreateOptionsMenu(menu);
    }
}
