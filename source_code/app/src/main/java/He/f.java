package He;

/* loaded from: classes2.dex */
public final class f extends c {
    public final /* synthetic */ int bravo;
    public final /* synthetic */ e charlie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(e eVar, int i4) {
        super(0);
        this.bravo = i4;
        this.charlie = eVar;
    }

    @Override // He.c
    public final void hotel(String[] strArr) {
        switch (this.bravo) {
            case 0:
                if (strArr != null) {
                    this.charlie.purple.delta = strArr;
                    return;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
            default:
                if (strArr != null) {
                    this.charlie.purple.echo = strArr;
                    return;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
        }
    }
}
