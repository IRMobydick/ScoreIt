/*
 * Copyright (c) 2014 SBG Apps
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sbgapps.scoreit;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sbgapps.scoreit.util.FileSaveUtil;

/**
 * Created by Stéphane on 04/08/2014.
 */
public class SavedGameActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = new ListView(this);
        listView.setFitsSystemWindows(true);
        setContentView(listView);
        setupFauxDialog();

        String game = getIntent().getStringExtra("game");
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                FileSaveUtil.getSavedFiles(this, game)));
    }
}
