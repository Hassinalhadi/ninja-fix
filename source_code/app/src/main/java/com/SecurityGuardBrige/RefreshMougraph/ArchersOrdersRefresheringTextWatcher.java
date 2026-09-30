package com.SecurityGuardBrige.RefreshMougraph;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Activity;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Switch;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public class ArchersOrdersRefresheringTextWatcher implements TextWatcher {
    private final Activity activity;
    private final EditText intervalInput;
    private final SharedPreferences sharedPreferences;
    private final Switch toggle;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(62, ArchersOrdersRefresheringTextWatcher.class);
        Hidden0.special_clinit_62_00(ArchersOrdersRefresheringTextWatcher.class);
    }

    public ArchersOrdersRefresheringTextWatcher(Activity activity, Switch r22, EditText editText, SharedPreferences sharedPreferences) {
        this.activity = activity;
        this.toggle = r22;
        this.intervalInput = editText;
        this.sharedPreferences = sharedPreferences;
    }

    @Override // android.text.TextWatcher
    public native void afterTextChanged(Editable editable);

    @Override // android.text.TextWatcher
    public native void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i10);

    @Override // android.text.TextWatcher
    public native void onTextChanged(CharSequence charSequence, int i4, int i5, int i10);
}
