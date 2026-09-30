package ga;

import android.content.Context;
import androidx.compose.runtime.t0;
import com.app.network.network.models.AttributeGroup;
import com.app.network.network.models.Captain;
import com.app.network.network.models.CaptainQrResponse;
import com.app.network.network.models.FintechAccount;
import com.app.network.network.models.NaqlBlockedReason;
import com.app.network.network.models.UserInfo;
import com.app.network.network.models.captian.User;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.MyAccountViewModel;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r3.C2492a;
import yf.N;

/* loaded from: classes2.dex */
public final /* synthetic */ class v implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ac purple;

    public /* synthetic */ v(ac acVar, int i4) {
        this.alpha = i4;
        this.purple = acVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0264, code lost:
    
        if (r2 == null) goto L122;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String group;
        Captain captain;
        String str;
        String str2;
        String str3;
        String email;
        String name;
        List<String> list;
        String qr;
        Object obj2;
        Object obj3;
        String str4;
        String str5;
        Object obj4 = null;
        String str6 = null;
        r4 = null;
        String str7 = null;
        String str8 = null;
        ac acVar = this.purple;
        switch (this.alpha) {
            case 0:
                String newValue = (String) obj;
                Intrinsics.echo(newValue, "newValue");
                MyAccountViewModel quebec = acVar.quebec();
                boolean z2 = acVar.f12676i;
                t0 t0Var = (t0) quebec.bravo;
                f updateState = (f) t0Var.getValue();
                Intrinsics.echo(updateState, "$this$updateState");
                String obj5 = StringsKt.b(newValue).toString();
                if (obj5 != null) {
                    if (obj5.length() <= 0) {
                        obj5 = null;
                        break;
                    }
                }
                obj5 = "-";
                t0Var.setValue(f.alpha(updateState, null, null, null, null, obj5, z2, null, null, null, false, false, 1999));
                B9.ab abVar = acVar.f12675h;
                Iterator it = ((Iterable) ((N) ((HomeViewModelV2) abVar.getValue()).juliet.alpha).getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        acVar.quebec();
                        if (MyAccountViewModel.bravo(((AttributeGroup) next).getGroup(), "STC_PAY")) {
                            obj4 = next;
                        }
                    }
                }
                AttributeGroup attributeGroup = (AttributeGroup) obj4;
                if (attributeGroup != null && (group = attributeGroup.getGroup()) != null) {
                    ((HomeViewModelV2) abVar.getValue()).alpha(group);
                }
                return Unit.INSTANCE;
            case 1:
                UserInfo userInfo = (UserInfo) obj;
                if (userInfo != null && (captain = userInfo.getCaptain()) != null) {
                    User user = captain.getUser();
                    MyAccountViewModel quebec2 = acVar.quebec();
                    String valueOf = String.valueOf(captain.getId());
                    if (user == null || (name = user.getName()) == null) {
                        str = "NA";
                    } else {
                        str = name;
                    }
                    if (user == null || (email = user.getEmail()) == null) {
                        str2 = "NA";
                    } else {
                        str2 = email;
                    }
                    Context lima = acVar.kilo().lima();
                    AtomicInteger atomicInteger = L9.d.alpha;
                    Intrinsics.echo(lima, "<this>");
                    String string = L9.d.plum(lima).getString("user_image", null);
                    if (string != null && !StringsKt.gray(string)) {
                        str3 = string;
                    } else {
                        str3 = null;
                    }
                    t0 t0Var2 = (t0) quebec2.bravo;
                    f updateState2 = (f) t0Var2.getValue();
                    Intrinsics.echo(updateState2, "$this$updateState");
                    t0Var2.setValue(f.alpha(updateState2, str3, valueOf, str, str2, null, false, null, null, null, false, false, 2032));
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 2:
                C2492a c2492a = (C2492a) obj;
                int i4 = c2492a.alpha;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            acVar.kilo().bronze();
                        }
                    } else {
                        acVar.kilo().tango();
                        NaqlBlockedReason naqlBlockedReason = (NaqlBlockedReason) c2492a.charlie;
                        if (naqlBlockedReason != null) {
                            list = naqlBlockedReason.getReasons();
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = CollectionsKt.emptyList();
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj6 : list) {
                            if (!StringsKt.gray((String) obj6)) {
                                arrayList.add(obj6);
                            }
                        }
                        String maroon = CollectionsKt.maroon(arrayList, "\n", null, null, null, 62);
                        MyAccountViewModel quebec3 = acVar.quebec();
                        if (!StringsKt.gray(maroon)) {
                            str8 = maroon;
                        }
                        quebec3.charlie(str8);
                    }
                } else {
                    acVar.kilo().tango();
                    acVar.quebec().charlie(null);
                }
                return Unit.INSTANCE;
            case 3:
                C2492a c2492a2 = (C2492a) obj;
                int i5 = c2492a2.alpha;
                if (i5 != 0) {
                    if (i5 == 1) {
                        CaptainQrResponse captainQrResponse = (CaptainQrResponse) c2492a2.charlie;
                        if (captainQrResponse != null && (qr = captainQrResponse.getQr()) != null) {
                            str7 = StringsKt.b(qr).toString();
                        }
                        acVar.f12677j = str7;
                    }
                } else {
                    acVar.f12677j = null;
                }
                return Unit.INSTANCE;
            case 4:
                C2492a c2492a3 = (C2492a) obj;
                int i10 = c2492a3.alpha;
                if (i10 != 0) {
                    if (i10 == 1) {
                        List list2 = (List) c2492a3.charlie;
                        if (list2 == null) {
                            list2 = CollectionsKt.emptyList();
                        }
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                String accountType = ((FintechAccount) obj2).getAccountType();
                                if (accountType == null || !accountType.equalsIgnoreCase("UR_PAY")) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        FintechAccount fintechAccount = (FintechAccount) obj2;
                        Iterator it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj3 = it3.next();
                                String accountType2 = ((FintechAccount) obj3).getAccountType();
                                if (accountType2 == null || !accountType2.equalsIgnoreCase("STC_PAY")) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        FintechAccount fintechAccount2 = (FintechAccount) obj3;
                        MyAccountViewModel quebec4 = acVar.quebec();
                        if (fintechAccount2 != null) {
                            str4 = fintechAccount2.getAccountId();
                        } else {
                            str4 = null;
                        }
                        String romeo = ac.romeo(str4);
                        if (fintechAccount != null) {
                            str5 = fintechAccount.getReferenceId();
                        } else {
                            str5 = null;
                        }
                        String romeo2 = ac.romeo(str5);
                        if (fintechAccount != null) {
                            str6 = fintechAccount.getAccountId();
                        }
                        String romeo3 = ac.romeo(str6);
                        boolean z10 = acVar.f12676i;
                        t0 t0Var3 = (t0) quebec4.bravo;
                        f updateState3 = (f) t0Var3.getValue();
                        Intrinsics.echo(updateState3, "$this$updateState");
                        t0Var3.setValue(f.alpha(updateState3, null, null, null, null, romeo, z10, romeo2, romeo3, null, false, false, 1807));
                    }
                } else {
                    L9.d.peach(R.string.error_something_went_wrong, acVar.kilo());
                }
                return Unit.INSTANCE;
            default:
                String it4 = (String) obj;
                Intrinsics.echo(it4, "it");
                t0 t0Var4 = (t0) acVar.quebec().bravo;
                f updateState4 = (f) t0Var4.getValue();
                Intrinsics.echo(updateState4, "$this$updateState");
                t0Var4.setValue(f.alpha(updateState4, null, null, null, null, null, false, null, null, null, false, false, 1023));
                acVar.quebec().alpha().observe(acVar.getViewLifecycleOwner(), new Dc.t(17, new v(acVar, 4)));
                return Unit.INSTANCE;
        }
    }
}
