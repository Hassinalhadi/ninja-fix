package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class uS extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final uS f11470b = new uS();

    public uS() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        Integer num;
        JSONObject jSONObject = (JSONObject) obj;
        String str3 = uNM.f11464b;
        if (!jSONObject.isNull(str3)) {
            int i4 = jSONObject.getInt(str3);
            String str4 = uNM.f11463W;
            if (!jSONObject.isNull(str4)) {
                int i5 = jSONObject.getInt(str4);
                String str5 = uNM.f11465f9;
                if (!jSONObject.isNull(str5)) {
                    long j5 = jSONObject.getLong(str5);
                    String str6 = uNM.sVU;
                    if (!jSONObject.isNull(str6)) {
                        boolean z2 = jSONObject.getBoolean(str6);
                        String str7 = uNM.gmP;
                        if (!jSONObject.isNull(str7)) {
                            boolean z10 = jSONObject.getBoolean(str7);
                            String str8 = uNM.f11461J;
                            Boolean bool = null;
                            if (!jSONObject.isNull(str8)) {
                                str = jSONObject.getString(str8);
                            } else {
                                str = null;
                            }
                            String str9 = uNM.PqK;
                            if (!jSONObject.isNull(str9)) {
                                str2 = jSONObject.getString(str9);
                            } else {
                                str2 = null;
                            }
                            String str10 = uNM.f11462V;
                            if (!jSONObject.isNull(str10)) {
                                num = Integer.valueOf(jSONObject.getInt(str10));
                            } else {
                                num = null;
                            }
                            String str11 = uNM.olU;
                            if (!jSONObject.isNull(str11)) {
                                bool = Boolean.valueOf(jSONObject.getBoolean(str11));
                            }
                            return new MM(i4, i5, j5, z2, z10, str, str2, num, bool);
                        }
                        throw new IllegalArgumentException("Non-nullable field missing in JSON.");
                    }
                    throw new IllegalArgumentException("Non-nullable field missing in JSON.");
                }
                throw new IllegalArgumentException("Non-nullable field missing in JSON.");
            }
            throw new IllegalArgumentException("Non-nullable field missing in JSON.");
        }
        throw new IllegalArgumentException("Non-nullable field missing in JSON.");
    }
}
