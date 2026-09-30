package sa;

import Pd.i;
import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.models.AttendanceRegistryRequest;
import com.app.network.network.models.AttendanceResponse;
import delivery.samurai.android.ui.attendanceRegistry.AttendanceRegistryViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class d extends i implements l {
    public final /* synthetic */ AttendanceRegistryViewModel alpha;
    public final /* synthetic */ AttendanceRegistryRequest purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AttendanceRegistryViewModel attendanceRegistryViewModel, AttendanceRegistryRequest attendanceRegistryRequest, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = attendanceRegistryViewModel;
        this.purple = attendanceRegistryRequest;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new d(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AttendanceRegistryViewModel attendanceRegistryViewModel = this.alpha;
        Single<AttendanceResponse> echo = attendanceRegistryViewModel.bravo.echo(this.purple);
        az azVar = this.red;
        echo.subscribe(new c(0, new C2841b(attendanceRegistryViewModel, azVar)), new c(1, new C2841b(azVar, attendanceRegistryViewModel)));
        return Unit.INSTANCE;
    }
}
