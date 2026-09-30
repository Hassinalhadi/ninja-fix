package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class R0 {
    public static int bravo = 0;
    public static int charlie = 0;
    public static int delta = 0;
    public static int echo = 1;
    public final Context alpha;

    public R0(Context context) {
        this.alpha = context;
    }

    public static final /* synthetic */ String alpha(int i4) {
        int i5 = delta;
        int i10 = (i5 & 5) + (i5 | 5);
        echo = i10 % 128;
        int i11 = i10 % 2;
        String charlie2 = charlie(i4);
        if (i11 == 0) {
            int i12 = 79 / 0;
        }
        return charlie2;
    }

    public static String bravo(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        Class cls3 = Long.TYPE;
        int i14 = ~i12;
        int i15 = ~(i14 | i5);
        int i16 = ~(i5 | i12);
        int i17 = i14 | (~i5);
        int i18 = i16 | (~(i17 | i10));
        int i19 = (~i10) | i17;
        int i20 = (748945408 * i11) + (1924136960 * i4) + ((-1666056192) * i13) + (1283506547 * i19) + ((-1283506547) * i18) + (1727954202 * i15) + ((-382549644) * i12) + (1345404558 * i5) + 1061748736;
        int papa = AbstractC2327c.papa(i11, -1730424158, (1134938392 * i4) + i5 + i12 + i13);
        int i21 = i18 * (-471);
        int i22 = i19 * 471;
        int i23 = ((-1338016710) * i11) + ((-1451741640) * i4) + (1914918157 * i13) + i22 + i21 + (i15 * (-942)) + (i12 * 1914918628) + (i5 * 1914917686) + 639827133;
        Object obj = "";
        if (AbstractC2327c.quebec(papa, -1605042176, i23, -230752256, (912850944 * papa) + i20) != 1) {
            try {
                Object[] objArr2 = {0L, r9, r9, new P0((R0) objArr[0]), 7, null};
                Boolean bool = Boolean.FALSE;
                Object echo2 = am.echo(373658851);
                if (echo2 == null) {
                    echo2 = am.charlie((char) (ViewConfiguration.getTouchSlop() >> 8), 51 - TextUtils.indexOf((CharSequence) "", '0', 0), KeyEvent.normalizeMetaState(0) + 904, 532045125, "D8871", new Class[]{cls3, cls2, cls2, Function0.class, cls, Object.class});
                }
                Object invoke = ((Method) echo2).invoke(null, objArr2);
                Result.Companion companion = Result.INSTANCE;
                if (invoke instanceof kotlin.k) {
                    int i24 = (echo + 35) % 128;
                    delta = i24;
                    echo = (i24 + 117) % 128;
                } else {
                    int i25 = echo;
                    delta = (((i25 | 11) << 1) - (i25 ^ 11)) % 128;
                    obj = invoke;
                }
                return (String) obj;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        try {
            Object[] objArr3 = {0L, r9, r9, new Q0((R0) objArr[0]), 7, null};
            Boolean bool2 = Boolean.FALSE;
            Object echo3 = am.echo(373658851);
            if (echo3 == null) {
                echo3 = am.charlie((char) KeyEvent.normalizeMetaState(0), ExpandableListView.getPackedPositionChild(0L) + 53, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 904, 532045125, "D8871", new Class[]{cls3, cls2, cls2, Function0.class, cls, Object.class});
            }
            Object invoke2 = ((Method) echo3).invoke(null, objArr3);
            Result.Companion companion2 = Result.INSTANCE;
            if (invoke2 instanceof kotlin.k) {
                int i26 = echo;
                int i27 = (i26 & 59) + (i26 | 59);
                delta = i27 % 128;
                if (i27 % 2 != 0) {
                    throw null;
                }
            } else {
                obj = invoke2;
            }
            return (String) obj;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    public static String charlie(int i4) {
        int i5 = echo;
        int i10 = (((i5 | 99) << 1) - (i5 ^ 99)) % 128;
        delta = i10;
        switch (i4) {
            case 2:
                int i11 = i5 + 47;
                delta = i11 % 128;
                if (i11 % 2 == 0) {
                    return "good";
                }
                throw null;
            case 3:
                return "overheat";
            case 4:
                delta = (i5 + 85) % 128;
                return "dead";
            case 5:
                return "over voltage";
            case 6:
                int i12 = i10 + 15;
                echo = i12 % 128;
                if (i12 % 2 != 0) {
                    return "unspecified failure";
                }
                throw null;
            case 7:
                return "cold";
            default:
                return "unknown";
        }
    }

    public static final /* synthetic */ Context delta(R0 r02) {
        int i4 = (delta + 71) % 128;
        echo = i4;
        Context context = r02.alpha;
        delta = (((i4 | 25) << 1) - (i4 ^ 25)) % 128;
        return context;
    }
}
