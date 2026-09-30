package com.fingerprintjs.android.fpjs_pro_internal;

import android.graphics.Color;
import android.location.Location;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.zendesk.service.HttpConstants;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public abstract class I0 {
    public static int alpha = 0;
    public static int bravo = 0;
    public static int charlie = 0;
    public static int delta = 1;
    public static int echo = 0;
    public static int foxtrot = 1;

    public static final long alpha(List list) {
        Object next;
        long j5;
        long j6;
        Iterator it = list.iterator();
        Long l10 = null;
        if (!it.hasNext()) {
            int i4 = echo;
            int i5 = (i4 ^ 39) + ((i4 & 39) << 1);
            foxtrot = i5 % 128;
            if (i5 % 2 != 0) {
                next = null;
            } else {
                throw null;
            }
        } else {
            next = it.next();
            if (!it.hasNext()) {
                int i10 = echo;
                int i11 = (((i10 | 53) << 1) - (i10 ^ 53)) % 128;
                foxtrot = i11;
                echo = (i11 + 25) % 128;
            } else {
                Long l11 = ((C1252q2) next).juliet;
                if (l11 != null) {
                    int i12 = echo + 75;
                    foxtrot = i12 % 128;
                    if (i12 % 2 == 0) {
                        j5 = l11.longValue();
                        int i13 = 40 / 0;
                    } else {
                        j5 = l11.longValue();
                    }
                } else {
                    foxtrot = (echo + 83) % 128;
                    j5 = 0;
                }
                int i14 = echo;
                foxtrot = (((i14 | 101) << 1) - (i14 ^ 101)) % 128;
                do {
                    Object next2 = it.next();
                    Long l12 = ((C1252q2) next2).juliet;
                    if (l12 != null) {
                        int i15 = foxtrot + 115;
                        echo = i15 % 128;
                        if (i15 % 2 != 0) {
                            j6 = l12.longValue();
                            int i16 = 83 / 0;
                        } else {
                            j6 = l12.longValue();
                        }
                    } else {
                        j6 = 0;
                    }
                    if (j5 < j6) {
                        next = next2;
                        j5 = j6;
                    }
                } while (it.hasNext());
                int i17 = echo;
                foxtrot = ((i17 & 23) + (i17 | 23)) % 128;
            }
        }
        C1252q2 c1252q2 = (C1252q2) next;
        if (c1252q2 != null) {
            int i18 = foxtrot;
            echo = (((i18 | 71) << 1) - (i18 ^ 71)) % 128;
            Long l13 = c1252q2.juliet;
            if (l13 != null) {
                long longValue = l13.longValue();
                Long l14 = c1252q2.echo;
                if (l14 != null) {
                    echo = (foxtrot + 109) % 128;
                    l10 = Long.valueOf(longValue - l14.longValue());
                } else {
                    echo = (foxtrot + 21) % 128;
                }
            } else {
                int i19 = echo;
                foxtrot = (((i19 | 19) << 1) - (i19 ^ 19)) % 128;
            }
            if (l10 != null) {
                return l10.longValue();
            }
        }
        return 0L;
    }

    public static final Long bravo(String str, JSONObject jSONObject) {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(Long.valueOf(jSONObject.getLong(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (m206constructorimpl instanceof kotlin.k) {
            m206constructorimpl = null;
        }
        return (Long) m206constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int charlie(List list) {
        boolean z2;
        int i4;
        int i5 = echo;
        int i10 = ((i5 | 81) << 1) - (i5 ^ 81);
        foxtrot = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 0;
            if (list != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && !(!list.isEmpty())) {
                int i12 = echo;
                foxtrot = (((i12 | 49) << 1) - (i12 ^ 49)) % 128;
                return 0;
            }
            Iterator it = list.iterator();
            echo = (foxtrot + 19) % 128;
            while (it.hasNext()) {
                int i13 = foxtrot;
                int i14 = (i13 & 17) + (i13 | 17);
                echo = i14 % 128;
                if (i14 % 2 == 0) {
                    if (((C1252q2) it.next()).bravo != null) {
                        int i15 = echo + 35;
                        int i16 = i15 % 128;
                        foxtrot = i16;
                        if (i15 % 2 == 0) {
                            i11 = ((i11 | 35) << 1) - (i11 ^ 35);
                            if (i11 < 0) {
                                i4 = i16 + 85;
                                echo = i4 % 128;
                                if (i4 % 2 == 0) {
                                    CollectionsKt.t();
                                    throw null;
                                }
                                CollectionsKt.t();
                                throw null;
                            }
                        } else {
                            i11 = (i11 | 1) + (i11 & 1);
                            if (i11 < 0) {
                                i4 = i16 + 85;
                                echo = i4 % 128;
                                if (i4 % 2 == 0) {
                                }
                            }
                        }
                    }
                } else {
                    String str = ((C1252q2) it.next()).bravo;
                    throw null;
                }
            }
            return i11;
        }
        throw null;
    }

    public static final Integer delta(String str, JSONObject jSONObject) {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(Integer.valueOf(jSONObject.getInt(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (m206constructorimpl instanceof kotlin.k) {
            m206constructorimpl = null;
        }
        return (Integer) m206constructorimpl;
    }

    public static final Long echo() {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        return (Long) component13.alpha(bk.component5(m206constructorimpl));
    }

    public static int foxtrot() {
        int i4 = alpha;
        int i5 = i4 % 5629425;
        alpha = i4 + 1;
        if (i5 != 0) {
            return bravo;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        bravo = elapsedCpuTime;
        return elapsedCpuTime;
    }

    public static void golf(int[] iArr) {
        for (int i4 = 0; i4 < iArr.length / 2; i4++) {
            int i5 = iArr[i4];
            iArr[i4] = iArr[(iArr.length - i4) - 1];
            iArr[(iArr.length - i4) - 1] = i5;
        }
    }

    public static long[] hotel(int i4, int i5) {
        long[] jArr = new long[4];
        jArr[0] = (i5 & 4294967295L) | ((i4 & 4294967295L) << 32);
        for (int i10 = 1; i10 < 4; i10++) {
            long j5 = jArr[i10 - 1];
            jArr[i10] = ((j5 ^ (j5 >> 30)) * 1812433253) + i10;
        }
        return jArr;
    }

    public static /* synthetic */ Number india(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        long alpha2;
        int i14 = ~i12;
        int i15 = ~((~i5) | i14);
        int i16 = ~i4;
        int i17 = ~(i16 | i12);
        int i18 = ~(i14 | i4);
        int i19 = i15 | i17 | i18;
        int i20 = ((-617538080) * i19) + ((-1966771951) * i12) + (i4 * (-1966771951)) + 1000013824;
        int i21 = ~(i16 | i14 | i5);
        int i22 = (~(i5 | i14)) | i17 | i18;
        int i23 = ((-741212160) * i10) + (632946688 * i13) + (2019426304 * i11) + (308769040 * i22) + ((-926307120) * i21) + i20;
        int papa = AbstractC2327c.papa(i10, 1687666023, (2052055731 * i13) + i4 + i12 + i11);
        int i24 = i19 * (-800);
        int i25 = i21 * (-1200);
        int i26 = i22 * HttpConstants.HTTP_BAD_REQUEST;
        int i27 = i11 * 1533266057;
        int i28 = i13 * 706030027;
        int i29 = i10 * 1023530015;
        if (AbstractC2327c.quebec(papa, -2088042496, i29 + i28 + i27 + i26 + i25 + i24 + (i12 * 1533266457) + (i4 * 1533266457) + 1248777597, 1434255360, (2121465856 * papa) + i23) != 1) {
            List list = (List) objArr[0];
            int i30 = echo;
            int i31 = (i30 & 47) + (i30 | 47);
            foxtrot = i31 % 128;
            if (i31 % 2 != 0) {
                return Integer.valueOf(charlie(list));
            }
            charlie(list);
            throw null;
        }
        List list2 = (List) objArr[0];
        int i32 = echo + 91;
        foxtrot = i32 % 128;
        if (i32 % 2 == 0) {
            alpha2 = alpha(list2);
            int i33 = 64 / 0;
        } else {
            alpha2 = alpha(list2);
        }
        return Long.valueOf(alpha2);
    }

    public static final String juliet(String str, JSONObject jSONObject) {
        Object m206constructorimpl;
        String str2;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object obj2 = jSONObject.get(str);
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            } else {
                str2 = null;
            }
            m206constructorimpl = Result.m206constructorimpl(str2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m206constructorimpl instanceof kotlin.k)) {
            obj = m206constructorimpl;
        }
        return (String) obj;
    }

    public static void kilo(int i4, int i5, boolean z2, int i10, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z2) {
            golf(iArr);
        }
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i4 ^ iArr[i11];
            int i13 = i5 ^ ((iArr2[2][(i12 >>> 8) & 255] ^ (iArr2[0][i12 >>> 24] + iArr2[1][(i12 >>> 16) & 255])) + iArr2[3][i12 & 255]);
            i11++;
            i5 = i12;
            i4 = i13;
        }
        int i14 = i4 ^ iArr[iArr.length - 2];
        int i15 = i5 ^ iArr[iArr.length - 1];
        if (!z2) {
            golf(iArr);
        }
        iArr3[0] = i15;
        iArr3[1] = i14;
    }

    public static final boolean lima(Location location) {
        try {
            Object[] objArr = {0L, r7, r7, new H0(location), 7, null};
            Boolean bool = Boolean.FALSE;
            Object echo2 = am.echo(-1815327613);
            if (echo2 == null) {
                char alpha2 = (char) (40619 - Color.alpha(0));
                int trimmedLength = 52 - TextUtils.getTrimmedLength("");
                int i4 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 221;
                Class cls = Boolean.TYPE;
                echo2 = am.charlie(alpha2, trimmedLength, i4, -1707113179, "setPivotYN16904", new Class[]{Long.TYPE, cls, cls, Function1.class, Integer.TYPE, Object.class});
            }
            return ((Boolean) component13.vD14832N6715((N14263A23323) ((Method) echo2).invoke(null, objArr), bool)).booleanValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static final Boolean mike(String str, JSONObject jSONObject) {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(Boolean.valueOf(jSONObject.getBoolean(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (m206constructorimpl instanceof kotlin.k) {
            m206constructorimpl = null;
        }
        return (Boolean) m206constructorimpl;
    }
}
