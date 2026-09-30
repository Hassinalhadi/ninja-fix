package Nf;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public final class af extends B {
    public final boolean lima;

    public af(String str, ag agVar) {
        super(str, agVar, 1);
        this.lima = true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // Nf.B
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof af) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (Intrinsics.areEqual(this.alpha, serialDescriptor.oscar())) {
                    af afVar = (af) obj;
                    if (afVar.lima && Arrays.equals((SerialDescriptor[]) this.juliet.getValue(), (SerialDescriptor[]) afVar.juliet.getValue())) {
                        int romeo = serialDescriptor.romeo();
                        int i4 = this.charlie;
                        if (i4 == romeo) {
                            for (int i5 = 0; i5 < i4; i5++) {
                                if (Intrinsics.areEqual(uniform(i5).oscar(), serialDescriptor.uniform(i5).oscar()) && Intrinsics.areEqual(uniform(i5).november(), serialDescriptor.uniform(i5).november())) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // Nf.B
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // Nf.B, kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.lima;
    }
}
