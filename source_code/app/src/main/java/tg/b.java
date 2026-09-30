package tg;

import C8.aa;
import C8.w;
import C8.x;
import Dc.t;
import android.view.View;
import com.app.network.network.models.AppAgreementSignatureOwnerTypeEnum;
import com.app.network.network.models.AppAgreementTypeEnum;
import com.app.network.network.models.PlatformListResponse;
import com.app.network.network.models.Shift;
import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import delivery.samurai.android.ui.agreement.viewmodel.AgreementViewModel;
import delivery.samurai.android.ui.auth.signup.step1worksetup.StartWorkFragment;
import delivery.samurai.android.ui.shiftBookingV2.ShiftBookingListingActivityV2;
import g.C1718a;
import h6.InterfaceC1812b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import k4.C2007a;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import s1.C2576i;
import s6.AbstractC2763s0;
import vg.m;
import x9.InterfaceC3312f;
import y5.o;

/* loaded from: classes2.dex */
public final class b implements ug.a, m, ViewWithFragmentComponentBuilder, InterfaceC3312f {
    public static final /* synthetic */ int red = 0;
    public final /* synthetic */ int alpha;
    public Object purple;

    public /* synthetic */ b(int i4) {
        this.alpha = i4;
    }

    public aa alpha() {
        List unmodifiableList;
        x gold = aa.gold();
        gold.november(((Trace) this.purple).silver);
        gold.lima(((Trace) this.purple).f8303d.alpha);
        Trace trace = (Trace) this.purple;
        gold.mike(trace.f8303d.delta(trace.e));
        for (Counter counter : ((Trace) this.purple).teal.values()) {
            gold.kilo(counter.purple.get(), counter.alpha);
        }
        ArrayList arrayList = ((Trace) this.purple).f8300a;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gold.juliet(new b(2, (Trace) it.next()).alpha());
            }
        }
        Map<String, String> attributes = ((Trace) this.purple).getAttributes();
        gold.india();
        aa.whiskey((aa) gold.purple).putAll(attributes);
        Trace trace2 = (Trace) this.purple;
        synchronized (trace2.yellow) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (PerfSession perfSession : trace2.yellow) {
                    if (perfSession != null) {
                        arrayList2.add(perfSession);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        w[] delta = PerfSession.delta(unmodifiableList);
        if (delta != null) {
            List asList = Arrays.asList(delta);
            gold.india();
            aa.yankee((aa) gold.purple, asList);
        }
        return (aa) gold.golf();
    }

    @Override // x9.InterfaceC3312f
    public void black(View view, int i4, Object obj) {
        long j5;
        switch (this.alpha) {
            case 8:
                PlatformListResponse item = (PlatformListResponse) obj;
                Intrinsics.echo(item, "item");
                Intrinsics.echo(view, "view");
                ((StartWorkFragment) this.purple).victor(item);
                return;
            default:
                Shift item2 = (Shift) obj;
                Intrinsics.echo(item2, "item");
                Intrinsics.echo(view, "view");
                Long id2 = item2.getId();
                ShiftBookingListingActivityV2 shiftBookingListingActivityV2 = (ShiftBookingListingActivityV2) this.purple;
                shiftBookingListingActivityV2.f12476T = id2;
                AppAgreementTypeEnum appAgreementTypeEnum = AppAgreementTypeEnum.ON_SHIFT_JOIN;
                AppAgreementSignatureOwnerTypeEnum appAgreementSignatureOwnerTypeEnum = AppAgreementSignatureOwnerTypeEnum.SHIFT;
                Long id3 = item2.getId();
                if (id3 != null) {
                    j5 = id3.longValue();
                } else {
                    j5 = 0;
                }
                Long valueOf = Long.valueOf(j5);
                ((AgreementViewModel) shiftBookingListingActivityV2.f12468K.getValue()).alpha(appAgreementTypeEnum, appAgreementSignatureOwnerTypeEnum, valueOf).observe(shiftBookingListingActivityV2, new t(22, new C2007a(22, valueOf, shiftBookingListingActivityV2)));
                return;
        }
    }

    @Override // vg.m
    public Object bravo(Object obj) {
        Optional ofNullable;
        ofNullable = Optional.ofNullable(((m) this.purple).bravo((ResponseBody) obj));
        return ofNullable;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, dagger.hilt.android.components.ViewWithFragmentComponent] */
    @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
    public ViewWithFragmentComponent build() {
        AbstractC2763s0.bravo(View.class, (View) this.purple);
        return new Object();
    }

    public synchronized C1718a charlie() {
        return ((C2576i) this.purple).delta();
    }

    @Override // ug.a
    public void clear() {
        a aVar = (a) this.purple;
        Map map = (Map) aVar.get();
        if (map != null) {
            map.clear();
            aVar.remove();
        }
    }

    @Override // ug.a
    public void delta(Map map) {
        HashMap hashMap;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = null;
        }
        ((a) this.purple).set(hashMap);
    }

    @Override // ug.a
    public Map echo() {
        Map map = (Map) ((a) this.purple).get();
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    public void foxtrot(float f5, float f10, float f11) {
        o oVar = (o) this.purple;
        if (oVar.delta() < oVar.teal || f5 < 1.0f) {
            if (oVar.delta() <= oVar.red && f5 <= 1.0f) {
                return;
            }
            oVar.getClass();
            oVar.f14143f.postScale(f5, f5, f10, f11);
            oVar.alpha();
        }
    }

    @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
    public ViewWithFragmentComponentBuilder view(View view) {
        view.getClass();
        this.purple = view;
        return this;
    }

    public /* synthetic */ b(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    public b(InterfaceC1812b interfaceC1812b) {
        this.alpha = 6;
        V5.x.hotel(interfaceC1812b);
        this.purple = interfaceC1812b;
    }

    public b() {
        this.alpha = 0;
        new ThreadLocal();
        this.purple = new InheritableThreadLocal();
    }
}
