package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import pe.InterfaceC2330f;

/* loaded from: classes2.dex */
public final class l extends AbstractC2040b {
    public final se.y charlie;
    public final List delta;
    public final Collection echo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(se.y yVar, List list, Collection collection, ff.l lVar) {
        super((ff.o) lVar);
        if (list != null) {
            if (collection != null) {
                if (lVar != null) {
                    this.charlie = yVar;
                    this.delta = Collections.unmodifiableList(new ArrayList(list));
                    this.echo = Collections.unmodifiableCollection(collection);
                    return;
                }
                november(3);
                throw null;
            }
            november(2);
            throw null;
        }
        november(1);
        throw null;
    }

    public static /* synthetic */ void november(int i4) {
        String str = (i4 == 4 || i4 == 5 || i4 == 6 || i4 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i4 == 4 || i4 == 5 || i4 == 6 || i4 == 7) ? 2 : 3];
        switch (i4) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i4 == 4) {
            objArr[1] = "getParameters";
        } else if (i4 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i4 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i4 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i4 != 4 && i4 != 5 && i4 != 6 && i4 != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 != 4 && i4 != 5 && i4 != 6 && i4 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i
    public final Collection bravo() {
        Collection collection = this.echo;
        if (collection != null) {
            return collection;
        }
        november(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i
    public final pe.ao echo() {
        return pe.ao.red;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final List getParameters() {
        List list = this.delta;
        if (list != null) {
            return list;
        }
        november(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final boolean mike() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC2040b
    /* renamed from: oscar */
    public final InterfaceC2330f kilo() {
        se.y yVar = this.charlie;
        if (yVar != null) {
            return yVar;
        }
        november(5);
        throw null;
    }

    public final String toString() {
        String str = Qe.e.golf(this.charlie).alpha;
        if (str != null) {
            return str;
        }
        Ne.e.alpha(4);
        throw null;
    }
}
