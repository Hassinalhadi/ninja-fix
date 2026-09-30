package androidx.compose.runtime;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.AbstractC2360j;
import pf.InterfaceC2358h;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/ComposePausableCompositionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lbv/ar;", "", "instances", "reused", "Lbv/l;", "operations", "", "lastOperation", "", "cause", "<init>", "(Lbv/ar;Lbv/ar;Lbv/l;ILjava/lang/Throwable;)V", "Lpf/h;", "", "operationsSequence", "()Lpf/h;", "Lbv/ar;", "Lbv/l;", "I", "getMessage", "()Ljava/lang/String;", "getMessage$annotations", "()V", Constants.KEY_MESSAGE, "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposePausableCompositionException extends Exception {

    @NotNull
    private final bv.ar instances;
    private final int lastOperation;

    @NotNull
    private final bv.l operations;

    @NotNull
    private final bv.ar reused;

    public ComposePausableCompositionException(@NotNull bv.ar arVar, @NotNull bv.ar arVar2, @NotNull bv.l lVar, int i4, @Nullable Throwable th) {
        super(th);
        this.instances = arVar;
        this.reused = arVar2;
        this.operations = lVar;
        this.lastOperation = i4;
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    private final InterfaceC2358h operationsSequence() {
        return new kotlin.collections.o(new C0579k(this, null));
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        return kotlin.text.n.delta("\n            |Exception while applying pausable composition. Last 10 operations:\n            |" + CollectionsKt.maroon(CollectionsKt.s(10, AbstractC2360j.quebec(operationsSequence())), "\n", null, null, null, 62) + "\n            ");
    }
}
