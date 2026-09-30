package com.google.android.material.appbar;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;

/* loaded from: classes2.dex */
public abstract class n {
    public static final int[] alpha = {R.attr.stateListAnimator};

    public static void alpha(AppBarLayout appBarLayout, float f5) {
        int integer = appBarLayout.getResources().getInteger(delivery.samurai.android.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j5 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, delivery.samurai.android.R.attr.state_liftable, -2130969908}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j5));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f5).setDuration(j5));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }
}
