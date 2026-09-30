package Nf;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: Nf.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0245c extends al {
    public final /* synthetic */ int bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0245c(SerialDescriptor serialDescriptor, int i4) {
        super(serialDescriptor);
        this.bravo = i4;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String oscar() {
        switch (this.bravo) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
