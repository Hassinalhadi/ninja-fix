package bf;

import O7.l;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.appcompat.widget.P0;
import androidx.camera.core.InterfaceC0528j;
import androidx.camera.core.O;
import androidx.camera.core.aa;
import androidx.camera.core.al;
import androidx.camera.core.ao;
import androidx.camera.core.at;
import androidx.camera.core.az;
import androidx.camera.core.impl.B;
import androidx.camera.core.impl.C;
import androidx.camera.core.impl.C0503a;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.C0506d;
import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.C0510h;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC0522u;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.af;
import androidx.camera.core.impl.am;
import androidx.camera.core.impl.an;
import androidx.camera.core.impl.ap;
import androidx.camera.core.impl.aw;
import androidx.camera.core.impl.b0;
import androidx.camera.core.impl.c0;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import androidx.camera.core.r;
import androidx.camera.core.t;
import ao.ad;
import av.ar;
import av.q;
import av.z;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import s6.T7;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class f implements InterfaceC0528j {

    /* renamed from: a, reason: collision with root package name */
    public final Be.e f3373a;
    public final InterfaceC0525x alpha;

    /* renamed from: b, reason: collision with root package name */
    public List f3374b;

    /* renamed from: c, reason: collision with root package name */
    public final l f3375c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3376d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public af f3377f;

    /* renamed from: g, reason: collision with root package name */
    public O f3378g;

    /* renamed from: h, reason: collision with root package name */
    public bn.c f3379h;

    /* renamed from: i, reason: collision with root package name */
    public final I f3380i;

    /* renamed from: j, reason: collision with root package name */
    public final J f3381j;

    /* renamed from: k, reason: collision with root package name */
    public final J f3382k;

    /* renamed from: l, reason: collision with root package name */
    public final at f3383l;

    /* renamed from: m, reason: collision with root package name */
    public final at f3384m;
    public final InterfaceC0525x purple;
    public final J2.e red;
    public final z silver;
    public final C0761a teal;
    public final ArrayList white;
    public final ArrayList yellow;

    public f(InterfaceC0525x interfaceC0525x, InterfaceC0525x interfaceC0525x2, J j5, J j6, Be.e eVar, J2.e eVar2, z zVar) {
        at atVar = at.alpha;
        this.white = new ArrayList();
        this.yellow = new ArrayList();
        this.f3374b = Collections.EMPTY_LIST;
        this.f3376d = new Object();
        this.e = true;
        this.f3377f = null;
        this.alpha = interfaceC0525x;
        this.purple = interfaceC0525x2;
        this.f3383l = atVar;
        this.f3384m = atVar;
        this.f3373a = eVar;
        this.red = eVar2;
        this.silver = zVar;
        l lVar = j5.charlie;
        this.f3375c = lVar;
        lVar.e();
        this.f3380i = new I(interfaceC0525x.golf());
        this.f3381j = j5;
        this.f3382k = j6;
        this.teal = whiskey(j5, j6);
    }

    public static boolean beige(C0509g c0509g, P p4) {
        B b2 = p4.golf.bravo;
        au.a aVar = c0509g.delta;
        aVar.getClass();
        if (P0.oscar(aVar).size() == p4.golf.bravo.romeo().size()) {
            for (C0505c c0505c : P0.oscar(aVar)) {
                if (!b2.alpha.containsKey(c0505c) || !Objects.equals(b2.quebec(c0505c), P0.victor(aVar, c0505c))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static ArrayList crimson(List list, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((O) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw ad.yankee(it2);
            }
        }
        return arrayList2;
    }

    public static Matrix quebec(Rect rect, Size size) {
        boolean z2;
        if (rect.width() > 0 && rect.height() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.bravo("Cannot compute viewport crop rects zero sized sensor rect.", z2);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static ao tango() {
        Object obj;
        Object obj2;
        Object obj3;
        r rVar = new r(1);
        C0505c c0505c = j.crimson;
        aw awVar = rVar.bravo;
        awVar.hotel(c0505c, "ImageCapture-Extra");
        C0505c c0505c2 = am.silver;
        awVar.getClass();
        Object obj4 = null;
        try {
            obj = awVar.quebec(c0505c2);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            awVar.hotel(an.india, num);
        } else {
            al alVar = ao.xray;
            try {
                obj2 = awVar.quebec(am.teal);
            } catch (IllegalArgumentException unused2) {
                obj2 = null;
            }
            if (Objects.equals(obj2, 1)) {
                awVar.hotel(an.india, 4101);
                awVar.hotel(an.juliet, t.charlie);
            } else {
                awVar.hotel(an.india, Integer.valueOf(Barcode.FORMAT_QR_CODE));
            }
        }
        am amVar = new am(B.alpha(awVar));
        androidx.camera.core.impl.ao.echo(amVar);
        ao aoVar = new ao(amVar);
        try {
            obj3 = awVar.quebec(ap.oscar);
        } catch (IllegalArgumentException unused3) {
            obj3 = null;
        }
        Size size = (Size) obj3;
        if (size != null) {
            new Rational(size.getWidth(), size.getHeight());
        }
        C0505c c0505c3 = g.coral;
        Object delta = tg.k.delta();
        try {
            delta = awVar.quebec(c0505c3);
        } catch (IllegalArgumentException unused4) {
        }
        T7.foxtrot((Executor) delta, "The IO executor can't be null");
        C0505c c0505c4 = am.red;
        if (awVar.alpha.containsKey(c0505c4)) {
            Integer num2 = (Integer) awVar.quebec(c0505c4);
            if (num2 != null && (num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                if (num2.intValue() == 3) {
                    try {
                        obj4 = awVar.quebec(am.f2949b);
                    } catch (IllegalArgumentException unused5) {
                    }
                    if (obj4 == null) {
                        throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                    }
                }
            } else {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            }
        }
        return aoVar;
    }

    public static C0761a whiskey(J j5, J j6) {
        String bravo;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j5.alpha.bravo());
        if (j6 == null) {
            bravo = "";
        } else {
            bravo = j6.alpha.bravo();
        }
        sb2.append(bravo);
        return new C0761a(sb2.toString(), (C0506d) j5.charlie.purple);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [bf.e, java.lang.Object] */
    public static HashMap yankee(ArrayList arrayList, c0 c0Var, z zVar) {
        Z echo;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            O o5 = (O) it.next();
            if (o5 instanceof bn.c) {
                bn.c cVar = (bn.c) o5;
                Z echo2 = new aa(1).charlie().echo(false, c0Var);
                if (echo2 == null) {
                    echo = null;
                } else {
                    aw delta = aw.delta(echo2);
                    delta.alpha.remove(j.cyan);
                    echo = ((aa) cVar.juliet(delta)).bravo();
                }
            } else {
                echo = o5.echo(false, c0Var);
            }
            Z echo3 = o5.echo(true, zVar);
            ?? obj = new Object();
            obj.alpha = echo;
            obj.bravo = echo3;
            hashMap.put(o5, obj);
        }
        return hashMap;
    }

    @Override // androidx.camera.core.InterfaceC0528j
    public final InterfaceC0523v alpha() {
        return this.f3381j;
    }

    public final List amber() {
        ArrayList arrayList;
        synchronized (this.f3376d) {
            arrayList = new ArrayList(this.white);
        }
        return arrayList;
    }

    public final void azure() {
        synchronized (this.f3376d) {
            this.f3375c.e();
        }
    }

    public final boolean black() {
        boolean z2;
        synchronized (this.f3376d) {
            l lVar = this.f3375c;
            lVar.getClass();
            z2 = false;
            if (((Integer) ((B) lVar.getConfig()).plum(androidx.camera.core.impl.r.delta, 0)).intValue() == 1) {
                z2 = true;
            }
        }
        return z2;
    }

    public final void blue(ArrayList arrayList) {
        boolean z2;
        synchronized (this.f3376d) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.white);
            linkedHashSet.removeAll(arrayList);
            if (this.purple != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            emerald(linkedHashSet, z2);
        }
    }

    public final void bronze() {
        synchronized (this.f3376d) {
            try {
                if (this.f3377f != null) {
                    this.alpha.golf().cyan(this.f3377f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void charlie(List list) {
        boolean z2;
        synchronized (this.f3376d) {
            try {
                this.alpha.juliet(this.f3375c);
                InterfaceC0525x interfaceC0525x = this.purple;
                if (interfaceC0525x != null) {
                    interfaceC0525x.juliet(this.f3375c);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.white);
                linkedHashSet.addAll(list);
                try {
                    if (this.purple != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    emerald(linkedHashSet, z2);
                } catch (IllegalArgumentException e) {
                    throw new CameraUseCaseAdapter$CameraException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void coral(List list) {
        synchronized (this.f3376d) {
            this.f3374b = list;
        }
    }

    public final void cyan() {
        synchronized (this.f3376d) {
        }
    }

    public final void delta() {
        synchronized (this.f3376d) {
            try {
                if (!this.e) {
                    if (!this.yellow.isEmpty()) {
                        this.alpha.juliet(this.f3375c);
                        InterfaceC0525x interfaceC0525x = this.purple;
                        if (interfaceC0525x != null) {
                            interfaceC0525x.juliet(this.f3375c);
                        }
                    }
                    this.alpha.lima(this.yellow);
                    InterfaceC0525x interfaceC0525x2 = this.purple;
                    if (interfaceC0525x2 != null) {
                        interfaceC0525x2.lima(this.yellow);
                    }
                    bronze();
                    Iterator it = this.yellow.iterator();
                    while (it.hasNext()) {
                        ((O) it.next()).oscar();
                    }
                    this.e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void echo() {
        synchronized (this.f3376d) {
            InterfaceC0522u golf = this.alpha.golf();
            this.f3377f = golf.white();
            golf.m();
        }
    }

    public final void emerald(LinkedHashSet linkedHashSet, boolean z2) {
        C0509g c0509g;
        au.a aVar;
        synchronized (this.f3376d) {
            sierra(linkedHashSet);
            if (!z2) {
                azure();
            }
            bn.c uniform = uniform(linkedHashSet, z2);
            O papa = papa(linkedHashSet, uniform);
            ArrayList arrayList = new ArrayList(linkedHashSet);
            if (papa != null) {
                arrayList.add(papa);
            }
            if (uniform != null) {
                arrayList.add(uniform);
                arrayList.removeAll(uniform.papa.alpha);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.removeAll(this.yellow);
            ArrayList arrayList3 = new ArrayList(arrayList);
            arrayList3.retainAll(this.yellow);
            ArrayList arrayList4 = new ArrayList(this.yellow);
            arrayList4.removeAll(arrayList);
            l lVar = this.f3375c;
            lVar.getClass();
            HashMap yankee = yankee(arrayList2, (c0) ((B) lVar.getConfig()).plum(androidx.camera.core.impl.r.charlie, c0.alpha), this.silver);
            Map map = Collections.EMPTY_MAP;
            try {
                HashMap romeo = romeo(xray(), this.alpha.oscar(), arrayList2, arrayList3, yankee);
                if (this.purple != null) {
                    int xray = xray();
                    InterfaceC0525x interfaceC0525x = this.purple;
                    Objects.requireNonNull(interfaceC0525x);
                    map = romeo(xray, interfaceC0525x.oscar(), arrayList2, arrayList3, yankee);
                }
                fuchsia(romeo, arrayList);
                ArrayList crimson = crimson(this.f3374b, arrayList);
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                arrayList5.removeAll(arrayList);
                ArrayList crimson2 = crimson(crimson, arrayList5);
                if (crimson2.size() > 0) {
                    AbstractC3066u3.india("CameraUseCaseAdapter", "Unused effects: " + crimson2);
                }
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    ((O) it.next()).zulu(this.alpha);
                }
                this.alpha.kilo(arrayList4);
                if (this.purple != null) {
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        O o5 = (O) it2.next();
                        InterfaceC0525x interfaceC0525x2 = this.purple;
                        Objects.requireNonNull(interfaceC0525x2);
                        o5.zulu(interfaceC0525x2);
                    }
                    InterfaceC0525x interfaceC0525x3 = this.purple;
                    Objects.requireNonNull(interfaceC0525x3);
                    interfaceC0525x3.kilo(arrayList4);
                }
                if (arrayList4.isEmpty()) {
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        O o10 = (O) it3.next();
                        if (romeo.containsKey(o10) && (aVar = (c0509g = (C0509g) romeo.get(o10)).delta) != null && beige(c0509g, o10.mike)) {
                            o10.golf = o10.uniform(aVar);
                            if (this.e) {
                                this.alpha.echo(o10);
                                InterfaceC0525x interfaceC0525x4 = this.purple;
                                if (interfaceC0525x4 != null) {
                                    interfaceC0525x4.echo(o10);
                                }
                            }
                        }
                    }
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    O o11 = (O) it4.next();
                    e eVar = (e) yankee.get(o11);
                    Objects.requireNonNull(eVar);
                    InterfaceC0525x interfaceC0525x5 = this.purple;
                    if (interfaceC0525x5 != null) {
                        o11.alpha(this.alpha, interfaceC0525x5, eVar.alpha, eVar.bravo);
                        C0509g c0509g2 = (C0509g) romeo.get(o11);
                        c0509g2.getClass();
                        o11.golf = o11.victor(c0509g2, (C0509g) map.get(o11));
                    } else {
                        o11.alpha(this.alpha, null, eVar.alpha, eVar.bravo);
                        C0509g c0509g3 = (C0509g) romeo.get(o11);
                        c0509g3.getClass();
                        o11.golf = o11.victor(c0509g3, null);
                    }
                }
                if (this.e) {
                    this.alpha.lima(arrayList2);
                    InterfaceC0525x interfaceC0525x6 = this.purple;
                    if (interfaceC0525x6 != null) {
                        interfaceC0525x6.lima(arrayList2);
                    }
                }
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    ((O) it5.next()).oscar();
                }
                this.white.clear();
                this.white.addAll(linkedHashSet);
                this.yellow.clear();
                this.yellow.addAll(arrayList);
                this.f3378g = papa;
                this.f3379h = uniform;
            } catch (IllegalArgumentException e) {
                if (!z2) {
                    azure();
                    if (this.f3373a.alpha != 2) {
                        emerald(linkedHashSet, true);
                        return;
                    }
                }
                throw e;
            }
        }
    }

    public final void fuchsia(HashMap hashMap, ArrayList arrayList) {
        synchronized (this.f3376d) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    O o5 = (O) it.next();
                    Rect gold = this.alpha.golf().gold();
                    C0509g c0509g = (C0509g) hashMap.get(o5);
                    c0509g.getClass();
                    o5.xray(quebec(gold, c0509g.alpha));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final O papa(LinkedHashSet linkedHashSet, bn.c cVar) {
        O o5;
        synchronized (this.f3376d) {
            try {
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (cVar != null) {
                    arrayList.add(cVar);
                    arrayList.removeAll(cVar.papa.alpha);
                }
                if (black()) {
                    Iterator it = arrayList.iterator();
                    boolean z2 = false;
                    boolean z10 = false;
                    boolean z11 = false;
                    while (it.hasNext()) {
                        O o10 = (O) it.next();
                        if (!(o10 instanceof az) && !(o10 instanceof bn.c)) {
                            if (o10 instanceof ao) {
                                z10 = true;
                            }
                        }
                        z11 = true;
                    }
                    if (z10 && !z11) {
                        O o11 = this.f3378g;
                        if (!(o11 instanceof az)) {
                            aa aaVar = new aa(1);
                            aaVar.bravo.hotel(j.crimson, "Preview-Extra");
                            az charlie = aaVar.charlie();
                            charlie.beige(new S7.a(21));
                            o5 = charlie;
                        }
                    } else {
                        Iterator it2 = arrayList.iterator();
                        boolean z12 = false;
                        while (it2.hasNext()) {
                            O o12 = (O) it2.next();
                            if (!(o12 instanceof az) && !(o12 instanceof bn.c)) {
                                if (o12 instanceof ao) {
                                    z12 = true;
                                }
                            }
                            z2 = true;
                        }
                        if (z2 && !z12) {
                            O o13 = this.f3378g;
                            o5 = o13 instanceof ao ? o13 : tango();
                        }
                    }
                }
                o5 = null;
            } finally {
            }
        }
        return o5;
    }

    public final HashMap romeo(int i4, InterfaceC0523v interfaceC0523v, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap) {
        Size size;
        J2.e eVar;
        Rect rect;
        boolean z2;
        Size size2;
        C0510h c0510h;
        ArrayList arrayList3 = new ArrayList();
        String bravo = interfaceC0523v.bravo();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            size = null;
            eVar = this.red;
            if (!hasNext) {
                break;
            }
            O o5 = (O) it.next();
            int oscar = o5.foxtrot.oscar();
            C0509g c0509g = o5.golf;
            if (c0509g != null) {
                size2 = c0509g.alpha;
            } else {
                size2 = null;
            }
            ar arVar = (ar) ((HashMap) eVar.purple).get(bravo);
            if (arVar != null) {
                c0510h = C0510h.bravo(i4, oscar, size2, arVar.india(oscar));
            } else {
                c0510h = null;
            }
            int oscar2 = o5.foxtrot.oscar();
            C0509g c0509g2 = o5.golf;
            if (c0509g2 != null) {
                size = c0509g2.alpha;
            }
            c0509g2.getClass();
            C0503a c0503a = new C0503a(c0510h, oscar2, size, c0509g2.bravo, bn.c.bronze(o5), o5.golf.delta, o5.foxtrot.november());
            arrayList3.add(c0503a);
            hashMap3.put(c0503a, o5);
            hashMap2.put(o5, o5.golf);
        }
        if (!arrayList.isEmpty()) {
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            try {
                rect = this.alpha.golf().gold();
            } catch (NullPointerException unused) {
                rect = null;
            }
            if (rect != null) {
                size = bc.f.delta(rect);
            }
            S.j jVar = new S.j(interfaceC0523v, size);
            Iterator it2 = arrayList.iterator();
            boolean z10 = false;
            while (it2.hasNext()) {
                O o10 = (O) it2.next();
                e eVar2 = (e) hashMap.get(o10);
                Z lima = o10.lima(interfaceC0523v, eVar2.alpha, eVar2.bravo);
                hashMap4.put(lima, o10);
                hashMap5.put(lima, jVar.golf(lima));
                Z z11 = o10.foxtrot;
                if (z11 instanceof C) {
                    C c3 = (C) z11;
                    c3.getClass();
                    if (P0.india(c3) == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    O o11 = (O) it3.next();
                    if (o11 != null) {
                        if (o11.foxtrot.echo(Z.beige)) {
                            if (o11.foxtrot.emerald() == b0.silver) {
                                z2 = true;
                                break;
                            }
                        } else {
                            Log.e("CameraUseCaseAdapter", o11 + " UseCase does not have capture type.");
                        }
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            eVar.getClass();
            T7.bravo("No new use cases to be bound.", !hashMap5.isEmpty());
            ar arVar2 = (ar) ((HashMap) eVar.purple).get(bravo);
            if (arVar2 != null) {
                Pair golf = arVar2.golf(i4, arrayList3, hashMap5, z10, z2);
                for (Map.Entry entry : hashMap4.entrySet()) {
                    hashMap2.put((O) entry.getValue(), (C0509g) ((Map) golf.first).get(entry.getKey()));
                }
                for (Map.Entry entry2 : ((Map) golf.second).entrySet()) {
                    if (hashMap3.containsKey(entry2.getKey())) {
                        hashMap2.put((O) hashMap3.get(entry2.getKey()), (C0509g) entry2.getValue());
                    }
                }
            } else {
                throw new IllegalArgumentException(q.echo("No such camera id in supported combination list: ", bravo));
            }
        }
        return hashMap2;
    }

    public final void sierra(LinkedHashSet linkedHashSet) {
        boolean z2;
        azure();
        synchronized (this.f3376d) {
            try {
                if (!this.f3374b.isEmpty()) {
                    Iterator it = linkedHashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            O o5 = (O) it.next();
                            if (o5 instanceof ao) {
                                Z z10 = o5.foxtrot;
                                C0505c c0505c = am.teal;
                                if (z10.echo(c0505c)) {
                                    Integer num = (Integer) z10.quebec(c0505c);
                                    num.getClass();
                                    z2 = true;
                                    if (num.intValue() == 1) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                    }
                }
            } finally {
            }
        }
    }

    public final bn.c uniform(LinkedHashSet linkedHashSet, boolean z2) {
        boolean z10;
        synchronized (this.f3376d) {
            try {
                HashSet zulu = zulu(linkedHashSet, z2);
                if (zulu.size() < 2) {
                    azure();
                    return null;
                }
                bn.c cVar = this.f3379h;
                if (cVar != null && cVar.papa.alpha.equals(zulu)) {
                    bn.c cVar2 = this.f3379h;
                    Objects.requireNonNull(cVar2);
                    return cVar2;
                }
                int[] iArr = {1, 2, 4};
                HashSet hashSet = new HashSet();
                Iterator it = zulu.iterator();
                while (it.hasNext()) {
                    O o5 = (O) it.next();
                    for (int i4 = 0; i4 < 3; i4++) {
                        int i5 = iArr[i4];
                        Iterator it2 = o5.india().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                int intValue = ((Integer) it2.next()).intValue();
                                if ((i5 & intValue) == intValue) {
                                    z10 = true;
                                    break;
                                }
                            } else {
                                z10 = false;
                                break;
                            }
                        }
                        if (z10) {
                            if (hashSet.contains(Integer.valueOf(i5))) {
                                return null;
                            }
                            hashSet.add(Integer.valueOf(i5));
                        }
                    }
                }
                return new bn.c(this.alpha, this.purple, this.f3383l, this.f3384m, zulu, this.silver);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void victor() {
        synchronized (this.f3376d) {
            try {
                if (this.e) {
                    this.alpha.kilo(new ArrayList(this.yellow));
                    InterfaceC0525x interfaceC0525x = this.purple;
                    if (interfaceC0525x != null) {
                        interfaceC0525x.kilo(new ArrayList(this.yellow));
                    }
                    echo();
                    this.e = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int xray() {
        synchronized (this.f3376d) {
            try {
                if (this.f3373a.alpha == 2) {
                    return 1;
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet zulu(LinkedHashSet linkedHashSet, boolean z2) {
        int i4;
        HashSet hashSet = new HashSet();
        synchronized (this.f3376d) {
            Iterator it = this.f3374b.iterator();
            if (!it.hasNext()) {
                if (z2) {
                    i4 = 3;
                } else {
                    i4 = 0;
                }
            } else {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            O o5 = (O) it2.next();
            T7.bravo("Only support one level of sharing for now.", !(o5 instanceof bn.c));
            Iterator it3 = o5.india().iterator();
            while (true) {
                if (it3.hasNext()) {
                    int intValue = ((Integer) it3.next()).intValue();
                    if ((i4 & intValue) == intValue) {
                        hashSet.add(o5);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }
}
