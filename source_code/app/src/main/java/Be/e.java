package Be;

import B9.ab;
import Ce.am;
import Lf.h;
import Y1.aa;
import Y1.ac;
import Y1.z;
import a0.AbstractC0340a;
import a0.AbstractC0353g;
import a0.AbstractC0367u;
import a0.C0355i;
import a0.ak;
import a0.ao;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.compose.foundation.lazy.layout.g;
import av.u;
import bv.ax;
import com.google.android.gms.measurement.internal.C1469t;
import ff.j;
import g.AbstractC1719b;
import id.C1915c;
import j.C1919b;
import j.C1922e;
import j.C1923f;
import j.p;
import j.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import pe.InterfaceC2336l;
import pe.aq;
import pf.AbstractC2360j;
import pf.C2351a;
import s6.T7;
import t6.AbstractC3066u3;
import t6.L3;
import ve.ae;

/* loaded from: classes2.dex */
public final class e implements f, ak {
    public int alpha;
    public final Object bravo;
    public Object charlie;
    public Object delta;
    public Object echo;

    public e(C1923f c1923f) {
        this.bravo = c1923f;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1469t(0, 0));
        this.charlie = arrayList;
        this.delta = new ArrayList();
        this.echo = CollectionsKt.emptyList();
    }

    @Override // Be.f
    public aq alpha(ae javaTypeParameter) {
        Intrinsics.echo(javaTypeParameter, "javaTypeParameter");
        am amVar = (am) ((j) this.echo).invoke(javaTypeParameter);
        if (amVar != null) {
            return amVar;
        }
        return ((f) ((ab) this.bravo).white).alpha(javaTypeParameter);
    }

    public void bravo(aa node) {
        Intrinsics.echo(node, "node");
        He.b bVar = node.purple;
        int i4 = bVar.charlie;
        String str = (String) bVar.golf;
        if (i4 == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        ac acVar = (ac) this.bravo;
        String str2 = (String) acVar.purple.golf;
        if (str2 != null && Intrinsics.areEqual(str, str2)) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + acVar).toString());
        }
        if (i4 != acVar.purple.charlie) {
            ax axVar = (ax) this.charlie;
            aa aaVar = (aa) axVar.delta(i4);
            if (aaVar == node) {
                return;
            }
            if (node.red == null) {
                if (aaVar != null) {
                    aaVar.red = null;
                }
                node.red = acVar;
                axVar.foxtrot(bVar.charlie, node);
                return;
            }
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + acVar).toString());
    }

    public aa charlie(int i4) {
        return echo(i4, (ac) this.bravo, null, false);
    }

    public aa delta(String route, boolean z2) {
        Object obj;
        ac acVar;
        Intrinsics.echo(route, "route");
        ax axVar = (ax) this.charlie;
        Intrinsics.echo(axVar, "<this>");
        Iterator it = ((C2351a) AbstractC2360j.charlie(new h(1, axVar))).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                aa aaVar = (aa) obj;
                if (r.hotel((String) aaVar.purple.golf, route, false) || aaVar.purple.bravo(route) != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        aa aaVar2 = (aa) obj;
        if (aaVar2 == null) {
            if (!z2 || (acVar = ((ac) this.bravo).red) == null) {
                return null;
            }
            Intrinsics.checkNotNull(acVar);
            e eVar = acVar.yellow;
            eVar.getClass();
            if (StringsKt.gray(route)) {
                return null;
            }
            return eVar.delta(route, true);
        }
        return aaVar2;
    }

    public aa echo(int i4, aa aaVar, aa aaVar2, boolean z2) {
        ax axVar = (ax) this.charlie;
        aa aaVar3 = (aa) axVar.delta(i4);
        if (aaVar2 != null) {
            if (Intrinsics.areEqual(aaVar3, aaVar2) && Intrinsics.areEqual(aaVar3.red, aaVar2.red)) {
                return aaVar3;
            }
            aaVar3 = null;
        } else if (aaVar3 != null) {
            return aaVar3;
        }
        ac acVar = (ac) this.bravo;
        if (z2) {
            Iterator it = ((C2351a) AbstractC2360j.charlie(new h(1, axVar))).iterator();
            while (true) {
                if (it.hasNext()) {
                    aa aaVar4 = (aa) it.next();
                    if ((aaVar4 instanceof ac) && !Intrinsics.areEqual(aaVar4, aaVar)) {
                        aaVar3 = ((ac) aaVar4).yellow.echo(i4, acVar, aaVar2, true);
                    } else {
                        aaVar3 = null;
                    }
                    if (aaVar3 != null) {
                        break;
                    }
                } else {
                    aaVar3 = null;
                    break;
                }
            }
        }
        if (aaVar3 == null) {
            ac acVar2 = acVar.red;
            if (acVar2 == null || Intrinsics.areEqual(acVar2, aaVar)) {
                return null;
            }
            ac acVar3 = acVar.red;
            Intrinsics.checkNotNull(acVar3);
            return acVar3.yellow.echo(i4, acVar, aaVar2, z2);
        }
        return aaVar3;
    }

    public q foxtrot(int i4) {
        List list;
        ((C1923f) this.bravo).getClass();
        int i5 = this.alpha;
        int i10 = i4 * i5;
        int kilo = kilo() - i10;
        if (i5 > kilo) {
            i5 = kilo;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i5 == ((List) this.echo).size()) {
            list = (List) this.echo;
        } else {
            ArrayList arrayList = new ArrayList(i5);
            for (int i11 = 0; i11 < i5; i11++) {
                arrayList.add(new C1919b(1));
            }
            this.echo = arrayList;
            list = arrayList;
        }
        return new q(i10, list);
    }

    public int golf(int i4) {
        if (kilo() <= 0) {
            return 0;
        }
        if (i4 >= kilo()) {
            AbstractC1719b.alpha("ItemIndex > total count");
        }
        ((C1923f) this.bravo).getClass();
        return i4 / this.alpha;
    }

    public String hotel(String str) {
        HashMap hashMap = (HashMap) this.charlie;
        if (hashMap.containsKey(str)) {
            for (String str2 : (List) hashMap.get(str)) {
                Iterator it = ((ArrayList) this.delta).iterator();
                while (it.hasNext()) {
                    InterfaceC0523v charlie = ((InterfaceC0523v) it.next()).charlie();
                    T7.bravo("CameraInfo doesn't contain Camera2 implementation.", charlie instanceof u);
                    if (str2.equals(((u) ((u) charlie).charlie.purple).alpha)) {
                        return str2;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public int india() {
        int i4;
        Paint.Cap strokeCap = ((Paint) this.bravo).getStrokeCap();
        if (strokeCap == null) {
            i4 = -1;
        } else {
            i4 = AbstractC0353g.$EnumSwitchMapping$1[strokeCap.ordinal()];
        }
        if (i4 != 1) {
            if (i4 == 2) {
                return 1;
            }
            if (i4 == 3) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    public int juliet() {
        int i4;
        Paint.Join strokeJoin = ((Paint) this.bravo).getStrokeJoin();
        if (strokeJoin == null) {
            i4 = -1;
        } else {
            i4 = AbstractC0353g.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        }
        if (i4 != 1) {
            if (i4 == 2) {
                return 2;
            }
            if (i4 == 3) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    public int kilo() {
        return ((C1923f) this.bravo).charlie.alpha;
    }

    public z lima(z zVar, C1915c c1915c, boolean z2, aa lastVisited) {
        z zVar2;
        Intrinsics.echo(lastVisited, "lastVisited");
        ArrayList arrayList = new ArrayList();
        ac acVar = (ac) this.bravo;
        Iterator it = acVar.iterator();
        while (true) {
            androidx.navigation.internal.j jVar = (androidx.navigation.internal.j) it;
            zVar2 = null;
            if (!jVar.hasNext()) {
                break;
            }
            aa aaVar = (aa) jVar.next();
            if (!Intrinsics.areEqual(aaVar, lastVisited)) {
                zVar2 = aaVar.kilo(c1915c);
            }
            if (zVar2 != null) {
                arrayList.add(zVar2);
            }
        }
        z zVar3 = (z) CollectionsKt.plum(arrayList);
        ac acVar2 = acVar.red;
        if (acVar2 != null && z2 && !Intrinsics.areEqual(acVar2, lastVisited)) {
            zVar2 = acVar2.oscar(c1915c, acVar);
        }
        return (z) CollectionsKt.plum(CollectionsKt.peach(zVar, zVar3, zVar2));
    }

    public void mike(float f5) {
        ((Paint) this.bravo).setAlpha((int) Math.rint(f5 * 255.0f));
    }

    public void november(int i4) {
        if (this.alpha == i4) {
            return;
        }
        this.alpha = i4;
        int i5 = Build.VERSION.SDK_INT;
        Paint paint = (Paint) this.bravo;
        if (i5 >= 29) {
            AbstractC0340a.golf(paint, ao.xray(i4));
        } else {
            paint.setXfermode(new PorterDuffXfermode(ao.coral(i4)));
        }
    }

    public void oscar(long j5) {
        ((Paint) this.bravo).setColor(ao.beige(j5));
    }

    public void papa(AbstractC0367u abstractC0367u) {
        ColorFilter colorFilter;
        this.delta = abstractC0367u;
        if (abstractC0367u != null) {
            colorFilter = abstractC0367u.alpha;
        } else {
            colorFilter = null;
        }
        ((Paint) this.bravo).setColorFilter(colorFilter);
    }

    public void quebec(int i4) {
        boolean z2;
        if (i4 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ((Paint) this.bravo).setFilterBitmap(!z2);
    }

    public void romeo(C0355i c0355i) {
        DashPathEffect dashPathEffect;
        if (c0355i != null) {
            dashPathEffect = c0355i.alpha;
        } else {
            dashPathEffect = null;
        }
        ((Paint) this.bravo).setPathEffect(dashPathEffect);
        this.echo = c0355i;
    }

    public void sierra(Shader shader) {
        this.charlie = shader;
        ((Paint) this.bravo).setShader(shader);
    }

    public void tango(int i4) {
        ac acVar = (ac) this.bravo;
        if (i4 != acVar.purple.charlie) {
            if (((String) this.echo) != null) {
                uniform(null);
            }
            this.alpha = i4;
            this.delta = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i4 + " cannot use the same id as the graph " + acVar).toString());
    }

    public void uniform(String str) {
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else {
            ac acVar = (ac) this.bravo;
            if (!Intrinsics.areEqual(str, (String) acVar.purple.golf)) {
                if (!StringsKt.gray(str)) {
                    int i4 = aa.white;
                    hashCode = "android-app://androidx.navigation/".concat(str).hashCode();
                } else {
                    throw new IllegalArgumentException("Cannot have an empty start destination route");
                }
            } else {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + acVar).toString());
            }
        }
        this.alpha = hashCode;
        this.echo = str;
    }

    public void victor(int i4) {
        Paint.Cap cap;
        if (i4 == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i4 == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i4 == 0) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        ((Paint) this.bravo).setStrokeCap(cap);
    }

    public void whiskey(int i4) {
        Paint.Join join;
        if (i4 == 0) {
            join = Paint.Join.MITER;
        } else if (i4 == 2) {
            join = Paint.Join.BEVEL;
        } else if (i4 == 1) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        ((Paint) this.bravo).setStrokeJoin(join);
    }

    public void xray(float f5) {
        ((Paint) this.bravo).setStrokeWidth(f5);
    }

    public void yankee(int i4) {
        Paint.Style style;
        if (i4 == 1) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        ((Paint) this.bravo).setStyle(style);
    }

    public int zulu(int i4) {
        p pVar = p.alpha;
        g bravo = ((C1923f) this.bravo).charlie.bravo(i4);
        return (int) ((C1919b) ((C1922e) bravo.charlie).alpha.invoke(pVar, Integer.valueOf(i4 - bravo.alpha))).alpha;
    }

    public e(ab c3, InterfaceC2336l interfaceC2336l, Ee.e typeParameterOwner, int i4) {
        Intrinsics.echo(c3, "c");
        Intrinsics.echo(typeParameterOwner, "typeParameterOwner");
        this.bravo = c3;
        this.charlie = interfaceC2336l;
        this.alpha = i4;
        ArrayList typeParameters = typeParameterOwner.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i5));
            i5++;
        }
        this.delta = linkedHashMap;
        this.echo = ((a) ((ab) this.bravo).purple).alpha.delta(new A0.p(3, this));
    }

    public e(ac graph) {
        Intrinsics.echo(graph, "graph");
        this.bravo = graph;
        this.charlie = new ax(0);
    }

    public e(Paint paint) {
        this.bravo = paint;
        this.alpha = 3;
    }

    public e(androidx.camera.camera2.internal.compat.q qVar) {
        this.alpha = 0;
        this.charlie = new HashMap();
        this.echo = new HashSet();
        this.bravo = new ArrayList();
        this.delta = new ArrayList();
        Set hashSet = new HashSet();
        try {
            hashSet = qVar.alpha.D();
        } catch (CameraAccessExceptionCompat unused) {
            AbstractC3066u3.charlie("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList((Set) it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (L3.alpha(qVar, str) && L3.alpha(qVar, str2)) {
                        ((HashSet) this.echo).add(new HashSet(Arrays.asList(str, str2)));
                        HashMap hashMap = (HashMap) this.charlie;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new ArrayList());
                        }
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        ((List) hashMap.get(str)).add((String) arrayList.get(1));
                        ((List) hashMap.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (InitializationException unused2) {
                    AbstractC3066u3.bravo("Camera2CameraCoordinator", av.q.golf("Concurrent camera id pair: (", str, ", ", str2, ") is not backward compatible"));
                }
            }
        }
    }
}
