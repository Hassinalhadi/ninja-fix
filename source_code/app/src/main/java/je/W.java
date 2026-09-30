package je;

import Ie.C0181a;
import ge.InterfaceC1771c;
import ge.InterfaceC1772d;
import ge.InterfaceC1773e;
import ge.InterfaceC1774f;
import ge.InterfaceC1775g;
import ge.InterfaceC1778j;
import ge.InterfaceC1780l;
import ie.C1917a;
import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import oe.C2233d;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2345u;
import s6.AbstractC2607a5;

/* loaded from: classes2.dex */
public class W extends kotlin.jvm.internal.v {
    public static af november(kotlin.jvm.internal.c cVar) {
        InterfaceC1774f owner = cVar.getOwner();
        if (owner instanceof af) {
            return (af) owner;
        }
        return C1965d.purple;
    }

    @Override // kotlin.jvm.internal.v
    public final InterfaceC1775g alpha(kotlin.jvm.internal.h hVar) {
        af container = november(hVar);
        String name = hVar.getName();
        String signature = hVar.getSignature();
        Object boundReceiver = hVar.getBoundReceiver();
        Intrinsics.echo(container, "container");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(signature, "signature");
        return new ah(container, name, signature, null, boundReceiver);
    }

    @Override // kotlin.jvm.internal.v
    public final InterfaceC1772d bravo(Class cls) {
        return AbstractC1964c.alpha(cls);
    }

    @Override // kotlin.jvm.internal.v
    public final InterfaceC1774f charlie(Class jClass, String str) {
        gd.a aVar = AbstractC1964c.alpha;
        Intrinsics.echo(jClass, "jClass");
        return (InterfaceC1774f) AbstractC1964c.bravo.charlie(jClass);
    }

    @Override // kotlin.jvm.internal.v
    public final ge.w delta(ge.w type) {
        InterfaceC2330f interfaceC2330f;
        Intrinsics.echo(type, "type");
        kotlin.reflect.jvm.internal.impl.types.y yVar = ((N) type).alpha;
        if (yVar instanceof kotlin.reflect.jvm.internal.impl.types.ae) {
            InterfaceC2332h kilo = yVar.green().kilo();
            if (kilo instanceof InterfaceC2330f) {
                interfaceC2330f = (InterfaceC2330f) kilo;
            } else {
                interfaceC2330f = null;
            }
            if (interfaceC2330f != null) {
                kotlin.reflect.jvm.internal.impl.types.ae aeVar = (kotlin.reflect.jvm.internal.impl.types.ae) yVar;
                String str = C2233d.alpha;
                Ne.c cVar = (Ne.c) C2233d.kilo.get(Ue.e.hotel(interfaceC2330f));
                if (cVar != null) {
                    kotlin.reflect.jvm.internal.impl.types.ap tango = Ue.e.echo(interfaceC2330f).india(cVar).tango();
                    Intrinsics.delta(tango, "classifier.readOnlyToMutable().typeConstructor");
                    int i4 = kotlin.reflect.jvm.internal.impl.types.ab.alpha;
                    kotlin.reflect.jvm.internal.impl.types.al annotations = aeVar.gold();
                    List arguments = aeVar.cyan();
                    boolean indigo = aeVar.indigo();
                    Intrinsics.echo(annotations, "annotations");
                    Intrinsics.echo(arguments, "arguments");
                    return new N(kotlin.reflect.jvm.internal.impl.types.ab.charlie(arguments, annotations, tango, indigo), null);
                }
                throw new IllegalArgumentException("Not a readonly collection: " + interfaceC2330f);
            }
            throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: " + type);
        }
        throw new IllegalArgumentException(("Non-simple type cannot be a mutable collection type: " + type).toString());
    }

    @Override // kotlin.jvm.internal.v
    public final InterfaceC1778j echo(androidx.compose.material3.internal.ak akVar) {
        return new aj(november(akVar), akVar.getName(), akVar.getSignature(), akVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.v
    public final InterfaceC1780l foxtrot(kotlin.jvm.internal.l lVar) {
        return new al(november(lVar), lVar.getName(), lVar.getSignature(), lVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.v
    public final ge.s golf(Af.i iVar) {
        return new ay(november(iVar), iVar.getName(), iVar.getSignature(), iVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.v
    public final ge.u hotel(kotlin.jvm.internal.o oVar) {
        return new C1961B(november(oVar), oVar.getName(), oVar.getSignature(), oVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.v
    public final String india(kotlin.jvm.internal.g gVar) {
        ah bravo;
        boolean z2;
        Metadata metadata = (Metadata) gVar.getClass().getAnnotation(Metadata.class);
        ah ahVar = null;
        if (metadata != null) {
            String[] d12 = metadata.d1();
            if (d12.length == 0) {
                d12 = null;
            }
            if (d12 != null) {
                String[] strings = metadata.d2();
                Oe.h hVar = Me.h.alpha;
                Intrinsics.echo(strings, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Me.a.alpha(d12));
                Oe.h hVar2 = Me.h.alpha;
                Me.g golf = Me.h.golf(byteArrayInputStream, strings);
                C0181a c0181a = Ie.y.f1611o;
                Oe.h hVar3 = Me.h.alpha;
                c0181a.getClass();
                Oe.f fVar = new Oe.f(byteArrayInputStream);
                Oe.v vVar = (Oe.v) c0181a.alpha(fVar, hVar3);
                try {
                    if (fVar.foxtrot == 0) {
                        Oe.c.bravo(vVar);
                        Ie.y yVar = (Ie.y) vVar;
                        int[] mv = metadata.mv();
                        if ((metadata.xi() & 8) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Me.f fVar2 = new Me.f(mv, z2);
                        Class<?> cls = gVar.getClass();
                        Ie.aw awVar = yVar.f1619i;
                        Intrinsics.delta(awVar, "proto.typeTable");
                        ahVar = new ah(C1965d.purple, (se.ak) a0.foxtrot(cls, yVar, golf, new G6.j(awVar), fVar2, C1917a.alpha));
                    } else {
                        throw InvalidProtocolBufferException.invalidEndTag();
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(vVar);
                }
            }
        }
        if (ahVar != null && (bravo = a0.bravo(ahVar)) != null) {
            Pe.t tVar = X.alpha;
            InterfaceC2345u tango = bravo.tango();
            StringBuilder sb2 = new StringBuilder();
            X.alpha(sb2, tango);
            List peach = tango.peach();
            Intrinsics.delta(peach, "invoke.valueParameters");
            CollectionsKt.magenta(peach, sb2, ", ", "(", ")", C1963b.f12911g, 48);
            sb2.append(" -> ");
            kotlin.reflect.jvm.internal.impl.types.y returnType = tango.getReturnType();
            Intrinsics.checkNotNull(returnType);
            sb2.append(X.delta(returnType));
            String sb3 = sb2.toString();
            Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
        return super.india(gVar);
    }

    @Override // kotlin.jvm.internal.v
    public final String juliet(Lambda lambda) {
        return india(lambda);
    }

    @Override // kotlin.jvm.internal.v
    public final void kilo(ge.x xVar, List list) {
    }

    @Override // kotlin.jvm.internal.v
    public final ge.w lima(InterfaceC1773e interfaceC1773e, List arguments, boolean z2) {
        if (interfaceC1773e instanceof kotlin.jvm.internal.d) {
            Class jClass = ((kotlin.jvm.internal.d) interfaceC1773e).golf();
            gd.a aVar = AbstractC1964c.alpha;
            Intrinsics.echo(jClass, "jClass");
            Intrinsics.echo(arguments, "arguments");
            if (arguments.isEmpty()) {
                if (z2) {
                    return (ge.w) AbstractC1964c.delta.charlie(jClass);
                }
                return (ge.w) AbstractC1964c.charlie.charlie(jClass);
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) AbstractC1964c.echo.charlie(jClass);
            Pair pair = new Pair(arguments, Boolean.valueOf(z2));
            Object obj = concurrentHashMap.get(pair);
            if (obj == null) {
                N alpha = AbstractC2607a5.alpha(AbstractC1964c.alpha(jClass), arguments, z2, CollectionsKt.emptyList());
                Object putIfAbsent = concurrentHashMap.putIfAbsent(pair, alpha);
                if (putIfAbsent == null) {
                    obj = alpha;
                } else {
                    obj = putIfAbsent;
                }
            }
            return (ge.w) obj;
        }
        return AbstractC2607a5.alpha(interfaceC1773e, arguments, z2, Collections.EMPTY_LIST);
    }

    @Override // kotlin.jvm.internal.v
    public final ge.x mike(InterfaceC1772d interfaceC1772d) {
        List<ge.x> typeParameters;
        if (av.q.kilo(interfaceC1772d)) {
            typeParameters = interfaceC1772d.getTypeParameters();
        } else if (interfaceC1772d instanceof InterfaceC1771c) {
            typeParameters = ((InterfaceC1771c) interfaceC1772d).getTypeParameters();
        } else {
            throw new IllegalArgumentException("Type parameter container must be a class or a callable: " + interfaceC1772d);
        }
        for (ge.x xVar : typeParameters) {
            if (xVar.getName().equals("PluginConfigT")) {
                return xVar;
            }
        }
        throw new IllegalArgumentException("Type parameter PluginConfigT is not found in container: " + interfaceC1772d);
    }
}
