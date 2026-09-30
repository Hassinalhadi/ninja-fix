package Ye;

import kotlin.reflect.jvm.internal.impl.types.y;
import pe.InterfaceC2326b;
import se.AbstractC2864n;

/* loaded from: classes2.dex */
public final class b extends G3.a {
    public final AbstractC2864n purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(InterfaceC2326b interfaceC2326b, y yVar) {
        super(yVar);
        if (yVar != null) {
            this.purple = (AbstractC2864n) interfaceC2326b;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
    }

    public final String toString() {
        return getType() + ": Ext {" + this.purple + "}";
    }
}
