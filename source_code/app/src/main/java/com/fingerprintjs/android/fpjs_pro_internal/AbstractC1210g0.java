package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/g0;", "", Constants.INAPP_DATA_TAG, "a", "c", "b", "Lcom/fingerprintjs/android/fpjs_pro_internal/g0$d;", "Lcom/fingerprintjs/android/fpjs_pro_internal/g0$a;", "Lcom/fingerprintjs/android/fpjs_pro_internal/g0$c;", "Lcom/fingerprintjs/android/fpjs_pro_internal/g0$b;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1210g0 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/g0$a;", "Lcom/fingerprintjs/android/fpjs_pro_internal/g0;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.g0$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC1210g0 {

        @NotNull
        public static final a alpha = new AbstractC1210g0(null);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/g0$b;", "Lcom/fingerprintjs/android/fpjs_pro_internal/g0;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.g0$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC1210g0 {

        @NotNull
        public static final b alpha = new AbstractC1210g0(null);

        /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.g0, com.fingerprintjs.android.fpjs_pro_internal.g0$b] */
        static {
            int elapsedRealtime;
            int elapsedRealtime2;
            int i4 = Q1.silver;
            int i5 = i4 % 5851602;
            Q1.silver = i4 + 1;
            if (i5 != 0) {
                elapsedRealtime = Q1.teal;
            } else {
                elapsedRealtime = (int) SystemClock.elapsedRealtime();
                Q1.teal = elapsedRealtime;
            }
            int i10 = (~elapsedRealtime) | (-1288731481);
            int i11 = ~i10;
            int i12 = 812310245 - (~(-(-((((i11 & 1153444608) | (1153444608 ^ i11)) | (~(((-590020770) ^ elapsedRealtime) | ((-590020770) & elapsedRealtime)))) * (-252)))));
            int i13 = ~((i10 & (-725307642)) | (i10 ^ (-725307642)));
            int i14 = ~(elapsedRealtime | (-590020770));
            int i15 = (((i14 & i13) | (i13 ^ i14)) * 252) + (i12 & (-1638621320)) + ((-1638621320) | i12);
            int i16 = Q1.silver;
            int i17 = i16 % 5851602;
            Q1.silver = i16 + 1;
            if (i17 != 0) {
                elapsedRealtime2 = Q1.teal;
            } else {
                elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                Q1.teal = elapsedRealtime2;
            }
            int i18 = ~(((-1882528341) & elapsedRealtime2) | ((-1882528341) ^ elapsedRealtime2));
            int i19 = (i18 & 270539344) | (270539344 ^ i18);
            int i20 = ~elapsedRealtime2;
            int i21 = (i20 ^ (-1814020143)) | (i20 & (-1814020143));
            int i22 = ~(i21 | 1882528340);
            int i23 = 1082521112 - (~(-(-(((i19 & i22) | (i19 ^ i22)) * 886))));
            int i24 = ~(i20 | 1882528340);
            int i25 = -(-(((i24 & (-1814020143)) | ((-1814020143) ^ i24)) * (-1772)));
            int i26 = (i23 & i25) + (i25 | i23);
            int i27 = -(-((~i21) * 886));
            if (i15 > (i26 & i27) + (i27 | i26)) {
            } else {
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/g0$c;", "Lcom/fingerprintjs/android/fpjs_pro_internal/g0;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.g0$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC1210g0 {

        @NotNull
        public static final c alpha = new AbstractC1210g0(null);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/g0$d;", "Lcom/fingerprintjs/android/fpjs_pro_internal/g0;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.g0$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC1210g0 {

        @NotNull
        public static final d alpha = new AbstractC1210g0(null);
    }

    public AbstractC1210g0(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
