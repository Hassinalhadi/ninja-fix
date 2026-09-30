package av;

import a0.AbstractC0345ae;
import a0.InterfaceC0364r;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.P0;
import androidx.appcompat.widget.i1;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.H;
import androidx.drawerlayout.widget.DrawerLayout;
import be.C0758d;
import be.InterfaceC0757c;
import bz.C0794t;
import bz.InterfaceC0793s;
import bz.j0;
import bz.l0;
import cf.C0848d;
import cf.InterfaceC0849e;
import com.clevertap.android.sdk.Constants;
import com.fingerprintjs.android.fpjs_pro_internal.InterfaceC1198d0;
import com.google.android.gms.measurement.internal.EnumC1442f;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.U;
import com.google.android.gms.measurement.internal.Z0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.navigation.NavigationView;
import d7.InterfaceC1591a;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2347w;
import pe.InterfaceC2321ad;
import pe.InterfaceC2325ah;
import s1.InterfaceC2587u;
import s1.a0;
import s6.T7;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public class ah implements InterfaceC0757c, H, V0.i, InterfaceC0793s, l0, InterfaceC0849e, Z3.a, InterfaceC1198d0, com.google.android.gms.measurement.internal.as, InterfaceC2587u, com.google.android.material.button.a, InterfaceC1591a, ao.j, p7.l {
    public static int red = 0;
    public static int silver = 0;
    public static int teal = 0;
    public static int white = 0;
    public static int yellow = 1;
    public final /* synthetic */ int alpha;
    public Object purple;

    public /* synthetic */ ah(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    public static int magenta() {
        int i4 = silver;
        int i5 = i4 % 5903301;
        silver = i4 + 1;
        if (i5 != 0) {
            return teal;
        }
        int elapsedRealtime = (int) SystemClock.elapsedRealtime();
        teal = elapsedRealtime;
        return elapsedRealtime;
    }

    @Override // bz.i0
    public boolean alpha() {
        ((J2.n) this.purple).getClass();
        return false;
    }

    @Override // bz.i0
    public long amber(bz.r rVar, bz.r rVar2, bz.r rVar3) {
        return ((J2.n) this.purple).amber(rVar, rVar2, rVar3);
    }

    @Override // be.InterfaceC0757c
    public void b(Throwable th) {
        switch (this.alpha) {
            case 0:
                synchronized (((aj) this.purple).alpha) {
                    try {
                        ((aj) this.purple).delta.uniform();
                        int mike = q.mike(((aj) this.purple).india);
                        if ((mike == 3 || mike == 5 || mike == 6) && !(th instanceof CancellationException)) {
                            AbstractC3066u3.juliet("CaptureSession", "Opening session with fail ".concat(q.oscar(((aj) this.purple).india)), th);
                            ((aj) this.purple).delta();
                        }
                    } finally {
                    }
                }
                return;
            default:
                ((V0.h) this.purple).delta(th);
                return;
        }
    }

    @Override // androidx.camera.core.impl.af
    public /* synthetic */ Set beige(C0505c c0505c) {
        return P0.juliet(this, c0505c);
    }

    @Override // V0.i
    public Object black(V0.h hVar) {
        boolean z2;
        C0758d c0758d = (C0758d) this.purple;
        if (c0758d.purple == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.golf("The result can only set once!", z2);
        c0758d.purple = hVar;
        return "FutureChain[" + c0758d + Constants.AES_SUFFIX;
    }

    @Override // p7.m
    public /* bridge */ /* synthetic */ Object bravo() {
        return new com.google.android.play.core.integrity.n((com.google.android.play.core.integrity.i) ((p7.k) this.purple).bravo());
    }

    @Override // androidx.camera.core.impl.af
    public void charlie(A2.ao aoVar) {
        getConfig().charlie(aoVar);
    }

    @Override // ao.j
    public void coral(ao.l lVar) {
    }

    @Override // bz.i0
    public bz.r delta(bz.r rVar, bz.r rVar2, bz.r rVar3) {
        return ((J2.n) this.purple).delta(rVar, rVar2, rVar3);
    }

    @Override // androidx.camera.core.impl.af
    public /* synthetic */ boolean echo(C0505c c0505c) {
        return P0.alpha(this, c0505c);
    }

    @Override // bz.i0
    public bz.r foxtrot(long j5, bz.r rVar, bz.r rVar2, bz.r rVar3) {
        return ((J2.n) this.purple).foxtrot(j5, rVar, rVar2, rVar3);
    }

    @Override // bz.InterfaceC0793s
    public bz.ab get(int i4) {
        return (bz.ac) this.purple;
    }

    @Override // androidx.camera.core.impl.H
    public androidx.camera.core.impl.af getConfig() {
        return (androidx.camera.core.impl.af) this.purple;
    }

    @Override // s1.InterfaceC2587u
    public a0 gold(View view, a0 a0Var) {
        a0 a0Var2;
        boolean z2;
        AppBarLayout appBarLayout = (AppBarLayout) this.purple;
        if (appBarLayout.getFitsSystemWindows()) {
            a0Var2 = a0Var;
        } else {
            a0Var2 = null;
        }
        if (!Objects.equals(appBarLayout.yellow, a0Var2)) {
            appBarLayout.yellow = a0Var2;
            if (appBarLayout.f7783q != null && appBarLayout.getTopInset() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            appBarLayout.setWillNotDraw(!z2);
            appBarLayout.requestLayout();
        }
        return a0Var;
    }

    @Override // bz.i0
    public bz.r gray(long j5, bz.r rVar, bz.r rVar2, bz.r rVar3) {
        return ((J2.n) this.purple).gray(j5, rVar, rVar2, rVar3);
    }

    @Override // com.google.android.gms.measurement.internal.as
    public void hotel(String str, int i4, IOException iOException, byte[] bArr, Map map) {
        ((Z0) this.purple).oscar(str, i4, iOException, bArr, map);
    }

    @Override // cf.InterfaceC0849e
    public C0848d india(Ne.b classId) {
        C0848d india;
        Intrinsics.echo(classId, "classId");
        Ne.c golf = classId.golf();
        Intrinsics.delta(golf, "classId.packageFqName");
        Iterator it = AbstractC2347w.india((InterfaceC2325ah) this.purple, golf).iterator();
        while (it.hasNext()) {
            InterfaceC2321ad interfaceC2321ad = (InterfaceC2321ad) it.next();
            if ((interfaceC2321ad instanceof df.c) && (india = ((df.c) interfaceC2321ad).f12558b.india(classId)) != null) {
                return india;
            }
        }
        return null;
    }

    @Override // androidx.camera.core.impl.af
    public /* synthetic */ Object juliet(C0505c c0505c, androidx.camera.core.impl.ae aeVar) {
        return P0.xray(this, c0505c, aeVar);
    }

    @Override // Z3.a
    public Object kilo() {
        i1 i1Var = (i1) this.purple;
        return new com.bumptech.glide.load.engine.p((I3.e) i1Var.bravo, (I3.e) i1Var.alpha, (I3.e) i1Var.charlie, (I3.e) i1Var.delta, (com.bumptech.glide.load.engine.l) i1Var.echo, (com.bumptech.glide.load.engine.l) i1Var.foxtrot, (J2.t) i1Var.golf);
    }

    public synchronized void maroon() {
        ((SharedPreferences) this.purple).edit().clear().commit();
    }

    public void navy(float f5, float f10, float f11, float f12) {
        boolean z2;
        J2.t tVar = (J2.t) this.purple;
        InterfaceC0364r mike = tVar.mike();
        float intBitsToFloat = Float.intBitsToFloat((int) (tVar.oscar() >> 32)) - (f11 + f5);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (tVar.oscar() & 4294967295L)) - (f12 + f10);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) >= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            AbstractC0345ae.alpha("Width and height must be greater than or equal to zero");
        }
        tVar.yankee(floatToRawIntBits);
        mike.mike(f5, f10);
    }

    public void ochre(float f5, long j5) {
        InterfaceC0364r mike = ((J2.t) this.purple).mike();
        int i4 = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        mike.mike(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5));
        mike.delta(f5);
        mike.mike(-Float.intBitsToFloat(i4), -Float.intBitsToFloat(i5));
    }

    @Override // be.InterfaceC0757c
    public void onSuccess(Object obj) {
        switch (this.alpha) {
            case 0:
                return;
            default:
                V0.h hVar = (V0.h) this.purple;
                try {
                    hVar.bravo(obj);
                    return;
                } catch (Throwable th) {
                    hVar.delta(th);
                    return;
                }
        }
    }

    @Override // androidx.camera.core.impl.af
    public /* synthetic */ androidx.camera.core.impl.ae pink(C0505c c0505c) {
        return P0.hotel(this, c0505c);
    }

    @Override // androidx.camera.core.impl.af
    public /* synthetic */ Object plum(C0505c c0505c, Object obj) {
        return P0.whiskey(this, c0505c, obj);
    }

    public void purple(float f5, float f10, long j5) {
        InterfaceC0364r mike = ((J2.t) this.purple).mike();
        int i4 = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        mike.mike(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5));
        mike.bravo(f5, f10);
        mike.mike(-Float.intBitsToFloat(i4), -Float.intBitsToFloat(i5));
    }

    @Override // androidx.camera.core.impl.af
    public /* synthetic */ Object quebec(C0505c c0505c) {
        return P0.victor(this, c0505c);
    }

    public void red(float f5, float f10) {
        ((J2.t) this.purple).mike().mike(f5, f10);
    }

    @Override // androidx.camera.core.impl.af
    public /* synthetic */ Set romeo() {
        return P0.oscar(this);
    }

    @Override // ao.j
    public boolean sierra(ao.l lVar, MenuItem menuItem) {
        boolean navy;
        int i4 = 1;
        com.google.android.material.navigation.f fVar = ((NavigationView) this.purple).f8089c;
        if (fVar != null) {
            int i5 = HomeActivityV2.f12269k0;
            Intrinsics.echo(menuItem, "menuItem");
            long uptimeMillis = SystemClock.uptimeMillis();
            HomeActivityV2 homeActivityV2 = (HomeActivityV2) ((B2.s) fVar).purple;
            if (uptimeMillis - homeActivityV2.f12290c0 < homeActivityV2.f12291d0) {
                ((DrawerLayout) homeActivityV2.jade().red).charlie(false);
                navy = false;
            } else {
                homeActivityV2.f12290c0 = uptimeMillis;
                if (menuItem.getItemId() == R.id.nav_support) {
                    navy = homeActivityV2.navy(new Jb.ao(homeActivityV2, i4));
                } else {
                    navy = homeActivityV2.navy(new Ac.g(9, homeActivityV2, menuItem));
                }
                ((DrawerLayout) homeActivityV2.jade().red).charlie(false);
            }
            if (navy) {
                return true;
            }
        }
        return false;
    }

    public void silver(int i4, String str, List list, boolean z2, boolean z10) {
        a4.j jVar;
        int i5 = i4 - 1;
        com.google.android.gms.measurement.internal.A a6 = (com.google.android.gms.measurement.internal.A) this.purple;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        com.google.android.gms.measurement.internal.ar arVar = ((G) a6.alpha).f7507b;
                        G.foxtrot(arVar);
                        jVar = arVar.e;
                    } else if (z2) {
                        com.google.android.gms.measurement.internal.ar arVar2 = ((G) a6.alpha).f7507b;
                        G.foxtrot(arVar2);
                        jVar = arVar2.f7633c;
                    } else if (!z10) {
                        com.google.android.gms.measurement.internal.ar arVar3 = ((G) a6.alpha).f7507b;
                        G.foxtrot(arVar3);
                        jVar = arVar3.f7634d;
                    } else {
                        com.google.android.gms.measurement.internal.ar arVar4 = ((G) a6.alpha).f7507b;
                        G.foxtrot(arVar4);
                        jVar = arVar4.f7632b;
                    }
                } else {
                    com.google.android.gms.measurement.internal.ar arVar5 = ((G) a6.alpha).f7507b;
                    G.foxtrot(arVar5);
                    jVar = arVar5.f7636g;
                }
            } else if (z2) {
                com.google.android.gms.measurement.internal.ar arVar6 = ((G) a6.alpha).f7507b;
                G.foxtrot(arVar6);
                jVar = arVar6.yellow;
            } else if (!z10) {
                com.google.android.gms.measurement.internal.ar arVar7 = ((G) a6.alpha).f7507b;
                G.foxtrot(arVar7);
                jVar = arVar7.f7631a;
            } else {
                com.google.android.gms.measurement.internal.ar arVar8 = ((G) a6.alpha).f7507b;
                G.foxtrot(arVar8);
                jVar = arVar8.white;
            }
        } else {
            com.google.android.gms.measurement.internal.ar arVar9 = ((G) a6.alpha).f7507b;
            G.foxtrot(arVar9);
            jVar = arVar9.f7635f;
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    jVar.alpha(str);
                    return;
                } else {
                    jVar.delta(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            jVar.charlie(list.get(0), list.get(1), str);
            return;
        }
        jVar.bravo(list.get(0), str);
    }

    public void teal(U u4, int i4) {
        EnumC1442f enumC1442f = EnumC1442f.UNSET;
        if (i4 != -30) {
            if (i4 != -20) {
                if (i4 != -10) {
                    if (i4 != 0) {
                        if (i4 == 30) {
                            enumC1442f = EnumC1442f.INITIALIZATION;
                        }
                    }
                } else {
                    enumC1442f = EnumC1442f.MANIFEST;
                }
            }
            enumC1442f = EnumC1442f.API;
        } else {
            enumC1442f = EnumC1442f.TCF;
        }
        ((EnumMap) this.purple).put((EnumMap) u4, (U) enumC1442f);
    }

    public String toString() {
        switch (this.alpha) {
            case 18:
                StringBuilder sb2 = new StringBuilder("1");
                for (U u4 : U.values()) {
                    EnumC1442f enumC1442f = (EnumC1442f) ((EnumMap) this.purple).get(u4);
                    if (enumC1442f == null) {
                        enumC1442f = EnumC1442f.UNSET;
                    }
                    sb2.append(enumC1442f.alpha);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // d7.InterfaceC1591a
    public void whiskey(Typeface typeface) {
        com.google.android.material.internal.b bVar = (com.google.android.material.internal.b) this.purple;
        if (bVar.zulu(typeface)) {
            bVar.lima(false);
        }
    }

    public void white(U u4, EnumC1442f enumC1442f) {
        ((EnumMap) this.purple).put((EnumMap) u4, (U) enumC1442f);
    }

    public ah(EnumMap enumMap) {
        this.alpha = 18;
        EnumMap enumMap2 = new EnumMap(U.class);
        this.purple = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public ah(V8.c cVar) {
        this.alpha = 14;
        this.purple = Collections.unmodifiableMap(new HashMap(cVar.alpha));
    }

    public ah(bd.h hVar) {
        this.alpha = 1;
        this.purple = new AtomicInteger(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[LOOP:1: B:14:0x0048->B:15:0x004a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ah(int[] iArr, float[] fArr, float[][] fArr2) {
        int i4;
        int length;
        int i5;
        this.alpha = 9;
        int length2 = fArr.length - 1;
        C0794t[][] c0794tArr = new C0794t[length2];
        int i10 = 1;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length2) {
            int i13 = iArr[i12];
            int i14 = 3;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            i14 = 4;
                            if (i13 != 4) {
                                i14 = 5;
                                if (i13 != 5) {
                                    i4 = i11;
                                    float[] fArr3 = fArr2[i12];
                                    int i15 = i12 + 1;
                                    float[] fArr4 = fArr2[i15];
                                    float f5 = fArr[i12];
                                    float f10 = fArr[i15];
                                    length = (fArr3.length % 2) + (fArr3.length / 2);
                                    C0794t[] c0794tArr2 = new C0794t[length];
                                    i5 = 0;
                                    while (i5 < length) {
                                        int i16 = i5 * 2;
                                        C0794t[] c0794tArr3 = c0794tArr2;
                                        int i17 = i5;
                                        int i18 = i16 + 1;
                                        c0794tArr3[i17] = new C0794t(i4, f5, f10, fArr3[i16], fArr3[i18], fArr4[i16], fArr4[i18]);
                                        i5 = i17 + 1;
                                        c0794tArr2 = c0794tArr3;
                                    }
                                    c0794tArr[i12] = c0794tArr2;
                                    i12 = i15;
                                    i11 = i4;
                                }
                            }
                        }
                    }
                    i10 = 2;
                    i4 = i10;
                    float[] fArr32 = fArr2[i12];
                    int i152 = i12 + 1;
                    float[] fArr42 = fArr2[i152];
                    float f52 = fArr[i12];
                    float f102 = fArr[i152];
                    length = (fArr32.length % 2) + (fArr32.length / 2);
                    C0794t[] c0794tArr22 = new C0794t[length];
                    i5 = 0;
                    while (i5 < length) {
                    }
                    c0794tArr[i12] = c0794tArr22;
                    i12 = i152;
                    i11 = i4;
                }
                i10 = 1;
                i4 = i10;
                float[] fArr322 = fArr2[i12];
                int i1522 = i12 + 1;
                float[] fArr422 = fArr2[i1522];
                float f522 = fArr[i12];
                float f1022 = fArr[i1522];
                length = (fArr322.length % 2) + (fArr322.length / 2);
                C0794t[] c0794tArr222 = new C0794t[length];
                i5 = 0;
                while (i5 < length) {
                }
                c0794tArr[i12] = c0794tArr222;
                i12 = i1522;
                i11 = i4;
            }
            i4 = i14;
            float[] fArr3222 = fArr2[i12];
            int i15222 = i12 + 1;
            float[] fArr4222 = fArr2[i15222];
            float f5222 = fArr[i12];
            float f10222 = fArr[i15222];
            length = (fArr3222.length % 2) + (fArr3222.length / 2);
            C0794t[] c0794tArr2222 = new C0794t[length];
            i5 = 0;
            while (i5 < length) {
            }
            c0794tArr[i12] = c0794tArr2222;
            i12 = i15222;
            i11 = i4;
        }
        this.purple = c0794tArr;
    }

    public ah(Q3.c cVar, int i4) {
        this.alpha = i4;
        switch (i4) {
            case 3:
                this.purple = (CaptureSessionOnClosedNotCalledQuirk) cVar.delta(CaptureSessionOnClosedNotCalledQuirk.class);
                return;
            default:
                AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) cVar.delta(AeFpsRangeLegacyQuirk.class);
                if (aeFpsRangeLegacyQuirk == null) {
                    this.purple = null;
                    return;
                } else {
                    this.purple = aeFpsRangeLegacyQuirk.alpha;
                    return;
                }
        }
    }

    public ah(Context context) {
        boolean isEmpty;
        this.alpha = 28;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.purple = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                maroon();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    public ah(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 5:
                return;
            case 18:
                this.purple = new EnumMap(U.class);
                return;
            case 29:
                if (Build.VERSION.SDK_INT >= 24) {
                    this.purple = new f1.k();
                    return;
                } else {
                    this.purple = new com.google.android.gms.measurement.internal.r(9);
                    return;
                }
            default:
                this.purple = (ExtraCroppingQuirk) ax.b.alpha.delta(ExtraCroppingQuirk.class);
                return;
        }
    }

    public ah(float f5, float f10, bz.r rVar) {
        InterfaceC0793s ahVar;
        this.alpha = 11;
        int[] iArr = j0.alpha;
        if (rVar != null) {
            ahVar = new androidx.core.widget.f(f5, f10, rVar);
        } else {
            ahVar = new ah(f5, f10);
        }
        this.purple = new J2.n(ahVar);
    }

    public ah(float f5, float f10) {
        this.alpha = 10;
        this.purple = new bz.ac(f5, f10, 0.01f);
    }
}
