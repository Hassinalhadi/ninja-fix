package androidx.work.impl;

import J2.c;
import J2.i;
import J2.n;
import J2.r;
import android.database.Cursor;
import android.os.Looper;
import androidx.sqlite.db.framework.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import l2.e;
import l2.f;
import l2.l;
import s2.InterfaceC2594b;
import s2.InterfaceC2596d;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class WorkDatabase {
    public volatile b alpha;
    public Executor bravo;
    public InterfaceC2594b charlie;
    public boolean echo;
    public ArrayList foxtrot;
    public final Map juliet;
    public final LinkedHashMap kilo;
    public final l delta = delta();
    public final LinkedHashMap golf = new LinkedHashMap();
    public final ReentrantReadWriteLock hotel = new ReentrantReadWriteLock();
    public final ThreadLocal india = new ThreadLocal();

    public WorkDatabase() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.delta(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.juliet = synchronizedMap;
        this.kilo = new LinkedHashMap();
    }

    public static Object romeo(Class cls, InterfaceC2594b interfaceC2594b) {
        if (cls.isInstance(interfaceC2594b)) {
            return interfaceC2594b;
        }
        if (interfaceC2594b instanceof f) {
            return romeo(cls, ((f) interfaceC2594b).charlie());
        }
        return null;
    }

    public final void alpha() {
        if (this.echo || Looper.getMainLooper().getThread() != Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void bravo() {
        if (!hotel().lime().quebec() && this.india.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void charlie() {
        alpha();
        alpha();
        b lime = hotel().lime();
        this.delta.delta(lime);
        if (lime.uniform()) {
            lime.echo();
        } else {
            lime.charlie();
        }
    }

    public abstract l delta();

    public abstract InterfaceC2594b echo(e eVar);

    public abstract c foxtrot();

    public List golf(LinkedHashMap autoMigrationSpecs) {
        Intrinsics.echo(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt.emptyList();
    }

    public final InterfaceC2594b hotel() {
        InterfaceC2594b interfaceC2594b = this.charlie;
        if (interfaceC2594b != null) {
            return interfaceC2594b;
        }
        Intrinsics.lima("internalOpenHelper");
        throw null;
    }

    public Set india() {
        return u.alpha;
    }

    public Map juliet() {
        return t.alpha;
    }

    public final void kilo() {
        hotel().lime().golf();
        if (!hotel().lime().quebec()) {
            l lVar = this.delta;
            if (lVar.foxtrot.compareAndSet(false, true)) {
                Executor executor = lVar.alpha.bravo;
                if (executor != null) {
                    executor.execute(lVar.mike);
                } else {
                    Intrinsics.lima("internalQueryExecutor");
                    throw null;
                }
            }
        }
    }

    public abstract J2.e lima();

    public final Cursor mike(InterfaceC2596d interfaceC2596d) {
        alpha();
        bravo();
        return hotel().lime().beige(interfaceC2596d);
    }

    public final Object november(Callable callable) {
        charlie();
        try {
            Object call = callable.call();
            papa();
            return call;
        } finally {
            kilo();
        }
    }

    public final void oscar(Runnable runnable) {
        charlie();
        try {
            runnable.run();
            papa();
        } finally {
            kilo();
        }
    }

    public final void papa() {
        hotel().lime().blue();
    }

    public abstract i quebec();

    public abstract J2.l sierra();

    public abstract n tango();

    public abstract r uniform();

    public abstract J2.t victor();
}
