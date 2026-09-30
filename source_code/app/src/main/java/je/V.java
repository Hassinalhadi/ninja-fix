package je;

import com.google.android.gms.measurement.internal.C1467s;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import ke.InterfaceC2037e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2340p;
import pe.InterfaceC2328d;
import pe.InterfaceC2335k;
import s6.AbstractC2671h6;
import ve.AbstractC3192d;

/* loaded from: classes2.dex */
public abstract class V {
    public static final C1467s alpha = new C1467s(11);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC2037e alpha(F f5, boolean z2) {
        C1971j c1971j;
        Method method;
        InterfaceC2037e sVar;
        Le.c cVar;
        InterfaceC2037e sVar2;
        if (af.alpha.echo(f5.xray().f12890a)) {
            return ke.y.alpha;
        }
        Ne.b bVar = Y.alpha;
        V bravo = Y.bravo(f5.xray().tango());
        if (bravo instanceof C1974m) {
            C1974m c1974m = (C1974m) bravo;
            Le.e eVar = c1974m.silver;
            Method method2 = null;
            if (z2) {
                if ((eVar.purple & 4) == 4) {
                    cVar = eVar.teal;
                    if (cVar != null) {
                        af afVar = f5.xray().white;
                        int i4 = cVar.red;
                        Ke.e eVar2 = c1974m.teal;
                        method2 = afVar.papa(eVar2.getString(i4), eVar2.getString(cVar.silver));
                    }
                    if (method2 != null) {
                        if (Qe.g.delta(f5.xray().tango()) && Intrinsics.areEqual(f5.xray().tango().getVisibility(), AbstractC2340p.delta)) {
                            Class golf = AbstractC2671h6.golf(f5.xray().tango().lima());
                            if (golf != null) {
                                Method delta = AbstractC2671h6.delta(golf, f5.xray().tango());
                                if (f5.victor()) {
                                    sVar = new ke.v(delta, juliet(f5));
                                } else {
                                    sVar = new ke.x(delta, kotlin.collections.ab.juliet(delta.getDeclaringClass()));
                                }
                            } else {
                                throw new Q("Underlying property of inline class " + f5.xray() + " should have a field");
                            }
                        } else {
                            Field field = (Field) f5.xray().f12892c.getValue();
                            if (field != null) {
                                sVar = hotel(f5, z2, field);
                            } else {
                                throw new Q("No accessors or field is found for property " + f5.xray());
                            }
                        }
                    } else {
                        if (!Modifier.isStatic(method2.getModifiers())) {
                            if (f5.victor()) {
                                sVar2 = new ke.p(method2, juliet(f5));
                            } else {
                                sVar2 = new ke.s(method2, 0);
                            }
                        } else if (f5.xray().tango().getAnnotations().D(a0.alpha)) {
                            if (f5.victor()) {
                                sVar2 = new ke.q(method2);
                            } else {
                                sVar2 = new ke.s(method2, 1);
                            }
                        } else if (f5.victor()) {
                            sVar2 = new ke.r(method2, juliet(f5));
                        } else {
                            sVar2 = new ke.s(method2, 2);
                        }
                        sVar = sVar2;
                    }
                }
                cVar = null;
                if (cVar != null) {
                }
                if (method2 != null) {
                }
            } else {
                if ((eVar.purple & 8) == 8) {
                    cVar = eVar.white;
                    if (cVar != null) {
                    }
                    if (method2 != null) {
                    }
                }
                cVar = null;
                if (cVar != null) {
                }
                if (method2 != null) {
                }
            }
        } else if (bravo instanceof C1972k) {
            sVar = hotel(f5, z2, ((C1972k) bravo).purple);
        } else if (bravo instanceof C1973l) {
            if (z2) {
                method = ((C1973l) bravo).purple;
            } else {
                C1973l c1973l = (C1973l) bravo;
                method = c1973l.red;
                if (method == null) {
                    throw new Q("No source found for setter of Java method property: " + c1973l.purple);
                }
            }
            if (f5.victor()) {
                sVar = new ke.p(method, juliet(f5));
            } else {
                sVar = new ke.s(method, 0);
            }
        } else {
            if (bravo instanceof C1975n) {
                if (z2) {
                    c1971j = ((C1975n) bravo).purple;
                } else {
                    c1971j = ((C1975n) bravo).red;
                    if (c1971j == null) {
                        throw new Q("No setter found for property " + f5.xray());
                    }
                }
                af afVar2 = f5.xray().white;
                Me.e eVar3 = c1971j.purple;
                Method papa = afVar2.papa(eVar3.bravo, eVar3.charlie);
                if (papa != null) {
                    Modifier.isStatic(papa.getModifiers());
                    if (f5.victor()) {
                        return new ke.p(papa, juliet(f5));
                    }
                    return new ke.s(papa, 0);
                }
                throw new Q("No accessor found for property " + f5.xray());
            }
            throw new NoWhenBranchMatchedException();
        }
        return AbstractC2671h6.bravo(sVar, f5.whiskey(), false);
    }

    public static final String delta(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.delta(parameterTypes, "parameterTypes");
        sb2.append(ArraysKt.magenta(parameterTypes, "", "(", ")", C1963b.f12912h, 24));
        Class<?> returnType = method.getReturnType();
        Intrinsics.delta(returnType, "returnType");
        sb2.append(AbstractC3192d.bravo(returnType));
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        if (Me.h.delta(((ef.q) r0).f12599t) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (Qe.e.november(r1, 5) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ke.t hotel(F f5, boolean z2, Field field) {
        pe.al tango = f5.xray().tango();
        InterfaceC2335k containingDeclaration = tango.lima();
        Intrinsics.delta(containingDeclaration, "containingDeclaration");
        if (Qe.e.lima(containingDeclaration)) {
            InterfaceC2335k lima = containingDeclaration.lima();
            if (!Qe.e.november(lima, 2)) {
            }
            if (tango instanceof ef.q) {
            }
        }
        if (Modifier.isStatic(field.getModifiers())) {
            if (f5.xray().tango().getAnnotations().D(a0.alpha)) {
                if (z2) {
                    if (f5.victor()) {
                        return new ke.k(field, false);
                    }
                    return new ke.j(field, true, 1);
                }
                if (f5.victor()) {
                    return new ke.o(field, india(f5), false);
                }
                return new ke.n(field, india(f5), true, 1);
            }
            if (z2) {
                return new ke.j(field, false, 2);
            }
            return new ke.n(field, india(f5), false, 2);
        }
        if (z2) {
            if (f5.victor()) {
                return new ke.h(field, juliet(f5));
            }
            Intrinsics.echo(field, "field");
            return new ke.j(field, true, 0);
        }
        if (f5.victor()) {
            return new ke.l(field, india(f5), juliet(f5));
        }
        boolean india = india(f5);
        Intrinsics.echo(field, "field");
        return new ke.n(field, india, true, 0);
    }

    public static final boolean india(F f5) {
        return !kotlin.reflect.jvm.internal.impl.types.az.foxtrot(f5.xray().tango().getType());
    }

    public static final Object juliet(F f5) {
        Intrinsics.echo(f5, "<this>");
        L xray = f5.xray();
        return AbstractC2671h6.alpha(xray.f12891b, xray.tango());
    }

    public static T kilo(InterfaceC2328d interfaceC2328d, Function0 function0) {
        if (function0 != null) {
            return new T(interfaceC2328d, function0);
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public abstract String foxtrot();
}
