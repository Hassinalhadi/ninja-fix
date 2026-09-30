package androidx.camera.core;

import android.util.Log;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.appcompat.widget.P0;
import androidx.camera.core.impl.AbstractC0512j;
import androidx.camera.core.impl.AbstractC0514l;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.C0507e;
import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.camera.core.impl.Y;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.c0;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import bb.C0743a;
import bb.C0745c;
import bb.C0746d;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import s6.T7;
import t6.AbstractC3061t3;
import t6.AbstractC3066u3;
import t6.j4;

/* loaded from: classes3.dex */
public final class ao extends O {
    public static final al xray = new Object();
    public final int oscar;
    public final AtomicReference papa;
    public final int quebec;
    public final bf.h romeo;
    public androidx.camera.core.impl.L sierra;
    public com.google.firebase.messaging.o tango;
    public C0746d uniform;
    public androidx.camera.core.impl.M victor;
    public final at whiskey;

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.camera.core.at, java.lang.Object] */
    public ao(androidx.camera.core.impl.am amVar) {
        super(amVar);
        this.papa = new AtomicReference(null);
        this.quebec = -1;
        this.whiskey = new Object();
        androidx.camera.core.impl.am amVar2 = (androidx.camera.core.impl.am) this.foxtrot;
        C0505c c0505c = androidx.camera.core.impl.am.purple;
        if (amVar2.echo(c0505c)) {
            this.oscar = ((Integer) P0.victor(amVar2, c0505c)).intValue();
        } else {
            this.oscar = 1;
        }
        ((Integer) amVar2.plum(androidx.camera.core.impl.am.f2948a, 0)).getClass();
        this.romeo = new bf.h((am) amVar2.plum(androidx.camera.core.impl.am.f2949b, null));
    }

    public static boolean blue(int i4, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i4))) {
                return true;
            }
        }
        return false;
    }

    public final void azure(boolean z2) {
        C0746d c0746d;
        Log.d("ImageCapture", "clearPipeline");
        j4.alpha();
        androidx.camera.core.impl.M m4 = this.victor;
        if (m4 != null) {
            m4.bravo();
            this.victor = null;
        }
        com.google.firebase.messaging.o oVar = this.tango;
        if (oVar != null) {
            oVar.india();
            this.tango = null;
        }
        if (!z2 && (c0746d = this.uniform) != null) {
            c0746d.alpha();
            this.uniform = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, com.google.firebase.messaging.o] */
    public final androidx.camera.core.impl.L beige(String str, androidx.camera.core.impl.am amVar, C0509g c0509g) {
        int i4;
        boolean z2;
        ax.a aVar;
        androidx.core.widget.f fVar;
        boolean z10;
        boolean z11;
        int i5 = 2;
        boolean z12 = false;
        int i10 = 1;
        j4.alpha();
        Log.d("ImageCapture", "createPipeline(cameraId: " + str + ", streamSpec: " + c0509g + ")");
        Size size = c0509g.alpha;
        InterfaceC0525x bravo = bravo();
        Objects.requireNonNull(bravo);
        boolean mike = bravo.mike();
        boolean z13 = mike ^ true;
        if (this.tango != null) {
            T7.golf(null, z13);
            this.tango.india();
        }
        if (((Boolean) this.foxtrot.plum(androidx.camera.core.impl.am.f2950c, Boolean.FALSE)).booleanValue()) {
            ((O7.l) bravo().hotel()).e();
        }
        ?? obj = new Object();
        j4.alpha();
        obj.alpha = amVar;
        av.x xVar = (av.x) amVar.plum(Z.xray, null);
        if (xVar != null) {
            S2.l lVar = new S2.l();
            xVar.alpha(amVar, lVar);
            lVar.hotel();
            w.o oVar = new w.o(25, z12);
            obj.bravo = oVar;
            Executor executor = (Executor) amVar.plum(bf.g.coral, tg.k.delta());
            Objects.requireNonNull(executor);
            R3.s sVar = new R3.s(executor);
            obj.charlie = sVar;
            int oscar = amVar.oscar();
            Integer num = (Integer) amVar.plum(androidx.camera.core.impl.am.silver, null);
            if (num != null) {
                i4 = num.intValue();
            } else {
                Integer num2 = (Integer) amVar.plum(androidx.camera.core.impl.an.india, null);
                if (num2 != null && num2.intValue() == 4101) {
                    i4 = 4101;
                } else {
                    i4 = Barcode.FORMAT_QR_CODE;
                }
            }
            if (amVar.plum(androidx.camera.core.impl.am.white, null) == null) {
                int i11 = i4;
                bj.d dVar = new bj.d();
                bj.d dVar2 = new bj.d();
                C0743a c0743a = new C0743a(size, oscar, i11, z13, dVar, dVar2);
                obj.delta = c0743a;
                if (((C0743a) oVar.red) == null && ((S2.l) oVar.purple) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                T7.golf("CaptureNode does not support recreation yet.", z2);
                oVar.red = c0743a;
                au auVar = new au(i10, oVar);
                if (mike) {
                    av avVar = new av(size.getWidth(), size.getHeight(), oscar, 4);
                    List<AbstractC0512j> asList = Arrays.asList(auVar, avVar.purple);
                    if (!asList.isEmpty()) {
                        if (asList.size() == 1) {
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (AbstractC0512j abstractC0512j : asList) {
                                if (!(abstractC0512j instanceof AbstractC0514l)) {
                                    arrayList.add(abstractC0512j);
                                }
                            }
                        }
                    }
                    aVar = new ax.a(oVar, 1);
                    fVar = avVar;
                } else {
                    androidx.core.widget.f fVar2 = new androidx.core.widget.f(10, AbstractC3061t3.bravo(size.getWidth(), size.getHeight(), oscar, 4));
                    aVar = new ax.a(oVar, i5);
                    fVar = fVar2;
                }
                Surface romeo = fVar.romeo();
                Objects.requireNonNull(romeo);
                if (c0743a.alpha == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                T7.golf("The surface is already set.", z10);
                c0743a.alpha = new J(romeo, size, oscar);
                oVar.purple = new S2.l(fVar);
                fVar.yankee(new a4.u(8, oVar), tg.k.echo());
                dVar.bravo = aVar;
                dVar2.bravo = new C0745c(0, oVar);
                this.tango = obj;
                if (this.uniform == null) {
                    this.uniform = new C0746d(this.whiskey);
                }
                C0746d c0746d = this.uniform;
                com.google.firebase.messaging.o oVar2 = this.tango;
                c0746d.getClass();
                j4.alpha();
                c0746d.purple = oVar2;
                oVar2.getClass();
                j4.alpha();
                w.o oVar3 = (w.o) oVar2.bravo;
                oVar3.getClass();
                j4.alpha();
                if (((S2.l) oVar3.purple) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                T7.golf("The ImageReader is not initialized.", z11);
                S2.l lVar2 = (S2.l) oVar3.purple;
                synchronized (lVar2.red) {
                    lVar2.white = c0746d;
                }
                com.google.firebase.messaging.o oVar4 = this.tango;
                androidx.camera.core.impl.L delta = androidx.camera.core.impl.L.delta((androidx.camera.core.impl.am) oVar4.alpha, c0509g.alpha);
                C0743a c0743a2 = (C0743a) oVar4.delta;
                J j5 = c0743a2.alpha;
                Objects.requireNonNull(j5);
                t tVar = t.delta;
                B9.ab alpha = C0507e.alpha(j5);
                alpha.teal = tVar;
                delta.alpha.add(alpha.whiskey());
                J j6 = c0743a2.bravo;
                if (j6 != null) {
                    delta.hotel = C0507e.alpha(j6).whiskey();
                }
                if (this.oscar == 2 && !c0509g.echo) {
                    charlie().ochre(delta);
                }
                au.a aVar2 = c0509g.delta;
                if (aVar2 != null) {
                    delta.bravo.echo(aVar2);
                }
                androidx.camera.core.impl.M m4 = this.victor;
                if (m4 != null) {
                    m4.bravo();
                }
                androidx.camera.core.impl.M m5 = new androidx.camera.core.impl.M(new x(1, this));
                this.victor = m5;
                delta.foxtrot = m5;
                return delta;
            }
            throw new ClassCastException();
        }
        throw new IllegalStateException("Implementation is missing option unpacker for " + ao.ad.bravo(amVar, amVar.toString()));
    }

    public final int black() {
        int i4;
        synchronized (this.papa) {
            i4 = this.quebec;
            if (i4 == -1) {
                i4 = ((Integer) ((androidx.camera.core.impl.am) this.foxtrot).plum(androidx.camera.core.impl.am.red, 2)).intValue();
            }
        }
        return i4;
    }

    @Override // androidx.camera.core.O
    public final Z echo(boolean z2, c0 c0Var) {
        xray.getClass();
        androidx.camera.core.impl.am amVar = al.alpha;
        amVar.getClass();
        androidx.camera.core.impl.af alpha = c0Var.alpha(P0.foxtrot(amVar), this.oscar);
        if (z2) {
            alpha = P0.jade(alpha, amVar);
        }
        if (alpha == null) {
            return null;
        }
        return new androidx.camera.core.impl.am(androidx.camera.core.impl.B.alpha(((r) juliet(alpha)).bravo));
    }

    @Override // androidx.camera.core.O
    public final Set india() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // androidx.camera.core.O
    public final Y juliet(androidx.camera.core.impl.af afVar) {
        return new r(androidx.camera.core.impl.aw.delta(afVar));
    }

    @Override // androidx.camera.core.O
    public final void papa() {
        int i4;
        T7.foxtrot(bravo(), "Attached camera cannot be null");
        if (black() == 3) {
            InterfaceC0525x bravo = bravo();
            if (bravo != null) {
                i4 = bravo.alpha().echo();
            } else {
                i4 = -1;
            }
            if (i4 != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override // androidx.camera.core.O
    public final void quebec() {
        AbstractC3066u3.bravo("ImageCapture", "onCameraControlReady");
        synchronized (this.papa) {
            try {
                if (this.papa.get() == null) {
                    charlie().ivory(black());
                }
            } finally {
            }
        }
        charlie().f(this.romeo);
    }

    @Override // androidx.camera.core.O
    public final Z romeo(InterfaceC0523v interfaceC0523v, Y y10) {
        Object obj;
        Object obj2;
        Object obj3;
        if (interfaceC0523v.hotel().alpha(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            androidx.camera.core.impl.af alpha = y10.alpha();
            C0505c c0505c = androidx.camera.core.impl.am.yellow;
            Object obj4 = Boolean.TRUE;
            androidx.camera.core.impl.B b2 = (androidx.camera.core.impl.B) alpha;
            b2.getClass();
            try {
                obj4 = b2.quebec(c0505c);
            } catch (IllegalArgumentException unused) {
            }
            if (bool.equals(obj4)) {
                AbstractC3066u3.india("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                String hotel = AbstractC3066u3.hotel("ImageCapture");
                if (AbstractC3066u3.foxtrot(4, hotel)) {
                    Log.i(hotel, "Requesting software JPEG due to device quirk.");
                }
                ((androidx.camera.core.impl.aw) y10.alpha()).hotel(androidx.camera.core.impl.am.yellow, Boolean.TRUE);
            }
        }
        androidx.camera.core.impl.af alpha2 = y10.alpha();
        Boolean bool2 = Boolean.TRUE;
        C0505c c0505c2 = androidx.camera.core.impl.am.yellow;
        Object obj5 = Boolean.FALSE;
        androidx.camera.core.impl.B b4 = (androidx.camera.core.impl.B) alpha2;
        b4.getClass();
        try {
            obj5 = b4.quebec(c0505c2);
        } catch (IllegalArgumentException unused2) {
        }
        boolean equals = bool2.equals(obj5);
        Object obj6 = null;
        boolean z2 = false;
        if (equals) {
            if (bravo() != null) {
                ((O7.l) bravo().hotel()).e();
            }
            try {
                obj3 = b4.quebec(androidx.camera.core.impl.am.silver);
            } catch (IllegalArgumentException unused3) {
                obj3 = null;
            }
            Integer num = (Integer) obj3;
            if (num != null && num.intValue() != 256) {
                AbstractC3066u3.india("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            } else {
                z2 = true;
            }
            if (!z2) {
                AbstractC3066u3.india("ImageCapture", "Unable to support software JPEG. Disabling.");
                ((androidx.camera.core.impl.aw) alpha2).hotel(androidx.camera.core.impl.am.yellow, Boolean.FALSE);
            }
        }
        androidx.camera.core.impl.af alpha3 = y10.alpha();
        C0505c c0505c3 = androidx.camera.core.impl.am.silver;
        androidx.camera.core.impl.B b6 = (androidx.camera.core.impl.B) alpha3;
        b6.getClass();
        try {
            obj = b6.quebec(c0505c3);
        } catch (IllegalArgumentException unused4) {
            obj = null;
        }
        Integer num2 = (Integer) obj;
        int i4 = 35;
        if (num2 != null) {
            if (bravo() != null) {
                ((O7.l) bravo().hotel()).e();
            }
            androidx.camera.core.impl.av alpha4 = y10.alpha();
            C0505c c0505c4 = androidx.camera.core.impl.an.india;
            if (!z2) {
                i4 = num2.intValue();
            }
            ((androidx.camera.core.impl.aw) alpha4).hotel(c0505c4, Integer.valueOf(i4));
        } else {
            androidx.camera.core.impl.af alpha5 = y10.alpha();
            C0505c c0505c5 = androidx.camera.core.impl.am.teal;
            androidx.camera.core.impl.B b10 = (androidx.camera.core.impl.B) alpha5;
            b10.getClass();
            try {
                obj2 = b10.quebec(c0505c5);
            } catch (IllegalArgumentException unused5) {
                obj2 = null;
            }
            if (Objects.equals(obj2, 1)) {
                ((androidx.camera.core.impl.aw) y10.alpha()).hotel(androidx.camera.core.impl.an.india, 4101);
                ((androidx.camera.core.impl.aw) y10.alpha()).hotel(androidx.camera.core.impl.an.juliet, t.charlie);
            } else if (z2) {
                ((androidx.camera.core.impl.aw) y10.alpha()).hotel(androidx.camera.core.impl.an.india, 35);
            } else {
                androidx.camera.core.impl.af alpha6 = y10.alpha();
                C0505c c0505c6 = androidx.camera.core.impl.ap.romeo;
                androidx.camera.core.impl.B b11 = (androidx.camera.core.impl.B) alpha6;
                b11.getClass();
                try {
                    obj6 = b11.quebec(c0505c6);
                } catch (IllegalArgumentException unused6) {
                }
                List list = (List) obj6;
                if (list == null) {
                    ((androidx.camera.core.impl.aw) y10.alpha()).hotel(androidx.camera.core.impl.an.india, Integer.valueOf(Barcode.FORMAT_QR_CODE));
                } else if (blue(Barcode.FORMAT_QR_CODE, list)) {
                    ((androidx.camera.core.impl.aw) y10.alpha()).hotel(androidx.camera.core.impl.an.india, Integer.valueOf(Barcode.FORMAT_QR_CODE));
                } else if (blue(35, list)) {
                    ((androidx.camera.core.impl.aw) y10.alpha()).hotel(androidx.camera.core.impl.an.india, 35);
                }
            }
        }
        return y10.bravo();
    }

    @Override // androidx.camera.core.O
    public final void tango() {
        bf.h hVar = this.romeo;
        hVar.bravo();
        hVar.alpha();
        C0746d c0746d = this.uniform;
        if (c0746d != null) {
            c0746d.alpha();
        }
    }

    public final String toString() {
        return "ImageCapture:".concat(foxtrot());
    }

    @Override // androidx.camera.core.O
    public final C0509g uniform(au.a aVar) {
        this.sierra.alpha(aVar);
        Object[] objArr = {this.sierra.charlie()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        amber(Collections.unmodifiableList(arrayList));
        B9.ab alpha = this.golf.alpha();
        alpha.silver = aVar;
        return alpha.xray();
    }

    @Override // androidx.camera.core.O
    public final C0509g victor(C0509g c0509g, C0509g c0509g2) {
        androidx.camera.core.impl.L beige = beige(delta(), (androidx.camera.core.impl.am) this.foxtrot, c0509g);
        this.sierra = beige;
        Object[] objArr = {beige.charlie()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        amber(Collections.unmodifiableList(arrayList));
        mike();
        return c0509g;
    }

    @Override // androidx.camera.core.O
    public final void whiskey() {
        bf.h hVar = this.romeo;
        hVar.bravo();
        hVar.alpha();
        C0746d c0746d = this.uniform;
        if (c0746d != null) {
            c0746d.alpha();
        }
        azure(false);
        charlie().f(null);
    }
}
