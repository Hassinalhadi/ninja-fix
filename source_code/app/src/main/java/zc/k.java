package zc;

import Cb.ac;
import Dc.t;
import android.location.Location;
import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import com.app.feature.location.store.LastSentLocationStore;
import com.app.network.network.models.Captain;
import com.app.network.network.models.UserInfo;
import delivery.samurai.android.ui.shiftBookingV2.ShiftBookingListingActivityV2;
import delivery.samurai.android.ui.shiftBookingV2.ShiftBookingViewModelV2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import vf.ab;

/* loaded from: classes2.dex */
public final class k extends Pd.i implements Xd.l {
    public Location alpha;
    public String purple;
    public int red;
    public final /* synthetic */ ShiftBookingListingActivityV2 silver;
    public final /* synthetic */ long teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ShiftBookingListingActivityV2 shiftBookingListingActivityV2, long j5, Nd.c cVar) {
        super(2, cVar);
        this.silver = shiftBookingListingActivityV2;
        this.teal = j5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new k(this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Location location;
        String num;
        String str;
        String str2;
        Captain captain;
        Integer id2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.red;
        ShiftBookingListingActivityV2 shiftBookingListingActivityV2 = this.silver;
        if (i4 == 0) {
            ResultKt.alpha(obj);
            LastSentLocationStore lastSentLocationStore = shiftBookingListingActivityV2.f12466I;
            if (lastSentLocationStore == null) {
                Intrinsics.lima("lastSentLocationStore");
                throw null;
            }
            location = lastSentLocationStore.get();
            UserInfo sierra = L9.d.sierra(shiftBookingListingActivityV2.lima());
            num = (sierra == null || (captain = sierra.getCaptain()) == null || (id2 = captain.getId()) == null) ? null : id2.toString();
            if (L9.d.mike(shiftBookingListingActivityV2.lima())) {
                str = null;
                int i5 = ShiftBookingListingActivityV2.f12464X;
                ShiftBookingViewModelV2 shiftBookingViewModelV2 = (ShiftBookingViewModelV2) shiftBookingListingActivityV2.f12467J.getValue();
                ?? auVar = new au(new C2492a(2, "loading"));
                BaseViewModel.launchApi$default(shiftBookingViewModelV2, null, new p(shiftBookingViewModelV2, this.teal, str, auVar, null), 1, null);
                auVar.observe(shiftBookingListingActivityV2, new t(22, new ac(shiftBookingListingActivityV2, num, location, 29)));
                return Unit.INSTANCE;
            }
            this.alpha = location;
            this.purple = num;
            this.red = 1;
            Object charlie = O9.e.charlie(this);
            if (charlie == aVar) {
                return aVar;
            }
            str2 = num;
            obj = charlie;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = this.purple;
            location = this.alpha;
            ResultKt.alpha(obj);
        }
        str = (String) obj;
        num = str2;
        int i52 = ShiftBookingListingActivityV2.f12464X;
        ShiftBookingViewModelV2 shiftBookingViewModelV22 = (ShiftBookingViewModelV2) shiftBookingListingActivityV2.f12467J.getValue();
        ?? auVar2 = new au(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(shiftBookingViewModelV22, null, new p(shiftBookingViewModelV22, this.teal, str, auVar2, null), 1, null);
        auVar2.observe(shiftBookingListingActivityV2, new t(22, new ac(shiftBookingListingActivityV2, num, location, 29)));
        return Unit.INSTANCE;
    }
}
