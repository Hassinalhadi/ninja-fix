package s0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class K extends Lambda implements Function0 {
    public final /* synthetic */ L alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f13243c;
    public final /* synthetic */ T.r purple;
    public final /* synthetic */ C2545e red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ C2561v teal;
    public final /* synthetic */ int white;
    public final /* synthetic */ boolean yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l10, T.r rVar, C2545e c2545e, long j5, C2561v c2561v, int i4, boolean z2, float f5) {
        super(0);
        this.alpha = l10;
        this.purple = rVar;
        this.red = c2545e;
        this.silver = j5;
        this.teal = c2561v;
        this.white = i4;
        this.yellow = z2;
        this.f13243c = f5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        T.r charlie = AbstractC2557q.charlie(this.purple, this.red.bravo());
        this.alpha.N(charlie, this.red, this.silver, this.teal, this.white, this.yellow, this.f13243c, false);
        return Unit.INSTANCE;
    }
}
