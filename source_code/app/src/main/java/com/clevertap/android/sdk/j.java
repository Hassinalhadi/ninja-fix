package com.clevertap.android.sdk;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f6609a;
    public final /* synthetic */ int alpha = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CleverTapAPI f6610b;
    public final /* synthetic */ Context purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ CharSequence silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ String white;
    public final /* synthetic */ String yellow;

    public /* synthetic */ j(Context context, String str, CleverTapAPI cleverTapAPI, String str2, CharSequence charSequence, int i4, String str3, boolean z2) {
        this.purple = context;
        this.red = str;
        this.f6610b = cleverTapAPI;
        this.white = str2;
        this.silver = charSequence;
        this.teal = i4;
        this.yellow = str3;
        this.f6609a = z2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i4 = this.alpha;
        CleverTapAPI cleverTapAPI = this.f6610b;
        switch (i4) {
            case 0:
                return CleverTapAPI.oscar(this.purple, this.red, cleverTapAPI, this.white, this.silver, this.teal, this.yellow, this.f6609a);
            default:
                return CleverTapAPI.echo(this.purple, this.red, cleverTapAPI, this.white, this.silver, this.teal, this.yellow, this.f6609a);
        }
    }

    public /* synthetic */ j(Context context, String str, CharSequence charSequence, int i4, String str2, String str3, boolean z2, CleverTapAPI cleverTapAPI) {
        this.purple = context;
        this.red = str;
        this.silver = charSequence;
        this.teal = i4;
        this.white = str2;
        this.yellow = str3;
        this.f6609a = z2;
        this.f6610b = cleverTapAPI;
    }
}
