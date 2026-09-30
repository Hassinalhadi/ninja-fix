package Ec;

import androidx.compose.foundation.layout.M;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.address.model.State;
import com.checkout.address.model.StatePickerViewState;
import com.checkout.address.ui.view.AddressButtonViewKt;
import com.checkout.address.utils.StyleUtils;
import com.checkout.components.address.V;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.AddressComponentConfig;
import com.checkout.components.kmp.rememberme.model.AuthenticationViewType;
import com.checkout.components.kmp.rememberme.shared.model.Hint;
import com.checkout.components.kmp.rememberme.shared.model.HintType;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.view.authentication.AuthenticationViewKt;
import com.checkout.components.kmp.rememberme.view.challenge.ChallengeButtonsViewKt;
import com.checkout.components.ui.model.TextLabelViewItem;
import i.C1874w;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f993a;
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ e(Oa.f fVar, C1874w c1874w, Function0 function0, Function1 function1, M m4, T.s sVar, int i4) {
        this.alpha = 1;
        this.teal = fVar;
        this.white = c1874w;
        this.purple = function0;
        this.red = function1;
        this.yellow = m4;
        this.f993a = sVar;
        this.silver = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit AuthenticationView$lambda$13;
        Unit a6;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).intValue();
                t.foxtrot((List) this.teal, (List) this.white, (Xd.l) this.yellow, (Function1) this.red, (Function1) this.f993a, (Function0) this.purple, (InterfaceC0581m) obj, C0564b.cyan(this.silver | 1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.silver | 1);
                M m4 = (M) this.yellow;
                T.s sVar = (T.s) this.f993a;
                Qa.a.echo((Oa.f) this.teal, (C1874w) this.white, (Function0) this.purple, (Function1) this.red, m4, sVar, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            case 2:
                int intValue = ((Integer) obj2).intValue();
                Function0 function0 = (Function0) this.purple;
                int i4 = this.silver;
                AuthenticationView$lambda$13 = AuthenticationViewKt.AuthenticationView$lambda$13((ResourceProvider) this.teal, (DesignTokens) this.white, (String) this.yellow, (AuthenticationViewType) this.red, (HintType) this.f993a, function0, i4, (InterfaceC0581m) obj, intValue);
                return AuthenticationView$lambda$13;
            case 3:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                return ChallengeButtonsViewKt.alpha((ResourceProvider) this.teal, (DesignTokens) this.white, (Hint) this.yellow, (Hint) this.f993a, (Hint) this.purple, (Function1) this.red, this.silver, interfaceC0581m, intValue2);
            case 4:
                a6 = AddressButtonViewKt.a((AddressComponentConfig) this.teal, (Mapper) this.white, (Mapper) this.yellow, (StyleUtils) this.red, (PrimitiveStateFlowRepository) this.f993a, (TextLabelViewItem) this.purple, this.silver, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return a6;
            default:
                return V.a((State) this.white, (List) this.teal, (Function1) this.red, (Function1) this.f993a, (Function0) this.purple, (StatePickerViewState) this.yellow, this.silver, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ e(State state, List list, Function1 function1, Function1 function12, Function0 function0, StatePickerViewState statePickerViewState, int i4) {
        this.alpha = 5;
        this.white = state;
        this.teal = list;
        this.red = function1;
        this.f993a = function12;
        this.purple = function0;
        this.yellow = statePickerViewState;
        this.silver = i4;
    }

    public /* synthetic */ e(ResourceProvider resourceProvider, DesignTokens designTokens, Hint hint, Hint hint2, Hint hint3, Function1 function1, int i4) {
        this.alpha = 3;
        this.teal = resourceProvider;
        this.white = designTokens;
        this.yellow = hint;
        this.f993a = hint2;
        this.purple = hint3;
        this.red = function1;
        this.silver = i4;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i4, int i5) {
        this.alpha = i5;
        this.teal = obj;
        this.white = obj2;
        this.yellow = obj3;
        this.red = obj4;
        this.f993a = obj5;
        this.purple = obj6;
        this.silver = i4;
    }
}
