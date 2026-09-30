package se;

import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.ax;
import pe.AbstractC2340p;
import pe.C2339o;
import pe.InterfaceC2326b;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.InterfaceC2337m;
import qe.C2471g;
import qe.InterfaceC2472h;

/* renamed from: se.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2871u extends AbstractC2863m implements pe.aj {
    public final /* synthetic */ int red = 0;
    public final InterfaceC2335k silver;
    public final Ye.d teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2871u(InterfaceC2330f interfaceC2330f) {
        super(C2471g.alpha, Ne.h.delta);
        if (interfaceC2330f != null) {
            this.silver = interfaceC2330f;
            this.teal = new Ye.c(interfaceC2330f);
            return;
        }
        D(0);
        throw null;
    }

    public static /* synthetic */ void D(int i4) {
        String str;
        int i5;
        if (i4 != 1 && i4 != 2) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 1 && i4 != 2) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "newOwner";
            }
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        }
        if (i4 != 1) {
            if (i4 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
            } else {
                objArr[1] = "getContainingDeclaration";
            }
        } else {
            objArr[1] = "getValue";
        }
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = Constants.COPY_TYPE;
            }
        }
        String format = String.format(str, objArr);
        if (i4 == 1 || i4 == 2) {
            throw new IllegalStateException(format);
        }
    }

    public static /* synthetic */ void E(int i4) {
        String str;
        int i5;
        if (i4 != 7 && i4 != 8) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 7 && i4 != 8) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i4 != 7) {
            if (i4 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
            } else {
                objArr[1] = "getContainingDeclaration";
            }
        } else {
            objArr[1] = "getValue";
        }
        switch (i4) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = Constants.COPY_TYPE;
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 7 || i4 == 8) {
            throw new IllegalStateException(format);
        }
    }

    public static /* synthetic */ void Y(int i4) {
        String str;
        int i5;
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i5 = 2;
                break;
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i4) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i4) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public final Ye.d Z() {
        switch (this.red) {
            case 0:
                Ye.c cVar = (Ye.c) this.teal;
                if (cVar != null) {
                    return cVar;
                }
                D(1);
                throw null;
            default:
                G3.a aVar = (G3.a) this.teal;
                if (aVar != null) {
                    return aVar;
                }
                E(7);
                throw null;
        }
    }

    @Override // pe.InterfaceC2326b
    public final C2871u a() {
        return null;
    }

    @Override // pe.ap
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final C2871u delta(ax axVar) {
        kotlin.reflect.jvm.internal.impl.types.y india;
        if (axVar != null) {
            if (!axVar.alpha.echo()) {
                if (lima() instanceof InterfaceC2330f) {
                    india = axVar.india(3, getType());
                } else {
                    india = axVar.india(1, getType());
                }
                if (india == null) {
                    return null;
                }
                if (india != getType()) {
                    return new C2871u(lima(), new G3.a(india), getAnnotations());
                }
            }
            return this;
        }
        Y(3);
        throw null;
    }

    @Override // se.AbstractC2863m, pe.InterfaceC2335k, pe.InterfaceC2332h
    public final InterfaceC2326b alpha() {
        return this;
    }

    @Override // pe.InterfaceC2326b
    public final boolean blue() {
        return false;
    }

    @Override // pe.InterfaceC2336l
    public final pe.an echo() {
        return pe.an.magenta;
    }

    @Override // pe.InterfaceC2326b
    public final C2871u g() {
        return null;
    }

    @Override // pe.InterfaceC2326b
    public final kotlin.reflect.jvm.internal.impl.types.y getReturnType() {
        return getType();
    }

    @Override // G3.a, Ye.d
    public final kotlin.reflect.jvm.internal.impl.types.y getType() {
        kotlin.reflect.jvm.internal.impl.types.y type = Z().getType();
        if (type != null) {
            return type;
        }
        Y(6);
        throw null;
    }

    @Override // pe.InterfaceC2326b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        Y(5);
        throw null;
    }

    @Override // pe.InterfaceC2338n, pe.InterfaceC2348x
    public final C2339o getVisibility() {
        C2339o c2339o = AbstractC2340p.foxtrot;
        if (c2339o != null) {
            return c2339o;
        }
        Y(9);
        throw null;
    }

    @Override // pe.InterfaceC2335k
    public final InterfaceC2335k lima() {
        switch (this.red) {
            case 0:
                InterfaceC2330f interfaceC2330f = (InterfaceC2330f) this.silver;
                if (interfaceC2330f != null) {
                    return interfaceC2330f;
                }
                D(2);
                throw null;
            default:
                InterfaceC2335k interfaceC2335k = this.silver;
                if (interfaceC2335k != null) {
                    return interfaceC2335k;
                }
                E(8);
                throw null;
        }
    }

    @Override // pe.InterfaceC2326b
    public final Collection mike() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        Y(8);
        throw null;
    }

    @Override // pe.InterfaceC2326b
    public final List peach() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        Y(7);
        throw null;
    }

    @Override // pe.InterfaceC2335k
    public final Object quebec(InterfaceC2337m interfaceC2337m, Object obj) {
        return interfaceC2337m.kilo(this, obj);
    }

    @Override // se.AbstractC2863m
    public String toString() {
        switch (this.red) {
            case 0:
                return "class " + ((InterfaceC2330f) this.silver).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // se.AbstractC2863m, pe.InterfaceC2335k, pe.InterfaceC2332h
    public final InterfaceC2335k alpha() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2871u(InterfaceC2335k interfaceC2335k, G3.a aVar, InterfaceC2472h interfaceC2472h) {
        this(interfaceC2335k, aVar, interfaceC2472h, Ne.h.delta);
        if (interfaceC2335k == null) {
            E(0);
            throw null;
        }
        if (interfaceC2472h != null) {
        } else {
            E(2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2871u(InterfaceC2335k interfaceC2335k, G3.a aVar, InterfaceC2472h interfaceC2472h, Ne.f fVar) {
        super(interfaceC2472h, fVar);
        if (interfaceC2335k == null) {
            E(3);
            throw null;
        }
        if (interfaceC2472h == null) {
            E(5);
            throw null;
        }
        if (fVar != null) {
            this.silver = interfaceC2335k;
            this.teal = aVar;
            return;
        }
        E(6);
        throw null;
    }
}
