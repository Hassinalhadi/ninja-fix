package bn;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.N;
import androidx.camera.core.O;
import androidx.camera.core.ao;
import androidx.camera.core.au;
import androidx.camera.core.az;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.ah;
import androidx.camera.core.impl.ap;
import av.z;
import bj.j;
import bj.k;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import s6.T7;
import t6.j4;

/* loaded from: classes3.dex */
public final class f implements N {
    public final HashSet alpha;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f3399b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3400c;

    /* renamed from: d, reason: collision with root package name */
    public final a f3401d;
    public final a e;
    public final z teal;
    public final InterfaceC0525x white;
    public final InterfaceC0525x yellow;
    public final HashMap purple = new HashMap();
    public final HashMap red = new HashMap();
    public final HashMap silver = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final au f3398a = new au(2, this);

    public f(InterfaceC0525x interfaceC0525x, InterfaceC0525x interfaceC0525x2, HashSet hashSet, z zVar, S7.a aVar) {
        this.white = interfaceC0525x;
        this.yellow = interfaceC0525x2;
        this.teal = zVar;
        this.alpha = hashSet;
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            O o5 = (O) it.next();
            hashMap.put(o5, o5.lima(interfaceC0525x.oscar(), null, o5.echo(true, zVar)));
        }
        this.f3400c = hashMap;
        HashSet hashSet2 = new HashSet(hashMap.values());
        this.f3399b = hashSet2;
        this.f3401d = new a(interfaceC0525x, hashSet2);
        if (this.yellow != null) {
            this.e = new a(this.yellow, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            O o10 = (O) it2.next();
            this.silver.put(o10, Boolean.FALSE);
            this.red.put(o10, new e(interfaceC0525x, this, aVar));
        }
    }

    public static void romeo(k kVar, ah ahVar, P p4) {
        kVar.delta();
        try {
            j4.alpha();
            kVar.alpha();
            j jVar = kVar.lima;
            Objects.requireNonNull(jVar);
            jVar.golf(ahVar, new bj.g(jVar, 0));
        } catch (DeferrableSurface$SurfaceClosedException unused) {
            androidx.camera.core.impl.N n5 = p4.foxtrot;
            if (n5 != null) {
                n5.alpha(p4);
            }
        }
    }

    public static ah sierra(O o5) {
        List unmodifiableList;
        boolean z2;
        if (o5 instanceof ao) {
            unmodifiableList = o5.mike.bravo();
        } else {
            unmodifiableList = Collections.unmodifiableList(o5.mike.golf.alpha);
        }
        if (unmodifiableList.size() <= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.golf(null, z2);
        if (unmodifiableList.size() != 1) {
            return null;
        }
        return (ah) unmodifiableList.get(0);
    }

    @Override // androidx.camera.core.N
    public final void charlie(O o5) {
        j4.alpha();
        if (!tango(o5)) {
            this.silver.put(o5, Boolean.TRUE);
            ah sierra = sierra(o5);
            if (sierra != null) {
                k kVar = (k) this.purple.get(o5);
                Objects.requireNonNull(kVar);
                romeo(kVar, sierra, o5.mike);
            }
        }
    }

    @Override // androidx.camera.core.N
    public final void delta(O o5) {
        ah sierra;
        j4.alpha();
        k kVar = (k) this.purple.get(o5);
        Objects.requireNonNull(kVar);
        if (tango(o5) && (sierra = sierra(o5)) != null) {
            romeo(kVar, sierra, o5.mike);
        }
    }

    @Override // androidx.camera.core.N
    public final void echo(O o5) {
        j4.alpha();
        if (!tango(o5)) {
            return;
        }
        k kVar = (k) this.purple.get(o5);
        Objects.requireNonNull(kVar);
        ah sierra = sierra(o5);
        if (sierra != null) {
            romeo(kVar, sierra, o5.mike);
            return;
        }
        j4.alpha();
        kVar.alpha();
        kVar.lima.alpha();
    }

    @Override // androidx.camera.core.N
    public final void papa(O o5) {
        j4.alpha();
        if (!tango(o5)) {
            return;
        }
        this.silver.put(o5, Boolean.FALSE);
        k kVar = (k) this.purple.get(o5);
        Objects.requireNonNull(kVar);
        j4.alpha();
        kVar.alpha();
        kVar.lima.alpha();
    }

    public final bl.b quebec(O o5, a aVar, InterfaceC0525x interfaceC0525x, k kVar, int i4, boolean z2) {
        boolean z10;
        Size size;
        Size size2;
        int i5;
        int i10;
        int golf = interfaceC0525x.alpha().golf(i4);
        Matrix matrix = kVar.bravo;
        RectF rectF = bc.f.alpha;
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f5 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = (f10 * f12) + (f5 * f11);
        float f14 = (f5 * f12) - (f10 * f11);
        float f15 = (f12 * f12) + (f11 * f11);
        boolean z11 = false;
        double sqrt = Math.sqrt((f10 * f10) + (f5 * f5)) * Math.sqrt(f15);
        if (((float) Math.toDegrees(Math.atan2(f14 / sqrt, f13 / sqrt))) > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Z z12 = (Z) this.f3400c.get(o5);
        Objects.requireNonNull(z12);
        kVar.bravo.getValues(new float[9]);
        int foxtrot = bc.f.foxtrot((int) Math.round(Math.atan2(r7[3], r7[0]) * 57.29577951308232d));
        aVar.getClass();
        boolean bravo = bc.f.bravo(foxtrot);
        Rect rect = kVar.delta;
        if (bravo) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            z11 = true;
        }
        if (z2) {
            size2 = bc.f.delta(rect);
            Iterator it = aVar.bravo(z12).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Size delta = bc.f.delta(a.alpha((Size) it.next(), size2));
                if (!a.charlie(delta, size2)) {
                    size2 = delta;
                    break;
                }
            }
        } else {
            Size delta2 = bc.f.delta(rect);
            List bravo2 = aVar.bravo(z12);
            Iterator it2 = bravo2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    size = (Size) it2.next();
                    Rational rational = bc.b.alpha;
                    if (!bc.b.alpha(rational, delta2)) {
                        rational = bc.b.charlie;
                        if (!bc.b.alpha(rational, delta2)) {
                            rational = a.golf(delta2);
                        }
                    }
                    if (!aVar.delta(rational, size) && !a.charlie(size, delta2)) {
                        break;
                    }
                } else {
                    Iterator it3 = bravo2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Size size3 = (Size) it3.next();
                            if (!a.charlie(size3, delta2)) {
                                size = size3;
                                break;
                            }
                        } else {
                            size = delta2;
                            break;
                        }
                    }
                }
            }
            rect = a.alpha(delta2, size);
            size2 = size;
        }
        Pair pair = new Pair(rect, size2);
        Rect rect2 = (Rect) pair.first;
        Size size4 = (Size) pair.second;
        if (z11) {
            Size size5 = new Size(size4.getHeight(), size4.getWidth());
            rect2 = new Rect(rect2.top, rect2.left, rect2.bottom, rect2.right);
            size4 = size5;
        }
        Pair pair2 = new Pair(rect2, size4);
        Rect rect3 = (Rect) pair2.first;
        Size size6 = (Size) pair2.second;
        int golf2 = this.white.alpha().golf(((ap) o5.foxtrot).crimson());
        e eVar = (e) this.red.get(o5);
        Objects.requireNonNull(eVar);
        eVar.red.charlie = golf2;
        int foxtrot2 = bc.f.foxtrot((kVar.india + golf2) - golf);
        if (o5 instanceof az) {
            i5 = 1;
        } else if (o5 instanceof ao) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        if (o5 instanceof ao) {
            i10 = Barcode.FORMAT_QR_CODE;
        } else {
            i10 = 34;
        }
        return new bl.b(UUID.randomUUID(), i5, i10, rect3, bc.f.echo(size6, foxtrot2), foxtrot2, o5.kilo(interfaceC0525x) ^ z10);
    }

    public final boolean tango(O o5) {
        Boolean bool = (Boolean) this.silver.get(o5);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void uniform(HashMap hashMap) {
        HashMap hashMap2 = this.purple;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        for (Map.Entry entry : hashMap2.entrySet()) {
            O o5 = (O) entry.getKey();
            k kVar = (k) entry.getValue();
            o5.yankee(kVar.delta);
            o5.xray(kVar.bravo);
            o5.golf = o5.victor(kVar.golf, null);
            o5.oscar();
        }
    }
}
