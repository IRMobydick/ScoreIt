/*
 * Copyright 2013 SBG Apps
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package com.sbgapps.scoreit.view;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.sbgapps.scoreit.R;
import com.sbgapps.scoreit.adapter.DrawerArrayAdapter;

/**
 * Created by sbaiget on 28/02/14.
 */
public class DrawerOption implements DrawerItem {

    private final int mTextResId;
    private final int mImgResId;

    public DrawerOption(int textResId, int imgResId) {
        mTextResId = textResId;
        mImgResId = imgResId;
    }

    @Override
    public int getViewType() {
        return DrawerArrayAdapter.RowType.OPTION_ITEM.ordinal();
    }

    @Override
    public int getGame() {
        return -1;
    }

    @Override
    public View getView(LayoutInflater inflater, View convertView) {
        View view;
        if (null == convertView) {
            view = inflater.inflate(R.layout.list_item_drawer_option, null);
            TextView tv = (TextView) view.findViewById(R.id.drawer_entry);
            tv.setText(mTextResId);
            tv.setCompoundDrawablesWithIntrinsicBounds(mImgResId, 0, 0, 0);
        } else {
            view = convertView;
        }
        return view;
    }
}
