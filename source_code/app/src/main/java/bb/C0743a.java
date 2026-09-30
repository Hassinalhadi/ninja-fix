package bb;

import android.util.Size;
import androidx.camera.core.J;

/* renamed from: bb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0743a {
    public J alpha;
    public final J bravo = null;
    public final Size charlie;
    public final int delta;
    public final int echo;
    public final boolean foxtrot;
    public final bj.d golf;
    public final bj.d hotel;

    public C0743a(Size size, int i4, int i5, boolean z2, bj.d dVar, bj.d dVar2) {
        if (size != null) {
            this.charlie = size;
            this.delta = i4;
            this.echo = i5;
            this.foxtrot = z2;
            this.golf = dVar;
            this.hotel = dVar2;
            return;
        }
        throw new NullPointerException("Null size");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0743a) {
                C0743a c0743a = (C0743a) obj;
                if (this.charlie.equals(c0743a.charlie) && this.delta == c0743a.delta && this.echo == c0743a.echo && this.foxtrot == c0743a.foxtrot && this.golf.equals(c0743a.golf) && this.hotel.equals(c0743a.hotel)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode = (((((this.charlie.hashCode() ^ 1000003) * 1000003) ^ this.delta) * 1000003) ^ this.echo) * 1000003;
        if (this.foxtrot) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return ((((((hashCode ^ i4) * 583896283) ^ 35) * 1000003) ^ this.golf.hashCode()) * 1000003) ^ this.hotel.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.charlie + ", inputFormat=" + this.delta + ", outputFormat=" + this.echo + ", virtualCamera=" + this.foxtrot + ", imageReaderProxyProvider=null, postviewSize=null, postviewImageFormat=35, requestEdge=" + this.golf + ", errorEdge=" + this.hotel + "}";
    }
}
