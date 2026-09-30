package A2;

import Yb.W;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.camera.core.ar;
import androidx.fragment.app.RunnableC0617l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.az;
import bv.aw;
import com.google.android.material.carousel.CarouselLayoutManager;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import delivery.samurai.android.ui.missingAttributes.AttributesMissingActivity;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import delivery.samurai.android.ui.splash.SplashActivity;
import delivery.samurai.android.ui.support.SupportFragment;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import g.C1718a;
import id.C1915c;
import j1.AbstractC1933g;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import s6.D5;
import s6.E5;
import s6.W5;
import s6.Y5;
import t0.C2946x;
import t6.P2;
import vf.I;
import z3.C3462a;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ q(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    private final void alpha() {
        boolean z2;
        String str;
        U7.c cVar = (U7.c) this.purple;
        synchronized (((AtomicMarkableReference) cVar.yellow)) {
            try {
                z2 = false;
                if (((AtomicMarkableReference) cVar.yellow).isMarked()) {
                    str = (String) ((AtomicMarkableReference) cVar.yellow).getReference();
                    ((AtomicMarkableReference) cVar.yellow).set(str, false);
                    z2 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            ((Q7.h) cVar.purple).juliet((String) cVar.alpha, str);
        }
    }

    private final void bravo() {
        C3.d dVar = (C3.d) this.purple;
        Map map = null;
        ((AtomicReference) dVar.purple).set(null);
        synchronized (dVar) {
            try {
                if (((AtomicMarkableReference) dVar.red).isMarked()) {
                    map = ((Q7.e) ((AtomicMarkableReference) dVar.red).getReference()).alpha();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) dVar.red;
                    atomicMarkableReference.set((Q7.e) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (map != null) {
            U7.c cVar = (U7.c) dVar.silver;
            ((Q7.h) cVar.purple).hotel((String) cVar.alpha, map, dVar.alpha);
        }
    }

    private final void charlie() {
        androidx.camera.core.ak akVar = (androidx.camera.core.ak) this.purple;
        synchronized (akVar.f2936n) {
            try {
                akVar.f2938p = null;
                ar arVar = akVar.f2937o;
                if (arVar != null) {
                    akVar.f2937o = null;
                    akVar.foxtrot(arVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0499  */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v7, types: [x2.z, x2.af] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HomeActivityV2 homeActivityV2;
        HomeActivityV2 homeActivityV22;
        int i4;
        boolean z2;
        View findFocus;
        long j5;
        long j6;
        boolean z10;
        long j7;
        long j10;
        int i5;
        int i10;
        int[] iArr;
        int i11;
        int[] iArr2;
        float f5 = 0.0f;
        boolean z11 = false;
        int i12 = 1;
        switch (this.alpha) {
            case 0:
                I i13 = (I) this.purple;
                if (i13 != null) {
                    i13.foxtrot(null);
                    return;
                }
                return;
            case 1:
                d3.s.alpha.incrementAndGet();
                d3.k kVar = ((C9.c) this.purple).alpha;
                if (kVar instanceof HomeActivityV2) {
                    homeActivityV2 = (HomeActivityV2) kVar;
                } else {
                    homeActivityV2 = null;
                }
                if (homeActivityV2 != null) {
                    homeActivityV2.plum();
                    return;
                }
                return;
            case 2:
                androidx.fragment.app.an activity = ((Gb.g) this.purple).getActivity();
                if (activity instanceof HomeActivityV2) {
                    homeActivityV22 = (HomeActivityV2) activity;
                } else {
                    homeActivityV22 = null;
                }
                if (homeActivityV22 != null) {
                    homeActivityV22.plum();
                    return;
                }
                return;
            case 3:
                E.k.setRippleState$lambda$2((E.k) this.purple);
                return;
            case 4:
                int i14 = SplashActivity.f12488L;
                SplashActivity splashActivity = (SplashActivity) this.purple;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) splashActivity.gold().bravo, "rotation", 0.0f, 30.0f, -30.0f, 20.0f, -20.0f, 10.0f, -10.0f, 0.0f);
                ofFloat.addListener(new Fc.ah(splashActivity));
                ofFloat.setDuration(1000L).start();
                return;
            case 5:
                SupportFragment supportFragment = (SupportFragment) this.purple;
                if (supportFragment.isAdded()) {
                    supportFragment.quebec();
                    return;
                }
                return;
            case 6:
                int i15 = ZenDeskChatActivity.f12498T;
                ZenDeskChatActivity zenDeskChatActivity = (ZenDeskChatActivity) this.purple;
                B2.ad gray = zenDeskChatActivity.gray();
                az adapter = ((RecyclerView) zenDeskChatActivity.gray().echo).getAdapter();
                if (adapter != null) {
                    i4 = adapter.getItemCount();
                } else {
                    i4 = 1;
                }
                ((RecyclerView) gray.echo).scrollToPosition(i4 - 1);
                return;
            case 7:
                I0.ad adVar = (I0.ad) this.purple;
                adVar.november = null;
                View view = adVar.alpha;
                boolean isFocused = view.isFocused();
                J.e eVar = adVar.mike;
                if (!isFocused && (findFocus = view.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    eVar.india();
                    return;
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                Object[] objArr = eVar.alpha;
                int i16 = eVar.red;
                for (int i17 = 0; i17 < i16; i17++) {
                    I0.ac acVar = (I0.ac) objArr[i17];
                    int ordinal = acVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2 && ordinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!Intrinsics.areEqual(objectRef.alpha, Boolean.FALSE)) {
                                if (acVar == I0.ac.red) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objectRef2.alpha = Boolean.valueOf(z2);
                            }
                        } else {
                            Boolean bool = Boolean.FALSE;
                            objectRef.alpha = bool;
                            objectRef2.alpha = bool;
                        }
                    } else {
                        Boolean bool2 = Boolean.TRUE;
                        objectRef.alpha = bool2;
                        objectRef2.alpha = bool2;
                    }
                }
                eVar.india();
                boolean areEqual = Intrinsics.areEqual(objectRef.alpha, Boolean.TRUE);
                C1915c c1915c = adVar.bravo;
                if (areEqual) {
                    ((InputMethodManager) c1915c.red.getValue()).restartInput((View) c1915c.purple);
                }
                Boolean bool3 = (Boolean) objectRef2.alpha;
                if (bool3 != null) {
                    if (bool3.booleanValue()) {
                        ((s1.aa) ((C1718a) c1915c.silver).purple).bravo();
                    } else {
                        ((s1.aa) ((C1718a) c1915c.silver).purple).alpha();
                    }
                }
                if (Intrinsics.areEqual(objectRef.alpha, Boolean.FALSE)) {
                    ((InputMethodManager) c1915c.red.getValue()).restartInput((View) c1915c.purple);
                    return;
                }
                return;
            case 8:
                Aa.m mVar = ((J1.b) this.purple).charlie;
                mVar.getClass();
                long uptimeMillis = SystemClock.uptimeMillis();
                J1.b bVar = (J1.b) mVar.purple;
                bVar.getClass();
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i18 = 0;
                while (true) {
                    ArrayList arrayList = bVar.bravo;
                    if (i18 < arrayList.size()) {
                        J1.f fVar = (J1.f) arrayList.get(i18);
                        if (fVar != null) {
                            aw awVar = bVar.alpha;
                            Long l10 = (Long) awVar.get(fVar);
                            if (l10 != null) {
                                if (l10.longValue() < uptimeMillis2) {
                                    awVar.remove(fVar);
                                }
                            }
                            long j11 = fVar.india;
                            if (j11 == 0) {
                                fVar.india = uptimeMillis;
                                fVar.charlie(fVar.bravo);
                            } else {
                                long j12 = uptimeMillis - j11;
                                fVar.india = uptimeMillis;
                                float f10 = J1.f.bravo().golf;
                                if (f10 == f5) {
                                    j5 = 2147483647L;
                                } else {
                                    j5 = ((float) j12) / f10;
                                }
                                long j13 = j5;
                                if (fVar.oscar) {
                                    float f11 = fVar.november;
                                    if (f11 != Float.MAX_VALUE) {
                                        fVar.mike.india = f11;
                                        fVar.november = Float.MAX_VALUE;
                                    }
                                    fVar.bravo = (float) fVar.mike.india;
                                    fVar.alpha = f5;
                                    fVar.oscar = z11;
                                    j6 = uptimeMillis2;
                                } else {
                                    if (fVar.november != Float.MAX_VALUE) {
                                        j6 = uptimeMillis2;
                                        long j14 = j13 / 2;
                                        G.a charlie = fVar.mike.charlie(j14, fVar.bravo, fVar.alpha);
                                        J1.g gVar = fVar.mike;
                                        gVar.india = fVar.november;
                                        fVar.november = Float.MAX_VALUE;
                                        G.a charlie2 = gVar.charlie(j14, charlie.alpha, charlie.bravo);
                                        fVar.bravo = charlie2.alpha;
                                        fVar.alpha = charlie2.bravo;
                                    } else {
                                        j6 = uptimeMillis2;
                                        G.a charlie3 = fVar.mike.charlie(j13, fVar.bravo, fVar.alpha);
                                        fVar.bravo = charlie3.alpha;
                                        fVar.alpha = charlie3.bravo;
                                    }
                                    float max = Math.max(fVar.bravo, fVar.hotel);
                                    fVar.bravo = max;
                                    fVar.bravo = Math.min(max, fVar.golf);
                                    float f12 = fVar.alpha;
                                    J1.g gVar2 = fVar.mike;
                                    gVar2.getClass();
                                    if (Math.abs(f12) < gVar2.echo && Math.abs(r0 - ((float) gVar2.india)) < gVar2.delta) {
                                        fVar.bravo = (float) fVar.mike.india;
                                        fVar.alpha = f5;
                                    } else {
                                        z10 = z11 ? 1 : 0;
                                        float min = Math.min(fVar.bravo, fVar.golf);
                                        fVar.bravo = min;
                                        float max2 = Math.max(min, fVar.hotel);
                                        fVar.bravo = max2;
                                        fVar.charlie(max2);
                                        if (!z10) {
                                            fVar.foxtrot = z11;
                                            J1.b bravo = J1.f.bravo();
                                            bravo.alpha.remove(fVar);
                                            ArrayList arrayList2 = bravo.bravo;
                                            int indexOf = arrayList2.indexOf(fVar);
                                            if (indexOf >= 0) {
                                                arrayList2.set(indexOf, null);
                                                bravo.foxtrot = true;
                                            }
                                            fVar.india = 0L;
                                            fVar.charlie = z11;
                                            int i19 = z11 ? 1 : 0;
                                            boolean z12 = z11;
                                            while (true) {
                                                ArrayList arrayList3 = fVar.kilo;
                                                if (i19 < arrayList3.size()) {
                                                    if (arrayList3.get(i19) != null) {
                                                        x2.v vVar = (x2.v) arrayList3.get(i19);
                                                        float f13 = fVar.bravo;
                                                        x2.w wVar = vVar.alpha;
                                                        com.google.firebase.messaging.l lVar = x2.y.ochre;
                                                        ?? r13 = wVar.golf;
                                                        if (f13 < 1.0f) {
                                                            long j15 = r13.f14092r;
                                                            x2.z jade = r13.jade(z12);
                                                            x2.z zVar = jade.f14086l;
                                                            jade.f14086l = null;
                                                            i5 = i19;
                                                            j10 = uptimeMillis;
                                                            r13.bronze(-1L, wVar.alpha);
                                                            r13.bronze(j15, -1L);
                                                            wVar.alpha = j15;
                                                            RunnableC0617l runnableC0617l = wVar.foxtrot;
                                                            if (runnableC0617l != null) {
                                                                runnableC0617l.run();
                                                            }
                                                            r13.f14088n.clear();
                                                            if (zVar != null) {
                                                                zVar.yankee(zVar, lVar, true);
                                                            }
                                                        } else {
                                                            j10 = uptimeMillis;
                                                            i5 = i19;
                                                            r13.yankee(r13, lVar, z12);
                                                        }
                                                        i19 = i5 + 1;
                                                        uptimeMillis = j10;
                                                        z12 = 0;
                                                    } else {
                                                        j10 = uptimeMillis;
                                                        i5 = i19;
                                                    }
                                                    i19 = i5 + 1;
                                                    uptimeMillis = j10;
                                                    z12 = 0;
                                                } else {
                                                    j7 = uptimeMillis;
                                                    for (int size = arrayList3.size() - 1; size >= 0; size--) {
                                                        if (arrayList3.get(size) == null) {
                                                            arrayList3.remove(size);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            j7 = uptimeMillis;
                                        }
                                        i18++;
                                        uptimeMillis = j7;
                                        uptimeMillis2 = j6;
                                        f5 = 0.0f;
                                        z11 = false;
                                    }
                                }
                                z10 = true;
                                float min2 = Math.min(fVar.bravo, fVar.golf);
                                fVar.bravo = min2;
                                float max22 = Math.max(min2, fVar.hotel);
                                fVar.bravo = max22;
                                fVar.charlie(max22);
                                if (!z10) {
                                }
                                i18++;
                                uptimeMillis = j7;
                                uptimeMillis2 = j6;
                                f5 = 0.0f;
                                z11 = false;
                            }
                        }
                        j7 = uptimeMillis;
                        j6 = uptimeMillis2;
                        i18++;
                        uptimeMillis = j7;
                        uptimeMillis2 = j6;
                        f5 = 0.0f;
                        z11 = false;
                    } else {
                        if (bVar.foxtrot) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                if (arrayList.get(size2) == null) {
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                                w.o oVar = bVar.hotel;
                                ValueAnimator.unregisterDurationScaleChangeListener((J1.a) oVar.purple);
                                oVar.purple = null;
                            }
                            bVar.foxtrot = false;
                        }
                        if (arrayList.size() > 0) {
                            J2.c cVar = bVar.echo;
                            cVar.getClass();
                            ((Choreographer) cVar.purple).postFrameCallback(new I0.af(bVar.delta, 1));
                            return;
                        }
                        return;
                    }
                }
                break;
            case 9:
                Log.i("LocationFlow", "[ACTIVITY_RESULT_RETRY] Retrying location monitoring in OrdersFragment after user cancelled settings popup");
                C3462a.alpha("LocationFlow", 12, "[ACTIVITY_RESULT_RETRY] Retrying location monitoring in OrdersFragment after user cancelled settings popup", null);
                OrdersFragmentV2 ordersFragmentV2 = (OrdersFragmentV2) this.purple;
                ordersFragmentV2.kilo().november().echo(ordersFragmentV2.kilo());
                return;
            case 10:
                K1.t tVar = (K1.t) this.purple;
                synchronized (tVar.silver) {
                    try {
                        if (tVar.f1670a != null) {
                            try {
                                p1.h delta = tVar.delta();
                                int i20 = delta.foxtrot;
                                if (i20 == 2) {
                                    synchronized (tVar.silver) {
                                    }
                                }
                                if (i20 == 0) {
                                    try {
                                        int i21 = o1.i.alpha;
                                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                        com.google.mlkit.common.sdkinternal.b bVar2 = tVar.red;
                                        Context context = tVar.alpha;
                                        bVar2.getClass();
                                        p1.h[] hVarArr = {delta};
                                        D5 d52 = AbstractC1933g.alpha;
                                        Trace.beginSection(P2.foxtrot("TypefaceCompat.createFromFontInfo"));
                                        try {
                                            Typeface bravo2 = AbstractC1933g.alpha.bravo(context, hVarArr, 0);
                                            Trace.endSection();
                                            MappedByteBuffer foxtrot = E5.foxtrot(tVar.alpha, delta.alpha);
                                            if (foxtrot != null && bravo2 != null) {
                                                try {
                                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                    com.google.firebase.messaging.o oVar2 = new com.google.firebase.messaging.o(bravo2, Y5.alpha(foxtrot));
                                                    Trace.endSection();
                                                    synchronized (tVar.silver) {
                                                        try {
                                                            W5 w52 = tVar.f1670a;
                                                            if (w52 != null) {
                                                                w52.bravo(oVar2);
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    tVar.alpha();
                                                    return;
                                                } finally {
                                                    int i22 = o1.i.alpha;
                                                }
                                            }
                                            throw new RuntimeException("Unable to open file.");
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                                throw new RuntimeException("fetchFonts result is not OK. (" + i20 + ")");
                            } catch (Throwable th) {
                                synchronized (tVar.silver) {
                                    try {
                                        W5 w53 = tVar.f1670a;
                                        if (w53 != null) {
                                            w53.alpha(th);
                                        }
                                        tVar.alpha();
                                        return;
                                    } finally {
                                    }
                                }
                            }
                        }
                        return;
                    } finally {
                    }
                }
            case 11:
                K5.k kVar2 = (K5.k) this.purple;
                kVar2.getClass();
                ((L5.h) kVar2.delta).papa(new B2.s(13, kVar2));
                return;
            case 12:
                int i23 = AttributesMissingActivity.f12319a0;
                L9.d.blue(((AttributesMissingActivity) this.purple).lima());
                return;
            case 13:
                ViewGroup viewGroup = (ViewGroup) this.purple;
                viewGroup.setBackground(null);
                viewGroup.setElevation(0.0f);
                return;
            case 14:
                ((CarouselLayoutManager) this.purple).l();
                return;
            case 15:
                alpha();
                return;
            case 16:
                bravo();
                return;
            case 17:
                ((Aa.g) this.purple).invoke();
                return;
            case 18:
                ((T0.i) this.purple).invoke();
                return;
            case 19:
                ((T0.i) this.purple).invoke();
                return;
            case 20:
                V.d dVar = (V.d) this.purple;
                boolean echo = dVar.echo();
                C2946x c2946x = dVar.alpha;
                if (echo) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        c2946x.romeo(true);
                        bv.aa aaVar = dVar.e;
                        int[] iArr3 = aaVar.bravo;
                        long[] jArr = aaVar.alpha;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i24 = 0;
                            while (true) {
                                long j16 = jArr[i24];
                                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i25 = 8 - ((~(i24 - length)) >>> 31);
                                    int i26 = 0;
                                    while (i26 < i25) {
                                        if ((255 & j16) < 128) {
                                            int i27 = iArr3[(i24 << 3) + i26];
                                            if (!dVar.delta().alpha(i27)) {
                                                i11 = i12;
                                                iArr2 = iArr3;
                                                dVar.silver.add(new V.e(i27, dVar.f2164d, V.f.purple, null));
                                                dVar.f2161a.mike(Unit.INSTANCE);
                                                j16 >>= 8;
                                                i26 += i11;
                                                i12 = i11;
                                                iArr3 = iArr2;
                                            }
                                        }
                                        i11 = i12;
                                        iArr2 = iArr3;
                                        j16 >>= 8;
                                        i26 += i11;
                                        i12 = i11;
                                        iArr3 = iArr2;
                                    }
                                    i10 = i12;
                                    iArr = iArr3;
                                    if (i25 == 8) {
                                    }
                                } else {
                                    i10 = i12;
                                    iArr = iArr3;
                                }
                                if (i24 != length) {
                                    i24 += i10;
                                    i12 = i10;
                                    iArr3 = iArr;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        dVar.golf(c2946x.getSemanticsOwner().alpha(), dVar.f2165f);
                        Trace.endSection();
                        dVar.bravo(dVar.delta());
                        dVar.kilo();
                        dVar.f2166g = false;
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    } finally {
                    }
                }
                return;
            case 21:
                W w4 = (W) this.purple;
                if (w4.isAdded()) {
                    w4.kilo();
                    return;
                }
                return;
            case 22:
                int i28 = ProcessOrderActivityV2.f12378N0;
                ProcessOrderActivityV2 processOrderActivityV2 = (ProcessOrderActivityV2) this.purple;
                if (!processOrderActivityV2.isDestroyed() && !processOrderActivityV2.isFinishing()) {
                    C3462a.alpha("LocationFlow", 12, "LOCATION_SERVICE_MANUAL_RESTART_STARTING", null);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        processOrderActivityV2.november().foxtrot();
                        Result.m206constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th3) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m206constructorimpl(ResultKt.createFailure(th3));
                    }
                    String string = processOrderActivityV2.getString(R.string.location_stuck_restart_service);
                    Intrinsics.delta(string, "getString(...)");
                    L9.d.pink(processOrderActivityV2, string);
                    return;
                }
                return;
            case 23:
                ae.k kVar3 = (ae.k) this.purple;
                Runnable runnable = kVar3.purple;
                if (runnable != null) {
                    Intrinsics.checkNotNull(runnable);
                    runnable.run();
                    kVar3.purple = null;
                    return;
                }
                return;
            case 24:
                ae.p.alpha((ae.p) this.purple);
                return;
            case 25:
                ((androidx.camera.camera2.internal.compat.p) this.purple).bravo.onCameraAccessPrioritiesChanged();
                return;
            case 26:
                charlie();
                return;
            case 27:
                ((androidx.camera.core.az) this.purple).november();
                return;
            case 28:
                av.o oVar3 = (av.o) this.purple;
                if (oVar3.charlie.A == 4) {
                    oVar3.charlie.fuchsia(false);
                    return;
                }
                return;
            default:
                O7.l lVar2 = (O7.l) this.purple;
                if (((av.s) lVar2.purple).A == 9) {
                    ((av.s) lVar2.purple).beige();
                    return;
                }
                return;
        }
    }
}
