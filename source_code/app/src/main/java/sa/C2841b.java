package sa;

import L9.k;
import androidx.lifecycle.az;
import com.app.network.network.models.AttendanceResponse;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.ui.attendanceRegistry.AttendanceRegistryViewModel;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* renamed from: sa.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2841b implements Function1 {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ az purple;
    public final /* synthetic */ AttendanceRegistryViewModel red;

    public /* synthetic */ C2841b(az azVar, AttendanceRegistryViewModel attendanceRegistryViewModel) {
        this.purple = azVar;
        this.red = attendanceRegistryViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        az azVar = this.purple;
        AttendanceRegistryViewModel attendanceRegistryViewModel = this.red;
        switch (this.alpha) {
            case 0:
                AttendanceResponse attendanceResponse = (AttendanceResponse) obj;
                long id2 = attendanceResponse.getId();
                AtomicInteger atomicInteger = L9.d.alpha;
                AndroidApp androidApp = attendanceRegistryViewModel.alpha;
                Intrinsics.echo(androidApp, "<this>");
                k.golf(androidApp).edit().putLong("attendanceId", id2).apply();
                String attendanceDate = attendanceResponse.getExpiresAt();
                Intrinsics.echo(androidApp, "<this>");
                Intrinsics.echo(attendanceDate, "attendanceDate");
                k.golf(androidApp).edit().putString("attendanceDate", attendanceDate).apply();
                C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a.charlie = attendanceResponse;
                azVar.postValue(c2492a);
                return Unit.INSTANCE;
            default:
                Throwable th = (Throwable) obj;
                Intrinsics.checkNotNull(th);
                String onHandleError = attendanceRegistryViewModel.onHandleError(th);
                azVar.postValue(j.november(0, onHandleError, Constants.KEY_MSG, onHandleError));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C2841b(AttendanceRegistryViewModel attendanceRegistryViewModel, az azVar) {
        this.red = attendanceRegistryViewModel;
        this.purple = azVar;
    }
}
