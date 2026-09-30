package com.incognia.internal;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class LTK {
    public static final ArrayList gmP;

    /* renamed from: W, reason: collision with root package name */
    public final z5 f9057W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f9058b;

    /* renamed from: f9, reason: collision with root package name */
    public final ArrayList f9059f9;
    public TCP sVU;

    static {
        ArrayList arrayList = new ArrayList(3);
        for (int i4 = 0; i4 < 3; i4++) {
            arrayList.add(Long.valueOf(TimeUnit.SECONDS.toMillis(5L)));
        }
        gmP = arrayList;
    }

    public LTK(S0A s0a, pl2 pl2Var, z5 z5Var) {
        this.f9058b = pl2Var;
        this.f9057W = z5Var;
        String str = (String) wGk.f11731v.getValue();
        ArrayList arrayList = gmP;
        JSONArray optJSONArray = ((JSONObject) s0a.f9574b.get()).optJSONArray(str);
        if (optJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            try {
                int length = optJSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    arrayList2.add(Long.valueOf(optJSONArray.getLong(i4)));
                }
                arrayList = arrayList2;
            } catch (JSONException unused) {
            }
        }
        this.f9059f9 = arrayList;
    }
}
