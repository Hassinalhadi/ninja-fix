package Tf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2689j6;

/* loaded from: classes3.dex */
public final class at extends u {
    public static final ah silver;
    public final ah alpha;
    public final u purple;
    public final LinkedHashMap red;

    static {
        String str = ah.purple;
        silver = r6.u.bravo("/", false);
    }

    public at(ah ahVar, u uVar, LinkedHashMap linkedHashMap) {
        this.alpha = ahVar;
        this.purple = uVar;
        this.red = linkedHashMap;
    }

    @Override // Tf.u
    public final ao appendingSink(ah file, boolean z2) {
        Intrinsics.echo(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // Tf.u
    public final void atomicMove(ah source, ah target) {
        Intrinsics.echo(source, "source");
        Intrinsics.echo(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // Tf.u
    public final ah canonicalize(ah path) {
        Intrinsics.echo(path, "path");
        ah ahVar = silver;
        ahVar.getClass();
        ah bravo = Uf.f.bravo(ahVar, path, true);
        if (this.red.containsKey(bravo)) {
            return bravo;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    public final List charlie(ah ahVar, boolean z2) {
        Uf.j jVar = (Uf.j) this.red.get(silver.echo(ahVar, true));
        if (jVar == null) {
            if (!z2) {
                return null;
            }
            throw new IOException(Q0.c.november(ahVar, "not a directory: "));
        }
        return CollectionsKt.z(jVar.quebec);
    }

    @Override // Tf.u
    public final void createDirectory(ah dir, boolean z2) {
        Intrinsics.echo(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // Tf.u
    public final void createSymlink(ah source, ah target) {
        Intrinsics.echo(source, "source");
        Intrinsics.echo(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // Tf.u
    public final void delete(ah path, boolean z2) {
        Intrinsics.echo(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // Tf.u
    public final List list(ah dir) {
        Intrinsics.echo(dir, "dir");
        List charlie = charlie(dir, true);
        Intrinsics.checkNotNull(charlie);
        return charlie;
    }

    @Override // Tf.u
    public final List listOrNull(ah dir) {
        Intrinsics.echo(dir, "dir");
        return charlie(dir, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    @Override // Tf.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s metadataOrNull(ah path) {
        Long valueOf;
        Long l10;
        long j5;
        Long l11;
        Long valueOf2;
        Long l12;
        Long l13;
        Long valueOf3;
        Throwable th;
        Throwable th2;
        Uf.j jVar;
        Intrinsics.echo(path, "path");
        ah ahVar = silver;
        ahVar.getClass();
        Uf.j jVar2 = (Uf.j) this.red.get(Uf.f.bravo(ahVar, path, true));
        if (jVar2 == null) {
            return null;
        }
        long j6 = jVar2.hotel;
        if (j6 != -1) {
            r openReadOnly = this.purple.openReadOnly(this.alpha);
            try {
                ak charlie = b.charlie(openReadOnly.uniform(j6));
                try {
                    jVar = Uf.m.echo(charlie, jVar2);
                    Intrinsics.checkNotNull(jVar);
                    try {
                        charlie.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        charlie.close();
                    } catch (Throwable th5) {
                        AbstractC2689j6.charlie(th4, th5);
                    }
                    th2 = th4;
                    jVar = null;
                }
            } catch (Throwable th6) {
                th = th6;
                if (openReadOnly != null) {
                    try {
                        openReadOnly.close();
                    } catch (Throwable th7) {
                        AbstractC2689j6.charlie(th, th7);
                    }
                }
                jVar2 = null;
            }
            if (th2 == null) {
                try {
                    openReadOnly.close();
                    th = null;
                } catch (Throwable th8) {
                    th = th8;
                }
                th = th;
                jVar2 = jVar;
                if (th != null) {
                    throw th;
                }
            } else {
                throw th2;
            }
        }
        boolean z2 = jVar2.bravo;
        boolean z10 = !z2;
        if (z2) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(jVar2.foxtrot);
        }
        Long l14 = jVar2.mike;
        if (l14 != null) {
            l10 = Long.valueOf((l14.longValue() / 10000) - 11644473600000L);
        } else {
            if (jVar2.papa != null) {
                l10 = Long.valueOf(r2.intValue() * 1000);
            } else {
                l10 = null;
            }
        }
        Long l15 = jVar2.kilo;
        if (l15 != null) {
            j5 = 11644473600000L;
            valueOf2 = Long.valueOf((l15.longValue() / 10000) - 11644473600000L);
        } else {
            j5 = 11644473600000L;
            if (jVar2.november != null) {
                valueOf2 = Long.valueOf(r3.intValue() * 1000);
            } else {
                int i4 = jVar2.juliet;
                if (i4 == -1 || i4 == -1) {
                    l11 = null;
                    l12 = jVar2.lima;
                    if (l12 == null) {
                        valueOf3 = Long.valueOf((l12.longValue() / 10000) - j5);
                    } else {
                        if (jVar2.oscar != null) {
                            valueOf3 = Long.valueOf(r0.intValue() * 1000);
                        } else {
                            l13 = null;
                            return new s(z10, z2, null, valueOf, l10, l11, l13);
                        }
                    }
                    l13 = valueOf3;
                    return new s(z10, z2, null, valueOf, l10, l11, l13);
                }
                int i5 = jVar2.india;
                int i10 = (i5 >> 5) & 15;
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.set(14, 0);
                gregorianCalendar.set(((i5 >> 9) & 127) + 1980, i10 - 1, i5 & 31, (i4 >> 11) & 31, (i4 >> 5) & 63, (i4 & 31) << 1);
                valueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
            }
        }
        l11 = valueOf2;
        l12 = jVar2.lima;
        if (l12 == null) {
        }
        l13 = valueOf3;
        return new s(z10, z2, null, valueOf, l10, l11, l13);
    }

    @Override // Tf.u
    public final r openReadOnly(ah file) {
        Intrinsics.echo(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // Tf.u
    public final r openReadWrite(ah file, boolean z2, boolean z10) {
        Intrinsics.echo(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // Tf.u
    public final ao sink(ah file, boolean z2) {
        Intrinsics.echo(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // Tf.u
    public final ap source(ah file) {
        Throwable th;
        ak akVar;
        Intrinsics.echo(file, "file");
        ah ahVar = silver;
        ahVar.getClass();
        Uf.j jVar = (Uf.j) this.red.get(Uf.f.bravo(ahVar, file, true));
        if (jVar != null) {
            r openReadOnly = this.purple.openReadOnly(this.alpha);
            try {
                akVar = b.charlie(openReadOnly.uniform(jVar.hotel));
                try {
                    openReadOnly.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (openReadOnly != null) {
                    try {
                        openReadOnly.close();
                    } catch (Throwable th4) {
                        AbstractC2689j6.charlie(th3, th4);
                    }
                }
                th = th3;
                akVar = null;
            }
            if (th == null) {
                Intrinsics.echo(akVar, "<this>");
                Uf.m.echo(akVar, null);
                int i4 = jVar.golf;
                long j5 = jVar.foxtrot;
                if (i4 == 0) {
                    return new Uf.g(akVar, j5, true);
                }
                return new Uf.g(new ab(b.charlie(new Uf.g(akVar, jVar.echo, true)), new Inflater(true)), j5, false);
            }
            throw th;
        }
        throw new FileNotFoundException(Q0.c.november(file, "no such file: "));
    }
}
