package com.incognia.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class KE {

    /* renamed from: W, reason: collision with root package name */
    public static final String f9000W = (String) wGk.f11631L2.getValue();

    /* renamed from: f9, reason: collision with root package name */
    public static final String f9001f9 = (String) wGk.f11667X.getValue();

    /* renamed from: b, reason: collision with root package name */
    public final S0A f9002b;

    public KE(S0A s0a) {
        this.f9002b = s0a;
    }

    public static String W(String str) {
        if (str != null && str.length() != 0) {
            if (new Regex(W7z.f9832b).echo(str)) {
                return str;
            }
            return null;
        }
        return str;
    }

    public final String b(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        S0A s0a = this.f9002b;
        int optInt = ((JSONObject) s0a.f9574b.get()).optInt(f9000W, 250);
        String str2 = W7z.f9832b;
        int length = str.length();
        if (length < 0 || length > optInt) {
            return null;
        }
        return str;
    }

    public final List b(List list, List list2) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        int optInt = ((JSONObject) this.f9002b.f9574b.get()).optInt(f9001f9, 3);
        return list.size() <= optInt ? list : list2.isEmpty() ? CollectionsKt.r(list, optInt) : CollectionsKt.r(CollectionsKt.lime(list, CollectionsKt.D(list2)), optInt);
    }
}
