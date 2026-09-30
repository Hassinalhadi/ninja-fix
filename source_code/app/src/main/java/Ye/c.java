package Ye;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.InterfaceC2330f;

/* loaded from: classes2.dex */
public final class c implements d {
    public final InterfaceC2330f alpha;

    public c(InterfaceC2330f classDescriptor) {
        Intrinsics.echo(classDescriptor, "classDescriptor");
        this.alpha = classDescriptor;
    }

    public final boolean equals(Object obj) {
        c cVar;
        InterfaceC2330f interfaceC2330f = null;
        if (obj instanceof c) {
            cVar = (c) obj;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            interfaceC2330f = cVar.alpha;
        }
        return Intrinsics.areEqual(this.alpha, interfaceC2330f);
    }

    @Override // Ye.d
    public final y getType() {
        ae oscar = this.alpha.oscar();
        Intrinsics.delta(oscar, "classDescriptor.defaultType");
        return oscar;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Class{");
        ae oscar = this.alpha.oscar();
        Intrinsics.delta(oscar, "classDescriptor.defaultType");
        sb2.append(oscar);
        sb2.append('}');
        return sb2.toString();
    }
}
