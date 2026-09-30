package se;

import java.util.List;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.InterfaceC2336l;
import pe.InterfaceC2337m;
import qe.InterfaceC2472h;

/* renamed from: se.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2858h extends AbstractC2864n implements pe.aq {

    /* renamed from: a, reason: collision with root package name */
    public final ff.i f13749a;

    /* renamed from: b, reason: collision with root package name */
    public final ff.i f13750b;

    /* renamed from: c, reason: collision with root package name */
    public final ff.l f13751c;
    public final int teal;
    public final boolean white;
    public final int yellow;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC2858h(ff.o oVar, InterfaceC2335k interfaceC2335k, InterfaceC2472h interfaceC2472h, Ne.f fVar, int i4, boolean z2, int i5, pe.ao aoVar) {
        super(interfaceC2335k, interfaceC2472h, fVar, r0);
        pe.ao aoVar2 = pe.an.magenta;
        if (oVar != null) {
            if (interfaceC2335k != null) {
                if (interfaceC2472h != null) {
                    if (fVar != null) {
                        if (i4 != 0) {
                            if (aoVar != null) {
                                this.teal = i4;
                                this.white = z2;
                                this.yellow = i5;
                                C2856f c2856f = new C2856f(this, oVar, aoVar);
                                ff.l lVar = (ff.l) oVar;
                                this.f13749a = lVar.bravo(c2856f);
                                this.f13750b = lVar.bravo(new Ic.c(this, fVar, 4));
                                this.f13751c = lVar;
                                return;
                            }
                            D(6);
                            throw null;
                        }
                        D(4);
                        throw null;
                    }
                    D(3);
                    throw null;
                }
                D(2);
                throw null;
            }
            D(1);
            throw null;
        }
        D(0);
        throw null;
    }

    public static /* synthetic */ void D(int i4) {
        String str;
        int i5;
        switch (i4) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i5 = 2;
                break;
            case 12:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i4) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i4) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // se.AbstractC2864n
    /* renamed from: Y */
    public final InterfaceC2336l alpha() {
        return this;
    }

    public List Z(List list) {
        if (list != null) {
            if (list != null) {
                return list;
            }
            D(13);
            throw null;
        }
        D(12);
        throw null;
    }

    public abstract void a0(kotlin.reflect.jvm.internal.impl.types.y yVar);

    @Override // se.AbstractC2864n, se.AbstractC2863m, pe.InterfaceC2335k, pe.InterfaceC2332h
    public final InterfaceC2332h alpha() {
        return this;
    }

    @Override // pe.aq
    public final ff.o b() {
        ff.l lVar = this.f13751c;
        if (lVar != null) {
            return lVar;
        }
        D(14);
        throw null;
    }

    public abstract List b0();

    @Override // pe.aq
    public final boolean black() {
        return this.white;
    }

    @Override // pe.aq
    public final int fuchsia() {
        int i4 = this.teal;
        if (i4 != 0) {
            return i4;
        }
        D(7);
        throw null;
    }

    @Override // pe.aq
    public final int getIndex() {
        return this.yellow;
    }

    @Override // pe.aq
    public final List getUpperBounds() {
        List lima = ((C2857g) tango()).lima();
        if (lima != null) {
            return lima;
        }
        D(8);
        throw null;
    }

    @Override // pe.aq
    public final boolean j() {
        return false;
    }

    @Override // pe.InterfaceC2332h
    public final kotlin.reflect.jvm.internal.impl.types.ae oscar() {
        kotlin.reflect.jvm.internal.impl.types.ae aeVar = (kotlin.reflect.jvm.internal.impl.types.ae) this.f13750b.invoke();
        if (aeVar != null) {
            return aeVar;
        }
        D(10);
        throw null;
    }

    @Override // pe.InterfaceC2335k
    public final Object quebec(InterfaceC2337m interfaceC2337m, Object obj) {
        return interfaceC2337m.delta(this, obj);
    }

    @Override // pe.InterfaceC2332h
    public final kotlin.reflect.jvm.internal.impl.types.ap tango() {
        kotlin.reflect.jvm.internal.impl.types.ap apVar = (kotlin.reflect.jvm.internal.impl.types.ap) this.f13749a.invoke();
        if (apVar != null) {
            return apVar;
        }
        D(9);
        throw null;
    }

    @Override // se.AbstractC2864n, se.AbstractC2863m, pe.InterfaceC2335k, pe.InterfaceC2332h
    public final InterfaceC2335k alpha() {
        return this;
    }

    @Override // se.AbstractC2864n, se.AbstractC2863m, pe.InterfaceC2335k, pe.InterfaceC2332h
    public final pe.aq alpha() {
        return this;
    }
}
