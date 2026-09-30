package Tf;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s {
    public final boolean alpha;
    public final boolean bravo;
    public final ah charlie;
    public final Long delta;
    public final Long echo;
    public final Long foxtrot;
    public final Long golf;
    public final Map hotel;

    public s(boolean z2, boolean z10, ah ahVar, Long l10, Long l11, Long l12, Long l13, Map extras) {
        Intrinsics.echo(extras, "extras");
        this.alpha = z2;
        this.bravo = z10;
        this.charlie = ahVar;
        this.delta = l10;
        this.echo = l11;
        this.foxtrot = l12;
        this.golf = l13;
        this.hotel = kotlin.collections.y.zulu(extras);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.alpha) {
            arrayList.add("isRegularFile");
        }
        if (this.bravo) {
            arrayList.add("isDirectory");
        }
        Long l10 = this.delta;
        if (l10 != null) {
            arrayList.add("byteCount=" + l10);
        }
        Long l11 = this.echo;
        if (l11 != null) {
            arrayList.add("createdAt=" + l11);
        }
        Long l12 = this.foxtrot;
        if (l12 != null) {
            arrayList.add("lastModifiedAt=" + l12);
        }
        Long l13 = this.golf;
        if (l13 != null) {
            arrayList.add("lastAccessedAt=" + l13);
        }
        Map map = this.hotel;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return CollectionsKt.maroon(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ s(boolean z2, boolean z10, ah ahVar, Long l10, Long l11, Long l12, Long l13) {
        this(z2, z10, ahVar, l10, l11, l12, l13, kotlin.collections.t.alpha);
    }
}
