package Y1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import bv.ax;
import id.C1915c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pf.AbstractC2360j;
import pf.C2351a;

/* loaded from: classes3.dex */
public class ac extends aa implements Iterable, Yd.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2266a = 0;
    public final Be.e yellow;

    public ac(af afVar) {
        super(afVar);
        this.yellow = new Be.e(this);
    }

    @Override // Y1.aa
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof ac) && super.equals(obj)) {
                Be.e eVar = this.yellow;
                int golf = ((ax) eVar.charlie).golf();
                Be.e eVar2 = ((ac) obj).yellow;
                if (golf == ((ax) eVar2.charlie).golf() && eVar.alpha == eVar2.alpha) {
                    ax axVar = (ax) eVar.charlie;
                    Intrinsics.echo(axVar, "<this>");
                    Iterator it = ((C2351a) AbstractC2360j.charlie(new Lf.h(1, axVar))).iterator();
                    while (it.hasNext()) {
                        aa aaVar = (aa) it.next();
                        if (!Intrinsics.areEqual(aaVar, ((ax) eVar2.charlie).delta(aaVar.purple.charlie))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // Y1.aa
    public final int hashCode() {
        Be.e eVar = this.yellow;
        int i4 = eVar.alpha;
        ax axVar = (ax) eVar.charlie;
        int golf = axVar.golf();
        for (int i5 = 0; i5 < golf; i5++) {
            i4 = (((i4 * 31) + axVar.echo(i5)) * 31) + ((aa) axVar.hotel(i5)).hashCode();
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Be.e eVar = this.yellow;
        eVar.getClass();
        return new androidx.navigation.internal.j(eVar);
    }

    @Override // Y1.aa
    public final z kilo(C1915c c1915c) {
        z kilo = super.kilo(c1915c);
        Be.e eVar = this.yellow;
        eVar.getClass();
        return eVar.lima(kilo, c1915c, false, (ac) eVar.bravo);
    }

    @Override // Y1.aa
    public final void lima(Context context, AttributeSet attrs) {
        String valueOf;
        Intrinsics.echo(context, "context");
        Intrinsics.echo(attrs, "attrs");
        super.lima(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, Z1.a.delta);
        Intrinsics.delta(obtainAttributes, "obtainAttributes(...)");
        int resourceId = obtainAttributes.getResourceId(0, 0);
        Be.e eVar = this.yellow;
        eVar.tango(resourceId);
        int i4 = eVar.alpha;
        if (i4 <= 16777215) {
            valueOf = String.valueOf(i4);
        } else {
            try {
                Intrinsics.checkNotNull(context);
                valueOf = context.getResources().getResourceName(i4);
                Intrinsics.checkNotNull(valueOf);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i4);
            }
        }
        eVar.delta = valueOf;
        obtainAttributes.recycle();
    }

    public final z oscar(C1915c c1915c, aa lastVisited) {
        Intrinsics.echo(lastVisited, "lastVisited");
        return this.yellow.lima(super.kilo(c1915c), c1915c, true, lastVisited);
    }

    public final z quebec(String str, boolean z2, aa lastVisited) {
        z zVar;
        Intrinsics.echo(lastVisited, "lastVisited");
        Be.e eVar = this.yellow;
        eVar.getClass();
        ac acVar = (ac) eVar.bravo;
        acVar.getClass();
        z bravo = acVar.purple.bravo(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = acVar.iterator();
        while (true) {
            androidx.navigation.internal.j jVar = (androidx.navigation.internal.j) it;
            zVar = null;
            if (!jVar.hasNext()) {
                break;
            }
            aa aaVar = (aa) jVar.next();
            if (!Intrinsics.areEqual(aaVar, lastVisited)) {
                if (aaVar instanceof ac) {
                    zVar = ((ac) aaVar).quebec(str, false, acVar);
                } else {
                    aaVar.getClass();
                    zVar = aaVar.purple.bravo(str);
                }
            }
            if (zVar != null) {
                arrayList.add(zVar);
            }
        }
        z zVar2 = (z) CollectionsKt.plum(arrayList);
        ac acVar2 = acVar.red;
        if (acVar2 != null && z2 && !Intrinsics.areEqual(acVar2, lastVisited)) {
            zVar = acVar2.quebec(str, true, acVar);
        }
        return (z) CollectionsKt.plum(CollectionsKt.peach(bravo, zVar2, zVar));
    }

    @Override // Y1.aa
    public final String toString() {
        aa aaVar;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Be.e eVar = this.yellow;
        String str = (String) eVar.echo;
        eVar.getClass();
        if (str != null && !StringsKt.gray(str)) {
            aaVar = eVar.delta(str, true);
        } else {
            aaVar = null;
        }
        if (aaVar == null) {
            aaVar = eVar.charlie(eVar.alpha);
        }
        sb2.append(" startDestination=");
        if (aaVar == null) {
            String str2 = (String) eVar.echo;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = (String) eVar.delta;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(eVar.alpha));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(aaVar.toString());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }
}
