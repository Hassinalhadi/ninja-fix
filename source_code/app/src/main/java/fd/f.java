package fd;

import H0.p;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2832z6;
import vf.AbstractC3220y;
import vf.C3221z;
import vf.H;
import vf.J;
import vf.aa;
import vf.ao;
import vf.r;

/* loaded from: classes2.dex */
public abstract class f implements d, AutoCloseable {
    public static final /* synthetic */ AtomicIntegerFieldUpdater red = AtomicIntegerFieldUpdater.newUpdater(f.class, "closed");
    public final Lazy alpha;

    @NotNull
    private volatile /* synthetic */ int closed = 0;
    public final Lazy purple;

    public f() {
        final int i4 = 0;
        this.alpha = LazyKt.lazy(new Function0(this) { // from class: fd.e
            public final /* synthetic */ f purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                f fVar = this.purple;
                switch (i4) {
                    case 0:
                        ((gd.f) fVar).silver.getClass();
                        Cf.e eVar = ao.alpha;
                        return Cf.d.purple;
                    default:
                        return AbstractC2832z6.charlie(new J(null), new p(C3221z.alpha, 1)).plus((AbstractC3220y) fVar.alpha.getValue()).plus(new aa("ktor-okhttp-context"));
                }
            }
        });
        final int i5 = 1;
        this.purple = LazyKt.lazy(new Function0(this) { // from class: fd.e
            public final /* synthetic */ f purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                f fVar = this.purple;
                switch (i5) {
                    case 0:
                        ((gd.f) fVar).silver.getClass();
                        Cf.e eVar = ao.alpha;
                        return Cf.d.purple;
                    default:
                        return AbstractC2832z6.charlie(new J(null), new p(C3221z.alpha, 1)).plus((AbstractC3220y) fVar.alpha.getValue()).plus(new aa("ktor-okhttp-context"));
                }
            }
        });
    }

    @Override // fd.d
    public Set bronze() {
        return u.alpha;
    }

    @Override // vf.ab
    public Nd.h charlie() {
        return (Nd.h) this.purple.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        r rVar;
        if (red.compareAndSet(this, 0, 1)) {
            Nd.f fVar = charlie().get(H.alpha);
            if (fVar instanceof r) {
                rVar = (r) fVar;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                return;
            }
            ((J) rVar).yellow();
        }
    }
}
