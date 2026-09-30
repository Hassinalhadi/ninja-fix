package bz;

import androidx.navigation.fragment.FragmentNavigator;
import com.app.network.network.models.AddressNoteListItem;
import com.checkout.components.card.ui.component.cardnumber.InfoBottomSheetViewKt;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.kmp.rememberme.data.remote.HttpClientFactory;
import com.checkout.components.kmp.rememberme.shared.model.ClickTarget;
import com.checkout.components.rememberme.di.RememberMeModule;
import com.checkout.components.ui.country.CountryListItemViewKt;
import com.checkout.components.ui.country.CountryPickerContentViewKt;
import com.clevertap.android.sdk.InAppFCManager;
import com.clevertap.android.sdk.inapp.SharedPreferencesMigration;
import com.clevertap.android.sdk.inapp.evaluation.EvaluationManager;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.images.preload.FilePreloaderCoroutine;
import com.clevertap.android.sdk.inapp.images.preload.FilePreloaderExecutors;
import com.clevertap.android.sdk.inapp.images.preload.FilePreloaderStrategy;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od.C2229f;
import org.json.JSONObject;
import pd.C2303a;

/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Function1 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ h0(int i4) {
        this.alpha = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit CountryListItemView_0S3VyRs$lambda$6$lambda$5;
        boolean _init_$lambda$0;
        switch (this.alpha) {
            case 0:
                return new Q0.k((4294967295L & Math.round(r9.bravo)) | (Math.round(((C0790o) obj).alpha) << 32));
            case 1:
                long j5 = ((Q0.m) obj).alpha;
                return new C0790o((int) (j5 >> 32), (int) (4294967295L & j5));
            case 2:
                C0790o c0790o = (C0790o) obj;
                int round = Math.round(c0790o.alpha);
                int i4 = 0;
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(c0790o.bravo);
                if (round2 >= 0) {
                    i4 = round2;
                }
                return new Q0.m((4294967295L & i4) | (round << 32));
            case 3:
                Z.c cVar = (Z.c) obj;
                return new C0792q(cVar.alpha, cVar.bravo, cVar.charlie, cVar.delta);
            case 4:
                C0792q c0792q = (C0792q) obj;
                return new Z.c(c0792q.alpha, c0792q.bravo, c0792q.charlie, c0792q.delta);
            case 5:
                return Float.valueOf(((C0789n) obj).alpha);
            case 6:
                Pair it = (Pair) obj;
                Intrinsics.echo(it, "it");
                return (String) it.getFirst();
            case 7:
                T1.c initializer = (T1.c) obj;
                Intrinsics.echo(initializer, "$this$initializer");
                return new FragmentNavigator.ClearEntryStateViewModel();
            case 8:
                return RememberMeModule.alpha((ClickTarget) obj);
            case 9:
                AddressNoteListItem it2 = (AddressNoteListItem) obj;
                Intrinsics.echo(it2, "it");
                return Integer.valueOf(it2.getId());
            case 10:
                cd.c install = (cd.c) obj;
                Intrinsics.echo(install, "$this$install");
                rg.b bVar = hd.k.alpha;
                int i5 = 3;
                Nd.c cVar2 = null;
                install.silver.golf(C2229f.juliet, new F2.m(i5, 4, cVar2));
                hd.j jVar = new hd.j(install, null);
                C2303a c2303a = install.teal;
                Af.t tVar = C2303a.kilo;
                c2303a.golf(tVar, jVar);
                c2303a.golf(tVar, new F2.m(i5, 5, cVar2));
                return Unit.INSTANCE;
            case 11:
                Intrinsics.echo(obj, "<this>");
                return Unit.INSTANCE;
            case 12:
                return InfoBottomSheetViewKt.delta((A0.ad) obj);
            case 13:
                return InfoBottomSheetViewKt.charlie((A0.ad) obj);
            case 14:
                return HttpClientFactory.alpha((Of.i) obj);
            case 15:
                return HttpClientFactory.bravo((jd.b) obj);
            case 16:
                return HttpClientFactory.charlie((kd.i) obj);
            case 17:
                CountryListItemView_0S3VyRs$lambda$6$lambda$5 = CountryListItemViewKt.CountryListItemView_0S3VyRs$lambda$6$lambda$5((A0.ad) obj);
                return CountryListItemView_0S3VyRs$lambda$6$lambda$5;
            case 18:
                return CountryPickerContentViewKt.alpha((Country) obj);
            case 19:
                return InAppFCManager.bravo((String) obj);
            case 20:
                _init_$lambda$0 = SharedPreferencesMigration._init_$lambda$0(obj);
                return Boolean.valueOf(_init_$lambda$0);
            case 21:
                return EvaluationManager.delta((String) obj);
            case 22:
                return Integer.valueOf(EvaluationManager.alpha((JSONObject) obj));
            case 23:
                return EvaluationManager.bravo((JSONObject) obj);
            case 24:
                return FileResourceProvider.alpha((DownloadedBitmap) obj);
            case 25:
                return FilePreloaderCoroutine.charlie((Pair) obj);
            case 26:
                return FilePreloaderCoroutine.bravo((Pair) obj);
            case 27:
                return FilePreloaderCoroutine.delta((Map) obj);
            case 28:
                return FilePreloaderExecutors.echo((Pair) obj);
            default:
                return FilePreloaderStrategy.DefaultImpls.charlie((Pair) obj);
        }
    }
}
