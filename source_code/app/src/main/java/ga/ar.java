package ga;

import android.os.Bundle;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.app.network.network.models.trophies.Trophy;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.TrophiesListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* loaded from: classes2.dex */
public final /* synthetic */ class ar implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ TrophiesListFragment purple;

    public /* synthetic */ ar(TrophiesListFragment trophiesListFragment, int i4) {
        this.alpha = i4;
        this.purple = trophiesListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer num;
        switch (this.alpha) {
            case 0:
                C2492a c2492a = (C2492a) obj;
                if (c2492a != null) {
                    num = Integer.valueOf(c2492a.alpha);
                } else {
                    num = null;
                }
                TrophiesListFragment trophiesListFragment = this.purple;
                boolean z2 = true;
                if (num != null && num.intValue() == 2) {
                    w.o oVar = trophiesListFragment.f12112c;
                    if (oVar != null) {
                        ((SwipeRefreshLayout) oVar.red).setRefreshing(true);
                        trophiesListFragment.kilo().bronze();
                    } else {
                        Intrinsics.lima("binding");
                        throw null;
                    }
                } else if (num != null && num.intValue() == 1) {
                    trophiesListFragment.papa();
                    DataResponse dataResponse = (DataResponse) c2492a.charlie;
                    if (dataResponse != null) {
                        if (!dataResponse.getItems().isEmpty() && dataResponse.getItems().size() >= dataResponse.getPerPage()) {
                            z2 = false;
                        }
                        trophiesListFragment.f12115g = z2;
                        if (dataResponse.getPage() == 0) {
                            Hc.b bVar = trophiesListFragment.f12113d;
                            if (bVar != null) {
                                bVar.bravo(dataResponse.getItems());
                            } else {
                                Intrinsics.lima("adapter");
                                throw null;
                            }
                        } else {
                            Hc.b bVar2 = trophiesListFragment.f12113d;
                            if (bVar2 != null) {
                                bVar2.alpha(dataResponse.getItems());
                            } else {
                                Intrinsics.lima("adapter");
                                throw null;
                            }
                        }
                    }
                } else if (num != null && num.intValue() == 0) {
                    trophiesListFragment.papa();
                    trophiesListFragment.f12115g = true;
                    androidx.fragment.app.an requireActivity = trophiesListFragment.requireActivity();
                    Intrinsics.delta(requireActivity, "requireActivity(...)");
                    String str = c2492a.bravo;
                    if (str == null) {
                        str = trophiesListFragment.getString(R.string.error_something_went_wrong);
                        Intrinsics.delta(str, "getString(...)");
                    }
                    L9.d.pink(requireActivity, str);
                } else if (num != null && num.intValue() == 3) {
                    trophiesListFragment.papa();
                    trophiesListFragment.f12115g = true;
                } else {
                    trophiesListFragment.papa();
                }
                return Unit.INSTANCE;
            default:
                Trophy it = (Trophy) obj;
                Intrinsics.echo(it, "it");
                TrophiesListFragment trophiesListFragment2 = this.purple;
                androidx.appcompat.app.a supportActionBar = trophiesListFragment2.kilo().getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.tango(it.localizedTitle());
                }
                Y1.r alpha = B7.b.alpha(trophiesListFragment2);
                Bundle bundle = new Bundle();
                bundle.putParcelable("TROPHY_DETAILS", it);
                alpha.charlie(R.id.nav_trophy_milestones, bundle, null);
                return Unit.INSTANCE;
        }
    }
}
