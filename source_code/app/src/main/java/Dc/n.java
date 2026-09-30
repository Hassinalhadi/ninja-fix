package Dc;

import android.os.Bundle;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import com.app.base.BaseViewModel;
import com.app.network.network.models.Shift;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.shiftsV2.ShiftsFragmentV2;
import delivery.samurai.android.ui.shiftsV2.ShiftsViewModelV2;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ShiftsFragmentV2 purple;

    public /* synthetic */ n(ShiftsFragmentV2 shiftsFragmentV2, int i4) {
        this.alpha = i4;
        this.purple = shiftsFragmentV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Float f5;
        String longitude;
        String latitude;
        switch (this.alpha) {
            case 0:
                C2492a c2492a = (C2492a) obj;
                int i4 = c2492a.alpha;
                ShiftsFragmentV2 shiftsFragmentV2 = this.purple;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            shiftsFragmentV2.kilo().bronze();
                        }
                    } else {
                        shiftsFragmentV2.kilo().tango();
                        Object obj2 = c2492a.charlie;
                        Collection collection = (Collection) obj2;
                        if (collection != null && !collection.isEmpty()) {
                            ax axVar = shiftsFragmentV2.f12483i;
                            List list = (List) obj2;
                            if (list == null) {
                                list = CollectionsKt.emptyList();
                            }
                            ((t0) axVar).setValue(list);
                            ((t0) shiftsFragmentV2.f12484j).setValue(Boolean.TRUE);
                        } else {
                            d3.k kilo = shiftsFragmentV2.kilo();
                            String string = shiftsFragmentV2.getString(R.string.error_something_went_wrong);
                            Intrinsics.delta(string, "getString(...)");
                            L9.d.pink(kilo, string);
                        }
                    }
                } else {
                    shiftsFragmentV2.kilo().tango();
                    d3.k kilo2 = shiftsFragmentV2.kilo();
                    String str = c2492a.bravo;
                    if (str == null) {
                        str = shiftsFragmentV2.getString(R.string.error_something_went_wrong);
                        Intrinsics.delta(str, "getString(...)");
                    }
                    L9.d.pink(kilo2, str);
                }
                return Unit.INSTANCE;
            case 1:
                long longValue = ((Long) obj).longValue();
                ShiftsFragmentV2 shiftsFragmentV22 = this.purple;
                shiftsFragmentV22.f12481g = longValue;
                ShiftsViewModelV2 romeo = shiftsFragmentV22.romeo();
                romeo.november.postValue(new C2492a(2, "loading"));
                BaseViewModel.launchApi$default(romeo, null, new z(romeo, null), 1, null);
                return Unit.INSTANCE;
            case 2:
                int intValue = ((Integer) obj).intValue();
                ShiftsFragmentV2 shiftsFragmentV23 = this.purple;
                ((t0) shiftsFragmentV23.f12484j).setValue(Boolean.FALSE);
                shiftsFragmentV23.f12482h = intValue;
                ShiftsViewModelV2 romeo2 = shiftsFragmentV23.romeo();
                long j5 = shiftsFragmentV23.f12481g;
                romeo2.oscar.postValue(new C2492a(2, "loading"));
                BaseViewModel.launchApi$default(romeo2, null, new y(romeo2, j5, intValue, null), 1, null);
                return Unit.INSTANCE;
            case 3:
                C2492a c2492a2 = (C2492a) obj;
                int i5 = c2492a2.alpha;
                ShiftsFragmentV2 shiftsFragmentV24 = this.purple;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            shiftsFragmentV24.kilo().tango();
                        } else {
                            shiftsFragmentV24.kilo().bronze();
                        }
                    } else {
                        shiftsFragmentV24.kilo().tango();
                        ((t0) shiftsFragmentV24.f12485k).setValue(Boolean.TRUE);
                    }
                } else {
                    shiftsFragmentV24.kilo().tango();
                    ax axVar2 = shiftsFragmentV24.f12486l;
                    String str2 = c2492a2.bravo;
                    if (str2 == null) {
                        str2 = shiftsFragmentV24.getString(R.string.break_time_rejected_subtitle);
                        Intrinsics.delta(str2, "getString(...)");
                    }
                    ((t0) axVar2).setValue(str2);
                }
                return Unit.INSTANCE;
            default:
                Shift shift = (Shift) obj;
                Intrinsics.echo(shift, "shift");
                boolean areEqual = Intrinsics.areEqual(shift.getAreaType(), "BRANCH");
                ShiftsFragmentV2 shiftsFragmentV25 = this.purple;
                Float f10 = null;
                if (areEqual) {
                    d3.k kilo3 = shiftsFragmentV25.kilo();
                    Shift.Branch branch = shift.getBranch();
                    if (branch != null && (latitude = branch.getLatitude()) != null) {
                        f5 = kotlin.text.r.sierra(latitude);
                    } else {
                        f5 = null;
                    }
                    Shift.Branch branch2 = shift.getBranch();
                    if (branch2 != null && (longitude = branch2.getLongitude()) != null) {
                        f10 = kotlin.text.r.sierra(longitude);
                    }
                    L9.d.bronze(kilo3, f5, f10);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("zone", new com.google.gson.l().india(shift.getZone()));
                    Y1.r alpha = B7.b.alpha(shiftsFragmentV25);
                    Y1.aa foxtrot = alpha.bravo.foxtrot();
                    if (foxtrot == null || foxtrot.purple.charlie != R.id.nav_shifts) {
                        alpha = null;
                    }
                    if (alpha != null) {
                        alpha.charlie(R.id.nav_zones, bundle, null);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
