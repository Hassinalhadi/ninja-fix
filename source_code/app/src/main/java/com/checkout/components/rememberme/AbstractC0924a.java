package com.checkout.components.rememberme;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.checkout.components.rememberme.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0924a {
    public static JsonAdapter a(Moshi moshi, Class cls, String str, String str2) {
        JsonAdapter adapter = moshi.adapter(cls, kotlin.collections.u.alpha, str);
        Intrinsics.delta(adapter, str2);
        return adapter;
    }
}
