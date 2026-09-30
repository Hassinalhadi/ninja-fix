package jg;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import rf.AbstractC2521a;
import rf.b;
import t6.AbstractC3057t;

/* loaded from: classes2.dex */
public final class a {
    public final String alpha;
    public final LinkedHashSet bravo;
    public final LinkedHashMap charlie;
    public final LinkedHashSet delta;
    public final ArrayList echo;

    public a() {
        b bVar;
        byte[] bArr = new byte[16];
        AbstractC2521a.alpha.nextBytes(bArr);
        byte b2 = (byte) (bArr[6] & 15);
        bArr[6] = b2;
        bArr[6] = (byte) (b2 | 64);
        byte b4 = (byte) (bArr[8] & 63);
        bArr[8] = b4;
        bArr[8] = (byte) (b4 | 128);
        long charlie = AbstractC3057t.charlie(0, bArr);
        long charlie2 = AbstractC3057t.charlie(8, bArr);
        if (charlie == 0 && charlie2 == 0) {
            bVar = b.red;
        } else {
            bVar = new b(charlie, charlie2);
        }
        this.alpha = bVar.toString();
        this.bravo = new LinkedHashSet();
        this.charlie = new LinkedHashMap();
        this.delta = new LinkedHashSet();
        this.echo = new ArrayList();
    }

    public final void alpha(hg.b bVar) {
        String str;
        fg.a aVar = bVar.alpha;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(pg.a.alpha(aVar.bravo));
        sb2.append(':');
        lg.b bVar2 = aVar.charlie;
        if (bVar2 != null) {
            str = bVar2.alpha;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(':');
        sb2.append(aVar.alpha);
        String mapping = sb2.toString();
        Intrinsics.echo(mapping, "mapping");
        this.charlie.put(mapping, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return Intrinsics.areEqual(this.alpha, ((a) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }
}
