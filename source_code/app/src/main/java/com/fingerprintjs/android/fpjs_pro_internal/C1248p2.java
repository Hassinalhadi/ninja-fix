package com.fingerprintjs.android.fpjs_pro_internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.jvm.functions.Function0;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.p2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1248p2 {
    public static int delta = 0;
    public static int echo = 1;
    public final C1244o2 alpha;
    public final C1227k1 bravo;
    public final Z charlie;

    public C1248p2(C1244o2 c1244o2, C1227k1 c1227k1, Z z2) {
        this.alpha = c1244o2;
        this.bravo = c1227k1;
        this.charlie = z2;
    }

    public final String alpha() {
        int i4 = echo;
        delta = ((i4 ^ 79) + ((i4 & 79) << 1)) % 128;
        try {
            Object[] objArr = {0L, r9, r9, new C1223j1(this.bravo), 7, null};
            Boolean bool = Boolean.FALSE;
            Object echo2 = am.echo(373658851);
            Object obj = "";
            if (echo2 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 52;
                int offsetAfter = 904 - TextUtils.getOffsetAfter("", 0);
                Class cls = Boolean.TYPE;
                echo2 = am.charlie(deadChar, touchSlop, offsetAfter, 532045125, "D8871", new Class[]{Long.TYPE, cls, cls, Function0.class, Integer.TYPE, Object.class});
            }
            Object invoke = ((Method) echo2).invoke(null, objArr);
            Result.Companion companion = Result.INSTANCE;
            if (!(invoke instanceof kotlin.k)) {
                int i5 = C1227k1.charlie;
                C1227k1.bravo = ((i5 & 85) + (i5 | 85)) % 128;
                obj = invoke;
            } else {
                int i10 = C1227k1.bravo;
                int i11 = i10 + 55;
                C1227k1.charlie = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 77 / 0;
                }
                C1227k1.charlie = (((i10 | 45) << 1) - (i10 ^ 45)) % 128;
            }
            String str = (String) obj;
            int i13 = C1227k1.charlie + 49;
            C1227k1.bravo = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = echo + 95;
                delta = i14 % 128;
                if (i14 % 2 == 0) {
                    return str;
                }
                throw null;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final String bravo() {
        echo = (delta + 117) % 128;
        try {
            Object obj = null;
            Object[] objArr = {0L, r9, r9, new Y(this.charlie), 7, null};
            Boolean bool = Boolean.FALSE;
            Object echo2 = am.echo(373658851);
            if (echo2 == null) {
                char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int red = 52 - Color.red(0);
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 904;
                Class cls = Boolean.TYPE;
                echo2 = am.charlie(c3, red, pressedStateDuration, 532045125, "D8871", new Class[]{Long.TYPE, cls, cls, Function0.class, Integer.TYPE, Object.class});
            }
            Object invoke = ((Method) echo2).invoke(null, objArr);
            Result.Companion companion = Result.INSTANCE;
            if (invoke instanceof kotlin.k) {
                int i4 = Z.bravo + 117;
                Z.alpha = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            } else {
                Z.bravo = (Z.alpha + 1) % 128;
                obj = invoke;
            }
            String str = (String) obj;
            int i5 = Z.alpha;
            Z.bravo = ((i5 & 119) + (i5 | 119)) % 128;
            if (str == null) {
                int i10 = delta;
                echo = ((i10 ^ 1) + ((i10 & 1) << 1)) % 128;
                str = "";
            }
            echo = (delta + 57) % 128;
            return str;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
