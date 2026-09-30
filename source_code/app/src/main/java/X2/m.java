package X2;

import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache$Key;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m extends i {
    public final Drawable alpha;
    public final h bravo;
    public final O2.f charlie;
    public final MemoryCache$Key delta;
    public final String echo;
    public final boolean foxtrot;
    public final boolean golf;

    public m(Drawable drawable, h hVar, O2.f fVar, MemoryCache$Key memoryCache$Key, String str, boolean z2, boolean z10) {
        this.alpha = drawable;
        this.bravo = hVar;
        this.charlie = fVar;
        this.delta = memoryCache$Key;
        this.echo = str;
        this.foxtrot = z2;
        this.golf = z10;
    }

    @Override // X2.i
    public final Drawable alpha() {
        return this.alpha;
    }

    @Override // X2.i
    public final h bravo() {
        return this.bravo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (Intrinsics.areEqual(this.alpha, mVar.alpha)) {
                if (Intrinsics.areEqual(this.bravo, mVar.bravo) && this.charlie == mVar.charlie && Intrinsics.areEqual(this.delta, mVar.delta) && Intrinsics.areEqual(this.echo, mVar.echo) && this.foxtrot == mVar.foxtrot && this.golf == mVar.golf) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int hashCode = (this.charlie.hashCode() + ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31)) * 31;
        int i10 = 0;
        MemoryCache$Key memoryCache$Key = this.delta;
        if (memoryCache$Key != null) {
            i4 = memoryCache$Key.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (hashCode + i4) * 31;
        String str = this.echo;
        if (str != null) {
            i10 = str.hashCode();
        }
        int i12 = (i11 + i10) * 31;
        int i13 = 1237;
        if (this.foxtrot) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i14 = (i12 + i5) * 31;
        if (this.golf) {
            i13 = 1231;
        }
        return i14 + i13;
    }
}
