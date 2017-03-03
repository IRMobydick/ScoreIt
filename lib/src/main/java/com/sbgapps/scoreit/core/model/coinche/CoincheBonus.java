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

package com.sbgapps.scoreit.core.model.coinche;

import android.content.Context;
import android.support.annotation.IntDef;

import com.sbgapps.scoreit.core.R;
import com.sbgapps.scoreit.core.model.Player;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Stéphane on 21/08/2014.
 */
public class CoincheBonus {

    public static final int BONUS_BELOTE = 0;
    public static final int BONUS_RUN_3 = 1;
    public static final int BONUS_RUN_4 = 2;
    public static final int BONUS_RUN_5 = 3;
    public static final int BONUS_FOUR_NORMAL = 4;
    public static final int BONUS_FOUR_NINE = 5;
    public static final int BONUS_FOUR_JACK = 6;

    private int mBonus;
    private int mPlayer;

    public CoincheBonus(@CoincheBonuses int bonus) {
        this(bonus, Player.PLAYER_1);
    }

    public CoincheBonus(@CoincheBonuses int bonus, int player) {
        mBonus = bonus;
        mPlayer = player;
    }

    @CoincheBonuses
    public int get() {
        return mBonus;
    }

    public void set(@CoincheBonuses int bonus) {
        mBonus = bonus;
    }

    public int getPlayer() {
        return mPlayer;
    }

    public void setPlayer(int player) {
        mPlayer = player;
    }

    public static String getName(Context context, @CoincheBonuses int bonus) {
        switch (bonus) {
            case BONUS_BELOTE:
                return context.getString(R.string.coinche_bonus_belote);
            case BONUS_RUN_3:
                return context.getString(R.string.coinche_bonus_run_3);
            case BONUS_RUN_4:
                return context.getString(R.string.coinche_bonus_run_4);
            case BONUS_RUN_5:
                return context.getString(R.string.coinche_bonus_run_5);
            case BONUS_FOUR_NORMAL:
                return context.getString(R.string.coinche_bonus_normal_four);
            case BONUS_FOUR_NINE:
                return context.getString(R.string.coinche_bonus_nine_four);
            case BONUS_FOUR_JACK:
                return context.getString(R.string.coinche_bonus_jack_four);
        }
        return null;
    }

    @IntDef({BONUS_BELOTE, BONUS_RUN_3, BONUS_RUN_4, BONUS_RUN_5,
            BONUS_FOUR_NORMAL, BONUS_FOUR_NINE, BONUS_FOUR_JACK})
    @Retention(RetentionPolicy.SOURCE)
    public @interface CoincheBonuses {
    }
}