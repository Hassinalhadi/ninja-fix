package Ye;

import Ne.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.InterfaceC2326b;
import pe.InterfaceC2330f;
import pe.InterfaceC2336l;
import se.AbstractC2864n;

/* loaded from: classes2.dex */
public final class a extends G3.a implements d {
    public final /* synthetic */ int purple = 1;
    public final f red;
    public final InterfaceC2336l silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(InterfaceC2326b interfaceC2326b, y receiverType, f fVar) {
        super(receiverType);
        Intrinsics.echo(receiverType, "receiverType");
        this.silver = (AbstractC2864n) interfaceC2326b;
        this.red = fVar;
    }

    public final f X() {
        switch (this.purple) {
            case 0:
                return this.red;
            default:
                return this.red;
        }
    }

    public final String toString() {
        switch (this.purple) {
            case 0:
                return getType() + ": Ctx { " + ((InterfaceC2330f) this.silver) + " }";
            default:
                return "Cxt { " + ((AbstractC2864n) this.silver) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC2330f interfaceC2330f, y receiverType, f fVar) {
        super(receiverType);
        Intrinsics.echo(receiverType, "receiverType");
        this.silver = interfaceC2330f;
        this.red = fVar;
    }
}
