package com.google.firebase.messaging;

import C1.A;
import C1.C0080b;
import C1.ap;
import C1.au;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.J;
import androidx.fragment.app.ai;
import androidx.recyclerview.widget.RecyclerView;
import av.D;
import av.ao;
import bb.C0743a;
import bx.AbstractC0764b;
import bx.C;
import com.google.android.gms.internal.measurement.AbstractC1295b1;
import com.google.android.gms.internal.measurement.AbstractC1380u1;
import com.google.android.gms.internal.measurement.C1323h;
import com.google.android.gms.internal.measurement.C1351n;
import com.google.android.gms.internal.measurement.C1359p;
import com.google.android.gms.internal.measurement.C1378u;
import com.google.android.gms.internal.measurement.InterfaceC1355o;
import com.google.android.gms.internal.measurement.J1;
import com.google.android.gms.internal.measurement.K3;
import com.google.android.gms.internal.measurement.Q0;
import com.google.mlkit.vision.barcode.common.Barcode;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import delivery.samurai.android.R;
import g3.C1746g;
import g3.EnumC1747h;
import i7.AbstractC1900f;
import i7.C1898d;
import i7.C1902h;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import of.AbstractC2262q;
import pe.InterfaceC2330f;
import pe.an;
import qe.InterfaceC2466b;
import s6.AbstractC2763s0;
import s6.T7;
import se.aq;
import t6.j4;
import vf.C3213q;
import vf.P;

/* loaded from: classes2.dex */
public final class o implements Ge.m, FragmentComponentBuilder {
    public static o echo;
    public static o foxtrot;
    public Object alpha;
    public Object bravo;
    public Object charlie;
    public Object delta;

    public /* synthetic */ o(ViewGroup viewGroup, View view, View view2, View view3) {
        this.alpha = viewGroup;
        this.bravo = view;
        this.charlie = view2;
        this.delta = view3;
    }

    public static synchronized o kilo() {
        o oVar;
        synchronized (o.class) {
            try {
                if (echo == null) {
                    echo = new o(0);
                }
                oVar = echo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public static o lima() {
        if (foxtrot == null) {
            foxtrot = new o(13);
        }
        return foxtrot;
    }

    @Override // Ge.m
    public void alpha(Ne.b bVar, Ne.f fVar) {
        ((ArrayList) this.alpha).add(new Se.i(bVar, fVar));
    }

    @Override // Ge.m
    public void bravo() {
        ArrayList elements = (ArrayList) this.alpha;
        U7.c cVar = (U7.c) this.delta;
        cVar.getClass();
        Intrinsics.echo(elements, "elements");
        Ne.f fVar = (Ne.f) this.charlie;
        if (fVar != null) {
            aq bravo = y6.e.bravo(fVar, (InterfaceC2330f) cVar.silver);
            if (bravo != null) {
                HashMap hashMap = (HashMap) cVar.purple;
                List value = AbstractC2262q.delta(elements);
                kotlin.reflect.jvm.internal.impl.types.y type = bravo.getType();
                Intrinsics.delta(type, "parameter.type");
                Intrinsics.echo(value, "value");
                hashMap.put(fVar, new Se.w(value, type));
                return;
            }
            if (((ao) cVar.red).amber((Ne.b) cVar.teal) && Intrinsics.areEqual(fVar.bravo(), "value")) {
                ArrayList arrayList = new ArrayList();
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof Se.a) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((List) cVar.white).add((InterfaceC2466b) ((Se.a) it2.next()).alpha);
                }
            }
        }
    }

    @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
    public FragmentComponent build() {
        AbstractC2763s0.bravo(ai.class, (ai) this.delta);
        return new w9.m((w9.p) this.alpha, (w9.l) this.bravo, (w9.j) this.charlie);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, J2.n, Ge.l] */
    @Override // Ge.m
    public Ge.l charlie(Ne.b bVar) {
        ArrayList arrayList = new ArrayList();
        U7.c azure = ((ao) this.bravo).azure(bVar, an.magenta, arrayList);
        Intrinsics.checkNotNull(azure);
        ?? obj = new Object();
        obj.purple = azure;
        obj.red = this;
        obj.silver = arrayList;
        obj.alpha = azure;
        return obj;
    }

    @Override // Ge.m
    public void delta(Object obj) {
        ((ArrayList) this.alpha).add(ao.echo((ao) this.bravo, (Ne.f) this.charlie, obj));
    }

    @Override // Ge.m
    public void echo(Se.f fVar) {
        ((ArrayList) this.alpha).add(new Se.g(new Se.p(fVar)));
    }

    public void foxtrot(String str, String str2) {
        String str3;
        if (((String) this.delta).length() == 0) {
            str3 = "?";
        } else {
            str3 = "&";
        }
        this.delta = ((String) this.delta) + str3 + str + '=' + str2;
    }

    @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
    public FragmentComponentBuilder fragment(ai aiVar) {
        aiVar.getClass();
        this.delta = aiVar;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r7.charlie == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        r0 = ((O7.j) r14.charlie).echo(r15, r16);
        r3 = U7.c.delta(android.view.LayoutInflater.from(r8));
        r5 = (android.widget.TextView) r3.yellow;
        r5.setText(r0.alpha);
        ((android.widget.TextView) r3.silver).setText(r0.bravo);
        r10 = (com.google.android.material.button.MaterialButton) r3.white;
        r10.setText(r0.charlie);
        r11 = (androidx.constraintlayout.widget.ConstraintLayout) r3.red;
        r11.setBackgroundResource(r0.echo);
        ((android.widget.ImageView) r3.purple).setColorFilter(r8.getColor(delivery.samurai.android.R.color.white));
        r5.setTextColor(r8.getColor(r0.golf));
        r10.setBackgroundColor(r8.getColor(r0.hotel));
        r12 = (com.google.android.material.button.MaterialButton) r3.teal;
        r6 = r0.delta;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if (r6 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:
    
        if (r16 == g3.EnumC1747h.alpha) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
    
        r12.setText(r6);
        r12.setVisibility(0);
        r0 = r0.india;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
    
        r12.setTextColor(r8.getColor(r0.intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c9, code lost:
    
        r6 = r7.golf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cd, code lost:
    
        if (r6 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
    
        r6 = r6.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d5, code lost:
    
        r0 = new Fe.c(r8, r6);
        r6 = (androidx.appcompat.app.d) r0.red;
        r6.sierra = (androidx.constraintlayout.widget.ConstraintLayout) r3.alpha;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e4, code lost:
    
        if (r16 == g3.EnumC1747h.alpha) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e7, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e8, code lost:
    
        r6.mike = r1;
        r3 = r0.foxtrot();
        r10.setOnClickListener(new L9.e(r14, r15, r3, r16, r17, 1));
        r12.setOnClickListener(new L9.e(r14, r15, r3, r16, r17, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
    
        if (r7.echo == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
    
        ((O7.l) r14.delta).purple(r3, r11, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0111, code lost:
    
        r3.setOnDismissListener(new L9.g(r14, r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011f, code lost:
    
        if (r8.isFinishing() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0125, code lost:
    
        if (r8.isDestroyed() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0128, code lost:
    
        r3.show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012b, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d4, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        r12.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0046, code lost:
    
        if (r7.bravo == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public androidx.appcompat.app.g golf(g3.s result, EnumC1747h enumC1747h, Function0 function0) {
        String string;
        Intrinsics.echo(result, "result");
        int ordinal = enumC1747h.ordinal();
        C1746g c1746g = (C1746g) this.bravo;
        d3.k kVar = (d3.k) this.alpha;
        boolean z2 = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (result instanceof g3.r) {
                        string = ((g3.r) result).alpha;
                    } else {
                        string = kVar.getString(R.string.location_permission_required_message);
                        Intrinsics.delta(string, "getString(...)");
                    }
                    L9.d.pink(kVar, string);
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public boolean hotel(C1902h c1902h, int i4) {
        C1898d c1898d = (C1898d) c1902h.alpha.get();
        if (c1898d == null) {
            return false;
        }
        ((Handler) this.bravo).removeCallbacksAndMessages(c1902h);
        Handler handler = AbstractC1900f.xray;
        handler.sendMessage(handler.obtainMessage(1, i4, 0, c1898d.alpha));
        return true;
    }

    public void india() {
        j4.alpha();
        w.o oVar = (w.o) this.bravo;
        oVar.getClass();
        j4.alpha();
        C0743a c0743a = (C0743a) oVar.red;
        Objects.requireNonNull(c0743a);
        S2.l lVar = (S2.l) oVar.purple;
        Objects.requireNonNull(lVar);
        S2.l lVar2 = null;
        J j5 = c0743a.alpha;
        Objects.requireNonNull(j5);
        j5.alpha();
        J j6 = c0743a.alpha;
        Objects.requireNonNull(j6);
        be.h.delta(j6.echo).foxtrot(new D(lVar, 1), tg.k.echo());
        J j7 = c0743a.bravo;
        if (j7 != null) {
            j7.alpha();
            be.h.delta(c0743a.bravo.echo).foxtrot(new D(lVar2, 2), tg.k.echo());
        }
        ((R3.s) this.charlie).getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object juliet(Pd.c cVar) {
        C1.i iVar;
        int i4;
        o oVar;
        C0080b c0080b;
        if (cVar instanceof C1.i) {
            iVar = (C1.i) cVar;
            int i5 = iVar.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                iVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = iVar.purple;
                Od.a aVar = Od.a.alpha;
                i4 = iVar.silver;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            oVar = iVar.alpha;
                            ResultKt.alpha(obj);
                            c0080b = (C0080b) obj;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        oVar = iVar.alpha;
                        ResultKt.alpha(obj);
                        c0080b = (C0080b) obj;
                    }
                } else {
                    ResultKt.alpha(obj);
                    List list = (List) this.charlie;
                    ap apVar = (ap) this.delta;
                    if (list != null) {
                        Intrinsics.checkNotNull(list);
                        if (!list.isEmpty()) {
                            A hotel = apVar.hotel();
                            C1.l lVar = new C1.l(apVar, this, null);
                            iVar.alpha = this;
                            iVar.silver = 2;
                            obj = hotel.bravo(lVar, iVar);
                            if (obj != aVar) {
                                oVar = this;
                                c0080b = (C0080b) obj;
                            }
                            return aVar;
                        }
                    }
                    iVar.alpha = this;
                    iVar.silver = 1;
                    obj = ap.golf(apVar, false, iVar);
                    if (obj != aVar) {
                        oVar = this;
                        c0080b = (C0080b) obj;
                    }
                    return aVar;
                }
                ((ap) oVar.delta).hotel.november(c0080b);
                return Unit.INSTANCE;
            }
        }
        iVar = new C1.i(this, cVar);
        Object obj2 = iVar.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = iVar.silver;
        if (i4 == 0) {
        }
        ((ap) oVar.delta).hotel.november(c0080b);
        return Unit.INSTANCE;
    }

    public bz.r mike(long j5, bz.r rVar, bz.r rVar2) {
        float f5;
        if (((bz.r) this.charlie) == null) {
            this.charlie = rVar.charlie();
        }
        bz.r rVar3 = (bz.r) this.charlie;
        if (rVar3 != null) {
            int bravo = rVar3.bravo();
            for (int i4 = 0; i4 < bravo; i4++) {
                bz.r rVar4 = (bz.r) this.charlie;
                if (rVar4 != null) {
                    rVar.getClass();
                    long j6 = j5 / 1000000;
                    C alpha = ((G.a) ((androidx.core.widget.f) this.alpha).purple).alpha(rVar2.alpha(i4));
                    long j7 = alpha.charlie;
                    if (j7 > 0) {
                        f5 = ((float) j6) / ((float) j7);
                    } else {
                        f5 = 1.0f;
                    }
                    rVar4.echo((((Math.signum(alpha.alpha) * AbstractC0764b.alpha(f5).bravo) * alpha.bravo) / ((float) j7)) * 1000.0f, i4);
                } else {
                    Intrinsics.lima("velocityVector");
                    throw null;
                }
            }
            bz.r rVar5 = (bz.r) this.charlie;
            if (rVar5 != null) {
                return rVar5;
            }
            Intrinsics.lima("velocityVector");
            throw null;
        }
        Intrinsics.lima("velocityVector");
        throw null;
    }

    public boolean november(Context context) {
        boolean z2;
        if (((Boolean) this.charlie) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.charlie = Boolean.valueOf(z2);
        }
        if (!((Boolean) this.bravo).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.charlie).booleanValue();
    }

    public boolean oscar(Context context) {
        boolean z2;
        if (((Boolean) this.bravo) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.bravo = Boolean.valueOf(z2);
        }
        if (!((Boolean) this.bravo).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.bravo).booleanValue();
    }

    public boolean papa(C1898d c1898d) {
        C1902h c1902h = (C1902h) this.charlie;
        if (c1902h != null && c1898d != null && c1902h.alpha.get() == c1898d) {
            return true;
        }
        return false;
    }

    public void quebec(C1898d c1898d) {
        synchronized (this.alpha) {
            try {
                if (papa(c1898d)) {
                    C1902h c1902h = (C1902h) this.charlie;
                    if (!c1902h.charlie) {
                        c1902h.charlie = true;
                        ((Handler) this.bravo).removeCallbacksAndMessages(c1902h);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void romeo(C1898d c1898d) {
        synchronized (this.alpha) {
            try {
                if (papa(c1898d)) {
                    C1902h c1902h = (C1902h) this.charlie;
                    if (c1902h.charlie) {
                        c1902h.charlie = false;
                        tango(c1902h);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #1 {all -> 0x0086, blocks: (B:25:0x006d, B:27:0x007e, B:30:0x008a), top: B:24:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: all -> 0x0086, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0086, blocks: (B:25:0x006d, B:27:0x007e, B:30:0x008a), top: B:24:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v7, types: [Ef.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sierra(Pd.c cVar) {
        au auVar;
        int i4;
        Ef.c cVar2;
        o oVar;
        Ef.a aVar;
        Throwable th;
        C3213q c3213q;
        o oVar2;
        try {
            if (cVar instanceof au) {
                auVar = (au) cVar;
                int i5 = auVar.teal;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    auVar.teal = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = auVar.red;
                    Od.a aVar2 = Od.a.alpha;
                    i4 = auVar.teal;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                aVar = auVar.purple;
                                oVar2 = auVar.alpha;
                                try {
                                    ResultKt.alpha(obj);
                                    C3213q c3213q2 = (C3213q) oVar2.bravo;
                                    Unit unit = Unit.INSTANCE;
                                    c3213q2.magenta(unit);
                                    ((Ef.c) aVar).foxtrot(null);
                                    return unit;
                                } catch (Throwable th2) {
                                    th = th2;
                                    ((Ef.c) aVar).foxtrot(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r22 = auVar.purple;
                        oVar = auVar.alpha;
                        ResultKt.alpha(obj);
                        cVar2 = r22;
                    } else {
                        ResultKt.alpha(obj);
                        C3213q c3213q3 = (C3213q) this.bravo;
                        c3213q3.getClass();
                        if (!(P.alpha.get(c3213q3) instanceof vf.D)) {
                            return Unit.INSTANCE;
                        }
                        auVar.alpha = this;
                        cVar2 = (Ef.c) this.alpha;
                        auVar.purple = cVar2;
                        auVar.teal = 1;
                        if (cVar2.delta(auVar) != aVar2) {
                            oVar = this;
                        }
                        return aVar2;
                    }
                    c3213q = (C3213q) oVar.bravo;
                    c3213q.getClass();
                    if (P.alpha.get(c3213q) instanceof vf.D) {
                        Unit unit2 = Unit.INSTANCE;
                        cVar2.foxtrot(null);
                        return unit2;
                    }
                    auVar.alpha = oVar;
                    auVar.purple = cVar2;
                    auVar.teal = 2;
                    if (oVar.juliet(auVar) != aVar2) {
                        aVar = cVar2;
                        oVar2 = oVar;
                        C3213q c3213q22 = (C3213q) oVar2.bravo;
                        Unit unit3 = Unit.INSTANCE;
                        c3213q22.magenta(unit3);
                        ((Ef.c) aVar).foxtrot(null);
                        return unit3;
                    }
                    return aVar2;
                }
            }
            c3213q = (C3213q) oVar.bravo;
            c3213q.getClass();
            if (P.alpha.get(c3213q) instanceof vf.D) {
            }
        } catch (Throwable th3) {
            aVar = cVar2;
            th = th3;
            ((Ef.c) aVar).foxtrot(null);
            throw th;
        }
        auVar = new au(this, cVar);
        Object obj2 = auVar.red;
        Od.a aVar22 = Od.a.alpha;
        i4 = auVar.teal;
        if (i4 == 0) {
        }
    }

    public void tango(C1902h c1902h) {
        int i4 = c1902h.bravo;
        if (i4 == -2) {
            return;
        }
        if (i4 <= 0) {
            if (i4 == -1) {
                i4 = 1500;
            } else {
                i4 = 2750;
            }
        }
        Handler handler = (Handler) this.bravo;
        handler.removeCallbacksAndMessages(c1902h);
        handler.sendMessageDelayed(Message.obtain(handler, 0, c1902h), i4);
    }

    public void uniform() {
        C1902h c1902h = (C1902h) this.delta;
        if (c1902h != null) {
            this.charlie = c1902h;
            this.delta = null;
            C1898d c1898d = (C1898d) c1902h.alpha.get();
            if (c1898d != null) {
                Handler handler = AbstractC1900f.xray;
                handler.sendMessage(handler.obtainMessage(0, c1898d.alpha));
            } else {
                this.charlie = null;
            }
        }
    }

    public InterfaceC1355o victor(J2.i iVar, Q0... q0Arr) {
        InterfaceC1355o interfaceC1355o = InterfaceC1355o.gold;
        for (Q0 q02 : q0Arr) {
            interfaceC1355o = AbstractC1380u1.charlie(q02);
            AbstractC1295b1.delta((J2.i) this.charlie);
            if ((interfaceC1355o instanceof C1359p) || (interfaceC1355o instanceof C1351n)) {
                interfaceC1355o = ((C1378u) this.alpha).alpha(iVar, interfaceC1355o);
            }
        }
        return interfaceC1355o;
    }

    public o(d3.k kVar, C1746g c1746g) {
        this.alpha = kVar;
        this.bravo = c1746g;
        this.charlie = new O7.j(10, kVar);
        this.delta = new O7.l(8, false);
    }

    public o(KSerializer kSerializer) {
        this.charlie = "";
        this.delta = "";
        this.bravo = kSerializer;
        this.alpha = kSerializer.getDescriptor().oscar();
    }

    public o(Typeface typeface, androidx.emoji2.text.flatbuffer.b bVar) {
        int i4;
        int i5;
        int i10;
        int i11;
        this.delta = typeface;
        this.alpha = bVar;
        this.charlie = new K1.v(Barcode.FORMAT_UPC_E);
        int alpha = bVar.alpha(6);
        if (alpha != 0) {
            int i12 = alpha + bVar.alpha;
            i4 = ((ByteBuffer) bVar.silver).getInt(((ByteBuffer) bVar.silver).getInt(i12) + i12);
        } else {
            i4 = 0;
        }
        this.bravo = new char[i4 * 2];
        int alpha2 = bVar.alpha(6);
        if (alpha2 != 0) {
            int i13 = alpha2 + bVar.alpha;
            i5 = ((ByteBuffer) bVar.silver).getInt(((ByteBuffer) bVar.silver).getInt(i13) + i13);
        } else {
            i5 = 0;
        }
        for (int i14 = 0; i14 < i5; i14++) {
            K1.y yVar = new K1.y(this, i14);
            androidx.emoji2.text.flatbuffer.a bravo = yVar.bravo();
            int alpha3 = bravo.alpha(4);
            Character.toChars(alpha3 != 0 ? ((ByteBuffer) bravo.silver).getInt(alpha3 + bravo.alpha) : 0, (char[]) this.bravo, i14 * 2);
            androidx.emoji2.text.flatbuffer.a bravo2 = yVar.bravo();
            int alpha4 = bravo2.alpha(16);
            if (alpha4 != 0) {
                int i15 = alpha4 + bravo2.alpha;
                i10 = ((ByteBuffer) bravo2.silver).getInt(((ByteBuffer) bravo2.silver).getInt(i15) + i15);
            } else {
                i10 = 0;
            }
            T7.bravo("invalid metadata codepoint length", i10 > 0);
            androidx.emoji2.text.flatbuffer.a bravo3 = yVar.bravo();
            int alpha5 = bravo3.alpha(16);
            if (alpha5 != 0) {
                int i16 = alpha5 + bravo3.alpha;
                i11 = ((ByteBuffer) bravo3.silver).getInt(((ByteBuffer) bravo3.silver).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            ((K1.v) this.charlie).alpha(yVar, 0, i11 - 1);
        }
    }

    public o(int i4) {
        switch (i4) {
            case 11:
                C1378u c1378u = new C1378u(0);
                this.alpha = c1378u;
                J2.i iVar = new J2.i((J2.i) null, c1378u);
                this.charlie = iVar;
                this.bravo = iVar.hotel();
                J1 j12 = new J1(1);
                this.delta = j12;
                iVar.november("require", new K3(j12));
                ((HashMap) j12.alpha).put("internal.platform", new Object());
                iVar.november("runtime.counter", new C1323h(Double.valueOf(0.0d)));
                return;
            case 12:
            default:
                this.alpha = null;
                this.bravo = null;
                this.charlie = null;
                this.delta = new ArrayDeque();
                return;
            case 13:
                this.alpha = new Object();
                this.bravo = new Handler(Looper.getMainLooper(), new P3.g(2, this));
                return;
        }
    }
}
