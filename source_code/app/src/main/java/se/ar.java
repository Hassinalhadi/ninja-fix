package se;

import java.util.Collections;
import java.util.List;
import pe.InterfaceC2335k;
import pe.aw;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public abstract class ar extends AbstractC2864n implements aw {
    public kotlin.reflect.jvm.internal.impl.types.y teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(InterfaceC2335k interfaceC2335k, InterfaceC2472h interfaceC2472h, Ne.f fVar, kotlin.reflect.jvm.internal.impl.types.y yVar, pe.an anVar) {
        super(interfaceC2335k, interfaceC2472h, fVar, anVar);
        if (interfaceC2335k != null) {
            if (interfaceC2472h != null) {
                if (fVar != null) {
                    if (anVar != null) {
                        this.teal = yVar;
                        return;
                    } else {
                        D(3);
                        throw null;
                    }
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
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
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
                i5 = 2;
                break;
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i4) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public C2871u a() {
        return null;
    }

    public boolean blue() {
        return false;
    }

    public C2871u g() {
        return null;
    }

    public kotlin.reflect.jvm.internal.impl.types.y getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.y type = getType();
        if (type != null) {
            return type;
        }
        D(10);
        throw null;
    }

    @Override // G3.a, Ye.d
    public final kotlin.reflect.jvm.internal.impl.types.y getType() {
        kotlin.reflect.jvm.internal.impl.types.y yVar = this.teal;
        if (yVar != null) {
            return yVar;
        }
        D(4);
        throw null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D(8);
        throw null;
    }

    @Override // pe.InterfaceC2326b
    public final List peach() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D(6);
        throw null;
    }
}
