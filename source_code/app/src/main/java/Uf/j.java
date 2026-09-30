package Uf;

import Tf.ah;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j {
    public final ah alpha;
    public final boolean bravo;
    public final String charlie;
    public final long delta;
    public final long echo;
    public final long foxtrot;
    public final int golf;
    public final long hotel;
    public final int india;
    public final int juliet;
    public final Long kilo;
    public final Long lima;
    public final Long mike;
    public final Integer november;
    public final Integer oscar;
    public final Integer papa;
    public final ArrayList quebec;

    public j(ah canonicalPath, boolean z2, String comment, long j5, long j6, long j7, int i4, long j10, int i5, int i10, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        Intrinsics.echo(canonicalPath, "canonicalPath");
        Intrinsics.echo(comment, "comment");
        this.alpha = canonicalPath;
        this.bravo = z2;
        this.charlie = comment;
        this.delta = j5;
        this.echo = j6;
        this.foxtrot = j7;
        this.golf = i4;
        this.hotel = j10;
        this.india = i5;
        this.juliet = i10;
        this.kilo = l10;
        this.lima = l11;
        this.mike = l12;
        this.november = num;
        this.oscar = num2;
        this.papa = num3;
        this.quebec = new ArrayList();
    }

    public /* synthetic */ j(ah ahVar, boolean z2, String str, long j5, long j6, long j7, int i4, long j10, int i5, int i10, Long l10, Long l11, Long l12, int i11) {
        this(ahVar, z2, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? -1L : j5, (i11 & 16) != 0 ? -1L : j6, (i11 & 32) != 0 ? -1L : j7, (i11 & 64) != 0 ? -1 : i4, (i11 & 128) != 0 ? -1L : j10, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? -1 : i5, (i11 & 512) != 0 ? -1 : i10, (i11 & Barcode.FORMAT_UPC_E) != 0 ? null : l10, (i11 & 2048) != 0 ? null : l11, (i11 & 4096) != 0 ? null : l12, null, null, null);
    }
}
