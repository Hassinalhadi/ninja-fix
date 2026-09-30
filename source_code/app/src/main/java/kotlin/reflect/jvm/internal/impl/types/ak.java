package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2332h;

/* loaded from: classes2.dex */
public final class ak extends aq {
    public final /* synthetic */ int charlie;
    public final /* synthetic */ Object delta;

    public /* synthetic */ ak(int i4, Object obj) {
        this.charlie = i4;
        this.delta = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public boolean alpha() {
        switch (this.charlie) {
            case 1:
                return false;
            default:
                return super.alpha();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public boolean echo() {
        switch (this.charlie) {
            case 1:
                return ((Map) this.delta).isEmpty();
            default:
                return super.echo();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.aq
    public final as golf(ap key) {
        switch (this.charlie) {
            case 0:
                Intrinsics.echo(key, "key");
                if (((ArrayList) this.delta).contains(key)) {
                    InterfaceC2332h kilo = key.kilo();
                    Intrinsics.charlie(kilo, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                    return az.kilo((pe.aq) kilo);
                }
                return null;
            default:
                Intrinsics.echo(key, "key");
                return (as) ((Map) this.delta).get(key);
        }
    }
}
