package av;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.core.impl.C0503a;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.C0510h;
import androidx.camera.core.impl.C0511i;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.U;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.b0;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.android.gms.internal.measurement.C1290a1;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import s6.T7;
import t6.AbstractC3066u3;
import t6.N3;
import t6.P3;

/* loaded from: classes3.dex */
public final class ar {
    public final String india;
    public final InterfaceC0684d juliet;
    public final androidx.camera.camera2.internal.compat.j kilo;
    public final androidx.core.widget.f lima;
    public final int mike;
    public final boolean november;
    public final boolean oscar;
    public final boolean papa;
    public final boolean quebec;
    public final boolean romeo;
    public C0511i sierra;
    public final ak uniform;
    public final C1290a1 xray;
    public final ArrayList alpha = new ArrayList();
    public final ArrayList bravo = new ArrayList();
    public final ArrayList charlie = new ArrayList();
    public final ArrayList delta = new ArrayList();
    public final HashMap echo = new HashMap();
    public final ArrayList foxtrot = new ArrayList();
    public final ArrayList golf = new ArrayList();
    public final ArrayList hotel = new ArrayList();
    public final ArrayList tango = new ArrayList();
    public final W8.a victor = new W8.a(16);
    public final ah whiskey = new ah(4);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x07b9  */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ar(Context context, String str, androidx.camera.camera2.internal.compat.q qVar, InterfaceC0684d interfaceC0684d) {
        ArrayList arrayList;
        int[] iArr;
        CameraCharacteristics.Key key;
        boolean z2;
        int[] iArr2;
        boolean z10;
        this.november = false;
        this.oscar = false;
        this.papa = false;
        this.quebec = false;
        this.romeo = false;
        str.getClass();
        this.india = str;
        interfaceC0684d.getClass();
        this.juliet = interfaceC0684d;
        this.lima = new androidx.core.widget.f(7);
        this.uniform = ak.bravo(context);
        try {
            androidx.camera.camera2.internal.compat.j bravo = qVar.bravo(str);
            this.kilo = bravo;
            Integer num = (Integer) bravo.alpha(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.mike = num != null ? num.intValue() : 2;
            int[] iArr3 = (int[]) bravo.alpha(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr3 != null) {
                for (int i4 : iArr3) {
                    if (i4 == 3) {
                        this.november = true;
                    } else if (i4 == 6) {
                        this.oscar = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i4 == 16) {
                        this.romeo = true;
                    }
                }
            }
            this.xray = new C1290a1(this.kilo);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            T t5 = new T();
            U u4 = U.MAXIMUM;
            q.juliet(1, u4, 0L, t5);
            T charlie = q.charlie(arrayList3, t5);
            q.juliet(3, u4, 0L, charlie);
            T charlie2 = q.charlie(arrayList3, charlie);
            q.juliet(2, u4, 0L, charlie2);
            T charlie3 = q.charlie(arrayList3, charlie2);
            U u10 = U.PREVIEW;
            charlie3.alpha(new C0510h(1, u10, 0L));
            q.juliet(3, u4, 0L, charlie3);
            T charlie4 = q.charlie(arrayList3, charlie3);
            charlie4.alpha(new C0510h(2, u10, 0L));
            q.juliet(3, u4, 0L, charlie4);
            T charlie5 = q.charlie(arrayList3, charlie4);
            charlie5.alpha(new C0510h(1, u10, 0L));
            q.juliet(1, u10, 0L, charlie5);
            T charlie6 = q.charlie(arrayList3, charlie5);
            charlie6.alpha(new C0510h(1, u10, 0L));
            q.juliet(2, u10, 0L, charlie6);
            T charlie7 = q.charlie(arrayList3, charlie6);
            charlie7.alpha(new C0510h(1, u10, 0L));
            charlie7.alpha(new C0510h(2, u10, 0L));
            q.juliet(3, u4, 0L, charlie7);
            arrayList3.add(charlie7);
            arrayList2.addAll(arrayList3);
            int i5 = this.mike;
            U u11 = U.RECORD;
            if (i5 == 0 || i5 == 1 || i5 == 3) {
                ArrayList arrayList4 = new ArrayList();
                T t10 = new T();
                t10.alpha(new C0510h(1, u10, 0L));
                q.juliet(1, u11, 0L, t10);
                T charlie8 = q.charlie(arrayList4, t10);
                charlie8.alpha(new C0510h(1, u10, 0L));
                q.juliet(2, u11, 0L, charlie8);
                T charlie9 = q.charlie(arrayList4, charlie8);
                charlie9.alpha(new C0510h(2, u10, 0L));
                q.juliet(2, u11, 0L, charlie9);
                T charlie10 = q.charlie(arrayList4, charlie9);
                charlie10.alpha(new C0510h(1, u10, 0L));
                charlie10.alpha(new C0510h(1, u11, 0L));
                q.juliet(3, u11, 0L, charlie10);
                T charlie11 = q.charlie(arrayList4, charlie10);
                charlie11.alpha(new C0510h(1, u10, 0L));
                charlie11.alpha(new C0510h(2, u11, 0L));
                q.juliet(3, u11, 0L, charlie11);
                T charlie12 = q.charlie(arrayList4, charlie11);
                charlie12.alpha(new C0510h(2, u10, 0L));
                charlie12.alpha(new C0510h(2, u10, 0L));
                q.juliet(3, u4, 0L, charlie12);
                arrayList4.add(charlie12);
                arrayList2.addAll(arrayList4);
            }
            U u12 = U.VGA;
            if (i5 == 1 || i5 == 3) {
                ArrayList arrayList5 = new ArrayList();
                T t11 = new T();
                t11.alpha(new C0510h(1, u10, 0L));
                q.juliet(1, u4, 0L, t11);
                T charlie13 = q.charlie(arrayList5, t11);
                charlie13.alpha(new C0510h(1, u10, 0L));
                q.juliet(2, u4, 0L, charlie13);
                T charlie14 = q.charlie(arrayList5, charlie13);
                charlie14.alpha(new C0510h(2, u10, 0L));
                q.juliet(2, u4, 0L, charlie14);
                T charlie15 = q.charlie(arrayList5, charlie14);
                charlie15.alpha(new C0510h(1, u10, 0L));
                charlie15.alpha(new C0510h(1, u10, 0L));
                q.juliet(3, u4, 0L, charlie15);
                T charlie16 = q.charlie(arrayList5, charlie15);
                charlie16.alpha(new C0510h(2, u12, 0L));
                charlie16.alpha(new C0510h(1, u10, 0L));
                q.juliet(2, u4, 0L, charlie16);
                T charlie17 = q.charlie(arrayList5, charlie16);
                charlie17.alpha(new C0510h(2, u12, 0L));
                charlie17.alpha(new C0510h(2, u10, 0L));
                q.juliet(2, u4, 0L, charlie17);
                arrayList5.add(charlie17);
                arrayList2.addAll(arrayList5);
            }
            if (this.november) {
                ArrayList arrayList6 = new ArrayList();
                T t12 = new T();
                q.juliet(5, u4, 0L, t12);
                T charlie18 = q.charlie(arrayList6, t12);
                charlie18.alpha(new C0510h(1, u10, 0L));
                q.juliet(5, u4, 0L, charlie18);
                T charlie19 = q.charlie(arrayList6, charlie18);
                charlie19.alpha(new C0510h(2, u10, 0L));
                q.juliet(5, u4, 0L, charlie19);
                T charlie20 = q.charlie(arrayList6, charlie19);
                charlie20.alpha(new C0510h(1, u10, 0L));
                charlie20.alpha(new C0510h(1, u10, 0L));
                q.juliet(5, u4, 0L, charlie20);
                T charlie21 = q.charlie(arrayList6, charlie20);
                charlie21.alpha(new C0510h(1, u10, 0L));
                charlie21.alpha(new C0510h(2, u10, 0L));
                q.juliet(5, u4, 0L, charlie21);
                T charlie22 = q.charlie(arrayList6, charlie21);
                charlie22.alpha(new C0510h(2, u10, 0L));
                charlie22.alpha(new C0510h(2, u10, 0L));
                q.juliet(5, u4, 0L, charlie22);
                T charlie23 = q.charlie(arrayList6, charlie22);
                charlie23.alpha(new C0510h(1, u10, 0L));
                charlie23.alpha(new C0510h(3, u4, 0L));
                q.juliet(5, u4, 0L, charlie23);
                T charlie24 = q.charlie(arrayList6, charlie23);
                charlie24.alpha(new C0510h(2, u10, 0L));
                charlie24.alpha(new C0510h(3, u4, 0L));
                q.juliet(5, u4, 0L, charlie24);
                arrayList6.add(charlie24);
                arrayList2.addAll(arrayList6);
            }
            if (this.oscar && i5 == 0) {
                ArrayList arrayList7 = new ArrayList();
                T t13 = new T();
                t13.alpha(new C0510h(1, u10, 0L));
                q.juliet(1, u4, 0L, t13);
                T charlie25 = q.charlie(arrayList7, t13);
                charlie25.alpha(new C0510h(1, u10, 0L));
                q.juliet(2, u4, 0L, charlie25);
                T charlie26 = q.charlie(arrayList7, charlie25);
                charlie26.alpha(new C0510h(2, u10, 0L));
                q.juliet(2, u4, 0L, charlie26);
                arrayList7.add(charlie26);
                arrayList2.addAll(arrayList7);
            }
            if (i5 == 3) {
                ArrayList arrayList8 = new ArrayList();
                T t14 = new T();
                t14.alpha(new C0510h(1, u10, 0L));
                t14.alpha(new C0510h(1, u12, 0L));
                t14.alpha(new C0510h(2, u4, 0L));
                q.juliet(5, u4, 0L, t14);
                T charlie27 = q.charlie(arrayList8, t14);
                charlie27.alpha(new C0510h(1, u10, 0L));
                charlie27.alpha(new C0510h(1, u12, 0L));
                charlie27.alpha(new C0510h(3, u4, 0L));
                q.juliet(5, u4, 0L, charlie27);
                arrayList8.add(charlie27);
                arrayList2.addAll(arrayList8);
            }
            ArrayList arrayList9 = this.alpha;
            arrayList9.addAll(arrayList2);
            if (((ExtraSupportedSurfaceCombinationsQuirk) this.lima.purple) == null) {
                arrayList = new ArrayList();
            } else {
                T t15 = ExtraSupportedSurfaceCombinationsQuirk.alpha;
                String str2 = Build.DEVICE;
                if (!"heroqltevzw".equalsIgnoreCase(str2) && !"heroqltetmo".equalsIgnoreCase(str2)) {
                    if (!(!"google".equalsIgnoreCase(Build.BRAND) ? false : ExtraSupportedSurfaceCombinationsQuirk.charlie.contains(Build.MODEL.toUpperCase(Locale.US))) && !ExtraSupportedSurfaceCombinationsQuirk.bravo()) {
                        arrayList = Collections.EMPTY_LIST;
                    } else {
                        arrayList = Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.bravo);
                    }
                } else {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList = arrayList10;
                    if (this.india.equals("1")) {
                        arrayList10.add(ExtraSupportedSurfaceCombinationsQuirk.alpha);
                        arrayList = arrayList10;
                    }
                }
            }
            arrayList9.addAll(arrayList);
            if (this.romeo) {
                ArrayList arrayList11 = new ArrayList();
                T t16 = new T();
                U u13 = U.ULTRA_MAXIMUM;
                t16.alpha(new C0510h(2, u13, 0L));
                t16.alpha(new C0510h(1, u10, 0L));
                q.juliet(1, u11, 0L, t16);
                T charlie28 = q.charlie(arrayList11, t16);
                charlie28.alpha(new C0510h(3, u13, 0L));
                charlie28.alpha(new C0510h(1, u10, 0L));
                q.juliet(1, u11, 0L, charlie28);
                T charlie29 = q.charlie(arrayList11, charlie28);
                charlie29.alpha(new C0510h(5, u13, 0L));
                charlie29.alpha(new C0510h(1, u10, 0L));
                q.juliet(1, u11, 0L, charlie29);
                T charlie30 = q.charlie(arrayList11, charlie29);
                charlie30.alpha(new C0510h(2, u13, 0L));
                charlie30.alpha(new C0510h(1, u10, 0L));
                q.juliet(3, u4, 0L, charlie30);
                T charlie31 = q.charlie(arrayList11, charlie30);
                charlie31.alpha(new C0510h(3, u13, 0L));
                charlie31.alpha(new C0510h(1, u10, 0L));
                q.juliet(3, u4, 0L, charlie31);
                T charlie32 = q.charlie(arrayList11, charlie31);
                charlie32.alpha(new C0510h(5, u13, 0L));
                charlie32.alpha(new C0510h(1, u10, 0L));
                q.juliet(3, u4, 0L, charlie32);
                T charlie33 = q.charlie(arrayList11, charlie32);
                charlie33.alpha(new C0510h(2, u13, 0L));
                charlie33.alpha(new C0510h(1, u10, 0L));
                q.juliet(2, u4, 0L, charlie33);
                T charlie34 = q.charlie(arrayList11, charlie33);
                charlie34.alpha(new C0510h(3, u13, 0L));
                charlie34.alpha(new C0510h(1, u10, 0L));
                q.juliet(2, u4, 0L, charlie34);
                T charlie35 = q.charlie(arrayList11, charlie34);
                charlie35.alpha(new C0510h(5, u13, 0L));
                charlie35.alpha(new C0510h(1, u10, 0L));
                q.juliet(2, u4, 0L, charlie35);
                T charlie36 = q.charlie(arrayList11, charlie35);
                charlie36.alpha(new C0510h(2, u13, 0L));
                charlie36.alpha(new C0510h(1, u10, 0L));
                q.juliet(5, u4, 0L, charlie36);
                T charlie37 = q.charlie(arrayList11, charlie36);
                charlie37.alpha(new C0510h(3, u13, 0L));
                charlie37.alpha(new C0510h(1, u10, 0L));
                q.juliet(5, u4, 0L, charlie37);
                T charlie38 = q.charlie(arrayList11, charlie37);
                charlie38.alpha(new C0510h(5, u13, 0L));
                charlie38.alpha(new C0510h(1, u10, 0L));
                q.juliet(5, u4, 0L, charlie38);
                arrayList11.add(charlie38);
                this.bravo.addAll(arrayList11);
            }
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.papa = hasSystemFeature;
            U u14 = U.s1440p;
            if (hasSystemFeature) {
                ArrayList arrayList12 = new ArrayList();
                T t17 = new T();
                q.juliet(2, u14, 0L, t17);
                T charlie39 = q.charlie(arrayList12, t17);
                q.juliet(1, u14, 0L, charlie39);
                T charlie40 = q.charlie(arrayList12, charlie39);
                q.juliet(3, u14, 0L, charlie40);
                T charlie41 = q.charlie(arrayList12, charlie40);
                U u15 = U.s720p;
                charlie41.alpha(new C0510h(2, u15, 0L));
                q.juliet(3, u14, 0L, charlie41);
                T charlie42 = q.charlie(arrayList12, charlie41);
                charlie42.alpha(new C0510h(1, u15, 0L));
                q.juliet(3, u14, 0L, charlie42);
                T charlie43 = q.charlie(arrayList12, charlie42);
                charlie43.alpha(new C0510h(2, u15, 0L));
                q.juliet(2, u14, 0L, charlie43);
                T charlie44 = q.charlie(arrayList12, charlie43);
                charlie44.alpha(new C0510h(2, u15, 0L));
                q.juliet(1, u14, 0L, charlie44);
                T charlie45 = q.charlie(arrayList12, charlie44);
                charlie45.alpha(new C0510h(1, u15, 0L));
                q.juliet(2, u14, 0L, charlie45);
                T charlie46 = q.charlie(arrayList12, charlie45);
                charlie46.alpha(new C0510h(1, u15, 0L));
                q.juliet(1, u14, 0L, charlie46);
                arrayList12.add(charlie46);
                this.charlie.addAll(arrayList12);
            }
            if (this.xray.alpha) {
                ArrayList arrayList13 = new ArrayList();
                T t18 = new T();
                q.juliet(1, u4, 0L, t18);
                T charlie47 = q.charlie(arrayList13, t18);
                q.juliet(2, u4, 0L, charlie47);
                T charlie48 = q.charlie(arrayList13, charlie47);
                charlie48.alpha(new C0510h(1, u10, 0L));
                q.juliet(3, u4, 0L, charlie48);
                T charlie49 = q.charlie(arrayList13, charlie48);
                charlie49.alpha(new C0510h(1, u10, 0L));
                q.juliet(2, u4, 0L, charlie49);
                T charlie50 = q.charlie(arrayList13, charlie49);
                charlie50.alpha(new C0510h(2, u10, 0L));
                q.juliet(2, u4, 0L, charlie50);
                T charlie51 = q.charlie(arrayList13, charlie50);
                charlie51.alpha(new C0510h(1, u10, 0L));
                q.juliet(1, u11, 0L, charlie51);
                T charlie52 = q.charlie(arrayList13, charlie51);
                charlie52.alpha(new C0510h(1, u10, 0L));
                charlie52.alpha(new C0510h(1, u11, 0L));
                q.juliet(2, u11, 0L, charlie52);
                T charlie53 = q.charlie(arrayList13, charlie52);
                charlie53.alpha(new C0510h(1, u10, 0L));
                charlie53.alpha(new C0510h(1, u11, 0L));
                q.juliet(3, u11, 0L, charlie53);
                arrayList13.add(charlie53);
                this.foxtrot.addAll(arrayList13);
            }
            O7.j jVar = (O7.j) this.kilo.bravo().alpha;
            jVar.getClass();
            try {
                iArr = ((StreamConfigurationMap) jVar.purple).getOutputFormats();
            } catch (IllegalArgumentException | NullPointerException e) {
                AbstractC3066u3.juliet("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
                iArr = null;
            }
            int[] iArr4 = iArr != null ? (int[]) iArr.clone() : null;
            if (iArr4 != null) {
                int length = iArr4.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (iArr4[i10] == 4101) {
                        ArrayList arrayList14 = new ArrayList();
                        T t19 = new T();
                        q.juliet(4, u4, 0L, t19);
                        T charlie54 = q.charlie(arrayList14, t19);
                        charlie54.alpha(new C0510h(1, u10, 0L));
                        q.juliet(4, u4, 0L, charlie54);
                        arrayList14.add(charlie54);
                        this.golf.addAll(arrayList14);
                        break;
                    }
                    i10++;
                }
            }
            androidx.camera.camera2.internal.compat.j jVar2 = this.kilo;
            C0505c c0505c = aq.alpha;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 33) {
                key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                long[] jArr = (long[]) jVar2.alpha(key);
                if (jArr != null && jArr.length != 0) {
                    z2 = true;
                    this.quebec = z2;
                    if (z2 && i11 >= 33) {
                        ArrayList arrayList15 = new ArrayList();
                        T t20 = new T();
                        q.juliet(1, u14, 4L, t20);
                        T charlie55 = q.charlie(arrayList15, t20);
                        q.juliet(2, u14, 4L, charlie55);
                        T charlie56 = q.charlie(arrayList15, charlie55);
                        q.juliet(1, u11, 3L, charlie56);
                        T charlie57 = q.charlie(arrayList15, charlie56);
                        q.juliet(2, u11, 3L, charlie57);
                        T charlie58 = q.charlie(arrayList15, charlie57);
                        q.juliet(3, u4, 2L, charlie58);
                        T charlie59 = q.charlie(arrayList15, charlie58);
                        q.juliet(2, u4, 2L, charlie59);
                        T charlie60 = q.charlie(arrayList15, charlie59);
                        charlie60.alpha(new C0510h(1, u10, 1L));
                        q.juliet(3, u4, 2L, charlie60);
                        T charlie61 = q.charlie(arrayList15, charlie60);
                        charlie61.alpha(new C0510h(1, u10, 1L));
                        q.juliet(2, u4, 2L, charlie61);
                        T charlie62 = q.charlie(arrayList15, charlie61);
                        charlie62.alpha(new C0510h(1, u10, 1L));
                        q.juliet(1, u11, 3L, charlie62);
                        T charlie63 = q.charlie(arrayList15, charlie62);
                        charlie63.alpha(new C0510h(1, u10, 1L));
                        q.juliet(2, u11, 3L, charlie63);
                        T charlie64 = q.charlie(arrayList15, charlie63);
                        charlie64.alpha(new C0510h(1, u10, 1L));
                        q.juliet(2, u10, 1L, charlie64);
                        T charlie65 = q.charlie(arrayList15, charlie64);
                        charlie65.alpha(new C0510h(1, u10, 1L));
                        charlie65.alpha(new C0510h(1, u11, 3L));
                        q.juliet(3, u11, 2L, charlie65);
                        T charlie66 = q.charlie(arrayList15, charlie65);
                        charlie66.alpha(new C0510h(1, u10, 1L));
                        charlie66.alpha(new C0510h(2, u11, 3L));
                        q.juliet(3, u11, 2L, charlie66);
                        T charlie67 = q.charlie(arrayList15, charlie66);
                        charlie67.alpha(new C0510h(1, u10, 1L));
                        charlie67.alpha(new C0510h(2, u10, 1L));
                        q.juliet(3, u4, 2L, charlie67);
                        arrayList15.add(charlie67);
                        this.hotel.addAll(arrayList15);
                    }
                    androidx.camera.camera2.internal.compat.j jVar3 = this.kilo;
                    if (i11 >= 33 && (iArr2 = (int[]) jVar3.alpha(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr2.length != 0) {
                        for (int i12 : iArr2) {
                            if (i12 == 2) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                    z10 = false;
                    if (z10 && Build.VERSION.SDK_INT >= 33) {
                        ArrayList arrayList16 = new ArrayList();
                        T t21 = new T();
                        q.juliet(1, u14, 0L, t21);
                        T charlie68 = q.charlie(arrayList16, t21);
                        q.juliet(2, u14, 0L, charlie68);
                        T charlie69 = q.charlie(arrayList16, charlie68);
                        charlie69.alpha(new C0510h(1, u14, 0L));
                        q.juliet(3, u4, 0L, charlie69);
                        T charlie70 = q.charlie(arrayList16, charlie69);
                        charlie70.alpha(new C0510h(2, u14, 0L));
                        q.juliet(3, u4, 0L, charlie70);
                        T charlie71 = q.charlie(arrayList16, charlie70);
                        charlie71.alpha(new C0510h(1, u14, 0L));
                        q.juliet(2, u4, 0L, charlie71);
                        T charlie72 = q.charlie(arrayList16, charlie71);
                        charlie72.alpha(new C0510h(2, u14, 0L));
                        q.juliet(2, u4, 0L, charlie72);
                        T charlie73 = q.charlie(arrayList16, charlie72);
                        charlie73.alpha(new C0510h(1, u10, 0L));
                        q.juliet(1, u14, 0L, charlie73);
                        T charlie74 = q.charlie(arrayList16, charlie73);
                        charlie74.alpha(new C0510h(2, u10, 0L));
                        q.juliet(1, u14, 0L, charlie74);
                        T charlie75 = q.charlie(arrayList16, charlie74);
                        charlie75.alpha(new C0510h(1, u10, 0L));
                        q.juliet(2, u14, 0L, charlie75);
                        T charlie76 = q.charlie(arrayList16, charlie75);
                        charlie76.alpha(new C0510h(2, u10, 0L));
                        q.juliet(2, u14, 0L, charlie76);
                        arrayList16.add(charlie76);
                        this.delta.addAll(arrayList16);
                    }
                    bravo();
                }
            }
            z2 = false;
            this.quebec = z2;
            if (z2) {
                ArrayList arrayList152 = new ArrayList();
                T t202 = new T();
                q.juliet(1, u14, 4L, t202);
                T charlie552 = q.charlie(arrayList152, t202);
                q.juliet(2, u14, 4L, charlie552);
                T charlie562 = q.charlie(arrayList152, charlie552);
                q.juliet(1, u11, 3L, charlie562);
                T charlie572 = q.charlie(arrayList152, charlie562);
                q.juliet(2, u11, 3L, charlie572);
                T charlie582 = q.charlie(arrayList152, charlie572);
                q.juliet(3, u4, 2L, charlie582);
                T charlie592 = q.charlie(arrayList152, charlie582);
                q.juliet(2, u4, 2L, charlie592);
                T charlie602 = q.charlie(arrayList152, charlie592);
                charlie602.alpha(new C0510h(1, u10, 1L));
                q.juliet(3, u4, 2L, charlie602);
                T charlie612 = q.charlie(arrayList152, charlie602);
                charlie612.alpha(new C0510h(1, u10, 1L));
                q.juliet(2, u4, 2L, charlie612);
                T charlie622 = q.charlie(arrayList152, charlie612);
                charlie622.alpha(new C0510h(1, u10, 1L));
                q.juliet(1, u11, 3L, charlie622);
                T charlie632 = q.charlie(arrayList152, charlie622);
                charlie632.alpha(new C0510h(1, u10, 1L));
                q.juliet(2, u11, 3L, charlie632);
                T charlie642 = q.charlie(arrayList152, charlie632);
                charlie642.alpha(new C0510h(1, u10, 1L));
                q.juliet(2, u10, 1L, charlie642);
                T charlie652 = q.charlie(arrayList152, charlie642);
                charlie652.alpha(new C0510h(1, u10, 1L));
                charlie652.alpha(new C0510h(1, u11, 3L));
                q.juliet(3, u11, 2L, charlie652);
                T charlie662 = q.charlie(arrayList152, charlie652);
                charlie662.alpha(new C0510h(1, u10, 1L));
                charlie662.alpha(new C0510h(2, u11, 3L));
                q.juliet(3, u11, 2L, charlie662);
                T charlie672 = q.charlie(arrayList152, charlie662);
                charlie672.alpha(new C0510h(1, u10, 1L));
                charlie672.alpha(new C0510h(2, u10, 1L));
                q.juliet(3, u4, 2L, charlie672);
                arrayList152.add(charlie672);
                this.hotel.addAll(arrayList152);
            }
            androidx.camera.camera2.internal.compat.j jVar32 = this.kilo;
            if (i11 >= 33) {
                while (r5 < r3) {
                }
            }
            z10 = false;
            if (z10) {
                ArrayList arrayList162 = new ArrayList();
                T t212 = new T();
                q.juliet(1, u14, 0L, t212);
                T charlie682 = q.charlie(arrayList162, t212);
                q.juliet(2, u14, 0L, charlie682);
                T charlie692 = q.charlie(arrayList162, charlie682);
                charlie692.alpha(new C0510h(1, u14, 0L));
                q.juliet(3, u4, 0L, charlie692);
                T charlie702 = q.charlie(arrayList162, charlie692);
                charlie702.alpha(new C0510h(2, u14, 0L));
                q.juliet(3, u4, 0L, charlie702);
                T charlie712 = q.charlie(arrayList162, charlie702);
                charlie712.alpha(new C0510h(1, u14, 0L));
                q.juliet(2, u4, 0L, charlie712);
                T charlie722 = q.charlie(arrayList162, charlie712);
                charlie722.alpha(new C0510h(2, u14, 0L));
                q.juliet(2, u4, 0L, charlie722);
                T charlie732 = q.charlie(arrayList162, charlie722);
                charlie732.alpha(new C0510h(1, u10, 0L));
                q.juliet(1, u14, 0L, charlie732);
                T charlie742 = q.charlie(arrayList162, charlie732);
                charlie742.alpha(new C0510h(2, u10, 0L));
                q.juliet(1, u14, 0L, charlie742);
                T charlie752 = q.charlie(arrayList162, charlie742);
                charlie752.alpha(new C0510h(1, u10, 0L));
                q.juliet(2, u14, 0L, charlie752);
                T charlie762 = q.charlie(arrayList162, charlie752);
                charlie762.alpha(new C0510h(2, u10, 0L));
                q.juliet(2, u14, 0L, charlie762);
                arrayList162.add(charlie762);
                this.delta.addAll(arrayList162);
            }
            bravo();
        } catch (CameraAccessExceptionCompat e4) {
            throw N3.bravo(e4);
        }
    }

    public static Size charlie(StreamConfigurationMap streamConfigurationMap, int i4, boolean z2) {
        Size[] outputSizes;
        Size[] highResolutionOutputSizes;
        if (i4 == 34) {
            outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(i4);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            bc.c cVar = new bc.c(false);
            Size size = (Size) Collections.max(Arrays.asList(outputSizes), cVar);
            Size size2 = bi.b.alpha;
            if (z2 && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i4)) != null && highResolutionOutputSizes.length > 0) {
                size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), cVar);
            }
            return (Size) Collections.max(Arrays.asList(size, size2), cVar);
        }
        return null;
    }

    public static int echo(Range range, Range range2) {
        boolean z2;
        if (!range.contains((Range) range2.getUpper()) && !range.contains((Range) range2.getLower())) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.golf("Ranges must not intersect", z2);
        if (((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue()) {
            return ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue();
        }
        return ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int foxtrot(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public final boolean alpha(C0683c c0683c, List list) {
        List list2;
        HashMap hashMap = this.echo;
        if (hashMap.containsKey(c0683c)) {
            list2 = (List) hashMap.get(c0683c);
        } else {
            ArrayList arrayList = new ArrayList();
            boolean z2 = c0683c.delta;
            int i4 = c0683c.alpha;
            if (z2) {
                if (i4 == 0) {
                    arrayList.addAll(this.golf);
                }
            } else {
                int i5 = c0683c.bravo;
                if (i5 == 8) {
                    if (i4 != 1) {
                        ArrayList arrayList2 = this.alpha;
                        if (i4 != 2) {
                            if (c0683c.charlie) {
                                arrayList2 = this.delta;
                            }
                            arrayList.addAll(arrayList2);
                        } else {
                            arrayList.addAll(this.bravo);
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        arrayList = this.charlie;
                    }
                } else if (i5 == 10 && i4 == 0) {
                    arrayList.addAll(this.foxtrot);
                }
            }
            hashMap.put(c0683c, arrayList);
            list2 = arrayList;
        }
        Iterator it = list2.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (((T) it.next()).charlie(list) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                break;
            }
        }
        return z10;
    }

    public final void bravo() {
        Size size;
        Size size2;
        Size size3;
        int parseInt;
        InterfaceC0684d interfaceC0684d;
        CamcorderProfile camcorderProfile;
        CamcorderProfile camcorderProfile2;
        Size echo = this.uniform.echo();
        try {
            parseInt = Integer.parseInt(this.india);
            interfaceC0684d = this.juliet;
            camcorderProfile = null;
            if (interfaceC0684d.india(parseInt, 1)) {
                camcorderProfile2 = interfaceC0684d.bravo(parseInt, 1);
            } else {
                camcorderProfile2 = null;
            }
        } catch (NumberFormatException unused) {
            Size[] outputSizes = ((StreamConfigurationMap) ((O7.j) this.kilo.bravo().alpha).purple).getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                size = bi.b.charlie;
            } else {
                Arrays.sort(outputSizes, new bc.c(true));
                for (Size size4 : outputSizes) {
                    int width = size4.getWidth();
                    Size size5 = bi.b.echo;
                    if (width <= size5.getWidth() && size4.getHeight() <= size5.getHeight()) {
                        size2 = size4;
                        break;
                    }
                }
                size = bi.b.charlie;
            }
            size2 = size;
        }
        if (camcorderProfile2 != null) {
            size2 = new Size(camcorderProfile2.videoFrameWidth, camcorderProfile2.videoFrameHeight);
        } else {
            Size size6 = bi.b.charlie;
            if (interfaceC0684d.india(parseInt, 10)) {
                camcorderProfile = interfaceC0684d.bravo(parseInt, 10);
            } else if (interfaceC0684d.india(parseInt, 8)) {
                camcorderProfile = interfaceC0684d.bravo(parseInt, 8);
            } else if (interfaceC0684d.india(parseInt, 12)) {
                camcorderProfile = interfaceC0684d.bravo(parseInt, 12);
            } else if (interfaceC0684d.india(parseInt, 6)) {
                camcorderProfile = interfaceC0684d.bravo(parseInt, 6);
            } else if (interfaceC0684d.india(parseInt, 5)) {
                camcorderProfile = interfaceC0684d.bravo(parseInt, 5);
            } else if (interfaceC0684d.india(parseInt, 4)) {
                camcorderProfile = interfaceC0684d.bravo(parseInt, 4);
            }
            if (camcorderProfile != null) {
                size2 = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            } else {
                size3 = size6;
                this.sierra = new C0511i(bi.b.bravo, new HashMap(), echo, new HashMap(), size3, new HashMap(), new HashMap());
            }
        }
        size3 = size2;
        this.sierra = new C0511i(bi.b.bravo, new HashMap(), echo, new HashMap(), size3, new HashMap(), new HashMap());
    }

    public final List delta(C0683c c0683c, List list) {
        C0505c c0505c = aq.alpha;
        if (c0683c.alpha == 0 && c0683c.bravo == 8) {
            Iterator it = this.hotel.iterator();
            while (it.hasNext()) {
                List charlie = ((T) it.next()).charlie(list);
                if (charlie != null) {
                    return charlie;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x033a, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:239:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0537 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair golf(int i4, ArrayList arrayList, HashMap hashMap, boolean z2, boolean z10) {
        boolean z11;
        int i5;
        boolean z12;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        ArrayList arrayList2;
        HashMap hashMap5;
        HashMap hashMap6;
        String str;
        Range range;
        String str2;
        int i10;
        ArrayList arrayList3;
        ArrayList arrayList4;
        androidx.camera.core.t tVar;
        String str3;
        List list;
        int i11;
        ar arVar;
        String str4;
        ArrayList arrayList5;
        HashMap hashMap7;
        int i12;
        String str5;
        String str6;
        HashMap hashMap8;
        List list2;
        List list3;
        HashMap hashMap9;
        CameraCharacteristics.Key key;
        long j5;
        int i13;
        int i14;
        HashMap hashMap10;
        Range[] rangeArr;
        int i15;
        Range range2;
        double foxtrot;
        List list4;
        CameraCharacteristics.Key key2;
        int i16;
        List list5;
        int i17;
        Rational rational;
        Size bravo;
        androidx.camera.core.t tVar2;
        boolean z13;
        int i18;
        Set set;
        Iterator it;
        ArrayList arrayList6;
        Set set2;
        androidx.camera.core.t tVar3;
        Iterator it2;
        ak akVar = this.uniform;
        akVar.bravo = akVar.alpha();
        if (this.sierra == null) {
            bravo();
        } else {
            Size echo = this.uniform.echo();
            C0511i c0511i = this.sierra;
            this.sierra = new C0511i(c0511i.alpha, c0511i.bravo, echo, c0511i.delta, c0511i.echo, c0511i.foxtrot, c0511i.golf);
        }
        ArrayList arrayList7 = new ArrayList(hashMap.keySet());
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        Iterator it3 = arrayList7.iterator();
        while (it3.hasNext()) {
            int uniform = ((Z) it3.next()).uniform();
            if (!arrayList9.contains(Integer.valueOf(uniform))) {
                arrayList9.add(Integer.valueOf(uniform));
            }
        }
        Collections.sort(arrayList9);
        Collections.reverse(arrayList9);
        Iterator it4 = arrayList9.iterator();
        while (it4.hasNext()) {
            int intValue = ((Integer) it4.next()).intValue();
            Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                Z z14 = (Z) it5.next();
                if (intValue == z14.uniform()) {
                    arrayList8.add(Integer.valueOf(arrayList7.indexOf(z14)));
                }
            }
        }
        C1290a1 c1290a1 = this.xray;
        c1290a1.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            linkedHashSet.add(((C0503a) it6.next()).delta);
        }
        androidx.core.widget.f fVar = (androidx.core.widget.f) c1290a1.charlie;
        Set bravo2 = ((aw.c) fVar.purple).bravo();
        HashSet hashSet = new HashSet(bravo2);
        Iterator it7 = linkedHashSet.iterator();
        while (it7.hasNext()) {
            C1290a1.hotel(hashSet, (androidx.camera.core.t) it7.next(), fVar);
        }
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        Iterator it8 = arrayList8.iterator();
        while (it8.hasNext()) {
            Z z15 = (Z) arrayList7.get(((Integer) it8.next()).intValue());
            androidx.camera.core.t golf = z15.golf();
            ArrayList arrayList13 = arrayList8;
            if (golf.equals(androidx.camera.core.t.charlie)) {
                arrayList12.add(z15);
                it2 = it8;
            } else {
                int i19 = golf.alpha;
                it2 = it8;
                if (i19 != 2) {
                    int i20 = golf.bravo;
                    if ((i19 == 0 || i20 != 0) && (i19 != 0 || i20 == 0)) {
                        arrayList10.add(z15);
                    }
                }
                arrayList11.add(z15);
            }
            arrayList8 = arrayList13;
            it8 = it2;
        }
        ArrayList arrayList14 = arrayList8;
        HashMap hashMap11 = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList15 = new ArrayList();
        arrayList15.addAll(arrayList10);
        arrayList15.addAll(arrayList11);
        arrayList15.addAll(arrayList12);
        Iterator it9 = arrayList15.iterator();
        while (true) {
            boolean hasNext = it9.hasNext();
            androidx.camera.core.t tVar4 = androidx.camera.core.t.delta;
            Range range3 = null;
            if (hasNext) {
                Z z16 = (Z) it9.next();
                androidx.camera.core.t golf2 = z16.golf();
                String green = z16.green();
                if (golf2.bravo()) {
                    if (hashSet.contains(golf2)) {
                        arrayList6 = arrayList7;
                        set2 = bravo2;
                        it = it9;
                        tVar4 = golf2;
                    } else {
                        arrayList6 = arrayList7;
                        set2 = bravo2;
                        it = it9;
                        tVar4 = null;
                    }
                } else {
                    it = it9;
                    int i21 = golf2.alpha;
                    arrayList6 = arrayList7;
                    int i22 = golf2.bravo;
                    if (i21 == 1 && i22 == 0) {
                        if (hashSet.contains(tVar4)) {
                            set2 = bravo2;
                        } else {
                            set2 = bravo2;
                            tVar4 = null;
                        }
                    } else {
                        androidx.camera.core.t foxtrot2 = C1290a1.foxtrot(golf2, linkedHashSet, hashSet);
                        set2 = bravo2;
                        if (foxtrot2 != null) {
                            AbstractC3066u3.bravo("DynamicRangeResolver", "Resolved dynamic range for use case " + green + " from existing attached surface.\n" + golf2 + "\n->\n" + foxtrot2);
                        } else {
                            foxtrot2 = C1290a1.foxtrot(golf2, linkedHashSet2, hashSet);
                            if (foxtrot2 != null) {
                                AbstractC3066u3.bravo("DynamicRangeResolver", "Resolved dynamic range for use case " + green + " from concurrently bound use case.\n" + golf2 + "\n->\n" + foxtrot2);
                            } else if (C1290a1.delta(golf2, tVar4, hashSet)) {
                                AbstractC3066u3.bravo("DynamicRangeResolver", "Resolved dynamic range for use case " + green + " to no compatible HDR dynamic ranges.\n" + golf2 + "\n->\n" + tVar4);
                            } else {
                                if (i21 == 2 && (i22 == 10 || i22 == 0)) {
                                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        tVar3 = U0.o.delta((androidx.camera.camera2.internal.compat.j) c1290a1.bravo);
                                        if (tVar3 != null) {
                                            linkedHashSet3.add(tVar3);
                                        }
                                    } else {
                                        tVar3 = null;
                                    }
                                    linkedHashSet3.add(androidx.camera.core.t.echo);
                                    foxtrot2 = C1290a1.foxtrot(golf2, linkedHashSet3, hashSet);
                                    if (foxtrot2 != null) {
                                        StringBuilder india = q.india("Resolved dynamic range for use case ", green, " from ", foxtrot2.equals(tVar3) ? "recommended" : "required", " 10-bit supported dynamic range.\n");
                                        india.append(golf2);
                                        india.append("\n->\n");
                                        india.append(foxtrot2);
                                        AbstractC3066u3.bravo("DynamicRangeResolver", india.toString());
                                    }
                                }
                                Iterator it10 = hashSet.iterator();
                                while (it10.hasNext()) {
                                    androidx.camera.core.t tVar5 = (androidx.camera.core.t) it10.next();
                                    Iterator it11 = it10;
                                    T7.golf("Candidate dynamic range must be fully specified.", tVar5.bravo());
                                    if (!tVar5.equals(tVar4) && C1290a1.charlie(golf2, tVar5)) {
                                        AbstractC3066u3.bravo("DynamicRangeResolver", "Resolved dynamic range for use case " + green + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + golf2 + "\n->\n" + tVar5);
                                        tVar4 = tVar5;
                                        break;
                                    }
                                    it10 = it11;
                                }
                                tVar4 = null;
                            }
                        }
                        tVar4 = foxtrot2;
                    }
                }
                if (tVar4 != null) {
                    C1290a1.hotel(hashSet, tVar4, fVar);
                    hashMap11.put(z16, tVar4);
                    if (!linkedHashSet.contains(tVar4)) {
                        linkedHashSet2.add(tVar4);
                    }
                    it9 = it;
                    arrayList7 = arrayList6;
                    bravo2 = set2;
                } else {
                    throw new IllegalArgumentException("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  " + z16.green() + "\nRequested dynamic range:\n  " + golf2 + "\nSupported dynamic ranges:\n  " + TextUtils.join("\n  ", set2) + "\nConstrained set of concurrent dynamic ranges:\n  " + TextUtils.join("\n  ", hashSet));
                }
            } else {
                ArrayList arrayList16 = arrayList7;
                Iterator it12 = arrayList.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        if (((C0503a) it12.next()).bravo == 4101) {
                            break;
                        }
                    } else {
                        Iterator it13 = hashMap.keySet().iterator();
                        while (it13.hasNext()) {
                            if (((Z) it13.next()).oscar() == 4101) {
                            }
                        }
                        z11 = false;
                    }
                }
                Iterator it14 = hashMap11.values().iterator();
                while (true) {
                    if (!it14.hasNext()) {
                        i5 = 8;
                        break;
                    }
                    if (((androidx.camera.core.t) it14.next()).bravo == 10) {
                        i5 = 10;
                        break;
                    }
                }
                ar arVar2 = this;
                String str7 = arVar2.india;
                if (i4 != 0 && z11) {
                    throw new IllegalArgumentException(q.golf("Camera device id is ", str7, ". Ultra HDR is not currently supported in ", i4 != 1 ? i4 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
                }
                if (i4 != 0 && i5 == 10) {
                    throw new IllegalArgumentException(q.golf("Camera device id is ", str7, ". 10 bit dynamic range is not currently supported in ", i4 != 1 ? i4 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
                }
                C0683c c0683c = new C0683c(i4, i5, z2, z11);
                ArrayList arrayList17 = new ArrayList();
                Iterator it15 = arrayList.iterator();
                while (it15.hasNext()) {
                    arrayList17.add(((C0503a) it15.next()).alpha);
                }
                bc.c cVar = new bc.c(false);
                for (Z z17 : hashMap.keySet()) {
                    List list6 = (List) hashMap.get(z17);
                    T7.bravo("No available output size is found for " + z17 + ".", (list6 == null || list6.isEmpty()) ? false : true);
                    Size size = (Size) Collections.min(list6, cVar);
                    int oscar = z17.oscar();
                    arrayList17.add(C0510h.bravo(c0683c.alpha, oscar, size, arVar2.india(oscar)));
                }
                HashMap hashMap12 = hashMap;
                boolean alpha = arVar2.alpha(c0683c, arrayList17);
                String str8 = " New configs: ";
                String str9 = "No supported surface combination is found for camera device - Id : ";
                if (!alpha) {
                    throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + arVar2.india + ".  May be attempting to bind too many use cases. Existing surfaces: " + arrayList + " New configs: " + arrayList16);
                }
                Iterator it16 = arrayList.iterator();
                Range range4 = null;
                while (it16.hasNext()) {
                    Range range5 = ((C0503a) it16.next()).golf;
                    if (range4 == null) {
                        range4 = range5;
                    } else if (range5 != null) {
                        try {
                            range4 = range4.intersect(range5);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                Iterator it17 = arrayList14.iterator();
                while (it17.hasNext()) {
                    ArrayList arrayList18 = arrayList16;
                    Range november = ((Z) arrayList18.get(((Integer) it17.next()).intValue())).november();
                    if (range4 == null) {
                        range4 = november;
                    } else if (november != null) {
                        try {
                            range4 = range4.intersect(november);
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    arrayList16 = arrayList18;
                }
                ArrayList arrayList19 = arrayList16;
                HashMap hashMap13 = new HashMap();
                Iterator it18 = hashMap12.keySet().iterator();
                while (it18.hasNext()) {
                    Z z18 = (Z) it18.next();
                    ArrayList arrayList20 = new ArrayList();
                    String str10 = str8;
                    HashMap hashMap14 = new HashMap();
                    for (Size size2 : (List) hashMap12.get(z18)) {
                        String str11 = str9;
                        Range range6 = range4;
                        int oscar2 = z18.oscar();
                        Iterator it19 = it18;
                        C0510h bravo3 = C0510h.bravo(c0683c.alpha, oscar2, size2, arVar2.india(oscar2));
                        if (range6 != null) {
                            try {
                                tVar2 = tVar4;
                                z13 = alpha;
                                try {
                                    i18 = (int) (1.0E9d / ((StreamConfigurationMap) arVar2.kilo.alpha(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(oscar2, size2));
                                } catch (Exception unused3) {
                                    i18 = 0;
                                    U u4 = bravo3.bravo;
                                    set = (Set) hashMap14.get(u4);
                                    if (set == null) {
                                    }
                                    if (set.contains(Integer.valueOf(i18))) {
                                    }
                                    tVar4 = tVar2;
                                    range4 = range6;
                                    str9 = str11;
                                    it18 = it19;
                                    alpha = z13;
                                }
                            } catch (Exception unused4) {
                                tVar2 = tVar4;
                                z13 = alpha;
                            }
                        } else {
                            tVar2 = tVar4;
                            z13 = alpha;
                            i18 = LottieConstants.IterateForever;
                        }
                        U u42 = bravo3.bravo;
                        set = (Set) hashMap14.get(u42);
                        if (set == null) {
                            set = new HashSet();
                            hashMap14.put(u42, set);
                        }
                        if (set.contains(Integer.valueOf(i18))) {
                            arrayList20.add(size2);
                            set.add(Integer.valueOf(i18));
                        }
                        tVar4 = tVar2;
                        range4 = range6;
                        str9 = str11;
                        it18 = it19;
                        alpha = z13;
                    }
                    hashMap13.put(z18, arrayList20);
                    hashMap12 = hashMap;
                    str8 = str10;
                }
                String str12 = str8;
                String str13 = str9;
                Range range7 = range4;
                androidx.camera.core.t tVar6 = tVar4;
                boolean z19 = alpha;
                ArrayList arrayList21 = new ArrayList();
                Iterator it20 = arrayList14.iterator();
                while (it20.hasNext()) {
                    Z z20 = (Z) arrayList19.get(((Integer) it20.next()).intValue());
                    List<Size> list7 = (List) hashMap13.get(z20);
                    int oscar3 = z20.oscar();
                    W8.a aVar = arVar2.victor;
                    androidx.camera.camera2.internal.compat.j jVar = arVar2.kilo;
                    aVar.getClass();
                    char c3 = (((Nexus4AndroidLTargetAspectRatioQuirk) ax.b.alpha.delta(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) P3.echo(jVar).delta(AspectRatioLegacyApi21Quirk.class)) == null) ? (char) 3 : (char) 2;
                    if (c3 == 0) {
                        rational = bc.b.alpha;
                    } else if (c3 == 1) {
                        rational = bc.b.charlie;
                    } else if (c3 != 2) {
                        rational = null;
                    } else {
                        Size size3 = (Size) arVar2.india(Barcode.FORMAT_QR_CODE).foxtrot.get(Integer.valueOf(Barcode.FORMAT_QR_CODE));
                        rational = new Rational(size3.getWidth(), size3.getHeight());
                    }
                    if (rational != null) {
                        ArrayList arrayList22 = new ArrayList();
                        ArrayList arrayList23 = new ArrayList();
                        for (Size size4 : list7) {
                            if (bc.b.alpha(rational, size4)) {
                                arrayList22.add(size4);
                            } else {
                                arrayList23.add(size4);
                            }
                        }
                        arrayList23.addAll(0, arrayList22);
                        list7 = arrayList23;
                    }
                    ah ahVar = arVar2.whiskey;
                    int alpha2 = C0510h.alpha(oscar3);
                    if (((ExtraCroppingQuirk) ahVar.purple) != null && (bravo = ExtraCroppingQuirk.bravo(alpha2)) != null) {
                        ArrayList arrayList24 = new ArrayList();
                        arrayList24.add(bravo);
                        for (Size size5 : list7) {
                            if (!size5.equals(bravo)) {
                                arrayList24.add(size5);
                            }
                        }
                        list7 = arrayList24;
                    }
                    arrayList21.add(list7);
                }
                Iterator it21 = arrayList21.iterator();
                int i23 = 1;
                while (it21.hasNext()) {
                    i23 *= ((List) it21.next()).size();
                }
                if (i23 != 0) {
                    ArrayList arrayList25 = new ArrayList();
                    for (int i24 = 0; i24 < i23; i24++) {
                        arrayList25.add(new ArrayList());
                    }
                    int size6 = i23 / ((List) arrayList21.get(0)).size();
                    int i25 = i23;
                    for (int i26 = 0; i26 < arrayList21.size(); i26++) {
                        List list8 = (List) arrayList21.get(i26);
                        for (int i27 = 0; i27 < i23; i27++) {
                            ((List) arrayList25.get(i27)).add((Size) list8.get((i27 % i25) / size6));
                        }
                        if (i26 < arrayList21.size() - 1) {
                            i25 = size6;
                            size6 /= ((List) arrayList21.get(i26 + 1)).size();
                        }
                    }
                    HashMap hashMap15 = new HashMap();
                    HashMap hashMap16 = new HashMap();
                    ArrayList arrayList26 = arrayList19;
                    HashMap hashMap17 = new HashMap();
                    HashMap hashMap18 = new HashMap();
                    C0505c c0505c = aq.alpha;
                    Iterator it22 = arrayList.iterator();
                    while (true) {
                        if (it22.hasNext()) {
                            C0503a c0503a = (C0503a) it22.next();
                            if (aq.charlie(c0503a.foxtrot, (b0) c0503a.echo.get(0))) {
                                break;
                            }
                        } else {
                            Iterator it23 = arrayList26.iterator();
                            while (it23.hasNext()) {
                                Z z21 = (Z) it23.next();
                                if (aq.charlie(z21, z21.emerald())) {
                                }
                            }
                            z12 = false;
                        }
                    }
                    z12 = true;
                    Iterator it24 = arrayList.iterator();
                    int i28 = LottieConstants.IterateForever;
                    while (it24.hasNext()) {
                        C0503a c0503a2 = (C0503a) it24.next();
                        boolean z22 = z12;
                        Iterator it25 = it24;
                        try {
                            i17 = (int) (1.0E9d / ((StreamConfigurationMap) arVar2.kilo.alpha(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(c0503a2.bravo, c0503a2.charlie));
                        } catch (Exception unused5) {
                            i17 = 0;
                        }
                        i28 = Math.min(i28, i17);
                        z12 = z22;
                        it24 = it25;
                    }
                    boolean z23 = z12;
                    String str14 = "SurfaceConfig does not map to any use case";
                    if (!arVar2.quebec || z23) {
                        hashMap2 = hashMap17;
                        hashMap3 = hashMap18;
                        hashMap4 = hashMap11;
                        arrayList2 = arrayList25;
                        hashMap5 = hashMap15;
                        hashMap6 = hashMap16;
                        str = str12;
                        range = range7;
                        str2 = "SurfaceConfig does not map to any use case";
                        i10 = i28;
                        arrayList3 = arrayList14;
                        arrayList4 = arrayList;
                        tVar = tVar6;
                        str3 = str13;
                        list = null;
                    } else {
                        Iterator it26 = arrayList25.iterator();
                        List list9 = null;
                        loop25: while (true) {
                            if (!it26.hasNext()) {
                                hashMap2 = hashMap17;
                                hashMap3 = hashMap18;
                                hashMap4 = hashMap11;
                                arrayList2 = arrayList25;
                                hashMap5 = hashMap15;
                                hashMap6 = hashMap16;
                                str = str12;
                                range = range7;
                                str2 = str14;
                                i10 = i28;
                                arrayList3 = arrayList14;
                                arrayList4 = arrayList;
                                tVar = tVar6;
                                str3 = str13;
                                break;
                            }
                            ar arVar3 = arVar2;
                            arrayList2 = arrayList25;
                            hashMap5 = hashMap15;
                            hashMap6 = hashMap16;
                            ArrayList arrayList27 = arrayList14;
                            str = str12;
                            range = range7;
                            str2 = str14;
                            tVar = tVar6;
                            str3 = str13;
                            arrayList4 = arrayList;
                            Pair hotel = arVar3.hotel(i4, arrayList4, (List) it26.next(), arrayList26, arrayList27, i28, hashMap17, hashMap18);
                            HashMap hashMap19 = hashMap18;
                            int i29 = i28;
                            HashMap hashMap20 = hashMap17;
                            hashMap3 = hashMap19;
                            arVar2 = arVar3;
                            List delta = arVar2.delta(c0683c, (List) hotel.first);
                            arrayList3 = arrayList27;
                            if (delta != null) {
                                int i30 = 0;
                                while (i30 < delta.size()) {
                                    i10 = i29;
                                    hashMap4 = hashMap11;
                                    long j6 = ((C0510h) delta.get(i30)).charlie;
                                    boolean containsKey = hashMap20.containsKey(Integer.valueOf(i30));
                                    List list10 = delta;
                                    b0 b0Var = b0.teal;
                                    if (containsKey) {
                                        C0503a c0503a3 = (C0503a) hashMap20.get(Integer.valueOf(i30));
                                        i16 = i30;
                                        int size7 = c0503a3.echo.size();
                                        List list11 = c0503a3.echo;
                                        hashMap2 = hashMap20;
                                        if (size7 == 1) {
                                            b0Var = (b0) list11.get(0);
                                        }
                                        if (!aq.bravo(b0Var, j6, list11)) {
                                            list9 = null;
                                            break;
                                        }
                                        i30 = i16 + 1;
                                        hashMap11 = hashMap4;
                                        i29 = i10;
                                        delta = list10;
                                        hashMap20 = hashMap2;
                                    } else {
                                        i16 = i30;
                                        hashMap2 = hashMap20;
                                        if (hashMap3.containsKey(Integer.valueOf(i16))) {
                                            Z z24 = (Z) hashMap3.get(Integer.valueOf(i16));
                                            b0 emerald = z24.emerald();
                                            if (z24.emerald() == b0Var) {
                                                list5 = (List) ((androidx.camera.core.impl.B) ((bn.d) z24).getConfig()).quebec(bn.d.purple);
                                            } else {
                                                list5 = Collections.EMPTY_LIST;
                                            }
                                            if (!aq.bravo(emerald, j6, list5)) {
                                                list9 = null;
                                                break;
                                            }
                                            i30 = i16 + 1;
                                            hashMap11 = hashMap4;
                                            i29 = i10;
                                            delta = list10;
                                            hashMap20 = hashMap2;
                                        } else {
                                            throw new AssertionError(str2);
                                        }
                                    }
                                }
                            }
                            hashMap2 = hashMap20;
                            i10 = i29;
                            hashMap4 = hashMap11;
                            list9 = delta;
                            if (list9 != null) {
                                androidx.camera.camera2.internal.compat.j jVar2 = arVar2.kilo;
                                if (Build.VERSION.SDK_INT >= 33) {
                                    key2 = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                                    long[] jArr = (long[]) jVar2.alpha(key2);
                                    if (jArr != null && jArr.length != 0) {
                                        HashSet hashSet2 = new HashSet();
                                        for (long j7 : jArr) {
                                            hashSet2.add(Long.valueOf(j7));
                                        }
                                        Iterator it27 = list9.iterator();
                                        while (it27.hasNext()) {
                                            if (!hashSet2.contains(Long.valueOf(((C0510h) it27.next()).charlie))) {
                                            }
                                        }
                                        break loop25;
                                    }
                                }
                                list9 = null;
                            }
                            hashMap2.clear();
                            hashMap3.clear();
                            hashMap18 = hashMap3;
                            str13 = str3;
                            str14 = str2;
                            tVar6 = tVar;
                            hashMap16 = hashMap6;
                            arrayList14 = arrayList3;
                            hashMap11 = hashMap4;
                            i28 = i10;
                            hashMap17 = hashMap2;
                            str12 = str;
                            range7 = range;
                            hashMap15 = hashMap5;
                            arrayList25 = arrayList2;
                        }
                        if (list9 == null && !z19) {
                            throw new IllegalArgumentException(str3 + arVar2.india + ".  May be attempting to bind too many use cases. Existing surfaces: " + arrayList4 + str + arrayList26);
                        }
                        list = list9;
                    }
                    Iterator it28 = arrayList2.iterator();
                    List list12 = null;
                    List list13 = null;
                    int i31 = LottieConstants.IterateForever;
                    int i32 = LottieConstants.IterateForever;
                    boolean z25 = false;
                    boolean z26 = false;
                    while (true) {
                        if (!it28.hasNext()) {
                            i11 = i31;
                            arVar = arVar2;
                            str4 = str3;
                            arrayList5 = arrayList3;
                            hashMap7 = hashMap2;
                            i12 = 0;
                            str5 = str;
                            str6 = str2;
                            hashMap8 = hashMap3;
                            list2 = list12;
                            list3 = list13;
                            break;
                        }
                        List list14 = (List) it28.next();
                        String str15 = str;
                        int i33 = i32;
                        arrayList5 = arrayList3;
                        str5 = str15;
                        String str16 = str2;
                        hashMap8 = hashMap3;
                        int i34 = i10;
                        str4 = str3;
                        hashMap7 = hashMap2;
                        str6 = str16;
                        Iterator it29 = it28;
                        i12 = 0;
                        i11 = i31;
                        arVar = arVar2;
                        Pair hotel2 = arVar.hotel(i4, arrayList4, list14, arrayList26, arrayList5, i34, null, null);
                        List list15 = (List) hotel2.first;
                        int intValue2 = ((Integer) hotel2.second).intValue();
                        boolean z27 = range == null || i34 <= intValue2 || intValue2 >= ((Integer) range.getLower()).intValue();
                        if (z25 || !arVar.alpha(c0683c, list15)) {
                            list4 = list14;
                        } else {
                            list4 = list14;
                            if (i11 == Integer.MAX_VALUE || i11 < intValue2) {
                                i11 = intValue2;
                                list12 = list4;
                            }
                            if (z27) {
                                i11 = intValue2;
                                if (z26) {
                                    i32 = i33;
                                    list3 = list13;
                                    list2 = list4;
                                    break;
                                }
                                list12 = list4;
                                z25 = true;
                            }
                        }
                        if (list != null && !z26 && arVar.delta(c0683c, list15) != null) {
                            if (i33 == Integer.MAX_VALUE || i33 < intValue2) {
                                i33 = intValue2;
                                list13 = list4;
                            }
                            if (!z27) {
                                continue;
                            } else {
                                if (z25) {
                                    i32 = intValue2;
                                    list2 = list12;
                                    list3 = list4;
                                    break;
                                }
                                i33 = intValue2;
                                list13 = list4;
                                z26 = true;
                            }
                        }
                        arVar2 = arVar;
                        i32 = i33;
                        hashMap3 = hashMap8;
                        i31 = i11;
                        str = str5;
                        str2 = str6;
                        it28 = it29;
                        arrayList3 = arrayList5;
                        hashMap2 = hashMap7;
                        str3 = str4;
                        i10 = i34;
                    }
                    if (list2 != null) {
                        if (range != null) {
                            Range range8 = C0509g.foxtrot;
                            if (!range.equals(range8) && (rangeArr = (Range[]) arVar.kilo.alpha(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) != null) {
                                Range range9 = new Range(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i11)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i11)));
                                int length = rangeArr.length;
                                int i35 = i12;
                                int i36 = i35;
                                while (true) {
                                    if (i36 >= length) {
                                        break;
                                    }
                                    int i37 = length;
                                    Range range10 = rangeArr[i36];
                                    int i38 = i36;
                                    if (i11 >= ((Integer) range10.getLower()).intValue()) {
                                        if (range8.equals(C0509g.foxtrot)) {
                                            range8 = range10;
                                        }
                                        if (range10.equals(range9)) {
                                            range8 = range10;
                                            break;
                                        }
                                        try {
                                            int foxtrot3 = foxtrot(range10.intersect(range9));
                                            if (i35 == 0) {
                                                i35 = foxtrot3;
                                            } else if (foxtrot3 >= i35) {
                                                try {
                                                    range2 = range8;
                                                    i15 = i35;
                                                    foxtrot = foxtrot(range8.intersect(range9));
                                                } catch (IllegalArgumentException unused6) {
                                                    range2 = range8;
                                                    i15 = i35;
                                                }
                                                try {
                                                    double foxtrot4 = foxtrot(range10.intersect(range9));
                                                    double foxtrot5 = foxtrot4 / foxtrot(range10);
                                                    double foxtrot6 = foxtrot / foxtrot(range2);
                                                    try {
                                                        if (foxtrot4 <= foxtrot ? foxtrot4 != foxtrot ? foxtrot6 >= 0.5d || foxtrot5 <= foxtrot6 : foxtrot5 <= foxtrot6 && (foxtrot5 != foxtrot6 || ((Integer) range10.getLower()).intValue() <= ((Integer) range2.getLower()).intValue()) : foxtrot5 < 0.5d && foxtrot5 < foxtrot6) {
                                                            range8 = range2;
                                                            i35 = foxtrot(range9.intersect(range8));
                                                            range10 = range8;
                                                        }
                                                        i35 = foxtrot(range9.intersect(range8));
                                                        range10 = range8;
                                                    } catch (IllegalArgumentException unused7) {
                                                        if (i15 == 0 || (echo(range10, range9) >= echo(range8, range9) && (echo(range10, range9) != echo(range8, range9) || (((Integer) range10.getLower()).intValue() <= ((Integer) range8.getUpper()).intValue() && foxtrot(range10) >= foxtrot(range8))))) {
                                                            i35 = i15;
                                                            i36 = i38 + 1;
                                                            length = i37;
                                                        } else {
                                                            i35 = i15;
                                                            range8 = range10;
                                                            i36 = i38 + 1;
                                                            length = i37;
                                                        }
                                                    }
                                                    range8 = range10;
                                                } catch (IllegalArgumentException unused8) {
                                                    range8 = range2;
                                                    if (i15 == 0) {
                                                    }
                                                    i35 = i15;
                                                    i36 = i38 + 1;
                                                    length = i37;
                                                }
                                            } else {
                                                range10 = range8;
                                            }
                                        } catch (IllegalArgumentException unused9) {
                                            i15 = i35;
                                        }
                                        range8 = range10;
                                    }
                                    i36 = i38 + 1;
                                    length = i37;
                                }
                            }
                            range3 = range8;
                        }
                        Range range11 = range3;
                        Iterator it30 = arrayList26.iterator();
                        while (it30.hasNext()) {
                            Z z28 = (Z) it30.next();
                            Iterator it31 = it30;
                            Size size8 = (Size) list2.get(arrayList5.indexOf(Integer.valueOf(arrayList26.indexOf(z28))));
                            Range range12 = C0509g.foxtrot;
                            ArrayList arrayList28 = arrayList5;
                            ArrayList arrayList29 = arrayList26;
                            B9.ab abVar = new B9.ab(22);
                            if (size8 != null) {
                                abVar.purple = size8;
                                Range range13 = C0509g.foxtrot;
                                if (range13 != null) {
                                    abVar.red = range13;
                                    androidx.camera.core.t tVar7 = tVar;
                                    abVar.white = tVar7;
                                    abVar.teal = Boolean.FALSE;
                                    HashMap hashMap21 = hashMap4;
                                    androidx.camera.core.t tVar8 = (androidx.camera.core.t) hashMap21.get(z28);
                                    tVar8.getClass();
                                    abVar.white = tVar8;
                                    androidx.camera.core.impl.aw bravo4 = androidx.camera.core.impl.aw.bravo();
                                    C0505c c0505c2 = au.a.f3241b;
                                    if (z28.echo(c0505c2)) {
                                        hashMap4 = hashMap21;
                                        bravo4.hotel(c0505c2, (Long) z28.quebec(c0505c2));
                                    } else {
                                        hashMap4 = hashMap21;
                                    }
                                    C0505c c0505c3 = Z.amber;
                                    if (z28.echo(c0505c3)) {
                                        bravo4.hotel(c0505c3, (Boolean) z28.quebec(c0505c3));
                                    }
                                    C0505c c0505c4 = androidx.camera.core.impl.am.purple;
                                    if (z28.echo(c0505c4)) {
                                        bravo4.hotel(c0505c4, (Integer) z28.quebec(c0505c4));
                                    }
                                    C0505c c0505c5 = androidx.camera.core.impl.an.india;
                                    if (z28.echo(c0505c5)) {
                                        bravo4.hotel(c0505c5, (Integer) z28.quebec(c0505c5));
                                    }
                                    abVar.silver = new ah(6, bravo4);
                                    abVar.teal = Boolean.valueOf(z10);
                                    if (range11 != null) {
                                        abVar.red = range11;
                                    }
                                    hashMap6.put(z28, abVar.xray());
                                    tVar = tVar7;
                                    arrayList5 = arrayList28;
                                    it30 = it31;
                                    arrayList26 = arrayList29;
                                } else {
                                    throw new NullPointerException("Null expectedFrameRateRange");
                                }
                            } else {
                                throw new NullPointerException("Null resolution");
                            }
                        }
                        androidx.camera.core.t tVar9 = tVar;
                        HashMap hashMap22 = hashMap6;
                        if (list != null && i11 == i32 && list2.size() == list3.size()) {
                            for (int i39 = i12; i39 < list2.size(); i39++) {
                                if (((Size) list2.get(i39)).equals(list3.get(i39))) {
                                }
                            }
                            androidx.camera.camera2.internal.compat.j jVar3 = arVar.kilo;
                            if (Build.VERSION.SDK_INT >= 33) {
                                ArrayList arrayList30 = new ArrayList(hashMap22.keySet());
                                Iterator it32 = arrayList4.iterator();
                                while (it32.hasNext()) {
                                    ((C0503a) it32.next()).foxtrot.getClass();
                                }
                                Iterator it33 = arrayList30.iterator();
                                while (it33.hasNext()) {
                                    C0509g c0509g = (C0509g) hashMap22.get((Z) it33.next());
                                    c0509g.getClass();
                                    c0509g.delta.getClass();
                                }
                                key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                                long[] jArr2 = (long[]) jVar3.alpha(key);
                                if (jArr2 != null && jArr2.length != 0) {
                                    HashSet hashSet3 = new HashSet();
                                    int length2 = jArr2.length;
                                    for (int i40 = i12; i40 < length2; i40++) {
                                        hashSet3.add(Long.valueOf(jArr2[i40]));
                                    }
                                    HashSet hashSet4 = new HashSet();
                                    Iterator it34 = arrayList4.iterator();
                                    if (it34.hasNext()) {
                                        C0503a c0503a4 = (C0503a) it34.next();
                                        au.a aVar2 = c0503a4.foxtrot;
                                        j5 = 0;
                                        C0505c c0505c6 = au.a.f3241b;
                                        if (aVar2.echo(c0505c6) && ((Long) c0503a4.foxtrot.quebec(c0505c6)).longValue() != 0) {
                                            i14 = i12;
                                            i13 = 1;
                                        } else {
                                            i13 = i12;
                                            i14 = 1;
                                        }
                                    } else {
                                        j5 = 0;
                                        i13 = i12;
                                        i14 = i13;
                                    }
                                    Iterator it35 = arrayList30.iterator();
                                    while (it35.hasNext()) {
                                        ArrayList arrayList31 = arrayList30;
                                        Z z29 = (Z) it35.next();
                                        int i41 = i13;
                                        C0505c c0505c7 = au.a.f3241b;
                                        int i42 = i14;
                                        if (z29.echo(c0505c7)) {
                                            Long l10 = (Long) z29.quebec(c0505c7);
                                            if (l10.longValue() == j5) {
                                                if (i41 != 0) {
                                                    throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                                                }
                                            } else if (i42 == 0) {
                                                hashSet4.add(l10);
                                                i14 = i42;
                                                i13 = 1;
                                                arrayList30 = arrayList31;
                                            } else {
                                                throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                                            }
                                        } else if (i41 != 0) {
                                            throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                                        }
                                        i13 = i41;
                                        i14 = 1;
                                        arrayList30 = arrayList31;
                                    }
                                    ArrayList arrayList32 = arrayList30;
                                    if (i14 == 0) {
                                        Iterator it36 = hashSet4.iterator();
                                        while (it36.hasNext()) {
                                            if (!hashSet3.contains((Long) it36.next())) {
                                            }
                                        }
                                        Iterator it37 = arrayList4.iterator();
                                        while (it37.hasNext()) {
                                            C0503a c0503a5 = (C0503a) it37.next();
                                            au.a aVar3 = c0503a5.foxtrot;
                                            au.a alpha3 = aq.alpha(aVar3, ((Long) aVar3.quebec(au.a.f3241b)).longValue());
                                            if (alpha3 != null) {
                                                Range range14 = C0509g.foxtrot;
                                                B9.ab abVar2 = new B9.ab(22);
                                                Size size9 = c0503a5.charlie;
                                                if (size9 != null) {
                                                    abVar2.purple = size9;
                                                    Range range15 = C0509g.foxtrot;
                                                    if (range15 != null) {
                                                        abVar2.red = range15;
                                                        abVar2.white = tVar9;
                                                        abVar2.teal = Boolean.FALSE;
                                                        androidx.camera.core.t tVar10 = c0503a5.delta;
                                                        if (tVar10 != null) {
                                                            abVar2.white = tVar10;
                                                            abVar2.silver = alpha3;
                                                            Range range16 = c0503a5.golf;
                                                            if (range16 != null) {
                                                                abVar2.red = range16;
                                                            }
                                                            C0509g xray = abVar2.xray();
                                                            hashMap10 = hashMap5;
                                                            hashMap10.put(c0503a5, xray);
                                                        } else {
                                                            throw new NullPointerException("Null dynamicRange");
                                                        }
                                                    } else {
                                                        throw new NullPointerException("Null expectedFrameRateRange");
                                                    }
                                                } else {
                                                    throw new NullPointerException("Null resolution");
                                                }
                                            } else {
                                                hashMap10 = hashMap5;
                                            }
                                            hashMap5 = hashMap10;
                                        }
                                        hashMap9 = hashMap5;
                                        Iterator it38 = arrayList32.iterator();
                                        while (it38.hasNext()) {
                                            Z z30 = (Z) it38.next();
                                            C0509g c0509g2 = (C0509g) hashMap22.get(z30);
                                            au.a aVar4 = c0509g2.delta;
                                            au.a alpha4 = aq.alpha(aVar4, ((Long) aVar4.quebec(au.a.f3241b)).longValue());
                                            if (alpha4 != null) {
                                                B9.ab alpha5 = c0509g2.alpha();
                                                alpha5.silver = alpha4;
                                                hashMap22.put(z30, alpha5.xray());
                                            }
                                        }
                                        return new Pair(hashMap22, hashMap9);
                                    }
                                }
                            }
                            hashMap9 = hashMap5;
                            for (int i43 = i12; i43 < list.size(); i43++) {
                                long j10 = ((C0510h) list.get(i43)).charlie;
                                if (hashMap7.containsKey(Integer.valueOf(i43))) {
                                    C0503a c0503a6 = (C0503a) hashMap7.get(Integer.valueOf(i43));
                                    au.a alpha6 = aq.alpha(c0503a6.foxtrot, j10);
                                    if (alpha6 != null) {
                                        Range range17 = C0509g.foxtrot;
                                        B9.ab abVar3 = new B9.ab(22);
                                        Size size10 = c0503a6.charlie;
                                        if (size10 != null) {
                                            abVar3.purple = size10;
                                            Range range18 = C0509g.foxtrot;
                                            if (range18 != null) {
                                                abVar3.red = range18;
                                                abVar3.white = tVar9;
                                                abVar3.teal = Boolean.FALSE;
                                                androidx.camera.core.t tVar11 = c0503a6.delta;
                                                if (tVar11 != null) {
                                                    abVar3.white = tVar11;
                                                    abVar3.silver = alpha6;
                                                    Range range19 = c0503a6.golf;
                                                    if (range19 != null) {
                                                        abVar3.red = range19;
                                                    }
                                                    hashMap9.put(c0503a6, abVar3.xray());
                                                } else {
                                                    throw new NullPointerException("Null dynamicRange");
                                                }
                                            } else {
                                                throw new NullPointerException("Null expectedFrameRateRange");
                                            }
                                        } else {
                                            throw new NullPointerException("Null resolution");
                                        }
                                    }
                                } else if (hashMap8.containsKey(Integer.valueOf(i43))) {
                                    Z z31 = (Z) hashMap8.get(Integer.valueOf(i43));
                                    C0509g c0509g3 = (C0509g) hashMap22.get(z31);
                                    au.a alpha7 = aq.alpha(c0509g3.delta, j10);
                                    if (alpha7 != null) {
                                        B9.ab alpha8 = c0509g3.alpha();
                                        alpha8.silver = alpha7;
                                        hashMap22.put(z31, alpha8.xray());
                                    }
                                } else {
                                    throw new AssertionError(str6);
                                }
                            }
                            return new Pair(hashMap22, hashMap9);
                        }
                        hashMap9 = hashMap5;
                        return new Pair(hashMap22, hashMap9);
                    }
                    throw new IllegalArgumentException(str4 + arVar.india + " and Hardware level: " + arVar.mike + ". May be the specified resolution is too large and not supported. Existing surfaces: " + arrayList4 + str5 + arrayList26);
                }
                throw new IllegalArgumentException("Failed to find supported resolutions.");
            }
        }
    }

    public final Pair hotel(int i4, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i5, HashMap hashMap, HashMap hashMap2) {
        int i10;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0503a c0503a = (C0503a) it.next();
            arrayList4.add(c0503a.alpha);
            if (hashMap != null) {
                hashMap.put(Integer.valueOf(arrayList4.size() - 1), c0503a);
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            Size size = (Size) list.get(i11);
            Z z2 = (Z) arrayList2.get(((Integer) arrayList3.get(i11)).intValue());
            int oscar = z2.oscar();
            arrayList4.add(C0510h.bravo(i4, oscar, size, india(oscar)));
            if (hashMap2 != null) {
                hashMap2.put(Integer.valueOf(arrayList4.size() - 1), z2);
            }
            try {
                i10 = (int) (1.0E9d / ((StreamConfigurationMap) this.kilo.alpha(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(z2.oscar(), size));
            } catch (Exception unused) {
                i10 = 0;
            }
            i5 = Math.min(i5, i10);
        }
        return new Pair(arrayList4, Integer.valueOf(i5));
    }

    public final C0511i india(int i4) {
        CameraCharacteristics.Key key;
        ArrayList arrayList = this.tango;
        if (!arrayList.contains(Integer.valueOf(i4))) {
            juliet(this.sierra.bravo, bi.b.delta, i4);
            juliet(this.sierra.delta, bi.b.foxtrot, i4);
            HashMap hashMap = this.sierra.foxtrot;
            androidx.camera.camera2.internal.compat.j jVar = this.kilo;
            Size charlie = charlie((StreamConfigurationMap) ((O7.j) jVar.bravo().alpha).purple, i4, true);
            if (charlie != null) {
                hashMap.put(Integer.valueOf(i4), charlie);
            }
            HashMap hashMap2 = this.sierra.golf;
            if (Build.VERSION.SDK_INT >= 31 && this.romeo) {
                key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) jVar.alpha(key);
                if (streamConfigurationMap != null) {
                    hashMap2.put(Integer.valueOf(i4), charlie(streamConfigurationMap, i4, true));
                }
            }
            arrayList.add(Integer.valueOf(i4));
        }
        return this.sierra;
    }

    public final void juliet(HashMap hashMap, Size size, int i4) {
        if (!this.papa) {
            return;
        }
        Size charlie = charlie((StreamConfigurationMap) ((O7.j) this.kilo.bravo().alpha).purple, i4, false);
        Integer valueOf = Integer.valueOf(i4);
        if (charlie != null) {
            size = (Size) Collections.min(Arrays.asList(size, charlie), new bc.c(false));
        }
        hashMap.put(valueOf, size);
    }
}
