package Ce;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x {
    public final kotlin.reflect.jvm.internal.impl.types.y alpha;
    public final List bravo;
    public final ArrayList charlie;
    public final List delta;

    public x(kotlin.reflect.jvm.internal.impl.types.y yVar, List valueParameters, ArrayList arrayList, List errors) {
        Intrinsics.echo(valueParameters, "valueParameters");
        Intrinsics.echo(errors, "errors");
        this.alpha = yVar;
        this.bravo = valueParameters;
        this.charlie = arrayList;
        this.delta = errors;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x) {
                x xVar = (x) obj;
                if (!Intrinsics.areEqual(this.alpha, xVar.alpha) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.bravo, xVar.bravo) || !Intrinsics.areEqual(this.charlie, xVar.charlie) || !Intrinsics.areEqual(this.delta, xVar.delta)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.delta.hashCode() + ((this.charlie.hashCode() + com.google.android.material.datepicker.j.golf(this.alpha.hashCode() * 961, 31, this.bravo)) * 961);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.alpha + ", receiverType=null, valueParameters=" + this.bravo + ", typeParameters=" + this.charlie + ", hasStableParameterNames=false, errors=" + this.delta + ')';
    }
}
