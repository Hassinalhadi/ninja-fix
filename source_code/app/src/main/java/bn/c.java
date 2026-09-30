package bn;

import A2.s;
import B9.ab;
import J2.t;
import S2.l;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.appcompat.widget.P0;
import androidx.camera.core.O;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.aa;
import androidx.camera.core.at;
import androidx.camera.core.impl.AbstractC0512j;
import androidx.camera.core.impl.B;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.camera.core.impl.L;
import androidx.camera.core.impl.M;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.Y;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.ad;
import androidx.camera.core.impl.af;
import androidx.camera.core.impl.ai;
import androidx.camera.core.impl.an;
import androidx.camera.core.impl.ap;
import androidx.camera.core.impl.aw;
import androidx.camera.core.impl.c0;
import av.z;
import bb.C0745c;
import bj.k;
import bj.m;
import bj.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import s6.T7;
import t6.AbstractC3066u3;
import t6.j4;

/* loaded from: classes3.dex */
public final class c extends O {
    public M amber;
    public final d oscar;
    public final f papa;
    public final at quebec;
    public final at romeo;
    public t sierra;
    public ab tango;
    public k uniform;
    public k victor;
    public k whiskey;
    public k xray;
    public L yankee;
    public L zulu;

    public c(InterfaceC0525x interfaceC0525x, InterfaceC0525x interfaceC0525x2, at atVar, at atVar2, HashSet hashSet, z zVar) {
        super(coral(hashSet));
        this.oscar = coral(hashSet);
        this.quebec = atVar;
        this.romeo = atVar2;
        this.papa = new f(interfaceC0525x, interfaceC0525x2, hashSet, zVar, new S7.a(22));
    }

    public static ArrayList bronze(O o5) {
        ArrayList arrayList = new ArrayList();
        if (o5 instanceof c) {
            Iterator it = ((c) o5).papa.alpha.iterator();
            while (it.hasNext()) {
                arrayList.add(((O) it.next()).foxtrot.emerald());
            }
            return arrayList;
        }
        arrayList.add(o5.foxtrot.emerald());
        return arrayList;
    }

    public static d coral(HashSet hashSet) {
        aw bravo = aw.bravo();
        new aa(bravo, 2);
        bravo.hotel(an.india, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            O o5 = (O) it.next();
            if (o5.foxtrot.echo(Z.beige)) {
                arrayList.add(o5.foxtrot.emerald());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        bravo.hotel(d.purple, arrayList);
        bravo.hotel(ap.november, 2);
        return new d(B.alpha(bravo));
    }

    public final void azure() {
        M m4 = this.amber;
        if (m4 != null) {
            m4.bravo();
            this.amber = null;
        }
        k kVar = this.uniform;
        if (kVar != null) {
            kVar.bravo();
            this.uniform = null;
        }
        k kVar2 = this.victor;
        if (kVar2 != null) {
            kVar2.bravo();
            this.victor = null;
        }
        k kVar3 = this.whiskey;
        if (kVar3 != null) {
            kVar3.bravo();
            this.whiskey = null;
        }
        k kVar4 = this.xray;
        if (kVar4 != null) {
            kVar4.bravo();
            this.xray = null;
        }
        t tVar = this.sierra;
        if (tVar != null) {
            ((bj.c) tVar.alpha).alpha();
            j4.delta(new ai(16, tVar));
            this.sierra = null;
        }
        ab abVar = this.tango;
        if (abVar != null) {
            ((m) abVar.purple).alpha();
            j4.delta(new ai(18, abVar));
            this.tango = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, J2.t] */
    public final List beige(String str, String str2, Z z2, C0509g c0509g, C0509g c0509g2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        j4.alpha();
        f fVar = this.papa;
        int i4 = 0;
        if (c0509g2 == null) {
            black(str, str2, z2, c0509g, null);
            InterfaceC0525x bravo = bravo();
            Objects.requireNonNull(bravo);
            bj.c cVar = new bj.c(c0509g.bravo);
            ?? obj = new Object();
            obj.purple = bravo;
            obj.alpha = cVar;
            this.sierra = obj;
            if (this.india != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            k kVar = this.whiskey;
            int crimson = ((ap) this.foxtrot).crimson();
            fVar.getClass();
            HashMap hashMap = new HashMap();
            Iterator it = fVar.alpha.iterator();
            while (it.hasNext()) {
                O o5 = (O) it.next();
                a aVar = fVar.f3401d;
                InterfaceC0525x interfaceC0525x = fVar.white;
                f fVar2 = fVar;
                boolean z15 = z13;
                hashMap.put(o5, fVar2.quebec(o5, aVar, interfaceC0525x, kVar, crimson, z15));
                z13 = z15;
                fVar = fVar2;
            }
            f fVar3 = fVar;
            t tVar = this.sierra;
            k kVar2 = this.whiskey;
            ArrayList arrayList = new ArrayList(hashMap.values());
            if (kVar2 != null) {
                tVar.getClass();
                j4.alpha();
                tVar.red = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    bl.b bVar = (bl.b) it2.next();
                    n nVar = (n) tVar.red;
                    Rect rect = bVar.delta;
                    Matrix matrix = new Matrix(kVar2.bravo);
                    RectF rectF = new RectF(rect);
                    RectF rectF2 = bc.f.alpha;
                    float f5 = i4;
                    Size size = bVar.echo;
                    Iterator it3 = it2;
                    RectF rectF3 = new RectF(f5, f5, size.getWidth(), size.getHeight());
                    int i5 = bVar.foxtrot;
                    boolean z16 = bVar.golf;
                    matrix.postConcat(bc.f.alpha(rectF, rectF3, i5, z16));
                    T7.charlie(bc.f.charlie(bc.f.echo(bc.f.delta(rect), i5), false, size));
                    Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
                    ab alpha = kVar2.golf.alpha();
                    alpha.purple = size;
                    C0509g xray = alpha.xray();
                    int i10 = kVar2.india - i5;
                    if (kVar2.echo != z16) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    nVar.put(bVar, new k(bVar.bravo, bVar.charlie, xray, matrix, false, rect2, i10, -1, z14));
                    it2 = it3;
                    i4 = 0;
                }
                try {
                    ((bj.c) tVar.alpha).charlie(kVar2.charlie((InterfaceC0525x) tVar.purple, true));
                } catch (ProcessingException e) {
                    AbstractC3066u3.delta("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
                }
                for (Map.Entry entry : ((n) tVar.red).entrySet()) {
                    tVar.india(kVar2, entry);
                    k kVar3 = (k) entry.getValue();
                    s sVar = new s(tVar, kVar2, entry, 20);
                    kVar3.getClass();
                    j4.alpha();
                    kVar3.alpha();
                    kVar3.mike.add(sVar);
                }
                kVar2.oscar.add(new C0745c(1, (n) tVar.red));
                n nVar2 = (n) tVar.red;
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    hashMap2.put((O) entry2.getKey(), (k) nVar2.get(entry2.getValue()));
                }
                fVar3.uniform(hashMap2);
                Object[] objArr = {this.yankee.charlie()};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                return Collections.unmodifiableList(arrayList2);
            }
            throw new NullPointerException("Null surfaceEdge");
        }
        black(str, str2, z2, c0509g, c0509g2);
        Matrix matrix2 = this.juliet;
        InterfaceC0525x hotel = hotel();
        Objects.requireNonNull(hotel);
        boolean mike = hotel.mike();
        Rect rect3 = this.india;
        if (rect3 != null) {
            z10 = false;
        } else {
            Size size2 = c0509g2.alpha;
            z10 = false;
            rect3 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
        }
        Rect rect4 = rect3;
        InterfaceC0525x hotel2 = hotel();
        Objects.requireNonNull(hotel2);
        int golf = golf(hotel2, z10);
        InterfaceC0525x hotel3 = hotel();
        Objects.requireNonNull(hotel3);
        f fVar4 = fVar;
        k kVar4 = new k(3, 34, c0509g2, matrix2, mike, rect4, golf, -1, kilo(hotel3));
        this.victor = kVar4;
        Objects.requireNonNull(hotel());
        this.xray = kVar4;
        L blue = blue(this.victor, z2, c0509g2);
        this.zulu = blue;
        M m4 = this.amber;
        if (m4 != null) {
            m4.bravo();
        }
        M m5 = new M(new b(this, str, str2, z2, c0509g, c0509g2));
        this.amber = m5;
        blue.foxtrot = m5;
        this.tango = new ab(bravo(), hotel(), new bk.e(c0509g.bravo, this.quebec, this.romeo));
        if (this.india != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        k kVar5 = this.whiskey;
        k kVar6 = this.xray;
        int crimson2 = ((ap) this.foxtrot).crimson();
        fVar4.getClass();
        HashMap hashMap3 = new HashMap();
        Iterator it4 = fVar4.alpha.iterator();
        while (it4.hasNext()) {
            O o10 = (O) it4.next();
            f fVar5 = fVar4;
            bl.b quebec = fVar5.quebec(o10, fVar4.f3401d, fVar4.white, kVar5, crimson2, z11);
            k kVar7 = kVar5;
            InterfaceC0525x interfaceC0525x2 = fVar5.yellow;
            Objects.requireNonNull(interfaceC0525x2);
            k kVar8 = kVar6;
            hashMap3.put(o10, new bk.a(quebec, fVar5.quebec(o10, fVar5.e, interfaceC0525x2, kVar8, crimson2, z11)));
            fVar4 = fVar5;
            kVar6 = kVar8;
            kVar5 = kVar7;
        }
        f fVar6 = fVar4;
        ab abVar = this.tango;
        bk.b bVar2 = new bk.b(this.whiskey, this.xray, new ArrayList(hashMap3.values()));
        abVar.getClass();
        m mVar = (m) abVar.purple;
        j4.alpha();
        abVar.teal = bVar2;
        abVar.silver = new HashMap();
        bk.b bVar3 = (bk.b) abVar.teal;
        k kVar9 = bVar3.alpha;
        Iterator it5 = bVar3.charlie.iterator();
        while (it5.hasNext()) {
            bk.a aVar2 = (bk.a) it5.next();
            n nVar3 = (n) abVar.silver;
            bl.b bVar4 = aVar2.alpha;
            Matrix matrix3 = new Matrix();
            Size delta = bc.f.delta(bVar4.delta);
            int i11 = bVar4.foxtrot;
            Size echo = bc.f.echo(delta, i11);
            Size size3 = bVar4.echo;
            HashMap hashMap4 = hashMap3;
            T7.charlie(bc.f.charlie(echo, false, size3));
            Iterator it6 = it5;
            Rect rect5 = new Rect(0, 0, size3.getWidth(), size3.getHeight());
            ab alpha2 = kVar9.golf.alpha();
            alpha2.purple = size3;
            C0509g xray2 = alpha2.xray();
            int i12 = kVar9.india - i11;
            if (kVar9.echo != bVar4.golf) {
                z12 = true;
            } else {
                z12 = false;
            }
            nVar3.put(aVar2, new k(bVar4.bravo, bVar4.charlie, xray2, matrix3, false, rect5, i12, -1, z12));
            hashMap3 = hashMap4;
            it5 = it6;
        }
        HashMap hashMap5 = hashMap3;
        try {
            mVar.charlie(kVar9.charlie((InterfaceC0525x) abVar.white, true));
        } catch (ProcessingException e4) {
            AbstractC3066u3.delta("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e4);
        }
        k kVar10 = bVar3.bravo;
        try {
            mVar.charlie(kVar10.charlie((InterfaceC0525x) abVar.red, false));
        } catch (ProcessingException e5) {
            AbstractC3066u3.delta("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e5);
        }
        for (Map.Entry entry3 : ((n) abVar.silver).entrySet()) {
            InterfaceC0525x interfaceC0525x3 = (InterfaceC0525x) abVar.white;
            InterfaceC0525x interfaceC0525x4 = (InterfaceC0525x) abVar.red;
            ab abVar2 = abVar;
            k kVar11 = kVar10;
            k kVar12 = kVar9;
            abVar2.yankee(interfaceC0525x3, interfaceC0525x4, kVar12, kVar11, entry3);
            k kVar13 = (k) entry3.getValue();
            av.k kVar14 = new av.k(abVar2, interfaceC0525x3, interfaceC0525x4, kVar12, kVar11, entry3, 1);
            kVar13.getClass();
            j4.alpha();
            kVar13.alpha();
            kVar13.mike.add(kVar14);
            abVar = abVar2;
            kVar9 = kVar12;
            kVar10 = kVar11;
        }
        n nVar4 = (n) abVar.silver;
        HashMap hashMap6 = new HashMap();
        for (Map.Entry entry4 : hashMap5.entrySet()) {
            hashMap6.put((O) entry4.getKey(), (k) nVar4.get(entry4.getValue()));
        }
        fVar6.uniform(hashMap6);
        Object[] objArr2 = {this.yankee.charlie(), this.zulu.charlie()};
        ArrayList arrayList3 = new ArrayList(2);
        for (int i13 = 0; i13 < 2; i13++) {
            Object obj3 = objArr2[i13];
            Objects.requireNonNull(obj3);
            arrayList3.add(obj3);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void black(String str, String str2, Z z2, C0509g c0509g, C0509g c0509g2) {
        Matrix matrix = this.juliet;
        InterfaceC0525x bravo = bravo();
        Objects.requireNonNull(bravo);
        boolean mike = bravo.mike();
        Size size = c0509g.alpha;
        Rect rect = this.india;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        InterfaceC0525x bravo2 = bravo();
        Objects.requireNonNull(bravo2);
        int golf = golf(bravo2, false);
        InterfaceC0525x bravo3 = bravo();
        Objects.requireNonNull(bravo3);
        k kVar = new k(3, 34, c0509g, matrix, mike, rect, golf, -1, kilo(bravo3));
        this.uniform = kVar;
        Objects.requireNonNull(bravo());
        this.whiskey = kVar;
        L blue = blue(this.uniform, z2, c0509g);
        this.yankee = blue;
        M m4 = this.amber;
        if (m4 != null) {
            m4.bravo();
        }
        M m5 = new M(new b(this, str, str2, z2, c0509g, c0509g2));
        this.amber = m5;
        blue.foxtrot = m5;
    }

    public final L blue(k kVar, Z z2, C0509g c0509g) {
        L delta = L.delta(z2, c0509g.alpha);
        f fVar = this.papa;
        Iterator it = fVar.alpha.iterator();
        int i4 = -1;
        while (it.hasNext()) {
            int i5 = ((O) it.next()).foxtrot.tango().golf.charlie;
            Integer valueOf = Integer.valueOf(i4);
            List list = P.india;
            if (list.indexOf(valueOf) < list.indexOf(Integer.valueOf(i5))) {
                i4 = i5;
            }
        }
        l lVar = delta.bravo;
        if (i4 != -1) {
            lVar.alpha = i4;
        }
        Iterator it2 = fVar.alpha.iterator();
        while (it2.hasNext()) {
            P charlie = L.delta(((O) it2.next()).foxtrot, c0509g.alpha).charlie();
            ad adVar = charlie.golf;
            lVar.charlie(adVar.delta);
            for (AbstractC0512j abstractC0512j : charlie.echo) {
                lVar.delta(abstractC0512j);
                ArrayList arrayList = delta.echo;
                if (!arrayList.contains(abstractC0512j)) {
                    arrayList.add(abstractC0512j);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : charlie.delta) {
                ArrayList arrayList2 = delta.delta;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : charlie.charlie) {
                ArrayList arrayList3 = delta.charlie;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            lVar.echo(adVar.bravo);
        }
        kVar.getClass();
        j4.alpha();
        kVar.alpha();
        T7.golf("Consumer can only be linked once.", !kVar.juliet);
        kVar.juliet = true;
        delta.bravo(kVar.lima, c0509g.bravo, -1);
        lVar.delta(fVar.f3398a);
        au.a aVar = c0509g.delta;
        if (aVar != null) {
            lVar.echo(aVar);
        }
        return delta;
    }

    @Override // androidx.camera.core.O
    public final Z echo(boolean z2, c0 c0Var) {
        d dVar = this.oscar;
        dVar.getClass();
        af alpha = c0Var.alpha(P0.foxtrot(dVar), 1);
        if (z2) {
            alpha = P0.jade(alpha, dVar.alpha);
        }
        if (alpha == null) {
            return null;
        }
        return ((aa) juliet(alpha)).bravo();
    }

    @Override // androidx.camera.core.O
    public final Set india() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // androidx.camera.core.O
    public final Y juliet(af afVar) {
        return new aa(aw.delta(afVar), 2);
    }

    @Override // androidx.camera.core.O
    public final void papa() {
        f fVar = this.papa;
        Iterator it = fVar.alpha.iterator();
        while (it.hasNext()) {
            O o5 = (O) it.next();
            e eVar = (e) fVar.red.get(o5);
            Objects.requireNonNull(eVar);
            o5.alpha(eVar, null, null, o5.echo(true, fVar.teal));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b8  */
    @Override // androidx.camera.core.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Z romeo(InterfaceC0523v interfaceC0523v, Y y10) {
        Object obj;
        Rational rational;
        af alpha = y10.alpha();
        f fVar = this.papa;
        a aVar = fVar.f3401d;
        List india = aVar.foxtrot.india(34);
        HashSet hashSet = aVar.delta;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Z z2 = (Z) it.next();
            if (!z2.xray() && (z2 instanceof ap)) {
                ((ap) z2).zulu();
            }
        }
        C0505c c0505c = ap.romeo;
        B b2 = (B) alpha;
        b2.getClass();
        androidx.camera.core.t tVar = null;
        try {
            obj = b2.quebec(c0505c);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    if (((Integer) pair.first).equals(34)) {
                        india = Arrays.asList((Size[]) pair.second);
                        break;
                    }
                } else {
                    india = new ArrayList();
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            hashSet2.addAll(aVar.bravo((Z) it3.next()));
        }
        Iterator it4 = hashSet2.iterator();
        while (true) {
            boolean hasNext = it4.hasNext();
            rational = aVar.charlie;
            if (!hasNext) {
                break;
            }
            if (!bc.b.alpha(rational, (Size) it4.next())) {
                arrayList.addAll(aVar.foxtrot(aVar.bravo, india, false));
                break;
            }
        }
        arrayList.addAll(aVar.foxtrot(rational, india, false));
        arrayList.addAll(aVar.echo(india, false));
        if (arrayList.isEmpty()) {
            AbstractC3066u3.india("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(aVar.echo(india, true));
        }
        AbstractC3066u3.bravo("ResolutionsMerger", "Parent resolutions: " + arrayList);
        aw awVar = (aw) alpha;
        awVar.hotel(ap.tango, arrayList);
        C0505c c0505c2 = Z.yankee;
        HashSet hashSet3 = fVar.f3399b;
        Iterator it5 = hashSet3.iterator();
        int i4 = 0;
        while (it5.hasNext()) {
            i4 = Math.max(i4, ((Z) it5.next()).uniform());
        }
        awVar.hotel(c0505c2, Integer.valueOf(i4));
        ArrayList arrayList2 = new ArrayList();
        Iterator it6 = hashSet3.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((Z) it6.next()).golf());
        }
        if (!arrayList2.isEmpty()) {
            androidx.camera.core.t tVar2 = (androidx.camera.core.t) arrayList2.get(0);
            Integer valueOf = Integer.valueOf(tVar2.alpha);
            Integer valueOf2 = Integer.valueOf(tVar2.bravo);
            int i5 = 1;
            while (true) {
                if (i5 < arrayList2.size()) {
                    androidx.camera.core.t tVar3 = (androidx.camera.core.t) arrayList2.get(i5);
                    Integer valueOf3 = Integer.valueOf(tVar3.alpha);
                    if (!valueOf.equals(0)) {
                        if (!valueOf3.equals(0)) {
                            if (!valueOf.equals(2) || valueOf3.equals(1)) {
                                if ((!valueOf3.equals(2) || valueOf.equals(1)) && !valueOf.equals(valueOf3)) {
                                    valueOf = null;
                                }
                            }
                        }
                        Integer valueOf4 = Integer.valueOf(tVar3.bravo);
                        if (!valueOf2.equals(0)) {
                            valueOf2 = valueOf4;
                        } else if (!valueOf4.equals(0) && !valueOf2.equals(valueOf4)) {
                            valueOf2 = null;
                        }
                        if (valueOf != null || valueOf2 == null) {
                            break;
                            break;
                        }
                        i5++;
                    }
                    valueOf = valueOf3;
                    Integer valueOf42 = Integer.valueOf(tVar3.bravo);
                    if (!valueOf2.equals(0)) {
                    }
                    if (valueOf != null) {
                        break;
                    }
                    i5++;
                } else {
                    tVar = new androidx.camera.core.t(valueOf.intValue(), valueOf2.intValue());
                    break;
                }
            }
        }
        if (tVar != null) {
            awVar.hotel(an.juliet, tVar);
            Iterator it7 = fVar.alpha.iterator();
            while (it7.hasNext()) {
                O o5 = (O) it7.next();
                if (o5.foxtrot.fuchsia() != 0) {
                    awVar.hotel(Z.blue, Integer.valueOf(o5.foxtrot.fuchsia()));
                }
                if (o5.foxtrot.lime() != 0) {
                    awVar.hotel(Z.black, Integer.valueOf(o5.foxtrot.lime()));
                }
            }
            return y10.bravo();
        }
        throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
    }

    @Override // androidx.camera.core.O
    public final void sierra() {
        Iterator it = this.papa.alpha.iterator();
        while (it.hasNext()) {
            O o5 = (O) it.next();
            o5.sierra();
            o5.quebec();
        }
    }

    @Override // androidx.camera.core.O
    public final void tango() {
        Iterator it = this.papa.alpha.iterator();
        while (it.hasNext()) {
            ((O) it.next()).tango();
        }
    }

    @Override // androidx.camera.core.O
    public final C0509g uniform(au.a aVar) {
        this.yankee.alpha(aVar);
        Object[] objArr = {this.yankee.charlie()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        amber(Collections.unmodifiableList(arrayList));
        ab alpha = this.golf.alpha();
        alpha.silver = aVar;
        return alpha.xray();
    }

    @Override // androidx.camera.core.O
    public final C0509g victor(C0509g c0509g, C0509g c0509g2) {
        String bravo;
        String delta = delta();
        if (hotel() == null) {
            bravo = null;
        } else {
            bravo = hotel().oscar().bravo();
        }
        amber(beige(delta, bravo, this.foxtrot, c0509g, c0509g2));
        mike();
        return c0509g;
    }

    @Override // androidx.camera.core.O
    public final void whiskey() {
        azure();
        f fVar = this.papa;
        Iterator it = fVar.alpha.iterator();
        while (it.hasNext()) {
            O o5 = (O) it.next();
            e eVar = (e) fVar.red.get(o5);
            Objects.requireNonNull(eVar);
            o5.zulu(eVar);
        }
    }
}
