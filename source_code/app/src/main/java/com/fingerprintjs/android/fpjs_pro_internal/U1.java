package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.clevertap.android.sdk.Constants;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/LastKnownMockedLocationsInfoProvider;", "", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/LastKnownMockedLocationInfo;", "getFrameworkLastKnownMockedLocationsInfo", "()Ljava/util/List;", "getGoogleLastKnownMockedLocationInfo", "()Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/LastKnownMockedLocationInfo;", "Lcom/fingerprintjs/android/fpjs_pro/config/Config;", Constants.KEY_CONFIG, "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/LastKnownMockedLocationsInfoResult;", "getLastKnownMockedLocationsInfo", "(Lcom/fingerprintjs/android/fpjs_pro/config/Config;)Ljava/util/List;", "Landroid/location/Location;", "", "elapsedTimeMs", "(Landroid/location/Location;)J", "", "providerName", "toLastKnownMockedLocationInfo", "(Landroid/location/Location;Ljava/lang/String;)Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/LastKnownMockedLocationInfo;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/location/LocationManager;", "frameworkLocationManager", "Landroid/location/LocationManager;", "Companion", "fpjs-pro_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class U1 {

    @NotNull
    private static final a charlie = new a(null);
    public static int delta = 0;
    public static int echo = 1;
    public final Context alpha;
    public final LocationManager bravo;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/U1$a;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public U1(Context context, LocationManager locationManager) {
        this.alpha = context;
        this.bravo = locationManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e0, code lost:
    
        r0 = com.fingerprintjs.android.fpjs_pro_internal.U1.echo;
        com.fingerprintjs.android.fpjs_pro_internal.U1.delta = ((r0 & 37) + (r0 | 37)) % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d7, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.U1.echo = (com.fingerprintjs.android.fpjs_pro_internal.U1.delta + 51) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d5, code lost:
    
        if (r1 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00d2, code lost:
    
        if (r1 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object bravo(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14;
        char c3;
        int i15;
        long j5;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        Class cls3 = Long.TYPE;
        int i16 = 2;
        char c4 = 1;
        int i17 = i10 | i13;
        int i18 = ~i5;
        int i19 = i17 | i18;
        int i20 = ~(i18 | i10);
        int i21 = (~i17) | i20;
        int i22 = i20 | (~((~i10) | (~i13)));
        int i23 = 1630535680 * i11;
        int i24 = (-648019968) * i4;
        int i25 = ((-1801453568) * i12) + i24 + i23 + ((-2106796043) * i22) + (2106796043 * i21) + (i19 * (-2106796043)) + ((-557635572) * i13) + ((i10 * (-557635572)) - 1375207424);
        int papa = AbstractC2327c.papa(i12, 2071835342, (1699743442 * i4) + i10 + i13 + i11);
        int i26 = i22 * 521;
        int quebec = AbstractC2327c.quebec(papa, -597164032, ((-943812730) * i12) + (2119243930 * i4) + ((-355763899) * i11) + i26 + (i21 * (-521)) + (i19 * 521) + (i13 * (-355764420)) + ((i10 * (-355764420)) - 259725689), 58195968, (1296564224 * papa) + i25);
        int i27 = 7;
        if (quebec != 1) {
            if (quebec != 2) {
                Location location = (Location) objArr[0];
                String str = (String) objArr[1];
                int i28 = echo;
                int i29 = ((i28 ^ 117) + ((i28 & 117) << 1)) % 128;
                delta = i29;
                if (location != null) {
                    int i30 = (i29 & 115) + (i29 | 115);
                    echo = i30 % 128;
                    int i31 = i30 % 2;
                    boolean lima = I0.lima(location);
                    if (i31 == 0) {
                        int i32 = 37 / 0;
                    }
                    if (location != null) {
                        try {
                            Object[] objArr2 = {0L, r0, r0, new R1(location), 7, null};
                            Boolean bool = Boolean.FALSE;
                            Object echo2 = am.echo(-1815327613);
                            if (echo2 == null) {
                                j5 = 0;
                                echo2 = am.charlie((char) (ExpandableListView.getPackedPositionGroup(0L) + 40619), 52 - (ViewConfiguration.getDoubleTapTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 223, -1707113179, "setPivotYN16904", new Class[]{cls3, cls2, cls2, Function1.class, cls, Object.class});
                            } else {
                                j5 = 0;
                            }
                            long longValue = ((Number) component13.vD14832N6715((N14263A23323) ((Method) echo2).invoke(null, objArr2), Long.valueOf(j5))).longValue();
                            int i33 = delta;
                            echo = (((i33 | 93) << 1) - (i33 ^ 93)) % 128;
                            return new N(str, longValue);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                }
                return null;
            }
            U1 u12 = (U1) objArr[0];
            int i34 = delta + 71;
            echo = i34 % 128;
            int i35 = i34 % 2;
            Context context = u12.alpha;
            if (i35 != 0) {
                return context;
            }
            throw null;
        }
        U1 u13 = (U1) objArr[0];
        try {
            Object[] objArr3 = {0L, r1, r1, new T1(u13), 7, null};
            Boolean bool2 = Boolean.FALSE;
            Object echo3 = am.echo(-1815327613);
            if (echo3 == null) {
                echo3 = am.charlie((char) (40619 - TextUtils.getOffsetBefore("", 0)), 51 - TextUtils.lastIndexOf("", '0', 0, 0), 222 - ExpandableListView.getPackedPositionType(0L), -1707113179, "setPivotYN16904", new Class[]{cls3, cls2, cls2, Function1.class, cls, Object.class});
            }
            List<String> list = (List) component13.vD14832N6715((N14263A23323) ((Method) echo3).invoke(null, objArr3), CollectionsKt.emptyList());
            ArrayList arrayList = new ArrayList();
            echo = (delta + 31) % 128;
            for (String str2 : list) {
                S1 s12 = new S1(u13, str2);
                int i36 = i27;
                Object[] objArr4 = new Object[6];
                objArr4[5] = null;
                objArr4[4] = Integer.valueOf(i36);
                objArr4[3] = s12;
                Boolean bool3 = Boolean.FALSE;
                objArr4[i16] = bool3;
                objArr4[c4] = bool3;
                objArr4[0] = 0L;
                Object echo4 = am.echo(-1815327613);
                if (echo4 == null) {
                    char indexOf = (char) (TextUtils.indexOf("", "") + 40619);
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 52;
                    int blue = 222 - Color.blue(0);
                    i14 = i16;
                    c3 = c4;
                    Class[] clsArr = new Class[6];
                    clsArr[0] = cls3;
                    clsArr[c3] = cls2;
                    clsArr[i14] = cls2;
                    clsArr[3] = Function1.class;
                    clsArr[4] = cls;
                    clsArr[5] = Object.class;
                    echo4 = am.charlie(indexOf, scrollBarSize, blue, -1707113179, "setPivotYN16904", clsArr);
                } else {
                    i14 = i16;
                    c3 = c4;
                }
                Object[] objArr5 = new Object[i14];
                objArr5[0] = (Location) component13.vD14832N6715((N14263A23323) ((Method) echo4).invoke(null, objArr4), null);
                objArr5[c3] = str2;
                N n5 = (N) bravo(objArr5, H0.vD14832N6715(), H0.vD14832N6715(), -1986610517, H0.vD14832N6715(), H0.vD14832N6715(), 1986610517);
                if (n5 != null) {
                    int i37 = delta + 123;
                    echo = i37 % 128;
                    i15 = 2;
                    if (i37 % 2 == 0) {
                        arrayList.add(n5);
                        int i38 = 55 / 0;
                    } else {
                        arrayList.add(n5);
                    }
                    delta = (echo + 79) % 128;
                } else {
                    i15 = 2;
                }
                i27 = i36;
                i16 = i15;
                c4 = c3;
            }
            echo = (delta + 107) % 128;
            return arrayList;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    public static final /* synthetic */ LocationManager charlie(U1 u12) {
        int i4 = echo;
        int i5 = ((i4 | 49) << 1) - (i4 ^ 49);
        delta = i5 % 128;
        int i10 = i5 % 2;
        LocationManager locationManager = u12.bravo;
        if (i10 == 0) {
            return locationManager;
        }
        throw null;
    }

    public final N alpha() {
        try {
            Object[] objArr = {0L, r7, r7, new Q1(this), 7, null};
            Boolean bool = Boolean.FALSE;
            Object echo2 = am.echo(-1815327613);
            if (echo2 == null) {
                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 40619);
                int resolveOpacity = 52 - Drawable.resolveOpacity(0, 0);
                int i4 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 222;
                Class cls = Boolean.TYPE;
                echo2 = am.charlie(capsMode, resolveOpacity, i4, -1707113179, "setPivotYN16904", new Class[]{Long.TYPE, cls, cls, Function1.class, Integer.TYPE, Object.class});
            }
            N n5 = (N) bravo(new Object[]{(Location) component13.vD14832N6715((N14263A23323) ((Method) echo2).invoke(null, objArr), null), P28427.C1081l0.echo.vD14832N6715()}, H0.vD14832N6715(), H0.vD14832N6715(), -1986610517, H0.vD14832N6715(), H0.vD14832N6715(), 1986610517);
            int i5 = echo;
            delta = (((i5 | 57) << 1) - (i5 ^ 57)) % 128;
            return n5;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
