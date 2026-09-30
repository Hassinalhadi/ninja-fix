package gf;

import com.clevertap.android.sdk.Constants;
import ef.C1656d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.ab;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.ah;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.ao;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.at;
import kotlin.reflect.jvm.internal.impl.types.ax;
import kotlin.reflect.jvm.internal.impl.types.az;
import kotlin.reflect.jvm.internal.impl.types.x;
import kotlin.reflect.jvm.internal.impl.types.y;
import me.AbstractC2120h;
import pe.C2346v;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.aq;
import pe.au;
import s6.AbstractC2777t5;
import s6.O5;

/* renamed from: gf.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1792g {
    public static final K1.r alpha = new K1.r("KotlinTypeRefiner", 2);

    public static /* synthetic */ void alpha(int i4) {
        Object[] objArr = new Object[3];
        switch (i4) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = Constants.KEY_TYPE;
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i4) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean amber(p000if.f receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ap) {
            return ((ap) receiver).mike();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static boolean azure(p000if.c receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof y) {
            return kotlin.reflect.jvm.internal.impl.types.c.india((y) receiver);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static boolean beige(p000if.f receiver) {
        InterfaceC2330f interfaceC2330f;
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ap) {
            InterfaceC2332h kilo = ((ap) receiver).kilo();
            au auVar = null;
            if (kilo instanceof InterfaceC2330f) {
                interfaceC2330f = (InterfaceC2330f) kilo;
            } else {
                interfaceC2330f = null;
            }
            if (interfaceC2330f != null) {
                auVar = interfaceC2330f.t();
            }
            return auVar instanceof C2346v;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static boolean black(p000if.f receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ap) {
            return receiver instanceof Se.m;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static boolean blue(p000if.f receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ap) {
            return receiver instanceof x;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static boolean bravo(p000if.f c12, p000if.f c22) {
        Intrinsics.echo(c12, "c1");
        Intrinsics.echo(c22, "c2");
        if (c12 instanceof ap) {
            if (c22 instanceof ap) {
                return Intrinsics.areEqual(c12, c22);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(c22);
            sb2.append(", ");
            throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, c22.getClass(), sb2).toString());
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(c12);
        sb3.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, c12.getClass(), sb3).toString());
    }

    public static boolean bronze(p000if.d receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ae) {
            return ((ae) receiver).indigo();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static int charlie(p000if.c receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof y) {
            return ((y) receiver).cyan().size();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static boolean coral(p000if.f receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ap) {
            return AbstractC2120h.coral((ap) receiver, me.m.bravo);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static boolean crimson(p000if.c receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof y) {
            return az.foxtrot((y) receiver);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean cyan(p000if.d receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof y) {
            return AbstractC2120h.blue((y) receiver);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static p000if.e delta(p000if.d receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ae) {
            return (p000if.e) receiver;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static p000if.b echo(InterfaceC1787b interfaceC1787b, p000if.d receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ae) {
            if (receiver instanceof ah) {
                return interfaceC1787b.romeo(((ah) receiver).purple);
            }
            if (receiver instanceof C1793h) {
                return (C1793h) receiver;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static boolean emerald(p000if.b bVar) {
        if (bVar instanceof C1793h) {
            return ((C1793h) bVar).yellow;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(bVar);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, bVar.getClass(), sb2).toString());
    }

    public static kotlin.reflect.jvm.internal.impl.types.o foxtrot(p000if.d receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ae) {
            if (receiver instanceof kotlin.reflect.jvm.internal.impl.types.o) {
                return (kotlin.reflect.jvm.internal.impl.types.o) receiver;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static boolean fuchsia(as receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof as) {
            return receiver.charlie();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void gold(p000if.d receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ae) {
            boolean z2 = ((y) receiver) instanceof kotlin.reflect.jvm.internal.impl.types.o;
            return;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static kotlin.reflect.jvm.internal.impl.types.s golf(p000if.c receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof y) {
            B ochre = ((y) receiver).ochre();
            if (ochre instanceof kotlin.reflect.jvm.internal.impl.types.s) {
                return (kotlin.reflect.jvm.internal.impl.types.s) ochre;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void gray(p000if.d receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ae) {
            boolean z2 = ((y) receiver) instanceof kotlin.reflect.jvm.internal.impl.types.o;
            return;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static ae green(kotlin.reflect.jvm.internal.impl.types.s sVar) {
        if (sVar instanceof kotlin.reflect.jvm.internal.impl.types.s) {
            return sVar.purple;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(sVar);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, sVar.getClass(), sb2).toString());
    }

    public static ae hotel(p000if.c receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof y) {
            B ochre = ((y) receiver).ochre();
            if (ochre instanceof ae) {
                return (ae) ochre;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static at india(p000if.c receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof y) {
            return O5.alpha((y) receiver);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static B indigo(p000if.b bVar) {
        if (bVar instanceof C1793h) {
            return ((C1793h) bVar).silver;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(bVar);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, bVar.getClass(), sb2).toString());
    }

    public static B ivory(p000if.c cVar) {
        if (cVar instanceof B) {
            return kotlin.reflect.jvm.internal.impl.types.c.lima((B) cVar, false);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(cVar);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, cVar.getClass(), sb2).toString());
    }

    public static ae jade(kotlin.reflect.jvm.internal.impl.types.o oVar) {
        if (oVar instanceof kotlin.reflect.jvm.internal.impl.types.o) {
            return oVar.purple;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(oVar);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, oVar.getClass(), sb2).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ae juliet(p000if.d dVar) {
        List cyan;
        ArrayList arrayList;
        int collectionSizeOrDefault;
        C1790e c1790e;
        B b2;
        com.google.android.material.datepicker.j.papa(1, "status");
        if (dVar instanceof ae) {
            ae aeVar = (ae) dVar;
            C1656d c1656d = null;
            if (aeVar.cyan().size() == aeVar.green().getParameters().size() && ((cyan = aeVar.cyan()) == null || !cyan.isEmpty())) {
                Iterator it = cyan.iterator();
                while (it.hasNext()) {
                    if (((as) it.next()).alpha() != 1) {
                        List parameters = aeVar.green().getParameters();
                        Intrinsics.delta(parameters, "type.constructor.parameters");
                        ArrayList H10 = CollectionsKt.H(cyan, parameters);
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(H10, 10);
                        arrayList = new ArrayList(collectionSizeOrDefault);
                        Iterator it2 = H10.iterator();
                        while (it2.hasNext()) {
                            Pair pair = (Pair) it2.next();
                            as asVar = (as) pair.first;
                            aq parameter = (aq) pair.second;
                            if (asVar.alpha() != 1) {
                                if (!asVar.charlie() && asVar.alpha() == 2) {
                                    b2 = asVar.bravo().ochre();
                                } else {
                                    b2 = null;
                                }
                                Intrinsics.delta(parameter, "parameter");
                                asVar = O5.alpha(new C1793h(1, new C1794i(asVar, c1656d, parameter, 6), b2, (al) null, false, 56));
                            }
                            arrayList.add(asVar);
                        }
                        ax axVar = new ax(kotlin.reflect.jvm.internal.impl.types.aq.bravo.foxtrot(aeVar.green(), arrayList));
                        int size = cyan.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            as asVar2 = (as) cyan.get(i4);
                            as asVar3 = (as) arrayList.get(i4);
                            if (asVar2.alpha() != 1) {
                                List upperBounds = ((aq) aeVar.green().getParameters().get(i4)).getUpperBounds();
                                Intrinsics.delta(upperBounds, "type.constructor.parameters[index].upperBounds");
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it3 = upperBounds.iterator();
                                while (true) {
                                    boolean hasNext = it3.hasNext();
                                    c1790e = C1790e.alpha;
                                    if (!hasNext) {
                                        break;
                                    }
                                    arrayList2.add(c1790e.alpha(axVar.golf(1, (y) it3.next()).ochre()));
                                }
                                if (!asVar2.charlie() && asVar2.alpha() == 3) {
                                    arrayList2.add(c1790e.alpha(asVar2.bravo().ochre()));
                                }
                                y bravo = asVar3.bravo();
                                Intrinsics.charlie(bravo, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                                C1794i c1794i = ((C1793h) bravo).red;
                                c1794i.getClass();
                                c1794i.bravo = new C1656d(2, arrayList2);
                            }
                        }
                        if (arrayList != null) {
                            return null;
                        }
                        return ab.charlie(arrayList, aeVar.gold(), aeVar.green(), aeVar.indigo());
                    }
                }
            }
            arrayList = null;
            if (arrayList != null) {
            }
        } else {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(dVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, dVar.getClass(), sb2).toString());
        }
    }

    public static int kilo(p000if.b receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof C1793h) {
            return ((C1793h) receiver).purple;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static int lavender(p000if.f receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ap) {
            return ((ap) receiver).getParameters().size();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static ao lima(boolean z2, C1790e c1790e, int i4) {
        C1791f c1791f = C1791f.alpha;
        m mVar = m.alpha;
        if ((i4 & 8) != 0) {
            c1790e = C1790e.alpha;
        }
        return new ao(z2, true, mVar, c1790e, c1791f);
    }

    public static Collection lime(InterfaceC1787b interfaceC1787b, p000if.d receiver) {
        Intrinsics.echo(receiver, "$receiver");
        ap x4 = interfaceC1787b.x(receiver);
        if (x4 instanceof Se.m) {
            return ((Se.m) x4).alpha;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static as magenta(Re.b receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof C1794i) {
            return ((C1794i) receiver).alpha;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1786a maroon(InterfaceC1787b interfaceC1787b, p000if.d dVar) {
        if (dVar instanceof ae) {
            y yVar = (y) dVar;
            return new C1786a(interfaceC1787b, new ax(kotlin.reflect.jvm.internal.impl.types.aq.bravo.foxtrot(yVar.green(), yVar.cyan())));
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, dVar.getClass(), sb2).toString());
    }

    public static B mike(InterfaceC1787b interfaceC1787b, p000if.d lowerBound, p000if.d upperBound) {
        Intrinsics.echo(lowerBound, "lowerBound");
        Intrinsics.echo(upperBound, "upperBound");
        if (lowerBound instanceof ae) {
            if (upperBound instanceof ae) {
                return ab.alpha((ae) lowerBound, (ae) upperBound);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC1787b);
            sb2.append(", ");
            throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, interfaceC1787b.getClass(), sb2).toString());
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(interfaceC1787b);
        sb3.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, interfaceC1787b.getClass(), sb3).toString());
    }

    public static Collection navy(p000if.f receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ap) {
            Collection lima = ((ap) receiver).lima();
            Intrinsics.delta(lima, "this.supertypes");
            return lima;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static final String november(ap apVar) {
        StringBuilder sb2 = new StringBuilder();
        oscar(sb2, "type: " + apVar);
        oscar(sb2, "hashCode: " + apVar.hashCode());
        oscar(sb2, "javaClass: " + apVar.getClass().getCanonicalName());
        for (InterfaceC2335k kilo = apVar.kilo(); kilo != null; kilo = kilo.lima()) {
            oscar(sb2, "fqName: ".concat(Pe.o.alpha.whiskey(kilo)));
            oscar(sb2, "javaClass: " + kilo.getClass().getCanonicalName());
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static C1794i ochre(p000if.b receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof C1793h) {
            return ((C1793h) receiver).red;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static ap olive(p000if.d receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ae) {
            return ((ae) receiver).green();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static ae orange(kotlin.reflect.jvm.internal.impl.types.s sVar) {
        if (sVar instanceof kotlin.reflect.jvm.internal.impl.types.s) {
            return sVar.red;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(sVar);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, sVar.getClass(), sb2).toString());
    }

    public static final void oscar(StringBuilder sb2, String str) {
        Intrinsics.echo(str, "<this>");
        sb2.append(str);
        sb2.append('\n');
    }

    public static as papa(p000if.c receiver, int i4) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof y) {
            return (as) ((y) receiver).cyan().get(i4);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static p000if.c peach(InterfaceC1787b interfaceC1787b, p000if.c cVar) {
        if (cVar instanceof p000if.d) {
            return interfaceC1787b.j((p000if.d) cVar, true);
        }
        if (cVar instanceof kotlin.reflect.jvm.internal.impl.types.s) {
            kotlin.reflect.jvm.internal.impl.types.s sVar = (kotlin.reflect.jvm.internal.impl.types.s) cVar;
            return interfaceC1787b.d(interfaceC1787b.j(interfaceC1787b.p(sVar), true), interfaceC1787b.j(interfaceC1787b.coral(sVar), true));
        }
        throw new IllegalStateException("sealed");
    }

    public static ae pink(p000if.d receiver, boolean z2) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ae) {
            return ((ae) receiver).pink(z2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static aq quebec(p000if.f receiver, int i4) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ap) {
            Object obj = ((ap) receiver).getParameters().get(i4);
            Intrinsics.delta(obj, "this.parameters[index]");
            return (aq) obj;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static B romeo(as receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof as) {
            return receiver.bravo().ochre();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static aq sierra(p000if.f receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ap) {
            InterfaceC2332h kilo = ((ap) receiver).kilo();
            if (kilo instanceof aq) {
                return (aq) kilo;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static int tango(as receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof as) {
            int alpha2 = receiver.alpha();
            com.google.android.material.datepicker.j.sierra(alpha2, "this.projectionKind");
            return AbstractC2777t5.alpha(alpha2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static boolean uniform(y receiver, Ne.c fqName) {
        Intrinsics.echo(receiver, "$receiver");
        Intrinsics.echo(fqName, "fqName");
        return receiver.getAnnotations().D(fqName);
    }

    public static boolean victor(aq aqVar, p000if.f fVar) {
        boolean z2;
        if (fVar == null) {
            z2 = true;
        } else {
            z2 = fVar instanceof ap;
        }
        if (z2) {
            return O5.india(aqVar, (ap) fVar, 4);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(aqVar);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, aqVar.getClass(), sb2).toString());
    }

    public static boolean whiskey(p000if.d a6, p000if.d b2) {
        Intrinsics.echo(a6, "a");
        Intrinsics.echo(b2, "b");
        if (a6 instanceof ae) {
            if (b2 instanceof ae) {
                if (((ae) a6).cyan() == ((ae) b2).cyan()) {
                    return true;
                }
                return false;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(b2);
            sb2.append(", ");
            throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, b2.getClass(), sb2).toString());
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(a6);
        sb3.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, a6.getClass(), sb3).toString());
    }

    public static boolean xray(p000if.f receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ap) {
            return AbstractC2120h.coral((ap) receiver, me.m.alpha);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static boolean yankee(p000if.f receiver) {
        Intrinsics.echo(receiver, "$receiver");
        if (receiver instanceof ap) {
            return ((ap) receiver).kilo() instanceof InterfaceC2330f;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
    }

    public static boolean zulu(p000if.f fVar) {
        InterfaceC2330f interfaceC2330f;
        if (fVar instanceof ap) {
            InterfaceC2332h kilo = ((ap) fVar).kilo();
            if (kilo instanceof InterfaceC2330f) {
                interfaceC2330f = (InterfaceC2330f) kilo;
            } else {
                interfaceC2330f = null;
            }
            if (interfaceC2330f == null || interfaceC2330f.golf() != 1 || interfaceC2330f.c() == 3 || interfaceC2330f.c() == 4 || interfaceC2330f.c() == 5) {
                return false;
            }
            return true;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(fVar);
        sb2.append(", ");
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, fVar.getClass(), sb2).toString());
    }
}
