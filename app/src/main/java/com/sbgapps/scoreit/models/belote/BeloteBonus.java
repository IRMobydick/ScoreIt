/*
 * Copyright (c) 2016 SBG Apps
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

package com.sbgapps.scoreit.models.belote;

import android.content.Context;

import com.google.gson.annotations.SerializedName;
import com.sbgapps.scoreit.R;
import com.sbgapps.scoreit.models.Player;

import java.io.Serializable;

/**
 * Created by Stéphane on 21/08/2014.
 */
public class BeloteBonus implements Serializable {

    public static final int BONUS_BELOTE = 0;
    public static final int BONUS_RUN_3 = 1;
    public static final int BONUS_RUN_4 = 2;
    public static final int BONUS_RUN_5 = 3;
    public static final int BONUS_FOUR_NORMAL = 4;
    public static final int BONUS_FOUR_NINE = 5;
    public static final int BONUS_FOUR_JACK = 6;

    @SerializedName("bonus")
    private int mBonus;
    @SerializedName("player")
    private int mPlayer;

    public BeloteBonus(int bonus) {
        this(bonus, Player.PLAYER_1);
    }

    public BeloteBonus(int bonus, int player) {
        mBonus = bonus;
        mPlayer = player;
    }

    public static String getLiteralBonus(Context context, int bonus) {
        switch (bonus) {
            case BeloteBonus.BONUS_BELOTE:
                return context.getString(R.string.belote_bonus_belote);
            case BeloteBonus.BONUS_RUN_3:
                return context.getString(R.string.belote_bonus_run_3);
            case BeloteBonus.BONUS_RUN_4:
                return context.getString(R.string.belote_bonus_run_4);
            case BeloteBonus.BONUS_RUN_5:
                return context.getString(R.string.belote_bonus_run_5);
            case BeloteBonus.BONUS_FOUR_NORMAL:
                return context.getString(R.string.belote_bonus_normal_four);
            case BeloteBonus.BONUS_FOUR_NINE:
                return context.getString(R.string.belote_bonus_nine_four);
            case BeloteBonus.BONUS_FOUR_JACK:
                return context.getString(R.string.belote_bonus_jack_four);
        }
        return null;
    }

    public int get() {
        return mBonus;
    }

    public void set(int bonus) {
        mBonus = bonus;
    }

    public int getPlayer() {
        return mPlayer;
    }

    public void setPlayer(int player) {
        mPlayer = player;
    }
}
