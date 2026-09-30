package qe;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.InterfaceC2330f;
import pe.an;

/* renamed from: qe.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2467c implements InterfaceC2466b {
    public final ae alpha;
    public final Map bravo;
    public final an charlie;

    public C2467c(ae aeVar, Map map, an anVar) {
        if (aeVar != null) {
            if (map != null) {
                this.alpha = aeVar;
                this.bravo = map;
                this.charlie = anVar;
                return;
            }
            charlie(1);
            throw null;
        }
        charlie(0);
        throw null;
    }

    public static /* synthetic */ void charlie(int i4) {
        String str;
        int i5;
        if (i4 != 3 && i4 != 4 && i4 != 5) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 3 && i4 != 4 && i4 != 5) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3 && i4 != 4 && i4 != 5) {
                    objArr[0] = "annotationType";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                }
            } else {
                objArr[0] = "source";
            }
        } else {
            objArr[0] = "valueArguments";
        }
        if (i4 != 3) {
            if (i4 != 4) {
                if (i4 != 5) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                } else {
                    objArr[1] = "getSource";
                }
            } else {
                objArr[1] = "getAllValueArguments";
            }
        } else {
            objArr[1] = "getType";
        }
        if (i4 != 3 && i4 != 4 && i4 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 == 3 || i4 == 4 || i4 == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // qe.InterfaceC2466b
    public final Ne.c alpha() {
        InterfaceC2330f delta = Ue.e.delta(this);
        if (delta != null) {
            if (hf.i.foxtrot(delta)) {
                delta = null;
            }
            if (delta != null) {
                return Ue.e.charlie(delta);
            }
        }
        return null;
    }

    @Override // qe.InterfaceC2466b
    public final Map bravo() {
        Map map = this.bravo;
        if (map != null) {
            return map;
        }
        charlie(4);
        throw null;
    }

    @Override // qe.InterfaceC2466b
    public final an echo() {
        an anVar = this.charlie;
        if (anVar != null) {
            return anVar;
        }
        charlie(5);
        throw null;
    }

    @Override // qe.InterfaceC2466b
    public final y getType() {
        ae aeVar = this.alpha;
        if (aeVar != null) {
            return aeVar;
        }
        charlie(3);
        throw null;
    }

    public final String toString() {
        return Pe.o.alpha.xray(this, null);
    }
}
