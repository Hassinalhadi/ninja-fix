package se;

import pe.InterfaceC2335k;
import qe.InterfaceC2472h;

/* renamed from: se.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2853c extends AbstractC2858h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2853c(ff.l lVar, InterfaceC2335k interfaceC2335k, InterfaceC2472h interfaceC2472h, Ne.f fVar, int i4, boolean z2, int i5, pe.ao aoVar) {
        super(lVar, interfaceC2335k, interfaceC2472h, fVar, i4, z2, i5, aoVar);
        if (lVar != null) {
            if (interfaceC2335k != null) {
                if (i4 != 0) {
                    if (aoVar != null) {
                        return;
                    } else {
                        D(6);
                        throw null;
                    }
                }
                D(4);
                throw null;
            }
            D(1);
            throw null;
        }
        D(0);
        throw null;
    }

    public static /* synthetic */ void D(int i4) {
        Object[] objArr = new Object[3];
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
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // se.AbstractC2863m
    public final String toString() {
        String str;
        String str2 = "";
        if (!this.white) {
            str = "";
        } else {
            str = "reified ";
        }
        if (fuchsia() != 1) {
            str2 = com.google.android.material.datepicker.j.whiskey(fuchsia()).concat(" ");
        }
        return str + str2 + getName();
    }
}
