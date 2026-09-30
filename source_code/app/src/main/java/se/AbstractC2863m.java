package se;

import com.clevertap.android.sdk.Constants;
import pe.InterfaceC2335k;
import qe.InterfaceC2472h;

/* renamed from: se.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2863m extends G3.a implements InterfaceC2335k {
    public final Ne.f purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2863m(InterfaceC2472h interfaceC2472h, Ne.f fVar) {
        super(interfaceC2472h);
        if (interfaceC2472h != null) {
            if (fVar != null) {
                this.purple = fVar;
                return;
            } else {
                D(1);
                throw null;
            }
        }
        D(0);
        throw null;
    }

    public static /* synthetic */ void D(int i4) {
        String str;
        int i5;
        if (i4 != 2 && i4 != 3 && i4 != 5 && i4 != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 2 && i4 != 3 && i4 != 5 && i4 != 6) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                if (i4 != 5 && i4 != 6) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                } else {
                    objArr[1] = "toString";
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getName";
        }
        if (i4 != 2 && i4 != 3) {
            if (i4 != 4) {
                if (i4 != 5 && i4 != 6) {
                    objArr[2] = "<init>";
                }
            } else {
                objArr[2] = "toString";
            }
        }
        String format = String.format(str, objArr);
        if (i4 == 2 || i4 == 3 || i4 == 5 || i4 == 6) {
            throw new IllegalStateException(format);
        }
    }

    public static String X(InterfaceC2335k interfaceC2335k) {
        try {
            String str = Pe.o.charlie.whiskey(interfaceC2335k) + Constants.AES_PREFIX + interfaceC2335k.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC2335k)) + Constants.AES_SUFFIX;
            if (str != null) {
                return str;
            }
            D(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = interfaceC2335k.getClass().getSimpleName() + " " + interfaceC2335k.getName();
            if (str2 != null) {
                return str2;
            }
            D(6);
            throw null;
        }
    }

    public InterfaceC2335k alpha() {
        return this;
    }

    @Override // pe.InterfaceC2335k
    public final Ne.f getName() {
        Ne.f fVar = this.purple;
        if (fVar != null) {
            return fVar;
        }
        D(2);
        throw null;
    }

    public String toString() {
        return X(this);
    }
}
