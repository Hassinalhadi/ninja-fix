package Uf;

import B2.q;
import Tf.ah;
import Tf.ao;
import Tf.ap;
import Tf.r;
import Tf.s;
import Tf.u;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends u {
    public static final ah silver;
    public final ClassLoader alpha;
    public final u purple;
    public final Lazy red;

    static {
        String str = ah.purple;
        silver = r6.u.bravo("/", false);
    }

    public h(ClassLoader classLoader) {
        u systemFileSystem = u.SYSTEM;
        Intrinsics.echo(systemFileSystem, "systemFileSystem");
        this.alpha = classLoader;
        this.purple = systemFileSystem;
        this.red = LazyKt.lazy(new q(22, this));
    }

    public static String charlie(ah ahVar) {
        ah ahVar2 = silver;
        return ahVar2.echo(ahVar, true).delta(ahVar2).alpha.romeo();
    }

    @Override // Tf.u
    public final ao appendingSink(ah file, boolean z2) {
        Intrinsics.echo(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // Tf.u
    public final void atomicMove(ah source, ah target) {
        Intrinsics.echo(source, "source");
        Intrinsics.echo(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // Tf.u
    public final ah canonicalize(ah path) {
        Intrinsics.echo(path, "path");
        return silver.echo(path, true);
    }

    @Override // Tf.u
    public final void createDirectory(ah dir, boolean z2) {
        Intrinsics.echo(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // Tf.u
    public final void createSymlink(ah source, ah target) {
        Intrinsics.echo(source, "source");
        Intrinsics.echo(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // Tf.u
    public final void delete(ah path, boolean z2) {
        Intrinsics.echo(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // Tf.u
    public final List list(ah dir) {
        int collectionSizeOrDefault;
        Intrinsics.echo(dir, "dir");
        String charlie = charlie(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z2 = false;
        for (Pair pair : (List) this.red.getValue()) {
            u uVar = (u) pair.first;
            ah ahVar = (ah) pair.second;
            try {
                List list = uVar.list(ahVar.foxtrot(charlie));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (W8.a.echo((ah) obj)) {
                        arrayList.add(obj);
                    }
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(W8.a.hotel((ah) it.next(), ahVar));
                }
                CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, arrayList2);
                z2 = true;
            } catch (IOException unused) {
            }
        }
        if (z2) {
            return CollectionsKt.z(linkedHashSet);
        }
        throw new FileNotFoundException(Q0.c.november(dir, "file not found: "));
    }

    @Override // Tf.u
    public final List listOrNull(ah dir) {
        int collectionSizeOrDefault;
        Intrinsics.echo(dir, "dir");
        String charlie = charlie(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.red.getValue()).iterator();
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            u uVar = (u) pair.first;
            ah ahVar = (ah) pair.second;
            List listOrNull = uVar.listOrNull(ahVar.foxtrot(charlie));
            if (listOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listOrNull) {
                    if (W8.a.echo((ah) obj)) {
                        arrayList2.add(obj);
                    }
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(W8.a.hotel((ah) it2.next(), ahVar));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, arrayList);
                z2 = true;
            }
        }
        if (!z2) {
            return null;
        }
        return CollectionsKt.z(linkedHashSet);
    }

    @Override // Tf.u
    public final s metadataOrNull(ah path) {
        Intrinsics.echo(path, "path");
        if (W8.a.echo(path)) {
            String charlie = charlie(path);
            for (Pair pair : (List) this.red.getValue()) {
                s metadataOrNull = ((u) pair.first).metadataOrNull(((ah) pair.second).foxtrot(charlie));
                if (metadataOrNull != null) {
                    return metadataOrNull;
                }
            }
            return null;
        }
        return null;
    }

    @Override // Tf.u
    public final r openReadOnly(ah file) {
        Intrinsics.echo(file, "file");
        if (W8.a.echo(file)) {
            String charlie = charlie(file);
            for (Pair pair : (List) this.red.getValue()) {
                try {
                    return ((u) pair.first).openReadOnly(((ah) pair.second).foxtrot(charlie));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException(Q0.c.november(file, "file not found: "));
        }
        throw new FileNotFoundException(Q0.c.november(file, "file not found: "));
    }

    @Override // Tf.u
    public final r openReadWrite(ah file, boolean z2, boolean z10) {
        Intrinsics.echo(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // Tf.u
    public final ao sink(ah file, boolean z2) {
        Intrinsics.echo(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // Tf.u
    public final ap source(ah file) {
        Intrinsics.echo(file, "file");
        if (W8.a.echo(file)) {
            ah ahVar = silver;
            ahVar.getClass();
            URL resource = this.alpha.getResource(f.bravo(ahVar, file, false).delta(ahVar).alpha.romeo());
            if (resource != null) {
                URLConnection openConnection = resource.openConnection();
                if (openConnection instanceof JarURLConnection) {
                    ((JarURLConnection) openConnection).setUseCaches(false);
                }
                InputStream inputStream = openConnection.getInputStream();
                Intrinsics.delta(inputStream, "getInputStream(...)");
                return Tf.b.juliet(inputStream);
            }
            throw new FileNotFoundException(Q0.c.november(file, "file not found: "));
        }
        throw new FileNotFoundException(Q0.c.november(file, "file not found: "));
    }
}
