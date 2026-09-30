package F4;

import Q0.n;
import Xd.l;
import Xd.m;
import Yb.C0316l0;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.t0;
import com.app.network.network.models.TaskStatus;
import com.checkout.components.core.ui.FlowComponentViewKt;
import com.checkout.components.core.ui.FlowComponentViewModel;
import com.checkout.components.core.ui.model.ComposeStyle;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.usecase.SuspendUseCase;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.T1;
import com.checkout.components.rememberme.Y0;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.rememberme.savecard.SaveCardViewStateRepository;
import com.checkout.components.rememberme.utils.NavControllerWrapper;
import com.checkout.components.ui.country.CountryPickerContentViewKt;
import com.checkout.components.ui.model.CountryPickerType;
import com.checkout.components.ui.model.CountryPickerViewState;
import com.checkout.components.ui.model.PickerViewState;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.picker.PickerContentViewKt;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import z3.C3462a;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1275a;
    public final /* synthetic */ int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1276b;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ f(DesignTokens designTokens, SuspendUseCase suspendUseCase, SaveCardViewStateRepository saveCardViewStateRepository, Function0 function0, Function1 function1, CheckoutKMPRememberMe checkoutKMPRememberMe, TextLabelViewItem textLabelViewItem, int i4) {
        this.alpha = 3;
        this.red = designTokens;
        this.silver = suspendUseCase;
        this.teal = saveCardViewStateRepository;
        this.white = function0;
        this.f1276b = function1;
        this.yellow = checkoutKMPRememberMe;
        this.f1275a = textLabelViewItem;
        this.purple = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit a6;
        Unit CountryPickerContentView$lambda$5;
        Unit PickerContentView$lambda$8;
        Object obj3 = this.silver;
        Object obj4 = this.f1275a;
        Object obj5 = this.yellow;
        Object obj6 = this.white;
        Object obj7 = this.teal;
        Object obj8 = this.f1276b;
        Object obj9 = this.red;
        switch (this.alpha) {
            case 0:
                List list = (List) obj9;
                ComposeStyle composeStyle = (ComposeStyle) obj3;
                FlowComponentViewModel flowComponentViewModel = (FlowComponentViewModel) obj7;
                Context context = (Context) obj6;
                n nVar = (n) obj5;
                Map map = (Map) obj4;
                a6 = FlowComponentViewKt.a(list, composeStyle, flowComponentViewModel, context, nVar, map, (Function1) obj8, this.purple, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return a6;
            case 1:
                final Long l10 = (Long) obj2;
                int i4 = ProcessOrderActivityV2.f12378N0;
                final ProcessOrderActivityV2 processOrderActivityV2 = (ProcessOrderActivityV2) obj9;
                if (!processOrderActivityV2.isDestroyed() && !processOrderActivityV2.isFinishing()) {
                    ((t0) processOrderActivityV2.f12407X).setValue(null);
                    final C0316l0 c0316l0 = new C0316l0(processOrderActivityV2, this.purple, (TaskStatus) obj3, (String) obj7, (String) obj6, (String) obj5, (File) obj4, (String) obj8, 1);
                    C3462a.alpha("LocationFlow", 12, "PICKUP_COMPLETE_UI_STALE_DIALOG_SHOWN ageMs=" + l10, null);
                    new AlertDialog.Builder(processOrderActivityV2).setTitle(R.string.pickup_stale_location_title).setMessage(R.string.pickup_stale_location_message).setCancelable(false).setPositiveButton(R.string.retry, new DialogInterface.OnClickListener() { // from class: Yb.q0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i5) {
                            int i10 = ProcessOrderActivityV2.f12378N0;
                            C3462a.alpha("LocationFlow", 12, "PICKUP_COMPLETE_UI_STALE_RETRY ageMs=" + l10, null);
                            dialogInterface.dismiss();
                            ProcessOrderActivityV2 processOrderActivityV22 = processOrderActivityV2;
                            if (!processOrderActivityV22.isDestroyed() && !processOrderActivityV22.isFinishing()) {
                                c0316l0.invoke();
                            }
                        }
                    }).setNegativeButton(R.string.cancel, new Gc.e(4, l10)).show();
                }
                return Unit.INSTANCE;
            case 2:
                return T1.a((DiComponent) obj9, (NavControllerWrapper) obj3, (l) obj7, (Xd.n) obj6, (l) obj5, (Function0) obj4, (Function0) obj8, this.purple, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 3:
                return Y0.a((DesignTokens) obj9, (SuspendUseCase) obj3, (SaveCardViewStateRepository) obj7, (Function0) obj6, (Function1) obj8, (CheckoutKMPRememberMe) obj5, (TextLabelViewItem) obj4, this.purple, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 4:
                Country country = (Country) obj3;
                CountryPickerContentView$lambda$5 = CountryPickerContentViewKt.CountryPickerContentView$lambda$5(country, (List) obj9, (Function1) obj8, (Function1) obj7, (Function0) obj6, (CountryPickerType) obj5, (CountryPickerViewState) obj4, this.purple, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return CountryPickerContentView$lambda$5;
            default:
                int intValue = ((Integer) obj2).intValue();
                int i5 = this.purple;
                PickerContentView$lambda$8 = PickerContentViewKt.PickerContentView$lambda$8(this.silver, (List) obj9, (Function1) obj8, (Function0) obj7, (Function1) obj6, (PickerViewState) obj5, (m) obj4, i5, (InterfaceC0581m) obj, intValue);
                return PickerContentView$lambda$8;
        }
    }

    public /* synthetic */ f(ProcessOrderActivityV2 processOrderActivityV2, int i4, TaskStatus taskStatus, String str, String str2, String str3, File file, String str4) {
        this.alpha = 1;
        this.red = processOrderActivityV2;
        this.purple = i4;
        this.silver = taskStatus;
        this.teal = str;
        this.white = str2;
        this.yellow = str3;
        this.f1275a = file;
        this.f1276b = str4;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, kotlin.e eVar, int i4, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.silver = obj2;
        this.teal = obj3;
        this.white = obj4;
        this.yellow = obj5;
        this.f1275a = obj6;
        this.f1276b = eVar;
        this.purple = i4;
    }

    public /* synthetic */ f(Object obj, List list, Function1 function1, kotlin.e eVar, kotlin.e eVar2, Object obj2, Object obj3, int i4, int i5) {
        this.alpha = i5;
        this.silver = obj;
        this.red = list;
        this.f1276b = function1;
        this.teal = eVar;
        this.white = eVar2;
        this.yellow = obj2;
        this.f1275a = obj3;
        this.purple = i4;
    }
}
