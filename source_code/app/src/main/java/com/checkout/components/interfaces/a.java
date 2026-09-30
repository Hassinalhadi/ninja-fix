package com.checkout.components.interfaces;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static JsonAdapter a(Moshi moshi, Class cls, String str, String str2) {
        JsonAdapter adapter = moshi.adapter(cls, u.alpha, str);
        Intrinsics.delta(adapter, str2);
        return adapter;
    }
}
