package Se;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.AbstractC2347w;
import pe.InterfaceC2330f;
import pe.InterfaceC2349y;

/* loaded from: classes2.dex */
public final class x extends n {
    public final /* synthetic */ int bravo = 0;

    public x(byte b2) {
        super(Byte.valueOf(b2));
    }

    @Override // Se.g
    public final y alpha(InterfaceC2349y module) {
        ae aeVar;
        ae aeVar2;
        ae aeVar3;
        ae aeVar4;
        switch (this.bravo) {
            case 0:
                Intrinsics.echo(module, "module");
                InterfaceC2330f delta = AbstractC2347w.delta(module, me.m.lavender);
                if (delta != null) {
                    aeVar = delta.oscar();
                } else {
                    aeVar = null;
                }
                if (aeVar == null) {
                    return hf.i.charlie(hf.h.f12739s, "UByte");
                }
                return aeVar;
            case 1:
                Intrinsics.echo(module, "module");
                InterfaceC2330f delta2 = AbstractC2347w.delta(module, me.m.magenta);
                if (delta2 != null) {
                    aeVar2 = delta2.oscar();
                } else {
                    aeVar2 = null;
                }
                if (aeVar2 == null) {
                    return hf.i.charlie(hf.h.f12739s, "UInt");
                }
                return aeVar2;
            case 2:
                Intrinsics.echo(module, "module");
                InterfaceC2330f delta3 = AbstractC2347w.delta(module, me.m.maroon);
                if (delta3 != null) {
                    aeVar3 = delta3.oscar();
                } else {
                    aeVar3 = null;
                }
                if (aeVar3 == null) {
                    return hf.i.charlie(hf.h.f12739s, "ULong");
                }
                return aeVar3;
            default:
                Intrinsics.echo(module, "module");
                InterfaceC2330f delta4 = AbstractC2347w.delta(module, me.m.lime);
                if (delta4 != null) {
                    aeVar4 = delta4.oscar();
                } else {
                    aeVar4 = null;
                }
                if (aeVar4 == null) {
                    return hf.i.charlie(hf.h.f12739s, "UShort");
                }
                return aeVar4;
        }
    }

    @Override // Se.g
    public final String toString() {
        switch (this.bravo) {
            case 0:
                return ((Number) this.alpha).intValue() + ".toUByte()";
            case 1:
                return ((Number) this.alpha).intValue() + ".toUInt()";
            case 2:
                return ((Number) this.alpha).longValue() + ".toULong()";
            default:
                return ((Number) this.alpha).intValue() + ".toUShort()";
        }
    }

    public x(short s3) {
        super(Short.valueOf(s3));
    }

    public x(int i4) {
        super(Integer.valueOf(i4));
    }

    public x(long j5) {
        super(Long.valueOf(j5));
    }
}
