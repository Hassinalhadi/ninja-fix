package androidx.core.widget;

import B2.y;
import J2.t;
import R3.s;
import U0.ac;
import android.app.ActivityManager;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.appcompat.widget.InterfaceC0468m0;
import androidx.appcompat.widget.P0;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.core.D;
import androidx.camera.core.M;
import androidx.camera.core.ay;
import androidx.camera.core.impl.InterfaceC0519q;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.aq;
import androidx.camera.core.impl.ar;
import androidx.camera.core.r;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.RunnableC0643m;
import ao.n;
import av.C;
import av.ao;
import av.aw;
import be.InterfaceC0755a;
import be.InterfaceC0757c;
import bp.p;
import bx.L;
import bz.InterfaceC0793s;
import bz.ab;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.clevertap.android.sdk.Constants;
import com.fingerprintjs.android.fpjs_pro_internal.InterfaceC1242o0;
import com.google.android.gms.measurement.internal.C1459n0;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.O0;
import com.google.android.gms.measurement.internal.S;
import com.google.android.gms.measurement.internal.Z0;
import com.google.android.gms.measurement.internal.ax;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import d7.InterfaceC1591a;
import e6.C1629a;
import g1.AbstractC1735d;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import s1.InterfaceC2587u;
import s1.a0;
import s6.T7;
import t6.AbstractC3066u3;
import t6.j4;

/* loaded from: classes3.dex */
public final class f implements InterfaceC0468m0, C, InterfaceC0757c, ar, InterfaceC0755a, V0.i, ay, InterfaceC0793s, ac, Z3.a, com.bumptech.glide.load.resource.bitmap.k, E3.g, InterfaceC1242o0, InterfaceC2587u, InterfaceC1591a {
    public static int red = 0;
    public static int silver = 1;
    public final /* synthetic */ int alpha;
    public Object purple;

    public /* synthetic */ f(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    public static D amber(androidx.camera.core.ar arVar) {
        if (arVar == null) {
            return null;
        }
        return new D(arVar, new Size(arVar.bravo(), arVar.alpha()), new bf.c(new bn.g((InterfaceC0519q) null, V.bravo, arVar.red().getTimestamp())));
    }

    public static f azure(androidx.camera.camera2.internal.compat.j jVar) {
        DynamicRangeProfiles charlie;
        boolean z2;
        int i4 = Build.VERSION.SDK_INT;
        f fVar = null;
        if (i4 >= 33 && (charlie = aw.a.charlie(jVar.alpha(aw.a.bravo()))) != null) {
            if (i4 >= 33) {
                z2 = true;
            } else {
                z2 = false;
            }
            T7.golf("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", z2);
            fVar = new f(5, new aw.d(charlie));
        }
        if (fVar == null) {
            return aw.e.alpha;
        }
        return fVar;
    }

    public static f beige(String str) {
        S s3;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            s3 = com.google.android.gms.measurement.internal.V.charlie(str.charAt(0));
        } else {
            s3 = S.UNINITIALIZED;
        }
        return new f(23, s3);
    }

    public static final /* synthetic */ UserManager zulu(f fVar) {
        int i4 = silver;
        red = ((i4 ^ 43) + ((i4 & 43) << 1)) % 128;
        UserManager userManager = (UserManager) fVar.purple;
        int i5 = ((i4 | 67) << 1) - (i4 ^ 67);
        red = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 60 / 0;
        }
        return userManager;
    }

    @Override // androidx.camera.core.impl.ar
    public int alpha() {
        return ((s) this.purple).alpha();
    }

    @Override // be.InterfaceC0755a
    public com.google.common.util.concurrent.e apply(Object obj) {
        return be.h.charlie(((ar.a) this.purple).mo11apply(obj));
    }

    @Override // be.InterfaceC0757c
    public void b(Throwable th) {
        aw awVar;
        aw awVar2 = (aw) this.purple;
        awVar2.quebec();
        awVar2.uniform.charlie();
        ao aoVar = awVar2.bravo;
        Iterator it = aoVar.xray().iterator();
        while (it.hasNext() && (awVar = (aw) it.next()) != awVar2) {
            awVar.quebec();
            awVar.uniform.charlie();
        }
        synchronized (aoVar.purple) {
            ((LinkedHashSet) aoVar.teal).remove(awVar2);
        }
    }

    @Override // V0.i
    public Object black(V0.h hVar) {
        boolean z2;
        be.k kVar = (be.k) this.purple;
        if (kVar.white == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.golf("The result can only set once!", z2);
        kVar.white = hVar;
        return "ListFuture[" + this + Constants.AES_SUFFIX;
    }

    public void blue() {
        O0 o02 = (O0) this.purple;
        o02.W();
        G g2 = (G) o02.alpha;
        ax axVar = g2.f7506a;
        G.delta(axVar);
        C1629a c1629a = g2.f7511g;
        c1629a.getClass();
        if (axVar.f0(System.currentTimeMillis())) {
            ax axVar2 = g2.f7506a;
            G.delta(axVar2);
            axVar2.f7642f.bravo(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                com.google.android.gms.measurement.internal.ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.f7636g.alpha("Detected application was in foreground");
                c1629a.getClass();
                crimson(System.currentTimeMillis());
            }
        }
    }

    @Override // androidx.camera.core.impl.ar
    public int bravo() {
        return ((s) this.purple).bravo();
    }

    public void bronze(String str, String str2, Bundle bundle) {
        switch (this.alpha) {
            case 25:
                boolean isEmpty = TextUtils.isEmpty(str);
                C1459n0 c1459n0 = (C1459n0) this.purple;
                if (isEmpty) {
                    ((G) c1459n0.alpha).f7511g.getClass();
                    c1459n0.g0("auto", "_err", bundle, true, true, System.currentTimeMillis());
                    return;
                } else {
                    c1459n0.getClass();
                    throw new IllegalStateException("Unexpected call on client side");
                }
            default:
                boolean isEmpty2 = TextUtils.isEmpty(str);
                Z0 z02 = (Z0) this.purple;
                if (isEmpty2) {
                    G g2 = z02.e;
                    if (g2 != null) {
                        com.google.android.gms.measurement.internal.ar arVar = g2.f7507b;
                        G.foxtrot(arVar);
                        arVar.white.bravo(str2, "AppId not known when logging event");
                    }
                    return;
                }
                z02.u().g0(new ao.d(this, str, str2, bundle, 9));
                return;
        }
    }

    @Override // av.C
    public void charlie(TotalCaptureResult totalCaptureResult) {
    }

    @Override // androidx.camera.core.impl.ar
    public void close() {
        ((s) this.purple).close();
    }

    public void coral(long j5) {
        O0 o02 = (O0) this.purple;
        o02.W();
        o02.a0();
        G g2 = (G) o02.alpha;
        ax axVar = g2.f7506a;
        G.delta(axVar);
        boolean f02 = axVar.f0(j5);
        ax axVar2 = g2.f7506a;
        if (f02) {
            G.delta(axVar2);
            axVar2.f7642f.bravo(true);
            g2.india().e0();
        }
        G.delta(axVar2);
        axVar2.f7646j.bravo(j5);
        if (axVar2.f7642f.charlie()) {
            crimson(j5);
        }
    }

    public void crimson(long j5) {
        O0 o02 = (O0) this.purple;
        o02.W();
        G g2 = (G) o02.alpha;
        if (g2.alpha()) {
            ax axVar = g2.f7506a;
            G.delta(axVar);
            axVar.f7646j.bravo(j5);
            g2.f7511g.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            com.google.android.gms.measurement.internal.ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7636g.bravo(Long.valueOf(elapsedRealtime), "Session started, time");
            long j6 = j5 / 1000;
            Long valueOf = Long.valueOf(j6);
            C1459n0 c1459n0 = g2.f7513i;
            G.echo(c1459n0);
            c1459n0.r0(j5, valueOf, "auto", "_sid");
            G.delta(axVar);
            axVar.f7647k.bravo(j6);
            axVar.f7642f.bravo(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j6);
            G.echo(c1459n0);
            c1459n0.i0(j5, bundle, "auto", "_s");
            String november = axVar.f7652p.november();
            if (!TextUtils.isEmpty(november)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", november);
                G.echo(c1459n0);
                c1459n0.i0(j5, bundle2, "auto", "_ssr");
            }
        }
    }

    @Override // av.C
    public void delta(r rVar) {
    }

    @Override // E3.g
    public void echo(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.purple)) {
            ((ByteBuffer) this.purple).position(0);
            messageDigest.update(((ByteBuffer) this.purple).putInt(num.intValue()).array());
        }
    }

    @Override // androidx.camera.core.impl.ar
    public androidx.camera.core.ar foxtrot() {
        return amber(((s) this.purple).foxtrot());
    }

    @Override // bz.InterfaceC0793s
    public ab get(int i4) {
        switch (this.alpha) {
            case 15:
                return ((bz.ac[]) this.purple)[i4];
            default:
                return (ab) this.purple;
        }
    }

    @Override // s1.InterfaceC2587u
    public a0 gold(View view, a0 a0Var) {
        a0 a0Var2;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.purple;
        if (collapsingToolbarLayout.getFitsSystemWindows()) {
            a0Var2 = a0Var;
        } else {
            a0Var2 = null;
        }
        if (!Objects.equals(collapsingToolbarLayout.f7814x, a0Var2)) {
            collapsingToolbarLayout.f7814x = a0Var2;
            collapsingToolbarLayout.requestLayout();
        }
        return a0Var.alpha.charlie();
    }

    @Override // androidx.camera.core.impl.ar
    public int golf() {
        return ((s) this.purple).golf();
    }

    @Override // androidx.appcompat.widget.InterfaceC0468m0
    public void hotel(ao.l lVar, n nVar) {
        ao.f fVar = (ao.f) this.purple;
        ao.e eVar = null;
        fVar.white.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f3184a;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                if (lVar == ((ao.e) arrayList.get(i4)).bravo) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 == -1) {
            return;
        }
        int i5 = i4 + 1;
        if (i5 < arrayList.size()) {
            eVar = (ao.e) arrayList.get(i5);
        }
        fVar.white.postAtTime(new ao.d(this, eVar, nVar, lVar, 0), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.k
    public long india(long j5) {
        if (j5 < 0) {
            return 0L;
        }
        long j6 = j5;
        while (j6 > 0) {
            InputStream inputStream = (InputStream) this.purple;
            long skip = inputStream.skip(j6);
            if (skip > 0) {
                j6 -= skip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j6--;
            }
        }
        return j5 - j6;
    }

    @Override // av.C
    public float juliet() {
        Float f5 = (Float) ((androidx.camera.camera2.internal.compat.j) this.purple).alpha(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f5 == null || f5.floatValue() < 1.0f) {
            return 1.0f;
        }
        return f5.floatValue();
    }

    @Override // Z3.a
    public Object kilo() {
        B0.a aVar = (B0.a) this.purple;
        return new com.bumptech.glide.load.engine.i((com.google.android.gms.common.f) aVar.charlie, (t) aVar.delta);
    }

    @Override // androidx.camera.core.impl.ar
    public void lima() {
        ((s) this.purple).lima();
    }

    @Override // com.bumptech.glide.load.resource.bitmap.k
    public int mike() {
        return (sierra() << 8) | sierra();
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [bp.i, bp.r] */
    @Override // androidx.camera.core.ay
    public void november(M m4) {
        p pVar;
        if (!j4.charlie()) {
            AbstractC1735d.delta(((PreviewView) this.purple).getContext()).execute(new RunnableC0643m(13, this, m4));
            return;
        }
        AbstractC3066u3.bravo("PreviewView", "Surface requested by Preview.");
        InterfaceC0525x interfaceC0525x = m4.delta;
        ((PreviewView) this.purple).f2961b = interfaceC0525x.oscar();
        bp.j jVar = ((PreviewView) this.purple).f2960a;
        Rect gold = interfaceC0525x.golf().gold();
        jVar.getClass();
        new Rational(gold.width(), gold.height());
        synchronized (jVar) {
            jVar.bravo = gold;
        }
        m4.bravo(AbstractC1735d.delta(((PreviewView) this.purple).getContext()), new A2.p(this, interfaceC0525x, m4, 13));
        PreviewView previewView = (PreviewView) this.purple;
        bp.i iVar = previewView.purple;
        bp.f fVar = previewView.alpha;
        if (!(iVar instanceof p) || PreviewView.bravo(m4, fVar)) {
            PreviewView previewView2 = (PreviewView) this.purple;
            if (PreviewView.bravo(m4, previewView2.alpha)) {
                PreviewView previewView3 = (PreviewView) this.purple;
                ?? iVar2 = new bp.i(previewView3, previewView3.silver);
                iVar2.india = false;
                iVar2.kilo = new AtomicReference();
                pVar = iVar2;
            } else {
                PreviewView previewView4 = (PreviewView) this.purple;
                pVar = new p(previewView4, previewView4.silver);
            }
            previewView2.purple = pVar;
        }
        InterfaceC0523v oscar = interfaceC0525x.oscar();
        PreviewView previewView5 = (PreviewView) this.purple;
        bp.c cVar = new bp.c(oscar, previewView5.white, previewView5.purple);
        ((PreviewView) this.purple).yellow.set(cVar);
        interfaceC0525x.foxtrot().kilo(AbstractC1735d.delta(((PreviewView) this.purple).getContext()), cVar);
        ((PreviewView) this.purple).purple.echo(m4, new A2.p(this, cVar, interfaceC0525x, 14));
        PreviewView previewView6 = (PreviewView) this.purple;
        if (previewView6.indexOfChild(previewView6.red) == -1) {
            PreviewView previewView7 = (PreviewView) this.purple;
            previewView7.addView(previewView7.red);
        }
    }

    @Override // be.InterfaceC0757c
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // U0.ac
    public long oscar(Q0.l lVar, long j5, Q0.n nVar, long j6) {
        boolean z2;
        int i4 = lVar.alpha + ((int) (((Q0.k) ((Function0) this.purple).invoke()).alpha >> 32));
        int i5 = (int) (j6 >> 32);
        int i10 = (int) (j5 >> 32);
        if (nVar == Q0.n.alpha) {
            z2 = true;
        } else {
            z2 = false;
        }
        return (y.alpha(i4, i5, i10, z2) << 32) | (y.alpha(lVar.bravo + ((int) (r0 & 4294967295L)), (int) (j6 & 4294967295L), (int) (j5 & 4294967295L), true) & 4294967295L);
    }

    @Override // av.C
    public float papa() {
        return 1.0f;
    }

    @Override // androidx.appcompat.widget.InterfaceC0468m0
    public void quebec(ao.l lVar, n nVar) {
        ((ao.f) this.purple).white.removeCallbacksAndMessages(lVar);
    }

    @Override // androidx.camera.core.impl.ar
    public Surface romeo() {
        return ((s) this.purple).romeo();
    }

    @Override // com.bumptech.glide.load.resource.bitmap.k
    public short sierra() {
        int read = ((InputStream) this.purple).read();
        if (read != -1) {
            return (short) read;
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // com.bumptech.glide.load.resource.bitmap.k
    public int tango(int i4, byte[] bArr) {
        int i5 = 0;
        int i10 = 0;
        while (i5 < i4 && (i10 = ((InputStream) this.purple).read(bArr, i5, i4 - i5)) != -1) {
            i5 += i10;
        }
        if (i5 == 0 && i10 == -1) {
            throw new DefaultImageHeaderParser$Reader$EndOfFileException();
        }
        return i5;
    }

    public String toString() {
        String str;
        switch (this.alpha) {
            case 18:
                StringBuilder sb2 = new StringBuilder("NotNullProperty(");
                if (((Integer) this.purple) != null) {
                    str = "value=" + ((Integer) this.purple);
                } else {
                    str = "value not initialized yet";
                }
                return P0.fuchsia(sb2, str, ')');
            default:
                return super.toString();
        }
    }

    @Override // androidx.camera.core.impl.ar
    public int uniform() {
        return ((s) this.purple).uniform();
    }

    @Override // androidx.camera.core.impl.ar
    public androidx.camera.core.ar victor() {
        return amber(((s) this.purple).victor());
    }

    @Override // d7.InterfaceC1591a
    public void whiskey(Typeface typeface) {
        com.google.android.material.internal.b bVar = (com.google.android.material.internal.b) this.purple;
        if (bVar.tango(typeface)) {
            bVar.lima(false);
        }
    }

    @Override // av.C
    public void xray() {
    }

    @Override // androidx.camera.core.impl.ar
    public void yankee(aq aqVar, Executor executor) {
        ((s) this.purple).yankee(new A2.ao(18, this, aqVar), executor);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, G.a] */
    public f(Q0.d dVar) {
        this.alpha = 14;
        float f5 = L.alpha;
        ?? obj = new Object();
        obj.alpha = f5;
        float alpha = dVar.alpha();
        float f10 = bx.D.alpha;
        obj.bravo = alpha * 386.0878f * 160.0f * 0.84f;
        this.purple = obj;
    }

    public f(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 7:
                this.purple = (ExtraSupportedSurfaceCombinationsQuirk) ax.b.alpha.delta(ExtraSupportedSurfaceCombinationsQuirk.class);
                return;
            case 8:
                this.purple = (ExtraCroppingQuirk) ax.b.alpha.delta(ExtraCroppingQuirk.class);
                return;
            case 18:
                return;
            case 21:
                this.purple = ByteBuffer.allocate(4);
                return;
            default:
                this.purple = (SmallDisplaySizeQuirk) ax.b.alpha.delta(SmallDisplaySizeQuirk.class);
                return;
        }
    }

    public f(R.c cVar) {
        this.alpha = 9;
        this.purple = new WeakReference(cVar);
    }

    public f(float f5, float f10, bz.r rVar) {
        this.alpha = 15;
        int bravo = rVar.bravo();
        bz.ac[] acVarArr = new bz.ac[bravo];
        for (int i4 = 0; i4 < bravo; i4++) {
            acVarArr[i4] = new bz.ac(f5, f10, rVar.alpha(i4));
        }
        this.purple = acVarArr;
    }
}
