package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import of.C2257l;
import pe.InterfaceC2321ad;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.InterfaceC2349y;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2040b extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2040b(ff.l lVar) {
        super(lVar);
        if (lVar != null) {
        } else {
            november(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void november(int i4) {
        String format;
        String str = (i4 == 1 || i4 == 3 || i4 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i4 == 1 || i4 == 3 || i4 == 4) ? 2 : 3];
        if (i4 != 1) {
            if (i4 == 2) {
                objArr[0] = "classifier";
            } else if (i4 != 3 && i4 != 4) {
                objArr[0] = "storageManager";
            }
            if (i4 != 1) {
                objArr[1] = "getBuiltIns";
            } else if (i4 == 3 || i4 == 4) {
                objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
            }
            if (i4 != 1) {
                if (i4 == 2) {
                    objArr[2] = "isSameClassifier";
                } else if (i4 != 3 && i4 != 4) {
                    objArr[2] = "<init>";
                }
            }
            format = String.format(str, objArr);
            if (i4 == 1 && i4 != 3 && i4 != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        if (i4 != 1) {
        }
        if (i4 != 1) {
        }
        format = String.format(str, objArr);
        if (i4 == 1) {
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i
    public final y charlie() {
        InterfaceC2330f kilo = kilo();
        if (kilo != null) {
            Ne.f fVar = AbstractC2120h.echo;
            if (AbstractC2120h.bravo(kilo, me.m.alpha) || AbstractC2120h.bravo(kilo, me.m.bravo)) {
                return null;
            }
            return juliet().echo();
        }
        AbstractC2120h.alpha(107);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i
    public final List delta() {
        InterfaceC2335k lima = kilo().lima();
        if (!(lima instanceof InterfaceC2330f)) {
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            november(3);
            throw null;
        }
        C2257l c2257l = new C2257l();
        InterfaceC2330f interfaceC2330f = (InterfaceC2330f) lima;
        c2257l.add(interfaceC2330f.oscar());
        interfaceC2330f.maroon();
        return c2257l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((se.ab) ((pe.InterfaceC2321ad) r0)).teal, ((se.ab) ((pe.InterfaceC2321ad) r6)).teal) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0072 A[RETURN] */
    @Override // kotlin.reflect.jvm.internal.impl.types.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean golf(InterfaceC2332h interfaceC2332h) {
        boolean z2;
        if (interfaceC2332h instanceof InterfaceC2330f) {
            InterfaceC2330f first = kilo();
            Intrinsics.echo(first, "first");
            if (Intrinsics.areEqual(first.getName(), interfaceC2332h.getName())) {
                InterfaceC2335k lima = first.lima();
                InterfaceC2335k lima2 = interfaceC2332h.lima();
                while (true) {
                    if (lima != null && lima2 != null) {
                        if (lima instanceof InterfaceC2349y) {
                            z2 = lima2 instanceof InterfaceC2349y;
                            break;
                        }
                        if (!(lima2 instanceof InterfaceC2349y)) {
                            if (lima instanceof InterfaceC2321ad) {
                                if (lima2 instanceof InterfaceC2321ad) {
                                }
                            } else {
                                if ((lima2 instanceof InterfaceC2321ad) || !Intrinsics.areEqual(lima.getName(), lima2.getName())) {
                                    break;
                                }
                                lima = lima.lima();
                                lima2 = lima2.lima();
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                z2 = true;
                if (!z2) {
                    return true;
                }
            }
            z2 = false;
            if (!z2) {
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final AbstractC2120h juliet() {
        AbstractC2120h echo = Ue.e.echo(kilo());
        if (echo != null) {
            return echo;
        }
        november(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    /* renamed from: oscar, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC2330f kilo();
}
