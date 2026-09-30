package Qe;

import A0.p;
import K1.r;
import Xe.n;
import ef.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ab;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.at;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlin.text.Regex;
import of.C2259n;
import pe.AbstractC2340p;
import pe.AbstractC2347w;
import pe.C2339o;
import pe.InterfaceC2326b;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import pe.al;
import pe.an;
import qe.C2470f;
import qe.C2471g;
import qe.InterfaceC2472h;
import se.AbstractC2852b;
import se.C2871u;
import se.ah;
import se.ai;
import se.aj;
import se.ak;
import se.aq;
import t6.Y1;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public abstract class l {
    public static final r alpha = new r("ResolutionAnchorProvider", 2);

    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        if (i4 != 12 && i4 != 23 && i4 != 25) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 12 && i4 != 23 && i4 != 25) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i4 != 12) {
            if (i4 != 23) {
                if (i4 != 25) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                } else {
                    objArr[1] = "createEnumValueOfMethod";
                }
            } else {
                objArr[1] = "createEnumValuesMethod";
            }
        } else {
            objArr[1] = "createSetter";
        }
        switch (i4) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 12 || i4 == 23 || i4 == 25) {
            throw new IllegalStateException(format);
        }
    }

    public static final void charlie(InterfaceC2330f interfaceC2330f, LinkedHashSet linkedHashSet, n nVar, boolean z2) {
        for (InterfaceC2335k interfaceC2335k : Y1.alpha(nVar, Xe.f.oscar, 2)) {
            if (interfaceC2335k instanceof InterfaceC2330f) {
                InterfaceC2330f interfaceC2330f2 = (InterfaceC2330f) interfaceC2335k;
                if (interfaceC2330f2.emerald()) {
                    Ne.f name = interfaceC2330f2.getName();
                    Intrinsics.delta(name, "descriptor.name");
                    InterfaceC2332h golf = nVar.golf(name, EnumC3339b.silver);
                    if (golf instanceof InterfaceC2330f) {
                        interfaceC2330f2 = (InterfaceC2330f) golf;
                    } else if (golf instanceof s) {
                        interfaceC2330f2 = ((s) golf).Z();
                    } else {
                        interfaceC2330f2 = null;
                    }
                }
                if (interfaceC2330f2 == null) {
                    continue;
                } else if (interfaceC2330f != null) {
                    int i4 = e.alpha;
                    Iterator it = interfaceC2330f2.tango().lima().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (e.papa((y) it.next(), interfaceC2330f.alpha())) {
                                linkedHashSet.add(interfaceC2330f2);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z2) {
                        n s3 = interfaceC2330f2.s();
                        Intrinsics.delta(s3, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        charlie(interfaceC2330f, linkedHashSet, s3, z2);
                    }
                } else {
                    e.alpha(27);
                    throw null;
                }
            }
        }
    }

    public static C2871u echo(InterfaceC2326b interfaceC2326b, y yVar, Ne.f fVar, InterfaceC2472h interfaceC2472h, int i4) {
        if (interfaceC2472h != null) {
            if (yVar == null) {
                return null;
            }
            Ye.a aVar = new Ye.a(interfaceC2326b, yVar, fVar);
            Regex regex = Ne.g.alpha;
            return new C2871u(interfaceC2326b, aVar, interfaceC2472h, Ne.f.echo("_context_receiver_" + i4));
        }
        alpha(33);
        throw null;
    }

    public static ai foxtrot(al alVar, InterfaceC2472h interfaceC2472h) {
        return lima(alVar, interfaceC2472h, true, alVar.echo());
    }

    public static aj golf(al alVar, InterfaceC2472h interfaceC2472h) {
        C2470f c2470f = C2471g.alpha;
        an echo = alVar.echo();
        if (echo != null) {
            return mike(alVar, interfaceC2472h, c2470f, true, alVar.getVisibility(), echo);
        }
        alpha(6);
        throw null;
    }

    public static ah hotel(AbstractC2852b abstractC2852b) {
        if (abstractC2852b != null) {
            InterfaceC2330f delta = AbstractC2347w.delta(e.delta(abstractC2852b), Ne.i.tango);
            if (delta == null) {
                return null;
            }
            C2470f c2470f = C2471g.alpha;
            C2339o c2339o = AbstractC2340p.echo;
            ah a02 = ah.a0(abstractC2852b, 1, c2339o, false, me.n.bravo, 4, abstractC2852b.echo());
            ai aiVar = new ai(a02, c2470f, 1, c2339o, false, false, false, 4, null, abstractC2852b.echo());
            a02.d0(aiVar, null, null, null);
            kotlin.reflect.jvm.internal.impl.types.al.purple.getClass();
            kotlin.reflect.jvm.internal.impl.types.al attributes = kotlin.reflect.jvm.internal.impl.types.al.red;
            ap constructor = delta.tango();
            List arguments = Collections.singletonList(new at(1, abstractC2852b.oscar()));
            int i4 = ab.alpha;
            Intrinsics.echo(attributes, "attributes");
            Intrinsics.echo(constructor, "constructor");
            Intrinsics.echo(arguments, "arguments");
            ae charlie = ab.charlie(arguments, attributes, constructor, false);
            List list = Collections.EMPTY_LIST;
            a02.g0(charlie, list, null, null, list);
            aiVar.c0(a02.getReturnType());
            return a02;
        }
        alpha(26);
        throw null;
    }

    public static ak india(AbstractC2852b abstractC2852b) {
        if (abstractC2852b != null) {
            C2470f c2470f = C2471g.alpha;
            ak k02 = ak.k0(abstractC2852b, me.n.charlie, 4, abstractC2852b.echo());
            aq aqVar = new aq(k02, null, 0, c2470f, Ne.f.echo("value"), Ue.e.echo(abstractC2852b).tango(), false, false, false, null, abstractC2852b.echo());
            List list = Collections.EMPTY_LIST;
            return k02.e0(null, null, list, list, Collections.singletonList(aqVar), abstractC2852b.oscar(), 1, AbstractC2340p.echo);
        }
        alpha(24);
        throw null;
    }

    public static ak juliet(AbstractC2852b abstractC2852b) {
        if (abstractC2852b != null) {
            ak k02 = ak.k0(abstractC2852b, me.n.alpha, 4, abstractC2852b.echo());
            List list = Collections.EMPTY_LIST;
            return k02.e0(null, null, list, list, list, Ue.e.echo(abstractC2852b).hotel(abstractC2852b.oscar()), 1, AbstractC2340p.echo);
        }
        alpha(22);
        throw null;
    }

    public static C2871u kilo(InterfaceC2326b interfaceC2326b, y yVar, InterfaceC2472h interfaceC2472h) {
        if (yVar == null) {
            return null;
        }
        return new C2871u(interfaceC2326b, new Ye.b(interfaceC2326b, yVar), interfaceC2472h);
    }

    public static ai lima(al alVar, InterfaceC2472h interfaceC2472h, boolean z2, an anVar) {
        if (interfaceC2472h != null) {
            if (anVar != null) {
                return new ai(alVar, interfaceC2472h, alVar.golf(), alVar.getVisibility(), z2, false, false, 1, null, anVar);
            }
            alpha(19);
            throw null;
        }
        alpha(18);
        throw null;
    }

    public static aj mike(al alVar, InterfaceC2472h interfaceC2472h, InterfaceC2472h interfaceC2472h2, boolean z2, C2339o c2339o, an anVar) {
        if (interfaceC2472h != null) {
            if (interfaceC2472h2 != null) {
                if (c2339o != null) {
                    if (anVar != null) {
                        aj ajVar = new aj(alVar, interfaceC2472h, alVar.golf(), c2339o, z2, false, false, 1, null, anVar);
                        ajVar.f13738f = aj.b0(ajVar, alVar.getType(), interfaceC2472h2);
                        return ajVar;
                    }
                    alpha(11);
                    throw null;
                }
                alpha(10);
                throw null;
            }
            alpha(9);
            throw null;
        }
        alpha(8);
        throw null;
    }

    public static boolean november(InterfaceC2345u interfaceC2345u) {
        if (interfaceC2345u.november() == 4 && e.november(interfaceC2345u.lima(), 3)) {
            return true;
        }
        return false;
    }

    public static final Collection oscar(Collection collection, Function1 descriptorByHandle) {
        Intrinsics.echo(collection, "<this>");
        Intrinsics.echo(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C2259n c2259n = new C2259n();
        while (!linkedList.isEmpty()) {
            Object gold = CollectionsKt.gold(linkedList);
            C2259n c2259n2 = new C2259n();
            ArrayList golf = k.golf(gold, linkedList, descriptorByHandle, new p(15, c2259n2));
            if (golf.size() == 1 && c2259n2.isEmpty()) {
                Object j5 = CollectionsKt.j(golf);
                Intrinsics.delta(j5, "overridableGroup.single()");
                c2259n.add(j5);
            } else {
                Object sierra = k.sierra(golf, descriptorByHandle);
                InterfaceC2326b interfaceC2326b = (InterfaceC2326b) descriptorByHandle.invoke(sierra);
                Iterator it = golf.iterator();
                while (it.hasNext()) {
                    Object it2 = it.next();
                    Intrinsics.delta(it2, "it");
                    if (!k.kilo(interfaceC2326b, (InterfaceC2326b) descriptorByHandle.invoke(it2))) {
                        c2259n2.add(it2);
                    }
                }
                if (!c2259n2.isEmpty()) {
                    c2259n.addAll(c2259n2);
                }
                c2259n.add(sierra);
            }
        }
        return c2259n;
    }

    public abstract void bravo(InterfaceC2328d interfaceC2328d);

    public abstract void delta(InterfaceC2328d interfaceC2328d, InterfaceC2328d interfaceC2328d2);

    public void papa(InterfaceC2328d member, Collection collection) {
        Intrinsics.echo(member, "member");
        member.r(collection);
    }
}
