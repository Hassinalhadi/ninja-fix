package Xa;

import Af.n;
import Xd.l;
import androidx.lifecycle.T;
import ao.ad;
import com.app.network.network.models.Country;
import delivery.samurai.android.ui.splash.AuthViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import vf.ab;
import vf.ao;

/* loaded from: classes2.dex */
public final class e extends Pd.i implements l {
    public final /* synthetic */ String alpha;
    public final /* synthetic */ g purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, g gVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = str;
        this.purple = gVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new e(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        String str2 = this.alpha;
        if (str2 != null) {
            str = str2.toLowerCase(Locale.ROOT);
            Intrinsics.delta(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        Regex regex = new Regex(ad.gray("(", str, ")"));
        g gVar = this.purple;
        List list = gVar.B;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                Country country = (Country) obj2;
                String demonym = country.getDemonym();
                if (demonym != null) {
                    String lowerCase = demonym.toLowerCase(Locale.ROOT);
                    Intrinsics.delta(lowerCase, "toLowerCase(...)");
                    if (regex.alpha(lowerCase)) {
                        arrayList.add(obj2);
                    }
                }
                String name = country.getName();
                if (name != null) {
                    String lowerCase2 = name.toLowerCase(Locale.ROOT);
                    Intrinsics.delta(lowerCase2, "toLowerCase(...)");
                    if (regex.alpha(lowerCase2)) {
                        arrayList.add(obj2);
                    }
                }
            }
            V1.a hotel = T.hotel((AuthViewModel) gVar.f2249z.getValue());
            Cf.e eVar = ao.alpha;
            vf.ad.zulu(hotel, n.alpha, null, new d(gVar, arrayList, null), 2);
            return Unit.INSTANCE;
        }
        Intrinsics.lima("allNationalities");
        throw null;
    }
}
