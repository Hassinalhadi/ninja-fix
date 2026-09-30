package com.SecurityGuardBrige.RefreshMougraph;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Activity;
import android.content.SharedPreferences;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public class ArchersOrdersRefresheringSwitchListener implements CompoundButton.OnCheckedChangeListener {
    private final Activity activity;
    private final EditText intervalInput;
    private final SharedPreferences sharedPreferences;
    private final Switch toggle;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(61, ArchersOrdersRefresheringSwitchListener.class);
        Hidden0.special_clinit_61_00(ArchersOrdersRefresheringSwitchListener.class);
    }

    public ArchersOrdersRefresheringSwitchListener(Activity activity, Switch r22, EditText editText, SharedPreferences sharedPreferences) {
        this.activity = activity;
        this.toggle = r22;
        this.intervalInput = editText;
        this.sharedPreferences = sharedPreferences;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public native void onCheckedChanged(CompoundButton compoundButton, boolean z2);
}
