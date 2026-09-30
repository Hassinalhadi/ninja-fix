package Tf;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ah implements Comparable {
    public static final String purple;
    public final n alpha;

    static {
        String separator = File.separator;
        Intrinsics.delta(separator, "separator");
        purple = separator;
    }

    public ah(n bytes) {
        Intrinsics.echo(bytes, "bytes");
        this.alpha = bytes;
    }

    public final ArrayList alpha() {
        ArrayList arrayList = new ArrayList();
        int alpha = Uf.f.alpha(this);
        n nVar = this.alpha;
        if (alpha == -1) {
            alpha = 0;
        } else if (alpha < nVar.delta() && nVar.india(alpha) == 92) {
            alpha++;
        }
        int delta = nVar.delta();
        int i4 = alpha;
        while (alpha < delta) {
            if (nVar.india(alpha) == 47 || nVar.india(alpha) == 92) {
                arrayList.add(nVar.oscar(i4, alpha));
                i4 = alpha + 1;
            }
            alpha++;
        }
        if (i4 < nVar.delta()) {
            arrayList.add(nVar.oscar(i4, nVar.delta()));
        }
        return arrayList;
    }

    public final String bravo() {
        n nVar = Uf.f.alpha;
        n nVar2 = Uf.f.alpha;
        n nVar3 = this.alpha;
        int kilo = n.kilo(nVar3, nVar2);
        if (kilo == -1) {
            kilo = n.kilo(nVar3, Uf.f.bravo);
        }
        if (kilo != -1) {
            nVar3 = n.papa(nVar3, kilo + 1, 0, 2);
        } else if (india() != null && nVar3.delta() == 2) {
            nVar3 = n.silver;
        }
        return nVar3.romeo();
    }

    public final ah charlie() {
        n nVar = Uf.f.delta;
        n nVar2 = this.alpha;
        if (!Intrinsics.areEqual(nVar2, nVar)) {
            n nVar3 = Uf.f.alpha;
            if (!Intrinsics.areEqual(nVar2, nVar3)) {
                n prefix = Uf.f.bravo;
                if (!Intrinsics.areEqual(nVar2, prefix)) {
                    n suffix = Uf.f.echo;
                    nVar2.getClass();
                    Intrinsics.echo(suffix, "suffix");
                    int delta = nVar2.delta();
                    byte[] bArr = suffix.alpha;
                    if (!nVar2.mike(delta - bArr.length, suffix, bArr.length) || (nVar2.delta() != 2 && !nVar2.mike(nVar2.delta() - 3, nVar3, 1) && !nVar2.mike(nVar2.delta() - 3, prefix, 1))) {
                        int kilo = n.kilo(nVar2, nVar3);
                        if (kilo == -1) {
                            kilo = n.kilo(nVar2, prefix);
                        }
                        if (kilo == 2 && india() != null) {
                            if (nVar2.delta() != 3) {
                                return new ah(n.papa(nVar2, 0, 3, 1));
                            }
                            return null;
                        }
                        if (kilo == 1) {
                            Intrinsics.echo(prefix, "prefix");
                            if (nVar2.mike(0, prefix, prefix.delta())) {
                                return null;
                            }
                        }
                        if (kilo == -1 && india() != null) {
                            if (nVar2.delta() != 2) {
                                return new ah(n.papa(nVar2, 0, 2, 1));
                            }
                            return null;
                        }
                        if (kilo == -1) {
                            return new ah(nVar);
                        }
                        if (kilo == 0) {
                            return new ah(n.papa(nVar2, 0, 1, 1));
                        }
                        return new ah(n.papa(nVar2, 0, kilo, 1));
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ah other = (ah) obj;
        Intrinsics.echo(other, "other");
        return this.alpha.compareTo(other.alpha);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [Tf.k, java.lang.Object] */
    public final ah delta(ah other) {
        ah ahVar;
        Intrinsics.echo(other, "other");
        int alpha = Uf.f.alpha(this);
        n nVar = this.alpha;
        ah ahVar2 = null;
        if (alpha == -1) {
            ahVar = null;
        } else {
            ahVar = new ah(nVar.oscar(0, alpha));
        }
        int alpha2 = Uf.f.alpha(other);
        n nVar2 = other.alpha;
        if (alpha2 != -1) {
            ahVar2 = new ah(nVar2.oscar(0, alpha2));
        }
        if (Intrinsics.areEqual(ahVar, ahVar2)) {
            ArrayList alpha3 = alpha();
            ArrayList alpha4 = other.alpha();
            int min = Math.min(alpha3.size(), alpha4.size());
            int i4 = 0;
            while (i4 < min && Intrinsics.areEqual(alpha3.get(i4), alpha4.get(i4))) {
                i4++;
            }
            if (i4 == min && nVar.delta() == nVar2.delta()) {
                return r6.u.bravo(".", false);
            }
            if (alpha4.subList(i4, alpha4.size()).indexOf(Uf.f.echo) == -1) {
                if (Intrinsics.areEqual(nVar2, Uf.f.delta)) {
                    return this;
                }
                ?? obj = new Object();
                n charlie = Uf.f.charlie(other);
                if (charlie == null && (charlie = Uf.f.charlie(this)) == null) {
                    charlie = Uf.f.foxtrot(purple);
                }
                int size = alpha4.size();
                for (int i5 = i4; i5 < size; i5++) {
                    obj.navy(Uf.f.echo);
                    obj.navy(charlie);
                }
                int size2 = alpha3.size();
                while (i4 < size2) {
                    obj.navy((n) alpha3.get(i4));
                    obj.navy(charlie);
                    i4++;
                }
                return Uf.f.delta(obj, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
    }

    public final ah echo(ah child, boolean z2) {
        Intrinsics.echo(child, "child");
        return Uf.f.bravo(this, child, z2);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ah) && Intrinsics.areEqual(((ah) obj).alpha, this.alpha)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Tf.k, java.lang.Object] */
    public final ah foxtrot(String child) {
        Intrinsics.echo(child, "child");
        ?? obj = new Object();
        obj.n(child);
        return Uf.f.bravo(this, Uf.f.delta(obj, false), false);
    }

    public final File golf() {
        return new File(this.alpha.romeo());
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final Path hotel() {
        Path path;
        path = Paths.get(this.alpha.romeo(), new String[0]);
        Intrinsics.delta(path, "get(...)");
        return path;
    }

    public final Character india() {
        n nVar = Uf.f.alpha;
        n nVar2 = this.alpha;
        if (n.golf(nVar2, nVar) == -1 && nVar2.delta() >= 2 && nVar2.india(1) == 58) {
            char india = (char) nVar2.india(0);
            if (('a' <= india && india < '{') || ('A' <= india && india < '[')) {
                return Character.valueOf(india);
            }
            return null;
        }
        return null;
    }

    public final String toString() {
        return this.alpha.romeo();
    }
}
