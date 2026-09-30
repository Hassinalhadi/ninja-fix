package Nd;

import Lb.C0222e;
import Xd.l;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements h, Serializable {
    public final h alpha;
    public final f purple;

    public b(f element, h left) {
        Intrinsics.echo(left, "left");
        Intrinsics.echo(element, "element");
        this.alpha = left;
        this.purple = element;
    }

    public final boolean equals(Object obj) {
        boolean z2;
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                bVar.getClass();
                int i4 = 2;
                b bVar2 = bVar;
                int i5 = 2;
                while (true) {
                    h hVar = bVar2.alpha;
                    if (hVar instanceof b) {
                        bVar2 = (b) hVar;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 == null) {
                        break;
                    }
                    i5++;
                }
                b bVar3 = this;
                while (true) {
                    h hVar2 = bVar3.alpha;
                    if (hVar2 instanceof b) {
                        bVar3 = (b) hVar2;
                    } else {
                        bVar3 = null;
                    }
                    if (bVar3 == null) {
                        break;
                    }
                    i4++;
                }
                if (i5 == i4) {
                    b bVar4 = this;
                    while (true) {
                        f fVar = bVar4.purple;
                        if (!Intrinsics.areEqual(bVar.get(fVar.getKey()), fVar)) {
                            z2 = false;
                            break;
                        }
                        h hVar3 = bVar4.alpha;
                        if (hVar3 instanceof b) {
                            bVar4 = (b) hVar3;
                        } else {
                            Intrinsics.charlie(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            f fVar2 = (f) hVar3;
                            z2 = Intrinsics.areEqual(bVar.get(fVar2.getKey()), fVar2);
                            break;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // Nd.h
    public final Object fold(Object obj, l lVar) {
        return lVar.invoke(this.alpha.fold(obj, lVar), this.purple);
    }

    @Override // Nd.h
    public final f get(g key) {
        Intrinsics.echo(key, "key");
        b bVar = this;
        while (true) {
            f fVar = bVar.purple.get(key);
            if (fVar != null) {
                return fVar;
            }
            h hVar = bVar.alpha;
            if (hVar instanceof b) {
                bVar = (b) hVar;
            } else {
                return hVar.get(key);
            }
        }
    }

    public final int hashCode() {
        return this.purple.hashCode() + this.alpha.hashCode();
    }

    @Override // Nd.h
    public final h minusKey(g key) {
        Intrinsics.echo(key, "key");
        f fVar = this.purple;
        f fVar2 = fVar.get(key);
        h hVar = this.alpha;
        if (fVar2 != null) {
            return hVar;
        }
        h minusKey = hVar.minusKey(key);
        if (minusKey == hVar) {
            return this;
        }
        if (minusKey == i.alpha) {
            return fVar;
        }
        return new b(fVar, minusKey);
    }

    @Override // Nd.h
    public final h plus(h context) {
        Intrinsics.echo(context, "context");
        if (context == i.alpha) {
            return this;
        }
        return (h) context.fold(this, new C0222e(18));
    }

    public final String toString() {
        return P0.fuchsia(new StringBuilder(Constants.AES_PREFIX), (String) fold("", new C0222e(17)), ']');
    }
}
