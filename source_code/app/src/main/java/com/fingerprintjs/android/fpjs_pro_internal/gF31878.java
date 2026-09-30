package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.zendesk.service.HttpConstants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0003\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/gF31878;", "T", "", "com/fingerprintjs/android/fpjs_pro_internal/x1", "com/fingerprintjs/android/fpjs_pro_internal/y1"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class gF31878<T> {
    public static int delta = 0;
    public static int echo = 1;
    public final String alpha;
    public final component2 bravo;
    public final Object charlie;

    public gF31878(String str, Object obj, component2 component2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this.alpha = str;
        this.bravo = component2Var;
        Object wrap = JSONObject.wrap(obj);
        this.charlie = wrap == null ? JSONObject.NULL : wrap;
    }

    public String alpha() {
        int i4 = delta + 59;
        echo = i4 % 128;
        int i5 = i4 % 2;
        String str = this.alpha;
        if (i5 == 0) {
            int i10 = 84 / 0;
        }
        return str;
    }

    public final JSONObject bravo() {
        JSONObject jSONObject = new JSONObject(kotlin.collections.y.yankee(CollectionsKt.peach(new Pair(P28427.E1.echo.vD14832N6715(), Integer.valueOf(charlie().getEcho())), new Pair(P28427.C1065i5.echo.vD14832N6715(), this.charlie))));
        int i4 = echo + 45;
        delta = i4 % 128;
        if (i4 % 2 == 0) {
            return jSONObject;
        }
        throw null;
    }

    public component2 charlie() {
        delta = (echo + 123) % 128;
        int bravo = d3.bravo();
        int i4 = ~bravo;
        int i5 = ~((i4 ^ (-194397274)) | (i4 & (-194397274)));
        int i10 = (((i5 & 1601813915) | (1601813915 ^ i5)) * (-1042)) + 930575582;
        int i11 = -(-((((-194397274) ^ bravo) | ((-194397274) & bravo)) * 521));
        int i12 = (i10 & i11) + (i10 | i11);
        int i13 = ~((bravo & (-1601813916)) | ((-1601813916) ^ bravo));
        int i14 = (i13 & 1416214914) | (1416214914 ^ i13);
        int i15 = (i4 & 1601813915) | (i4 ^ 1601813915);
        int i16 = ~((i15 & (-194397274)) | (i15 ^ (-194397274)));
        int i17 = (((i14 & i16) | (i14 ^ i16)) * 521) + i12;
        int identityHashCode = System.identityHashCode(this);
        int i18 = (((~((470845223 ^ identityHashCode) | (470845223 & identityHashCode))) | 403735296) * (-502)) + 1539164333;
        int i19 = ~identityHashCode;
        int i20 = (i19 & 470845223) | (470845223 ^ i19);
        int i21 = (~((i20 & 107152623) | (i20 ^ 107152623))) * (-502);
        int i22 = (i18 & i21) + (i18 | i21);
        int i23 = -(-(((~((identityHashCode & (-107152624)) | ((-107152624) ^ identityHashCode))) | 470845223) * HttpConstants.HTTP_BAD_GATEWAY));
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        component2 component2Var = this.bravo;
        if (i17 <= i24) {
            int i25 = 26 / 0;
        }
        return component2Var;
    }
}
