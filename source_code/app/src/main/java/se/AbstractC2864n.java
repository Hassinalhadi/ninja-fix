package se;

import pe.InterfaceC2335k;
import pe.InterfaceC2336l;
import qe.InterfaceC2472h;

/* renamed from: se.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2864n extends AbstractC2863m implements InterfaceC2336l {
    public final InterfaceC2335k red;
    public final pe.an silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2864n(InterfaceC2335k interfaceC2335k, InterfaceC2472h interfaceC2472h, Ne.f fVar, pe.an anVar) {
        super(interfaceC2472h, fVar);
        if (interfaceC2335k != null) {
            if (interfaceC2472h != null) {
                if (fVar != null) {
                    if (anVar != null) {
                        this.red = interfaceC2335k;
                        this.silver = anVar;
                        return;
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
        if (i4 != 4 && i4 != 5 && i4 != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 4 && i4 != 5 && i4 != 6) {
            i5 = 3;
        } else {
            i5 = 2;
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i4 != 4) {
            if (i4 != 5) {
                if (i4 != 6) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                } else {
                    objArr[1] = "getSource";
                }
            } else {
                objArr[1] = "getContainingDeclaration";
            }
        } else {
            objArr[1] = "getOriginal";
        }
        if (i4 != 4 && i4 != 5 && i4 != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 == 4 || i4 == 5 || i4 == 6) {
            throw new IllegalStateException(format);
        }
    }

    @Override // se.AbstractC2863m, pe.InterfaceC2335k, pe.InterfaceC2332h
    /* renamed from: Y */
    public InterfaceC2336l alpha() {
        return this;
    }

    public pe.an echo() {
        pe.an anVar = this.silver;
        if (anVar != null) {
            return anVar;
        }
        D(6);
        throw null;
    }

    public InterfaceC2335k lima() {
        InterfaceC2335k interfaceC2335k = this.red;
        if (interfaceC2335k != null) {
            return interfaceC2335k;
        }
        D(5);
        throw null;
    }
}
