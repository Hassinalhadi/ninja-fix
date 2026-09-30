package ya;

import com.app.network.network.models.City;
import com.app.network.network.models.PlatformListResponse;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.auth.signup.step1worksetup.StartWorkFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* renamed from: ya.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3409e implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Integer purple;
    public final /* synthetic */ StartWorkFragment red;

    public /* synthetic */ C3409e(Integer num, StartWorkFragment startWorkFragment, int i4) {
        this.alpha = i4;
        this.purple = num;
        this.red = startWorkFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List items;
        List items2;
        C2492a c2492a = (C2492a) obj;
        switch (this.alpha) {
            case 0:
                DataResponse dataResponse = (DataResponse) c2492a.charlie;
                City city = null;
                if (dataResponse != null && (items = dataResponse.getItems()) != null) {
                    Iterator it = items.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (Intrinsics.areEqual(((City) next).getId(), this.purple)) {
                                city = next;
                            }
                        }
                    }
                    city = city;
                }
                if (city != null) {
                    this.red.tango(city);
                }
                return Unit.INSTANCE;
            case 1:
                List list = (List) c2492a.charlie;
                PlatformListResponse platformListResponse = null;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (Intrinsics.areEqual(((PlatformListResponse) next2).getId(), this.purple)) {
                                platformListResponse = next2;
                            }
                        }
                    }
                    platformListResponse = platformListResponse;
                }
                if (platformListResponse != null) {
                    this.red.victor(platformListResponse);
                }
                return Unit.INSTANCE;
            default:
                DataResponse dataResponse2 = (DataResponse) c2492a.charlie;
                City city2 = null;
                if (dataResponse2 != null && (items2 = dataResponse2.getItems()) != null) {
                    Iterator it3 = items2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next3 = it3.next();
                            if (Intrinsics.areEqual(((City) next3).getId(), this.purple)) {
                                city2 = next3;
                            }
                        }
                    }
                    city2 = city2;
                }
                if (city2 != null) {
                    this.red.tango(city2);
                }
                return Unit.INSTANCE;
        }
    }
}
