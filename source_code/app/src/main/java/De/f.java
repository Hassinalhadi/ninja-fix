package De;

import Pe.p;
import Pe.t;
import Xe.n;
import gf.C1791f;
import gf.InterfaceC1789d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.s;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlin.text.StringsKt;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import s6.O5;

/* loaded from: classes2.dex */
public final class f extends s {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ae lowerBound, ae upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.echo(lowerBound, "lowerBound");
        Intrinsics.echo(upperBound, "upperBound");
        InterfaceC1789d.alpha.bravo(lowerBound, upperBound);
    }

    public static final ArrayList m(t tVar, y yVar) {
        int collectionSizeOrDefault;
        List<as> cyan = yVar.cyan();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(cyan, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (as typeProjection : cyan) {
            Intrinsics.echo(typeProjection, "typeProjection");
            StringBuilder sb2 = new StringBuilder();
            CollectionsKt.magenta(ab.juliet(typeProjection), sb2, ", ", null, null, new p(tVar, 0), 60);
            String sb3 = sb2.toString();
            Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
            arrayList.add(sb3);
        }
        return arrayList;
    }

    public static final String p(String str, String str2) {
        if (!StringsKt.black(str, '<')) {
            return str;
        }
        return StringsKt.red(str, '<') + '<' + str2 + '>' + StringsKt.purple('>', str, str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    public final ae d() {
        return this.purple;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    public final String f(t tVar, t tVar2) {
        ae aeVar = this.purple;
        String orange = tVar.orange(aeVar);
        ae aeVar2 = this.red;
        String orange2 = tVar.orange(aeVar2);
        if (tVar2.delta.november()) {
            return "raw (" + orange + ".." + orange2 + ')';
        }
        if (aeVar2.cyan().isEmpty()) {
            return tVar.bronze(orange, orange2, O5.echo(this));
        }
        ArrayList m4 = m(tVar, aeVar);
        ArrayList m5 = m(tVar, aeVar2);
        String maroon = CollectionsKt.maroon(m4, ", ", null, null, e.alpha, 30);
        ArrayList H10 = CollectionsKt.H(m4, m5);
        if (!H10.isEmpty()) {
            Iterator it = H10.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.getFirst();
                String str2 = (String) pair.getSecond();
                if (!Intrinsics.areEqual(str, StringsKt.lime(str2, "out ")) && !Intrinsics.areEqual(str2, "*")) {
                    break;
                }
            }
        }
        orange2 = p(orange2, maroon);
        String p4 = p(orange, maroon);
        if (Intrinsics.areEqual(p4, orange2)) {
            return p4;
        }
        return tVar.bronze(p4, orange2, O5.echo(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    /* renamed from: ivory */
    public final y purple(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        ae type = this.purple;
        Intrinsics.echo(type, "type");
        ae type2 = this.red;
        Intrinsics.echo(type2, "type");
        return new s(type, type2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s, kotlin.reflect.jvm.internal.impl.types.y
    public final n olive() {
        InterfaceC2330f interfaceC2330f;
        InterfaceC2332h kilo = green().kilo();
        if (kilo instanceof InterfaceC2330f) {
            interfaceC2330f = (InterfaceC2330f) kilo;
        } else {
            interfaceC2330f = null;
        }
        if (interfaceC2330f != null) {
            n red = interfaceC2330f.red(new d());
            Intrinsics.delta(red, "classDescriptor.getMemberScope(RawSubstitution())");
            return red;
        }
        throw new IllegalStateException(("Incorrect classifier: " + green().kilo()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.B
    public final B pink(boolean z2) {
        return new f(this.purple.pink(z2), this.red.pink(z2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.B
    public final B purple(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        ae type = this.purple;
        Intrinsics.echo(type, "type");
        ae type2 = this.red;
        Intrinsics.echo(type2, "type");
        return new s(type, type2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.B
    public final B white(al newAttributes) {
        Intrinsics.echo(newAttributes, "newAttributes");
        return new f(this.purple.white(newAttributes), this.red.white(newAttributes));
    }
}
