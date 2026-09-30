package Ya;

import Ac.k;
import F.C0130l1;
import J2.t;
import Q0.n;
import R.g;
import Xd.l;
import Yb.C0304f0;
import Yb.C0321o;
import Yb.C0324p0;
import a0.AbstractC0358l;
import a0.C0344ad;
import a0.C0348b;
import a0.C0352f;
import a0.C0354h;
import a0.C0360n;
import a0.C0366t;
import a0.InterfaceC0364r;
import a0.ah;
import a0.ai;
import a0.aj;
import a0.ao;
import a0.au;
import a2.C0393r;
import ae.C0428g;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.lazy.layout.ad;
import androidx.compose.runtime.C0590w;
import androidx.compose.runtime.S;
import androidx.compose.runtime.Y;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.navigation.fragment.FragmentNavigator;
import av.q;
import b.C0708x;
import b.aa;
import b.c0;
import b.g0;
import bv.am;
import bz.AbstractC0779d;
import bz.C0786k;
import c0.C0801a;
import c0.h;
import com.app.network.network.models.CustomerPhoneResponse;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabExecutor;
import com.checkout.components.rememberme.di.RememberMeModule;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inapp.images.preload.FilePreloaderCoroutine;
import com.clevertap.android.sdk.inapp.images.preload.FilePreloaderExecutors;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import com.clevertap.android.sdk.task.CTExecutors;
import com.clevertap.android.sdk.variables.Var;
import com.clevertap.android.sdk.variables.VarCache;
import d.C1530f0;
import d.C1535i;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import hd.w;
import hd.x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import n.C2122B;
import org.json.JSONObject;
import q0.aq;
import q0.z;
import r3.C2492a;
import s0.j0;
import s6.AbstractC2627c7;
import s6.J4;
import t0.C2915g0;
import t6.L2;
import t6.R3;
import vf.I;
import yf.N;
import zd.i;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ c(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0165, code lost:
    
        if (((d.P) r0).alpha != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x031b, code lost:
    
        if (r24 != false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0338  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        boolean z2;
        float ceil;
        boolean z10;
        final c0.e hVar;
        int i4;
        C0360n c0360n;
        C0360n c0360n2;
        C0344ad c0344ad;
        C0344ad c0344ad2;
        boolean z11;
        long j5;
        c0.b bVar;
        float f5;
        float f10;
        t tVar;
        long oscar;
        Unit a6;
        boolean filterNonRegisteredCustomTemplates$lambda$11;
        Object preloadFilesAndCache$lambda$0;
        CTExecutors executors$lambda$1;
        Unit lambda$fileVarUpdated$2;
        Z.c c3;
        int i5 = 5;
        int i10 = 2;
        boolean z12 = false;
        switch (this.alpha) {
            case 0:
                C2492a c2492a = (C2492a) obj;
                int i11 = c2492a.alpha;
                d dVar = (d) this.purple;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            dVar.victor().bronze();
                        }
                    } else {
                        dVar.victor().tango();
                        List list = (List) c2492a.charlie;
                        Va.d dVar2 = dVar.f2278z;
                        if (dVar2 != null) {
                            dVar2.bravo(list);
                        } else {
                            Intrinsics.lima("adapter");
                            throw null;
                        }
                    }
                } else {
                    dVar.victor().tango();
                    String str2 = c2492a.bravo;
                    if (str2 == null) {
                        return Unit.INSTANCE;
                    }
                    dVar.black(str2);
                }
                return Unit.INSTANCE;
            case 1:
                C2492a c2492a2 = (C2492a) obj;
                int i12 = c2492a2.alpha;
                C0321o c0321o = (C0321o) this.purple;
                ax axVar = c0321o.f2432s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        CustomerPhoneResponse customerPhoneResponse = (CustomerPhoneResponse) c2492a2.charlie;
                        if (customerPhoneResponse != null) {
                            str = customerPhoneResponse.getPhone();
                        } else {
                            str = null;
                        }
                        if (str != null && !StringsKt.gray(str)) {
                            c0321o.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(str))));
                            c0321o.kilo();
                        } else {
                            String string = c0321o.getString(R.string.phone_not_available);
                            Intrinsics.delta(string, "getString(...)");
                            c0321o.black(string);
                            ((t0) axVar).setValue(Boolean.FALSE);
                        }
                    }
                } else {
                    String str3 = c2492a2.bravo;
                    if (str3 == null) {
                        str3 = "";
                    }
                    c0321o.black(str3);
                    ((t0) axVar).setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 2:
                String pin = (String) obj;
                Intrinsics.echo(pin, "pin");
                C0304f0 c0304f0 = (C0304f0) this.purple;
                Function1 function1 = c0304f0.f2410u;
                if (function1 != null) {
                    function1.invoke(pin);
                }
                c0304f0.lima(false, false);
                return Unit.INSTANCE;
            case 3:
                String pin2 = (String) obj;
                int i13 = ProcessOrderActivityV2.f12378N0;
                Intrinsics.echo(pin2, "pin");
                ((X9.e) this.purple).invoke(pin2);
                return Unit.INSTANCE;
            case 4:
                C2492a c2492a3 = (C2492a) obj;
                ((k) this.purple).invoke(Integer.valueOf(c2492a3.alpha), c2492a3.bravo);
                return Unit.INSTANCE;
            case 5:
                Integer num = (Integer) obj;
                num.getClass();
                Zb.b bVar2 = (Zb.b) this.purple;
                C0324p0 c0324p0 = bVar2.f2527u;
                if (c0324p0 != null) {
                    c0324p0.invoke(num);
                }
                bVar2.juliet();
                return Unit.INSTANCE;
            case 6:
                J.e eVar = (J.e) this.purple;
                Object[] objArr = eVar.alpha;
                int i14 = eVar.red;
                for (int i15 = 0; i15 < i14; i15++) {
                    ((aq) objArr[i15]).delta();
                }
                return Unit.INSTANCE;
            case 7:
                C2915g0 c2915g0 = (C2915g0) obj;
                c2915g0.alpha = "padding";
                c2915g0.charlie.bravo((L) this.purple, "paddingValues");
                return Unit.INSTANCE;
            case 8:
                return new C0130l1(6, (androidx.compose.foundation.lazy.layout.t) this.purple);
            case 9:
                return new C0130l1(8, (ad) this.purple);
            case 10:
                g gVar = (g) this.purple;
                if (gVar != null) {
                    z2 = gVar.bravo(obj);
                } else {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 11:
                ((C0590w) this.purple).zulu(obj);
                return Unit.INSTANCE;
            case 12:
                Y y10 = (Y) this.purple;
                Throwable th = (Throwable) obj;
                CancellationException alpha = vf.ad.alpha("Recomposer effect job completed", th);
                synchronized (y10.bravo) {
                    try {
                        I i16 = y10.charlie;
                        if (i16 != null) {
                            N n5 = y10.tango;
                            S s3 = S.purple;
                            n5.getClass();
                            n5.juliet(null, s3);
                            i16.foxtrot(alpha);
                            y10.quebec = null;
                            i16.crimson(new C0393r(11, y10, th));
                        } else {
                            y10.delta = alpha;
                            N n10 = y10.tango;
                            S s9 = S.alpha;
                            n10.getClass();
                            n10.juliet(null, s9);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return Unit.INSTANCE;
            case 13:
                if (obj instanceof S.ad) {
                    ((S.ad) obj).golf(4);
                }
                ((am) this.purple).alpha(obj);
                return Unit.INSTANCE;
            case 14:
                X.c cVar = (X.c) obj;
                aa aaVar = (aa) this.purple;
                if (cVar.alpha() * aaVar.silver >= 0.0f && Z.e.charlie(cVar.alpha.bravo()) > 0.0f) {
                    if (Q0.g.alpha(aaVar.silver, 0.0f)) {
                        ceil = 1.0f;
                    } else {
                        ceil = (float) Math.ceil(cVar.alpha() * aaVar.silver);
                    }
                    float f11 = 2;
                    final float min = Math.min(ceil, (float) Math.ceil(Z.e.charlie(cVar.alpha.bravo()) / f11));
                    final float f12 = min / f11;
                    final long floatToRawIntBits = (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
                    final long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar.alpha.bravo() >> 32)) - min) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar.alpha.bravo() & 4294967295L)) - min) & 4294967295L);
                    float f13 = min * f11;
                    if (f13 > Z.e.charlie(cVar.alpha.bravo())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ao alpha2 = aaVar.white.alpha(cVar.alpha.bravo(), cVar.alpha.getLayoutDirection(), cVar);
                    if (alpha2 instanceof ah) {
                        au auVar = aaVar.teal;
                        ah ahVar = (ah) alpha2;
                        if (z10) {
                            return cVar.charlie(new C0393r(13, ahVar, auVar));
                        }
                        if (q.kilo(auVar)) {
                            c0360n = new C0360n(C0366t.bravo(1.0f, auVar.alpha), 5);
                            i4 = 1;
                        } else {
                            i4 = 0;
                            c0360n = null;
                        }
                        Z.c alpha3 = ahVar.echo.alpha();
                        if (aaVar.red == null) {
                            aaVar.red = new C0708x();
                        }
                        C0708x c0708x = aaVar.red;
                        Intrinsics.checkNotNull(c0708x);
                        C0354h c0354h = c0708x.delta;
                        if (c0354h == null) {
                            c0354h = AbstractC0358l.alpha();
                            c0708x.delta = c0354h;
                        }
                        c0354h.delta();
                        Q0.c.india(c0354h, alpha3);
                        c0354h.charlie(c0354h, ahVar.echo, 0);
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        float f14 = alpha3.charlie;
                        float f15 = alpha3.alpha;
                        int ceil2 = (int) Math.ceil(f14 - f15);
                        float f16 = alpha3.delta;
                        float f17 = alpha3.bravo;
                        long ceil3 = (((int) Math.ceil(f16 - f17)) & 4294967295L) | (ceil2 << 32);
                        C0708x c0708x2 = aaVar.red;
                        Intrinsics.checkNotNull(c0708x2);
                        C0352f c0352f = c0708x2.alpha;
                        C0348b c0348b = c0708x2.bravo;
                        if (c0352f != null) {
                            c0360n2 = c0360n;
                            c0344ad = new C0344ad(c0352f.alpha());
                        } else {
                            c0360n2 = c0360n;
                            c0344ad = null;
                        }
                        try {
                            try {
                                if (c0344ad == null || c0344ad.alpha != 0) {
                                    if (c0352f != null) {
                                        c0344ad2 = new C0344ad(c0352f.alpha());
                                    } else {
                                        c0344ad2 = null;
                                    }
                                    if (!q.kilo(c0344ad2) || i4 != c0344ad2.alpha) {
                                        z11 = false;
                                        if (c0352f == null && c0348b != null) {
                                            j5 = ceil3;
                                            float intBitsToFloat = Float.intBitsToFloat((int) (cVar.alpha.bravo() >> 32));
                                            Bitmap bitmap = c0352f.alpha;
                                            if (intBitsToFloat <= bitmap.getWidth()) {
                                                if (Float.intBitsToFloat((int) (cVar.alpha.bravo() & 4294967295L)) <= bitmap.getHeight()) {
                                                }
                                            }
                                        } else {
                                            j5 = ceil3;
                                        }
                                        c0352f = ao.foxtrot((int) (j5 >> 32), (int) (j5 & 4294967295L), i4, 24);
                                        c0708x2.alpha = c0352f;
                                        c0348b = ao.alpha(c0352f);
                                        c0708x2.bravo = c0348b;
                                        bVar = c0708x2.charlie;
                                        if (bVar == null) {
                                            bVar = new c0.b();
                                            c0708x2.charlie = bVar;
                                        }
                                        long bravo = AbstractC2627c7.bravo(j5);
                                        n layoutDirection = cVar.alpha.getLayoutDirection();
                                        C0801a c0801a = bVar.alpha;
                                        Q0.d dVar3 = c0801a.alpha;
                                        c0.b bVar3 = bVar;
                                        n nVar = c0801a.bravo;
                                        InterfaceC0364r interfaceC0364r = c0801a.charlie;
                                        C0354h c0354h2 = c0354h;
                                        long j6 = c0801a.delta;
                                        c0801a.alpha = cVar;
                                        c0801a.bravo = layoutDirection;
                                        c0801a.charlie = c0348b;
                                        c0801a.delta = bravo;
                                        c0348b.golf();
                                        ao.ad.november(bVar3, C0366t.bravo, 0L, bravo, 0.0f, null, 58);
                                        f5 = -f15;
                                        f10 = -f17;
                                        tVar = bVar3.purple;
                                        ((av.ah) tVar.alpha).red(f5, f10);
                                        ao.ad.kilo(bVar3, ahVar.echo, auVar, 0.0f, new h(f13, 0.0f, 0, 0, null, 30), 52);
                                        C0348b c0348b2 = c0348b;
                                        float f18 = 1;
                                        float intBitsToFloat2 = (Float.intBitsToFloat((int) (tVar.oscar() >> 32)) + f18) / Float.intBitsToFloat((int) (tVar.oscar() >> 32));
                                        float intBitsToFloat3 = (Float.intBitsToFloat((int) (tVar.oscar() & 4294967295L)) + f18) / Float.intBitsToFloat((int) (tVar.oscar() & 4294967295L));
                                        long orange = bVar3.orange();
                                        oscar = tVar.oscar();
                                        tVar.mike().golf();
                                        ((av.ah) tVar.alpha).purple(intBitsToFloat2, intBitsToFloat3, orange);
                                        ao.ad.kilo(bVar3, c0354h2, auVar, 0.0f, null, 28);
                                        ((av.ah) tVar.alpha).red(-f5, -f10);
                                        c0348b2.november();
                                        c0801a.alpha = dVar3;
                                        c0801a.bravo = nVar;
                                        c0801a.charlie = interfaceC0364r;
                                        c0801a.delta = j6;
                                        c0352f.alpha.prepareToDraw();
                                        objectRef.alpha = c0352f;
                                        return cVar.charlie(new D0.n(alpha3, objectRef, j5, c0360n2));
                                    }
                                }
                                ((av.ah) tVar.alpha).purple(intBitsToFloat2, intBitsToFloat3, orange);
                                ao.ad.kilo(bVar3, c0354h2, auVar, 0.0f, null, 28);
                                ((av.ah) tVar.alpha).red(-f5, -f10);
                                c0348b2.november();
                                c0801a.alpha = dVar3;
                                c0801a.bravo = nVar;
                                c0801a.charlie = interfaceC0364r;
                                c0801a.delta = j6;
                                c0352f.alpha.prepareToDraw();
                                objectRef.alpha = c0352f;
                                return cVar.charlie(new D0.n(alpha3, objectRef, j5, c0360n2));
                            } finally {
                                tVar.mike().november();
                                tVar.yankee(oscar);
                            }
                            ao.ad.kilo(bVar3, ahVar.echo, auVar, 0.0f, new h(f13, 0.0f, 0, 0, null, 30), 52);
                            C0348b c0348b22 = c0348b;
                            float f182 = 1;
                            float intBitsToFloat22 = (Float.intBitsToFloat((int) (tVar.oscar() >> 32)) + f182) / Float.intBitsToFloat((int) (tVar.oscar() >> 32));
                            float intBitsToFloat32 = (Float.intBitsToFloat((int) (tVar.oscar() & 4294967295L)) + f182) / Float.intBitsToFloat((int) (tVar.oscar() & 4294967295L));
                            long orange2 = bVar3.orange();
                            oscar = tVar.oscar();
                            tVar.mike().golf();
                        } catch (Throwable th3) {
                            ((av.ah) tVar.alpha).red(-f5, -f10);
                            throw th3;
                        }
                        z11 = true;
                        if (c0352f == null) {
                        }
                        j5 = ceil3;
                        c0352f = ao.foxtrot((int) (j5 >> 32), (int) (j5 & 4294967295L), i4, 24);
                        c0708x2.alpha = c0352f;
                        c0348b = ao.alpha(c0352f);
                        c0708x2.bravo = c0348b;
                        bVar = c0708x2.charlie;
                        if (bVar == null) {
                        }
                        long bravo2 = AbstractC2627c7.bravo(j5);
                        n layoutDirection2 = cVar.alpha.getLayoutDirection();
                        C0801a c0801a2 = bVar.alpha;
                        Q0.d dVar32 = c0801a2.alpha;
                        c0.b bVar32 = bVar;
                        n nVar2 = c0801a2.bravo;
                        InterfaceC0364r interfaceC0364r2 = c0801a2.charlie;
                        C0354h c0354h22 = c0354h;
                        long j62 = c0801a2.delta;
                        c0801a2.alpha = cVar;
                        c0801a2.bravo = layoutDirection2;
                        c0801a2.charlie = c0348b;
                        c0801a2.delta = bravo2;
                        c0348b.golf();
                        ao.ad.november(bVar32, C0366t.bravo, 0L, bravo2, 0.0f, null, 58);
                        f5 = -f15;
                        f10 = -f17;
                        tVar = bVar32.purple;
                        ((av.ah) tVar.alpha).red(f5, f10);
                    } else {
                        if (alpha2 instanceof aj) {
                            final au auVar2 = aaVar.teal;
                            aj ajVar = (aj) alpha2;
                            boolean india = L2.india(ajVar.echo);
                            Z.d dVar4 = ajVar.echo;
                            if (india) {
                                final h hVar2 = new h(min, 0.0f, 0, 0, null, 30);
                                final long j7 = dVar4.echo;
                                final boolean z13 = z10;
                                return cVar.charlie(new Function1() { // from class: b.z
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        J2.t tVar2;
                                        long j10;
                                        s0.an anVar = (s0.an) obj2;
                                        anVar.charlie();
                                        boolean z14 = z13;
                                        a0.au auVar3 = auVar2;
                                        long j11 = j7;
                                        if (z14) {
                                            ao.ad.oscar(anVar, auVar3, 0L, 0L, j11, null, 246);
                                        } else {
                                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j11 >> 32));
                                            float f19 = f12;
                                            if (intBitsToFloat4 < f19) {
                                                c0.b bVar4 = anVar.alpha;
                                                float intBitsToFloat5 = Float.intBitsToFloat((int) (bVar4.purple.oscar() >> 32));
                                                float f20 = min;
                                                float f21 = intBitsToFloat5 - f20;
                                                float intBitsToFloat6 = Float.intBitsToFloat((int) (bVar4.purple.oscar() & 4294967295L)) - f20;
                                                J2.t tVar3 = bVar4.purple;
                                                long oscar2 = tVar3.oscar();
                                                tVar3.mike().golf();
                                                try {
                                                    ((J2.t) ((av.ah) tVar3.alpha).purple).mike().lima(f20, f20, f21, intBitsToFloat6, 0);
                                                    j10 = oscar2;
                                                    tVar2 = tVar3;
                                                    try {
                                                        ao.ad.oscar(anVar, auVar3, 0L, 0L, j11, null, 246);
                                                        ao.ad.coral(tVar2, j10);
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        ao.ad.coral(tVar2, j10);
                                                        throw th;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    tVar2 = tVar3;
                                                    j10 = oscar2;
                                                }
                                            } else {
                                                ao.ad.oscar(anVar, auVar3, floatToRawIntBits, floatToRawIntBits2, R3.echo(f19, j11), hVar2, 208);
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                            boolean z14 = z10;
                            if (aaVar.red == null) {
                                aaVar.red = new C0708x();
                            }
                            C0708x c0708x3 = aaVar.red;
                            Intrinsics.checkNotNull(c0708x3);
                            C0354h c0354h3 = c0708x3.delta;
                            if (c0354h3 == null) {
                                c0354h3 = AbstractC0358l.alpha();
                                c0708x3.delta = c0354h3;
                            }
                            c0354h3.delta();
                            Q0.c.juliet(c0354h3, dVar4);
                            if (!z14) {
                                C0354h alpha4 = AbstractC0358l.alpha();
                                Q0.c.juliet(alpha4, new Z.d(min, min, dVar4.bravo() - min, dVar4.alpha() - min, R3.echo(min, dVar4.echo), R3.echo(min, dVar4.foxtrot), R3.echo(min, dVar4.golf), R3.echo(min, dVar4.hotel)));
                                c0354h3.charlie(c0354h3, alpha4, 0);
                            }
                            return cVar.charlie(new C0393r(12, c0354h3, auVar2));
                        }
                        boolean z15 = z10;
                        if (alpha2 instanceof ai) {
                            final au auVar3 = aaVar.teal;
                            if (z15) {
                                floatToRawIntBits = 0;
                            }
                            final long j10 = floatToRawIntBits;
                            if (z15) {
                                floatToRawIntBits2 = cVar.alpha.bravo();
                            }
                            final long j11 = floatToRawIntBits2;
                            if (z15) {
                                hVar = c0.g.alpha;
                            } else {
                                hVar = new h(min, 0.0f, 0, 0, null, 30);
                            }
                            return cVar.charlie(new Function1() { // from class: b.y
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    s0.an anVar = (s0.an) obj2;
                                    anVar.charlie();
                                    ao.ad.mike(anVar, a0.au.this, j10, j11, 0.0f, hVar, 104);
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return cVar.charlie(new a5.c(9));
                }
                break;
            case 15:
                j0 j0Var = (j0) obj;
                kotlin.jvm.internal.q qVar = (kotlin.jvm.internal.q) this.purple;
                if (!qVar.alpha) {
                    Intrinsics.charlie(j0Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                    break;
                }
                z12 = true;
                qVar.alpha = z12;
                return Boolean.valueOf(!z12);
            case 16:
                b.ai aiVar = (b.ai) this.purple;
                if (aiVar.f3307a) {
                    aiVar.f3308b.invoke();
                }
                return Unit.INSTANCE;
            case 17:
                float floatValue = ((Float) obj).floatValue();
                g0 g0Var = (g0) this.purple;
                float foxtrot = g0Var.foxtrot() + floatValue + g0Var.echo;
                float charlie = J4.charlie(foxtrot, 0.0f, g0Var.delta.juliet());
                if (foxtrot == charlie) {
                    z12 = true;
                }
                float foxtrot2 = charlie - g0Var.foxtrot();
                int round = Math.round(foxtrot2);
                g0Var.alpha.kilo(g0Var.foxtrot() + round);
                g0Var.echo = foxtrot2 - round;
                if (!z12) {
                    floatValue = foxtrot2;
                }
                return Float.valueOf(floatValue);
            case 18:
                C0786k c0786k = (C0786k) obj;
                ((l) this.purple).invoke(((t0) c0786k.echo).getValue(), AbstractC0779d.juliet.bravo.invoke(c0786k.foxtrot));
                return Unit.INSTANCE;
            case 19:
                Y1.l entry = (Y1.l) obj;
                Intrinsics.echo(entry, "entry");
                return new C0428g(i10, (FragmentNavigator) this.purple, entry);
            case 20:
                a6 = RememberMeModule.a((PrimitiveStateFlowRepository) this.purple, (String) obj);
                return a6;
            case 21:
                cd.c scope = (cd.c) obj;
                Intrinsics.echo(scope, "scope");
                i iVar = (i) scope.f3490a.alpha(x.alpha, new c0(i5));
                LinkedHashMap linkedHashMap = scope.f3492c.bravo;
                w wVar = (w) this.purple;
                Object obj2 = linkedHashMap.get(wVar.getKey());
                Intrinsics.checkNotNull(obj2);
                Object foxtrot3 = wVar.foxtrot((Function1) obj2);
                wVar.bravo(foxtrot3, scope);
                iVar.foxtrot(wVar.getKey(), foxtrot3);
                return Unit.INSTANCE;
            case 22:
                return RedirectCustomTabExecutor.charlie((RedirectCustomTabExecutor) this.purple, (String) obj);
            case 23:
                filterNonRegisteredCustomTemplates$lambda$11 = InAppController.filterNonRegisteredCustomTemplates$lambda$11((InAppController) this.purple, (JSONObject) obj);
                return Boolean.valueOf(filterNonRegisteredCustomTemplates$lambda$11);
            case 24:
                return FilePreloaderCoroutine.alpha((FilePreloaderCoroutine) this.purple, (Pair) obj);
            case 25:
                preloadFilesAndCache$lambda$0 = FilePreloaderExecutors.preloadFilesAndCache$lambda$0((FilePreloaderExecutors) this.purple, (Pair) obj);
                return preloadFilesAndCache$lambda$0;
            case 26:
                executors$lambda$1 = CTExecutorFactory.executors$lambda$1((CleverTapInstanceConfig) this.purple, (String) obj);
                return executors$lambda$1;
            case 27:
                lambda$fileVarUpdated$2 = VarCache.lambda$fileVarUpdated$2((Var) this.purple, (Map) obj);
                return lambda$fileVarUpdated$2;
            case 28:
                ((C2122B) this.purple).invoke();
                return Unit.INSTANCE;
            default:
                C1535i c1535i = ((C1530f0) this.purple).f11997l;
                c1535i.teal = (z) obj;
                if (c1535i.yellow && (c3 = c1535i.c()) != null && !c1535i.d(c3, c1535i.f12001a)) {
                    c1535i.white = true;
                    c1535i.e();
                }
                c1535i.yellow = false;
                return Unit.INSTANCE;
        }
    }
}
