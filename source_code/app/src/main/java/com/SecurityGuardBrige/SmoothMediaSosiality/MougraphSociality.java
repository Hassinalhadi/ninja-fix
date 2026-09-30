package com.SecurityGuardBrige.SmoothMediaSosiality;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Activity;
import android.view.View;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public class MougraphSociality implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f3495a;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(113, MougraphSociality.class);
        Hidden0.special_clinit_113_00(MougraphSociality.class);
    }

    public MougraphSociality(Activity activity) {
        this.f3495a = activity;
    }

    public static native void init(Activity activity);

    @Override // android.view.View.OnClickListener
    public native void onClick(View view);

    public native void showDetectionToast();
}
