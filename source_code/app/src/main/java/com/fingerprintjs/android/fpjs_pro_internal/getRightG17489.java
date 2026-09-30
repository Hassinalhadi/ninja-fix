package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.location.Geocoder;
import android.location.LocationManager;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.os.Process;
import android.os.SystemClock;
import android.os.UserManager;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.SecurityGuardBrige.SmoothBlocade.Smooth$Close;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import fe.C1715g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/getRightG17489;", "", "gray", "j"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class getRightG17489 {
    public static final G2 green = new G2(false, 1500, 30, 5000, false, 1500, 30, 5000, true, true, 100, 1, false, true);
    public static final P28427.X indigo = P28427.X.echo;
    public final List alpha;
    public final D0 amber;
    public final C1231l1 azure;
    public final Object beige;
    public final Object black;
    public final Object blue;
    public final String bravo;
    public final C1214h0 bronze;
    public final boolean charlie;
    public final C1206f0 coral;
    public final W1 crimson;
    public final C1194c0 cyan;
    public final List delta;
    public final UserManager echo;
    public final D emerald;
    public final SensorManager foxtrot;
    public final M4296 fuchsia;
    public final M2 gold;
    public final PackageManager golf;
    public final ContentResolver hotel;
    public final String india;
    public final InterfaceC1276x juliet;
    public final String kilo;
    public final String lima;
    public final C1715g mike;
    public final W0 november;
    public final C1200d2 oscar;
    public final C1248p2 papa;
    public final G2 quebec;
    public final P28427 romeo;
    public final C1277x0 sierra;
    public final a3 tango;
    public final Object uniform;
    public final U1 victor;
    public final d3 whiskey;
    public final pC2922 xray;
    public final g3 yankee;
    public final C1261t0 zulu;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Landroid/location/LocationManager;", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Landroid/location/LocationManager;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class a extends Lambda implements Function1<SafeWithTimeoutProContext, LocationManager> {
        public final /* synthetic */ Context alpha;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(1);
            this.alpha = context;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
        public final LocationManager invoke(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
            Object systemService = this.alpha.getSystemService("location");
            if (systemService instanceof LocationManager) {
                return (LocationManager) systemService;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Landroid/hardware/SensorManager;", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Landroid/hardware/SensorManager;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class b extends Lambda implements Function1<SafeWithTimeoutProContext, SensorManager> {
        public final /* synthetic */ Context alpha;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(1);
            this.alpha = context;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
        public final SensorManager invoke(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
            Object systemService = this.alpha.getSystemService("sensor");
            Intrinsics.checkNotNull(systemService);
            return (SensorManager) systemService;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class c extends Lambda implements Function1<SafeWithTimeoutProContext, String> {
        public static int purple;
        public static int red;
        public final /* synthetic */ Context alpha;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(1);
            this.alpha = context;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
            File cacheDir = this.alpha.getCacheDir();
            Intrinsics.checkNotNull(cacheDir);
            String absolutePath = cacheDir.getAbsolutePath();
            Intrinsics.checkNotNull(absolutePath);
            return absolutePath;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Landroid/content/ContentResolver;", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Landroid/content/ContentResolver;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class d extends Lambda implements Function1<SafeWithTimeoutProContext, ContentResolver> {
        public final /* synthetic */ Context alpha;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(1);
            this.alpha = context;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
        public final ContentResolver invoke(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
            ContentResolver contentResolver = this.alpha.getContentResolver();
            Intrinsics.checkNotNull(contentResolver);
            return contentResolver;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Landroid/os/UserManager;", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Landroid/os/UserManager;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class e extends Lambda implements Function1<SafeWithTimeoutProContext, UserManager> {
        public static int purple;
        public static int red;
        public final /* synthetic */ Context alpha;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(1);
            this.alpha = context;
        }

        public static int component9() {
            int i4 = purple;
            int i5 = i4 % 9788187;
            purple = i4 + 1;
            if (i5 != 0) {
                return red;
            }
            int myUid = Process.myUid();
            red = myUid;
            return myUid;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
        public final UserManager invoke(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
            Object systemService = this.alpha.getSystemService("user");
            Intrinsics.checkNotNull(systemService);
            return (UserManager) systemService;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Landroid/content/pm/PackageManager;", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Landroid/content/pm/PackageManager;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class f extends Lambda implements Function1<SafeWithTimeoutProContext, PackageManager> {
        public final /* synthetic */ Context alpha;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(1);
            this.alpha = context;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
        public final PackageManager invoke(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
            PackageManager packageManager = this.alpha.getPackageManager();
            Intrinsics.checkNotNull(packageManager);
            return packageManager;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Landroid/location/Geocoder;", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Landroid/location/Geocoder;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class g extends Lambda implements Function1<SafeWithTimeoutProContext, Geocoder> {
        public static int purple;
        public static int red;
        public final /* synthetic */ Context alpha;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context) {
            super(1);
            this.alpha = context;
        }

        public static int D8871() {
            int i4 = purple;
            int i5 = i4 % 7318464;
            purple = i4 + 1;
            if (i5 != 0) {
                return red;
            }
            int uptimeMillis = (int) SystemClock.uptimeMillis();
            red = uptimeMillis;
            return uptimeMillis;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
        public final Geocoder invoke(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
            return new Geocoder(this.alpha, Locale.US);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class h extends Lambda implements Function1<SafeWithTimeoutProContext, String> {
        public final /* synthetic */ Context alpha;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context) {
            super(1);
            this.alpha = context;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
            ApplicationInfo applicationInfo = this.alpha.getApplicationInfo();
            Intrinsics.checkNotNull(applicationInfo);
            String str = ((PackageItemInfo) applicationInfo).packageName;
            Intrinsics.checkNotNull(str);
            return str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Landroid/net/ConnectivityManager;", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Landroid/net/ConnectivityManager;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class i extends Lambda implements Function1<SafeWithTimeoutProContext, ConnectivityManager> {
        public final /* synthetic */ Context alpha;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Context context) {
            super(1);
            this.alpha = context;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
        public final ConnectivityManager invoke(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
            Object systemService = this.alpha.getSystemService("connectivity");
            if (systemService instanceof ConnectivityManager) {
                return (ConnectivityManager) systemService;
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.fingerprintjs.android.fpjs_pro_internal.W0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.fingerprintjs.android.fpjs_pro_internal.a3] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.fingerprintjs.android.fpjs_pro_internal.x] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v65, types: [com.fingerprintjs.android.fpjs_pro_internal.Z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object] */
    public getRightG17489(final Context context, List list, String str, boolean z2, List list2, boolean z10, long j5, UserManager userManager, SensorManager sensorManager, PackageManager packageManager, ContentResolver contentResolver, ConnectivityManager connectivityManager, String str2, LocationManager locationManager, TelephonyManager telephonyManager, Geocoder geocoder, String str3, InterfaceC1276x interfaceC1276x, String str4, String str5, C1715g c1715g, W0 w02, C1200d2 c1200d2, C1248p2 c1248p2, G2 g2, P28427 p28427, C1277x0 c1277x0, a3 a3Var, Object obj, getAutofillType getautofilltype, U1 u12, d3 d3Var, pC2922 pc2922, g3 g3Var, C1261t0 c1261t0, D0 d02, K2 k22, String str6, C1229l c1229l, C1231l1 c1231l1, Object obj2, Object obj3, Object obj4, C1230l0 c1230l0, C1214h0 c1214h0, C1206f0 c1206f0, bh bhVar, W1 w12, C1194c0 c1194c0, D d4, M4296 m4296, M2 m22, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        Class cls;
        int i10;
        UserManager userManager2;
        Class cls2;
        SensorManager sensorManager2;
        Class cls3;
        PackageManager packageManager2;
        Class cls4;
        ContentResolver contentResolver2;
        Class cls5;
        int i11;
        ConnectivityManager connectivityManager2;
        String str7;
        Integer num;
        LocationManager locationManager2;
        TelephonyManager telephonyManager2;
        int i12;
        Long l10;
        Geocoder geocoder2;
        int i13;
        String str8;
        int i14;
        String str9;
        String str10;
        Object obj5;
        C1715g c1715g2;
        Object obj6;
        C1200d2 c1200d22;
        SensorManager sensorManager3;
        ContentResolver contentResolver3;
        C1200d2 c1200d23;
        C1248p2 c1248p22;
        Object obj7;
        C1277x0 c1277x02;
        Object obj8;
        U1 u13;
        pC2922 pc29222;
        g3 g3Var2;
        C1261t0 c1261t02;
        C1261t0 c1261t03;
        String str11;
        pC2922 pc29223;
        C1229l c1229l2;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        C1231l1 c1231l12;
        Object obj13;
        W1 w13;
        C1194c0 c1194c02;
        C1194c0 c1194c03;
        D d9;
        D d10;
        M4296 m42962;
        M4296 m42963;
        M2 m23;
        Class cls6 = Integer.TYPE;
        Class cls7 = Boolean.TYPE;
        Class cls8 = Long.TYPE;
        if ((i4 & 128) == 0) {
            cls = Object.class;
            i10 = 0;
            userManager2 = userManager;
        } else {
            i10 = 0;
            try {
                Object[] objArr = {0L, r9, r9, new e(context), 7, null};
                Boolean bool = Boolean.FALSE;
                Object echo = am.echo(-1815327613);
                if (echo == null) {
                    cls = Object.class;
                    echo = am.charlie((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 40619), 52 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Process.getGidForName("") + 223, -1707113179, "setPivotYN16904", new Class[]{cls8, cls7, cls7, Function1.class, cls6, cls});
                } else {
                    cls = Object.class;
                }
                userManager2 = (UserManager) component13.vD14832N6715((N14263A23323) ((Method) echo).invoke(null, objArr), null);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            b bVar = new b(context);
            Object[] objArr2 = new Object[6];
            objArr2[5] = null;
            objArr2[4] = 7;
            objArr2[3] = bVar;
            Boolean bool2 = Boolean.FALSE;
            objArr2[2] = bool2;
            objArr2[1] = bool2;
            objArr2[i10] = 0L;
            Object echo2 = am.echo(-1815327613);
            if (echo2 == null) {
                int i15 = i10;
                char indexOf = (char) (TextUtils.indexOf("", "", i15) + 40619);
                int combineMeasuredStates = 52 - View.combineMeasuredStates(i15, i15);
                int modifierMetaStateMask = 221 - ((byte) KeyEvent.getModifierMetaStateMask());
                cls2 = cls6;
                Class[] clsArr = new Class[6];
                clsArr[i15] = cls8;
                clsArr[1] = cls7;
                clsArr[2] = cls7;
                clsArr[3] = Function1.class;
                clsArr[4] = cls2;
                clsArr[5] = cls;
                echo2 = am.charlie(indexOf, combineMeasuredStates, modifierMetaStateMask, -1707113179, "setPivotYN16904", clsArr);
            } else {
                cls2 = cls6;
            }
            sensorManager2 = (SensorManager) component13.vD14832N6715((N14263A23323) ((Method) echo2).invoke(null, objArr2), null);
        } else {
            cls2 = cls6;
            sensorManager2 = sensorManager;
        }
        if ((i4 & 512) != 0) {
            Object[] objArr3 = {0L, r9, r9, new f(context), 7, null};
            Boolean bool3 = Boolean.FALSE;
            Object echo3 = am.echo(-1815327613);
            if (echo3 == null) {
                cls3 = Function1.class;
                echo3 = am.charlie((char) (40619 - View.MeasureSpec.makeMeasureSpec(0, 0)), TextUtils.indexOf("", "", 0) + 52, (ViewConfiguration.getLongPressTimeout() >> 16) + 222, -1707113179, "setPivotYN16904", new Class[]{cls8, cls7, cls7, cls3, cls2, cls});
            } else {
                cls3 = Function1.class;
            }
            packageManager2 = (PackageManager) component13.vD14832N6715((N14263A23323) ((Method) echo3).invoke(null, objArr3), null);
        } else {
            cls3 = Function1.class;
            packageManager2 = packageManager;
        }
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            Object[] objArr4 = {0L, r9, r9, new d(context), 7, null};
            Boolean bool4 = Boolean.FALSE;
            Object echo4 = am.echo(-1815327613);
            if (echo4 == null) {
                cls4 = cls7;
                echo4 = am.charlie((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40619), 51 - TextUtils.lastIndexOf("", '0', 0, 0), ExpandableListView.getPackedPositionChild(0L) + 223, -1707113179, "setPivotYN16904", new Class[]{cls8, cls4, cls4, cls3, cls2, cls});
            } else {
                cls4 = cls7;
            }
            contentResolver2 = (ContentResolver) component13.vD14832N6715((N14263A23323) ((Method) echo4).invoke(null, objArr4), null);
        } else {
            cls4 = cls7;
            contentResolver2 = contentResolver;
        }
        if ((i4 & 2048) != 0) {
            Object[] objArr5 = {0L, r9, r9, new i(context), 7, null};
            Boolean bool5 = Boolean.FALSE;
            Object echo5 = am.echo(-1815327613);
            if (echo5 == null) {
                i11 = 40620;
                cls5 = cls8;
                echo5 = am.charlie((char) (ImageFormat.getBitsPerPixel(0) + 40620), 52 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 221 - TextUtils.lastIndexOf("", '0'), -1707113179, "setPivotYN16904", new Class[]{cls5, cls4, cls4, cls3, cls2, cls});
            } else {
                cls5 = cls8;
                i11 = 40620;
            }
            connectivityManager2 = (ConnectivityManager) component13.vD14832N6715((N14263A23323) ((Method) echo5).invoke(null, objArr5), null);
        } else {
            cls5 = cls8;
            i11 = 40620;
            connectivityManager2 = connectivityManager;
        }
        if ((i4 & 4096) != 0) {
            Object[] objArr6 = {0L, r9, r9, new h(context), 7, null};
            Boolean bool6 = Boolean.FALSE;
            Object echo6 = am.echo(-1815327613);
            str7 = (String) component13.vD14832N6715((N14263A23323) ((Method) (echo6 == null ? am.charlie((char) (ExpandableListView.getPackedPositionChild(0L) + i11), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51, 221 - TextUtils.lastIndexOf("", '0', 0), -1707113179, "setPivotYN16904", new Class[]{cls5, cls4, cls4, cls3, cls2, cls}) : echo6)).invoke(null, objArr6), null);
        } else {
            str7 = str2;
        }
        if ((i4 & 8192) == 0) {
            num = 7;
            locationManager2 = locationManager;
        } else {
            Object[] objArr7 = {0L, r11, r11, new a(context), 7, null};
            Boolean bool7 = Boolean.FALSE;
            Object echo7 = am.echo(-1815327613);
            if (echo7 == null) {
                num = 7;
                echo7 = am.charlie((char) (40619 - (ViewConfiguration.getLongPressTimeout() >> 16)), 52 - Color.blue(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 222, -1707113179, "setPivotYN16904", new Class[]{cls5, cls4, cls4, cls3, cls2, cls});
            } else {
                num = 7;
            }
            locationManager2 = (LocationManager) component13.vD14832N6715((N14263A23323) ((Method) echo7).invoke(null, objArr7), null);
        }
        if ((i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            Object[] objArr8 = {0L, r11, r11, new Function1<SafeWithTimeoutProContext, TelephonyManager>() { // from class: com.fingerprintjs.android.fpjs_pro_internal.getRightG17489.6
                public static final char[] purple;
                public static final long red;
                public static int silver;
                public static int teal;
                public static final byte[] white = null;
                public static final byte[] yellow = null;

                static {
                    india();
                    hotel();
                    silver = 0;
                    teal = 1;
                    char[] cArr = new char[2156];
                    ByteBuffer.wrap("\u007f\n#DÇJk\\\u000f\u001e³[WTûj\u009fiCnç~\u008ba/qÓ;w\u0002\u001b\n¿\u0011c\u0002\u0007\u001a«\tO2ó\u0013\u00978;&ß<\u0083;'Â\u007f\n#DÇJk\\\u000f\u001e³[WTûj\u009fiCnç~\u008ba/qÓ;w\u0013\u001b\u0007¿\u0005c\u0015\u0007 «\u001eO1ó>\u0097(;\"ß9«À÷\u008e\u0013\u0080¿\u0096ÛÔg\u0091\u0083\u009e/ K£\u0097¤3´_«û»\u0007ñ£ÚÏÝkÑ·Ù\u0090\u009eÌÇ(Â\u0084Íà\u008a\\Å¸À\u0014öpì¬ð\bæd©Àê<\u009f\u0098\u009bô\u009eP\u0087\u008c\u008dè\u0098D\u0086 \u008a\u001cºx¾Ô¶0½l©ÈA$O\u007f\n#EÇ[kI\u000f\u001e³XW\\û(\u009f}Czçx\u008bbRñ\u000e¾ê F²\"å\u009e´z©Ö\u0090²Øn\u0083Ê\u009e¦\u0086\u0002\u0092G·\u001bîÿöSô7í\u008bóoâÃ\u0094§â{óßç³À\u0017Òë¼O\u009a#²\u0087¼[¬\u0018\fDB H\fXhVÔ\u00150\u0013\u009ccø{${\u0080xìzHy´\r\u007fW#OÇ\u0001kH\u000f^³SWOû(\u009f\u007fCmçs\u008b`/vÓ\rw\u0007\u001b1¿\u001bc\u0015\u0007\u000b«%O%ó\"\u00978;g\u008euÒm6#\u009ajþ|Bq¦m\n\nn]²O\u0016QzBÞT\"/\u0086%ê\u0013N9\u00927ö)Z\u0007¾\u0007\u0002\u0000f\u001aÊF\u008fÈÓ\u00917\u0094\u009b\u009bÿ\u0087C\u009b§\u0094\u000bëo£³£\u0017·{ÿß·#Ï\u0087ÃëÂOÕ\u0093\u009c÷Î[×b¾>°Ú±v½\u0012§®½\u007fy#a\u007f\n#SÇVkY\u000fE³YWVû)\u009foCaçy\u008b=/wÓ\u0001w\u000e\u001b\u001b¿#c=\u0007R«\u0014O$ó!\u0097>;{ß>\u00837'ÉËÖoÛ\u0013Û·ß@¦\u001cÿøúTõ0é\u008cõhúÄ\u0085 Ã|ÍØÕ´\u0091\u0010Ûì\u00adH¢$·\u0080\u008f\\\u00918þ\u0094¦p\u009fÌ\u008f¨\u0097\u007f\n#SÇVkY\u000fE³YWVû)\u009faCaçu\u008b=/uÓ\rw\u0001\u001b\u0000¿\u0010c\u001d\u0007\n«,O\fó<\u00979;9ß-\u0083v'ÔËÍ\u0084ÍØ\u0083<\u008d\u0090\u009bôÙH\u0095¬\u0099\u0000¬d¿¸¨\u001c¥p°Ô\u00ad(×\u007fW#OÇ\u0001kH\u000fD³UWWûb\u009f#C`çx\u008ba/m\u007fK#EÇNkY\u000fT³\u0012WUûc\u009fy\u0084/Øu<x\u0090`ôwH6¬x\u0000JdD¸H\u001cApNÔO(5\u008c#à&D#\u0002D^JºM\u0016PrMÎU\r9Q!µo\u00194}-Á=%1\u0089\u001dí\u00001\u0012\u0095Wù\u0011]\u0016¡d\u0005xifÍz\u0011}ueÙa=]\u0081GåW\u007fB#EÇAkS\u007fU#EÇ]kY\u000fX³OWOû(\u009f~Cqçd\u008b</{Ó\u0000wM\u001b\n¿\u0010c\u0012\u0007\n«\u001dOoó+\u0097;;#ßs\u0083>'ÆËÉoÌ\u0013ë·Ô[Îÿð£ßGýëï\u008fÿ3ø×þ{\u0094\u001f\u0088Ã\u009a\u007fU#EÇ]kY\u000fX³OWOû(\u009f~Cqçd\u008b</{Ó\u0000wM\u001b\n¿\u0010c\u0012\u0007\n«\u001dOoó+\u0097;;#ßs\u0083>'ÆËÉoÌ\u0013ë·Ô[Îÿð£ßGùëï\u008fÿ3ø×ô{\u0094\u007fU#EÇ]kY\u000fX³OWOû(\u009f~Cqçd\u008b</{Ó\u0000wM\u001b\n¿\u0010c\u0012\u0007\n«\u001dOoó>\u0097$;xß>\u0083)'ÎEU\u0019Eý]QY5X\u0089OmOÁ(¥~yqÝd±<\u0015{é\u0000MM!\n\u0085\u0010Y\u0012=\n\u0091\u001duoÉ>\u00ad$\u0001xå1¹9\u001dÄ\u007fU#EÇ]kY\u000fX³OWOû(\u009f~Cqçd\u008b</{Ó\u0000wM\u001b\n¿\u0010c\u0012\u0007\n«\u001dOoó>\u0097$;xß0\u0083;'Ä\u007fU#EÇ]kY\u000fX³OWOû(\u009f~Cqçd\u008b</{Ó\u0000wM\u001b\n¿\u0010c\u0012\u0007\n«\u001dOoó>\u0097$;xß0\u00836'Ä\u007fS#BÇ@kR\u000fB³Z¸\u0018äB\u0000O¬WÈ@t\u0001\u0090D<{X{\u0084o iLeèxÍX\u0091IuKÙY½]\u0001BåUI~-r¤_ø\u0006\u001c\u0003°\fÔ\u0010h\f\u008c\u0003 |D>\u0098/<#P*ô)\bF¬YÀIdK¸\nÜ]pF\u0094z(}Lqàt\u0004{X ü\u0081\u0010\u008e´\u008fÈ\u0095l\u0083\u0080\u0086$\u008fx¦\u009c¿0\u00adT²è¬\f¼ \u009dÄÒ\u0018Ü¼Ðä¡¸ý\\áðï\u0094þ(øÌâ`\u0082\u0004ÊØÊ|Þ\u0010\u008f´\u0086Hàì \u0080²$ñøº\u009c¡0µÔ\u0083h\u0088\fÎ \u008dD\u0084\u0018\u009a¼aPhôp\u0088f,6ÀbdG8EÜ@pN\u0014M¨DL\u001eà>\u0084)U\u008e\tÒíÎAÀ%Ñ\u0099×}ÍÑ\u00adµåiåÍñ¡ \u0005©ùÏ]\u008f1\u009d\u0095ÞI\u009c-\u008c\u0081\u009deªÙ¥½¿\u0011½õª©¹\rQá\bEZ9Y\u009dYq^Õn\u0089smxÁ ¥f\u0019w\u007f\n#SÇVkY\u000fE³YWVû)\u009faCaçu\u008b$/-ÓKw\u0000\u001b\u0002¿\u001ac\u0005\u0007\u001b«%O ó%\u0097/;:ß\u0002\u00831'ÉËÖoÌ\u0013Æ·Õ[ßÿæ£åG¢ëé\u008fá3ì×µ{\u0095\u001f\u0082\u007f\n#EÇ[kI\u000f\u001e³UWUûo\u009fyC'ç~\u008b|/pÓ\u0010wM\u001b\r¿\u0019c\u001f\u0007\n«\u001eO2ó)\u00979; ß4\u0083;'ÂË\u008coÛ\u0013×Pp\fWèSDA N\u009cAx]Ô}°plt\u0013^O@«J\u0007JcPßE;[\u007fF#HÇ]kE\u000f\\³UWNûkÃ=\u009f%{k×0³)\u000f9ë5G\u0019#\u0004ÿ\u0016[S7\u001c\u0093\u0016oxË`§g\u0003z./r>\u0096<:.^uâv\u00067s\u0087/\u0080Ë\u0084g\u008a\u0003\u0086¿\u0090[\u009dn´2³Ö·z¹\u001eµ¢£F®ê¯\u008e\u0083RÆö×\u007fB#EÇAkO\u000fC³UWXûY\u009fuC0ç!\u008bM//ÓP\u007fW#OÇ\u0001kZ\u000fC³SW_ûs\u009fnC|ç9\u008b\u007f/vÓ\u0000w\u0006\u001b\u0002\u00989Ä+ +\u007f@#MÇZkF\u000fP³HWTût\u007fd#PÇ_k\n\u000fc³IWUûr\u009fdCeçr\u008b2/\u007fÓ\u000bw\u0011\u001bN¿6c\u0018\u0007\r«\u0015O,ó)\u00ad\u0091ñ»\u0015¾¹\u00adÝ«a \u0085ª)ÓM«\u0091¹5©YÇý\u008e\u0001ä¥ÿÉ÷mô±¥Õìyà\u009dÆ!\u0099EÆé\u009b\r\u009e\u007fd#NÇKkX\u000f^³UW_û&\u009f^CLç\\\u008b2/{Ó\u0011w\n\u001b\u0002¿\u0001cP\u0007\u0019«\u0015O3ól\u00973;nßk\u0083\u0007'\u0091Ë\u0096\u007fW#OÇ\u0001kB\u000fP³NW_ûq\u009flCzçr\u007fB#OÇCkN\u000fW³UWHûn\u007fS#BÇ@kR\u000f\t³\n\u007fW#AÇAkI\u000fY³I\u007fW#OÇ\u0001kZ\u000fC³SW_ûs\u009fnC|ç9\u008bp/kÓ\u0005w\r\u001b\n\u007fW#OÇ\u0001kA\u000fT³NWUûc\u009faC&çf\u008bw/tÓ\u0011\u007f\u0014ð¹¬¡Hïä·\u0080º<±Ø t\u009a\u0010\u0086m\u008f\u007fW#OÇ\u0001kH\u000fD³UWWûb\u009f#Cxçe\u008b}/}Ó\u0011w\u0000\u001b\u001axK$]ÀKlN\bf´LP\u000bü8\u007fW#OÇ\u0001kH\u000fD³UWWûb\u009f#Cnç~\u008b|/~Ó\u0001w\u0011\u001b\u001e¿\u0007c\u0019\u0007\u0011«\u000e\u007fB#EÇAkO\u000fC³UWXû)\u009f~Clç|\u008b=/~Ó\u0001w\r\u001b\u000b¿\u0007c\u0019\u0007\u001cóã¯äKàçî\u0083â?ôÛùwø\u0013ÔÏ\u0091k\u0080\u0007\u009c£Ë_¡û©\u0097\u00903¬ïé\u008bè'ôÃ\u0087\u007f\u0088\u001b\u0084·\u0092S\u008e\u000f\u0090«eG\\ãp\u009f-;$æºº½^¹ò·\u0096»*\u00adÎ bÑ\u0006\u0092Ú\u009f~\u0080\u0012\u008d¶\u008dJùîÄ\u0082å&éúã\u009e¨2åÖÜjÚ\u000eÖ¢ÜFÌ\u001aÃ>CbD\u0086@*NNBòT\u0016Yº(Þz\u0002k¦yÊkn \u0092S6\u0012Z@þ\u0002\"\u0013F\u0011ê\u0003\u000ex²{Ö:ÆÀ\u009aÍ~ÂÒÏ¶ß\nÛî\u0096B÷&ëúá^Ê2÷\u0096ëj\u008eÎ\u008e¢\u0082\u0006\u0092Ú\u00ad¾\u0085\u0012ÀöõJá.®\u0082±f±:¿\u009eWrIÖHªi\u000eIâ\u0004F1\u007fW#OÇ\u0001kH\u000f^³SWOûj\u009fbCiçs\u008bw/k\u007fW#OÇ\u0001kH\u000f^³SWOûo\u009f`Ciçp\u008bw/7Ó\u0006w\u0016\u001b\u0007¿\u0019c\u0014\u0007Q«\u001cO(ó\"\u0097,;3ß/\u0083('ÕËËoÇ\u0013À\u007fç#ÍÇÈkÛ\u000fÝ³ÖWÜû¨\u009föC³ç¢pÄ,ÜÈ\u0092dÛ\u0000×¼ÆXÄôñ\u0090°Lÿèí\u0084ò úÜ\u009bx\u0091\u0014\u0084°Èl\u008a\b\u0088P \f´è\u00adD¯ í\u007fL#NÇFk^\u000f\u001f³OWMûe\u009f#Cyçr\u008b\u007f/lÓIw\u0013\u001b\u001c¿\u001ac\u0000\u0007\fû\\§MCJïW\u008b\u00177\\ÓD\u007f \u001bhÇacv\u000ft«zW\tó\u0012\u009f\u0015¤æø÷\u001cð°íÔ\u00adhý\u008cï \u009aDÙ\u0098Û<ÎPÅôô\bµ¬°À±d¢¸°Ü¬'n{\u007f\u009fx3eW%ëu\u000fg£\u0012Ç[\u001bQ¿IÓwwG\u008b;/7C'ç&;>_<\u007fW#OÇ\u0001kA\u000fT³NWUûc\u009faC&çv\u008b|/}Ó\u0016w\f\u001b\u0007¿\u0011c^\u0007\u000e«\u001fO,ó9\u0097/ó\u0083¯\u009bKÕç\u009c\u0083\u008a?\u0087Û\u009bwü\u0013¨Ï¹k®\u0007³£ã_ÑûÁ\u0097Þ3þïÊ\u008bÊ'ÃÃð¤òøê\u001c¤°àÔðhô\u008c° ÁDÝ\u0098Ä<ÞPÓô\u0092\b§¬¯À¥d·¸°Ü¨p¯\u0094\u0096(\u0080L\u0080à\u0087\u007fW#OÇ\u0001kZ\u000fC³SW_ûs\u009fnC|ç9\u008bp/lÓ\rw\u000f\u001b\n¿[c\u0016\u0007\u0016«\u0014O&ó)\u00979;&ß/\u00831'ÉËÖ\u007fW#OÇ\u0001kY\u000fH³OWOûc\u009f`C&çu\u008bg/pÓ\bw\u0007\u001b@¿\u0013c\u0019\u0007\u0011«\u001dO$ó>\u0097;;$ß4\u00836'Ó\u007fW#OÇ\u0001kY\u000fH³OWOûc\u009f`CWçr\u008bj/mÓJw\u0001\u001b\u001b¿\u001cc\u001c\u0007\u001b«TO'ó%\u0097%;1ß8\u0083*'×ËÐoÀ\u0013Ú·Ç\u007fW#OÇ\u0001k\\\u000fT³RW_ûi\u009f\u007fC&çu\u008bg/pÓ\bw\u0007\u001b@¿\u0013c\u0019\u0007\u0011«\u001dO$ó>\u0097;;$ß4\u00836'Ó-°q¨\u0095æ9»]³áµ\u0005¸©\u008eÍ\u0098\u0011°µ\u0094Ù\u0099}\u0095\u0081î%ªIëíç1þUôùù\u001d\u0088¡ÍÅÅiß\u008dÝÑÚu2\u00995=<A:å:\t-\u007f\r³\u0017ï\u001e\u007f\u001fsÍ\u000b{W5³;\u001f-{oÇ<#/\u008f\u001aë\t7&\u0093\u0016ÿ\n[\u0018§p%fy(\u009d&10Uré#\r8¡\tÅ\n\u0019\u0001½\u000fÑQu\u0017\u0089i-|Agå{9}]}ñr\u0015r©GÍBaT\u0085HÙPi¨5æÑè}þ\u0019¼¥íAöíÇ\u0089ÄUÏñÁ\u009d\u009f9ÜÅ£a¯\rµ©³æaº/^!ò7\u0096u*$Î?b\u000e\u0006\rÚ\u0006~\b\u0012V¶\u0003Jjîe\u0082p&z\u007f\n#SÇVkY\u000f\u001e³MW^ûk\u009fxCWçc\u008b`/xÓ\u0007w\u0006Òª\u008eójöÆù¢å\u001eùúöV\u00892ÁîÁJÕ&\u009d\u0082Õ~\u00adÚ¡¶\u00ad\u0012\u008aÎ½ª¾\u0006¶â\u008d^\u0083:\u0088\u0096©r\u0099.\u009d\u008aefwÂn¾K\u001abö{RH\u000eUê\u0001FY\"^bb>,Ú\"v4\u0012v®6J æ\u001a\u0082:^\u0007ú\u000f\u0096\twö+¸Ï¶c \u0007â»¢_´ó\u008e\u0097®K\u0080ï\u0082\u0083\u0083'\u0080\u007f\n#DÇJk\\\u000f\u001e³OWTûe\u009ffCmçc\u008b=/{Ó\u0017w\u0017\u001b\b¿\u001ac\u001c\u0007\u001b«\u001fO3ó(\u007f\n#SÇVkY\u000fE³YWVû)\u009faCaçu\u008b=/uÓ\rw\u0001\u001b\f¿\u0006c\u0004\u0007\u0019«\u0015O-ó(\u0097.;$ß\u0002\u00832'ÉËËo\u0087\u0013Ç·Ü\u007f\n#DÇJk\\\u000f\u001e³^WHûr\u009flCkçt\u008bw\u007f\n#DÇJk\\\u000f\u001e³^WHûr\u009fjCqçe\u008b}IØ\u0015\u0096ñ\u0098]\u008e9Ì\u0085\u008ca\u009aÍ ©²u¿Ñ¢½®\u007f\n#DÇJk\\\u000f\u001e³^WHûr\u009fbCzç~\u008bw\u007f\n#DÇJk\\\u000f\u001e³^WHûr\u009f{Ceçd\u008bu\u007f\n#DÇJk\\\u000f\u001e³^WHûr\u009f}Coçv\u008b{/iÓ\u0007\u007f\n#DÇJk\\\u000f\u001e³^WHûr\u009fRCaçz\u008bw\u0012\u0080NÎªÄ\u0006ÔbÚÞ\u0099:Õ\u0096ãòð.ì\u008añæ÷Bò¾\u008a\u001a\u009avËÒÑ\u000e\u0082j\u0097Æß\"©\u009eµúµV·\u007f\n#MÇAk^\u000f\u001e³KWRûh\u009fiCgç`\u008ba/6Ó&w\u0010\u001b\u001a¿&c\u0018\u0007\u001e«\bO$ó(\u0097\r;9ß1\u0083<'ÂËÐÛ\u001f\u0087EcHÏP«G\u0017\u0006óG_|;hçrCp/s\u008b\u007f~º\"éÆæj¥\u000e¤ü\u0015 ODBèZ\u008cM0\fÔWx|\u001c~Àqd'\b`¬gP\u000bô\u000f\u007fB#RÇNkF\u000f]³SWXû(\u009fjCgç{\u008bv/\u007fÓ\rw\u0010\u001b\u0006¿[c\u0003\u0007\u0010\u007fI#IÇMkm\u000f}³yWhûY\u009foC{çc\u008b</jÓ\u000b\u007f\n#EÇ[kI\u000f\u001e³QW^ûb\u009fdCiçH\u008bq/vÓ\u0000w\u0006\u001b\r¿\u0006c^\u0007\u0007«\u0017O-äO¸D\\RðG\u0094J(@ÌR`m\u0004nØsk\u008c7ÃÓÝ\u007fÏ\u001b\u0098§×CÒïõ\u008båWúóâ\u007f\n#DÇNk^\u000fP³\u0013W_ûi\u009fzCfç{\u008b}/xÓ\u0000w\u0010\u001bA¿[c\u0014\u0007\u000f«UO ó<\u0097;;%ßs\u0083 'ÊËÎ\u007f\n#PÇ]kE\u000fR³\u0013WXûv\u009fxCaçy\u008bt/v\u007fb#OÇCkN\u000fW³UWHûn\f\fPB´H\u0018X|VÀ\u0015$P\u0088iìx0m\u0094>ød\\m \r\u0004\u0003h\u0001Ì\u001f\u0010\u0013t\nØS<$\u0080?ä?H\u007f¬kðqTÂ¸Ë\u001cÂ`\u009cÄØ(Ñ\u008càÐô4æ\u0098úüþ@è¤é\bÎl\u0086°\u008b\u0014\u009cx\u0081Ü\u0096 ¯\u0084 ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2156);
                    purple = cArr;
                    red = -1536027515310955744L;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002b). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static String alpha(byte b2, int i16, int i17) {
                    int i18;
                    int i19;
                    int i20;
                    int i21 = b2 * 2;
                    int i22 = 4 - (i16 * 3);
                    int i23 = i17 + 103;
                    byte[] bArr = new byte[i21 + 1];
                    byte[] bArr2 = yellow;
                    if (bArr2 == null) {
                        int i24 = i21;
                        int i25 = i22;
                        i20 = 0;
                        int i26 = i25 + (-i24);
                        i18 = i22 + 1;
                        i19 = i26;
                        bArr[i20] = (byte) i19;
                        if (i20 == i21) {
                            return new String(bArr, 0);
                        }
                        i20++;
                        i24 = bArr2[i18];
                        int i27 = i18;
                        i25 = i19;
                        i22 = i27;
                        int i262 = i25 + (-i24);
                        i18 = i22 + 1;
                        i19 = i262;
                        bArr[i20] = (byte) i19;
                        if (i20 == i21) {
                        }
                    } else {
                        i18 = i22;
                        i19 = i23;
                        i20 = 0;
                        bArr[i20] = (byte) i19;
                        if (i20 == i21) {
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0196  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0197  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void delta(char c3, int i16, int i17, Object[] objArr9) {
                    Throwable cause2;
                    long j6;
                    int i18;
                    int i19;
                    cy cyVar = new cy();
                    long[] jArr = new long[i17];
                    cyVar.component5 = 0;
                    while (true) {
                        int i20 = cyVar.component5;
                        if (i20 >= i17) {
                            break;
                        }
                        try {
                            Object[] objArr10 = {Integer.valueOf(purple[i16 + i20])};
                            Object D8871 = uH18377.D8871(-31669226);
                            Class cls9 = Integer.TYPE;
                            if (D8871 == null) {
                                j6 = 0;
                                byte b2 = (byte) 0;
                                i18 = 359345605;
                                byte b4 = b2;
                                i19 = 2;
                                D8871 = uH18377.setPivotYN16904(TextUtils.indexOf("", "") + 52, ((Process.getThreadPriority(0) + 20) >> 6) + 2123, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 564618947, false, alpha(b2, b4, (byte) (b4 + 3)), new Class[]{cls9});
                            } else {
                                j6 = 0;
                                i18 = 359345605;
                                i19 = 2;
                            }
                            Long l11 = (Long) ((Method) D8871).invoke(null, objArr10);
                            l11.getClass();
                            long j7 = i20;
                            long j10 = red;
                            Object[] objArr11 = new Object[4];
                            objArr11[3] = Integer.valueOf(c3);
                            objArr11[i19] = Long.valueOf(j10);
                            objArr11[1] = Long.valueOf(j7);
                            objArr11[0] = l11;
                            Object D88712 = uH18377.D8871(-897540670);
                            if (D88712 == null) {
                                int i21 = (ExpandableListView.getPackedPositionForGroup(0) > j6 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j6 ? 0 : -1)) + 51;
                                int windowTouchSlop = 2796 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                char indexOf2 = (char) (32779 - TextUtils.indexOf("", ""));
                                byte b6 = (byte) 0;
                                byte b10 = b6;
                                String alpha = alpha(b6, b10, b10);
                                Class[] clsArr2 = new Class[4];
                                Class cls10 = Long.TYPE;
                                clsArr2[0] = cls10;
                                clsArr2[1] = cls10;
                                clsArr2[i19] = cls10;
                                clsArr2[3] = cls9;
                                D88712 = uH18377.setPivotYN16904(i21, windowTouchSlop, indexOf2, 356204311, false, alpha, clsArr2);
                            }
                            jArr[i20] = ((Long) ((Method) D88712).invoke(null, objArr11)).longValue();
                            Object[] objArr12 = new Object[i19];
                            objArr12[1] = cyVar;
                            objArr12[0] = cyVar;
                            Object D88713 = uH18377.D8871(i18);
                            if (D88713 == null) {
                                byte b11 = (byte) 0;
                                byte b12 = b11;
                                D88713 = uH18377.setPivotYN16904(52 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2175 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) Color.alpha(0), -892301552, false, alpha(b11, b12, (byte) (b12 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) D88713).invoke(null, objArr12);
                        } catch (Throwable th2) {
                            cause2 = th2.getCause();
                            if (cause2 == null) {
                            }
                        }
                        cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                    char[] cArr = new char[i17];
                    cyVar.component5 = 0;
                    while (true) {
                        int i22 = cyVar.component5;
                        if (i22 < i17) {
                            cArr[i22] = (char) jArr[i22];
                            Object[] objArr13 = {cyVar, cyVar};
                            Object D88714 = uH18377.D8871(359345605);
                            if (D88714 == null) {
                                byte b13 = (byte) 0;
                                byte b14 = b13;
                                D88714 = uH18377.setPivotYN16904(53 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 2175, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), -892301552, false, alpha(b13, b14, (byte) (b14 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) D88714).invoke(null, objArr13);
                        } else {
                            objArr9[0] = new String(cArr);
                            return;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0032). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void foxtrot(int i16, short s3, short s9, Object[] objArr9) {
                    int i17;
                    int i18 = s9 + 97;
                    int i19 = 3 - (i16 * 3);
                    int i20 = s3 * 3;
                    byte[] bArr = new byte[4 - i20];
                    int i21 = 3 - i20;
                    byte[] bArr2 = white;
                    if (bArr2 == null) {
                        int i22 = i19;
                        int i23 = 0;
                        byte[] bArr3 = bArr2;
                        int i24 = i21;
                        int i25 = i24 + (-i19) + 6;
                        int i26 = i22;
                        i18 = i25;
                        i19 = i26;
                        bArr2 = bArr3;
                        i17 = i23;
                        int i27 = i19 + 1;
                        bArr[i17] = (byte) i18;
                        if (i17 == i21) {
                            objArr9[0] = new String(bArr, 0);
                            return;
                        }
                        int i28 = i18;
                        i22 = i27;
                        i19 = bArr2[i27];
                        i23 = i17 + 1;
                        bArr3 = bArr2;
                        i24 = i28;
                        int i252 = i24 + (-i19) + 6;
                        int i262 = i22;
                        i18 = i252;
                        i19 = i262;
                        bArr2 = bArr3;
                        i17 = i23;
                        int i272 = i19 + 1;
                        bArr[i17] = (byte) i18;
                        if (i17 == i21) {
                        }
                    } else {
                        i17 = 0;
                        int i2722 = i19 + 1;
                        bArr[i17] = (byte) i18;
                        if (i17 == i21) {
                        }
                    }
                }

                public static void hotel() {
                    white = new byte[]{100, 102, -35, 107, -6, 5, -3};
                }

                public static void india() {
                    yellow = new byte[]{27, 93, -102, 30};
                }

                /* JADX WARN: Can't wrap try/catch for region: R(31:163|(1:165)|166|167|(3:169|(1:171)(1:350)|172)(1:351)|173|174|(1:176)(1:349)|177|(9:(5:179|(1:181)|182|183|(22:185|186|187|(1:189)|190|(1:192)(4:301|(1:303)|304|305)|193|(2:299|300)(5:197|(8:200|201|(1:203)(1:296)|204|205|(2:294|295)(4:207|(5:209|(1:211)|212|213|(2:217|218))(1:293)|215|216)|219|198)|297|298|220)|221|(1:(4:223|(5:225|(1:288)(13:229|230|231|232|233|234|235|236|(1:238)(1:280)|239|(2:243|244)|241|242)|285|241|242)|289|290)(2:291|292))|245|246|247|248|249|250|(1:252)|253|254|255|256|(7:258|259|260|261|(1:263)|264|265)(6:271|260|261|(0)|264|265)))|249|250|(0)|253|254|255|256|(0)(0))|306|(10:309|310|(1:312)(1:342)|313|314|(2:316|(2:318|(7:320|(5:322|(1:324)|325|326|(1:328))(1:336)|329|(1:331)(1:335)|332|333|334))(3:337|338|339))|340|341|334|307)|343|344|(1:346)(1:348)|347|186|187|(0)|190|(0)(0)|193|(1:195)|299|300|221|(2:(0)(0)|290)|245|246|247|248) */
                /* JADX WARN: Code restructure failed: missing block: B:279:0x376e, code lost:
                
                    r0 = r89 & (-152);
                    r3 = r4 & 151;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:419:0x06b5, code lost:
                
                    if (r2 == false) goto L62;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:421:0x06ba, code lost:
                
                    if (r2 == false) goto L62;
                 */
                /* JADX WARN: Removed duplicated region for block: B:102:0x0dec  */
                /* JADX WARN: Removed duplicated region for block: B:105:0x0f4d  */
                /* JADX WARN: Removed duplicated region for block: B:118:0x1047 A[Catch: all -> 0x392f, TryCatch #9 {all -> 0x392f, blocks: (B:6:0x0108, B:8:0x0115, B:9:0x015a, B:21:0x02cf, B:23:0x02dd, B:24:0x031a, B:31:0x0538, B:33:0x0545, B:34:0x057c, B:40:0x0794, B:42:0x079a, B:43:0x07d6, B:58:0x0a62, B:60:0x0a6f, B:61:0x0ab6, B:68:0x0b9d, B:70:0x0ba7, B:71:0x0be6, B:96:0x0d6c, B:98:0x0d76, B:99:0x0daf, B:106:0x0f4f, B:108:0x0f59, B:109:0x0f9e, B:116:0x1038, B:118:0x1047, B:119:0x1087, B:130:0x13f1, B:132:0x13fe, B:133:0x1440, B:147:0x157c, B:149:0x1589, B:150:0x15ce, B:157:0x16b3, B:159:0x16b9, B:160:0x16f7, B:163:0x17a1, B:165:0x17b3, B:166:0x17f4, B:174:0x1957, B:176:0x1961, B:177:0x19ae, B:179:0x19b7, B:181:0x19cf, B:182:0x1a16, B:187:0x2b39, B:189:0x2b43, B:190:0x2b82, B:201:0x3096, B:203:0x30a5, B:204:0x30eb, B:261:0x37ab, B:263:0x37b8, B:264:0x37f4, B:209:0x31d6, B:211:0x31e3, B:212:0x3220, B:301:0x2b90, B:303:0x2ba8, B:304:0x2bef, B:310:0x27f7, B:312:0x2801, B:313:0x2855, B:322:0x2881, B:324:0x2891, B:325:0x28d9, B:411:0x0648, B:413:0x0652, B:414:0x0694, B:424:0x071b, B:426:0x0725, B:427:0x0761, B:436:0x03e3, B:438:0x03f1, B:439:0x042c), top: B:5:0x0108 }] */
                /* JADX WARN: Removed duplicated region for block: B:122:0x112a  */
                /* JADX WARN: Removed duplicated region for block: B:126:0x12f5  */
                /* JADX WARN: Removed duplicated region for block: B:146:0x157a  */
                /* JADX WARN: Removed duplicated region for block: B:159:0x16b9 A[Catch: all -> 0x392f, TryCatch #9 {all -> 0x392f, blocks: (B:6:0x0108, B:8:0x0115, B:9:0x015a, B:21:0x02cf, B:23:0x02dd, B:24:0x031a, B:31:0x0538, B:33:0x0545, B:34:0x057c, B:40:0x0794, B:42:0x079a, B:43:0x07d6, B:58:0x0a62, B:60:0x0a6f, B:61:0x0ab6, B:68:0x0b9d, B:70:0x0ba7, B:71:0x0be6, B:96:0x0d6c, B:98:0x0d76, B:99:0x0daf, B:106:0x0f4f, B:108:0x0f59, B:109:0x0f9e, B:116:0x1038, B:118:0x1047, B:119:0x1087, B:130:0x13f1, B:132:0x13fe, B:133:0x1440, B:147:0x157c, B:149:0x1589, B:150:0x15ce, B:157:0x16b3, B:159:0x16b9, B:160:0x16f7, B:163:0x17a1, B:165:0x17b3, B:166:0x17f4, B:174:0x1957, B:176:0x1961, B:177:0x19ae, B:179:0x19b7, B:181:0x19cf, B:182:0x1a16, B:187:0x2b39, B:189:0x2b43, B:190:0x2b82, B:201:0x3096, B:203:0x30a5, B:204:0x30eb, B:261:0x37ab, B:263:0x37b8, B:264:0x37f4, B:209:0x31d6, B:211:0x31e3, B:212:0x3220, B:301:0x2b90, B:303:0x2ba8, B:304:0x2bef, B:310:0x27f7, B:312:0x2801, B:313:0x2855, B:322:0x2881, B:324:0x2891, B:325:0x28d9, B:411:0x0648, B:413:0x0652, B:414:0x0694, B:424:0x071b, B:426:0x0725, B:427:0x0761, B:436:0x03e3, B:438:0x03f1, B:439:0x042c), top: B:5:0x0108 }] */
                /* JADX WARN: Removed duplicated region for block: B:163:0x17a1 A[Catch: all -> 0x392f, TRY_ENTER, TryCatch #9 {all -> 0x392f, blocks: (B:6:0x0108, B:8:0x0115, B:9:0x015a, B:21:0x02cf, B:23:0x02dd, B:24:0x031a, B:31:0x0538, B:33:0x0545, B:34:0x057c, B:40:0x0794, B:42:0x079a, B:43:0x07d6, B:58:0x0a62, B:60:0x0a6f, B:61:0x0ab6, B:68:0x0b9d, B:70:0x0ba7, B:71:0x0be6, B:96:0x0d6c, B:98:0x0d76, B:99:0x0daf, B:106:0x0f4f, B:108:0x0f59, B:109:0x0f9e, B:116:0x1038, B:118:0x1047, B:119:0x1087, B:130:0x13f1, B:132:0x13fe, B:133:0x1440, B:147:0x157c, B:149:0x1589, B:150:0x15ce, B:157:0x16b3, B:159:0x16b9, B:160:0x16f7, B:163:0x17a1, B:165:0x17b3, B:166:0x17f4, B:174:0x1957, B:176:0x1961, B:177:0x19ae, B:179:0x19b7, B:181:0x19cf, B:182:0x1a16, B:187:0x2b39, B:189:0x2b43, B:190:0x2b82, B:201:0x3096, B:203:0x30a5, B:204:0x30eb, B:261:0x37ab, B:263:0x37b8, B:264:0x37f4, B:209:0x31d6, B:211:0x31e3, B:212:0x3220, B:301:0x2b90, B:303:0x2ba8, B:304:0x2bef, B:310:0x27f7, B:312:0x2801, B:313:0x2855, B:322:0x2881, B:324:0x2891, B:325:0x28d9, B:411:0x0648, B:413:0x0652, B:414:0x0694, B:424:0x071b, B:426:0x0725, B:427:0x0761, B:436:0x03e3, B:438:0x03f1, B:439:0x042c), top: B:5:0x0108 }] */
                /* JADX WARN: Removed duplicated region for block: B:189:0x2b43 A[Catch: all -> 0x392f, TryCatch #9 {all -> 0x392f, blocks: (B:6:0x0108, B:8:0x0115, B:9:0x015a, B:21:0x02cf, B:23:0x02dd, B:24:0x031a, B:31:0x0538, B:33:0x0545, B:34:0x057c, B:40:0x0794, B:42:0x079a, B:43:0x07d6, B:58:0x0a62, B:60:0x0a6f, B:61:0x0ab6, B:68:0x0b9d, B:70:0x0ba7, B:71:0x0be6, B:96:0x0d6c, B:98:0x0d76, B:99:0x0daf, B:106:0x0f4f, B:108:0x0f59, B:109:0x0f9e, B:116:0x1038, B:118:0x1047, B:119:0x1087, B:130:0x13f1, B:132:0x13fe, B:133:0x1440, B:147:0x157c, B:149:0x1589, B:150:0x15ce, B:157:0x16b3, B:159:0x16b9, B:160:0x16f7, B:163:0x17a1, B:165:0x17b3, B:166:0x17f4, B:174:0x1957, B:176:0x1961, B:177:0x19ae, B:179:0x19b7, B:181:0x19cf, B:182:0x1a16, B:187:0x2b39, B:189:0x2b43, B:190:0x2b82, B:201:0x3096, B:203:0x30a5, B:204:0x30eb, B:261:0x37ab, B:263:0x37b8, B:264:0x37f4, B:209:0x31d6, B:211:0x31e3, B:212:0x3220, B:301:0x2b90, B:303:0x2ba8, B:304:0x2bef, B:310:0x27f7, B:312:0x2801, B:313:0x2855, B:322:0x2881, B:324:0x2891, B:325:0x28d9, B:411:0x0648, B:413:0x0652, B:414:0x0694, B:424:0x071b, B:426:0x0725, B:427:0x0761, B:436:0x03e3, B:438:0x03f1, B:439:0x042c), top: B:5:0x0108 }] */
                /* JADX WARN: Removed duplicated region for block: B:192:0x2b8b  */
                /* JADX WARN: Removed duplicated region for block: B:223:0x351f  */
                /* JADX WARN: Removed duplicated region for block: B:252:0x3671 A[Catch: all -> 0x36af, TryCatch #8 {all -> 0x36af, blocks: (B:250:0x3662, B:252:0x3671, B:253:0x36b2), top: B:249:0x3662, outer: #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:258:0x3751  */
                /* JADX WARN: Removed duplicated region for block: B:263:0x37b8 A[Catch: all -> 0x392f, TryCatch #9 {all -> 0x392f, blocks: (B:6:0x0108, B:8:0x0115, B:9:0x015a, B:21:0x02cf, B:23:0x02dd, B:24:0x031a, B:31:0x0538, B:33:0x0545, B:34:0x057c, B:40:0x0794, B:42:0x079a, B:43:0x07d6, B:58:0x0a62, B:60:0x0a6f, B:61:0x0ab6, B:68:0x0b9d, B:70:0x0ba7, B:71:0x0be6, B:96:0x0d6c, B:98:0x0d76, B:99:0x0daf, B:106:0x0f4f, B:108:0x0f59, B:109:0x0f9e, B:116:0x1038, B:118:0x1047, B:119:0x1087, B:130:0x13f1, B:132:0x13fe, B:133:0x1440, B:147:0x157c, B:149:0x1589, B:150:0x15ce, B:157:0x16b3, B:159:0x16b9, B:160:0x16f7, B:163:0x17a1, B:165:0x17b3, B:166:0x17f4, B:174:0x1957, B:176:0x1961, B:177:0x19ae, B:179:0x19b7, B:181:0x19cf, B:182:0x1a16, B:187:0x2b39, B:189:0x2b43, B:190:0x2b82, B:201:0x3096, B:203:0x30a5, B:204:0x30eb, B:261:0x37ab, B:263:0x37b8, B:264:0x37f4, B:209:0x31d6, B:211:0x31e3, B:212:0x3220, B:301:0x2b90, B:303:0x2ba8, B:304:0x2bef, B:310:0x27f7, B:312:0x2801, B:313:0x2855, B:322:0x2881, B:324:0x2891, B:325:0x28d9, B:411:0x0648, B:413:0x0652, B:414:0x0694, B:424:0x071b, B:426:0x0725, B:427:0x0761, B:436:0x03e3, B:438:0x03f1, B:439:0x042c), top: B:5:0x0108 }] */
                /* JADX WARN: Removed duplicated region for block: B:271:0x3757  */
                /* JADX WARN: Removed duplicated region for block: B:291:0x3604 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:301:0x2b90 A[Catch: all -> 0x392f, TryCatch #9 {all -> 0x392f, blocks: (B:6:0x0108, B:8:0x0115, B:9:0x015a, B:21:0x02cf, B:23:0x02dd, B:24:0x031a, B:31:0x0538, B:33:0x0545, B:34:0x057c, B:40:0x0794, B:42:0x079a, B:43:0x07d6, B:58:0x0a62, B:60:0x0a6f, B:61:0x0ab6, B:68:0x0b9d, B:70:0x0ba7, B:71:0x0be6, B:96:0x0d6c, B:98:0x0d76, B:99:0x0daf, B:106:0x0f4f, B:108:0x0f59, B:109:0x0f9e, B:116:0x1038, B:118:0x1047, B:119:0x1087, B:130:0x13f1, B:132:0x13fe, B:133:0x1440, B:147:0x157c, B:149:0x1589, B:150:0x15ce, B:157:0x16b3, B:159:0x16b9, B:160:0x16f7, B:163:0x17a1, B:165:0x17b3, B:166:0x17f4, B:174:0x1957, B:176:0x1961, B:177:0x19ae, B:179:0x19b7, B:181:0x19cf, B:182:0x1a16, B:187:0x2b39, B:189:0x2b43, B:190:0x2b82, B:201:0x3096, B:203:0x30a5, B:204:0x30eb, B:261:0x37ab, B:263:0x37b8, B:264:0x37f4, B:209:0x31d6, B:211:0x31e3, B:212:0x3220, B:301:0x2b90, B:303:0x2ba8, B:304:0x2bef, B:310:0x27f7, B:312:0x2801, B:313:0x2855, B:322:0x2881, B:324:0x2891, B:325:0x28d9, B:411:0x0648, B:413:0x0652, B:414:0x0694, B:424:0x071b, B:426:0x0725, B:427:0x0761, B:436:0x03e3, B:438:0x03f1, B:439:0x042c), top: B:5:0x0108 }] */
                /* JADX WARN: Removed duplicated region for block: B:352:0x38a8  */
                /* JADX WARN: Removed duplicated region for block: B:354:0x169c A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:356:0x1131  */
                /* JADX WARN: Removed duplicated region for block: B:391:0x0fc4 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:393:0x0dee  */
                /* JADX WARN: Removed duplicated region for block: B:394:0x0d2e  */
                /* JADX WARN: Removed duplicated region for block: B:404:0x0b66 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:407:0x093e  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x079a A[Catch: all -> 0x392f, TryCatch #9 {all -> 0x392f, blocks: (B:6:0x0108, B:8:0x0115, B:9:0x015a, B:21:0x02cf, B:23:0x02dd, B:24:0x031a, B:31:0x0538, B:33:0x0545, B:34:0x057c, B:40:0x0794, B:42:0x079a, B:43:0x07d6, B:58:0x0a62, B:60:0x0a6f, B:61:0x0ab6, B:68:0x0b9d, B:70:0x0ba7, B:71:0x0be6, B:96:0x0d6c, B:98:0x0d76, B:99:0x0daf, B:106:0x0f4f, B:108:0x0f59, B:109:0x0f9e, B:116:0x1038, B:118:0x1047, B:119:0x1087, B:130:0x13f1, B:132:0x13fe, B:133:0x1440, B:147:0x157c, B:149:0x1589, B:150:0x15ce, B:157:0x16b3, B:159:0x16b9, B:160:0x16f7, B:163:0x17a1, B:165:0x17b3, B:166:0x17f4, B:174:0x1957, B:176:0x1961, B:177:0x19ae, B:179:0x19b7, B:181:0x19cf, B:182:0x1a16, B:187:0x2b39, B:189:0x2b43, B:190:0x2b82, B:201:0x3096, B:203:0x30a5, B:204:0x30eb, B:261:0x37ab, B:263:0x37b8, B:264:0x37f4, B:209:0x31d6, B:211:0x31e3, B:212:0x3220, B:301:0x2b90, B:303:0x2ba8, B:304:0x2bef, B:310:0x27f7, B:312:0x2801, B:313:0x2855, B:322:0x2881, B:324:0x2891, B:325:0x28d9, B:411:0x0648, B:413:0x0652, B:414:0x0694, B:424:0x071b, B:426:0x0725, B:427:0x0761, B:436:0x03e3, B:438:0x03f1, B:439:0x042c), top: B:5:0x0108 }] */
                /* JADX WARN: Removed duplicated region for block: B:46:0x08f6  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0939 A[Catch: IOException -> 0x0950, TryCatch #5 {IOException -> 0x0950, blocks: (B:49:0x08fc, B:51:0x0939, B:52:0x093f), top: B:48:0x08fc }] */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0948  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0a60  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0ba7 A[Catch: all -> 0x392f, TryCatch #9 {all -> 0x392f, blocks: (B:6:0x0108, B:8:0x0115, B:9:0x015a, B:21:0x02cf, B:23:0x02dd, B:24:0x031a, B:31:0x0538, B:33:0x0545, B:34:0x057c, B:40:0x0794, B:42:0x079a, B:43:0x07d6, B:58:0x0a62, B:60:0x0a6f, B:61:0x0ab6, B:68:0x0b9d, B:70:0x0ba7, B:71:0x0be6, B:96:0x0d6c, B:98:0x0d76, B:99:0x0daf, B:106:0x0f4f, B:108:0x0f59, B:109:0x0f9e, B:116:0x1038, B:118:0x1047, B:119:0x1087, B:130:0x13f1, B:132:0x13fe, B:133:0x1440, B:147:0x157c, B:149:0x1589, B:150:0x15ce, B:157:0x16b3, B:159:0x16b9, B:160:0x16f7, B:163:0x17a1, B:165:0x17b3, B:166:0x17f4, B:174:0x1957, B:176:0x1961, B:177:0x19ae, B:179:0x19b7, B:181:0x19cf, B:182:0x1a16, B:187:0x2b39, B:189:0x2b43, B:190:0x2b82, B:201:0x3096, B:203:0x30a5, B:204:0x30eb, B:261:0x37ab, B:263:0x37b8, B:264:0x37f4, B:209:0x31d6, B:211:0x31e3, B:212:0x3220, B:301:0x2b90, B:303:0x2ba8, B:304:0x2bef, B:310:0x27f7, B:312:0x2801, B:313:0x2855, B:322:0x2881, B:324:0x2891, B:325:0x28d9, B:411:0x0648, B:413:0x0652, B:414:0x0694, B:424:0x071b, B:426:0x0725, B:427:0x0761, B:436:0x03e3, B:438:0x03f1, B:439:0x042c), top: B:5:0x0108 }] */
                /* JADX WARN: Removed duplicated region for block: B:73:0x0bf1  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0cb0  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x0d2b  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0d76 A[Catch: all -> 0x392f, TryCatch #9 {all -> 0x392f, blocks: (B:6:0x0108, B:8:0x0115, B:9:0x015a, B:21:0x02cf, B:23:0x02dd, B:24:0x031a, B:31:0x0538, B:33:0x0545, B:34:0x057c, B:40:0x0794, B:42:0x079a, B:43:0x07d6, B:58:0x0a62, B:60:0x0a6f, B:61:0x0ab6, B:68:0x0b9d, B:70:0x0ba7, B:71:0x0be6, B:96:0x0d6c, B:98:0x0d76, B:99:0x0daf, B:106:0x0f4f, B:108:0x0f59, B:109:0x0f9e, B:116:0x1038, B:118:0x1047, B:119:0x1087, B:130:0x13f1, B:132:0x13fe, B:133:0x1440, B:147:0x157c, B:149:0x1589, B:150:0x15ce, B:157:0x16b3, B:159:0x16b9, B:160:0x16f7, B:163:0x17a1, B:165:0x17b3, B:166:0x17f4, B:174:0x1957, B:176:0x1961, B:177:0x19ae, B:179:0x19b7, B:181:0x19cf, B:182:0x1a16, B:187:0x2b39, B:189:0x2b43, B:190:0x2b82, B:201:0x3096, B:203:0x30a5, B:204:0x30eb, B:261:0x37ab, B:263:0x37b8, B:264:0x37f4, B:209:0x31d6, B:211:0x31e3, B:212:0x3220, B:301:0x2b90, B:303:0x2ba8, B:304:0x2bef, B:310:0x27f7, B:312:0x2801, B:313:0x2855, B:322:0x2881, B:324:0x2891, B:325:0x28d9, B:411:0x0648, B:413:0x0652, B:414:0x0694, B:424:0x071b, B:426:0x0725, B:427:0x0761, B:436:0x03e3, B:438:0x03f1, B:439:0x042c), top: B:5:0x0108 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object[] vD14832N6715(Context context2, int i16, int i17, int i18) {
                    int i19;
                    float f5;
                    Class cls9;
                    int i20;
                    char c3;
                    int i21;
                    int i22;
                    int i23;
                    int i24;
                    int i25;
                    String str12;
                    int i26;
                    int i27;
                    int i28;
                    int i29;
                    int i30;
                    Object D8871;
                    long j6;
                    String str13;
                    File file;
                    int i31;
                    int i32;
                    char c4;
                    String[] strArr;
                    int i33;
                    int i34;
                    long j7;
                    int i35;
                    Object D88712;
                    String str14;
                    int i36;
                    File file2;
                    boolean z11;
                    Object D88713;
                    int i37;
                    int i38;
                    char c10;
                    int i39;
                    int i40;
                    int i41;
                    int i42;
                    Object D88714;
                    int i43;
                    int i44;
                    int i45;
                    String str15;
                    int i46;
                    int i47;
                    int i48;
                    char c11;
                    int i49;
                    int i50;
                    int i51;
                    int i52;
                    Object D88715;
                    int i53;
                    int foxtrot;
                    int i54;
                    String[] strArr2;
                    int i55;
                    int i56;
                    long j10;
                    long j11;
                    int i57;
                    int i58;
                    String[] strArr3;
                    int i59;
                    int i60;
                    String[][] strArr4;
                    long j12;
                    String[] strArr5;
                    int i61;
                    Object D88716;
                    Object invoke;
                    String[] strArr6;
                    int i62;
                    int i63;
                    int i64;
                    char c12;
                    int i65;
                    int i66;
                    int i67;
                    int i68;
                    int i69;
                    int i70;
                    Object D88717;
                    Object D88718;
                    int i71;
                    int i72;
                    int i73;
                    String[] strArr7;
                    int i74;
                    int i75;
                    String[] strArr8;
                    int i76;
                    int i77;
                    int i78;
                    String[] strArr9;
                    String str16;
                    int i79;
                    int i80;
                    String[] strArr10;
                    String next;
                    int i81;
                    int i82;
                    int i83 = 4;
                    int i84 = 0;
                    int i85 = 1;
                    silver = (teal + 113) % 128;
                    int i86 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                    String str17 = "";
                    Object[] objArr9 = new Object[1];
                    delta((char) ((i86 ^ 1) + ((i86 & 1) << 1)), 909 - (~(-TextUtils.getTrimmedLength(""))), 8 - Color.blue(0), objArr9);
                    String str18 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    delta((char) (ViewConfiguration.getEdgeSlop() >> 16), Color.alpha(0), 27 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr10);
                    String str19 = (String) objArr10[0];
                    float f10 = 0.0f;
                    char c13 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i87 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                    Object[] objArr11 = new Object[1];
                    delta(c13, (i87 & 27) + (i87 | 27), 25 - (KeyEvent.getMaxKeyCode() >> 16), objArr11);
                    String str20 = (String) objArr11[0];
                    char c14 = (char) (54473 - (~(-Gravity.getAbsoluteGravity(0, 0))));
                    int i88 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    Object[] objArr12 = new Object[1];
                    delta(c14, ((i88 | 52) << 1) - (i88 ^ 52), 18 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr12);
                    String str21 = (String) objArr12[0];
                    char c15 = (char) (61332 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int i89 = -View.MeasureSpec.getMode(0);
                    int i90 = ((i89 | 70) << 1) - (i89 ^ 70);
                    int i91 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                    Object[] objArr13 = new Object[1];
                    delta(c15, i90, (i91 & 28) + (i91 | 28), objArr13);
                    String[] strArr11 = {str19, str20, str21, (String) objArr13[0]};
                    int i92 = 0;
                    while (true) {
                        if (i92 >= i83) {
                            i19 = i85;
                            f5 = f10;
                            cls9 = String.class;
                            i20 = i83;
                            c3 = ' ';
                            i21 = 2;
                            i22 = i16;
                            i23 = i84;
                            break;
                        }
                        int i93 = teal;
                        silver = ((i93 & 95) + (i93 | 95)) % 128;
                        c3 = ' ';
                        try {
                            Object[] objArr14 = new Object[i85];
                            objArr14[i84] = strArr11[i92];
                            Object D88719 = uH18377.D8871(-2104138125);
                            if (D88719 == null) {
                                int size = View.MeasureSpec.getSize(i84) + 52;
                                int indexOf2 = TextUtils.indexOf("", "", i84, i84) + 2951;
                                char c16 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                i21 = 2;
                                byte b2 = (byte) i84;
                                f5 = f10;
                                byte b4 = (byte) (b2 + 1);
                                i20 = i83;
                                Object[] objArr15 = new Object[i85];
                                foxtrot(b2, b4, b4, objArr15);
                                String str22 = (String) objArr15[i84];
                                Class[] clsArr2 = new Class[i85];
                                clsArr2[i84] = String.class;
                                D88719 = uH18377.setPivotYN16904(size, indexOf2, c16, 1563346086, false, str22, clsArr2);
                            } else {
                                f5 = f10;
                                i20 = i83;
                                i21 = 2;
                            }
                            long longValue = ((Long) ((Method) D88719).invoke(null, objArr14)).longValue();
                            long j13 = -552094609;
                            long j14 = 471;
                            long j15 = -470;
                            long j16 = (j13 | longValue) * j15;
                            long j17 = -1;
                            long j18 = longValue ^ j17;
                            cls9 = String.class;
                            long j19 = i16;
                            long j20 = (((j19 ^ j17) | j13) | longValue) ^ j17;
                            i19 = i85;
                            long j21 = ((470 * (j20 | (((j18 | j13) | j19) ^ j17))) + ((j15 * (((((j13 ^ j17) | j18) ^ j17) | ((j18 | j19) ^ j17)) | j20)) + (j16 + ((j14 * longValue) + (j14 * j13))))) - 677525921;
                            int i94 = ~i16;
                            if (((((int) (j21 >> 32)) & ((((~((-336922019) | i94)) | 25186304) * 241) + ((((~(1273002585 | i94)) | (-1609924604)) * (-241)) - 1782478482))) | (((((~(i94 | (-8388881))) | (~((-1744865869) | i16))) * 318) + (((~((-316028339) | i16)) | (~((-1744865869) | i94))) * 318) + (((~(1753254748 | i16)) | (-316028339)) * (-318)) + 1955715507) & ((int) j21))) != 0) {
                                i22 = i16 ^ ((i92 ^ 190) + ((i92 & 190) << 1));
                                teal = (silver + 57) % 128;
                                i23 = 0;
                                break;
                            }
                            i92++;
                            i85 = i19;
                            f10 = f5;
                            i83 = i20;
                            i84 = 0;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    }
                    char indexOf3 = (char) TextUtils.indexOf("", "", i23, i23);
                    int longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                    int i95 = (longPressTimeout ^ 98) + ((longPressTimeout & 98) << 1);
                    int i96 = -(ViewConfiguration.getScrollBarSize() >> 8);
                    int i97 = ((i96 | 12) << 1) - (i96 ^ 12);
                    int i98 = i19;
                    Object[] objArr16 = new Object[i98];
                    delta(indexOf3, i95, i97, objArr16);
                    String str23 = (String) objArr16[0];
                    int lastIndexOf = TextUtils.lastIndexOf("", '0', 0);
                    int modifierMetaStateMask2 = 109 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int i99 = -(-(Process.myTid() >> 22));
                    int i100 = (i99 & 13) + (i99 | 13);
                    Object[] objArr17 = new Object[1];
                    delta((char) ((lastIndexOf ^ 11772) + ((lastIndexOf & 11772) << i98)), modifierMetaStateMask2, i100, objArr17);
                    String str24 = (String) objArr17[0];
                    char c17 = (char) (14524 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16))));
                    int i101 = -ImageFormat.getBitsPerPixel(0);
                    int i102 = (i101 ^ 122) + ((i101 & 122) << 1);
                    int threadPriority = Process.getThreadPriority(0);
                    int i103 = ((threadPriority | 20) << 1) - (threadPriority ^ 20);
                    int i104 = 6;
                    int i105 = i103 >> 6;
                    int i106 = (i105 & 18) + (i105 | 18);
                    Object[] objArr18 = new Object[1];
                    delta(c17, i102, i106, objArr18);
                    String[] strArr12 = {str23, str24, (String) objArr18[0]};
                    int i107 = 0;
                    while (i107 < 3) {
                        int i108 = teal;
                        int i109 = (i108 ^ 35) + ((i108 & 35) << 1);
                        silver = i109 % 128;
                        if (i109 % 2 != 0) {
                            Object[] objArr19 = {strArr12[i107]};
                            Object D887110 = uH18377.D8871(1979478258);
                            if (D887110 == null) {
                                int alpha = 52 - Color.alpha(0);
                                int argb = Color.argb(0, 0, 0, 0) + 2951;
                                char c18 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                byte b6 = (byte) 0;
                                byte b10 = (byte) (b6 + 1);
                                Object[] objArr20 = new Object[1];
                                foxtrot(b6, b10, (byte) (b10 - 1), objArr20);
                                D887110 = uH18377.setPivotYN16904(alpha, argb, c18, -1438133721, false, (String) objArr20[0], new Class[]{cls9});
                            }
                            long longValue2 = ((Long) ((Method) D887110).invoke(null, objArr19)).longValue();
                            long j22 = 171323436;
                            long j23 = ((-987) * longValue2) + (989 * j22);
                            long j24 = 988;
                            i25 = i104;
                            long j25 = -1;
                            long j26 = longValue2 ^ j25;
                            i82 = i107;
                            long myPid = Process.myPid();
                            long j27 = myPid ^ j25;
                            long j28 = (j24 * ((((j22 ^ j25) | j26) ^ j25) | ((j26 | myPid) ^ j25) | (((j27 | j22) | longValue2) ^ j25))) + ((-988) * (j22 | j26)) + (((((j26 | j27) | j22) ^ j25) | (((j22 | longValue2) | myPid) ^ j25)) * j24) + j23 + 603497870;
                            int i110 = ((((~((-1777872273) | i16)) | 1773152272) | (~(340645861 | i16))) * (-880)) - 818885110;
                            int i111 = ~i16;
                            int i112 = (~((-1777872273) | i111)) | (-340645862);
                            int i113 = ~(1777872272 | i16);
                            int i114 = ((int) (j28 << i20)) & ((i113 * 880) + ((i112 | i113) * (-880)) + i110);
                            i24 = i22;
                            str12 = str17;
                            if ((i114 | (((int) j28) & (((~((-960100162) | i16)) * 113) + (((~(i111 | (-136332354))) | (~((-1897640725) | i16)) | 1073872916) * (-113)) + (((~((-960100162) | i111)) | 1897640724) * 226) + 2055568080))) != 0) {
                                i81 = i82;
                                int i115 = i81;
                                int i116 = ((i115 | 270) << 1) - (i115 ^ 270);
                                i26 = (i116 | i16) & (~(i16 & i116));
                                break;
                            }
                            int i117 = (i82 & (-79)) + (i82 | (-79));
                            i107 = (i117 ^ 80) + ((i117 & 80) << 1);
                            str17 = str12;
                            i104 = i25;
                            i22 = i24;
                        } else {
                            int i118 = i107;
                            i25 = i104;
                            Object[] objArr21 = {strArr12[i118]};
                            Object D887111 = uH18377.D8871(1979478258);
                            if (D887111 == null) {
                                int deadChar = KeyEvent.getDeadChar(0, 0) + 52;
                                int touchSlop = 2951 - (ViewConfiguration.getTouchSlop() >> 8);
                                char gidForName = (char) (Process.getGidForName(str17) + 1);
                                byte b11 = (byte) 0;
                                byte b12 = (byte) (b11 + 1);
                                Object[] objArr22 = new Object[1];
                                foxtrot(b11, b12, (byte) (b12 - 1), objArr22);
                                D887111 = uH18377.setPivotYN16904(deadChar, touchSlop, gidForName, -1438133721, false, (String) objArr22[0], new Class[]{cls9});
                            }
                            long longValue3 = ((Long) ((Method) D887111).invoke(null, objArr21)).longValue();
                            long j29 = -801081270;
                            i81 = i118;
                            str12 = str17;
                            long j30 = i16;
                            i24 = i22;
                            long j31 = -1;
                            long j32 = longValue3 ^ j31;
                            long j33 = 676;
                            long j34 = j30 ^ j31;
                            long j35 = (j33 * ((j31 ^ ((j29 | longValue3) | j30)) | (((j29 ^ j31) | j32) ^ j31) | ((j32 | j34) ^ j31))) + ((((j32 | j29) ^ j31) | ((j34 | j29) ^ j31)) * j33) + ((-676) * (j29 | j30 | j32)) + ((-675) * longValue3) + (677 * j29) + 1575902576;
                            int i119 = ((~(2113211321 | i16)) * 216) - 1686776214;
                            int i120 = ~i16;
                            int i121 = ((int) (j35 >> c3)) & ((((~(2113211321 | i120)) | (-675984911)) * 216) + ((2113912767 | i120) * (-216)) + i119);
                            int i122 = (~(167161132 | i120)) | 1107361873;
                            int i123 = ((int) j35) & (((~(1270065277 | i120)) * 713) + ((~((-4457729) | i16)) * 1426) + (((i122 | r6) * (-713)) - 1045586194));
                            if (((i121 & i123) | (i121 ^ i123)) != 0) {
                                int i1152 = i81;
                                int i1162 = ((i1152 | 270) << 1) - (i1152 ^ 270);
                                i26 = (i1162 | i16) & (~(i16 & i1162));
                                break;
                            }
                            i82 = i81;
                            int i1172 = (i82 & (-79)) + (i82 | (-79));
                            i107 = (i1172 ^ 80) + ((i1172 & 80) << 1);
                            str17 = str12;
                            i104 = i25;
                            i22 = i24;
                        }
                    }
                    i24 = i22;
                    i25 = i104;
                    str12 = str17;
                    i26 = i16;
                    int i124 = (~(i16 & i24)) & (i16 | i24);
                    int i125 = (i124 | (-i124)) >> 31;
                    int i126 = i26 & (~i125);
                    int i127 = i24 & i125;
                    int i128 = (i126 & i127) | (i126 ^ i127);
                    int i129 = -(-View.MeasureSpec.getSize(0));
                    int indexOf4 = 141 - TextUtils.indexOf(str12, str12);
                    int i130 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i131 = (i130 ^ 14) + ((i130 & 14) << 1);
                    Object[] objArr23 = new Object[1];
                    delta((char) ((i129 ^ 26374) + ((i129 & 26374) << 1)), indexOf4, i131, objArr23);
                    Object[] objArr24 = {(String) objArr23[0]};
                    Object D887112 = uH18377.D8871(-2104138125);
                    if (D887112 == null) {
                        int deadChar2 = 52 - KeyEvent.getDeadChar(0, 0);
                        int deadChar3 = 2951 - KeyEvent.getDeadChar(0, 0);
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 + 1);
                        Object[] objArr25 = new Object[1];
                        foxtrot(b13, b14, b14, objArr25);
                        D887112 = uH18377.setPivotYN16904(deadChar2, deadChar3, pressedStateDuration, 1563346086, false, (String) objArr25[0], new Class[]{cls9});
                    }
                    long longValue4 = ((Long) ((Method) D887112).invoke(null, objArr24)).longValue();
                    long j36 = 283566593;
                    long j37 = -755;
                    long j38 = -1;
                    long j39 = ((j36 ^ j38) | (longValue4 ^ j38)) ^ j38;
                    long j40 = (1512 * j39) + (j37 * longValue4) + (j37 * j36);
                    long j41 = longValue4 | j36;
                    long uptimeMillis = (int) SystemClock.uptimeMillis();
                    long j42 = ((756 * (j41 | (uptimeMillis ^ j38))) + (((-756) * (j39 | ((j41 | uptimeMillis) ^ j38))) + j40)) - 1513187123;
                    int i132 = ((int) (j42 >> c3)) & ((((~((~((int) Process.getElapsedCpuTime())) | 175772147)) | (-1784575598)) * 398) + ((((~(175772147 | r3)) | (-1784575598)) * 398) - 863245046));
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i133 = ((int) j42) & ((((~(elapsedCpuTime | 2026456716)) | 51818594) * 116) + ((589230306 | elapsedCpuTime) * 116) + ((~((~elapsedCpuTime) | (-1489045005))) * (-116)) + 2072280017);
                    if (((i132 & i133) | (i132 ^ i133)) != 0) {
                        i28 = i16 & (-267);
                        i29 = (~i16) & 266;
                    } else {
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int i134 = -View.getDefaultSize(0, 0);
                        Object[] objArr26 = new Object[1];
                        delta(tapTimeout, ((i134 | 155) << 1) - (i134 ^ 155), 22 - (~(-(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))), objArr26);
                        Object[] objArr27 = {(String) objArr26[0]};
                        Object D887113 = uH18377.D8871(-957097391);
                        if (D887113 == null) {
                            int fadingEdgeLength = 52 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int myPid2 = 3158 - (Process.myPid() >> 22);
                            char c19 = (char) (58075 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            byte b15 = (byte) 0;
                            byte b16 = (byte) (b15 + 1);
                            Object[] objArr28 = new Object[1];
                            foxtrot(b15, b16, (byte) (b16 + 1), objArr28);
                            D887113 = uH18377.setPivotYN16904(fadingEdgeLength, myPid2, c19, 424179844, false, (String) objArr28[0], new Class[]{cls9});
                        }
                        String str25 = (String) ((Method) D887113).invoke(null, objArr27);
                        if (str25 != null) {
                            int i135 = teal + 103;
                            silver = i135 % 128;
                            int i136 = i135 % 2;
                            boolean isEmpty = str25.isEmpty();
                            if (i136 != 0) {
                                int i137 = 16 / 0;
                            }
                            int i138 = (~i128) & i16;
                            i30 = ~i16;
                            int i139 = i138 | (i128 & i30);
                            int i140 = -i139;
                            int i141 = ((i139 & i140) | (i139 ^ i140)) >> 31;
                            int i142 = i27 & (~i141);
                            int i143 = i128 & i141;
                            int i144 = (i143 & i142) | (i142 ^ i143);
                            D8871 = uH18377.D8871(1074526551);
                            if (D8871 == null) {
                                int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 51;
                                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1055;
                                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                byte b17 = (byte) 0;
                                byte b18 = b17;
                                Object[] objArr29 = new Object[1];
                                foxtrot(b17, b18, (byte) (b18 + 2), objArr29);
                                D8871 = uH18377.setPivotYN16904(threadPriority2, packedPositionGroup, keyRepeatTimeout, -1615832190, false, (String) objArr29[0], new Class[0]);
                            }
                            long longValue5 = ((Long) ((Method) D8871).invoke(null, null)).longValue();
                            long j43 = -1967520600;
                            long j44 = (989 * longValue5) + ((-1975) * j43);
                            long j45 = 988;
                            j6 = i16;
                            long j46 = ((j43 ^ j38) | longValue5) ^ j38;
                            long j47 = longValue5 ^ j38;
                            long j48 = j6 ^ j38;
                            long j49 = (j45 * (j46 | ((j47 | j6) ^ j38) | ((j48 | longValue5) ^ j38))) + ((-1976) * (((j47 | j43) ^ j38) | ((j48 | j43) ^ j38))) + ((j6 | j46) * j45) + j44 + 2147086317;
                            int i145 = ((int) (j49 >> c3)) & ((((-75502689) | i16) * 220) + (((~((-629183601) | i30)) | 2066410011) * (-440)) + (((~((-75502689) | i30)) | 1512729099) * 220) + 1762334202);
                            int uptimeMillis2 = ((int) j49) & (((((int) SystemClock.uptimeMillis()) | (-77770851)) * 591) + ((((~((-77770851) | (~r8))) | 1514997260) * (-591)) - 709110634));
                            int i146 = (i145 & uptimeMillis2) | (i145 ^ uptimeMillis2);
                            int i147 = i146 - 1;
                            int i148 = (i147 ^ 200) + ((i147 & 200) << 1);
                            int i149 = ((~i148) & i16) | (i148 & i30);
                            int i150 = -i146;
                            int i151 = ((i146 & i150) | (i146 ^ i150)) >> 31;
                            int i152 = (~i151) & i16;
                            int i153 = i151 & i149;
                            int i154 = (i153 & i152) | (i152 ^ i153);
                            int i155 = i16 ^ i144;
                            int i156 = -i155;
                            int i157 = ((i155 & i156) | (i155 ^ i156)) >> 31;
                            int i158 = i154 & (~i157);
                            int i159 = i144 & i157;
                            int i160 = (i159 & i158) | (i158 ^ i159);
                            char c20 = (char) (61633 - (~(-(-ExpandableListView.getPackedPositionGroup(0L)))));
                            int i161 = 201 - (~(ViewConfiguration.getScrollFriction() > f5 ? 1 : (ViewConfiguration.getScrollFriction() == f5 ? 0 : -1)));
                            int i162 = -KeyEvent.keyCodeFromString(str12);
                            int i163 = ((i162 | 20) << 1) - (i162 ^ 20);
                            Object[] objArr30 = new Object[1];
                            delta(c20, i161, i163, objArr30);
                            String str26 = (String) objArr30[0];
                            int i164 = -Process.getGidForName(str12);
                            Object[] objArr31 = new Object[1];
                            delta((char) ((i164 ^ 7672) + ((i164 & 7672) << 1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 223, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6, objArr31);
                            str13 = (String) objArr31[0];
                            file = new File(str26);
                            if (file.exists() && file.isFile()) {
                                try {
                                    Scanner scanner = new Scanner(new FileInputStream(file));
                                    char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                    int i165 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    Object[] objArr32 = new Object[1];
                                    delta(pressedStateDuration2, (i165 ^ 230) + ((i165 & 230) << 1), 1 - (~(ViewConfiguration.getPressedStateDuration() >> 16)), objArr32);
                                    Scanner useDelimiter = scanner.useDelimiter((String) objArr32[0]);
                                    next = !useDelimiter.hasNext() ? useDelimiter.next() : str12;
                                    useDelimiter.close();
                                } catch (IOException unused) {
                                }
                                if (next.contains(str13)) {
                                    yY18494.component9();
                                    yY18494.component9();
                                    i31 = 1;
                                    int i166 = -i31;
                                    int i167 = ((i31 & i166) | (i31 ^ i166)) >> 31;
                                    int i168 = (~i167) & i16;
                                    int i169 = i167 & (i16 ^ 262);
                                    int i170 = (i169 & i168) | (i168 ^ i169);
                                    int i171 = (~(i16 & i160)) & (i16 | i160);
                                    int i172 = -i171;
                                    int i173 = ((i171 & i172) | (i171 ^ i172)) >> 31;
                                    int i174 = i170 & (~i173);
                                    int i175 = i160 & i173;
                                    int i176 = (i175 & i174) | (i174 ^ i175);
                                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                    int i177 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 230;
                                    int i178 = -(ViewConfiguration.getTouchSlop() >> 8);
                                    int i179 = ~(((-32) & i30) | ((-32) ^ i30));
                                    int i180 = ~((~i178) | i16);
                                    int i181 = (((i178 * (-949)) - 29419) - (~(-(-(((i179 & i180) | (i179 ^ i180)) * 1900))))) - 1;
                                    int i182 = ~i16;
                                    int i183 = (((((~((i182 ^ i178) | (i182 & i178))) | (~((i16 ^ 31) | (i16 & 31)))) * (-950)) + i181) - (~(-(-(((~((i178 & i16) | (i178 ^ i16))) | (~((i30 ^ 31) | (i30 & 31)))) * 950))))) - 1;
                                    Object[] objArr33 = new Object[1];
                                    delta(packedPositionType, i177, i183, objArr33);
                                    String str27 = (String) objArr33[0];
                                    char keyCodeFromString = (char) (16300 - KeyEvent.keyCodeFromString(str12));
                                    int indexOf5 = TextUtils.indexOf((CharSequence) str12, '0');
                                    int i184 = (indexOf5 & 263) + (indexOf5 | 263);
                                    int i185 = -(-AndroidCharacter.getMirror('0'));
                                    int i186 = ((i185 | (-25)) << 1) - (i185 ^ (-25));
                                    Object[] objArr34 = new Object[1];
                                    delta(keyCodeFromString, i184, i186, objArr34);
                                    String str28 = (String) objArr34[0];
                                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                                    int i187 = 284 - (~(ViewConfiguration.getLongPressTimeout() >> 16));
                                    int i188 = -(Process.myTid() >> 22);
                                    Object[] objArr35 = new Object[1];
                                    delta(absoluteGravity, i187, ((i188 | 28) << 1) - (i188 ^ 28), objArr35);
                                    String str29 = (String) objArr35[0];
                                    char fadingEdgeLength2 = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 64455);
                                    int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                                    i32 = 1;
                                    int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                    c4 = 0;
                                    Object[] objArr36 = new Object[1];
                                    delta(fadingEdgeLength2, ((edgeSlop | 313) << 1) - (edgeSlop ^ 313), (resolveSizeAndState & 14) + (resolveSizeAndState | 14), objArr36);
                                    strArr = new String[]{str27, str28, str29, (String) objArr36[0]};
                                    i33 = 0;
                                    i34 = i20;
                                    while (true) {
                                        if (i33 < i34) {
                                            j7 = j6;
                                            i35 = i16;
                                            break;
                                        }
                                        Object[] objArr37 = new Object[i32];
                                        objArr37[c4] = strArr[i33];
                                        Object D887114 = uH18377.D8871(1979478258);
                                        if (D887114 == null) {
                                            int i189 = 53 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2951;
                                            char size2 = (char) View.MeasureSpec.getSize(0);
                                            byte b19 = (byte) 0;
                                            byte b20 = (byte) (b19 + 1);
                                            strArr10 = strArr;
                                            j7 = j6;
                                            Object[] objArr38 = new Object[1];
                                            foxtrot(b19, b20, (byte) (b20 - 1), objArr38);
                                            D887114 = uH18377.setPivotYN16904(i189, doubleTapTimeout, size2, -1438133721, false, (String) objArr38[0], new Class[]{cls9});
                                        } else {
                                            strArr10 = strArr;
                                            j7 = j6;
                                        }
                                        long longValue6 = ((Long) ((Method) D887114).invoke(null, objArr37)).longValue();
                                        long j50 = 126353869;
                                        long j51 = ((-216) * longValue6) + ((-433) * j50);
                                        long j52 = 217;
                                        long j53 = j50 ^ j38;
                                        long uptimeMillis3 = (int) SystemClock.uptimeMillis();
                                        long j54 = uptimeMillis3 ^ j38;
                                        long j55 = longValue6 ^ j38;
                                        long j56 = (j52 * (j50 | ((j55 | j54) ^ j38))) + ((((j53 | j55) ^ j38) | ((j53 | uptimeMillis3) ^ j38)) * j52) + ((((j53 | j54) ^ j38) | ((j55 | uptimeMillis3) ^ j38)) * j52) + j51 + 648467437;
                                        int i190 = (-1507353677) | i30;
                                        int i191 = ((int) (j56 >> c3)) & ((((~i190) | (-1509779021)) * 495) + (i190 * 495) + 1453532796);
                                        int uptimeMillis4 = (int) SystemClock.uptimeMillis();
                                        int i192 = ((int) j56) & ((((~(uptimeMillis4 | (-479276184))) | 1916502593) * HttpConstants.HTTP_BAD_GATEWAY) + ((~((~uptimeMillis4) | 2126229207)) * (-502)) + ((((~(1916502593 | uptimeMillis4)) | 1646953024) * (-502)) - 1527329585));
                                        if (((i191 & i192) | (i191 ^ i192)) != 0) {
                                            i35 = i16 ^ (i33 + 252);
                                            break;
                                        }
                                        i33 = (i33 & 1) + (i33 | 1);
                                        strArr = strArr10;
                                        j6 = j7;
                                        i34 = 4;
                                        i32 = 1;
                                        c4 = 0;
                                    }
                                    int i193 = (~(i16 & i176)) & (i16 | i176);
                                    int i194 = (i193 | (-i193)) >> 31;
                                    int i195 = (i35 & (~i194)) | (i176 & i194);
                                    int indexOf6 = TextUtils.indexOf((CharSequence) str12, '0', 0);
                                    Object[] objArr39 = new Object[1];
                                    delta((char) ((indexOf6 & 1) + (indexOf6 | 1)), 326 - (~(-(-Color.red(0)))), Color.alpha(0) + 13, objArr39);
                                    Object[] objArr40 = {(String) objArr39[0]};
                                    D88712 = uH18377.D8871(-957097391);
                                    if (D88712 == null) {
                                        int fadingEdgeLength3 = 52 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                        int i196 = 3158 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        char tapTimeout2 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 58074);
                                        byte b21 = (byte) 0;
                                        byte b22 = (byte) (b21 + 1);
                                        Object[] objArr41 = new Object[1];
                                        foxtrot(b21, b22, (byte) (b22 + 1), objArr41);
                                        D88712 = uH18377.setPivotYN16904(fadingEdgeLength3, i196, tapTimeout2, 424179844, false, (String) objArr41[0], new Class[]{cls9});
                                    }
                                    str14 = (String) ((Method) D88712).invoke(null, objArr40);
                                    if (str14 != null) {
                                        char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                        int i197 = -TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                                        int i198 = (i197 ^ 339) + ((i197 & 339) << 1);
                                        int i199 = -KeyEvent.normalizeMetaState(0);
                                        int i200 = ((i199 | 9) << 1) - (i199 ^ 9);
                                        Object[] objArr42 = new Object[1];
                                        delta(doubleTapTimeout2, i198, i200, objArr42);
                                        if (str14.contains((String) objArr42[0])) {
                                            int i201 = teal;
                                            int i202 = (i201 ^ 99) + ((i201 & 99) << 1);
                                            silver = i202 % 128;
                                            if (i202 % 2 != 0) {
                                                i79 = ~(i16 & 23201);
                                                i80 = i16 | 23201;
                                            } else {
                                                i79 = ~(i16 & 250);
                                                i80 = i16 | 250;
                                            }
                                            i36 = i79 & i80;
                                            int i203 = i16 ^ i195;
                                            int i204 = -i203;
                                            int i205 = ((i203 & i204) | (i203 ^ i204)) >> 31;
                                            int i206 = i36 & (~i205);
                                            int i207 = i195 & i205;
                                            int i208 = (i207 & i206) | (i206 ^ i207);
                                            char c21 = (char) (64292 - (~(-TextUtils.indexOf(str12, str12))));
                                            int trimmedLength = TextUtils.getTrimmedLength(str12) + 349;
                                            int i209 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            int i210 = ((i209 | 18) << 1) - (i209 ^ 18);
                                            Object[] objArr43 = new Object[1];
                                            delta(c21, trimmedLength, i210, objArr43);
                                            String str30 = (String) objArr43[0];
                                            char edgeSlop2 = (char) (32015 - (ViewConfiguration.getEdgeSlop() >> 16));
                                            int i211 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                            int i212 = (i211 ^ 366) + ((i211 & 366) << 1);
                                            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L);
                                            int i213 = (packedPositionType2 ^ 6) + ((packedPositionType2 & 6) << 1);
                                            Object[] objArr44 = new Object[1];
                                            delta(edgeSlop2, i212, i213, objArr44);
                                            String str31 = (String) objArr44[0];
                                            file2 = new File(str30);
                                            if (file2.exists()) {
                                                int i214 = teal;
                                                int i215 = (i214 & 71) + (i214 | 71);
                                                silver = i215 % 128;
                                                if (i215 % 2 != 0) {
                                                    file2.isFile();
                                                    throw null;
                                                }
                                                if (file2.isFile()) {
                                                    try {
                                                        Scanner scanner2 = new Scanner(new FileInputStream(file2));
                                                        int bitsPerPixel = 228 - ImageFormat.getBitsPerPixel(0);
                                                        int i216 = -(-Color.blue(0));
                                                        int i217 = ((i216 | 2) << 1) - (i216 ^ 2);
                                                        Object[] objArr45 = new Object[1];
                                                        delta((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), bitsPerPixel, i217, objArr45);
                                                        Scanner useDelimiter2 = scanner2.useDelimiter((String) objArr45[0]);
                                                        if (useDelimiter2.hasNext()) {
                                                            int i218 = teal;
                                                            silver = (((i218 | 123) << 1) - (i218 ^ 123)) % 128;
                                                            str16 = useDelimiter2.next();
                                                        } else {
                                                            str16 = str12;
                                                        }
                                                        useDelimiter2.close();
                                                    } catch (IOException unused2) {
                                                    }
                                                    if (str16.contains(str31)) {
                                                        z11 = true;
                                                        int i219 = !z11 ? i16 ^ 251 : i16;
                                                        int i220 = ((~i208) & i16) | (i208 & i30);
                                                        int i221 = -i220;
                                                        int i222 = ((i220 & i221) | (i220 ^ i221)) >> 31;
                                                        int i223 = i219 & (~i222);
                                                        int i224 = i208 & i222;
                                                        int i225 = (i224 & i223) | (i223 ^ i224);
                                                        char c22 = (char) (29293 - (~(-Color.green(0))));
                                                        int i226 = 371 - (~View.resolveSizeAndState(0, 0, 0));
                                                        int i227 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                        int i228 = ((i227 | 22) << 1) - (i227 ^ 22);
                                                        Object[] objArr46 = new Object[1];
                                                        delta(c22, i226, i228, objArr46);
                                                        Object[] objArr47 = {(String) objArr46[0]};
                                                        D88713 = uH18377.D8871(-957097391);
                                                        if (D88713 == null) {
                                                            int offsetBefore = 52 - TextUtils.getOffsetBefore(str12, 0);
                                                            int packedPositionChild = 3157 - ExpandableListView.getPackedPositionChild(0L);
                                                            char resolveSizeAndState2 = (char) (58074 - View.resolveSizeAndState(0, 0, 0));
                                                            byte b23 = (byte) 0;
                                                            byte b24 = (byte) (b23 + 1);
                                                            Object[] objArr48 = new Object[1];
                                                            foxtrot(b23, b24, (byte) (b24 + 1), objArr48);
                                                            D88713 = uH18377.setPivotYN16904(offsetBefore, packedPositionChild, resolveSizeAndState2, 424179844, false, (String) objArr48[0], new Class[]{cls9});
                                                        }
                                                        String lowerCase = ((String) ((Method) D88713).invoke(null, objArr47)).toLowerCase();
                                                        char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                                        int i229 = -(-TextUtils.lastIndexOf(str12, '0'));
                                                        int i230 = ((i229 | 396) << 1) - (i229 ^ 396);
                                                        int indexOf7 = TextUtils.indexOf((CharSequence) str12, '0');
                                                        int i231 = (indexOf7 & 5) + (indexOf7 | 5);
                                                        Object[] objArr49 = new Object[1];
                                                        delta(touchSlop2, i230, i231, objArr49);
                                                        int i232 = lowerCase.contains((String) objArr49[0]) ? i16 : (i16 & (-265)) | (i30 & 264);
                                                        int i233 = ((~i225) & i16) | (i225 & i30);
                                                        int i234 = -i233;
                                                        int i235 = ((i233 & i234) | (i233 ^ i234)) >> 31;
                                                        int i236 = i232 & (~i235);
                                                        int i237 = i225 & i235;
                                                        i37 = (i237 & i236) | (i236 ^ i237);
                                                        char doubleTapTimeout3 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                        int i238 = 400 - (ViewConfiguration.getScrollFriction() > f5 ? 1 : (ViewConfiguration.getScrollFriction() == f5 ? 0 : -1));
                                                        int i239 = -(TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1));
                                                        int i240 = (i239 & 42) + (i239 | 42);
                                                        Object[] objArr50 = new Object[1];
                                                        delta(doubleTapTimeout3, i238, i240, objArr50);
                                                        String str32 = (String) objArr50[0];
                                                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                        int i241 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                        int i242 = (i241 & 441) + (i241 | 441);
                                                        int i243 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                        int i244 = (i243 ^ 40) + ((i243 & 40) << 1);
                                                        Object[] objArr51 = new Object[1];
                                                        delta(scrollDefaultDelay, i242, i244, objArr51);
                                                        String str33 = (String) objArr51[0];
                                                        int i245 = -(-Color.rgb(0, 0, 0));
                                                        Object[] objArr52 = new Object[1];
                                                        delta((char) ((i245 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) + (i245 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 481, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 26, objArr52);
                                                        String str34 = (String) objArr52[0];
                                                        int i246 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                        int i247 = (i246 * (-1939)) + 14416437;
                                                        int i248 = ~((-14848) | i246);
                                                        int i249 = ~(i182 | 14847);
                                                        int i250 = ((i248 & i249) | (i248 ^ i249)) * (-970);
                                                        int i251 = (i247 ^ i250) + ((i247 & i250) << 1);
                                                        int i252 = ~i246;
                                                        int i253 = ((~((i252 & 14847) | (i252 ^ 14847))) * 1940) + i251;
                                                        int i254 = ~i246;
                                                        int i255 = ~((i254 & (-14848)) | (i254 ^ (-14848)));
                                                        int i256 = ~((i30 ^ 14847) | (i30 & 14847));
                                                        int i257 = ((i255 & i256) | (i255 ^ i256)) * 970;
                                                        char c23 = (char) ((i253 & i257) + (i257 | i253));
                                                        int myTid = (Process.myTid() >> 22) + 508;
                                                        int argb2 = Color.argb(0, 0, 0, 0);
                                                        int i258 = (argb2 ^ 27) + ((argb2 & 27) << 1);
                                                        Object[] objArr53 = new Object[1];
                                                        delta(c23, myTid, i258, objArr53);
                                                        String str35 = (String) objArr53[0];
                                                        float f11 = f5;
                                                        char c24 = (char) (TypedValue.complexToFraction(0, f11, f11) > f11 ? 1 : (TypedValue.complexToFraction(0, f11, f11) == f11 ? 0 : -1));
                                                        int i259 = -(-Color.rgb(0, 0, 0));
                                                        int i260 = (i259 & 16777751) + (i259 | 16777751);
                                                        int i261 = -(AudioTrack.getMaxVolume() > f11 ? 1 : (AudioTrack.getMaxVolume() == f11 ? 0 : -1));
                                                        i38 = 1;
                                                        int i262 = ((i261 | 28) << 1) - (i261 ^ 28);
                                                        Object[] objArr54 = new Object[1];
                                                        delta(c24, i260, i262, objArr54);
                                                        String str36 = (String) objArr54[0];
                                                        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0);
                                                        int i263 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                        c10 = 0;
                                                        Object[] objArr55 = new Object[1];
                                                        delta((char) ((bitsPerPixel2 & 1) + (bitsPerPixel2 | 1)), (i263 ^ 562) + ((i263 & 562) << 1), 27 - KeyEvent.normalizeMetaState(0), objArr55);
                                                        String[] strArr13 = {str32, str33, str34, str35, str36, (String) objArr55[0]};
                                                        i39 = 0;
                                                        i40 = i25;
                                                        while (true) {
                                                            if (i39 < i40) {
                                                                i41 = i37;
                                                                i42 = i16;
                                                                break;
                                                            }
                                                            Object[] objArr56 = new Object[i38];
                                                            objArr56[c10] = strArr13[i39];
                                                            Object D887115 = uH18377.D8871(-957097391);
                                                            if (D887115 == null) {
                                                                int longPressTimeout2 = 52 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                                int myTid2 = 3158 - (Process.myTid() >> 22);
                                                                char resolveSizeAndState3 = (char) (58074 - View.resolveSizeAndState(0, 0, 0));
                                                                byte b25 = (byte) 0;
                                                                byte b26 = (byte) (b25 + 1);
                                                                i41 = i37;
                                                                Object[] objArr57 = new Object[1];
                                                                foxtrot(b25, b26, (byte) (b26 + 1), objArr57);
                                                                D887115 = uH18377.setPivotYN16904(longPressTimeout2, myTid2, resolveSizeAndState3, 424179844, false, (String) objArr57[0], new Class[]{cls9});
                                                            } else {
                                                                i41 = i37;
                                                            }
                                                            String str37 = (String) ((Method) D887115).invoke(null, objArr56);
                                                            if (str37 != null && !str37.isEmpty()) {
                                                                i42 = (~(i16 & 265)) & (i16 | 265);
                                                                break;
                                                            }
                                                            int i264 = i39 - 123;
                                                            i39 = (i264 | 124) + (i264 & 124);
                                                            i37 = i41;
                                                            i40 = 6;
                                                            i38 = 1;
                                                            c10 = 0;
                                                        }
                                                        int i265 = i16 ^ i41;
                                                        int i266 = -i265;
                                                        int i267 = ((i265 & i266) | (i265 ^ i266)) >> 31;
                                                        int i268 = i42 & (~i267);
                                                        int i269 = i41 & i267;
                                                        int i270 = (i268 & i269) | (i268 ^ i269);
                                                        char c25 = (char) (64292 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8))));
                                                        int i271 = -(-View.resolveSizeAndState(0, 0, 0));
                                                        Object[] objArr58 = new Object[1];
                                                        delta(c25, (i271 ^ 349) + ((i271 & 349) << 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 17, objArr58);
                                                        String str38 = (String) objArr58[0];
                                                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                        int i272 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                        int i273 = (i272 ^ 589) + ((i272 & 589) << 1);
                                                        int i274 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                        int i275 = (i274 & 5) + (i274 | 5);
                                                        Object[] objArr59 = new Object[1];
                                                        delta(keyRepeatDelay, i273, i275, objArr59);
                                                        Object[] objArr60 = new Object[i21];
                                                        objArr60[1] = (String) objArr59[0];
                                                        objArr60[0] = str38;
                                                        D88714 = uH18377.D8871(1214576837);
                                                        if (D88714 == null) {
                                                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 52;
                                                            int i276 = 3315 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                            char capsMode = (char) TextUtils.getCapsMode(str12, 0, 0);
                                                            byte b27 = (byte) 0;
                                                            byte b28 = b27;
                                                            Object[] objArr61 = new Object[1];
                                                            foxtrot(b27, b28, (byte) (b28 + 2), objArr61);
                                                            D88714 = uH18377.setPivotYN16904(windowTouchSlop, i276, capsMode, -1746970096, false, (String) objArr61[0], new Class[]{cls9, cls9});
                                                        }
                                                        long longValue7 = ((Long) ((Method) D88714).invoke(null, objArr60)).longValue();
                                                        long j57 = -125671674;
                                                        long j58 = ((-1917) * longValue7) + (960 * j57);
                                                        long j59 = 959;
                                                        long j60 = longValue7 ^ j38;
                                                        long j61 = ((j59 * (((j60 | j7) ^ j38) | ((j48 | j57) ^ j38))) + (((-959) * j60) + (((((j60 | j48) ^ j38) | ((j57 | j7) ^ j38)) * j59) + j58))) - 1421966664;
                                                        int i277 = (int) Runtime.getRuntime().totalMemory();
                                                        int i278 = ~i277;
                                                        i43 = ((int) (j61 >> c3)) & ((((~(i277 | (-886104706))) | 550527489 | (~(i278 | 886698921))) * 988) + (((~((-335577217) | i278)) | (~(886698921 | i277))) * 988) + 2024312806);
                                                        i44 = ((int) j61) & ((((~((-85328001) | i16)) | (~((-537462802) | i30)) | (~((-1522554411) | i16))) * 192) + (((~((-622790802) | i30)) | 85328000) * (-384)) + (((-2145345212) | i30) * (-192)) + 1788176917);
                                                        if (((i43 & i44) | (i43 ^ i44)) != 0) {
                                                            int rgb = Color.rgb(0, 0, 0);
                                                            int i279 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                            int i280 = (i279 ^ 595) + ((i279 & 595) << 1);
                                                            int i281 = -(-(Process.myPid() >> 22));
                                                            int i282 = (i281 ^ 13) + ((i281 & 13) << 1);
                                                            Object[] objArr62 = new Object[1];
                                                            delta((char) (((rgb | 16828178) << 1) - (rgb ^ 16828178)), i280, i282, objArr62);
                                                            String str39 = (String) objArr62[0];
                                                            int i283 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                            int i284 = -TextUtils.indexOf((CharSequence) str12, '0', 0);
                                                            int i285 = (i284 & 607) + (i284 | 607);
                                                            int i286 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                            int i287 = (i286 & 9) + (i286 | 9);
                                                            Object[] objArr63 = new Object[1];
                                                            delta((char) ((i283 & 45580) + (i283 | 45580)), i285, i287, objArr63);
                                                            String str40 = (String) objArr63[0];
                                                            File file3 = new File(str39);
                                                            if (file3.exists()) {
                                                                int i288 = silver + 31;
                                                                teal = i288 % 128;
                                                                if (i288 % 2 == 0) {
                                                                    file3.isFile();
                                                                    throw null;
                                                                }
                                                                if (file3.isFile()) {
                                                                    try {
                                                                        Scanner scanner3 = new Scanner(new FileInputStream(file3));
                                                                        Object[] objArr64 = new Object[1];
                                                                        delta((char) View.resolveSizeAndState(0, 0, 0), 228 - (~Color.alpha(0)), Color.red(0) + 2, objArr64);
                                                                        Scanner useDelimiter3 = scanner3.useDelimiter((String) objArr64[0]);
                                                                        if (useDelimiter3.hasNext()) {
                                                                            int i289 = (~((886742926 & i30) | (886742926 ^ i30))) * 979;
                                                                            int i290 = (273736058 ^ i289) + ((i289 & 273736058) << 1);
                                                                            int i291 = -(-(((1714239551 ^ i16) | (1714239551 & i16)) * (-979)));
                                                                            int i292 = ((i290 | i291) << 1) - (i291 ^ i290);
                                                                            int i293 = ~((886742926 & i16) | (886742926 ^ i16));
                                                                            int i294 = ~((1714239551 & i30) | (i30 ^ 1714239551));
                                                                            int i295 = -(-(((i294 & i293) | (i293 ^ i294)) * 979));
                                                                            int i296 = (i292 & i295) + (i295 | i292);
                                                                            int component9 = yY18494.component9();
                                                                            int i297 = ~((1746159491 & component9) | (1746159491 ^ component9));
                                                                            int i298 = -(-(((i297 & (-2069233660)) | ((-2069233660) ^ i297)) * (-280)));
                                                                            int i299 = (((~(((-1397864697) ^ component9) | ((-1397864697) & component9))) | (~((1746159491 ^ component9) | (1746159491 & component9)))) * 140) + (1869950372 ^ i298) + ((i298 & 1869950372) << 1);
                                                                            int i300 = ~(((-323074169) & component9) | ((-323074169) ^ component9));
                                                                            int i301 = ~component9;
                                                                            int i302 = (1746159491 ^ i301) | (1746159491 & i301);
                                                                            int i303 = ~((i302 ^ 1397864696) | (i302 & 1397864696));
                                                                            int i304 = (i303 & i300) | (i300 ^ i303);
                                                                            int i305 = ~component9;
                                                                            int i306 = (i305 & (-1397864697)) | ((-1397864697) ^ i305);
                                                                            int i307 = ~((i306 & (-1746159492)) | (i306 ^ (-1746159492)));
                                                                            int i308 = ((i307 & i304) | (i304 ^ i307)) * 140;
                                                                            if (i296 <= ((i299 | i308) << 1) - (i308 ^ i299)) {
                                                                                str15 = useDelimiter3.next();
                                                                                int i309 = 51 / 0;
                                                                            } else {
                                                                                str15 = useDelimiter3.next();
                                                                            }
                                                                        } else {
                                                                            str15 = str12;
                                                                        }
                                                                        useDelimiter3.close();
                                                                    } catch (IOException unused3) {
                                                                    }
                                                                    if (str15.contains(str40)) {
                                                                        int i310 = teal;
                                                                        int i311 = ((((i310 ^ 51) + ((i310 & 51) << 1)) % 128) + 33) % 128;
                                                                        teal = i311;
                                                                        int i312 = i311 + 39;
                                                                        silver = i312 % 128;
                                                                        if (i312 % 2 == 0) {
                                                                            i45 = i16 ^ 261;
                                                                            int i313 = (~(i16 & i270)) & (i16 | i270);
                                                                            int i314 = -i313;
                                                                            int i315 = ((i313 & i314) | (i313 ^ i314)) >> 31;
                                                                            int i316 = i45 & (~i315);
                                                                            int i317 = i270 & i315;
                                                                            i48 = (i317 & i316) | (i316 ^ i317);
                                                                            if ((i17 & 8) == 0) {
                                                                                int i318 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                                                int i319 = -(-TextUtils.lastIndexOf(str12, '0'));
                                                                                int i320 = ((i319 | 618) << 1) - (i319 ^ 618);
                                                                                int fadingEdgeLength4 = ViewConfiguration.getFadingEdgeLength() >> 16;
                                                                                int i321 = (fadingEdgeLength4 & 43) + (fadingEdgeLength4 | 43);
                                                                                Object[] objArr65 = new Object[1];
                                                                                delta((char) ((i318 ^ 56149) + ((i318 & 56149) << 1)), i320, i321, objArr65);
                                                                                String str41 = (String) objArr65[0];
                                                                                int threadPriority3 = Process.getThreadPriority(0);
                                                                                int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L);
                                                                                Object[] objArr66 = new Object[1];
                                                                                delta((char) (39851 - ((((threadPriority3 | 20) << 1) - (threadPriority3 ^ 20)) >> 6)), (packedPositionChild2 ^ 661) + ((packedPositionChild2 & 661) << 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 42, objArr66);
                                                                                String str42 = (String) objArr66[0];
                                                                                char c26 = (char) (10883 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                                                int i322 = -(-TextUtils.indexOf(str12, str12, 0, 0));
                                                                                int i323 = (i322 & 701) + (i322 | 701);
                                                                                int i324 = -TextUtils.indexOf((CharSequence) str12, '0');
                                                                                int i325 = ~i324;
                                                                                int i326 = (((~((i325 ^ i182) | (i325 & i182))) | (~(((-38) ^ i182) | ((-38) & i182)))) * (-867)) + (i324 * 868) + 32116;
                                                                                int i327 = ~i324;
                                                                                int i328 = ~((i327 ^ (-38)) | (i327 & (-38)));
                                                                                int i329 = ~((i327 ^ i16) | (i327 & i16));
                                                                                int i330 = (i328 ^ i329) | (i329 & i328);
                                                                                int i331 = ~(((-38) ^ i16) | ((-38) & i16));
                                                                                int i332 = ((i330 ^ i331) | (i330 & i331)) * (-1734);
                                                                                int i333 = ((i326 | i332) << 1) - (i326 ^ i332);
                                                                                int i334 = (i325 ^ (-38)) | (i325 & (-38));
                                                                                int i335 = ~((i334 & i182) | (i334 ^ i182));
                                                                                int i336 = ~(i325 | 37 | i16);
                                                                                int i337 = (i335 & i336) | (i335 ^ i336);
                                                                                int i338 = ((-38) & i324) | ((-38) ^ i324);
                                                                                int i339 = ~((i338 & i16) | (i338 ^ i16));
                                                                                int i340 = (((i339 & i337) | (i337 ^ i339)) * 867) + i333;
                                                                                int i341 = 1;
                                                                                Object[] objArr67 = new Object[1];
                                                                                delta(c26, i323, i340, objArr67);
                                                                                int i342 = 0;
                                                                                String[] strArr14 = {str41, str42, (String) objArr67[0]};
                                                                                int i343 = 0;
                                                                                while (true) {
                                                                                    if (i343 >= 3) {
                                                                                        i78 = i16;
                                                                                        break;
                                                                                    }
                                                                                    Object[] objArr68 = new Object[i341];
                                                                                    objArr68[i342] = strArr14[i343];
                                                                                    Object D887116 = uH18377.D8871(1979478258);
                                                                                    if (D887116 == null) {
                                                                                        int offsetAfter = 52 - TextUtils.getOffsetAfter(str12, i342);
                                                                                        int myPid3 = (Process.myPid() >> 22) + 2951;
                                                                                        char fadingEdgeLength5 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                                        byte b29 = (byte) i342;
                                                                                        byte b30 = (byte) (b29 + 1);
                                                                                        int i344 = i342;
                                                                                        strArr9 = strArr14;
                                                                                        Object[] objArr69 = new Object[1];
                                                                                        foxtrot(b29, b30, (byte) (b30 - 1), objArr69);
                                                                                        String str43 = (String) objArr69[i344];
                                                                                        Class[] clsArr3 = new Class[1];
                                                                                        clsArr3[i344] = cls9;
                                                                                        D887116 = uH18377.setPivotYN16904(offsetAfter, myPid3, fadingEdgeLength5, -1438133721, false, str43, clsArr3);
                                                                                    } else {
                                                                                        strArr9 = strArr14;
                                                                                    }
                                                                                    long longValue8 = ((Long) ((Method) D887116).invoke(null, objArr68)).longValue();
                                                                                    long j62 = -301228675;
                                                                                    long j63 = longValue8 ^ j38;
                                                                                    long j64 = (j48 | longValue8) ^ j38;
                                                                                    long j65 = ((-516) * (((j63 | j7) ^ j38) | ((j48 | j62) ^ j38) | j64)) + (517 * longValue8) + ((-515) * j62);
                                                                                    long j66 = 516;
                                                                                    long j67 = j62 ^ j38;
                                                                                    long j68 = (j66 * (((j67 | longValue8) ^ j38) | j64)) + (((((j67 | j63) | j7) ^ j38) | (((j67 | j48) | longValue8) ^ j38)) * j66) + j65 + 1076049981;
                                                                                    int myPid4 = Process.myPid();
                                                                                    int i345 = ~myPid4;
                                                                                    int i346 = ((int) (j68 >> c3)) & ((((~(myPid4 | (-352584195))) | (~(i345 | (-1084293193)))) * 210) + (((~((-352758707) | i345)) | (~((-1084467705) | myPid4))) * 210) + 304038550);
                                                                                    int i347 = ((int) j68) & ((((~(1531781477 | i30)) | (~(i30 | 94555067))) * 865) + ((~(94555067 | i16)) * 865) + (((~((-94555068) | i30)) | 1531781477) * (-865)) + 889579222);
                                                                                    if (((i346 & i347) | (i346 ^ i347)) != 0) {
                                                                                        int i348 = ((i343 | 280) << 1) - (i343 ^ 280);
                                                                                        i78 = (i348 | i16) & (~(i16 & i348));
                                                                                        int i349 = teal;
                                                                                        silver = ((i349 & 63) + (i349 | 63)) % 128;
                                                                                        break;
                                                                                    }
                                                                                    i343 = (i343 | 1) + (i343 & 1);
                                                                                    strArr14 = strArr9;
                                                                                    i342 = 0;
                                                                                    i341 = 1;
                                                                                }
                                                                                int i350 = ((~i48) & i16) | (i48 & i30);
                                                                                int i351 = -i350;
                                                                                int i352 = ((i350 & i351) | (i350 ^ i351)) >> 31;
                                                                                i48 = (i48 & i352) | (i78 & (~i352));
                                                                            }
                                                                            int i353 = 739 - (~(-(-TextUtils.indexOf((CharSequence) str12, '0', 0))));
                                                                            int longPressTimeout3 = ViewConfiguration.getLongPressTimeout() >> 16;
                                                                            int i354 = (longPressTimeout3 & 41) + (longPressTimeout3 | 41);
                                                                            Object[] objArr70 = new Object[1];
                                                                            delta((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), i353, i354, objArr70);
                                                                            c11 = 0;
                                                                            String str44 = (String) objArr70[0];
                                                                            char indexOf8 = (char) TextUtils.indexOf(str12, str12, 0, 0);
                                                                            int i355 = 779 - (~(-(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))));
                                                                            int i356 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                                                            int i357 = (i356 & 30) + (i356 | 30);
                                                                            i49 = 1;
                                                                            Object[] objArr71 = new Object[1];
                                                                            delta(indexOf8, i355, i357, objArr71);
                                                                            String[] strArr15 = {str44, (String) objArr71[0]};
                                                                            i50 = 0;
                                                                            while (true) {
                                                                                if (i50 < 2) {
                                                                                    i51 = i48;
                                                                                    i52 = i16;
                                                                                    break;
                                                                                }
                                                                                Object[] objArr72 = new Object[i49];
                                                                                objArr72[c11] = strArr15[i50];
                                                                                Object D887117 = uH18377.D8871(1565484532);
                                                                                if (D887117 == null) {
                                                                                    int packedPositionChild3 = 51 - ExpandableListView.getPackedPositionChild(0L);
                                                                                    int i358 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2950;
                                                                                    char c27 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                                                    byte b31 = (byte) 0;
                                                                                    byte b32 = b31;
                                                                                    i51 = i48;
                                                                                    Object[] objArr73 = new Object[1];
                                                                                    foxtrot(b31, b32, (byte) (b32 + 2), objArr73);
                                                                                    D887117 = uH18377.setPivotYN16904(packedPositionChild3, i358, c27, -2097887455, false, (String) objArr73[0], new Class[]{cls9});
                                                                                } else {
                                                                                    i51 = i48;
                                                                                }
                                                                                long longValue9 = ((Long) ((Method) D887117).invoke(null, objArr72)).longValue();
                                                                                long j69 = -92674146;
                                                                                long j70 = 983;
                                                                                long j71 = longValue9 ^ j38;
                                                                                long j72 = ((j69 | j71) * j70) + (984 * longValue9) + ((-1965) * j69);
                                                                                long j73 = j69 ^ j38;
                                                                                long tango = ao.ad.tango(343548750) ^ j38;
                                                                                long j74 = (j70 * (((tango | j73) ^ j38) | ((j73 | longValue9) ^ j38))) + ((j73 | ((j71 | tango) ^ j38)) * (-983)) + j72 + 1047828048;
                                                                                int i359 = (int) Runtime.getRuntime().totalMemory();
                                                                                int i360 = ~i359;
                                                                                if (((((int) (j74 >> c3)) & ((((~(i359 | (-1250301078))) | (~(1586468023 | i360)) | (-1607439808)) * 676) + (((~((-1271272862) | i360)) | 20971784) * 676) + ((((-20971785) | i359) * (-676)) - 239208878))) | (((int) j74) & ((((~(1000984543 | i30)) | (~((-27345426) | i16)) | (~((-537397253) | i16))) * 920) + (((~(973639118 | i30)) | (-1000984544)) * 920) + ((((~(1000984543 | i16)) | (~((-537397253) | i30))) * 920) - 2038855459)))) != 0) {
                                                                                    int i361 = i50 + 288;
                                                                                    i52 = (~(i16 & i361)) & (i16 | i361);
                                                                                    break;
                                                                                }
                                                                                i50 = ((i50 & 1) << 1) + (i50 ^ 1);
                                                                                i48 = i51;
                                                                                c11 = 0;
                                                                                i49 = 1;
                                                                            }
                                                                            int i362 = i16 ^ i51;
                                                                            int i363 = -i362;
                                                                            int i364 = ((i362 & i363) | (i362 ^ i363)) >> 31;
                                                                            int i365 = i52 & (~i364);
                                                                            int i366 = i51 & i364;
                                                                            int i367 = (i365 & i366) | (i365 ^ i366);
                                                                            D88715 = uH18377.D8871(-344556366);
                                                                            if (D88715 == null) {
                                                                                int longPressTimeout4 = 52 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                                                int i368 = 3107 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                                                char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15991);
                                                                                byte b33 = (byte) 0;
                                                                                byte b34 = b33;
                                                                                Object[] objArr74 = new Object[1];
                                                                                foxtrot(b33, b34, (byte) (b34 + 2), objArr74);
                                                                                D88715 = uH18377.setPivotYN16904(longPressTimeout4, i368, minimumFlingVelocity, 885907047, false, (String) objArr74[0], new Class[0]);
                                                                            }
                                                                            long longValue10 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
                                                                            long j75 = 1478172722;
                                                                            long j76 = 495;
                                                                            long j77 = -493;
                                                                            long j78 = (j77 * longValue10) + (j76 * j75);
                                                                            long j79 = -988;
                                                                            long j80 = longValue10 ^ j38;
                                                                            long j81 = 494;
                                                                            long j82 = j75 ^ j38;
                                                                            long j83 = ((((((j82 | j80) ^ j38) | ((j48 | longValue10) ^ j38)) | ((j75 | longValue10) ^ j38)) * j81) + ((((longValue10 | j82) | j48) * j81) + (((j75 | j80) * j79) + j78))) - 1630425820;
                                                                            i53 = ((int) (j83 >> c3)) & (((1005187049 | i16) * 220) + ((1002991073 | (~(434235337 | i30))) * (-440)) + (((~(1005187049 | i30)) | 432039361) * 220) + 2009436746);
                                                                            int i369 = (int) j83;
                                                                            int myPid5 = Process.myPid();
                                                                            foxtrot = A0.z.foxtrot((~((~myPid5) | (-302318977))) | (-2147475419), 576, (((~((-506283993) | myPid5)) | 203965016) * 576) + 1771465493, 1519732224) & i369;
                                                                            if (((foxtrot & i53) | (i53 ^ foxtrot)) == 1) {
                                                                                Object[] objArr75 = {1};
                                                                                Object D887118 = uH18377.D8871(-38624464);
                                                                                if (D887118 == null) {
                                                                                    int makeMeasureSpec = 52 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                                    int i370 = 2848 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                                                    char absoluteGravity2 = (char) (62567 - Gravity.getAbsoluteGravity(0, 0));
                                                                                    byte b35 = (byte) 0;
                                                                                    byte b36 = b35;
                                                                                    Object[] objArr76 = new Object[1];
                                                                                    foxtrot(b35, b36, (byte) (b36 + 2), objArr76);
                                                                                    D887118 = uH18377.setPivotYN16904(makeMeasureSpec, i370, absoluteGravity2, 571015653, false, (String) objArr76[0], new Class[]{Integer.TYPE});
                                                                                }
                                                                                long longValue11 = ((Long) ((Method) D887118).invoke(null, objArr75)).longValue();
                                                                                long j84 = 840252354;
                                                                                long j85 = longValue11 ^ j38;
                                                                                long j86 = (j84 | j7) ^ j38;
                                                                                long j87 = ((-814) * (((j85 | j84) ^ j38) | j86)) + (HttpConstants.HTTP_CLIENT_TIMEOUT * longValue11) + ((-813) * j84);
                                                                                long j88 = HttpConstants.HTTP_PROXY_AUTH;
                                                                                long j89 = j84 ^ j38;
                                                                                long j90 = (j89 | longValue11) ^ j38;
                                                                                long j91 = (j88 * (j90 | ((j89 | j7) ^ j38) | ((longValue11 | j7) ^ j38))) + ((((j85 | j48) ^ j38) | j90 | j86) * j88) + j87 + 1151874412;
                                                                                int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                                                                                int i371 = ~elapsedRealtime;
                                                                                int i372 = ((int) (j91 >> c3)) & ((((~(elapsedRealtime | (-1531041438))) | 272630792 | (~(i371 | (-68288803)))) * 369) + (((-1326699448) | (~(1531041437 | i371))) * (-369)) + ((((-1258410646) | i371) * (-369)) - 802173004));
                                                                                int i373 = ((int) j91) & ((((~((-317129969) | i16)) | (~((-1754356379) | i30))) * 959) + (((~((-317129969) | i30)) | (~((-1754356379) | i16))) * 959) + 577225823);
                                                                                if (((i372 & i373) | (i372 ^ i373)) != 0) {
                                                                                    int component92 = yY18494.component9();
                                                                                    int i374 = ((~component92) | (-1896631740)) * 495;
                                                                                    int i375 = ((-962805308) & i374) + (i374 | (-962805308));
                                                                                    int i376 = ~((~component92) | (-1896631740));
                                                                                    int i377 = ((i376 & (-1999396800)) | ((-1999396800) ^ i376)) * 495;
                                                                                    int i378 = ((i375 | i377) << 1) - (i377 ^ i375);
                                                                                    int i379 = ~yY18494.component9();
                                                                                    int i380 = 2046616506 | i379;
                                                                                    int i381 = ~((i380 & 1533736199) | (i380 ^ 1533736199));
                                                                                    int i382 = ((i381 & 1500045570) | (1500045570 ^ i381)) * (-828);
                                                                                    int i383 = (((i379 & 2080307135) | (2080307135 ^ i379)) * (-828)) + (289990909 & i382) + (i382 | 289990909);
                                                                                    if (i378 <= ((i383 | (-212422912)) << 1) - (i383 ^ (-212422912))) {
                                                                                        i76 = i16 & (-1059);
                                                                                        i77 = i30 & 1058;
                                                                                    } else {
                                                                                        i76 = i16 & (-221);
                                                                                        i77 = i30 & 220;
                                                                                    }
                                                                                    i55 = i76 | i77;
                                                                                } else {
                                                                                    i55 = i16;
                                                                                }
                                                                                int i384 = (~(i16 & i367)) & (i16 | i367);
                                                                                int i385 = -i384;
                                                                                int i386 = ((i384 & i385) | (i384 ^ i385)) >> 31;
                                                                                int i387 = i55 & (~i386);
                                                                                int i388 = i367 & i386;
                                                                                int i389 = (i387 & i388) | (i387 ^ i388);
                                                                                char scrollDefaultDelay2 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29294);
                                                                                int i390 = -View.getDefaultSize(0, 0);
                                                                                int i391 = (i390 ^ 372) + ((i390 & 372) << 1);
                                                                                int i392 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                                                int i393 = ((i392 | 23) << 1) - (i392 ^ 23);
                                                                                Object[] objArr77 = new Object[1];
                                                                                delta(scrollDefaultDelay2, i391, i393, objArr77);
                                                                                Object[] objArr78 = {(String) objArr77[0]};
                                                                                Object D887119 = uH18377.D8871(-957097391);
                                                                                if (D887119 == null) {
                                                                                    int lastIndexOf2 = 51 - TextUtils.lastIndexOf(str12, '0', 0, 0);
                                                                                    int indexOf9 = 3157 - TextUtils.indexOf((CharSequence) str12, '0');
                                                                                    char edgeSlop3 = (char) (58074 - (ViewConfiguration.getEdgeSlop() >> 16));
                                                                                    byte b37 = (byte) 0;
                                                                                    byte b38 = (byte) (b37 + 1);
                                                                                    i56 = i389;
                                                                                    j10 = j79;
                                                                                    Object[] objArr79 = new Object[1];
                                                                                    foxtrot(b37, b38, (byte) (b38 + 1), objArr79);
                                                                                    D887119 = uH18377.setPivotYN16904(lastIndexOf2, indexOf9, edgeSlop3, 424179844, false, (String) objArr79[0], new Class[]{cls9});
                                                                                } else {
                                                                                    i56 = i389;
                                                                                    j10 = j79;
                                                                                }
                                                                                Object invoke2 = ((Method) D887119).invoke(null, objArr78);
                                                                                try {
                                                                                    if (invoke2 != null) {
                                                                                        Object[] objArr80 = {invoke2, 42};
                                                                                        Object D887120 = uH18377.D8871(2072770498);
                                                                                        if (D887120 == null) {
                                                                                            int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 51;
                                                                                            int i394 = 1210 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                                            char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44356);
                                                                                            byte b39 = (byte) 0;
                                                                                            byte b40 = b39;
                                                                                            Object[] objArr81 = new Object[1];
                                                                                            foxtrot(b39, b40, (byte) (b40 + 2), objArr81);
                                                                                            D887120 = uH18377.setPivotYN16904(absoluteGravity3, i394, maximumFlingVelocity, -1540336361, false, (String) objArr81[0], new Class[]{cls9, Integer.TYPE});
                                                                                        }
                                                                                        long longValue12 = ((Long) ((Method) D887120).invoke(null, objArr80)).longValue();
                                                                                        long j92 = 280296081;
                                                                                        long j93 = ((-279) * longValue12) + (ModuleDescriptor.MODULE_VERSION * j92);
                                                                                        long j94 = 140;
                                                                                        long elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                                                                        long j95 = (j92 ^ j38) | longValue12;
                                                                                        long j96 = elapsedCpuTime2 ^ j38;
                                                                                        long j97 = ((j94 * (((((longValue12 ^ j38) | j92) ^ j38) | ((j96 | j92) ^ j38)) | ((j95 | elapsedCpuTime2) ^ j38))) + (((-280) * ((j95 ^ j38) | ((j96 | longValue12) ^ j38))) + (((longValue12 | elapsedCpuTime2) * j94) + j93))) - 287741111;
                                                                                        if (((((int) (j97 >> c3)) & ((((~((~Process.myPid()) | (-1259302344))) | 1100319268) * 262) + ((((~((-1259302344) | r2)) | 1100319268) * 262) - 789615000))) | (((int) j97) & ((((~((-1712945404) | i30)) | 570509473) * 859) + (((~(1144795482 | i30)) | (~((-1142435931) | i16))) * 859) + ((1144795482 | i16) * (-859)) + 148263194))) == 1986687685) {
                                                                                            i57 = i56;
                                                                                            j11 = j38;
                                                                                            strArr3 = null;
                                                                                            i58 = 0;
                                                                                            char c28 = (char) ((-2) - (~(-(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))));
                                                                                            int i395 = -TextUtils.getOffsetAfter(str12, i58);
                                                                                            Object[] objArr82 = new Object[1];
                                                                                            delta(c28, ((i395 | 891) << 1) - (i395 ^ 891), 15 - (~(-View.MeasureSpec.getSize(i58))), objArr82);
                                                                                            Object[] objArr83 = new Object[1];
                                                                                            objArr83[i58] = (String) objArr82[i58];
                                                                                            D88716 = uH18377.D8871(-957097391);
                                                                                            if (D88716 == null) {
                                                                                                int i396 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52;
                                                                                                int axisFromString = MotionEvent.axisFromString(str12) + 3159;
                                                                                                char c29 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 58074);
                                                                                                byte b41 = (byte) 0;
                                                                                                byte b42 = (byte) (b41 + 1);
                                                                                                Object[] objArr84 = new Object[1];
                                                                                                foxtrot(b41, b42, (byte) (b42 + 1), objArr84);
                                                                                                D88716 = uH18377.setPivotYN16904(i396, axisFromString, c29, 424179844, false, (String) objArr84[0], new Class[]{cls9});
                                                                                            }
                                                                                            invoke = ((Method) D88716).invoke(null, objArr83);
                                                                                            if (invoke != null) {
                                                                                                strArr6 = strArr3;
                                                                                                i62 = 0;
                                                                                            } else {
                                                                                                Object[] objArr85 = {invoke, 42};
                                                                                                Object D887121 = uH18377.D8871(2072770498);
                                                                                                if (D887121 == null) {
                                                                                                    int gidForName2 = 50 - Process.getGidForName(str12);
                                                                                                    int resolveOpacity = Drawable.resolveOpacity(0, 0) + 1209;
                                                                                                    char threadPriority4 = (char) (44356 - ((Process.getThreadPriority(0) + 20) >> 6));
                                                                                                    byte b43 = (byte) 0;
                                                                                                    byte b44 = b43;
                                                                                                    Object[] objArr86 = new Object[1];
                                                                                                    foxtrot(b43, b44, (byte) (b44 + 2), objArr86);
                                                                                                    D887121 = uH18377.setPivotYN16904(gidForName2, resolveOpacity, threadPriority4, -1540336361, false, (String) objArr86[0], new Class[]{cls9, Integer.TYPE});
                                                                                                }
                                                                                                long longValue13 = ((Long) ((Method) D887121).invoke(null, objArr85)).longValue();
                                                                                                long j98 = 123806819;
                                                                                                long j99 = longValue13 ^ j11;
                                                                                                strArr6 = strArr3;
                                                                                                long myPid6 = Process.myPid();
                                                                                                long j100 = myPid6 ^ j11;
                                                                                                long j101 = ((49 * (((j99 | myPid6) ^ j11) | ((j98 | longValue13) ^ j11))) + (((-49) * ((j99 | (((j98 ^ j11) | j100) ^ j11)) | ((j98 | myPid6) ^ j11))) + ((98 * (((j99 | j100) ^ j11) | ((j99 | j98) ^ j11))) + (((-97) * longValue13) + (50 * j98))))) - 131251849;
                                                                                                int elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                                                                                int i397 = ~elapsedRealtime2;
                                                                                                i62 = (((int) (j101 >> c3)) & ((((~(elapsedRealtime2 | (-220594279))) | (~(i397 | 1878425335)) | (~((-1657820690) | elapsedRealtime2))) * 192) + (((~(220604646 | i397)) | 1657820689) * (-384)) + (((i397 | 10368) * (-192)) - 1788177110))) | (((int) j101) & ((((~((-903544234) | i16)) | (-1979383214)) * 49) + (((~((-1954196653) | i30)) | (-903544234) | (~(1954196652 | i16))) * (-49)) + (((~((-903544234) | i30)) | 25186561) * 98) + 1476107407));
                                                                                            }
                                                                                            if (i62 != 1986687685 || i62 == -1514516938) {
                                                                                                i63 = -1;
                                                                                                i64 = i57;
                                                                                            } else {
                                                                                                int i398 = teal;
                                                                                                silver = (((i398 | 89) << 1) - (i398 ^ 89)) % 128;
                                                                                                int i399 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                                                int i400 = (i399 * (-244)) - (-7333014);
                                                                                                int i401 = ~(((-29810) ^ i30) | ((-29810) & i30));
                                                                                                int i402 = ~(((-29810) & i399) | ((-29810) ^ i399));
                                                                                                int i403 = -(-(((i401 & i402) | (i401 ^ i402)) * (-245)));
                                                                                                int i404 = ((i400 | i403) << 1) - (i400 ^ i403);
                                                                                                int i405 = ~(((-29810) ^ i16) | ((-29810) & i16));
                                                                                                int i406 = (i405 * (-245)) + i404;
                                                                                                int i407 = -(-(((i399 & i405) | (i399 ^ i405)) * 245));
                                                                                                int i408 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                                                Object[] objArr87 = new Object[1];
                                                                                                delta((char) ((i406 & i407) + (i407 | i406)), (i408 ^ 1611) + ((i408 & 1611) << 1), 13 - (~(-KeyEvent.getDeadChar(0, 0))), objArr87);
                                                                                                String str45 = (String) objArr87[0];
                                                                                                char resolveSizeAndState4 = (char) (23148 - View.resolveSizeAndState(0, 0, 0));
                                                                                                int i409 = -TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                                                                                                int i410 = (i409 ^ 1623) + ((i409 & 1623) << 1);
                                                                                                int i411 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                                                int i412 = (i411 & 26) + (i411 | 26);
                                                                                                Object[] objArr88 = new Object[1];
                                                                                                delta(resolveSizeAndState4, i410, i412, objArr88);
                                                                                                String str46 = (String) objArr88[0];
                                                                                                int argb3 = Color.argb(0, 0, 0, 0);
                                                                                                int i413 = -TextUtils.indexOf(str12, str12, 0);
                                                                                                int component93 = yY18494.component9();
                                                                                                int i414 = i413 * (-103);
                                                                                                int i415 = ((i414 | (-169950)) << 1) - (i414 ^ (-169950));
                                                                                                int i416 = ~i413;
                                                                                                int i417 = ~((i416 & (-1651)) | (i416 ^ (-1651)));
                                                                                                int i418 = ~(((-1651) & component93) | ((-1651) ^ component93));
                                                                                                int i419 = -(-(((i417 & i418) | (i417 ^ i418)) * 104));
                                                                                                int i420 = ((i415 | i419) << 1) - (i419 ^ i415);
                                                                                                int i421 = ~component93;
                                                                                                int i422 = (i421 & i413) | (i421 ^ i413);
                                                                                                int i423 = (i420 - (~(-(-((~((i422 & 1650) | (i422 ^ 1650))) * (-104)))))) - 1;
                                                                                                int i424 = -(-(((i413 & component93) | (i413 ^ component93)) * 104));
                                                                                                Object[] objArr89 = new Object[1];
                                                                                                delta((char) (((argb3 | 5794) << 1) - (argb3 ^ 5794)), (i423 ^ i424) + ((i424 & i423) << 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 17, objArr89);
                                                                                                String str47 = (String) objArr89[0];
                                                                                                char c30 = (char) (39276 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                                                                int i425 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                                                Object[] objArr90 = new Object[1];
                                                                                                delta(c30, (i425 ^ 1668) + ((i425 & 1668) << 1), 16 - (~(-(-Color.green(0)))), objArr90);
                                                                                                String str48 = (String) objArr90[0];
                                                                                                char offsetBefore2 = (char) TextUtils.getOffsetBefore(str12, 0);
                                                                                                int i426 = 1683 - (~(-(-KeyEvent.getDeadChar(0, 0))));
                                                                                                int i427 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                                int i428 = (i427 ^ 15) + ((i427 & 15) << 1);
                                                                                                Object[] objArr91 = new Object[1];
                                                                                                delta(offsetBefore2, i426, i428, objArr91);
                                                                                                String str49 = (String) objArr91[0];
                                                                                                char c31 = (char) (44448 - (~(-(-TextUtils.lastIndexOf(str12, '0')))));
                                                                                                int i429 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                                                int i430 = ((i429 | 1700) << 1) - (i429 ^ 1700);
                                                                                                int defaultSize = View.getDefaultSize(0, 0);
                                                                                                int i431 = ((defaultSize | 37) << 1) - (defaultSize ^ 37);
                                                                                                Object[] objArr92 = new Object[1];
                                                                                                delta(c31, i430, i431, objArr92);
                                                                                                String str50 = (String) objArr92[0];
                                                                                                int i432 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                                                                int offsetAfter2 = 1736 - TextUtils.getOffsetAfter(str12, 0);
                                                                                                int i433 = -(-TextUtils.getCapsMode(str12, 0, 0));
                                                                                                int i434 = (i433 ^ 12) + ((i433 & 12) << 1);
                                                                                                Object[] objArr93 = new Object[1];
                                                                                                delta((char) ((i432 & 7527) + (i432 | 7527)), offsetAfter2, i434, objArr93);
                                                                                                String str51 = (String) objArr93[0];
                                                                                                char c32 = (char) (2300 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))));
                                                                                                int i435 = -KeyEvent.normalizeMetaState(0);
                                                                                                int i436 = (i435 ^ 1748) + ((i435 & 1748) << 1);
                                                                                                int i437 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                                                                int i438 = ((i437 | 12) << 1) - (i437 ^ 12);
                                                                                                Object[] objArr94 = new Object[1];
                                                                                                delta(c32, i436, i438, objArr94);
                                                                                                String str52 = (String) objArr94[0];
                                                                                                int i439 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                                                                int i440 = 1761 - (~((byte) KeyEvent.getModifierMetaStateMask()));
                                                                                                int i441 = -View.resolveSizeAndState(0, 0, 0);
                                                                                                int i442 = (i441 & 22) + (i441 | 22);
                                                                                                Object[] objArr95 = new Object[1];
                                                                                                delta((char) ((i439 & 1) + (i439 | 1)), i440, i442, objArr95);
                                                                                                String str53 = (String) objArr95[0];
                                                                                                char c33 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                                                int i443 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1782;
                                                                                                int i444 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                                int i445 = ((i444 | 31) << 1) - (i444 ^ 31);
                                                                                                Object[] objArr96 = new Object[1];
                                                                                                delta(c33, i443, i445, objArr96);
                                                                                                String str54 = (String) objArr96[0];
                                                                                                char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                                                int i446 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                                                                                                int i447 = (i446 & 1814) + (i446 | 1814);
                                                                                                int i448 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                                                                int i449 = ((i448 | 12) << 1) - (i448 ^ 12);
                                                                                                Object[] objArr97 = new Object[1];
                                                                                                delta(maximumFlingVelocity2, i447, i449, objArr97);
                                                                                                String str55 = (String) objArr97[0];
                                                                                                char c34 = (char) (47 - (~(-AndroidCharacter.getMirror('0'))));
                                                                                                int i450 = -ExpandableListView.getPackedPositionType(0L);
                                                                                                Object[] objArr98 = new Object[1];
                                                                                                delta(c34, ((i450 | 1826) << 1) - (i450 ^ 1826), 11 - (~(-(ViewConfiguration.getKeyRepeatDelay() >> 16))), objArr98);
                                                                                                String str56 = (String) objArr98[0];
                                                                                                int i451 = -Color.blue(0);
                                                                                                int i452 = 1839 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                                int i453 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                                                int i454 = (i453 & 13) + (i453 | 13);
                                                                                                Object[] objArr99 = new Object[1];
                                                                                                delta((char) (((i451 | 14034) << 1) - (i451 ^ 14034)), i452, i454, objArr99);
                                                                                                String str57 = (String) objArr99[0];
                                                                                                char makeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                                                int i455 = -View.getDefaultSize(0, 0);
                                                                                                int i456 = (i455 ^ 1850) + ((i455 & 1850) << 1);
                                                                                                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                                                int i457 = (makeMeasureSpec3 & 12) + (makeMeasureSpec3 | 12);
                                                                                                Object[] objArr100 = new Object[1];
                                                                                                delta(makeMeasureSpec2, i456, i457, objArr100);
                                                                                                String str58 = (String) objArr100[0];
                                                                                                char combineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                                                                                                int i458 = 1862 - (~(-(-MotionEvent.axisFromString(str12))));
                                                                                                int i459 = -TextUtils.getOffsetAfter(str12, 0);
                                                                                                int i460 = (i459 & 12) + (i459 | 12);
                                                                                                Object[] objArr101 = new Object[1];
                                                                                                delta(combineMeasuredStates2, i458, i460, objArr101);
                                                                                                String str59 = (String) objArr101[0];
                                                                                                char c35 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                                                int i461 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                                                int i462 = (i461 & 1873) + (i461 | 1873);
                                                                                                int scrollDefaultDelay3 = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                                                                                int i463 = ((scrollDefaultDelay3 | 14) << 1) - (scrollDefaultDelay3 ^ 14);
                                                                                                Object[] objArr102 = new Object[1];
                                                                                                delta(c35, i462, i463, objArr102);
                                                                                                String str60 = (String) objArr102[0];
                                                                                                char absoluteGravity4 = (char) Gravity.getAbsoluteGravity(0, 0);
                                                                                                int i464 = -(-TextUtils.indexOf(str12, str12, 0));
                                                                                                int i465 = (i464 ^ 1888) + ((i464 & 1888) << 1);
                                                                                                int i466 = -Color.alpha(0);
                                                                                                int i467 = (i466 ^ 12) + ((i466 & 12) << 1);
                                                                                                Object[] objArr103 = new Object[1];
                                                                                                delta(absoluteGravity4, i465, i467, objArr103);
                                                                                                String str61 = (String) objArr103[0];
                                                                                                int i468 = -(-AndroidCharacter.getMirror('0'));
                                                                                                int green2 = Color.green(0) + 1900;
                                                                                                int i469 = -View.resolveSize(0, 0);
                                                                                                int i470 = (i469 & 24) + (i469 | 24);
                                                                                                Object[] objArr104 = new Object[1];
                                                                                                delta((char) ((i468 ^ 27994) + ((i468 & 27994) << 1)), green2, i470, objArr104);
                                                                                                String str62 = (String) objArr104[0];
                                                                                                char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                                                int i471 = -Color.rgb(0, 0, 0);
                                                                                                int i472 = (i471 & (-16775292)) + (i471 | (-16775292));
                                                                                                int i473 = -TextUtils.getOffsetAfter(str12, 0);
                                                                                                int i474 = ((i473 | 28) << 1) - (i473 ^ 28);
                                                                                                Object[] objArr105 = new Object[1];
                                                                                                delta(keyRepeatDelay2, i472, i474, objArr105);
                                                                                                String[] strArr16 = {str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62, (String) objArr105[0]};
                                                                                                int i475 = 0;
                                                                                                while (i475 < 19) {
                                                                                                    int i476 = teal;
                                                                                                    silver = ((i476 ^ 103) + ((i476 & 103) << 1)) % 128;
                                                                                                    String str63 = strArr16[i475];
                                                                                                    Object[] objArr106 = {str63};
                                                                                                    Object D887122 = uH18377.D8871(-2104138125);
                                                                                                    if (D887122 == null) {
                                                                                                        int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 53;
                                                                                                        int touchSlop3 = 2951 - (ViewConfiguration.getTouchSlop() >> 8);
                                                                                                        i63 = -1;
                                                                                                        char modifierMetaStateMask3 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                                                                                                        byte b45 = (byte) 0;
                                                                                                        byte b46 = (byte) (b45 + 1);
                                                                                                        i74 = i57;
                                                                                                        Object[] objArr107 = new Object[1];
                                                                                                        foxtrot(b45, b46, b46, objArr107);
                                                                                                        D887122 = uH18377.setPivotYN16904(bitsPerPixel3, touchSlop3, modifierMetaStateMask3, 1563346086, false, (String) objArr107[0], new Class[]{cls9});
                                                                                                    } else {
                                                                                                        i74 = i57;
                                                                                                        i63 = -1;
                                                                                                    }
                                                                                                    long longValue14 = ((Long) ((Method) D887122).invoke(null, objArr106)).longValue();
                                                                                                    long j102 = 543407637;
                                                                                                    long j103 = (521 * longValue14) + ((-519) * j102);
                                                                                                    long j104 = 520;
                                                                                                    long j105 = j102 ^ j11;
                                                                                                    long j106 = longValue14 ^ j11;
                                                                                                    long j107 = (j102 | j7) ^ j11;
                                                                                                    long j108 = ((((((j105 | j48) ^ j11) | ((j106 | j102) ^ j11)) | j107) * j104) + (((-1040) * (((j106 | j48) ^ j11) | j107)) + ((((((j105 | j106) | j48) ^ j11) | ((longValue14 | j7) ^ j11)) * j104) + j103))) - 1773028167;
                                                                                                    int foxtrot2 = ((int) (j108 >> c3)) & A0.z.foxtrot((~(296306415 | i16)) | (-1437159168), 220, (((-1140919996) | r5) * (-220)) - 1275954174, -833678312);
                                                                                                    int i477 = ((int) j108) & ((((~((-320207979) | i30)) | 20480) * 672) + (((~(320207978 | i16)) | (~(1757434388 | i30))) * (-672)) + (((~((-1757434389) | i16)) | 320207978) * 672) + 2115045045);
                                                                                                    if (((foxtrot2 & i477) | (foxtrot2 ^ i477)) != 0) {
                                                                                                        int i478 = silver;
                                                                                                        teal = ((i478 ^ 33) + ((i478 & 33) << 1)) % 128;
                                                                                                    } else {
                                                                                                        char indexOf10 = (char) TextUtils.indexOf(str12, str12, 0);
                                                                                                        int i479 = -(-KeyEvent.normalizeMetaState(0));
                                                                                                        int i480 = (i479 ^ 1874) + ((i479 & 1874) << 1);
                                                                                                        int i481 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                                                                                                        int i482 = (i481 & 14) + (i481 | 14);
                                                                                                        Object[] objArr108 = new Object[1];
                                                                                                        delta(indexOf10, i480, i482, objArr108);
                                                                                                        if (str63.equals((String) objArr108[0])) {
                                                                                                            Object[] objArr109 = {str63};
                                                                                                            Object D887123 = uH18377.D8871(1979478258);
                                                                                                            if (D887123 == null) {
                                                                                                                int keyRepeatDelay3 = 52 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                                                                int rgb2 = Color.rgb(0, 0, 0) + 16780167;
                                                                                                                char indexOf11 = (char) (TextUtils.indexOf((CharSequence) str12, '0', 0, 0) + 1);
                                                                                                                byte b47 = (byte) 0;
                                                                                                                byte b48 = (byte) (b47 + 1);
                                                                                                                Object[] objArr110 = new Object[1];
                                                                                                                foxtrot(b47, b48, (byte) (b48 - 1), objArr110);
                                                                                                                D887123 = uH18377.setPivotYN16904(keyRepeatDelay3, rgb2, indexOf11, -1438133721, false, (String) objArr110[0], new Class[]{cls9});
                                                                                                            }
                                                                                                            long longValue15 = ((Long) ((Method) D887123).invoke(null, objArr109)).longValue();
                                                                                                            long j109 = -1182730204;
                                                                                                            long j110 = longValue15 ^ j11;
                                                                                                            long j111 = ((j109 | j110) * j10) + (j77 * longValue15) + (j76 * j109);
                                                                                                            long j112 = j109 ^ j11;
                                                                                                            strArr8 = strArr16;
                                                                                                            long elapsedRealtime3 = ((int) SystemClock.elapsedRealtime()) ^ j11;
                                                                                                            long j113 = ((((elapsedRealtime3 | longValue15) ^ j11) | ((j112 | j110) ^ j11) | ((j109 | longValue15) ^ j11)) * j81) + ((longValue15 | j112 | elapsedRealtime3) * j81) + j111 + 1957551510;
                                                                                                            int foxtrot3 = ((int) (j113 >> c3)) & A0.z.foxtrot((~((-1047662055) | i16)) | 711068774 | (~((-1810078831) | i16)), -1444, (((-1435603337) | i30) * 1444) - 1153123274, 1418490256);
                                                                                                            int myPid7 = Process.myPid();
                                                                                                            if ((foxtrot3 | (((int) j113) & ((((~((~myPid7) | (-1242397405))) | (-194829006)) * 56) + (((~((-194829006) | myPid7)) | (-1242397405)) * 56) + 887393053))) != 0) {
                                                                                                                int i483 = teal;
                                                                                                                silver = ((i483 ^ 95) + ((i483 & 95) << 1)) % 128;
                                                                                                            }
                                                                                                        } else {
                                                                                                            strArr8 = strArr16;
                                                                                                        }
                                                                                                        i475++;
                                                                                                        strArr16 = strArr8;
                                                                                                        i57 = i74;
                                                                                                    }
                                                                                                    i75 = i475;
                                                                                                }
                                                                                                i74 = i57;
                                                                                                i63 = -1;
                                                                                                int i484 = silver;
                                                                                                teal = ((i484 & 79) + (i484 | 79)) % 128;
                                                                                                i75 = -1;
                                                                                                int i485 = ~i75;
                                                                                                int i486 = (i485 | (-i485)) >> 31;
                                                                                                int i487 = (~i486) & i16;
                                                                                                int i488 = ((i75 + 130) ^ i16) & i486;
                                                                                                int i489 = i16 ^ i74;
                                                                                                int i490 = (i489 | (-i489)) >> 31;
                                                                                                int i491 = ((i488 & i487) | (i487 ^ i488)) & (~i490);
                                                                                                int i492 = i74 & i490;
                                                                                                i64 = (i491 & i492) | (i491 ^ i492);
                                                                                            }
                                                                                            Object[] objArr111 = new Object[1];
                                                                                            delta((char) (42004 - TextUtils.indexOf((CharSequence) str12, '0', 0)), TextUtils.lastIndexOf(str12, '0') + 1953, 12 - (~(-(ViewConfiguration.getFadingEdgeLength() >> 16))), objArr111);
                                                                                            String str64 = (String) objArr111[0];
                                                                                            char c36 = (char) (432 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                                                            int i493 = -(-AndroidCharacter.getMirror('0'));
                                                                                            int i494 = (i493 & 1917) + (i493 | 1917);
                                                                                            int i495 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                                            int component94 = yY18494.component9();
                                                                                            int i496 = ~i495;
                                                                                            int i497 = (((i495 * (-183)) + 740) - (~(((i496 ^ 4) | (i496 & 4)) * (-368)))) - 1;
                                                                                            int i498 = (i495 ^ (-5)) | (i495 & (-5));
                                                                                            int i499 = ~component94;
                                                                                            int i500 = (((i498 & i499) | (i498 ^ i499)) * 184) + i497;
                                                                                            int i501 = ~((i496 ^ (-5)) | (i496 & (-5)));
                                                                                            int i502 = ~((~component94) | i495);
                                                                                            int i503 = (i502 & i501) | (i501 ^ i502);
                                                                                            int i504 = ~(i495 | 4);
                                                                                            int i505 = -(-(((i504 & i503) | (i503 ^ i504)) * 184));
                                                                                            int i506 = (i500 & i505) + (i505 | i500);
                                                                                            Object[] objArr112 = new Object[1];
                                                                                            delta(c36, i494, i506, objArr112);
                                                                                            String[] strArr17 = {str64, (String) objArr112[0]};
                                                                                            int indexOf12 = TextUtils.indexOf(str12, str12, 0);
                                                                                            Object[] objArr113 = new Object[1];
                                                                                            delta((char) (((indexOf12 | 33567) << 1) - (indexOf12 ^ 33567)), 1969 - (~(-Color.blue(0))), 14 - (~(ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr113);
                                                                                            String str65 = (String) objArr113[0];
                                                                                            int i507 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                                            int i508 = 1986 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                                            int i509 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                            int i510 = (i509 & 20) + (i509 | 20);
                                                                                            Object[] objArr114 = new Object[1];
                                                                                            delta((char) ((i507 ^ 1) + ((i507 & 1) << 1)), i508, i510, objArr114);
                                                                                            String str66 = (String) objArr114[0];
                                                                                            char keyCodeFromString2 = (char) KeyEvent.keyCodeFromString(str12);
                                                                                            int absoluteGravity5 = 2004 - Gravity.getAbsoluteGravity(0, 0);
                                                                                            int i511 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                                            int i512 = (i511 & 15) + (i511 | 15);
                                                                                            Object[] objArr115 = new Object[1];
                                                                                            delta(keyCodeFromString2, absoluteGravity5, i512, objArr115);
                                                                                            String[] strArr18 = {str65, str66, (String) objArr115[0]};
                                                                                            char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                                            int defaultSize2 = View.getDefaultSize(0, 0);
                                                                                            Object[] objArr116 = new Object[1];
                                                                                            delta(keyRepeatTimeout2, (defaultSize2 & 2018) + (defaultSize2 | 2018), 20 - (~((Process.getThreadPriority(0) + 20) >> 6)), objArr116);
                                                                                            String str67 = (String) objArr116[0];
                                                                                            int i513 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                                                            int i514 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                                            Object[] objArr117 = new Object[1];
                                                                                            delta((char) (((i513 | 39687) << 1) - (i513 ^ 39687)), (i514 ^ 2039) + ((i514 & 2039) << 1), 10 - TextUtils.getOffsetAfter(str12, 0), objArr117);
                                                                                            String[] strArr19 = {str67, (String) objArr117[0]};
                                                                                            char myTid3 = (char) (5254 - (Process.myTid() >> 22));
                                                                                            int i515 = -TextUtils.indexOf((CharSequence) str12, '0', 0);
                                                                                            int i516 = (i515 ^ 2048) + ((i515 & 2048) << 1);
                                                                                            int i517 = -(-View.MeasureSpec.getSize(0));
                                                                                            int i518 = (i517 ^ 11) + ((i517 & 11) << 1);
                                                                                            Object[] objArr118 = new Object[1];
                                                                                            delta(myTid3, i516, i518, objArr118);
                                                                                            String str68 = (String) objArr118[0];
                                                                                            Object[] objArr119 = new Object[1];
                                                                                            delta((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), View.resolveSize(0, 0) + 589, 6 - ExpandableListView.getPackedPositionType(0L), objArr119);
                                                                                            String[] strArr20 = {str68, (String) objArr119[0]};
                                                                                            char c37 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                                            int axisFromString2 = MotionEvent.axisFromString(str12);
                                                                                            Object[] objArr120 = new Object[1];
                                                                                            delta(c37, ((axisFromString2 | 2061) << 1) - (axisFromString2 ^ 2061), 27 - (~View.resolveSizeAndState(0, 0, 0)), objArr120);
                                                                                            String str69 = (String) objArr120[0];
                                                                                            int i519 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                                                            c12 = 0;
                                                                                            i65 = 1;
                                                                                            Object[] objArr121 = new Object[1];
                                                                                            delta((char) (((i519 | 39688) << 1) - (i519 ^ 39688)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2039, 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr121);
                                                                                            i66 = 5;
                                                                                            String[][] strArr21 = {strArr17, strArr18, strArr19, strArr20, new String[]{str69, (String) objArr121[0]}};
                                                                                            i67 = 0;
                                                                                            loop7: while (true) {
                                                                                                if (i67 < i66) {
                                                                                                    i68 = i64;
                                                                                                    i69 = i16;
                                                                                                    break;
                                                                                                }
                                                                                                String[] strArr22 = strArr21[i67];
                                                                                                String str70 = strArr22[c12];
                                                                                                String[] strArr23 = (String[]) Arrays.copyOfRange(strArr22, i65, strArr22.length);
                                                                                                int length = strArr23.length;
                                                                                                int i520 = i63;
                                                                                                int i521 = 0;
                                                                                                while (i521 < length) {
                                                                                                    String str71 = strArr23[i521];
                                                                                                    int i522 = i520 + 1;
                                                                                                    File file4 = new File(str70);
                                                                                                    if (file4.exists() && file4.isFile()) {
                                                                                                        try {
                                                                                                            Scanner scanner4 = new Scanner(new FileInputStream(file4));
                                                                                                            char indexOf13 = (char) TextUtils.indexOf(str12, str12);
                                                                                                            i68 = i64;
                                                                                                            try {
                                                                                                                int resolveSizeAndState5 = View.resolveSizeAndState(0, 0, 0);
                                                                                                                int i523 = (resolveSizeAndState5 * (-751)) - 171979;
                                                                                                                i73 = i67;
                                                                                                                int i524 = ~resolveSizeAndState5;
                                                                                                                strArr7 = strArr23;
                                                                                                                int i525 = ~((i524 ^ (-230)) | (i524 & (-230)));
                                                                                                                int i526 = ~resolveSizeAndState5;
                                                                                                                int i527 = -(-(((~((i526 ^ i16) | (i526 & i16))) | i525) * 1504));
                                                                                                                int i528 = ((~(i526 | 229 | i16)) * (-1504)) + (i523 ^ i527) + ((i527 & i523) << 1);
                                                                                                                int i529 = ((~((i526 ^ 229) | (i526 & 229))) | (~(((-230) ^ resolveSizeAndState5) | ((-230) & resolveSizeAndState5)))) * 752;
                                                                                                                int i530 = ((i528 | i529) << 1) - (i528 ^ i529);
                                                                                                                try {
                                                                                                                    int i531 = -(-TextUtils.lastIndexOf(str12, '0'));
                                                                                                                    int i532 = ((i531 | 3) << 1) - (i531 ^ 3);
                                                                                                                    Object[] objArr122 = new Object[1];
                                                                                                                    delta(indexOf13, i530, i532, objArr122);
                                                                                                                    Scanner useDelimiter4 = scanner4.useDelimiter((String) objArr122[0]);
                                                                                                                    String next2 = useDelimiter4.hasNext() ? useDelimiter4.next() : str12;
                                                                                                                    useDelimiter4.close();
                                                                                                                    if (next2.contains(str71)) {
                                                                                                                        int i533 = i520 + 171;
                                                                                                                        i69 = ((~i533) & i16) | (i533 & i30);
                                                                                                                        break loop7;
                                                                                                                    }
                                                                                                                } catch (IOException unused4) {
                                                                                                                }
                                                                                                            } catch (IOException unused5) {
                                                                                                            }
                                                                                                        } catch (IOException unused6) {
                                                                                                            i68 = i64;
                                                                                                        }
                                                                                                        i521++;
                                                                                                        i64 = i68;
                                                                                                        i520 = i522;
                                                                                                        i67 = i73;
                                                                                                        strArr23 = strArr7;
                                                                                                    } else {
                                                                                                        i68 = i64;
                                                                                                    }
                                                                                                    i73 = i67;
                                                                                                    strArr7 = strArr23;
                                                                                                    i521++;
                                                                                                    i64 = i68;
                                                                                                    i520 = i522;
                                                                                                    i67 = i73;
                                                                                                    strArr23 = strArr7;
                                                                                                }
                                                                                                i67++;
                                                                                                i63 = i520;
                                                                                                i66 = 5;
                                                                                                c12 = 0;
                                                                                                i65 = 1;
                                                                                            }
                                                                                            int i534 = (~(i16 & i68)) & (i16 | i68);
                                                                                            int i535 = -i534;
                                                                                            int i536 = ((i534 & i535) | (i534 ^ i535)) >> 31;
                                                                                            int i537 = (i68 & i536) | (i69 & (~i536));
                                                                                            Object[] objArr123 = new Object[1];
                                                                                            delta((char) View.combineMeasuredStates(0, 0), 2087 - (~(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))), 12 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr123);
                                                                                            String str72 = (String) objArr123[0];
                                                                                            char doubleTapTimeout4 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                                                            int keyRepeatTimeout3 = 2101 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                                            int lastIndexOf3 = TextUtils.lastIndexOf(str12, '0', 0);
                                                                                            int i538 = ((lastIndexOf3 | 9) << 1) - (lastIndexOf3 ^ 9);
                                                                                            Object[] objArr124 = new Object[1];
                                                                                            delta(doubleTapTimeout4, keyRepeatTimeout3, i538, objArr124);
                                                                                            Object[] objArr125 = {str72, (String) objArr124[0]};
                                                                                            D88718 = uH18377.D8871(1214576837);
                                                                                            if (D88718 == null) {
                                                                                                int i539 = 53 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                                                int blue = 3314 - Color.blue(0);
                                                                                                char modifierMetaStateMask4 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                                                                                                byte b49 = (byte) 0;
                                                                                                byte b50 = b49;
                                                                                                Object[] objArr126 = new Object[1];
                                                                                                foxtrot(b49, b50, (byte) (b50 + 2), objArr126);
                                                                                                D88718 = uH18377.setPivotYN16904(i539, blue, modifierMetaStateMask4, -1746970096, false, (String) objArr126[0], new Class[]{cls9, cls9});
                                                                                            }
                                                                                            long longValue16 = ((Long) ((Method) D88718).invoke(null, objArr125)).longValue();
                                                                                            long j114 = -772428444;
                                                                                            long j115 = -112;
                                                                                            long j116 = longValue16 ^ j11;
                                                                                            long uptimeMillis5 = (int) SystemClock.uptimeMillis();
                                                                                            long j117 = j116 | (uptimeMillis5 ^ j11);
                                                                                            long j118 = j114 ^ j11;
                                                                                            long j119 = ((113 * ((j116 | uptimeMillis5) ^ j11)) + (((-113) * ((((j118 | longValue16) ^ j11) | ((j118 | uptimeMillis5) ^ j11)) | ((j117 | j114) ^ j11))) + ((226 * (j114 | (j117 ^ j11))) + ((j115 * longValue16) + (j115 * j114))))) - 775209894;
                                                                                            i71 = ((int) (j119 >> c3)) & ((((~((-436704942) | i16)) | 167871496) * 464) + (((-1706059857) | i16) * (-464)) + (((((~((-1873931353) | i30)) | 167871496) | (~(i30 | (-436704942)))) * 464) - 1251157302));
                                                                                            i72 = ((int) j119) & ((((~(199745654 | i16)) | 1636972064) * 529) + ((((~(i30 | 199745654)) | 1611666944) * 529) - 1520785380));
                                                                                            if (((i71 & i72) | (i71 ^ i72)) == 0) {
                                                                                                int i540 = i16 & (-151);
                                                                                                int i541 = i30 & 150;
                                                                                                i70 = i540 | i541;
                                                                                                int i542 = ((~i537) & i16) | (i537 & i30);
                                                                                                int i543 = (i542 | (-i542)) >> 31;
                                                                                                int i544 = i70 & (~i543);
                                                                                                int i545 = i537 & i543;
                                                                                                int i546 = (i544 & i545) | (i544 ^ i545);
                                                                                                char resolveSizeAndState6 = (char) (29446 - View.resolveSizeAndState(0, 0, 0));
                                                                                                int i547 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2109;
                                                                                                int i548 = -TextUtils.indexOf((CharSequence) str12, '0');
                                                                                                int i549 = (i548 ^ 46) + ((i548 & 46) << 1);
                                                                                                Object[] objArr127 = new Object[1];
                                                                                                delta(resolveSizeAndState6, i547, i549, objArr127);
                                                                                                Object[] objArr128 = {(String) objArr127[0]};
                                                                                                D88717 = uH18377.D8871(1979478258);
                                                                                                if (D88717 == null) {
                                                                                                    int indexOf14 = 52 - TextUtils.indexOf(str12, str12, 0, 0);
                                                                                                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2951;
                                                                                                    char lastIndexOf4 = (char) (TextUtils.lastIndexOf(str12, '0', 0, 0) + 1);
                                                                                                    byte b51 = (byte) 0;
                                                                                                    byte b52 = (byte) (b51 + 1);
                                                                                                    Object[] objArr129 = new Object[1];
                                                                                                    foxtrot(b51, b52, (byte) (b52 - 1), objArr129);
                                                                                                    D88717 = uH18377.setPivotYN16904(indexOf14, jumpTapTimeout, lastIndexOf4, -1438133721, false, (String) objArr129[0], new Class[]{cls9});
                                                                                                }
                                                                                                long longValue17 = ((Long) ((Method) D88717).invoke(null, objArr128)).longValue();
                                                                                                long j120 = -124752656;
                                                                                                long j121 = -495;
                                                                                                long j122 = j120 ^ j11;
                                                                                                long j123 = ((j122 | (longValue17 ^ j11)) ^ j11) | ((j122 | j7) ^ j11);
                                                                                                long j124 = (496 * (longValue17 | j7)) + ((-496) * ((((j48 | j120) | longValue17) ^ j11) | j123)) + (992 * j123) + (j121 * longValue17) + (j121 * j120) + 899573962;
                                                                                                int i550 = ~Process.myUid();
                                                                                                int i551 = ((int) (j124 >> c3)) & ((((~(i550 | (-1351163937))) | 85984650) * 241) + (((~(796280799 | i550)) | (-2147444736)) * (-241)) + 51656384);
                                                                                                int i552 = (int) j124;
                                                                                                int i553 = (((~(1947543618 | i30)) | 37782033) * (-1188)) - 640374749;
                                                                                                int i554 = 37782033 | (~((-1947543619) | i16));
                                                                                                int i555 = ~(910197267 | i30);
                                                                                                int i556 = i552 & ((((~((-1947543619) | i30)) | 1075128384 | i555) * 594) + ((i554 | i555) * 594) + i553);
                                                                                                int i557 = ((i551 & i556) | (i551 ^ i556)) * 263;
                                                                                                int i558 = (i557 & i30) | ((~i557) & i16);
                                                                                                int i559 = (~(i16 & i546)) & (i16 | i546);
                                                                                                int i560 = -i559;
                                                                                                int i561 = ((i559 & i560) | (i559 ^ i560)) >> 31;
                                                                                                int i562 = i558 & (~i561);
                                                                                                int i563 = i546 & i561;
                                                                                                i54 = (i563 & i562) | (i562 ^ i563);
                                                                                                strArr2 = strArr6;
                                                                                            } else {
                                                                                                int i564 = silver;
                                                                                                teal = ((i564 ^ 29) + ((i564 & 29) << 1)) % 128;
                                                                                                i70 = i16;
                                                                                                int i5422 = ((~i537) & i16) | (i537 & i30);
                                                                                                int i5432 = (i5422 | (-i5422)) >> 31;
                                                                                                int i5442 = i70 & (~i5432);
                                                                                                int i5452 = i537 & i5432;
                                                                                                int i5462 = (i5442 & i5452) | (i5442 ^ i5452);
                                                                                                char resolveSizeAndState62 = (char) (29446 - View.resolveSizeAndState(0, 0, 0));
                                                                                                int i5472 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2109;
                                                                                                int i5482 = -TextUtils.indexOf((CharSequence) str12, '0');
                                                                                                int i5492 = (i5482 ^ 46) + ((i5482 & 46) << 1);
                                                                                                Object[] objArr1272 = new Object[1];
                                                                                                delta(resolveSizeAndState62, i5472, i5492, objArr1272);
                                                                                                Object[] objArr1282 = {(String) objArr1272[0]};
                                                                                                D88717 = uH18377.D8871(1979478258);
                                                                                                if (D88717 == null) {
                                                                                                }
                                                                                                long longValue172 = ((Long) ((Method) D88717).invoke(null, objArr1282)).longValue();
                                                                                                long j1202 = -124752656;
                                                                                                long j1212 = -495;
                                                                                                long j1222 = j1202 ^ j11;
                                                                                                long j1232 = ((j1222 | (longValue172 ^ j11)) ^ j11) | ((j1222 | j7) ^ j11);
                                                                                                long j1242 = (496 * (longValue172 | j7)) + ((-496) * ((((j48 | j1202) | longValue172) ^ j11) | j1232)) + (992 * j1232) + (j1212 * longValue172) + (j1212 * j1202) + 899573962;
                                                                                                int i5502 = ~Process.myUid();
                                                                                                int i5512 = ((int) (j1242 >> c3)) & ((((~(i5502 | (-1351163937))) | 85984650) * 241) + (((~(796280799 | i5502)) | (-2147444736)) * (-241)) + 51656384);
                                                                                                int i5522 = (int) j1242;
                                                                                                int i5532 = (((~(1947543618 | i30)) | 37782033) * (-1188)) - 640374749;
                                                                                                int i5542 = 37782033 | (~((-1947543619) | i16));
                                                                                                int i5552 = ~(910197267 | i30);
                                                                                                int i5562 = i5522 & ((((~((-1947543619) | i30)) | 1075128384 | i5552) * 594) + ((i5542 | i5552) * 594) + i5532);
                                                                                                int i5572 = ((i5512 & i5562) | (i5512 ^ i5562)) * 263;
                                                                                                int i5582 = (i5572 & i30) | ((~i5572) & i16);
                                                                                                int i5592 = (~(i16 & i5462)) & (i16 | i5462);
                                                                                                int i5602 = -i5592;
                                                                                                int i5612 = ((i5592 & i5602) | (i5592 ^ i5602)) >> 31;
                                                                                                int i5622 = i5582 & (~i5612);
                                                                                                int i5632 = i5462 & i5612;
                                                                                                i54 = (i5632 & i5622) | (i5622 ^ i5632);
                                                                                                strArr2 = strArr6;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    Object[] objArr1252 = {str72, (String) objArr124[0]};
                                                                                    D88718 = uH18377.D8871(1214576837);
                                                                                    if (D88718 == null) {
                                                                                    }
                                                                                    long longValue162 = ((Long) ((Method) D88718).invoke(null, objArr1252)).longValue();
                                                                                    long j1142 = -772428444;
                                                                                    long j1152 = -112;
                                                                                    long j1162 = longValue162 ^ j11;
                                                                                    long uptimeMillis52 = (int) SystemClock.uptimeMillis();
                                                                                    long j1172 = j1162 | (uptimeMillis52 ^ j11);
                                                                                    long j1182 = j1142 ^ j11;
                                                                                    long j1192 = ((113 * ((j1162 | uptimeMillis52) ^ j11)) + (((-113) * ((((j1182 | longValue162) ^ j11) | ((j1182 | uptimeMillis52) ^ j11)) | ((j1172 | j1142) ^ j11))) + ((226 * (j1142 | (j1172 ^ j11))) + ((j1152 * longValue162) + (j1152 * j1142))))) - 775209894;
                                                                                    i71 = ((int) (j1192 >> c3)) & ((((~((-436704942) | i16)) | 167871496) * 464) + (((-1706059857) | i16) * (-464)) + (((((~((-1873931353) | i30)) | 167871496) | (~(i30 | (-436704942)))) * 464) - 1251157302));
                                                                                    i72 = ((int) j1192) & ((((~(199745654 | i16)) | 1636972064) * 529) + ((((~(i30 | 199745654)) | 1611666944) * 529) - 1520785380));
                                                                                    if (((i71 & i72) | (i71 ^ i72)) == 0) {
                                                                                    }
                                                                                } catch (Throwable th3) {
                                                                                    Throwable cause3 = th3.getCause();
                                                                                    if (cause3 != null) {
                                                                                        throw cause3;
                                                                                    }
                                                                                    throw th3;
                                                                                }
                                                                                Object[] objArr130 = new Object[1];
                                                                                delta((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29294), (ViewConfiguration.getPressedStateDuration() >> 16) + 372, 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr130);
                                                                                String str73 = (String) objArr130[0];
                                                                                int i565 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                                int i566 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                                                Object[] objArr131 = new Object[1];
                                                                                delta((char) ((i565 & 12050) + (i565 | 12050)), (i566 & 809) + (i566 | 809), KeyEvent.getDeadChar(0, 0) + 10, objArr131);
                                                                                String str74 = (String) objArr131[0];
                                                                                int size3 = View.MeasureSpec.getSize(0);
                                                                                int component95 = yY18494.component9();
                                                                                int i567 = (size3 * (-419)) + 11645702;
                                                                                int i568 = (~((component95 ^ 27662) | (component95 & 27662))) * 420;
                                                                                int i569 = ((i567 | i568) << 1) - (i567 ^ i568);
                                                                                int i570 = ~size3;
                                                                                int i571 = -(-((i570 | 27662) * (-420)));
                                                                                int i572 = ((i569 | i571) << 1) - (i571 ^ i569);
                                                                                int i573 = ~((i570 & (-27663)) | (i570 ^ (-27663)));
                                                                                int i574 = ~component95;
                                                                                int i575 = ~((i574 & 27662) | (i574 ^ 27662));
                                                                                int i576 = -(-(((i575 & i573) | (i573 ^ i575)) * 420));
                                                                                Object[] objArr132 = new Object[1];
                                                                                delta((char) ((i572 ^ i576) + ((i576 & i572) << 1)), 820 - View.getDefaultSize(0, 0), 7 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr132);
                                                                                String str75 = (String) objArr132[0];
                                                                                char fadingEdgeLength6 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                                int i577 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                                                                                Object[] objArr133 = new Object[1];
                                                                                delta(fadingEdgeLength6, (i577 ^ 827) + ((i577 & 827) << 1), KeyEvent.normalizeMetaState(0) + 8, objArr133);
                                                                                String[] strArr24 = {str73, str74, str75, (String) objArr133[0]};
                                                                                char c38 = (char) (48233 - (~(-(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)))));
                                                                                int i578 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                                                int i579 = -Color.alpha(0);
                                                                                int i580 = (i579 & 17) + (i579 | 17);
                                                                                Object[] objArr134 = new Object[1];
                                                                                delta(c38, ((i578 | 835) << 1) - (i578 ^ 835), i580, objArr134);
                                                                                String str76 = (String) objArr134[0];
                                                                                int i581 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                                int i582 = -Drawable.resolveOpacity(0, 0);
                                                                                int component96 = yY18494.component9();
                                                                                int i583 = i582 * (-167);
                                                                                int i584 = ((-142284) ^ i583) + ((i583 & (-142284)) << 1);
                                                                                int i585 = ~i582;
                                                                                int i586 = ~((i585 ^ (-853)) | (i585 & (-853)));
                                                                                int i587 = ~component96;
                                                                                int i588 = ~(((-853) ^ i587) | ((-853) & i587));
                                                                                int i589 = ((i586 ^ i588) | (i586 & i588)) * 168;
                                                                                int i590 = (i584 & i589) + (i589 | i584);
                                                                                int i591 = ~i582;
                                                                                int i592 = (i591 & (-853)) | (i591 ^ (-853));
                                                                                int i593 = (~((i592 & component96) | (i592 ^ component96))) * 168;
                                                                                int i594 = (i590 ^ i593) + ((i593 & i590) << 1);
                                                                                int i595 = ~component96;
                                                                                int i596 = ~((i595 & i585) | (i585 ^ i595));
                                                                                int i597 = ~((i585 & 852) | (i585 ^ 852));
                                                                                int i598 = (i596 & i597) | (i596 ^ i597);
                                                                                int i599 = ((-853) ^ i582) | ((-853) & i582);
                                                                                int i600 = ~((component96 & i599) | (i599 ^ component96));
                                                                                int i601 = (i594 - (~(-(-(((i598 & i600) | (i598 ^ i600)) * 168))))) - 1;
                                                                                int windowTouchSlop2 = ViewConfiguration.getWindowTouchSlop() >> 8;
                                                                                int i602 = windowTouchSlop2 * (-1939);
                                                                                int i603 = (i30 ^ 7) | (i30 & 7);
                                                                                int i604 = (((~(((-8) ^ windowTouchSlop2) | ((-8) & windowTouchSlop2))) | (~i603)) * (-970)) + (i602 ^ 6797) + ((i602 & 6797) << 1);
                                                                                int i605 = -(-((~((~windowTouchSlop2) | 7)) * 1940));
                                                                                int i606 = (i604 ^ i605) + ((i604 & i605) << 1);
                                                                                int i607 = ~windowTouchSlop2;
                                                                                int i608 = ~((i607 & (-8)) | (i607 ^ (-8)));
                                                                                int i609 = ~i603;
                                                                                int i610 = ((i608 & i609) | (i608 ^ i609)) * 970;
                                                                                int i611 = (i606 & i610) + (i606 | i610);
                                                                                Object[] objArr135 = new Object[1];
                                                                                delta((char) ((i581 & 20860) + (i581 | 20860)), i601, i611, objArr135);
                                                                                String str77 = (String) objArr135[0];
                                                                                Object[] objArr136 = new Object[1];
                                                                                delta((char) (3268 - (~TextUtils.indexOf(str12, str12))), 859 - (~(-(-TextUtils.lastIndexOf(str12, '0', 0, 0)))), ExpandableListView.getPackedPositionType(0L) + 7, objArr136);
                                                                                String str78 = (String) objArr136[0];
                                                                                int i612 = -View.combineMeasuredStates(0, 0);
                                                                                int myTid4 = Process.myTid() >> 22;
                                                                                int i613 = ((myTid4 | 866) << 1) - (myTid4 ^ 866);
                                                                                int i614 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                                int i615 = (i614 & 11) + (i614 | 11);
                                                                                Object[] objArr137 = new Object[1];
                                                                                delta((char) (((i612 | 4598) << 1) - (i612 ^ 4598)), i613, i615, objArr137);
                                                                                String str79 = (String) objArr137[0];
                                                                                Object[] objArr138 = new Object[1];
                                                                                delta((char) ((-1) - TextUtils.lastIndexOf(str12, '0', 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 877, 13 - (~(-Color.red(0))), objArr138);
                                                                                String[] strArr25 = {str76, str77, str78, str79, (String) objArr138[0]};
                                                                                int i616 = -(-(KeyEvent.getMaxKeyCode() >> 16));
                                                                                Object[] objArr139 = new Object[1];
                                                                                delta((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), ((i616 | 891) << 1) - (i616 ^ 891), 16 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr139);
                                                                                String str80 = (String) objArr139[0];
                                                                                int i617 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                                int i618 = -(-View.MeasureSpec.getSize(0));
                                                                                Object[] objArr140 = new Object[1];
                                                                                delta((char) ((59247 & i617) + (i617 | 59247)), (i618 ^ 907) + ((i618 & 907) << 1), TextUtils.lastIndexOf(str12, '0') + 4, objArr140);
                                                                                String str81 = (String) objArr140[0];
                                                                                int i619 = -(Process.myTid() >> 22);
                                                                                int i620 = (i619 & 918) + (i619 | 918);
                                                                                int i621 = -Color.alpha(0);
                                                                                int i622 = (i621 & 22) + (i621 | 22);
                                                                                Object[] objArr141 = new Object[1];
                                                                                delta((char) ((-MotionEvent.axisFromString(str12)) - 1), i620, i622, objArr141);
                                                                                String str82 = (String) objArr141[0];
                                                                                int i623 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                                                int component97 = yY18494.component9();
                                                                                int i624 = i623 * 659;
                                                                                int i625 = (((-35481285) | i624) << 1) - (i624 ^ (-35481285));
                                                                                int i626 = ~((~i623) | 54005);
                                                                                int i627 = ~(((-54006) ^ i623) | ((-54006) & i623));
                                                                                int i628 = (i626 ^ i627) | (i626 & i627);
                                                                                int i629 = (component97 & i623) | (i623 ^ component97);
                                                                                int i630 = ~i629;
                                                                                int i631 = ((i628 ^ i630) | (i628 & i630)) * (-658);
                                                                                int i632 = ((~(((-54006) ^ i623) | ((-54006) & i623))) * 658) + (((i625 | i631) << 1) - (i631 ^ i625));
                                                                                int i633 = ~((i623 & (-54006)) | ((-54006) ^ i623));
                                                                                int i634 = ~i629;
                                                                                Object[] objArr142 = new Object[1];
                                                                                delta((char) ((((i633 & i634) | (i633 ^ i634)) * 658) + i632), 940 - Color.alpha(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24, objArr142);
                                                                                String str83 = (String) objArr142[0];
                                                                                char tapTimeout3 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                                                                byte modifierMetaStateMask5 = (byte) KeyEvent.getModifierMetaStateMask();
                                                                                int i635 = ((modifierMetaStateMask5 | 966) << 1) - (modifierMetaStateMask5 ^ 966);
                                                                                int i636 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                                                int i637 = ((i636 | 28) << 1) - (i636 ^ 28);
                                                                                Object[] objArr143 = new Object[1];
                                                                                delta(tapTimeout3, i635, i637, objArr143);
                                                                                String[] strArr26 = {str80, str81, str18, str82, str83, (String) objArr143[0]};
                                                                                char tapTimeout4 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                                                                int i638 = 993 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                                                                int i639 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                                                int i640 = (i639 & 12) + (i639 | 12);
                                                                                Object[] objArr144 = new Object[1];
                                                                                delta(tapTimeout4, i638, i640, objArr144);
                                                                                String str84 = (String) objArr144[0];
                                                                                char scrollDefaultDelay4 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                                                int i641 = -(-KeyEvent.keyCodeFromString(str12));
                                                                                int i642 = ((i641 | 1004) << 1) - (i641 ^ 1004);
                                                                                int i643 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                int i644 = (i643 & 8) + (i643 | 8);
                                                                                Object[] objArr145 = new Object[1];
                                                                                delta(scrollDefaultDelay4, i642, i644, objArr145);
                                                                                String str85 = (String) objArr145[0];
                                                                                char resolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                                                                                int i645 = 1011 - (~Color.alpha(0));
                                                                                int i646 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                                int component98 = yY18494.component9();
                                                                                int i647 = i646 * (-375);
                                                                                int i648 = (i647 ^ (-1875)) + ((i647 & (-1875)) << 1);
                                                                                int i649 = ~i646;
                                                                                int i650 = ~((i649 ^ (-6)) | (i649 & (-6)));
                                                                                int i651 = (component98 ^ i650) | (i650 & component98);
                                                                                int i652 = ~((i646 ^ 5) | (i646 & 5));
                                                                                int i653 = (i648 - (~(-(-(((i651 ^ i652) | (i651 & i652)) * 376))))) - 1;
                                                                                int i654 = ~component98;
                                                                                int i655 = ~((i654 ^ i646) | (i654 & i646));
                                                                                int i656 = ((i655 & i652) | (i655 ^ i652)) * (-376);
                                                                                int i657 = ((i653 | i656) << 1) - (i653 ^ i656);
                                                                                int i658 = ~((i649 ^ component98) | (component98 & i649));
                                                                                int i659 = ((i658 & 5) | (i658 ^ 5)) * 376;
                                                                                int i660 = (i657 & i659) + (i659 | i657);
                                                                                Object[] objArr146 = new Object[1];
                                                                                delta(resolveOpacity2, i645, i660, objArr146);
                                                                                String str86 = (String) objArr146[0];
                                                                                int myTid5 = Process.myTid() >> 22;
                                                                                Object[] objArr147 = new Object[1];
                                                                                delta((char) ((-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))) - 1), ((myTid5 | 1018) << 1) - (myTid5 ^ 1018), 5 - (~TextUtils.getCapsMode(str12, 0, 0)), objArr147);
                                                                                String[] strArr27 = {str84, str85, str86, (String) objArr147[0]};
                                                                                char windowTouchSlop3 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                                                int maximumFlingVelocity3 = 1024 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                                int i661 = -(-ExpandableListView.getPackedPositionChild(0L));
                                                                                int i662 = (i661 ^ 17) + ((i661 & 17) << 1);
                                                                                Object[] objArr148 = new Object[1];
                                                                                delta(windowTouchSlop3, maximumFlingVelocity3, i662, objArr148);
                                                                                String str87 = (String) objArr148[0];
                                                                                Object[] objArr149 = new Object[1];
                                                                                delta((char) (3268 - (~(-(-(ViewConfiguration.getEdgeSlop() >> 16))))), Color.blue(0) + 859, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7, objArr149);
                                                                                String str88 = (String) objArr149[0];
                                                                                char resolveSize = (char) View.resolveSize(0, 0);
                                                                                int i663 = 826 - (~(-(-(ViewConfiguration.getLongPressTimeout() >> 16))));
                                                                                int i664 = -Gravity.getAbsoluteGravity(0, 0);
                                                                                int i665 = i664 * (-159);
                                                                                int i666 = (i665 | (-1272)) + (i665 & (-1272));
                                                                                int i667 = ~i664;
                                                                                int i668 = ((i667 ^ 8) | (i667 & 8)) * 160;
                                                                                int i669 = ((i666 | i668) << 1) - (i666 ^ i668);
                                                                                int i670 = ~((i30 ^ i664) | (i30 & i664));
                                                                                int i671 = ~(i664 | 8);
                                                                                int i672 = ((i670 ^ i671) | (i670 & i671)) * (-160);
                                                                                int i673 = ((i669 | i672) << 1) - (i669 ^ i672);
                                                                                int i674 = ~(((-9) ^ i30) | ((-9) & i30));
                                                                                int i675 = (((i664 ^ i674) | (i664 & i674)) * 160) + i673;
                                                                                Object[] objArr150 = new Object[1];
                                                                                delta(resolveSize, i663, i675, objArr150);
                                                                                String[] strArr28 = {str87, str88, (String) objArr150[0]};
                                                                                char resolveSize2 = (char) View.resolveSize(0, 0);
                                                                                int resolveSizeAndState7 = View.resolveSizeAndState(0, 0, 0);
                                                                                int i676 = (resolveSizeAndState7 & 1040) + (resolveSizeAndState7 | 1040);
                                                                                int keyRepeatTimeout4 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                                                int i677 = ((keyRepeatTimeout4 | 14) << 1) - (keyRepeatTimeout4 ^ 14);
                                                                                Object[] objArr151 = new Object[1];
                                                                                delta(resolveSize2, i676, i677, objArr151);
                                                                                String str89 = (String) objArr151[0];
                                                                                char alpha2 = (char) Color.alpha(0);
                                                                                int i678 = 1053 - (~(-(-(Process.myPid() >> 22))));
                                                                                int i679 = -TextUtils.indexOf(str12, str12);
                                                                                int i680 = (i679 ^ 1) + ((i679 & 1) << 1);
                                                                                Object[] objArr152 = new Object[1];
                                                                                delta(alpha2, i678, i680, objArr152);
                                                                                String[] strArr29 = {str89, (String) objArr152[0]};
                                                                                char packedPositionGroup2 = (char) (36846 - ExpandableListView.getPackedPositionGroup(0L));
                                                                                int i681 = -(-(Process.myPid() >> 22));
                                                                                int i682 = (i681 & 1055) + (i681 | 1055);
                                                                                int i683 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                Object[] objArr153 = new Object[1];
                                                                                delta(packedPositionGroup2, i682, (i683 ^ 9) + ((i683 & 9) << 1), objArr153);
                                                                                String str90 = (String) objArr153[0];
                                                                                int i684 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                                                int lastIndexOf5 = TextUtils.lastIndexOf(str12, '0', 0);
                                                                                int i685 = ((lastIndexOf5 | 1065) << 1) - (lastIndexOf5 ^ 1065);
                                                                                int i686 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                                Object[] objArr154 = new Object[1];
                                                                                delta((char) (((i684 | 4761) << 1) - (i684 ^ 4761)), i685, (i686 & 1) + (i686 | 1), objArr154);
                                                                                String[] strArr30 = {str90, (String) objArr154[0]};
                                                                                char packedPositionGroup3 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                                                                int i687 = 1064 - (~(-(ViewConfiguration.getTouchSlop() >> 8)));
                                                                                int touchSlop4 = ViewConfiguration.getTouchSlop() >> 8;
                                                                                Object[] objArr155 = new Object[1];
                                                                                delta(packedPositionGroup3, i687, ((touchSlop4 & 16) << 1) + (touchSlop4 ^ 16), objArr155);
                                                                                String str91 = (String) objArr155[0];
                                                                                Object[] objArr156 = new Object[1];
                                                                                delta((char) (59246 - (~(-Color.blue(0)))), 907 - (~TextUtils.indexOf((CharSequence) str12, '0', 0)), 4 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr156);
                                                                                String str92 = (String) objArr156[0];
                                                                                int i688 = -(-ImageFormat.getBitsPerPixel(0));
                                                                                int i689 = 851 - (~TextUtils.indexOf(str12, str12, 0));
                                                                                int i690 = -(-View.resolveSize(0, 0));
                                                                                Object[] objArr157 = new Object[1];
                                                                                delta((char) (((i688 | 20861) << 1) - (i688 ^ 20861)), i689, (i690 & 7) + (i690 | 7), objArr157);
                                                                                String str93 = (String) objArr157[0];
                                                                                int i691 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                                                int i692 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                                                int i693 = (i692 ^ 1081) + ((i692 & 1081) << 1);
                                                                                int blue2 = Color.blue(0);
                                                                                Object[] objArr158 = new Object[1];
                                                                                delta((char) ((i691 ^ 1800) + ((i691 & 1800) << 1)), i693, (blue2 & 8) + (blue2 | 8), objArr158);
                                                                                String str94 = (String) objArr158[0];
                                                                                int i694 = -TextUtils.lastIndexOf(str12, '0', 0, 0);
                                                                                int i695 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                                Object[] objArr159 = new Object[1];
                                                                                delta((char) (((i694 | 4597) << 1) - (i694 ^ 4597)), ((i695 | 866) << 1) - (i695 ^ 866), (-38) - (~AndroidCharacter.getMirror('0')), objArr159);
                                                                                String str95 = (String) objArr159[0];
                                                                                char keyCodeFromString3 = (char) KeyEvent.keyCodeFromString(str12);
                                                                                int i696 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                                                int i697 = (i696 & 877) + (i696 | 877);
                                                                                int i698 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                                                int i699 = ((i698 | 14) << 1) - (i698 ^ 14);
                                                                                Object[] objArr160 = new Object[1];
                                                                                delta(keyCodeFromString3, i697, i699, objArr160);
                                                                                String[] strArr31 = {str91, str92, str93, str94, str95, (String) objArr160[0]};
                                                                                int i700 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                Object[] objArr161 = new Object[1];
                                                                                delta((char) ((-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))) - 1), ((i700 | 1089) << 1) - (i700 ^ 1089), 18 - (~(-(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))), objArr161);
                                                                                String str96 = (String) objArr161[0];
                                                                                int i701 = -(-MotionEvent.axisFromString(str12));
                                                                                int resolveSizeAndState8 = View.resolveSizeAndState(0, 0, 0);
                                                                                int i702 = -TextUtils.lastIndexOf(str12, '0');
                                                                                Object[] objArr162 = new Object[1];
                                                                                delta((char) ((i701 & 1) + (i701 | 1)), (resolveSizeAndState8 & 1109) + (resolveSizeAndState8 | 1109), (i702 ^ 18) + ((i702 & 18) << 1), objArr162);
                                                                                String str97 = (String) objArr162[0];
                                                                                int i703 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                                                                                Object[] objArr163 = new Object[1];
                                                                                delta((char) ((36001 ^ i703) + ((i703 & 36001) << 1)), 1127 - (~(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 31 - ExpandableListView.getPackedPositionType(0L), objArr163);
                                                                                String str98 = (String) objArr163[0];
                                                                                int i704 = -TextUtils.getOffsetAfter(str12, 0);
                                                                                Object[] objArr164 = new Object[1];
                                                                                delta((char) (((39416 | i704) << 1) - (i704 ^ 39416)), 1159 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), 25 - (~(ViewConfiguration.getWindowTouchSlop() >> 8)), objArr164);
                                                                                String str99 = (String) objArr164[0];
                                                                                int indexOf15 = TextUtils.indexOf((CharSequence) str12, '0', 0);
                                                                                Object[] objArr165 = new Object[1];
                                                                                delta((char) ((indexOf15 & 16642) + (indexOf15 | 16642)), Color.rgb(0, 0, 0) + 16778401, (-16777194) - (~(-Color.rgb(0, 0, 0))), objArr165);
                                                                                String str100 = (String) objArr165[0];
                                                                                int i705 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                                int i706 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                                                Object[] objArr166 = new Object[1];
                                                                                delta((char) ((47490 & i705) + (i705 | 47490)), (i706 & 1208) + (i706 | 1208), (ViewConfiguration.getLongPressTimeout() >> 16) + 33, objArr166);
                                                                                String[] strArr32 = {str96, str97, str98, str99, str100, (String) objArr166[0], str18};
                                                                                int i707 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                Object[] objArr167 = new Object[1];
                                                                                delta((char) (((i707 | 1) << 1) - (i707 ^ 1)), Color.red(0) + 1241, 12 - (~(-(ViewConfiguration.getTouchSlop() >> 8))), objArr167);
                                                                                String str101 = (String) objArr167[0];
                                                                                int i708 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                                char c39 = (char) (((i708 | 27663) << 1) - (i708 ^ 27663));
                                                                                int argb4 = Color.argb(0, 0, 0, 0) + 820;
                                                                                int i709 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                                                Object[] objArr168 = new Object[1];
                                                                                delta(c39, argb4, ((i709 | 7) << 1) - (i709 ^ 7), objArr168);
                                                                                String[] strArr33 = {str101, (String) objArr168[0]};
                                                                                int i710 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                                int i711 = 1254 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                                                                                int i712 = -Drawable.resolveOpacity(0, 0);
                                                                                Object[] objArr169 = new Object[1];
                                                                                delta((char) ((i710 & 1) + (i710 | 1)), i711, ((i712 | 30) << 1) - (i712 ^ 30), objArr169);
                                                                                String str102 = (String) objArr169[0];
                                                                                char threadPriority5 = (char) (131 - ((Process.getThreadPriority(0) + 20) >> 6));
                                                                                int deadChar4 = 1284 - KeyEvent.getDeadChar(0, 0);
                                                                                int lastIndexOf6 = TextUtils.lastIndexOf(str12, '0', 0);
                                                                                Object[] objArr170 = new Object[1];
                                                                                delta(threadPriority5, deadChar4, ((lastIndexOf6 | 12) << 1) - (lastIndexOf6 ^ 12), objArr170);
                                                                                String[] strArr34 = {str102, (String) objArr170[0]};
                                                                                int blue3 = Color.blue(0);
                                                                                int i713 = -(-ExpandableListView.getPackedPositionType(0L));
                                                                                int i714 = ((i713 | 1295) << 1) - (i713 ^ 1295);
                                                                                int i715 = -View.resolveSize(0, 0);
                                                                                Object[] objArr171 = new Object[1];
                                                                                delta((char) ((blue3 & 3987) + (blue3 | 3987)), i714, (i715 ^ 19) + ((i715 & 19) << 1), objArr171);
                                                                                String str103 = (String) objArr171[0];
                                                                                char c40 = (char) (12272 - (~(ViewConfiguration.getScrollDefaultDelay() >> 16)));
                                                                                int i716 = -(-((Process.getThreadPriority(0) + 20) >> 6));
                                                                                int i717 = ((i716 | 1314) << 1) - (i716 ^ 1314);
                                                                                int tapTimeout5 = ViewConfiguration.getTapTimeout() >> 16;
                                                                                Object[] objArr172 = new Object[1];
                                                                                delta(c40, i717, ((tapTimeout5 | 5) << 1) - (tapTimeout5 ^ 5), objArr172);
                                                                                String[] strArr35 = {str103, (String) objArr172[0]};
                                                                                char combineMeasuredStates3 = (char) View.combineMeasuredStates(0, 0);
                                                                                int lastIndexOf7 = TextUtils.lastIndexOf(str12, '0', 0, 0) + 1320;
                                                                                int i718 = -(-Drawable.resolveOpacity(0, 0));
                                                                                Object[] objArr173 = new Object[1];
                                                                                delta(combineMeasuredStates3, lastIndexOf7, (i718 ^ 19) + ((i718 & 19) << 1), objArr173);
                                                                                String[] strArr36 = {(String) objArr173[0]};
                                                                                int i719 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                int i720 = -(-TextUtils.indexOf((CharSequence) str12, '0', 0, 0));
                                                                                Object[] objArr174 = new Object[1];
                                                                                delta((char) ((33799 & i719) + (i719 | 33799)), (i720 ^ 1339) + ((i720 & 1339) << 1), (-16777201) - (~(-Color.rgb(0, 0, 0))), objArr174);
                                                                                String[] strArr37 = {(String) objArr174[0]};
                                                                                char gidForName3 = (char) (56241 - Process.getGidForName(str12));
                                                                                int i721 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                                int i722 = (i721 ^ 1354) + ((i721 & 1354) << 1);
                                                                                int i723 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                                                                Object[] objArr175 = new Object[1];
                                                                                delta(gidForName3, i722, (i723 & 18) + (i723 | 18), objArr175);
                                                                                String[] strArr38 = {(String) objArr175[0]};
                                                                                int i724 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                int i725 = 1372 - (~(-(-(ViewConfiguration.getKeyRepeatDelay() >> 16))));
                                                                                int i726 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                                                Object[] objArr176 = new Object[1];
                                                                                delta((char) ((i724 ^ 22586) + ((i724 & 22586) << 1)), i725, (i726 & 18) + (i726 | 18), objArr176);
                                                                                String[] strArr39 = {(String) objArr176[0]};
                                                                                char tapTimeout6 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                                                                int scrollDefaultDelay5 = 1392 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                                                int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L);
                                                                                Object[] objArr177 = new Object[1];
                                                                                delta(tapTimeout6, scrollDefaultDelay5, (packedPositionChild4 & 24) + (packedPositionChild4 | 24), objArr177);
                                                                                String[] strArr40 = {(String) objArr177[0]};
                                                                                char alpha3 = (char) (Color.alpha(0) + 36052);
                                                                                int i727 = -KeyEvent.normalizeMetaState(0);
                                                                                int i728 = (i727 ^ 1415) + ((i727 & 1415) << 1);
                                                                                int i729 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                                int i730 = i729 * 677;
                                                                                int i731 = (i729 ^ i16) | (i729 & i16);
                                                                                int i732 = (((~((i30 ^ i729) | (i30 & i729))) | (~((-23) | i729))) * 676) + ((((i730 ^ (-14850)) + ((i730 & (-14850)) << 1)) - (~(((i731 ^ (-23)) | (i731 & (-23))) * (-676)))) - 1);
                                                                                int i733 = ~i729;
                                                                                int i734 = ~((i733 ^ (-23)) | (i733 & (-23)));
                                                                                int i735 = ~(((-23) ^ i30) | ((-23) & i30));
                                                                                int i736 = (i734 ^ i735) | (i735 & i734);
                                                                                int i737 = (i729 & 22) | (i729 ^ 22);
                                                                                int i738 = ~((i737 & i16) | (i737 ^ i16));
                                                                                int i739 = ((i736 & i738) | (i736 ^ i738)) * 676;
                                                                                int i740 = (i732 ^ i739) + ((i732 & i739) << 1);
                                                                                Object[] objArr178 = new Object[1];
                                                                                delta(alpha3, i728, i740, objArr178);
                                                                                String[] strArr41 = {(String) objArr178[0]};
                                                                                char green3 = (char) (Color.green(0) + 56229);
                                                                                int i741 = 1436 - (~MotionEvent.axisFromString(str12));
                                                                                int indexOf16 = TextUtils.indexOf(str12, str12);
                                                                                Object[] objArr179 = new Object[1];
                                                                                delta(green3, i741, (indexOf16 ^ 24) + ((indexOf16 & 24) << 1), objArr179);
                                                                                String[] strArr42 = {(String) objArr179[0], str18};
                                                                                Object[] objArr180 = new Object[1];
                                                                                delta((char) ((-2) - (~(-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))))), 1460 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 27 - (~(-KeyEvent.keyCodeFromString(str12))), objArr180);
                                                                                String[] strArr43 = {(String) objArr180[0], str18};
                                                                                Object[] objArr181 = new Object[1];
                                                                                delta((char) View.MeasureSpec.getSize(0), 1487 - TextUtils.lastIndexOf(str12, '0', 0, 0), 27 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), objArr181);
                                                                                String[] strArr44 = {(String) objArr181[0], str18};
                                                                                char keyCodeFromString4 = (char) KeyEvent.keyCodeFromString(str12);
                                                                                int i742 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                                int component99 = yY18494.component9();
                                                                                int i743 = (i742 * 905) - 1367142;
                                                                                int i744 = ~i742;
                                                                                int i745 = ~(i744 | component99);
                                                                                int i746 = ~component99;
                                                                                int i747 = (i745 | (~((i746 & 1514) | (i746 ^ 1514)))) * (-1808);
                                                                                int i748 = (i743 & i747) + (i747 | i743);
                                                                                int i749 = (i744 & (-1515)) | (i744 ^ (-1515));
                                                                                int i750 = ~((i749 & component99) | (i749 ^ component99));
                                                                                int i751 = ~component99;
                                                                                int i752 = (i751 & i742) | (i751 ^ i742);
                                                                                int i753 = -(-((i750 | (~(i752 | 1514))) * 904));
                                                                                int i754 = (i748 & i753) + (i753 | i748);
                                                                                int i755 = ~i742;
                                                                                int i756 = ~((i755 & 1514) | (i755 ^ 1514));
                                                                                int i757 = ~((-1515) | component99);
                                                                                int i758 = (i756 & i757) | (i756 ^ i757);
                                                                                int i759 = ~i752;
                                                                                int i760 = -(-(((i758 & i759) | (i758 ^ i759)) * 904));
                                                                                Object[] objArr182 = new Object[1];
                                                                                delta(keyCodeFromString4, (i754 ^ i760) + ((i760 & i754) << 1), 31 - View.MeasureSpec.getMode(0), objArr182);
                                                                                String[] strArr45 = {(String) objArr182[0], str18};
                                                                                int threadPriority6 = Process.getThreadPriority(0);
                                                                                int i761 = -Color.alpha(0);
                                                                                Object[] objArr183 = new Object[1];
                                                                                delta((char) ((((threadPriority6 | 20) << 1) - (threadPriority6 ^ 20)) >> 6), ((i761 | 1546) << 1) - (i761 ^ 1546), (ViewConfiguration.getLongPressTimeout() >> 16) + 27, objArr183);
                                                                                String[] strArr46 = {(String) objArr183[0], str18};
                                                                                int touchSlop5 = ViewConfiguration.getTouchSlop() >> 8;
                                                                                int i762 = -Color.alpha(0);
                                                                                int i763 = (i762 ^ 1573) + ((i762 & 1573) << 1);
                                                                                int i764 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                                                Object[] objArr184 = new Object[1];
                                                                                delta((char) ((touchSlop5 ^ 21223) + ((touchSlop5 & 21223) << 1)), i763, (i764 ^ 32) + ((i764 & 32) << 1), objArr184);
                                                                                String[][] strArr47 = {strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, strArr42, strArr43, strArr44, strArr45, strArr46, new String[]{(String) objArr184[0], str18}};
                                                                                char c41 = 0;
                                                                                int i765 = 1605 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                                int argb5 = Color.argb(0, 0, 0, 0);
                                                                                int i766 = 1;
                                                                                int i767 = ((argb5 | 1) << 1) - (argb5 ^ 1);
                                                                                Object[] objArr185 = new Object[1];
                                                                                delta((char) ((-TextUtils.lastIndexOf(str12, '0', 0, 0)) - 1), i765, i767, objArr185);
                                                                                StringBuilder sb2 = new StringBuilder((String) objArr185[0]);
                                                                                int i768 = i16;
                                                                                int i769 = 0;
                                                                                int i770 = 0;
                                                                                while (i769 < 24) {
                                                                                    String[] strArr48 = strArr47[i769];
                                                                                    Object[] objArr186 = new Object[i766];
                                                                                    objArr186[c41] = strArr48[c41];
                                                                                    Object D887124 = uH18377.D8871(-957097391);
                                                                                    if (D887124 == null) {
                                                                                        int gidForName4 = 51 - Process.getGidForName(str12);
                                                                                        int i771 = 3159 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                                        char edgeSlop4 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 58074);
                                                                                        i59 = i769;
                                                                                        i60 = i768;
                                                                                        byte b53 = (byte) 0;
                                                                                        byte b54 = (byte) (b53 + 1);
                                                                                        strArr4 = strArr47;
                                                                                        j12 = j38;
                                                                                        Object[] objArr187 = new Object[1];
                                                                                        foxtrot(b53, b54, (byte) (b54 + 1), objArr187);
                                                                                        D887124 = uH18377.setPivotYN16904(gidForName4, i771, edgeSlop4, 424179844, false, (String) objArr187[0], new Class[]{cls9});
                                                                                    } else {
                                                                                        i59 = i769;
                                                                                        i60 = i768;
                                                                                        strArr4 = strArr47;
                                                                                        j12 = j38;
                                                                                    }
                                                                                    String str104 = (String) ((Method) D887124).invoke(null, objArr186);
                                                                                    String[] strArr49 = (String[]) Arrays.copyOfRange(strArr48, 1, strArr48.length);
                                                                                    if (str104 != null) {
                                                                                        int i772 = teal;
                                                                                        int i773 = (i772 ^ 47) + ((i772 & 47) << 1);
                                                                                        silver = i773 % 128;
                                                                                        if (i773 % 2 != 0) {
                                                                                            throw null;
                                                                                        }
                                                                                        if (!str104.isEmpty()) {
                                                                                            if (strArr48.length != 1) {
                                                                                                Object[] objArr188 = {str104, strArr49};
                                                                                                Object D887125 = uH18377.D8871(-1363379003);
                                                                                                if (D887125 == null) {
                                                                                                    int i774 = 53 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                                                    int offsetBefore3 = 1415 - TextUtils.getOffsetBefore(str12, 0);
                                                                                                    char maxKeyCode = (char) (3047 - (KeyEvent.getMaxKeyCode() >> 16));
                                                                                                    byte b55 = (byte) 0;
                                                                                                    byte b56 = b55;
                                                                                                    Object[] objArr189 = new Object[1];
                                                                                                    foxtrot(b55, b56, (byte) (b56 + 2), objArr189);
                                                                                                    D887125 = uH18377.setPivotYN16904(i774, offsetBefore3, maxKeyCode, 1896341008, false, (String) objArr189[0], new Class[]{cls9, String[].class});
                                                                                                }
                                                                                                long longValue18 = ((Long) ((Method) D887125).invoke(null, objArr188)).longValue();
                                                                                                long j125 = -1240158962;
                                                                                                strArr5 = strArr48;
                                                                                                long j126 = 569;
                                                                                                long j127 = j125 ^ j12;
                                                                                                long j128 = longValue18 ^ j12;
                                                                                                long j129 = j127 | j128;
                                                                                                long j130 = ((-1136) * ((j129 ^ j12) | ((j127 | j48) ^ j12) | ((j128 | j48) ^ j12))) + (j126 * longValue18) + (j126 * j125);
                                                                                                long j131 = j48 | j125;
                                                                                                long j132 = (Smooth$Close.expectedVersionCode * (((j48 | longValue18) ^ j12) | (j131 ^ j12) | ((j129 | j7) ^ j12))) + ((-568) * (((j127 | j7) ^ j12) | ((j128 | j7) ^ j12) | ((j131 | longValue18) ^ j12))) + j130 + 2030286585;
                                                                                                int i775 = ~((int) Runtime.getRuntime().maxMemory());
                                                                                                int i776 = ((int) (j132 >> c3)) & ((((~(i775 | (-1093398852))) | 343827559) * 160) + (((~(i775 | 343827559)) | (-1434449256)) * (-160)) + 380777546);
                                                                                                int tango2 = ao.ad.tango(488063020);
                                                                                                int i777 = ~(765080989 | tango2);
                                                                                                int i778 = ~tango2;
                                                                                                int i779 = ((int) j132) & ((((~(tango2 | (-67764498))) | (~(i778 | 739909917)) | 25171072) * 497) + ((i777 | (~((-67764498) | i778))) * 497) + 1906566034);
                                                                                                if (((i779 & i776) | (i776 ^ i779)) == 0) {
                                                                                                }
                                                                                            } else {
                                                                                                strArr5 = strArr48;
                                                                                            }
                                                                                            int i780 = ((i59 | 10) << 1) - (i59 ^ 10);
                                                                                            i768 = (i780 | i16) & (~(i16 & i780));
                                                                                            i770++;
                                                                                            if (i770 > 1) {
                                                                                                int alpha4 = Color.alpha(0);
                                                                                                int i781 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                                                int component910 = yY18494.component9();
                                                                                                int i782 = (i781 * (-665)) + 536404;
                                                                                                int i783 = ~i781;
                                                                                                int i784 = -(-(i783 * (-333)));
                                                                                                int i785 = (i782 & i784) + (i782 | i784);
                                                                                                int i786 = ~i781;
                                                                                                int i787 = ~component910;
                                                                                                int i788 = ~((i786 & i787) | (i786 ^ i787));
                                                                                                int i789 = ~((component910 ^ 1606) | (component910 & 1606));
                                                                                                int i790 = (((i788 & i789) | (i788 ^ i789)) * 333) + i785;
                                                                                                int i791 = ~((i783 ^ component910) | (i783 & component910));
                                                                                                int i792 = ~component910;
                                                                                                int i793 = ((~((i792 & 1606) | (i792 ^ 1606))) | i791) * 333;
                                                                                                int i794 = ((i790 | i793) << 1) - (i790 ^ i793);
                                                                                                i61 = 0;
                                                                                                int i795 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                                                                                int i796 = (i795 & 2) + (i795 | 2);
                                                                                                Object[] objArr190 = new Object[1];
                                                                                                delta((char) (((alpha4 | 52254) << 1) - (alpha4 ^ 52254)), i794, i796, objArr190);
                                                                                                sb2.append((String) objArr190[0]);
                                                                                            } else {
                                                                                                i61 = 0;
                                                                                            }
                                                                                            sb2.append(strArr5[i61]);
                                                                                            char doubleTapTimeout5 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                                                            int i797 = -Color.alpha(i61);
                                                                                            int i798 = ((i797 | 1608) << 1) - (i797 ^ 1608);
                                                                                            int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                                                            int i799 = ~(i182 | 1);
                                                                                            int i800 = ((scrollBarFadeDuration | i16) * 164) + ((((scrollBarFadeDuration * 165) - 163) - (~(-(-(((i799 & scrollBarFadeDuration) | (scrollBarFadeDuration ^ i799)) * (-328)))))) - 1);
                                                                                            int i801 = ~scrollBarFadeDuration;
                                                                                            int i802 = ~((i801 & (-2)) | (i801 ^ (-2)));
                                                                                            int i803 = ~(((-2) ^ i16) | ((-2) & i16));
                                                                                            int i804 = (i182 & scrollBarFadeDuration) | (i182 ^ scrollBarFadeDuration);
                                                                                            int i805 = ((~((i804 & 1) | (i804 ^ 1))) | (i802 ^ i803) | (i802 & i803)) * 164;
                                                                                            int i806 = (i800 & i805) + (i805 | i800);
                                                                                            Object[] objArr191 = new Object[1];
                                                                                            delta(doubleTapTimeout5, i798, i806, objArr191);
                                                                                            sb2.append((String) objArr191[0]);
                                                                                            sb2.append(str104);
                                                                                            i769 = i59 + 1;
                                                                                            strArr47 = strArr4;
                                                                                            j38 = j12;
                                                                                            c41 = 0;
                                                                                            i766 = 1;
                                                                                        }
                                                                                    }
                                                                                    i768 = i60;
                                                                                    i769 = i59 + 1;
                                                                                    strArr47 = strArr4;
                                                                                    j38 = j12;
                                                                                    c41 = 0;
                                                                                    i766 = 1;
                                                                                }
                                                                                int i807 = i768;
                                                                                j11 = j38;
                                                                                char c42 = (char) (3266 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                                                int i808 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                                                                Object[] objArr192 = new Object[1];
                                                                                delta(c42, ((i808 | 1609) << 1) - (i808 ^ 1609), -((byte) KeyEvent.getModifierMetaStateMask()), objArr192);
                                                                                sb2.append((String) objArr192[0]);
                                                                                Object[] objArr193 = new Object[2];
                                                                                if (i770 > 2) {
                                                                                    objArr193[1] = new int[1];
                                                                                    String[] strArr50 = {sb2.toString()};
                                                                                    ((int[]) objArr193[1])[0] = i807;
                                                                                    objArr193[0] = strArr50;
                                                                                } else {
                                                                                    int[] iArr = new int[1];
                                                                                    objArr193[1] = iArr;
                                                                                    iArr[0] = i16;
                                                                                    objArr193[0] = new String[0];
                                                                                }
                                                                                int i809 = ((int[]) objArr193[1])[0];
                                                                                int i810 = (~(i16 & i56)) & (i16 | i56);
                                                                                int i811 = (i810 | (-i810)) >> 31;
                                                                                int i812 = i809 & (~i811);
                                                                                int i813 = i56 & i811;
                                                                                i57 = (i812 & i813) | (i812 ^ i813);
                                                                                i58 = 0;
                                                                                strArr3 = (String[]) objArr193[0];
                                                                                char c282 = (char) ((-2) - (~(-(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))));
                                                                                int i3952 = -TextUtils.getOffsetAfter(str12, i58);
                                                                                Object[] objArr822 = new Object[1];
                                                                                delta(c282, ((i3952 | 891) << 1) - (i3952 ^ 891), 15 - (~(-View.MeasureSpec.getSize(i58))), objArr822);
                                                                                Object[] objArr832 = new Object[1];
                                                                                objArr832[i58] = (String) objArr822[i58];
                                                                                D88716 = uH18377.D8871(-957097391);
                                                                                if (D88716 == null) {
                                                                                }
                                                                                invoke = ((Method) D88716).invoke(null, objArr832);
                                                                                if (invoke != null) {
                                                                                }
                                                                                if (i62 != 1986687685) {
                                                                                }
                                                                                i63 = -1;
                                                                                i64 = i57;
                                                                                Object[] objArr1112 = new Object[1];
                                                                                delta((char) (42004 - TextUtils.indexOf((CharSequence) str12, '0', 0)), TextUtils.lastIndexOf(str12, '0') + 1953, 12 - (~(-(ViewConfiguration.getFadingEdgeLength() >> 16))), objArr1112);
                                                                                String str642 = (String) objArr1112[0];
                                                                                char c362 = (char) (432 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                                                int i4932 = -(-AndroidCharacter.getMirror('0'));
                                                                                int i4942 = (i4932 & 1917) + (i4932 | 1917);
                                                                                int i4952 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                                int component942 = yY18494.component9();
                                                                                int i4962 = ~i4952;
                                                                                int i4972 = (((i4952 * (-183)) + 740) - (~(((i4962 ^ 4) | (i4962 & 4)) * (-368)))) - 1;
                                                                                int i4982 = (i4952 ^ (-5)) | (i4952 & (-5));
                                                                                int i4992 = ~component942;
                                                                                int i5002 = (((i4982 & i4992) | (i4982 ^ i4992)) * 184) + i4972;
                                                                                int i5012 = ~((i4962 ^ (-5)) | (i4962 & (-5)));
                                                                                int i5022 = ~((~component942) | i4952);
                                                                                int i5032 = (i5022 & i5012) | (i5012 ^ i5022);
                                                                                int i5042 = ~(i4952 | 4);
                                                                                int i5052 = -(-(((i5042 & i5032) | (i5032 ^ i5042)) * 184));
                                                                                int i5062 = (i5002 & i5052) + (i5052 | i5002);
                                                                                Object[] objArr1122 = new Object[1];
                                                                                delta(c362, i4942, i5062, objArr1122);
                                                                                String[] strArr172 = {str642, (String) objArr1122[0]};
                                                                                int indexOf122 = TextUtils.indexOf(str12, str12, 0);
                                                                                Object[] objArr1132 = new Object[1];
                                                                                delta((char) (((indexOf122 | 33567) << 1) - (indexOf122 ^ 33567)), 1969 - (~(-Color.blue(0))), 14 - (~(ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr1132);
                                                                                String str652 = (String) objArr1132[0];
                                                                                int i5072 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                                int i5082 = 1986 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                                int i5092 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                int i5102 = (i5092 & 20) + (i5092 | 20);
                                                                                Object[] objArr1142 = new Object[1];
                                                                                delta((char) ((i5072 ^ 1) + ((i5072 & 1) << 1)), i5082, i5102, objArr1142);
                                                                                String str662 = (String) objArr1142[0];
                                                                                char keyCodeFromString22 = (char) KeyEvent.keyCodeFromString(str12);
                                                                                int absoluteGravity52 = 2004 - Gravity.getAbsoluteGravity(0, 0);
                                                                                int i5112 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                                int i5122 = (i5112 & 15) + (i5112 | 15);
                                                                                Object[] objArr1152 = new Object[1];
                                                                                delta(keyCodeFromString22, absoluteGravity52, i5122, objArr1152);
                                                                                String[] strArr182 = {str652, str662, (String) objArr1152[0]};
                                                                                char keyRepeatTimeout22 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                                int defaultSize22 = View.getDefaultSize(0, 0);
                                                                                Object[] objArr1162 = new Object[1];
                                                                                delta(keyRepeatTimeout22, (defaultSize22 & 2018) + (defaultSize22 | 2018), 20 - (~((Process.getThreadPriority(0) + 20) >> 6)), objArr1162);
                                                                                String str672 = (String) objArr1162[0];
                                                                                int i5132 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                                                int i5142 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                                Object[] objArr1172 = new Object[1];
                                                                                delta((char) (((i5132 | 39687) << 1) - (i5132 ^ 39687)), (i5142 ^ 2039) + ((i5142 & 2039) << 1), 10 - TextUtils.getOffsetAfter(str12, 0), objArr1172);
                                                                                String[] strArr192 = {str672, (String) objArr1172[0]};
                                                                                char myTid32 = (char) (5254 - (Process.myTid() >> 22));
                                                                                int i5152 = -TextUtils.indexOf((CharSequence) str12, '0', 0);
                                                                                int i5162 = (i5152 ^ 2048) + ((i5152 & 2048) << 1);
                                                                                int i5172 = -(-View.MeasureSpec.getSize(0));
                                                                                int i5182 = (i5172 ^ 11) + ((i5172 & 11) << 1);
                                                                                Object[] objArr1182 = new Object[1];
                                                                                delta(myTid32, i5162, i5182, objArr1182);
                                                                                String str682 = (String) objArr1182[0];
                                                                                Object[] objArr1192 = new Object[1];
                                                                                delta((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), View.resolveSize(0, 0) + 589, 6 - ExpandableListView.getPackedPositionType(0L), objArr1192);
                                                                                String[] strArr202 = {str682, (String) objArr1192[0]};
                                                                                char c372 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                                int axisFromString22 = MotionEvent.axisFromString(str12);
                                                                                Object[] objArr1202 = new Object[1];
                                                                                delta(c372, ((axisFromString22 | 2061) << 1) - (axisFromString22 ^ 2061), 27 - (~View.resolveSizeAndState(0, 0, 0)), objArr1202);
                                                                                String str692 = (String) objArr1202[0];
                                                                                int i5192 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                                                c12 = 0;
                                                                                i65 = 1;
                                                                                Object[] objArr1212 = new Object[1];
                                                                                delta((char) (((i5192 | 39688) << 1) - (i5192 ^ 39688)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2039, 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr1212);
                                                                                i66 = 5;
                                                                                String[][] strArr212 = {strArr172, strArr182, strArr192, strArr202, new String[]{str692, (String) objArr1212[0]}};
                                                                                i67 = 0;
                                                                                loop7: while (true) {
                                                                                    if (i67 < i66) {
                                                                                    }
                                                                                    i67++;
                                                                                    i63 = i520;
                                                                                    i66 = 5;
                                                                                    c12 = 0;
                                                                                    i65 = 1;
                                                                                }
                                                                                int i5342 = (~(i16 & i68)) & (i16 | i68);
                                                                                int i5352 = -i5342;
                                                                                int i5362 = ((i5342 & i5352) | (i5342 ^ i5352)) >> 31;
                                                                                int i5372 = (i68 & i5362) | (i69 & (~i5362));
                                                                                Object[] objArr1232 = new Object[1];
                                                                                delta((char) View.combineMeasuredStates(0, 0), 2087 - (~(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))), 12 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr1232);
                                                                                String str722 = (String) objArr1232[0];
                                                                                char doubleTapTimeout42 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                                                int keyRepeatTimeout32 = 2101 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                                int lastIndexOf32 = TextUtils.lastIndexOf(str12, '0', 0);
                                                                                int i5382 = ((lastIndexOf32 | 9) << 1) - (lastIndexOf32 ^ 9);
                                                                                Object[] objArr1242 = new Object[1];
                                                                                delta(doubleTapTimeout42, keyRepeatTimeout32, i5382, objArr1242);
                                                                            } else {
                                                                                i54 = i367;
                                                                                strArr2 = null;
                                                                            }
                                                                            int[] iArr2 = new int[1];
                                                                            int i814 = ((~i54) & i16) | (i54 & i30);
                                                                            int i815 = -i814;
                                                                            Object[] objArr194 = {new int[]{i54}, new int[]{i16}, iArr2, strArr2};
                                                                            int i816 = (((~((-211101401) | i30)) | (~(i16 | 578269930))) * 627) + (((~(211101400 | i16)) | 578269930) * (-627)) + ((((-1385161) | i16) * (-627)) - 1346397772);
                                                                            int i817 = -(-((((i814 & i815) | (i814 ^ i815)) >> 31) & 16));
                                                                            int i818 = -(-((i816 & i817) + (i816 | i817)));
                                                                            int i819 = ((i18 | i818) << 1) - (i18 ^ i818);
                                                                            int i820 = i819 << 13;
                                                                            int i821 = (i820 | i819) & (~(i819 & i820));
                                                                            int i822 = i821 >>> 17;
                                                                            int i823 = (i821 | i822) & (~(i821 & i822));
                                                                            int i824 = i823 << 5;
                                                                            iArr2[0] = ((~i823) & i824) | ((~i824) & i823);
                                                                            return objArr194;
                                                                        }
                                                                        i46 = i16 & (-18591);
                                                                        i47 = i30 & 18590;
                                                                    }
                                                                }
                                                            }
                                                            i45 = i16;
                                                            int i3132 = (~(i16 & i270)) & (i16 | i270);
                                                            int i3142 = -i3132;
                                                            int i3152 = ((i3132 & i3142) | (i3132 ^ i3142)) >> 31;
                                                            int i3162 = i45 & (~i3152);
                                                            int i3172 = i270 & i3152;
                                                            i48 = (i3172 & i3162) | (i3162 ^ i3172);
                                                            if ((i17 & 8) == 0) {
                                                            }
                                                            int i3532 = 739 - (~(-(-TextUtils.indexOf((CharSequence) str12, '0', 0))));
                                                            int longPressTimeout32 = ViewConfiguration.getLongPressTimeout() >> 16;
                                                            int i3542 = (longPressTimeout32 & 41) + (longPressTimeout32 | 41);
                                                            Object[] objArr702 = new Object[1];
                                                            delta((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), i3532, i3542, objArr702);
                                                            c11 = 0;
                                                            String str442 = (String) objArr702[0];
                                                            char indexOf82 = (char) TextUtils.indexOf(str12, str12, 0, 0);
                                                            int i3552 = 779 - (~(-(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))));
                                                            int i3562 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                                            int i3572 = (i3562 & 30) + (i3562 | 30);
                                                            i49 = 1;
                                                            Object[] objArr712 = new Object[1];
                                                            delta(indexOf82, i3552, i3572, objArr712);
                                                            String[] strArr152 = {str442, (String) objArr712[0]};
                                                            i50 = 0;
                                                            while (true) {
                                                                if (i50 < 2) {
                                                                }
                                                                i50 = ((i50 & 1) << 1) + (i50 ^ 1);
                                                                i48 = i51;
                                                                c11 = 0;
                                                                i49 = 1;
                                                            }
                                                            int i3622 = i16 ^ i51;
                                                            int i3632 = -i3622;
                                                            int i3642 = ((i3622 & i3632) | (i3622 ^ i3632)) >> 31;
                                                            int i3652 = i52 & (~i3642);
                                                            int i3662 = i51 & i3642;
                                                            int i3672 = (i3652 & i3662) | (i3652 ^ i3662);
                                                            D88715 = uH18377.D8871(-344556366);
                                                            if (D88715 == null) {
                                                            }
                                                            long longValue102 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
                                                            long j752 = 1478172722;
                                                            long j762 = 495;
                                                            long j772 = -493;
                                                            long j782 = (j772 * longValue102) + (j762 * j752);
                                                            long j792 = -988;
                                                            long j802 = longValue102 ^ j38;
                                                            long j812 = 494;
                                                            long j822 = j752 ^ j38;
                                                            long j832 = ((((((j822 | j802) ^ j38) | ((j48 | longValue102) ^ j38)) | ((j752 | longValue102) ^ j38)) * j812) + ((((longValue102 | j822) | j48) * j812) + (((j752 | j802) * j792) + j782))) - 1630425820;
                                                            i53 = ((int) (j832 >> c3)) & (((1005187049 | i16) * 220) + ((1002991073 | (~(434235337 | i30))) * (-440)) + (((~(1005187049 | i30)) | 432039361) * 220) + 2009436746);
                                                            int i3692 = (int) j832;
                                                            int myPid52 = Process.myPid();
                                                            foxtrot = A0.z.foxtrot((~((~myPid52) | (-302318977))) | (-2147475419), 576, (((~((-506283993) | myPid52)) | 203965016) * 576) + 1771465493, 1519732224) & i3692;
                                                            if (((foxtrot & i53) | (i53 ^ foxtrot)) == 1) {
                                                            }
                                                            int[] iArr22 = new int[1];
                                                            int i8142 = ((~i54) & i16) | (i54 & i30);
                                                            int i8152 = -i8142;
                                                            Object[] objArr1942 = {new int[]{i54}, new int[]{i16}, iArr22, strArr2};
                                                            int i8162 = (((~((-211101401) | i30)) | (~(i16 | 578269930))) * 627) + (((~(211101400 | i16)) | 578269930) * (-627)) + ((((-1385161) | i16) * (-627)) - 1346397772);
                                                            int i8172 = -(-((((i8142 & i8152) | (i8142 ^ i8152)) >> 31) & 16));
                                                            int i8182 = -(-((i8162 & i8172) + (i8162 | i8172)));
                                                            int i8192 = ((i18 | i8182) << 1) - (i18 ^ i8182);
                                                            int i8202 = i8192 << 13;
                                                            int i8212 = (i8202 | i8192) & (~(i8192 & i8202));
                                                            int i8222 = i8212 >>> 17;
                                                            int i8232 = (i8212 | i8222) & (~(i8212 & i8222));
                                                            int i8242 = i8232 << 5;
                                                            iArr22[0] = ((~i8232) & i8242) | ((~i8242) & i8232);
                                                            return objArr1942;
                                                        }
                                                        i46 = i16 & (-261);
                                                        i47 = i30 & 260;
                                                        i45 = i46 | i47;
                                                        int i31322 = (~(i16 & i270)) & (i16 | i270);
                                                        int i31422 = -i31322;
                                                        int i31522 = ((i31322 & i31422) | (i31322 ^ i31422)) >> 31;
                                                        int i31622 = i45 & (~i31522);
                                                        int i31722 = i270 & i31522;
                                                        i48 = (i31722 & i31622) | (i31622 ^ i31722);
                                                        if ((i17 & 8) == 0) {
                                                        }
                                                        int i35322 = 739 - (~(-(-TextUtils.indexOf((CharSequence) str12, '0', 0))));
                                                        int longPressTimeout322 = ViewConfiguration.getLongPressTimeout() >> 16;
                                                        int i35422 = (longPressTimeout322 & 41) + (longPressTimeout322 | 41);
                                                        Object[] objArr7022 = new Object[1];
                                                        delta((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), i35322, i35422, objArr7022);
                                                        c11 = 0;
                                                        String str4422 = (String) objArr7022[0];
                                                        char indexOf822 = (char) TextUtils.indexOf(str12, str12, 0, 0);
                                                        int i35522 = 779 - (~(-(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))));
                                                        int i35622 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                                        int i35722 = (i35622 & 30) + (i35622 | 30);
                                                        i49 = 1;
                                                        Object[] objArr7122 = new Object[1];
                                                        delta(indexOf822, i35522, i35722, objArr7122);
                                                        String[] strArr1522 = {str4422, (String) objArr7122[0]};
                                                        i50 = 0;
                                                        while (true) {
                                                            if (i50 < 2) {
                                                            }
                                                            i50 = ((i50 & 1) << 1) + (i50 ^ 1);
                                                            i48 = i51;
                                                            c11 = 0;
                                                            i49 = 1;
                                                        }
                                                        int i36222 = i16 ^ i51;
                                                        int i36322 = -i36222;
                                                        int i36422 = ((i36222 & i36322) | (i36222 ^ i36322)) >> 31;
                                                        int i36522 = i52 & (~i36422);
                                                        int i36622 = i51 & i36422;
                                                        int i36722 = (i36522 & i36622) | (i36522 ^ i36622);
                                                        D88715 = uH18377.D8871(-344556366);
                                                        if (D88715 == null) {
                                                        }
                                                        long longValue1022 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
                                                        long j7522 = 1478172722;
                                                        long j7622 = 495;
                                                        long j7722 = -493;
                                                        long j7822 = (j7722 * longValue1022) + (j7622 * j7522);
                                                        long j7922 = -988;
                                                        long j8022 = longValue1022 ^ j38;
                                                        long j8122 = 494;
                                                        long j8222 = j7522 ^ j38;
                                                        long j8322 = ((((((j8222 | j8022) ^ j38) | ((j48 | longValue1022) ^ j38)) | ((j7522 | longValue1022) ^ j38)) * j8122) + ((((longValue1022 | j8222) | j48) * j8122) + (((j7522 | j8022) * j7922) + j7822))) - 1630425820;
                                                        i53 = ((int) (j8322 >> c3)) & (((1005187049 | i16) * 220) + ((1002991073 | (~(434235337 | i30))) * (-440)) + (((~(1005187049 | i30)) | 432039361) * 220) + 2009436746);
                                                        int i36922 = (int) j8322;
                                                        int myPid522 = Process.myPid();
                                                        foxtrot = A0.z.foxtrot((~((~myPid522) | (-302318977))) | (-2147475419), 576, (((~((-506283993) | myPid522)) | 203965016) * 576) + 1771465493, 1519732224) & i36922;
                                                        if (((foxtrot & i53) | (i53 ^ foxtrot)) == 1) {
                                                        }
                                                        int[] iArr222 = new int[1];
                                                        int i81422 = ((~i54) & i16) | (i54 & i30);
                                                        int i81522 = -i81422;
                                                        Object[] objArr19422 = {new int[]{i54}, new int[]{i16}, iArr222, strArr2};
                                                        int i81622 = (((~((-211101401) | i30)) | (~(i16 | 578269930))) * 627) + (((~(211101400 | i16)) | 578269930) * (-627)) + ((((-1385161) | i16) * (-627)) - 1346397772);
                                                        int i81722 = -(-((((i81422 & i81522) | (i81422 ^ i81522)) >> 31) & 16));
                                                        int i81822 = -(-((i81622 & i81722) + (i81622 | i81722)));
                                                        int i81922 = ((i18 | i81822) << 1) - (i18 ^ i81822);
                                                        int i82022 = i81922 << 13;
                                                        int i82122 = (i82022 | i81922) & (~(i81922 & i82022));
                                                        int i82222 = i82122 >>> 17;
                                                        int i82322 = (i82122 | i82222) & (~(i82122 & i82222));
                                                        int i82422 = i82322 << 5;
                                                        iArr222[0] = ((~i82322) & i82422) | ((~i82422) & i82322);
                                                        return objArr19422;
                                                    }
                                                }
                                            }
                                            z11 = false;
                                            if (!z11) {
                                            }
                                            int i2202 = ((~i208) & i16) | (i208 & i30);
                                            int i2212 = -i2202;
                                            int i2222 = ((i2202 & i2212) | (i2202 ^ i2212)) >> 31;
                                            int i2232 = i219 & (~i2222);
                                            int i2242 = i208 & i2222;
                                            int i2252 = (i2242 & i2232) | (i2232 ^ i2242);
                                            char c222 = (char) (29293 - (~(-Color.green(0))));
                                            int i2262 = 371 - (~View.resolveSizeAndState(0, 0, 0));
                                            int i2272 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                            int i2282 = ((i2272 | 22) << 1) - (i2272 ^ 22);
                                            Object[] objArr462 = new Object[1];
                                            delta(c222, i2262, i2282, objArr462);
                                            Object[] objArr472 = {(String) objArr462[0]};
                                            D88713 = uH18377.D8871(-957097391);
                                            if (D88713 == null) {
                                            }
                                            String lowerCase2 = ((String) ((Method) D88713).invoke(null, objArr472)).toLowerCase();
                                            char touchSlop22 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                            int i2292 = -(-TextUtils.lastIndexOf(str12, '0'));
                                            int i2302 = ((i2292 | 396) << 1) - (i2292 ^ 396);
                                            int indexOf72 = TextUtils.indexOf((CharSequence) str12, '0');
                                            int i2312 = (indexOf72 & 5) + (indexOf72 | 5);
                                            Object[] objArr492 = new Object[1];
                                            delta(touchSlop22, i2302, i2312, objArr492);
                                            if (lowerCase2.contains((String) objArr492[0])) {
                                            }
                                            int i2332 = ((~i2252) & i16) | (i2252 & i30);
                                            int i2342 = -i2332;
                                            int i2352 = ((i2332 & i2342) | (i2332 ^ i2342)) >> 31;
                                            int i2362 = i232 & (~i2352);
                                            int i2372 = i2252 & i2352;
                                            i37 = (i2372 & i2362) | (i2362 ^ i2372);
                                            char doubleTapTimeout32 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                            int i2382 = 400 - (ViewConfiguration.getScrollFriction() > f5 ? 1 : (ViewConfiguration.getScrollFriction() == f5 ? 0 : -1));
                                            int i2392 = -(TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1));
                                            int i2402 = (i2392 & 42) + (i2392 | 42);
                                            Object[] objArr502 = new Object[1];
                                            delta(doubleTapTimeout32, i2382, i2402, objArr502);
                                            String str322 = (String) objArr502[0];
                                            char scrollDefaultDelay6 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int i2412 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                            int i2422 = (i2412 & 441) + (i2412 | 441);
                                            int i2432 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                            int i2442 = (i2432 ^ 40) + ((i2432 & 40) << 1);
                                            Object[] objArr512 = new Object[1];
                                            delta(scrollDefaultDelay6, i2422, i2442, objArr512);
                                            String str332 = (String) objArr512[0];
                                            int i2452 = -(-Color.rgb(0, 0, 0));
                                            Object[] objArr522 = new Object[1];
                                            delta((char) ((i2452 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) + (i2452 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 481, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 26, objArr522);
                                            String str342 = (String) objArr522[0];
                                            int i2462 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            int i2472 = (i2462 * (-1939)) + 14416437;
                                            int i2482 = ~((-14848) | i2462);
                                            int i2492 = ~(i182 | 14847);
                                            int i2502 = ((i2482 & i2492) | (i2482 ^ i2492)) * (-970);
                                            int i2512 = (i2472 ^ i2502) + ((i2472 & i2502) << 1);
                                            int i2522 = ~i2462;
                                            int i2532 = ((~((i2522 & 14847) | (i2522 ^ 14847))) * 1940) + i2512;
                                            int i2542 = ~i2462;
                                            int i2552 = ~((i2542 & (-14848)) | (i2542 ^ (-14848)));
                                            int i2562 = ~((i30 ^ 14847) | (i30 & 14847));
                                            int i2572 = ((i2552 & i2562) | (i2552 ^ i2562)) * 970;
                                            char c232 = (char) ((i2532 & i2572) + (i2572 | i2532));
                                            int myTid6 = (Process.myTid() >> 22) + 508;
                                            int argb22 = Color.argb(0, 0, 0, 0);
                                            int i2582 = (argb22 ^ 27) + ((argb22 & 27) << 1);
                                            Object[] objArr532 = new Object[1];
                                            delta(c232, myTid6, i2582, objArr532);
                                            String str352 = (String) objArr532[0];
                                            float f112 = f5;
                                            char c242 = (char) (TypedValue.complexToFraction(0, f112, f112) > f112 ? 1 : (TypedValue.complexToFraction(0, f112, f112) == f112 ? 0 : -1));
                                            int i2592 = -(-Color.rgb(0, 0, 0));
                                            int i2602 = (i2592 & 16777751) + (i2592 | 16777751);
                                            int i2612 = -(AudioTrack.getMaxVolume() > f112 ? 1 : (AudioTrack.getMaxVolume() == f112 ? 0 : -1));
                                            i38 = 1;
                                            int i2622 = ((i2612 | 28) << 1) - (i2612 ^ 28);
                                            Object[] objArr542 = new Object[1];
                                            delta(c242, i2602, i2622, objArr542);
                                            String str362 = (String) objArr542[0];
                                            int bitsPerPixel22 = ImageFormat.getBitsPerPixel(0);
                                            int i2632 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                            c10 = 0;
                                            Object[] objArr552 = new Object[1];
                                            delta((char) ((bitsPerPixel22 & 1) + (bitsPerPixel22 | 1)), (i2632 ^ 562) + ((i2632 & 562) << 1), 27 - KeyEvent.normalizeMetaState(0), objArr552);
                                            String[] strArr132 = {str322, str332, str342, str352, str362, (String) objArr552[0]};
                                            i39 = 0;
                                            i40 = i25;
                                            while (true) {
                                                if (i39 < i40) {
                                                }
                                                int i2642 = i39 - 123;
                                                i39 = (i2642 | 124) + (i2642 & 124);
                                                i37 = i41;
                                                i40 = 6;
                                                i38 = 1;
                                                c10 = 0;
                                            }
                                            int i2652 = i16 ^ i41;
                                            int i2662 = -i2652;
                                            int i2672 = ((i2652 & i2662) | (i2652 ^ i2662)) >> 31;
                                            int i2682 = i42 & (~i2672);
                                            int i2692 = i41 & i2672;
                                            int i2702 = (i2682 & i2692) | (i2682 ^ i2692);
                                            char c252 = (char) (64292 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8))));
                                            int i2712 = -(-View.resolveSizeAndState(0, 0, 0));
                                            Object[] objArr582 = new Object[1];
                                            delta(c252, (i2712 ^ 349) + ((i2712 & 349) << 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 17, objArr582);
                                            String str382 = (String) objArr582[0];
                                            char keyRepeatDelay4 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                            int i2722 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                                            int i2732 = (i2722 ^ 589) + ((i2722 & 589) << 1);
                                            int i2742 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                            int i2752 = (i2742 & 5) + (i2742 | 5);
                                            Object[] objArr592 = new Object[1];
                                            delta(keyRepeatDelay4, i2732, i2752, objArr592);
                                            Object[] objArr602 = new Object[i21];
                                            objArr602[1] = (String) objArr592[0];
                                            objArr602[0] = str382;
                                            D88714 = uH18377.D8871(1214576837);
                                            if (D88714 == null) {
                                            }
                                            long longValue72 = ((Long) ((Method) D88714).invoke(null, objArr602)).longValue();
                                            long j572 = -125671674;
                                            long j582 = ((-1917) * longValue72) + (960 * j572);
                                            long j592 = 959;
                                            long j602 = longValue72 ^ j38;
                                            long j612 = ((j592 * (((j602 | j7) ^ j38) | ((j48 | j572) ^ j38))) + (((-959) * j602) + (((((j602 | j48) ^ j38) | ((j572 | j7) ^ j38)) * j592) + j582))) - 1421966664;
                                            int i2772 = (int) Runtime.getRuntime().totalMemory();
                                            int i2782 = ~i2772;
                                            i43 = ((int) (j612 >> c3)) & ((((~(i2772 | (-886104706))) | 550527489 | (~(i2782 | 886698921))) * 988) + (((~((-335577217) | i2782)) | (~(886698921 | i2772))) * 988) + 2024312806);
                                            i44 = ((int) j612) & ((((~((-85328001) | i16)) | (~((-537462802) | i30)) | (~((-1522554411) | i16))) * 192) + (((~((-622790802) | i30)) | 85328000) * (-384)) + (((-2145345212) | i30) * (-192)) + 1788176917);
                                            if (((i43 & i44) | (i43 ^ i44)) != 0) {
                                            }
                                            i45 = i46 | i47;
                                            int i313222 = (~(i16 & i2702)) & (i16 | i2702);
                                            int i314222 = -i313222;
                                            int i315222 = ((i313222 & i314222) | (i313222 ^ i314222)) >> 31;
                                            int i316222 = i45 & (~i315222);
                                            int i317222 = i2702 & i315222;
                                            i48 = (i317222 & i316222) | (i316222 ^ i317222);
                                            if ((i17 & 8) == 0) {
                                            }
                                            int i353222 = 739 - (~(-(-TextUtils.indexOf((CharSequence) str12, '0', 0))));
                                            int longPressTimeout3222 = ViewConfiguration.getLongPressTimeout() >> 16;
                                            int i354222 = (longPressTimeout3222 & 41) + (longPressTimeout3222 | 41);
                                            Object[] objArr70222 = new Object[1];
                                            delta((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), i353222, i354222, objArr70222);
                                            c11 = 0;
                                            String str44222 = (String) objArr70222[0];
                                            char indexOf8222 = (char) TextUtils.indexOf(str12, str12, 0, 0);
                                            int i355222 = 779 - (~(-(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))));
                                            int i356222 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                            int i357222 = (i356222 & 30) + (i356222 | 30);
                                            i49 = 1;
                                            Object[] objArr71222 = new Object[1];
                                            delta(indexOf8222, i355222, i357222, objArr71222);
                                            String[] strArr15222 = {str44222, (String) objArr71222[0]};
                                            i50 = 0;
                                            while (true) {
                                                if (i50 < 2) {
                                                }
                                                i50 = ((i50 & 1) << 1) + (i50 ^ 1);
                                                i48 = i51;
                                                c11 = 0;
                                                i49 = 1;
                                            }
                                            int i362222 = i16 ^ i51;
                                            int i363222 = -i362222;
                                            int i364222 = ((i362222 & i363222) | (i362222 ^ i363222)) >> 31;
                                            int i365222 = i52 & (~i364222);
                                            int i366222 = i51 & i364222;
                                            int i367222 = (i365222 & i366222) | (i365222 ^ i366222);
                                            D88715 = uH18377.D8871(-344556366);
                                            if (D88715 == null) {
                                            }
                                            long longValue10222 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
                                            long j75222 = 1478172722;
                                            long j76222 = 495;
                                            long j77222 = -493;
                                            long j78222 = (j77222 * longValue10222) + (j76222 * j75222);
                                            long j79222 = -988;
                                            long j80222 = longValue10222 ^ j38;
                                            long j81222 = 494;
                                            long j82222 = j75222 ^ j38;
                                            long j83222 = ((((((j82222 | j80222) ^ j38) | ((j48 | longValue10222) ^ j38)) | ((j75222 | longValue10222) ^ j38)) * j81222) + ((((longValue10222 | j82222) | j48) * j81222) + (((j75222 | j80222) * j79222) + j78222))) - 1630425820;
                                            i53 = ((int) (j83222 >> c3)) & (((1005187049 | i16) * 220) + ((1002991073 | (~(434235337 | i30))) * (-440)) + (((~(1005187049 | i30)) | 432039361) * 220) + 2009436746);
                                            int i369222 = (int) j83222;
                                            int myPid5222 = Process.myPid();
                                            foxtrot = A0.z.foxtrot((~((~myPid5222) | (-302318977))) | (-2147475419), 576, (((~((-506283993) | myPid5222)) | 203965016) * 576) + 1771465493, 1519732224) & i369222;
                                            if (((foxtrot & i53) | (i53 ^ foxtrot)) == 1) {
                                            }
                                            int[] iArr2222 = new int[1];
                                            int i814222 = ((~i54) & i16) | (i54 & i30);
                                            int i815222 = -i814222;
                                            Object[] objArr194222 = {new int[]{i54}, new int[]{i16}, iArr2222, strArr2};
                                            int i816222 = (((~((-211101401) | i30)) | (~(i16 | 578269930))) * 627) + (((~(211101400 | i16)) | 578269930) * (-627)) + ((((-1385161) | i16) * (-627)) - 1346397772);
                                            int i817222 = -(-((((i814222 & i815222) | (i814222 ^ i815222)) >> 31) & 16));
                                            int i818222 = -(-((i816222 & i817222) + (i816222 | i817222)));
                                            int i819222 = ((i18 | i818222) << 1) - (i18 ^ i818222);
                                            int i820222 = i819222 << 13;
                                            int i821222 = (i820222 | i819222) & (~(i819222 & i820222));
                                            int i822222 = i821222 >>> 17;
                                            int i823222 = (i821222 | i822222) & (~(i821222 & i822222));
                                            int i824222 = i823222 << 5;
                                            iArr2222[0] = ((~i823222) & i824222) | ((~i824222) & i823222);
                                            return objArr194222;
                                        }
                                    }
                                    i36 = i16;
                                    int i2032 = i16 ^ i195;
                                    int i2042 = -i2032;
                                    int i2052 = ((i2032 & i2042) | (i2032 ^ i2042)) >> 31;
                                    int i2062 = i36 & (~i2052);
                                    int i2072 = i195 & i2052;
                                    int i2082 = (i2072 & i2062) | (i2062 ^ i2072);
                                    char c212 = (char) (64292 - (~(-TextUtils.indexOf(str12, str12))));
                                    int trimmedLength2 = TextUtils.getTrimmedLength(str12) + 349;
                                    int i2092 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int i2102 = ((i2092 | 18) << 1) - (i2092 ^ 18);
                                    Object[] objArr432 = new Object[1];
                                    delta(c212, trimmedLength2, i2102, objArr432);
                                    String str302 = (String) objArr432[0];
                                    char edgeSlop22 = (char) (32015 - (ViewConfiguration.getEdgeSlop() >> 16));
                                    int i2112 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                    int i2122 = (i2112 ^ 366) + ((i2112 & 366) << 1);
                                    int packedPositionType22 = ExpandableListView.getPackedPositionType(0L);
                                    int i2132 = (packedPositionType22 ^ 6) + ((packedPositionType22 & 6) << 1);
                                    Object[] objArr442 = new Object[1];
                                    delta(edgeSlop22, i2122, i2132, objArr442);
                                    String str312 = (String) objArr442[0];
                                    file2 = new File(str302);
                                    if (file2.exists()) {
                                    }
                                    z11 = false;
                                    if (!z11) {
                                    }
                                    int i22022 = ((~i2082) & i16) | (i2082 & i30);
                                    int i22122 = -i22022;
                                    int i22222 = ((i22022 & i22122) | (i22022 ^ i22122)) >> 31;
                                    int i22322 = i219 & (~i22222);
                                    int i22422 = i2082 & i22222;
                                    int i22522 = (i22422 & i22322) | (i22322 ^ i22422);
                                    char c2222 = (char) (29293 - (~(-Color.green(0))));
                                    int i22622 = 371 - (~View.resolveSizeAndState(0, 0, 0));
                                    int i22722 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                    int i22822 = ((i22722 | 22) << 1) - (i22722 ^ 22);
                                    Object[] objArr4622 = new Object[1];
                                    delta(c2222, i22622, i22822, objArr4622);
                                    Object[] objArr4722 = {(String) objArr4622[0]};
                                    D88713 = uH18377.D8871(-957097391);
                                    if (D88713 == null) {
                                    }
                                    String lowerCase22 = ((String) ((Method) D88713).invoke(null, objArr4722)).toLowerCase();
                                    char touchSlop222 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                    int i22922 = -(-TextUtils.lastIndexOf(str12, '0'));
                                    int i23022 = ((i22922 | 396) << 1) - (i22922 ^ 396);
                                    int indexOf722 = TextUtils.indexOf((CharSequence) str12, '0');
                                    int i23122 = (indexOf722 & 5) + (indexOf722 | 5);
                                    Object[] objArr4922 = new Object[1];
                                    delta(touchSlop222, i23022, i23122, objArr4922);
                                    if (lowerCase22.contains((String) objArr4922[0])) {
                                    }
                                    int i23322 = ((~i22522) & i16) | (i22522 & i30);
                                    int i23422 = -i23322;
                                    int i23522 = ((i23322 & i23422) | (i23322 ^ i23422)) >> 31;
                                    int i23622 = i232 & (~i23522);
                                    int i23722 = i22522 & i23522;
                                    i37 = (i23722 & i23622) | (i23622 ^ i23722);
                                    char doubleTapTimeout322 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                    int i23822 = 400 - (ViewConfiguration.getScrollFriction() > f5 ? 1 : (ViewConfiguration.getScrollFriction() == f5 ? 0 : -1));
                                    int i23922 = -(TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1));
                                    int i24022 = (i23922 & 42) + (i23922 | 42);
                                    Object[] objArr5022 = new Object[1];
                                    delta(doubleTapTimeout322, i23822, i24022, objArr5022);
                                    String str3222 = (String) objArr5022[0];
                                    char scrollDefaultDelay62 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    int i24122 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                    int i24222 = (i24122 & 441) + (i24122 | 441);
                                    int i24322 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                    int i24422 = (i24322 ^ 40) + ((i24322 & 40) << 1);
                                    Object[] objArr5122 = new Object[1];
                                    delta(scrollDefaultDelay62, i24222, i24422, objArr5122);
                                    String str3322 = (String) objArr5122[0];
                                    int i24522 = -(-Color.rgb(0, 0, 0));
                                    Object[] objArr5222 = new Object[1];
                                    delta((char) ((i24522 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) + (i24522 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 481, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 26, objArr5222);
                                    String str3422 = (String) objArr5222[0];
                                    int i24622 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int i24722 = (i24622 * (-1939)) + 14416437;
                                    int i24822 = ~((-14848) | i24622);
                                    int i24922 = ~(i182 | 14847);
                                    int i25022 = ((i24822 & i24922) | (i24822 ^ i24922)) * (-970);
                                    int i25122 = (i24722 ^ i25022) + ((i24722 & i25022) << 1);
                                    int i25222 = ~i24622;
                                    int i25322 = ((~((i25222 & 14847) | (i25222 ^ 14847))) * 1940) + i25122;
                                    int i25422 = ~i24622;
                                    int i25522 = ~((i25422 & (-14848)) | (i25422 ^ (-14848)));
                                    int i25622 = ~((i30 ^ 14847) | (i30 & 14847));
                                    int i25722 = ((i25522 & i25622) | (i25522 ^ i25622)) * 970;
                                    char c2322 = (char) ((i25322 & i25722) + (i25722 | i25322));
                                    int myTid62 = (Process.myTid() >> 22) + 508;
                                    int argb222 = Color.argb(0, 0, 0, 0);
                                    int i25822 = (argb222 ^ 27) + ((argb222 & 27) << 1);
                                    Object[] objArr5322 = new Object[1];
                                    delta(c2322, myTid62, i25822, objArr5322);
                                    String str3522 = (String) objArr5322[0];
                                    float f1122 = f5;
                                    char c2422 = (char) (TypedValue.complexToFraction(0, f1122, f1122) > f1122 ? 1 : (TypedValue.complexToFraction(0, f1122, f1122) == f1122 ? 0 : -1));
                                    int i25922 = -(-Color.rgb(0, 0, 0));
                                    int i26022 = (i25922 & 16777751) + (i25922 | 16777751);
                                    int i26122 = -(AudioTrack.getMaxVolume() > f1122 ? 1 : (AudioTrack.getMaxVolume() == f1122 ? 0 : -1));
                                    i38 = 1;
                                    int i26222 = ((i26122 | 28) << 1) - (i26122 ^ 28);
                                    Object[] objArr5422 = new Object[1];
                                    delta(c2422, i26022, i26222, objArr5422);
                                    String str3622 = (String) objArr5422[0];
                                    int bitsPerPixel222 = ImageFormat.getBitsPerPixel(0);
                                    int i26322 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                    c10 = 0;
                                    Object[] objArr5522 = new Object[1];
                                    delta((char) ((bitsPerPixel222 & 1) + (bitsPerPixel222 | 1)), (i26322 ^ 562) + ((i26322 & 562) << 1), 27 - KeyEvent.normalizeMetaState(0), objArr5522);
                                    String[] strArr1322 = {str3222, str3322, str3422, str3522, str3622, (String) objArr5522[0]};
                                    i39 = 0;
                                    i40 = i25;
                                    while (true) {
                                        if (i39 < i40) {
                                        }
                                        int i26422 = i39 - 123;
                                        i39 = (i26422 | 124) + (i26422 & 124);
                                        i37 = i41;
                                        i40 = 6;
                                        i38 = 1;
                                        c10 = 0;
                                    }
                                    int i26522 = i16 ^ i41;
                                    int i26622 = -i26522;
                                    int i26722 = ((i26522 & i26622) | (i26522 ^ i26622)) >> 31;
                                    int i26822 = i42 & (~i26722);
                                    int i26922 = i41 & i26722;
                                    int i27022 = (i26822 & i26922) | (i26822 ^ i26922);
                                    char c2522 = (char) (64292 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8))));
                                    int i27122 = -(-View.resolveSizeAndState(0, 0, 0));
                                    Object[] objArr5822 = new Object[1];
                                    delta(c2522, (i27122 ^ 349) + ((i27122 & 349) << 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 17, objArr5822);
                                    String str3822 = (String) objArr5822[0];
                                    char keyRepeatDelay42 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    int i27222 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                                    int i27322 = (i27222 ^ 589) + ((i27222 & 589) << 1);
                                    int i27422 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                    int i27522 = (i27422 & 5) + (i27422 | 5);
                                    Object[] objArr5922 = new Object[1];
                                    delta(keyRepeatDelay42, i27322, i27522, objArr5922);
                                    Object[] objArr6022 = new Object[i21];
                                    objArr6022[1] = (String) objArr5922[0];
                                    objArr6022[0] = str3822;
                                    D88714 = uH18377.D8871(1214576837);
                                    if (D88714 == null) {
                                    }
                                    long longValue722 = ((Long) ((Method) D88714).invoke(null, objArr6022)).longValue();
                                    long j5722 = -125671674;
                                    long j5822 = ((-1917) * longValue722) + (960 * j5722);
                                    long j5922 = 959;
                                    long j6022 = longValue722 ^ j38;
                                    long j6122 = ((j5922 * (((j6022 | j7) ^ j38) | ((j48 | j5722) ^ j38))) + (((-959) * j6022) + (((((j6022 | j48) ^ j38) | ((j5722 | j7) ^ j38)) * j5922) + j5822))) - 1421966664;
                                    int i27722 = (int) Runtime.getRuntime().totalMemory();
                                    int i27822 = ~i27722;
                                    i43 = ((int) (j6122 >> c3)) & ((((~(i27722 | (-886104706))) | 550527489 | (~(i27822 | 886698921))) * 988) + (((~((-335577217) | i27822)) | (~(886698921 | i27722))) * 988) + 2024312806);
                                    i44 = ((int) j6122) & ((((~((-85328001) | i16)) | (~((-537462802) | i30)) | (~((-1522554411) | i16))) * 192) + (((~((-622790802) | i30)) | 85328000) * (-384)) + (((-2145345212) | i30) * (-192)) + 1788176917);
                                    if (((i43 & i44) | (i43 ^ i44)) != 0) {
                                    }
                                    i45 = i46 | i47;
                                    int i3132222 = (~(i16 & i27022)) & (i16 | i27022);
                                    int i3142222 = -i3132222;
                                    int i3152222 = ((i3132222 & i3142222) | (i3132222 ^ i3142222)) >> 31;
                                    int i3162222 = i45 & (~i3152222);
                                    int i3172222 = i27022 & i3152222;
                                    i48 = (i3172222 & i3162222) | (i3162222 ^ i3172222);
                                    if ((i17 & 8) == 0) {
                                    }
                                    int i3532222 = 739 - (~(-(-TextUtils.indexOf((CharSequence) str12, '0', 0))));
                                    int longPressTimeout32222 = ViewConfiguration.getLongPressTimeout() >> 16;
                                    int i3542222 = (longPressTimeout32222 & 41) + (longPressTimeout32222 | 41);
                                    Object[] objArr702222 = new Object[1];
                                    delta((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), i3532222, i3542222, objArr702222);
                                    c11 = 0;
                                    String str442222 = (String) objArr702222[0];
                                    char indexOf82222 = (char) TextUtils.indexOf(str12, str12, 0, 0);
                                    int i3552222 = 779 - (~(-(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))));
                                    int i3562222 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                    int i3572222 = (i3562222 & 30) + (i3562222 | 30);
                                    i49 = 1;
                                    Object[] objArr712222 = new Object[1];
                                    delta(indexOf82222, i3552222, i3572222, objArr712222);
                                    String[] strArr152222 = {str442222, (String) objArr712222[0]};
                                    i50 = 0;
                                    while (true) {
                                        if (i50 < 2) {
                                        }
                                        i50 = ((i50 & 1) << 1) + (i50 ^ 1);
                                        i48 = i51;
                                        c11 = 0;
                                        i49 = 1;
                                    }
                                    int i3622222 = i16 ^ i51;
                                    int i3632222 = -i3622222;
                                    int i3642222 = ((i3622222 & i3632222) | (i3622222 ^ i3632222)) >> 31;
                                    int i3652222 = i52 & (~i3642222);
                                    int i3662222 = i51 & i3642222;
                                    int i3672222 = (i3652222 & i3662222) | (i3652222 ^ i3662222);
                                    D88715 = uH18377.D8871(-344556366);
                                    if (D88715 == null) {
                                    }
                                    long longValue102222 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
                                    long j752222 = 1478172722;
                                    long j762222 = 495;
                                    long j772222 = -493;
                                    long j782222 = (j772222 * longValue102222) + (j762222 * j752222);
                                    long j792222 = -988;
                                    long j802222 = longValue102222 ^ j38;
                                    long j812222 = 494;
                                    long j822222 = j752222 ^ j38;
                                    long j832222 = ((((((j822222 | j802222) ^ j38) | ((j48 | longValue102222) ^ j38)) | ((j752222 | longValue102222) ^ j38)) * j812222) + ((((longValue102222 | j822222) | j48) * j812222) + (((j752222 | j802222) * j792222) + j782222))) - 1630425820;
                                    i53 = ((int) (j832222 >> c3)) & (((1005187049 | i16) * 220) + ((1002991073 | (~(434235337 | i30))) * (-440)) + (((~(1005187049 | i30)) | 432039361) * 220) + 2009436746);
                                    int i3692222 = (int) j832222;
                                    int myPid52222 = Process.myPid();
                                    foxtrot = A0.z.foxtrot((~((~myPid52222) | (-302318977))) | (-2147475419), 576, (((~((-506283993) | myPid52222)) | 203965016) * 576) + 1771465493, 1519732224) & i3692222;
                                    if (((foxtrot & i53) | (i53 ^ foxtrot)) == 1) {
                                    }
                                    int[] iArr22222 = new int[1];
                                    int i8142222 = ((~i54) & i16) | (i54 & i30);
                                    int i8152222 = -i8142222;
                                    Object[] objArr1942222 = {new int[]{i54}, new int[]{i16}, iArr22222, strArr2};
                                    int i8162222 = (((~((-211101401) | i30)) | (~(i16 | 578269930))) * 627) + (((~(211101400 | i16)) | 578269930) * (-627)) + ((((-1385161) | i16) * (-627)) - 1346397772);
                                    int i8172222 = -(-((((i8142222 & i8152222) | (i8142222 ^ i8152222)) >> 31) & 16));
                                    int i8182222 = -(-((i8162222 & i8172222) + (i8162222 | i8172222)));
                                    int i8192222 = ((i18 | i8182222) << 1) - (i18 ^ i8182222);
                                    int i8202222 = i8192222 << 13;
                                    int i8212222 = (i8202222 | i8192222) & (~(i8192222 & i8202222));
                                    int i8222222 = i8212222 >>> 17;
                                    int i8232222 = (i8212222 | i8222222) & (~(i8212222 & i8222222));
                                    int i8242222 = i8232222 << 5;
                                    iArr22222[0] = ((~i8232222) & i8242222) | ((~i8242222) & i8232222);
                                    return objArr1942222;
                                }
                            }
                            i31 = 0;
                            int i1662 = -i31;
                            int i1672 = ((i31 & i1662) | (i31 ^ i1662)) >> 31;
                            int i1682 = (~i1672) & i16;
                            int i1692 = i1672 & (i16 ^ 262);
                            int i1702 = (i1692 & i1682) | (i1682 ^ i1692);
                            int i1712 = (~(i16 & i160)) & (i16 | i160);
                            int i1722 = -i1712;
                            int i1732 = ((i1712 & i1722) | (i1712 ^ i1722)) >> 31;
                            int i1742 = i1702 & (~i1732);
                            int i1752 = i160 & i1732;
                            int i1762 = (i1752 & i1742) | (i1742 ^ i1752);
                            char packedPositionType3 = (char) ExpandableListView.getPackedPositionType(0L);
                            int i1772 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 230;
                            int i1782 = -(ViewConfiguration.getTouchSlop() >> 8);
                            int i1792 = ~(((-32) & i30) | ((-32) ^ i30));
                            int i1802 = ~((~i1782) | i16);
                            int i1812 = (((i1782 * (-949)) - 29419) - (~(-(-(((i1792 & i1802) | (i1792 ^ i1802)) * 1900))))) - 1;
                            int i1822 = ~i16;
                            int i1832 = (((((~((i1822 ^ i1782) | (i1822 & i1782))) | (~((i16 ^ 31) | (i16 & 31)))) * (-950)) + i1812) - (~(-(-(((~((i1782 & i16) | (i1782 ^ i16))) | (~((i30 ^ 31) | (i30 & 31)))) * 950))))) - 1;
                            Object[] objArr332 = new Object[1];
                            delta(packedPositionType3, i1772, i1832, objArr332);
                            String str272 = (String) objArr332[0];
                            char keyCodeFromString5 = (char) (16300 - KeyEvent.keyCodeFromString(str12));
                            int indexOf52 = TextUtils.indexOf((CharSequence) str12, '0');
                            int i1842 = (indexOf52 & 263) + (indexOf52 | 263);
                            int i1852 = -(-AndroidCharacter.getMirror('0'));
                            int i1862 = ((i1852 | (-25)) << 1) - (i1852 ^ (-25));
                            Object[] objArr342 = new Object[1];
                            delta(keyCodeFromString5, i1842, i1862, objArr342);
                            String str282 = (String) objArr342[0];
                            char absoluteGravity6 = (char) Gravity.getAbsoluteGravity(0, 0);
                            int i1872 = 284 - (~(ViewConfiguration.getLongPressTimeout() >> 16));
                            int i1882 = -(Process.myTid() >> 22);
                            Object[] objArr352 = new Object[1];
                            delta(absoluteGravity6, i1872, ((i1882 | 28) << 1) - (i1882 ^ 28), objArr352);
                            String str292 = (String) objArr352[0];
                            char fadingEdgeLength22 = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 64455);
                            int edgeSlop5 = ViewConfiguration.getEdgeSlop() >> 16;
                            i32 = 1;
                            int resolveSizeAndState9 = View.resolveSizeAndState(0, 0, 0);
                            c4 = 0;
                            Object[] objArr362 = new Object[1];
                            delta(fadingEdgeLength22, ((edgeSlop5 | 313) << 1) - (edgeSlop5 ^ 313), (resolveSizeAndState9 & 14) + (resolveSizeAndState9 | 14), objArr362);
                            strArr = new String[]{str272, str282, str292, (String) objArr362[0]};
                            i33 = 0;
                            i34 = i20;
                            while (true) {
                                if (i33 < i34) {
                                }
                                i33 = (i33 & 1) + (i33 | 1);
                                strArr = strArr10;
                                j6 = j7;
                                i34 = 4;
                                i32 = 1;
                                c4 = 0;
                            }
                            int i1932 = (~(i16 & i1762)) & (i16 | i1762);
                            int i1942 = (i1932 | (-i1932)) >> 31;
                            int i1952 = (i35 & (~i1942)) | (i1762 & i1942);
                            int indexOf62 = TextUtils.indexOf((CharSequence) str12, '0', 0);
                            Object[] objArr392 = new Object[1];
                            delta((char) ((indexOf62 & 1) + (indexOf62 | 1)), 326 - (~(-(-Color.red(0)))), Color.alpha(0) + 13, objArr392);
                            Object[] objArr402 = {(String) objArr392[0]};
                            D88712 = uH18377.D8871(-957097391);
                            if (D88712 == null) {
                            }
                            str14 = (String) ((Method) D88712).invoke(null, objArr402);
                            if (str14 != null) {
                            }
                            i36 = i16;
                            int i20322 = i16 ^ i1952;
                            int i20422 = -i20322;
                            int i20522 = ((i20322 & i20422) | (i20322 ^ i20422)) >> 31;
                            int i20622 = i36 & (~i20522);
                            int i20722 = i1952 & i20522;
                            int i20822 = (i20722 & i20622) | (i20622 ^ i20722);
                            char c2122 = (char) (64292 - (~(-TextUtils.indexOf(str12, str12))));
                            int trimmedLength22 = TextUtils.getTrimmedLength(str12) + 349;
                            int i20922 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int i21022 = ((i20922 | 18) << 1) - (i20922 ^ 18);
                            Object[] objArr4322 = new Object[1];
                            delta(c2122, trimmedLength22, i21022, objArr4322);
                            String str3022 = (String) objArr4322[0];
                            char edgeSlop222 = (char) (32015 - (ViewConfiguration.getEdgeSlop() >> 16));
                            int i21122 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int i21222 = (i21122 ^ 366) + ((i21122 & 366) << 1);
                            int packedPositionType222 = ExpandableListView.getPackedPositionType(0L);
                            int i21322 = (packedPositionType222 ^ 6) + ((packedPositionType222 & 6) << 1);
                            Object[] objArr4422 = new Object[1];
                            delta(edgeSlop222, i21222, i21322, objArr4422);
                            String str3122 = (String) objArr4422[0];
                            file2 = new File(str3022);
                            if (file2.exists()) {
                            }
                            z11 = false;
                            if (!z11) {
                            }
                            int i220222 = ((~i20822) & i16) | (i20822 & i30);
                            int i221222 = -i220222;
                            int i222222 = ((i220222 & i221222) | (i220222 ^ i221222)) >> 31;
                            int i223222 = i219 & (~i222222);
                            int i224222 = i20822 & i222222;
                            int i225222 = (i224222 & i223222) | (i223222 ^ i224222);
                            char c22222 = (char) (29293 - (~(-Color.green(0))));
                            int i226222 = 371 - (~View.resolveSizeAndState(0, 0, 0));
                            int i227222 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            int i228222 = ((i227222 | 22) << 1) - (i227222 ^ 22);
                            Object[] objArr46222 = new Object[1];
                            delta(c22222, i226222, i228222, objArr46222);
                            Object[] objArr47222 = {(String) objArr46222[0]};
                            D88713 = uH18377.D8871(-957097391);
                            if (D88713 == null) {
                            }
                            String lowerCase222 = ((String) ((Method) D88713).invoke(null, objArr47222)).toLowerCase();
                            char touchSlop2222 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                            int i229222 = -(-TextUtils.lastIndexOf(str12, '0'));
                            int i230222 = ((i229222 | 396) << 1) - (i229222 ^ 396);
                            int indexOf7222 = TextUtils.indexOf((CharSequence) str12, '0');
                            int i231222 = (indexOf7222 & 5) + (indexOf7222 | 5);
                            Object[] objArr49222 = new Object[1];
                            delta(touchSlop2222, i230222, i231222, objArr49222);
                            if (lowerCase222.contains((String) objArr49222[0])) {
                            }
                            int i233222 = ((~i225222) & i16) | (i225222 & i30);
                            int i234222 = -i233222;
                            int i235222 = ((i233222 & i234222) | (i233222 ^ i234222)) >> 31;
                            int i236222 = i232 & (~i235222);
                            int i237222 = i225222 & i235222;
                            i37 = (i237222 & i236222) | (i236222 ^ i237222);
                            char doubleTapTimeout3222 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int i238222 = 400 - (ViewConfiguration.getScrollFriction() > f5 ? 1 : (ViewConfiguration.getScrollFriction() == f5 ? 0 : -1));
                            int i239222 = -(TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1));
                            int i240222 = (i239222 & 42) + (i239222 | 42);
                            Object[] objArr50222 = new Object[1];
                            delta(doubleTapTimeout3222, i238222, i240222, objArr50222);
                            String str32222 = (String) objArr50222[0];
                            char scrollDefaultDelay622 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int i241222 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            int i242222 = (i241222 & 441) + (i241222 | 441);
                            int i243222 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                            int i244222 = (i243222 ^ 40) + ((i243222 & 40) << 1);
                            Object[] objArr51222 = new Object[1];
                            delta(scrollDefaultDelay622, i242222, i244222, objArr51222);
                            String str33222 = (String) objArr51222[0];
                            int i245222 = -(-Color.rgb(0, 0, 0));
                            Object[] objArr52222 = new Object[1];
                            delta((char) ((i245222 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) + (i245222 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 481, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 26, objArr52222);
                            String str34222 = (String) objArr52222[0];
                            int i246222 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i247222 = (i246222 * (-1939)) + 14416437;
                            int i248222 = ~((-14848) | i246222);
                            int i249222 = ~(i1822 | 14847);
                            int i250222 = ((i248222 & i249222) | (i248222 ^ i249222)) * (-970);
                            int i251222 = (i247222 ^ i250222) + ((i247222 & i250222) << 1);
                            int i252222 = ~i246222;
                            int i253222 = ((~((i252222 & 14847) | (i252222 ^ 14847))) * 1940) + i251222;
                            int i254222 = ~i246222;
                            int i255222 = ~((i254222 & (-14848)) | (i254222 ^ (-14848)));
                            int i256222 = ~((i30 ^ 14847) | (i30 & 14847));
                            int i257222 = ((i255222 & i256222) | (i255222 ^ i256222)) * 970;
                            char c23222 = (char) ((i253222 & i257222) + (i257222 | i253222));
                            int myTid622 = (Process.myTid() >> 22) + 508;
                            int argb2222 = Color.argb(0, 0, 0, 0);
                            int i258222 = (argb2222 ^ 27) + ((argb2222 & 27) << 1);
                            Object[] objArr53222 = new Object[1];
                            delta(c23222, myTid622, i258222, objArr53222);
                            String str35222 = (String) objArr53222[0];
                            float f11222 = f5;
                            char c24222 = (char) (TypedValue.complexToFraction(0, f11222, f11222) > f11222 ? 1 : (TypedValue.complexToFraction(0, f11222, f11222) == f11222 ? 0 : -1));
                            int i259222 = -(-Color.rgb(0, 0, 0));
                            int i260222 = (i259222 & 16777751) + (i259222 | 16777751);
                            int i261222 = -(AudioTrack.getMaxVolume() > f11222 ? 1 : (AudioTrack.getMaxVolume() == f11222 ? 0 : -1));
                            i38 = 1;
                            int i262222 = ((i261222 | 28) << 1) - (i261222 ^ 28);
                            Object[] objArr54222 = new Object[1];
                            delta(c24222, i260222, i262222, objArr54222);
                            String str36222 = (String) objArr54222[0];
                            int bitsPerPixel2222 = ImageFormat.getBitsPerPixel(0);
                            int i263222 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                            c10 = 0;
                            Object[] objArr55222 = new Object[1];
                            delta((char) ((bitsPerPixel2222 & 1) + (bitsPerPixel2222 | 1)), (i263222 ^ 562) + ((i263222 & 562) << 1), 27 - KeyEvent.normalizeMetaState(0), objArr55222);
                            String[] strArr13222 = {str32222, str33222, str34222, str35222, str36222, (String) objArr55222[0]};
                            i39 = 0;
                            i40 = i25;
                            while (true) {
                                if (i39 < i40) {
                                }
                                int i264222 = i39 - 123;
                                i39 = (i264222 | 124) + (i264222 & 124);
                                i37 = i41;
                                i40 = 6;
                                i38 = 1;
                                c10 = 0;
                            }
                            int i265222 = i16 ^ i41;
                            int i266222 = -i265222;
                            int i267222 = ((i265222 & i266222) | (i265222 ^ i266222)) >> 31;
                            int i268222 = i42 & (~i267222);
                            int i269222 = i41 & i267222;
                            int i270222 = (i268222 & i269222) | (i268222 ^ i269222);
                            char c25222 = (char) (64292 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8))));
                            int i271222 = -(-View.resolveSizeAndState(0, 0, 0));
                            Object[] objArr58222 = new Object[1];
                            delta(c25222, (i271222 ^ 349) + ((i271222 & 349) << 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 17, objArr58222);
                            String str38222 = (String) objArr58222[0];
                            char keyRepeatDelay422 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i272222 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                            int i273222 = (i272222 ^ 589) + ((i272222 & 589) << 1);
                            int i274222 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                            int i275222 = (i274222 & 5) + (i274222 | 5);
                            Object[] objArr59222 = new Object[1];
                            delta(keyRepeatDelay422, i273222, i275222, objArr59222);
                            Object[] objArr60222 = new Object[i21];
                            objArr60222[1] = (String) objArr59222[0];
                            objArr60222[0] = str38222;
                            D88714 = uH18377.D8871(1214576837);
                            if (D88714 == null) {
                            }
                            long longValue7222 = ((Long) ((Method) D88714).invoke(null, objArr60222)).longValue();
                            long j57222 = -125671674;
                            long j58222 = ((-1917) * longValue7222) + (960 * j57222);
                            long j59222 = 959;
                            long j60222 = longValue7222 ^ j38;
                            long j61222 = ((j59222 * (((j60222 | j7) ^ j38) | ((j48 | j57222) ^ j38))) + (((-959) * j60222) + (((((j60222 | j48) ^ j38) | ((j57222 | j7) ^ j38)) * j59222) + j58222))) - 1421966664;
                            int i277222 = (int) Runtime.getRuntime().totalMemory();
                            int i278222 = ~i277222;
                            i43 = ((int) (j61222 >> c3)) & ((((~(i277222 | (-886104706))) | 550527489 | (~(i278222 | 886698921))) * 988) + (((~((-335577217) | i278222)) | (~(886698921 | i277222))) * 988) + 2024312806);
                            i44 = ((int) j61222) & ((((~((-85328001) | i16)) | (~((-537462802) | i30)) | (~((-1522554411) | i16))) * 192) + (((~((-622790802) | i30)) | 85328000) * (-384)) + (((-2145345212) | i30) * (-192)) + 1788176917);
                            if (((i43 & i44) | (i43 ^ i44)) != 0) {
                            }
                            i45 = i46 | i47;
                            int i31322222 = (~(i16 & i270222)) & (i16 | i270222);
                            int i31422222 = -i31322222;
                            int i31522222 = ((i31322222 & i31422222) | (i31322222 ^ i31422222)) >> 31;
                            int i31622222 = i45 & (~i31522222);
                            int i31722222 = i270222 & i31522222;
                            i48 = (i31722222 & i31622222) | (i31622222 ^ i31722222);
                            if ((i17 & 8) == 0) {
                            }
                            int i35322222 = 739 - (~(-(-TextUtils.indexOf((CharSequence) str12, '0', 0))));
                            int longPressTimeout322222 = ViewConfiguration.getLongPressTimeout() >> 16;
                            int i35422222 = (longPressTimeout322222 & 41) + (longPressTimeout322222 | 41);
                            Object[] objArr7022222 = new Object[1];
                            delta((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), i35322222, i35422222, objArr7022222);
                            c11 = 0;
                            String str4422222 = (String) objArr7022222[0];
                            char indexOf822222 = (char) TextUtils.indexOf(str12, str12, 0, 0);
                            int i35522222 = 779 - (~(-(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))));
                            int i35622222 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                            int i35722222 = (i35622222 & 30) + (i35622222 | 30);
                            i49 = 1;
                            Object[] objArr7122222 = new Object[1];
                            delta(indexOf822222, i35522222, i35722222, objArr7122222);
                            String[] strArr1522222 = {str4422222, (String) objArr7122222[0]};
                            i50 = 0;
                            while (true) {
                                if (i50 < 2) {
                                }
                                i50 = ((i50 & 1) << 1) + (i50 ^ 1);
                                i48 = i51;
                                c11 = 0;
                                i49 = 1;
                            }
                            int i36222222 = i16 ^ i51;
                            int i36322222 = -i36222222;
                            int i36422222 = ((i36222222 & i36322222) | (i36222222 ^ i36322222)) >> 31;
                            int i36522222 = i52 & (~i36422222);
                            int i36622222 = i51 & i36422222;
                            int i36722222 = (i36522222 & i36622222) | (i36522222 ^ i36622222);
                            D88715 = uH18377.D8871(-344556366);
                            if (D88715 == null) {
                            }
                            long longValue1022222 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
                            long j7522222 = 1478172722;
                            long j7622222 = 495;
                            long j7722222 = -493;
                            long j7822222 = (j7722222 * longValue1022222) + (j7622222 * j7522222);
                            long j7922222 = -988;
                            long j8022222 = longValue1022222 ^ j38;
                            long j8122222 = 494;
                            long j8222222 = j7522222 ^ j38;
                            long j8322222 = ((((((j8222222 | j8022222) ^ j38) | ((j48 | longValue1022222) ^ j38)) | ((j7522222 | longValue1022222) ^ j38)) * j8122222) + ((((longValue1022222 | j8222222) | j48) * j8122222) + (((j7522222 | j8022222) * j7922222) + j7822222))) - 1630425820;
                            i53 = ((int) (j8322222 >> c3)) & (((1005187049 | i16) * 220) + ((1002991073 | (~(434235337 | i30))) * (-440)) + (((~(1005187049 | i30)) | 432039361) * 220) + 2009436746);
                            int i36922222 = (int) j8322222;
                            int myPid522222 = Process.myPid();
                            foxtrot = A0.z.foxtrot((~((~myPid522222) | (-302318977))) | (-2147475419), 576, (((~((-506283993) | myPid522222)) | 203965016) * 576) + 1771465493, 1519732224) & i36922222;
                            if (((foxtrot & i53) | (i53 ^ foxtrot)) == 1) {
                            }
                            int[] iArr222222 = new int[1];
                            int i81422222 = ((~i54) & i16) | (i54 & i30);
                            int i81522222 = -i81422222;
                            Object[] objArr19422222 = {new int[]{i54}, new int[]{i16}, iArr222222, strArr2};
                            int i81622222 = (((~((-211101401) | i30)) | (~(i16 | 578269930))) * 627) + (((~(211101400 | i16)) | 578269930) * (-627)) + ((((-1385161) | i16) * (-627)) - 1346397772);
                            int i81722222 = -(-((((i81422222 & i81522222) | (i81422222 ^ i81522222)) >> 31) & 16));
                            int i81822222 = -(-((i81622222 & i81722222) + (i81622222 | i81722222)));
                            int i81922222 = ((i18 | i81822222) << 1) - (i18 ^ i81822222);
                            int i82022222 = i81922222 << 13;
                            int i82122222 = (i82022222 | i81922222) & (~(i81922222 & i82022222));
                            int i82222222 = i82122222 >>> 17;
                            int i82322222 = (i82122222 | i82222222) & (~(i82122222 & i82222222));
                            int i82422222 = i82322222 << 5;
                            iArr222222[0] = ((~i82322222) & i82422222) | ((~i82422222) & i82322222);
                            return objArr19422222;
                        }
                        int i825 = -Gravity.getAbsoluteGravity(0, 0);
                        int bitsPerPixel4 = 178 - ImageFormat.getBitsPerPixel(0);
                        int capsMode2 = TextUtils.getCapsMode(str12, 0, 0);
                        int i826 = capsMode2 * (-380);
                        int i827 = (i826 ^ 9168) + ((i826 & 9168) << 1);
                        int i828 = i16 | 24;
                        int i829 = ~capsMode2;
                        int i830 = ((i828 & i829) | (i828 ^ i829)) * (-381);
                        int i831 = ((i827 | i830) << 1) - (i830 ^ i827);
                        int i832 = ~capsMode2;
                        int i833 = ~((i832 & (-25)) | (i832 ^ (-25)));
                        int i834 = ~i16;
                        int i835 = ((~((i829 ^ 24) | (i829 & 24))) * 381) + ((i833 | (~((i834 & 24) | (i834 ^ 24))) | (~(capsMode2 | 24))) * 381) + i831;
                        Object[] objArr195 = new Object[1];
                        delta((char) ((i825 & 61730) + (i825 | 61730)), bitsPerPixel4, i835, objArr195);
                        Object[] objArr196 = {(String) objArr195[0]};
                        Object D887126 = uH18377.D8871(-957097391);
                        if (D887126 == null) {
                            int resolveSizeAndState10 = View.resolveSizeAndState(0, 0, 0) + 52;
                            int packedPositionType4 = ExpandableListView.getPackedPositionType(0L) + 3158;
                            char c43 = (char) (58074 - (AudioTrack.getMinVolume() > f5 ? 1 : (AudioTrack.getMinVolume() == f5 ? 0 : -1)));
                            byte b57 = (byte) 0;
                            byte b58 = (byte) (b57 + 1);
                            Object[] objArr197 = new Object[1];
                            foxtrot(b57, b58, (byte) (b58 + 1), objArr197);
                            D887126 = uH18377.setPivotYN16904(resolveSizeAndState10, packedPositionType4, c43, 424179844, false, (String) objArr197[0], new Class[]{cls9});
                        }
                        String str105 = (String) ((Method) D887126).invoke(null, objArr196);
                        if (str105 == null || str105.isEmpty()) {
                            i27 = i16;
                            int i1382 = (~i128) & i16;
                            i30 = ~i16;
                            int i1392 = i1382 | (i128 & i30);
                            int i1402 = -i1392;
                            int i1412 = ((i1392 & i1402) | (i1392 ^ i1402)) >> 31;
                            int i1422 = i27 & (~i1412);
                            int i1432 = i128 & i1412;
                            int i1442 = (i1432 & i1422) | (i1422 ^ i1432);
                            D8871 = uH18377.D8871(1074526551);
                            if (D8871 == null) {
                            }
                            long longValue52 = ((Long) ((Method) D8871).invoke(null, null)).longValue();
                            long j432 = -1967520600;
                            long j442 = (989 * longValue52) + ((-1975) * j432);
                            long j452 = 988;
                            j6 = i16;
                            long j462 = ((j432 ^ j38) | longValue52) ^ j38;
                            long j472 = longValue52 ^ j38;
                            long j482 = j6 ^ j38;
                            long j492 = (j452 * (j462 | ((j472 | j6) ^ j38) | ((j482 | longValue52) ^ j38))) + ((-1976) * (((j472 | j432) ^ j38) | ((j482 | j432) ^ j38))) + ((j6 | j462) * j452) + j442 + 2147086317;
                            int i1452 = ((int) (j492 >> c3)) & ((((-75502689) | i16) * 220) + (((~((-629183601) | i30)) | 2066410011) * (-440)) + (((~((-75502689) | i30)) | 1512729099) * 220) + 1762334202);
                            int uptimeMillis22 = ((int) j492) & (((((int) SystemClock.uptimeMillis()) | (-77770851)) * 591) + ((((~((-77770851) | (~r8))) | 1514997260) * (-591)) - 709110634));
                            int i1462 = (i1452 & uptimeMillis22) | (i1452 ^ uptimeMillis22);
                            int i1472 = i1462 - 1;
                            int i1482 = (i1472 ^ 200) + ((i1472 & 200) << 1);
                            int i1492 = ((~i1482) & i16) | (i1482 & i30);
                            int i1502 = -i1462;
                            int i1512 = ((i1462 & i1502) | (i1462 ^ i1502)) >> 31;
                            int i1522 = (~i1512) & i16;
                            int i1532 = i1512 & i1492;
                            int i1542 = (i1532 & i1522) | (i1522 ^ i1532);
                            int i1552 = i16 ^ i1442;
                            int i1562 = -i1552;
                            int i1572 = ((i1552 & i1562) | (i1552 ^ i1562)) >> 31;
                            int i1582 = i1542 & (~i1572);
                            int i1592 = i1442 & i1572;
                            int i1602 = (i1592 & i1582) | (i1582 ^ i1592);
                            char c202 = (char) (61633 - (~(-(-ExpandableListView.getPackedPositionGroup(0L)))));
                            int i1612 = 201 - (~(ViewConfiguration.getScrollFriction() > f5 ? 1 : (ViewConfiguration.getScrollFriction() == f5 ? 0 : -1)));
                            int i1622 = -KeyEvent.keyCodeFromString(str12);
                            int i1632 = ((i1622 | 20) << 1) - (i1622 ^ 20);
                            Object[] objArr302 = new Object[1];
                            delta(c202, i1612, i1632, objArr302);
                            String str262 = (String) objArr302[0];
                            int i1642 = -Process.getGidForName(str12);
                            Object[] objArr312 = new Object[1];
                            delta((char) ((i1642 ^ 7672) + ((i1642 & 7672) << 1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 223, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6, objArr312);
                            str13 = (String) objArr312[0];
                            file = new File(str262);
                            if (file.exists()) {
                                Scanner scanner5 = new Scanner(new FileInputStream(file));
                                char pressedStateDuration22 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                int i1652 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                Object[] objArr322 = new Object[1];
                                delta(pressedStateDuration22, (i1652 ^ 230) + ((i1652 & 230) << 1), 1 - (~(ViewConfiguration.getPressedStateDuration() >> 16)), objArr322);
                                Scanner useDelimiter5 = scanner5.useDelimiter((String) objArr322[0]);
                                if (!useDelimiter5.hasNext()) {
                                }
                                useDelimiter5.close();
                                if (next.contains(str13)) {
                                }
                            }
                            i31 = 0;
                            int i16622 = -i31;
                            int i16722 = ((i31 & i16622) | (i31 ^ i16622)) >> 31;
                            int i16822 = (~i16722) & i16;
                            int i16922 = i16722 & (i16 ^ 262);
                            int i17022 = (i16922 & i16822) | (i16822 ^ i16922);
                            int i17122 = (~(i16 & i1602)) & (i16 | i1602);
                            int i17222 = -i17122;
                            int i17322 = ((i17122 & i17222) | (i17122 ^ i17222)) >> 31;
                            int i17422 = i17022 & (~i17322);
                            int i17522 = i1602 & i17322;
                            int i17622 = (i17522 & i17422) | (i17422 ^ i17522);
                            char packedPositionType32 = (char) ExpandableListView.getPackedPositionType(0L);
                            int i17722 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 230;
                            int i17822 = -(ViewConfiguration.getTouchSlop() >> 8);
                            int i17922 = ~(((-32) & i30) | ((-32) ^ i30));
                            int i18022 = ~((~i17822) | i16);
                            int i18122 = (((i17822 * (-949)) - 29419) - (~(-(-(((i17922 & i18022) | (i17922 ^ i18022)) * 1900))))) - 1;
                            int i18222 = ~i16;
                            int i18322 = (((((~((i18222 ^ i17822) | (i18222 & i17822))) | (~((i16 ^ 31) | (i16 & 31)))) * (-950)) + i18122) - (~(-(-(((~((i17822 & i16) | (i17822 ^ i16))) | (~((i30 ^ 31) | (i30 & 31)))) * 950))))) - 1;
                            Object[] objArr3322 = new Object[1];
                            delta(packedPositionType32, i17722, i18322, objArr3322);
                            String str2722 = (String) objArr3322[0];
                            char keyCodeFromString52 = (char) (16300 - KeyEvent.keyCodeFromString(str12));
                            int indexOf522 = TextUtils.indexOf((CharSequence) str12, '0');
                            int i18422 = (indexOf522 & 263) + (indexOf522 | 263);
                            int i18522 = -(-AndroidCharacter.getMirror('0'));
                            int i18622 = ((i18522 | (-25)) << 1) - (i18522 ^ (-25));
                            Object[] objArr3422 = new Object[1];
                            delta(keyCodeFromString52, i18422, i18622, objArr3422);
                            String str2822 = (String) objArr3422[0];
                            char absoluteGravity62 = (char) Gravity.getAbsoluteGravity(0, 0);
                            int i18722 = 284 - (~(ViewConfiguration.getLongPressTimeout() >> 16));
                            int i18822 = -(Process.myTid() >> 22);
                            Object[] objArr3522 = new Object[1];
                            delta(absoluteGravity62, i18722, ((i18822 | 28) << 1) - (i18822 ^ 28), objArr3522);
                            String str2922 = (String) objArr3522[0];
                            char fadingEdgeLength222 = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 64455);
                            int edgeSlop52 = ViewConfiguration.getEdgeSlop() >> 16;
                            i32 = 1;
                            int resolveSizeAndState92 = View.resolveSizeAndState(0, 0, 0);
                            c4 = 0;
                            Object[] objArr3622 = new Object[1];
                            delta(fadingEdgeLength222, ((edgeSlop52 | 313) << 1) - (edgeSlop52 ^ 313), (resolveSizeAndState92 & 14) + (resolveSizeAndState92 | 14), objArr3622);
                            strArr = new String[]{str2722, str2822, str2922, (String) objArr3622[0]};
                            i33 = 0;
                            i34 = i20;
                            while (true) {
                                if (i33 < i34) {
                                }
                                i33 = (i33 & 1) + (i33 | 1);
                                strArr = strArr10;
                                j6 = j7;
                                i34 = 4;
                                i32 = 1;
                                c4 = 0;
                            }
                            int i19322 = (~(i16 & i17622)) & (i16 | i17622);
                            int i19422 = (i19322 | (-i19322)) >> 31;
                            int i19522 = (i35 & (~i19422)) | (i17622 & i19422);
                            int indexOf622 = TextUtils.indexOf((CharSequence) str12, '0', 0);
                            Object[] objArr3922 = new Object[1];
                            delta((char) ((indexOf622 & 1) + (indexOf622 | 1)), 326 - (~(-(-Color.red(0)))), Color.alpha(0) + 13, objArr3922);
                            Object[] objArr4022 = {(String) objArr3922[0]};
                            D88712 = uH18377.D8871(-957097391);
                            if (D88712 == null) {
                            }
                            str14 = (String) ((Method) D88712).invoke(null, objArr4022);
                            if (str14 != null) {
                            }
                            i36 = i16;
                            int i203222 = i16 ^ i19522;
                            int i204222 = -i203222;
                            int i205222 = ((i203222 & i204222) | (i203222 ^ i204222)) >> 31;
                            int i206222 = i36 & (~i205222);
                            int i207222 = i19522 & i205222;
                            int i208222 = (i207222 & i206222) | (i206222 ^ i207222);
                            char c21222 = (char) (64292 - (~(-TextUtils.indexOf(str12, str12))));
                            int trimmedLength222 = TextUtils.getTrimmedLength(str12) + 349;
                            int i209222 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int i210222 = ((i209222 | 18) << 1) - (i209222 ^ 18);
                            Object[] objArr43222 = new Object[1];
                            delta(c21222, trimmedLength222, i210222, objArr43222);
                            String str30222 = (String) objArr43222[0];
                            char edgeSlop2222 = (char) (32015 - (ViewConfiguration.getEdgeSlop() >> 16));
                            int i211222 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int i212222 = (i211222 ^ 366) + ((i211222 & 366) << 1);
                            int packedPositionType2222 = ExpandableListView.getPackedPositionType(0L);
                            int i213222 = (packedPositionType2222 ^ 6) + ((packedPositionType2222 & 6) << 1);
                            Object[] objArr44222 = new Object[1];
                            delta(edgeSlop2222, i212222, i213222, objArr44222);
                            String str31222 = (String) objArr44222[0];
                            file2 = new File(str30222);
                            if (file2.exists()) {
                            }
                            z11 = false;
                            if (!z11) {
                            }
                            int i2202222 = ((~i208222) & i16) | (i208222 & i30);
                            int i2212222 = -i2202222;
                            int i2222222 = ((i2202222 & i2212222) | (i2202222 ^ i2212222)) >> 31;
                            int i2232222 = i219 & (~i2222222);
                            int i2242222 = i208222 & i2222222;
                            int i2252222 = (i2242222 & i2232222) | (i2232222 ^ i2242222);
                            char c222222 = (char) (29293 - (~(-Color.green(0))));
                            int i2262222 = 371 - (~View.resolveSizeAndState(0, 0, 0));
                            int i2272222 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            int i2282222 = ((i2272222 | 22) << 1) - (i2272222 ^ 22);
                            Object[] objArr462222 = new Object[1];
                            delta(c222222, i2262222, i2282222, objArr462222);
                            Object[] objArr472222 = {(String) objArr462222[0]};
                            D88713 = uH18377.D8871(-957097391);
                            if (D88713 == null) {
                            }
                            String lowerCase2222 = ((String) ((Method) D88713).invoke(null, objArr472222)).toLowerCase();
                            char touchSlop22222 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                            int i2292222 = -(-TextUtils.lastIndexOf(str12, '0'));
                            int i2302222 = ((i2292222 | 396) << 1) - (i2292222 ^ 396);
                            int indexOf72222 = TextUtils.indexOf((CharSequence) str12, '0');
                            int i2312222 = (indexOf72222 & 5) + (indexOf72222 | 5);
                            Object[] objArr492222 = new Object[1];
                            delta(touchSlop22222, i2302222, i2312222, objArr492222);
                            if (lowerCase2222.contains((String) objArr492222[0])) {
                            }
                            int i2332222 = ((~i2252222) & i16) | (i2252222 & i30);
                            int i2342222 = -i2332222;
                            int i2352222 = ((i2332222 & i2342222) | (i2332222 ^ i2342222)) >> 31;
                            int i2362222 = i232 & (~i2352222);
                            int i2372222 = i2252222 & i2352222;
                            i37 = (i2372222 & i2362222) | (i2362222 ^ i2372222);
                            char doubleTapTimeout32222 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int i2382222 = 400 - (ViewConfiguration.getScrollFriction() > f5 ? 1 : (ViewConfiguration.getScrollFriction() == f5 ? 0 : -1));
                            int i2392222 = -(TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1));
                            int i2402222 = (i2392222 & 42) + (i2392222 | 42);
                            Object[] objArr502222 = new Object[1];
                            delta(doubleTapTimeout32222, i2382222, i2402222, objArr502222);
                            String str322222 = (String) objArr502222[0];
                            char scrollDefaultDelay6222 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int i2412222 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            int i2422222 = (i2412222 & 441) + (i2412222 | 441);
                            int i2432222 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                            int i2442222 = (i2432222 ^ 40) + ((i2432222 & 40) << 1);
                            Object[] objArr512222 = new Object[1];
                            delta(scrollDefaultDelay6222, i2422222, i2442222, objArr512222);
                            String str332222 = (String) objArr512222[0];
                            int i2452222 = -(-Color.rgb(0, 0, 0));
                            Object[] objArr522222 = new Object[1];
                            delta((char) ((i2452222 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) + (i2452222 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 481, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 26, objArr522222);
                            String str342222 = (String) objArr522222[0];
                            int i2462222 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i2472222 = (i2462222 * (-1939)) + 14416437;
                            int i2482222 = ~((-14848) | i2462222);
                            int i2492222 = ~(i18222 | 14847);
                            int i2502222 = ((i2482222 & i2492222) | (i2482222 ^ i2492222)) * (-970);
                            int i2512222 = (i2472222 ^ i2502222) + ((i2472222 & i2502222) << 1);
                            int i2522222 = ~i2462222;
                            int i2532222 = ((~((i2522222 & 14847) | (i2522222 ^ 14847))) * 1940) + i2512222;
                            int i2542222 = ~i2462222;
                            int i2552222 = ~((i2542222 & (-14848)) | (i2542222 ^ (-14848)));
                            int i2562222 = ~((i30 ^ 14847) | (i30 & 14847));
                            int i2572222 = ((i2552222 & i2562222) | (i2552222 ^ i2562222)) * 970;
                            char c232222 = (char) ((i2532222 & i2572222) + (i2572222 | i2532222));
                            int myTid6222 = (Process.myTid() >> 22) + 508;
                            int argb22222 = Color.argb(0, 0, 0, 0);
                            int i2582222 = (argb22222 ^ 27) + ((argb22222 & 27) << 1);
                            Object[] objArr532222 = new Object[1];
                            delta(c232222, myTid6222, i2582222, objArr532222);
                            String str352222 = (String) objArr532222[0];
                            float f112222 = f5;
                            char c242222 = (char) (TypedValue.complexToFraction(0, f112222, f112222) > f112222 ? 1 : (TypedValue.complexToFraction(0, f112222, f112222) == f112222 ? 0 : -1));
                            int i2592222 = -(-Color.rgb(0, 0, 0));
                            int i2602222 = (i2592222 & 16777751) + (i2592222 | 16777751);
                            int i2612222 = -(AudioTrack.getMaxVolume() > f112222 ? 1 : (AudioTrack.getMaxVolume() == f112222 ? 0 : -1));
                            i38 = 1;
                            int i2622222 = ((i2612222 | 28) << 1) - (i2612222 ^ 28);
                            Object[] objArr542222 = new Object[1];
                            delta(c242222, i2602222, i2622222, objArr542222);
                            String str362222 = (String) objArr542222[0];
                            int bitsPerPixel22222 = ImageFormat.getBitsPerPixel(0);
                            int i2632222 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                            c10 = 0;
                            Object[] objArr552222 = new Object[1];
                            delta((char) ((bitsPerPixel22222 & 1) + (bitsPerPixel22222 | 1)), (i2632222 ^ 562) + ((i2632222 & 562) << 1), 27 - KeyEvent.normalizeMetaState(0), objArr552222);
                            String[] strArr132222 = {str322222, str332222, str342222, str352222, str362222, (String) objArr552222[0]};
                            i39 = 0;
                            i40 = i25;
                            while (true) {
                                if (i39 < i40) {
                                }
                                int i2642222 = i39 - 123;
                                i39 = (i2642222 | 124) + (i2642222 & 124);
                                i37 = i41;
                                i40 = 6;
                                i38 = 1;
                                c10 = 0;
                            }
                            int i2652222 = i16 ^ i41;
                            int i2662222 = -i2652222;
                            int i2672222 = ((i2652222 & i2662222) | (i2652222 ^ i2662222)) >> 31;
                            int i2682222 = i42 & (~i2672222);
                            int i2692222 = i41 & i2672222;
                            int i2702222 = (i2682222 & i2692222) | (i2682222 ^ i2692222);
                            char c252222 = (char) (64292 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8))));
                            int i2712222 = -(-View.resolveSizeAndState(0, 0, 0));
                            Object[] objArr582222 = new Object[1];
                            delta(c252222, (i2712222 ^ 349) + ((i2712222 & 349) << 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 17, objArr582222);
                            String str382222 = (String) objArr582222[0];
                            char keyRepeatDelay4222 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i2722222 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                            int i2732222 = (i2722222 ^ 589) + ((i2722222 & 589) << 1);
                            int i2742222 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                            int i2752222 = (i2742222 & 5) + (i2742222 | 5);
                            Object[] objArr592222 = new Object[1];
                            delta(keyRepeatDelay4222, i2732222, i2752222, objArr592222);
                            Object[] objArr602222 = new Object[i21];
                            objArr602222[1] = (String) objArr592222[0];
                            objArr602222[0] = str382222;
                            D88714 = uH18377.D8871(1214576837);
                            if (D88714 == null) {
                            }
                            long longValue72222 = ((Long) ((Method) D88714).invoke(null, objArr602222)).longValue();
                            long j572222 = -125671674;
                            long j582222 = ((-1917) * longValue72222) + (960 * j572222);
                            long j592222 = 959;
                            long j602222 = longValue72222 ^ j38;
                            long j612222 = ((j592222 * (((j602222 | j7) ^ j38) | ((j482 | j572222) ^ j38))) + (((-959) * j602222) + (((((j602222 | j482) ^ j38) | ((j572222 | j7) ^ j38)) * j592222) + j582222))) - 1421966664;
                            int i2772222 = (int) Runtime.getRuntime().totalMemory();
                            int i2782222 = ~i2772222;
                            i43 = ((int) (j612222 >> c3)) & ((((~(i2772222 | (-886104706))) | 550527489 | (~(i2782222 | 886698921))) * 988) + (((~((-335577217) | i2782222)) | (~(886698921 | i2772222))) * 988) + 2024312806);
                            i44 = ((int) j612222) & ((((~((-85328001) | i16)) | (~((-537462802) | i30)) | (~((-1522554411) | i16))) * 192) + (((~((-622790802) | i30)) | 85328000) * (-384)) + (((-2145345212) | i30) * (-192)) + 1788176917);
                            if (((i43 & i44) | (i43 ^ i44)) != 0) {
                            }
                            i45 = i46 | i47;
                            int i313222222 = (~(i16 & i2702222)) & (i16 | i2702222);
                            int i314222222 = -i313222222;
                            int i315222222 = ((i313222222 & i314222222) | (i313222222 ^ i314222222)) >> 31;
                            int i316222222 = i45 & (~i315222222);
                            int i317222222 = i2702222 & i315222222;
                            i48 = (i317222222 & i316222222) | (i316222222 ^ i317222222);
                            if ((i17 & 8) == 0) {
                            }
                            int i353222222 = 739 - (~(-(-TextUtils.indexOf((CharSequence) str12, '0', 0))));
                            int longPressTimeout3222222 = ViewConfiguration.getLongPressTimeout() >> 16;
                            int i354222222 = (longPressTimeout3222222 & 41) + (longPressTimeout3222222 | 41);
                            Object[] objArr70222222 = new Object[1];
                            delta((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), i353222222, i354222222, objArr70222222);
                            c11 = 0;
                            String str44222222 = (String) objArr70222222[0];
                            char indexOf8222222 = (char) TextUtils.indexOf(str12, str12, 0, 0);
                            int i355222222 = 779 - (~(-(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))));
                            int i356222222 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                            int i357222222 = (i356222222 & 30) + (i356222222 | 30);
                            i49 = 1;
                            Object[] objArr71222222 = new Object[1];
                            delta(indexOf8222222, i355222222, i357222222, objArr71222222);
                            String[] strArr15222222 = {str44222222, (String) objArr71222222[0]};
                            i50 = 0;
                            while (true) {
                                if (i50 < 2) {
                                }
                                i50 = ((i50 & 1) << 1) + (i50 ^ 1);
                                i48 = i51;
                                c11 = 0;
                                i49 = 1;
                            }
                            int i362222222 = i16 ^ i51;
                            int i363222222 = -i362222222;
                            int i364222222 = ((i362222222 & i363222222) | (i362222222 ^ i363222222)) >> 31;
                            int i365222222 = i52 & (~i364222222);
                            int i366222222 = i51 & i364222222;
                            int i367222222 = (i365222222 & i366222222) | (i365222222 ^ i366222222);
                            D88715 = uH18377.D8871(-344556366);
                            if (D88715 == null) {
                            }
                            long longValue10222222 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
                            long j75222222 = 1478172722;
                            long j76222222 = 495;
                            long j77222222 = -493;
                            long j78222222 = (j77222222 * longValue10222222) + (j76222222 * j75222222);
                            long j79222222 = -988;
                            long j80222222 = longValue10222222 ^ j38;
                            long j81222222 = 494;
                            long j82222222 = j75222222 ^ j38;
                            long j83222222 = ((((((j82222222 | j80222222) ^ j38) | ((j482 | longValue10222222) ^ j38)) | ((j75222222 | longValue10222222) ^ j38)) * j81222222) + ((((longValue10222222 | j82222222) | j482) * j81222222) + (((j75222222 | j80222222) * j79222222) + j78222222))) - 1630425820;
                            i53 = ((int) (j83222222 >> c3)) & (((1005187049 | i16) * 220) + ((1002991073 | (~(434235337 | i30))) * (-440)) + (((~(1005187049 | i30)) | 432039361) * 220) + 2009436746);
                            int i369222222 = (int) j83222222;
                            int myPid5222222 = Process.myPid();
                            foxtrot = A0.z.foxtrot((~((~myPid5222222) | (-302318977))) | (-2147475419), 576, (((~((-506283993) | myPid5222222)) | 203965016) * 576) + 1771465493, 1519732224) & i369222222;
                            if (((foxtrot & i53) | (i53 ^ foxtrot)) == 1) {
                            }
                            int[] iArr2222222 = new int[1];
                            int i814222222 = ((~i54) & i16) | (i54 & i30);
                            int i815222222 = -i814222222;
                            Object[] objArr194222222 = {new int[]{i54}, new int[]{i16}, iArr2222222, strArr2};
                            int i816222222 = (((~((-211101401) | i30)) | (~(i16 | 578269930))) * 627) + (((~(211101400 | i16)) | 578269930) * (-627)) + ((((-1385161) | i16) * (-627)) - 1346397772);
                            int i817222222 = -(-((((i814222222 & i815222222) | (i814222222 ^ i815222222)) >> 31) & 16));
                            int i818222222 = -(-((i816222222 & i817222222) + (i816222222 | i817222222)));
                            int i819222222 = ((i18 | i818222222) << 1) - (i18 ^ i818222222);
                            int i820222222 = i819222222 << 13;
                            int i821222222 = (i820222222 | i819222222) & (~(i819222222 & i820222222));
                            int i822222222 = i821222222 >>> 17;
                            int i823222222 = (i821222222 | i822222222) & (~(i821222222 & i822222222));
                            int i824222222 = i823222222 << 5;
                            iArr2222222[0] = ((~i823222222) & i824222222) | ((~i824222222) & i823222222);
                            return objArr194222222;
                        }
                        silver = (teal + 81) % 128;
                        i28 = i16 & (-268);
                        i29 = (~i16) & 267;
                    }
                    i27 = i28 | i29;
                    int i13822 = (~i128) & i16;
                    i30 = ~i16;
                    int i13922 = i13822 | (i128 & i30);
                    int i14022 = -i13922;
                    int i14122 = ((i13922 & i14022) | (i13922 ^ i14022)) >> 31;
                    int i14222 = i27 & (~i14122);
                    int i14322 = i128 & i14122;
                    int i14422 = (i14322 & i14222) | (i14222 ^ i14322);
                    D8871 = uH18377.D8871(1074526551);
                    if (D8871 == null) {
                    }
                    long longValue522 = ((Long) ((Method) D8871).invoke(null, null)).longValue();
                    long j4322 = -1967520600;
                    long j4422 = (989 * longValue522) + ((-1975) * j4322);
                    long j4522 = 988;
                    j6 = i16;
                    long j4622 = ((j4322 ^ j38) | longValue522) ^ j38;
                    long j4722 = longValue522 ^ j38;
                    long j4822 = j6 ^ j38;
                    long j4922 = (j4522 * (j4622 | ((j4722 | j6) ^ j38) | ((j4822 | longValue522) ^ j38))) + ((-1976) * (((j4722 | j4322) ^ j38) | ((j4822 | j4322) ^ j38))) + ((j6 | j4622) * j4522) + j4422 + 2147086317;
                    int i14522 = ((int) (j4922 >> c3)) & ((((-75502689) | i16) * 220) + (((~((-629183601) | i30)) | 2066410011) * (-440)) + (((~((-75502689) | i30)) | 1512729099) * 220) + 1762334202);
                    int uptimeMillis222 = ((int) j4922) & (((((int) SystemClock.uptimeMillis()) | (-77770851)) * 591) + ((((~((-77770851) | (~r8))) | 1514997260) * (-591)) - 709110634));
                    int i14622 = (i14522 & uptimeMillis222) | (i14522 ^ uptimeMillis222);
                    int i14722 = i14622 - 1;
                    int i14822 = (i14722 ^ 200) + ((i14722 & 200) << 1);
                    int i14922 = ((~i14822) & i16) | (i14822 & i30);
                    int i15022 = -i14622;
                    int i15122 = ((i14622 & i15022) | (i14622 ^ i15022)) >> 31;
                    int i15222 = (~i15122) & i16;
                    int i15322 = i15122 & i14922;
                    int i15422 = (i15322 & i15222) | (i15222 ^ i15322);
                    int i15522 = i16 ^ i14422;
                    int i15622 = -i15522;
                    int i15722 = ((i15522 & i15622) | (i15522 ^ i15622)) >> 31;
                    int i15822 = i15422 & (~i15722);
                    int i15922 = i14422 & i15722;
                    int i16022 = (i15922 & i15822) | (i15822 ^ i15922);
                    char c2022 = (char) (61633 - (~(-(-ExpandableListView.getPackedPositionGroup(0L)))));
                    int i16122 = 201 - (~(ViewConfiguration.getScrollFriction() > f5 ? 1 : (ViewConfiguration.getScrollFriction() == f5 ? 0 : -1)));
                    int i16222 = -KeyEvent.keyCodeFromString(str12);
                    int i16322 = ((i16222 | 20) << 1) - (i16222 ^ 20);
                    Object[] objArr3022 = new Object[1];
                    delta(c2022, i16122, i16322, objArr3022);
                    String str2622 = (String) objArr3022[0];
                    int i16422 = -Process.getGidForName(str12);
                    Object[] objArr3122 = new Object[1];
                    delta((char) ((i16422 ^ 7672) + ((i16422 & 7672) << 1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 223, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6, objArr3122);
                    str13 = (String) objArr3122[0];
                    file = new File(str2622);
                    if (file.exists()) {
                    }
                    i31 = 0;
                    int i166222 = -i31;
                    int i167222 = ((i31 & i166222) | (i31 ^ i166222)) >> 31;
                    int i168222 = (~i167222) & i16;
                    int i169222 = i167222 & (i16 ^ 262);
                    int i170222 = (i169222 & i168222) | (i168222 ^ i169222);
                    int i171222 = (~(i16 & i16022)) & (i16 | i16022);
                    int i172222 = -i171222;
                    int i173222 = ((i171222 & i172222) | (i171222 ^ i172222)) >> 31;
                    int i174222 = i170222 & (~i173222);
                    int i175222 = i16022 & i173222;
                    int i176222 = (i175222 & i174222) | (i174222 ^ i175222);
                    char packedPositionType322 = (char) ExpandableListView.getPackedPositionType(0L);
                    int i177222 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 230;
                    int i178222 = -(ViewConfiguration.getTouchSlop() >> 8);
                    int i179222 = ~(((-32) & i30) | ((-32) ^ i30));
                    int i180222 = ~((~i178222) | i16);
                    int i181222 = (((i178222 * (-949)) - 29419) - (~(-(-(((i179222 & i180222) | (i179222 ^ i180222)) * 1900))))) - 1;
                    int i182222 = ~i16;
                    int i183222 = (((((~((i182222 ^ i178222) | (i182222 & i178222))) | (~((i16 ^ 31) | (i16 & 31)))) * (-950)) + i181222) - (~(-(-(((~((i178222 & i16) | (i178222 ^ i16))) | (~((i30 ^ 31) | (i30 & 31)))) * 950))))) - 1;
                    Object[] objArr33222 = new Object[1];
                    delta(packedPositionType322, i177222, i183222, objArr33222);
                    String str27222 = (String) objArr33222[0];
                    char keyCodeFromString522 = (char) (16300 - KeyEvent.keyCodeFromString(str12));
                    int indexOf5222 = TextUtils.indexOf((CharSequence) str12, '0');
                    int i184222 = (indexOf5222 & 263) + (indexOf5222 | 263);
                    int i185222 = -(-AndroidCharacter.getMirror('0'));
                    int i186222 = ((i185222 | (-25)) << 1) - (i185222 ^ (-25));
                    Object[] objArr34222 = new Object[1];
                    delta(keyCodeFromString522, i184222, i186222, objArr34222);
                    String str28222 = (String) objArr34222[0];
                    char absoluteGravity622 = (char) Gravity.getAbsoluteGravity(0, 0);
                    int i187222 = 284 - (~(ViewConfiguration.getLongPressTimeout() >> 16));
                    int i188222 = -(Process.myTid() >> 22);
                    Object[] objArr35222 = new Object[1];
                    delta(absoluteGravity622, i187222, ((i188222 | 28) << 1) - (i188222 ^ 28), objArr35222);
                    String str29222 = (String) objArr35222[0];
                    char fadingEdgeLength2222 = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 64455);
                    int edgeSlop522 = ViewConfiguration.getEdgeSlop() >> 16;
                    i32 = 1;
                    int resolveSizeAndState922 = View.resolveSizeAndState(0, 0, 0);
                    c4 = 0;
                    Object[] objArr36222 = new Object[1];
                    delta(fadingEdgeLength2222, ((edgeSlop522 | 313) << 1) - (edgeSlop522 ^ 313), (resolveSizeAndState922 & 14) + (resolveSizeAndState922 | 14), objArr36222);
                    strArr = new String[]{str27222, str28222, str29222, (String) objArr36222[0]};
                    i33 = 0;
                    i34 = i20;
                    while (true) {
                        if (i33 < i34) {
                        }
                        i33 = (i33 & 1) + (i33 | 1);
                        strArr = strArr10;
                        j6 = j7;
                        i34 = 4;
                        i32 = 1;
                        c4 = 0;
                    }
                    int i193222 = (~(i16 & i176222)) & (i16 | i176222);
                    int i194222 = (i193222 | (-i193222)) >> 31;
                    int i195222 = (i35 & (~i194222)) | (i176222 & i194222);
                    int indexOf6222 = TextUtils.indexOf((CharSequence) str12, '0', 0);
                    Object[] objArr39222 = new Object[1];
                    delta((char) ((indexOf6222 & 1) + (indexOf6222 | 1)), 326 - (~(-(-Color.red(0)))), Color.alpha(0) + 13, objArr39222);
                    Object[] objArr40222 = {(String) objArr39222[0]};
                    D88712 = uH18377.D8871(-957097391);
                    if (D88712 == null) {
                    }
                    str14 = (String) ((Method) D88712).invoke(null, objArr40222);
                    if (str14 != null) {
                    }
                    i36 = i16;
                    int i2032222 = i16 ^ i195222;
                    int i2042222 = -i2032222;
                    int i2052222 = ((i2032222 & i2042222) | (i2032222 ^ i2042222)) >> 31;
                    int i2062222 = i36 & (~i2052222);
                    int i2072222 = i195222 & i2052222;
                    int i2082222 = (i2072222 & i2062222) | (i2062222 ^ i2072222);
                    char c212222 = (char) (64292 - (~(-TextUtils.indexOf(str12, str12))));
                    int trimmedLength2222 = TextUtils.getTrimmedLength(str12) + 349;
                    int i2092222 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i2102222 = ((i2092222 | 18) << 1) - (i2092222 ^ 18);
                    Object[] objArr432222 = new Object[1];
                    delta(c212222, trimmedLength2222, i2102222, objArr432222);
                    String str302222 = (String) objArr432222[0];
                    char edgeSlop22222 = (char) (32015 - (ViewConfiguration.getEdgeSlop() >> 16));
                    int i2112222 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i2122222 = (i2112222 ^ 366) + ((i2112222 & 366) << 1);
                    int packedPositionType22222 = ExpandableListView.getPackedPositionType(0L);
                    int i2132222 = (packedPositionType22222 ^ 6) + ((packedPositionType22222 & 6) << 1);
                    Object[] objArr442222 = new Object[1];
                    delta(edgeSlop22222, i2122222, i2132222, objArr442222);
                    String str312222 = (String) objArr442222[0];
                    file2 = new File(str302222);
                    if (file2.exists()) {
                    }
                    z11 = false;
                    if (!z11) {
                    }
                    int i22022222 = ((~i2082222) & i16) | (i2082222 & i30);
                    int i22122222 = -i22022222;
                    int i22222222 = ((i22022222 & i22122222) | (i22022222 ^ i22122222)) >> 31;
                    int i22322222 = i219 & (~i22222222);
                    int i22422222 = i2082222 & i22222222;
                    int i22522222 = (i22422222 & i22322222) | (i22322222 ^ i22422222);
                    char c2222222 = (char) (29293 - (~(-Color.green(0))));
                    int i22622222 = 371 - (~View.resolveSizeAndState(0, 0, 0));
                    int i22722222 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int i22822222 = ((i22722222 | 22) << 1) - (i22722222 ^ 22);
                    Object[] objArr4622222 = new Object[1];
                    delta(c2222222, i22622222, i22822222, objArr4622222);
                    Object[] objArr4722222 = {(String) objArr4622222[0]};
                    D88713 = uH18377.D8871(-957097391);
                    if (D88713 == null) {
                    }
                    String lowerCase22222 = ((String) ((Method) D88713).invoke(null, objArr4722222)).toLowerCase();
                    char touchSlop222222 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int i22922222 = -(-TextUtils.lastIndexOf(str12, '0'));
                    int i23022222 = ((i22922222 | 396) << 1) - (i22922222 ^ 396);
                    int indexOf722222 = TextUtils.indexOf((CharSequence) str12, '0');
                    int i23122222 = (indexOf722222 & 5) + (indexOf722222 | 5);
                    Object[] objArr4922222 = new Object[1];
                    delta(touchSlop222222, i23022222, i23122222, objArr4922222);
                    if (lowerCase22222.contains((String) objArr4922222[0])) {
                    }
                    int i23322222 = ((~i22522222) & i16) | (i22522222 & i30);
                    int i23422222 = -i23322222;
                    int i23522222 = ((i23322222 & i23422222) | (i23322222 ^ i23422222)) >> 31;
                    int i23622222 = i232 & (~i23522222);
                    int i23722222 = i22522222 & i23522222;
                    i37 = (i23722222 & i23622222) | (i23622222 ^ i23722222);
                    char doubleTapTimeout322222 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int i23822222 = 400 - (ViewConfiguration.getScrollFriction() > f5 ? 1 : (ViewConfiguration.getScrollFriction() == f5 ? 0 : -1));
                    int i23922222 = -(TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1));
                    int i24022222 = (i23922222 & 42) + (i23922222 | 42);
                    Object[] objArr5022222 = new Object[1];
                    delta(doubleTapTimeout322222, i23822222, i24022222, objArr5022222);
                    String str3222222 = (String) objArr5022222[0];
                    char scrollDefaultDelay62222 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int i24122222 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int i24222222 = (i24122222 & 441) + (i24122222 | 441);
                    int i24322222 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i24422222 = (i24322222 ^ 40) + ((i24322222 & 40) << 1);
                    Object[] objArr5122222 = new Object[1];
                    delta(scrollDefaultDelay62222, i24222222, i24422222, objArr5122222);
                    String str3322222 = (String) objArr5122222[0];
                    int i24522222 = -(-Color.rgb(0, 0, 0));
                    Object[] objArr5222222 = new Object[1];
                    delta((char) ((i24522222 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) + (i24522222 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 481, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 26, objArr5222222);
                    String str3422222 = (String) objArr5222222[0];
                    int i24622222 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int i24722222 = (i24622222 * (-1939)) + 14416437;
                    int i24822222 = ~((-14848) | i24622222);
                    int i24922222 = ~(i182222 | 14847);
                    int i25022222 = ((i24822222 & i24922222) | (i24822222 ^ i24922222)) * (-970);
                    int i25122222 = (i24722222 ^ i25022222) + ((i24722222 & i25022222) << 1);
                    int i25222222 = ~i24622222;
                    int i25322222 = ((~((i25222222 & 14847) | (i25222222 ^ 14847))) * 1940) + i25122222;
                    int i25422222 = ~i24622222;
                    int i25522222 = ~((i25422222 & (-14848)) | (i25422222 ^ (-14848)));
                    int i25622222 = ~((i30 ^ 14847) | (i30 & 14847));
                    int i25722222 = ((i25522222 & i25622222) | (i25522222 ^ i25622222)) * 970;
                    char c2322222 = (char) ((i25322222 & i25722222) + (i25722222 | i25322222));
                    int myTid62222 = (Process.myTid() >> 22) + 508;
                    int argb222222 = Color.argb(0, 0, 0, 0);
                    int i25822222 = (argb222222 ^ 27) + ((argb222222 & 27) << 1);
                    Object[] objArr5322222 = new Object[1];
                    delta(c2322222, myTid62222, i25822222, objArr5322222);
                    String str3522222 = (String) objArr5322222[0];
                    float f1122222 = f5;
                    char c2422222 = (char) (TypedValue.complexToFraction(0, f1122222, f1122222) > f1122222 ? 1 : (TypedValue.complexToFraction(0, f1122222, f1122222) == f1122222 ? 0 : -1));
                    int i25922222 = -(-Color.rgb(0, 0, 0));
                    int i26022222 = (i25922222 & 16777751) + (i25922222 | 16777751);
                    int i26122222 = -(AudioTrack.getMaxVolume() > f1122222 ? 1 : (AudioTrack.getMaxVolume() == f1122222 ? 0 : -1));
                    i38 = 1;
                    int i26222222 = ((i26122222 | 28) << 1) - (i26122222 ^ 28);
                    Object[] objArr5422222 = new Object[1];
                    delta(c2422222, i26022222, i26222222, objArr5422222);
                    String str3622222 = (String) objArr5422222[0];
                    int bitsPerPixel222222 = ImageFormat.getBitsPerPixel(0);
                    int i26322222 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                    c10 = 0;
                    Object[] objArr5522222 = new Object[1];
                    delta((char) ((bitsPerPixel222222 & 1) + (bitsPerPixel222222 | 1)), (i26322222 ^ 562) + ((i26322222 & 562) << 1), 27 - KeyEvent.normalizeMetaState(0), objArr5522222);
                    String[] strArr1322222 = {str3222222, str3322222, str3422222, str3522222, str3622222, (String) objArr5522222[0]};
                    i39 = 0;
                    i40 = i25;
                    while (true) {
                        if (i39 < i40) {
                        }
                        int i26422222 = i39 - 123;
                        i39 = (i26422222 | 124) + (i26422222 & 124);
                        i37 = i41;
                        i40 = 6;
                        i38 = 1;
                        c10 = 0;
                    }
                    int i26522222 = i16 ^ i41;
                    int i26622222 = -i26522222;
                    int i26722222 = ((i26522222 & i26622222) | (i26522222 ^ i26622222)) >> 31;
                    int i26822222 = i42 & (~i26722222);
                    int i26922222 = i41 & i26722222;
                    int i27022222 = (i26822222 & i26922222) | (i26822222 ^ i26922222);
                    char c2522222 = (char) (64292 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8))));
                    int i27122222 = -(-View.resolveSizeAndState(0, 0, 0));
                    Object[] objArr5822222 = new Object[1];
                    delta(c2522222, (i27122222 ^ 349) + ((i27122222 & 349) << 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 17, objArr5822222);
                    String str3822222 = (String) objArr5822222[0];
                    char keyRepeatDelay42222 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i27222222 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int i27322222 = (i27222222 ^ 589) + ((i27222222 & 589) << 1);
                    int i27422222 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    int i27522222 = (i27422222 & 5) + (i27422222 | 5);
                    Object[] objArr5922222 = new Object[1];
                    delta(keyRepeatDelay42222, i27322222, i27522222, objArr5922222);
                    Object[] objArr6022222 = new Object[i21];
                    objArr6022222[1] = (String) objArr5922222[0];
                    objArr6022222[0] = str3822222;
                    D88714 = uH18377.D8871(1214576837);
                    if (D88714 == null) {
                    }
                    long longValue722222 = ((Long) ((Method) D88714).invoke(null, objArr6022222)).longValue();
                    long j5722222 = -125671674;
                    long j5822222 = ((-1917) * longValue722222) + (960 * j5722222);
                    long j5922222 = 959;
                    long j6022222 = longValue722222 ^ j38;
                    long j6122222 = ((j5922222 * (((j6022222 | j7) ^ j38) | ((j4822 | j5722222) ^ j38))) + (((-959) * j6022222) + (((((j6022222 | j4822) ^ j38) | ((j5722222 | j7) ^ j38)) * j5922222) + j5822222))) - 1421966664;
                    int i27722222 = (int) Runtime.getRuntime().totalMemory();
                    int i27822222 = ~i27722222;
                    i43 = ((int) (j6122222 >> c3)) & ((((~(i27722222 | (-886104706))) | 550527489 | (~(i27822222 | 886698921))) * 988) + (((~((-335577217) | i27822222)) | (~(886698921 | i27722222))) * 988) + 2024312806);
                    i44 = ((int) j6122222) & ((((~((-85328001) | i16)) | (~((-537462802) | i30)) | (~((-1522554411) | i16))) * 192) + (((~((-622790802) | i30)) | 85328000) * (-384)) + (((-2145345212) | i30) * (-192)) + 1788176917);
                    if (((i43 & i44) | (i43 ^ i44)) != 0) {
                    }
                    i45 = i46 | i47;
                    int i3132222222 = (~(i16 & i27022222)) & (i16 | i27022222);
                    int i3142222222 = -i3132222222;
                    int i3152222222 = ((i3132222222 & i3142222222) | (i3132222222 ^ i3142222222)) >> 31;
                    int i3162222222 = i45 & (~i3152222222);
                    int i3172222222 = i27022222 & i3152222222;
                    i48 = (i3172222222 & i3162222222) | (i3162222222 ^ i3172222222);
                    if ((i17 & 8) == 0) {
                    }
                    int i3532222222 = 739 - (~(-(-TextUtils.indexOf((CharSequence) str12, '0', 0))));
                    int longPressTimeout32222222 = ViewConfiguration.getLongPressTimeout() >> 16;
                    int i3542222222 = (longPressTimeout32222222 & 41) + (longPressTimeout32222222 | 41);
                    Object[] objArr702222222 = new Object[1];
                    delta((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), i3532222222, i3542222222, objArr702222222);
                    c11 = 0;
                    String str442222222 = (String) objArr702222222[0];
                    char indexOf82222222 = (char) TextUtils.indexOf(str12, str12, 0, 0);
                    int i3552222222 = 779 - (~(-(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))));
                    int i3562222222 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                    int i3572222222 = (i3562222222 & 30) + (i3562222222 | 30);
                    i49 = 1;
                    Object[] objArr712222222 = new Object[1];
                    delta(indexOf82222222, i3552222222, i3572222222, objArr712222222);
                    String[] strArr152222222 = {str442222222, (String) objArr712222222[0]};
                    i50 = 0;
                    while (true) {
                        if (i50 < 2) {
                        }
                        i50 = ((i50 & 1) << 1) + (i50 ^ 1);
                        i48 = i51;
                        c11 = 0;
                        i49 = 1;
                    }
                    int i3622222222 = i16 ^ i51;
                    int i3632222222 = -i3622222222;
                    int i3642222222 = ((i3622222222 & i3632222222) | (i3622222222 ^ i3632222222)) >> 31;
                    int i3652222222 = i52 & (~i3642222222);
                    int i3662222222 = i51 & i3642222222;
                    int i3672222222 = (i3652222222 & i3662222222) | (i3652222222 ^ i3662222222);
                    D88715 = uH18377.D8871(-344556366);
                    if (D88715 == null) {
                    }
                    long longValue102222222 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
                    long j752222222 = 1478172722;
                    long j762222222 = 495;
                    long j772222222 = -493;
                    long j782222222 = (j772222222 * longValue102222222) + (j762222222 * j752222222);
                    long j792222222 = -988;
                    long j802222222 = longValue102222222 ^ j38;
                    long j812222222 = 494;
                    long j822222222 = j752222222 ^ j38;
                    long j832222222 = ((((((j822222222 | j802222222) ^ j38) | ((j4822 | longValue102222222) ^ j38)) | ((j752222222 | longValue102222222) ^ j38)) * j812222222) + ((((longValue102222222 | j822222222) | j4822) * j812222222) + (((j752222222 | j802222222) * j792222222) + j782222222))) - 1630425820;
                    i53 = ((int) (j832222222 >> c3)) & (((1005187049 | i16) * 220) + ((1002991073 | (~(434235337 | i30))) * (-440)) + (((~(1005187049 | i30)) | 432039361) * 220) + 2009436746);
                    int i3692222222 = (int) j832222222;
                    int myPid52222222 = Process.myPid();
                    foxtrot = A0.z.foxtrot((~((~myPid52222222) | (-302318977))) | (-2147475419), 576, (((~((-506283993) | myPid52222222)) | 203965016) * 576) + 1771465493, 1519732224) & i3692222222;
                    if (((foxtrot & i53) | (i53 ^ foxtrot)) == 1) {
                    }
                    int[] iArr22222222 = new int[1];
                    int i8142222222 = ((~i54) & i16) | (i54 & i30);
                    int i8152222222 = -i8142222222;
                    Object[] objArr1942222222 = {new int[]{i54}, new int[]{i16}, iArr22222222, strArr2};
                    int i8162222222 = (((~((-211101401) | i30)) | (~(i16 | 578269930))) * 627) + (((~(211101400 | i16)) | 578269930) * (-627)) + ((((-1385161) | i16) * (-627)) - 1346397772);
                    int i8172222222 = -(-((((i8142222222 & i8152222222) | (i8142222222 ^ i8152222222)) >> 31) & 16));
                    int i8182222222 = -(-((i8162222222 & i8172222222) + (i8162222222 | i8172222222)));
                    int i8192222222 = ((i18 | i8182222222) << 1) - (i18 ^ i8182222222);
                    int i8202222222 = i8192222222 << 13;
                    int i8212222222 = (i8202222222 | i8192222222) & (~(i8192222222 & i8202222222));
                    int i8222222222 = i8212222222 >>> 17;
                    int i8232222222 = (i8212222222 | i8222222222) & (~(i8212222222 & i8222222222));
                    int i8242222222 = i8232222222 << 5;
                    iArr22222222[0] = ((~i8232222222) & i8242222222) | ((~i8242222222) & i8232222222);
                    return objArr1942222222;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ TelephonyManager invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
                    int i16 = teal + 13;
                    silver = i16 % 128;
                    SafeWithTimeoutProContext safeWithTimeoutProContext2 = safeWithTimeoutProContext;
                    if (i16 % 2 == 0) {
                        TelephonyManager juliet = juliet(safeWithTimeoutProContext2);
                        silver = (teal + 85) % 128;
                        return juliet;
                    }
                    juliet(safeWithTimeoutProContext2);
                    throw null;
                }

                @Nullable
                public final TelephonyManager juliet(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
                    Object systemService;
                    int i16 = silver + 59;
                    teal = i16 % 128;
                    int i17 = i16 % 2;
                    Context context2 = context;
                    if (i17 == 0) {
                        systemService = context2.getSystemService("phone");
                        int i18 = 14 / 0;
                        if (!(systemService instanceof TelephonyManager)) {
                            return null;
                        }
                    } else {
                        systemService = context2.getSystemService("phone");
                        if (!(systemService instanceof TelephonyManager)) {
                            return null;
                        }
                    }
                    silver = (teal + 21) % 128;
                    return (TelephonyManager) systemService;
                }
            }, num, null};
            Boolean bool8 = Boolean.FALSE;
            Object echo8 = am.echo(-1815327613);
            telephonyManager2 = (TelephonyManager) component13.vD14832N6715((N14263A23323) ((Method) (echo8 == null ? am.charlie((char) (40619 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 52 - KeyEvent.normalizeMetaState(0), 222 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1707113179, "setPivotYN16904", new Class[]{cls5, cls4, cls4, cls3, cls2, cls}) : echo8)).invoke(null, objArr8), null);
        } else {
            telephonyManager2 = telephonyManager;
        }
        if ((i4 & 32768) != 0) {
            i12 = 32768;
            Object[] objArr9 = {0L, r12, r12, new g(context), num, null};
            Boolean bool9 = Boolean.FALSE;
            Object echo9 = am.echo(-1815327613);
            if (echo9 == null) {
                l10 = 0L;
                echo9 = am.charlie((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 40618), TextUtils.indexOf((CharSequence) "", '0', 0) + 53, View.MeasureSpec.getMode(0) + 222, -1707113179, "setPivotYN16904", new Class[]{cls5, cls4, cls4, cls3, cls2, cls});
            } else {
                l10 = 0L;
            }
            geocoder2 = (Geocoder) component13.vD14832N6715((N14263A23323) ((Method) echo9).invoke(null, objArr9), null);
        } else {
            i12 = 32768;
            l10 = 0L;
            geocoder2 = geocoder;
        }
        if ((i4 & 65536) != 0) {
            i13 = 65536;
            Object[] objArr10 = {l10, r13, r13, new c(context), num, null};
            Boolean bool10 = Boolean.FALSE;
            Object echo10 = am.echo(-1815327613);
            str8 = (String) component13.vD14832N6715((N14263A23323) ((Method) (echo10 == null ? am.charlie((char) (Color.rgb(0, 0, 0) + 16817835), 51 - TextUtils.lastIndexOf("", '0', 0, 0), 222 - TextUtils.indexOf("", "", 0), -1707113179, "setPivotYN16904", new Class[]{cls5, cls4, cls4, cls3, cls2, cls}) : echo10)).invoke(null, objArr10), null);
        } else {
            i13 = 65536;
            str8 = str3;
        }
        Object obj14 = (i4 & 131072) != 0 ? new Object() : interfaceC1276x;
        if ((i4 & 262144) != 0) {
            i14 = 131072;
            str9 = "2.14.0";
        } else {
            i14 = 131072;
            str9 = str4;
        }
        String vD14832N6715 = (i4 & 524288) != 0 ? P28427.C1109p0.echo.vD14832N6715() : str5;
        if ((i4 & 1048576) != 0) {
            str10 = str9;
            int i16 = Y0.charlie + 109;
            obj5 = obj14;
            Y0.delta = i16 % 128;
            if (i16 % 2 == 0) {
                throw null;
            }
            c1715g2 = Y0.bravo;
        } else {
            str10 = str9;
            obj5 = obj14;
            c1715g2 = c1715g;
        }
        Object obj15 = (i4 & 2097152) != 0 ? new Object() : w02;
        C1715g c1715g3 = c1715g2;
        if ((i4 & 4194304) != 0) {
            obj6 = obj15;
            c1200d22 = (C1200d2) av.alpha(new Object[]{context}, aq.D8871(), aq.D8871(), aq.D8871(), aq.D8871(), 1420279594, -1420279594);
        } else {
            obj6 = obj15;
            c1200d22 = c1200d2;
        }
        if ((i4 & 8388608) != 0) {
            contentResolver3 = contentResolver2;
            c1200d23 = c1200d22;
            C1244o2 c1244o2 = (C1244o2) av.alpha(new Object[]{context}, aq.D8871(), aq.D8871(), aq.D8871(), aq.D8871(), 283081823, -283081818);
            sensorManager3 = sensorManager2;
            C1227k1 c1227k1 = (C1227k1) av.alpha(new Object[]{context}, aq.D8871(), aq.D8871(), aq.D8871(), aq.D8871(), 1893414200, -1893414196);
            ?? obj16 = new Object();
            int i17 = av.bravo;
            c1248p22 = new C1248p2(c1244o2, c1227k1, obj16);
            int i18 = ((i17 | 71) << 1) - (i17 ^ 71);
            av.charlie = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 82 / 0;
            }
        } else {
            sensorManager3 = sensorManager2;
            contentResolver3 = contentResolver2;
            c1200d23 = c1200d22;
            c1248p22 = c1248p2;
        }
        G2 g22 = (i4 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? green : g2;
        P28427 p284272 = (i4 & 33554432) != 0 ? indigo : p28427;
        C1277x0 c1277x03 = (i4 & 67108864) != 0 ? new C1277x0(context, connectivityManager2) : c1277x0;
        Object obj17 = (i4 & 134217728) != 0 ? new Object() : a3Var;
        if ((i4 & 268435456) != 0) {
            Object echo11 = am.echo(-1435961106);
            if (echo11 == null) {
                obj7 = obj17;
                c1277x02 = c1277x03;
                echo11 = am.charlie((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 53 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 110 - Color.red(0), -1550110392, null, new Class[0]);
            } else {
                obj7 = obj17;
                c1277x02 = c1277x03;
            }
            obj8 = ((Constructor) echo11).newInstance(null);
        } else {
            obj7 = obj17;
            c1277x02 = c1277x03;
            obj8 = obj;
        }
        getAutofillType getautofilltype2 = (i4 & 536870912) != 0 ? new getAutofillType(context, locationManager2, geocoder2) : getautofilltype;
        U1 u14 = (i4 & 1073741824) != 0 ? new U1(context, locationManager2) : u12;
        d3 d3Var2 = (i4 & RecyclerView.UNDEFINED_DURATION) != 0 ? new d3(context) : d3Var;
        if ((i5 & 1) != 0) {
            u13 = u14;
            pc29222 = new pC2922(getautofilltype2, d3Var2);
        } else {
            u13 = u14;
            pc29222 = pc2922;
        }
        g3 g3Var3 = (i5 & 2) != 0 ? new g3(getautofilltype2, d3Var2, z10, j5) : g3Var;
        if ((i5 & 4) != 0) {
            g3Var2 = g3Var3;
            c1261t02 = new C1261t0(telephonyManager2);
        } else {
            g3Var2 = g3Var3;
            c1261t02 = c1261t0;
        }
        D0 azVar = (i5 & 8) != 0 ? new az(str8) : d02;
        K2 k23 = (i5 & 16) != 0 ? new K2() : k22;
        if ((i5 & 32) != 0) {
            c1261t03 = c1261t02;
            str11 = P28427.Z.echo.vD14832N6715();
        } else {
            c1261t03 = c1261t02;
            str11 = str6;
        }
        if ((i5 & 64) != 0) {
            pc29223 = pc29222;
            c1229l2 = new C1229l(azVar, str11, k23);
        } else {
            pc29223 = pc29222;
            c1229l2 = c1229l;
        }
        C1231l1 c1231l13 = (i5 & 128) != 0 ? new C1231l1(c1229l2) : c1231l1;
        if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
            Object echo12 = am.echo(473909140);
            obj9 = ((Constructor) (echo12 == null ? am.charlie((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 52, View.MeasureSpec.getSize(0), 365727282, null, new Class[0]) : echo12)).newInstance(null);
        } else {
            obj9 = obj2;
        }
        if ((i5 & 512) != 0) {
            Object D8871 = uH18377.D8871(-87023767);
            if (D8871 == null) {
                obj10 = obj9;
                D8871 = uH18377.setPivotYN16904(Color.blue(0) + 60, TextUtils.lastIndexOf("", '0') + 528, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 627817916, false, null, new Class[0]);
            } else {
                obj10 = obj9;
            }
            obj11 = ((Constructor) D8871).newInstance(null);
        } else {
            obj10 = obj9;
            obj11 = obj3;
        }
        if ((i5 & Barcode.FORMAT_UPC_E) != 0) {
            obj12 = obj11;
            Object[] objArr11 = {obj12};
            Object D88712 = uH18377.D8871(626838637);
            if (D88712 == null) {
                c1231l12 = c1231l13;
                D88712 = uH18377.setPivotYN16904((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 52, 586 - ImageFormat.getBitsPerPixel(0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -85496136, false, null, new Class[]{(Class) uH18377.charlie((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 59 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 527)});
            } else {
                c1231l12 = c1231l13;
            }
            obj13 = ((Constructor) D88712).newInstance(objArr11);
        } else {
            obj12 = obj11;
            c1231l12 = c1231l13;
            obj13 = obj4;
        }
        C1214h0 obj18 = (i5 & 4096) != 0 ? new Object() : c1214h0;
        C1206f0 c1206f02 = (i5 & 8192) != 0 ? new C1206f0(packageManager2, str7) : c1206f0;
        bh obj19 = (i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? new Object() : bhVar;
        W1 w14 = (i5 & i12) != 0 ? new W1(obj19) : w12;
        if ((i5 & i13) != 0) {
            w13 = w14;
            c1194c02 = new C1194c0(obj19);
        } else {
            w13 = w14;
            c1194c02 = c1194c0;
        }
        if ((i5 & i14) != 0) {
            c1194c03 = c1194c02;
            d9 = new D(obj19, context);
        } else {
            c1194c03 = c1194c02;
            d9 = d4;
        }
        if ((i5 & 262144) != 0) {
            d10 = d9;
            m42962 = new M4296(obj19);
        } else {
            d10 = d9;
            m42962 = m4296;
        }
        if ((i5 & 524288) != 0) {
            m42963 = m42962;
            m23 = new M2(obj19, context);
        } else {
            m42963 = m42962;
            m23 = m22;
        }
        this.alpha = list;
        this.bravo = str;
        this.charlie = z2;
        this.delta = list2;
        this.echo = userManager2;
        this.foxtrot = sensorManager3;
        this.golf = packageManager2;
        this.hotel = contentResolver3;
        this.india = str7;
        this.juliet = obj5;
        this.kilo = str10;
        this.lima = vD14832N6715;
        this.mike = c1715g3;
        this.november = obj6;
        this.oscar = c1200d23;
        this.papa = c1248p22;
        this.quebec = g22;
        this.romeo = p284272;
        this.sierra = c1277x02;
        this.tango = obj7;
        this.uniform = obj8;
        this.victor = u13;
        this.whiskey = d3Var2;
        this.xray = pc29223;
        this.yankee = g3Var2;
        this.zulu = c1261t03;
        this.amber = azVar;
        this.azure = c1231l12;
        this.beige = obj10;
        this.black = obj12;
        this.blue = obj13;
        this.bronze = obj18;
        this.coral = c1206f02;
        this.crimson = w13;
        this.cyan = c1194c03;
        this.emerald = d10;
        this.fuchsia = m42963;
        this.gold = m23;
    }
}
