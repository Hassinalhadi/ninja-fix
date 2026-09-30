package Me;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends Ke.a {
    public static final f golf;
    public static final f hotel;
    public final boolean foxtrot;

    static {
        f fVar;
        f fVar2 = new f(new int[]{1, 8, 0}, false);
        golf = fVar2;
        int i4 = fVar2.charlie;
        int i5 = fVar2.bravo;
        if (i5 == 1 && i4 == 9) {
            fVar = new f(new int[]{2, 0, 0}, false);
        } else {
            fVar = new f(new int[]{i5, i4 + 1, 0}, false);
        }
        hotel = fVar;
        new f(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int[] versionArray, boolean z2) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        Intrinsics.echo(versionArray, "versionArray");
        this.foxtrot = z2;
    }

    public final boolean bravo(f metadataVersionFromLanguageVersion) {
        Intrinsics.echo(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        f fVar = golf;
        int i4 = this.bravo;
        int i5 = this.charlie;
        if (i4 == 2 && i5 == 0 && fVar.bravo == 1 && fVar.charlie == 8) {
            return true;
        }
        if (!this.foxtrot) {
            fVar = hotel;
        }
        fVar.getClass();
        int i10 = metadataVersionFromLanguageVersion.bravo;
        int i11 = fVar.bravo;
        if (i11 > i10 || (i11 >= i10 && fVar.charlie > metadataVersionFromLanguageVersion.charlie)) {
            metadataVersionFromLanguageVersion = fVar;
        }
        boolean z2 = false;
        if ((i4 == 1 && i5 == 0) || i4 == 0) {
            return false;
        }
        int i12 = metadataVersionFromLanguageVersion.bravo;
        if (i4 > i12 || (i4 >= i12 && i5 > metadataVersionFromLanguageVersion.charlie)) {
            z2 = true;
        }
        return !z2;
    }
}
