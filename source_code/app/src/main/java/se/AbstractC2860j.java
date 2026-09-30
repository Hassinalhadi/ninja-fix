package se;

import pe.InterfaceC2335k;

/* renamed from: se.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2860j extends AbstractC2852b {
    public final InterfaceC2335k teal;
    public final pe.an white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2860j(ff.l lVar, InterfaceC2335k interfaceC2335k, Ne.f fVar, pe.an anVar) {
        super(lVar, fVar);
        if (lVar != null) {
            if (interfaceC2335k != null) {
                if (fVar != null) {
                    this.teal = interfaceC2335k;
                    this.white = anVar;
                    return;
                }
                victor(2);
                throw null;
            }
            victor(1);
            throw null;
        }
        victor(0);
        throw null;
    }

    public static /* synthetic */ void victor(int i4) {
        String str;
        int i5;
        if (i4 != 4 && i4 != 5) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 4 && i4 != 5) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4 && i4 != 5) {
                        objArr[0] = "storageManager";
                    } else {
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
                    }
                } else {
                    objArr[0] = "source";
                }
            } else {
                objArr[0] = "name";
            }
        } else {
            objArr[0] = "containingDeclaration";
        }
        if (i4 != 4) {
            if (i4 != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
            } else {
                objArr[1] = "getSource";
            }
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i4 != 4 && i4 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 == 4 || i4 == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // pe.InterfaceC2336l
    public final pe.an echo() {
        pe.an anVar = this.white;
        if (anVar != null) {
            return anVar;
        }
        victor(5);
        throw null;
    }

    public boolean isExternal() {
        return false;
    }

    @Override // pe.InterfaceC2335k
    public final InterfaceC2335k lima() {
        InterfaceC2335k interfaceC2335k = this.teal;
        if (interfaceC2335k != null) {
            return interfaceC2335k;
        }
        victor(4);
        throw null;
    }
}
