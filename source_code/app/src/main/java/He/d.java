package He;

import Aa.m;
import Ge.l;

/* loaded from: classes2.dex */
public final class d extends c {
    public final /* synthetic */ int bravo;
    public final /* synthetic */ l charlie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(l lVar, int i4) {
        super(0);
        this.bravo = i4;
        this.charlie = lVar;
    }

    @Override // He.c
    public final void hotel(String[] strArr) {
        switch (this.bravo) {
            case 0:
                if (strArr != null) {
                    ((e) this.charlie).purple.delta = strArr;
                    return;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
            case 1:
                if (strArr != null) {
                    ((e) this.charlie).purple.echo = strArr;
                    return;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
            default:
                if (strArr != null) {
                    ((g) ((m) this.charlie).purple).hotel = strArr;
                    return;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
        }
    }
}
