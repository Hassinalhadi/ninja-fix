package A2;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public abstract class aj {
    public final /* synthetic */ int alpha = 1;
    public Object bravo;
    public Object charlie;
    public final Object delta;

    public aj(Ke.e eVar, G6.j jVar, pe.an anVar) {
        this.bravo = eVar;
        this.charlie = jVar;
        this.delta = anVar;
    }

    public androidx.sqlite.db.framework.i alpha() {
        ((WorkDatabase) this.bravo).alpha();
        if (((AtomicBoolean) this.charlie).compareAndSet(false, true)) {
            return (androidx.sqlite.db.framework.i) ((Lazy) this.delta).getValue();
        }
        return delta();
    }

    public ak bravo() {
        boolean z2;
        String str;
        ak charlie = charlie();
        d dVar = ((J2.p) this.charlie).juliet;
        if ((Build.VERSION.SDK_INT < 24 || !dVar.alpha()) && !dVar.echo && !dVar.charlie && !dVar.delta) {
            z2 = false;
        } else {
            z2 = true;
        }
        J2.p pVar = (J2.p) this.charlie;
        if (pVar.quebec) {
            if (!z2) {
                if (pVar.golf > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            } else {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
        }
        if (pVar.xray == null) {
            List maroon = StringsKt.maroon(pVar.charlie, new String[]{"."}, 6);
            if (maroon.size() == 1) {
                str = (String) maroon.get(0);
            } else {
                str = (String) CollectionsKt.ochre(maroon);
            }
            if (str.length() > 127) {
                str = StringsKt.yellow(127, str);
            }
            pVar.xray = str;
        }
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.delta(randomUUID, "randomUUID()");
        this.bravo = randomUUID;
        String uuid = randomUUID.toString();
        Intrinsics.delta(uuid, "id.toString()");
        J2.p other = (J2.p) this.charlie;
        Intrinsics.echo(other, "other");
        this.charlie = new J2.p(uuid, other.bravo, other.charlie, other.delta, new j(other.echo), new j(other.foxtrot), other.golf, other.hotel, other.india, new d(other.juliet), other.kilo, other.lima, other.mike, other.november, other.oscar, other.papa, other.quebec, other.romeo, other.sierra, other.uniform, other.victor, other.whiskey, other.xray, 524288);
        return charlie;
    }

    public abstract ak charlie();

    public androidx.sqlite.db.framework.i delta() {
        String echo = echo();
        WorkDatabase workDatabase = (WorkDatabase) this.bravo;
        workDatabase.getClass();
        workDatabase.alpha();
        workDatabase.bravo();
        return workDatabase.hotel().lime().foxtrot(echo);
    }

    public abstract String echo();

    public abstract Ne.c foxtrot();

    public abstract String golf();

    public Object hotel(com.google.crypto.tink.shaded.protobuf.ao aoVar, Class cls) {
        t7.d dVar = (t7.d) ((Map) this.charlie).get(cls);
        if (dVar != null) {
            return dVar.alpha(aoVar);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract G3.a india();

    public abstract z7.am juliet();

    public abstract com.google.crypto.tink.shaded.protobuf.ao kilo(AbstractC1490h abstractC1490h);

    public void lima(androidx.sqlite.db.framework.i statement) {
        Intrinsics.echo(statement, "statement");
        if (statement == ((androidx.sqlite.db.framework.i) ((Lazy) this.delta).getValue())) {
            ((AtomicBoolean) this.charlie).set(false);
        }
    }

    public abstract void mike(com.google.crypto.tink.shaded.protobuf.ao aoVar);

    public String toString() {
        switch (this.alpha) {
            case 1:
                return getClass().getSimpleName() + ": " + foxtrot();
            default:
                return super.toString();
        }
    }

    public aj(WorkDatabase database) {
        Intrinsics.echo(database, "database");
        this.bravo = database;
        this.charlie = new AtomicBoolean(false);
        this.delta = LazyKt.lazy(new je.ab(11, this));
    }

    public aj(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.delta(randomUUID, "randomUUID()");
        this.bravo = randomUUID;
        String uuid = ((UUID) this.bravo).toString();
        Intrinsics.delta(uuid, "id.toString()");
        this.charlie = new J2.p(uuid, 0, cls.getName(), (String) null, (j) null, (j) null, 0L, 0L, 0L, (d) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, 16777210);
        this.delta = kotlin.collections.ab.lima(cls.getName());
    }

    public aj(Class cls, t7.d[] dVarArr) {
        this.bravo = cls;
        HashMap hashMap = new HashMap();
        for (t7.d dVar : dVarArr) {
            boolean containsKey = hashMap.containsKey(dVar.alpha);
            Class cls2 = dVar.alpha;
            if (!containsKey) {
                hashMap.put(cls2, dVar);
            } else {
                throw new IllegalArgumentException(AbstractC2327c.whiskey(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
        }
        if (dVarArr.length > 0) {
            this.delta = dVarArr[0].alpha;
        } else {
            this.delta = Void.class;
        }
        this.charlie = Collections.unmodifiableMap(hashMap);
    }
}
