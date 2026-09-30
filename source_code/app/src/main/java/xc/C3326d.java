package xc;

import Pd.i;
import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.models.Score;
import delivery.samurai.android.ui.score.ScoreViewModel;
import io.reactivex.Single;
import java.util.List;
import k4.C2007a;
import kotlin.ResultKt;
import kotlin.Unit;
import ma.C2109a;
import vf.ab;

/* renamed from: xc.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3326d extends i implements l {
    public final /* synthetic */ ScoreViewModel alpha;
    public final /* synthetic */ az purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3326d(ScoreViewModel scoreViewModel, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = scoreViewModel;
        this.purple = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3326d(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3326d) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        ScoreViewModel scoreViewModel = this.alpha;
        Single<List<Score>> crimson = scoreViewModel.alpha.crimson();
        az azVar = this.purple;
        crimson.subscribe(new sa.c(3, new C2109a(azVar, 13)), new sa.c(4, new C2007a(18, azVar, scoreViewModel)));
        return Unit.INSTANCE;
    }
}
