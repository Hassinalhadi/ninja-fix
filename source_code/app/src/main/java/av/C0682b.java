package av;

import android.util.Size;
import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.Z;
import java.util.ArrayList;

/* renamed from: av.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0682b {
    public final String alpha;
    public final Class bravo;
    public final P charlie;
    public final Z delta;
    public final Size echo;
    public final C0509g foxtrot;
    public final ArrayList golf;

    public C0682b(String str, Class cls, P p4, Z z2, Size size, C0509g c0509g, ArrayList arrayList) {
        if (str != null) {
            this.alpha = str;
            this.bravo = cls;
            if (p4 != null) {
                this.charlie = p4;
                if (z2 != null) {
                    this.delta = z2;
                    this.echo = size;
                    this.foxtrot = c0509g;
                    this.golf = arrayList;
                    return;
                }
                throw new NullPointerException("Null useCaseConfig");
            }
            throw new NullPointerException("Null sessionConfig");
        }
        throw new NullPointerException("Null useCaseId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0682b) {
                C0682b c0682b = (C0682b) obj;
                if (this.alpha.equals(c0682b.alpha) && this.bravo.equals(c0682b.bravo) && this.charlie.equals(c0682b.charlie) && this.delta.equals(c0682b.delta)) {
                    Size size = c0682b.echo;
                    Size size2 = this.echo;
                    if (size2 == null) {
                        if (size != null) {
                            return false;
                        }
                    } else if (!size2.equals(size)) {
                        return false;
                    }
                    C0509g c0509g = c0682b.foxtrot;
                    C0509g c0509g2 = this.foxtrot;
                    if (c0509g2 == null) {
                        if (c0509g != null) {
                            return false;
                        }
                    } else if (!c0509g2.equals(c0509g)) {
                        return false;
                    }
                    ArrayList arrayList = c0682b.golf;
                    ArrayList arrayList2 = this.golf;
                    if (arrayList2 == null) {
                        if (arrayList == null) {
                            return true;
                        }
                        return false;
                    }
                    if (arrayList2.equals(arrayList)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (((((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003) ^ this.charlie.hashCode()) * 1000003) ^ this.delta.hashCode()) * 1000003;
        int i4 = 0;
        Size size = this.echo;
        if (size == null) {
            hashCode = 0;
        } else {
            hashCode = size.hashCode();
        }
        int i5 = (hashCode3 ^ hashCode) * 1000003;
        C0509g c0509g = this.foxtrot;
        if (c0509g == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c0509g.hashCode();
        }
        int i10 = (i5 ^ hashCode2) * 1000003;
        ArrayList arrayList = this.golf;
        if (arrayList != null) {
            i4 = arrayList.hashCode();
        }
        return i10 ^ i4;
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.alpha + ", useCaseType=" + this.bravo + ", sessionConfig=" + this.charlie + ", useCaseConfig=" + this.delta + ", surfaceResolution=" + this.echo + ", streamSpec=" + this.foxtrot + ", captureTypes=" + this.golf + "}";
    }
}
