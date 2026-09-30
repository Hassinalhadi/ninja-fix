package com.incognia.internal;

import com.clevertap.android.sdk.Constants;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public abstract class RnB {
    public static final ArrayList b(String str) {
        if (str.length() == 0) {
            return null;
        }
        List maroon = StringsKt.maroon(str, new String[]{Constants.SEPARATOR_COMMA}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : maroon) {
            String str2 = (String) obj;
            if (str2.length() > 0 && !Intrinsics.areEqual(str2, BuildConfig.TRAVIS)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
