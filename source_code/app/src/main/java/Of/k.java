package Of;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k {
    public final boolean alpha;
    public final boolean bravo;
    public final boolean charlie;
    public final boolean delta;
    public final boolean echo;
    public final String foxtrot;
    public final String golf;
    public final boolean hotel;
    public final boolean india;
    public final a juliet;

    public k(boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, String prettyPrintIndent, String classDiscriminator, boolean z14, boolean z15, a classDiscriminatorMode) {
        Intrinsics.echo(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.echo(classDiscriminator, "classDiscriminator");
        Intrinsics.echo(classDiscriminatorMode, "classDiscriminatorMode");
        this.alpha = z2;
        this.bravo = z10;
        this.charlie = z11;
        this.delta = z12;
        this.echo = z13;
        this.foxtrot = prettyPrintIndent;
        this.golf = classDiscriminator;
        this.hotel = z14;
        this.india = z15;
        this.juliet = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.alpha + ", ignoreUnknownKeys=" + this.bravo + ", isLenient=" + this.charlie + ", allowStructuredMapKeys=" + this.delta + ", prettyPrint=false, explicitNulls=" + this.echo + ", prettyPrintIndent='" + this.foxtrot + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.golf + "', allowSpecialFloatingPointValues=" + this.hotel + ", useAlternativeNames=" + this.india + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.juliet + ')';
    }
}
