package delivery.samurai.android.ui.attendanceRegistry;

import B9.AbstractC0038f;
import B9.ab;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import com.app.network.network.models.AttendanceRegistryRequest;
import com.app.network.network.models.PlatformAreaAttendanceChannelEnum;
import com.clevertap.android.sdk.inapp.fragment.a;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import n.Y;
import pc.C2301b;
import qa.j;
import qe.C2474j;
import r3.C2492a;
import sa.d;
import sa.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/attendanceRegistry/AttendanceRegistryFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class AttendanceRegistryFragment extends f {
    public final ab e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12163f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC0038f f12164g;

    public AttendanceRegistryFragment() {
        Lazy alpha = LazyKt.alpha(i.purple, new C2474j(5, new C2474j(4, this)));
        this.e = new ab(u.alpha.bravo(AttendanceRegistryViewModel.class), new ga.ab(alpha, 22), new j(2, this, alpha), new ga.ab(alpha, 23));
        this.f12163f = 100;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // androidx.fragment.app.ai
    public final void onActivityResult(int i4, int i5, Intent intent) {
        String str;
        super.onActivityResult(i4, i5, intent);
        if (i4 == 100 && i5 == -1) {
            if (intent != null) {
                str = intent.getStringExtra("SCAN_RESULT");
            } else {
                str = null;
            }
            AttendanceRegistryRequest attendanceRegistryRequest = new AttendanceRegistryRequest(String.valueOf(str), PlatformAreaAttendanceChannelEnum.QR_CODE);
            AttendanceRegistryViewModel attendanceRegistryViewModel = (AttendanceRegistryViewModel) this.e.getValue();
            ?? auVar = new au(new C2492a(2, "loading"));
            BaseViewModel.launchApi$default(attendanceRegistryViewModel, null, new d(attendanceRegistryViewModel, attendanceRegistryRequest, auVar, null), 1, null);
            auVar.observe(this, new C2301b(3, new Y(13, this)));
        }
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        int i4 = AbstractC0038f.f453g;
        AbstractC0038f abstractC0038f = (AbstractC0038f) z1.d.charlie(inflater, R.layout.activity_attendance_registry, viewGroup, false);
        Intrinsics.delta(abstractC0038f, "inflate(...)");
        this.f12164g = abstractC0038f;
        return abstractC0038f.red;
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        AbstractC0038f abstractC0038f = this.f12164g;
        if (abstractC0038f != null) {
            abstractC0038f.f454f.setOnClickListener(new a(15, this));
        } else {
            Intrinsics.lima("binding");
            throw null;
        }
    }

    @Override // d3.n
    public final void oscar() {
    }
}
