package Ce;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.as;
import me.AbstractC2120h;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.an;
import qe.InterfaceC2466b;
import s6.G4;
import s6.K4;
import se.aq;
import ve.AbstractC3192d;
import ve.C3193e;

/* loaded from: classes2.dex */
public final class f implements InterfaceC2466b, Ae.h {
    public static final /* synthetic */ ge.v[] hotel;
    public final B9.ab alpha;
    public final C3193e bravo;
    public final ff.h charlie;
    public final ff.i delta;
    public final ue.f echo;
    public final ff.i foxtrot;
    public final boolean golf;

    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        hotel = new ge.v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(f.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(f.class), Constants.KEY_TYPE, "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(f.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public f(B9.ab c3, C3193e javaAnnotation, boolean z2) {
        Intrinsics.echo(c3, "c");
        Intrinsics.echo(javaAnnotation, "javaAnnotation");
        this.alpha = c3;
        this.bravo = javaAnnotation;
        Be.a aVar = (Be.a) c3.purple;
        ff.l lVar = aVar.alpha;
        e eVar = new e(this, 1);
        lVar.getClass();
        this.charlie = new ff.h(lVar, eVar);
        this.delta = lVar.bravo(new e(this, 2));
        this.echo = aVar.juliet.alpha(javaAnnotation);
        this.foxtrot = lVar.bravo(new e(this, 0));
        this.golf = z2;
    }

    @Override // qe.InterfaceC2466b
    public final Ne.c alpha() {
        ff.h hVar = this.charlie;
        ge.v p4 = hotel[0];
        Intrinsics.echo(hVar, "<this>");
        Intrinsics.echo(p4, "p");
        return (Ne.c) hVar.invoke();
    }

    @Override // qe.InterfaceC2466b
    public final Map bravo() {
        return (Map) K4.alpha(this.foxtrot, hotel[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Se.g charlie(Ee.a aVar) {
        Ee.d iVar;
        kotlin.reflect.jvm.internal.impl.types.y hotel2;
        int collectionSizeOrDefault;
        if (aVar instanceof ve.x) {
            return Se.h.alpha.bravo(((ve.x) aVar).bravo, null);
        }
        if (aVar instanceof ve.v) {
            ve.v vVar = (ve.v) aVar;
            Class<?> enumClass = vVar.bravo.getClass();
            if (!enumClass.isEnum()) {
                enumClass = enumClass.getEnclosingClass();
            }
            Intrinsics.delta(enumClass, "enumClass");
            return new Se.i(AbstractC3192d.alpha(enumClass), Ne.f.echo(vVar.bravo.name()));
        }
        boolean z2 = aVar instanceof ve.h;
        B9.ab abVar = this.alpha;
        if (z2) {
            ve.h hVar = (ve.h) aVar;
            Ne.f fVar = hVar.alpha;
            if (fVar == null) {
                fVar = ye.ab.bravo;
            }
            Intrinsics.delta(fVar, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            ArrayList alpha = hVar.alpha();
            kotlin.reflect.jvm.internal.impl.types.ae type = (kotlin.reflect.jvm.internal.impl.types.ae) K4.alpha(this.delta, hotel[1]);
            Intrinsics.delta(type, "type");
            if (!kotlin.reflect.jvm.internal.impl.types.c.india(type)) {
                InterfaceC2330f delta = Ue.e.delta(this);
                Intrinsics.checkNotNull(delta);
                aq bravo = y6.e.bravo(fVar, delta);
                if (bravo == null || (hotel2 = bravo.getType()) == null) {
                    hotel2 = ((Be.a) abVar.purple).oscar.silver.hotel(hf.i.charlie(hf.h.f12743w, new String[0]));
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(alpha, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator it = alpha.iterator();
                while (it.hasNext()) {
                    Se.g charlie = charlie((Ee.a) it.next());
                    if (charlie == null) {
                        charlie = new Se.g(null);
                    }
                    arrayList.add(charlie);
                }
                return new Se.w(arrayList, hotel2);
            }
        } else {
            if (aVar instanceof ve.g) {
                return new Se.g(new f(abVar, new C3193e(((ve.g) aVar).bravo), false));
            }
            if (aVar instanceof ve.r) {
                Class cls = ((ve.r) aVar).bravo;
                if (cls.isPrimitive()) {
                    iVar = new ve.ab(cls);
                } else if (!(cls instanceof GenericArrayType) && !cls.isArray()) {
                    if (cls instanceof WildcardType) {
                        iVar = new ve.ag((WildcardType) cls);
                    } else {
                        iVar = new ve.s(cls);
                    }
                } else {
                    iVar = new ve.i(cls);
                }
                kotlin.reflect.jvm.internal.impl.types.y amber = ((J2.t) abVar.teal).amber(iVar, G4.delta(2, false, null, 7));
                if (!kotlin.reflect.jvm.internal.impl.types.c.india(amber)) {
                    kotlin.reflect.jvm.internal.impl.types.y yVar = amber;
                    int i4 = 0;
                    while (AbstractC2120h.xray(yVar)) {
                        yVar = ((as) CollectionsKt.k(yVar.cyan())).bravo();
                        Intrinsics.delta(yVar, "type.arguments.single().type");
                        i4++;
                    }
                    InterfaceC2332h kilo = yVar.green().kilo();
                    if (kilo instanceof InterfaceC2330f) {
                        Ne.b foxtrot = Ue.e.foxtrot(kilo);
                        if (foxtrot == null) {
                            return new Se.g(new Se.o(amber));
                        }
                        return new Se.r(foxtrot, i4);
                    }
                    if (kilo instanceof pe.aq) {
                        return new Se.r(Ne.b.juliet(me.m.alpha.golf()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // qe.InterfaceC2466b
    public final an echo() {
        return this.echo;
    }

    @Override // qe.InterfaceC2466b
    public final kotlin.reflect.jvm.internal.impl.types.y getType() {
        return (kotlin.reflect.jvm.internal.impl.types.ae) K4.alpha(this.delta, hotel[1]);
    }

    public final String toString() {
        return Pe.o.alpha.xray(this, null);
    }
}
