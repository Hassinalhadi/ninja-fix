package se;

import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import pe.InterfaceC2332h;

/* renamed from: se.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2857g extends kotlin.reflect.jvm.internal.impl.types.i {
    public final pe.ao charlie;
    public final /* synthetic */ AbstractC2858h delta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2857g(AbstractC2858h abstractC2858h, ff.o oVar, pe.ao aoVar) {
        super(oVar);
        if (oVar != null) {
            this.delta = abstractC2858h;
            this.charlie = aoVar;
            return;
        }
        november(0);
        throw null;
    }

    public static /* synthetic */ void november(int i4) {
        String str;
        int i5;
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5 && i4 != 8) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5 && i4 != 8) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = Constants.KEY_TYPE;
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            if (i4 != 8) {
                                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                            } else {
                                objArr[1] = "processSupertypesWithoutCycles";
                            }
                        } else {
                            objArr[1] = "getSupertypeLoopChecker";
                        }
                    } else {
                        objArr[1] = "getBuiltIns";
                    }
                } else {
                    objArr[1] = "getDeclarationDescriptor";
                }
            } else {
                objArr[1] = "getParameters";
            }
        } else {
            objArr[1] = "computeSupertypes";
        }
        switch (i4) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5 || i4 == 8) {
            throw new IllegalStateException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i
    public final Collection bravo() {
        List b02 = this.delta.b0();
        if (b02 != null) {
            return b02;
        }
        november(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i
    public final kotlin.reflect.jvm.internal.impl.types.y charlie() {
        return hf.i.charlie(hf.h.yellow, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i
    public final pe.ao echo() {
        pe.ao aoVar = this.charlie;
        if (aoVar != null) {
            return aoVar;
        }
        november(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        november(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i
    public final boolean golf(InterfaceC2332h interfaceC2332h) {
        if (interfaceC2332h instanceof pe.aq) {
            AbstractC2858h a6 = this.delta;
            Intrinsics.echo(a6, "a");
            if (Qe.c.alpha.delta(a6, (pe.aq) interfaceC2332h, true, Qe.b.alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i
    public final List hotel(List list) {
        if (list != null) {
            List Z4 = this.delta.Z(list);
            if (Z4 != null) {
                return Z4;
            }
            november(8);
            throw null;
        }
        november(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i
    public final void india(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        if (yVar != null) {
            this.delta.a0(yVar);
        } else {
            november(6);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final AbstractC2120h juliet() {
        AbstractC2120h echo = Ue.e.echo(this.delta);
        if (echo != null) {
            return echo;
        }
        november(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final InterfaceC2332h kilo() {
        AbstractC2858h abstractC2858h = this.delta;
        if (abstractC2858h != null) {
            return abstractC2858h;
        }
        november(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final boolean mike() {
        return true;
    }

    public final String toString() {
        return this.delta.getName().alpha;
    }
}
