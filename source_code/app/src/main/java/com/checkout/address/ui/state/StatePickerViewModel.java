package com.checkout.address.ui.state;

import Qd.a;
import Yb.C0312j0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import com.checkout.address.model.Australia;
import com.checkout.address.model.Canada;
import com.checkout.address.model.State;
import com.checkout.address.model.StatePickerStyle;
import com.checkout.address.model.StatePickerViewState;
import com.checkout.address.model.US;
import com.checkout.components.address.X;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.model.InputFieldViewItem;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.TopAppBarViewStyle;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.picker.PickerViewModel;
import com.checkout.components.ui.utils.extensions.Utils;
import com.clevertap.android.sdk.Constants;
import d5.C1589a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.AbstractC3428A;
import yf.L;
import yf.N;
import yf.at;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bi\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0003j\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fR(\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130 8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010\u0019\u001a\u0004\b#\u0010$R \u0010+\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u0019\u001a\u0004\b(\u0010)R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00107\u001a\u0002028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R&\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000209088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/checkout/address/ui/state/StatePickerViewModel;", "Lcom/checkout/components/ui/picker/PickerViewModel;", "Lcom/checkout/address/model/State;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "Lcom/checkout/components/ui/model/state/InputFieldState;", "Lcom/checkout/components/ui/mapper/InputFieldStateMapper;", "inputFieldStateMapper", "Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "Lcom/checkout/components/ui/mapper/InputFieldViewStyleMapper;", "inputFieldStyleMapper", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "Lcom/checkout/components/ui/mapper/TextLabelViewStyleMapper;", "textLabelStyleMapper", "Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;", "textLabelStateMapper", "Lcom/checkout/address/model/StatePickerStyle;", "style", "Lcom/checkout/components/interfaces/model/contact/Country;", "country", "<init>", "(Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;Lcom/checkout/address/model/StatePickerStyle;Lcom/checkout/components/interfaces/model/contact/Country;)V", "", "onBottomSheetDismissed", "()V", "", "query", "onQueryChanged", "(Ljava/lang/String;)V", "updateCountry", "(Lcom/checkout/components/interfaces/model/contact/Country;)V", "Landroidx/compose/runtime/ax;", "a", "Landroidx/compose/runtime/ax;", "getCountry$address_standardRelease", "()Landroidx/compose/runtime/ax;", "getCountry$address_standardRelease$annotations", "c", "Lcom/checkout/address/model/StatePickerStyle;", "getUpdatedStyle$address_standardRelease", "()Lcom/checkout/address/model/StatePickerStyle;", "getUpdatedStyle$address_standardRelease$annotations", "updatedStyle", "Lcom/checkout/address/model/StatePickerViewState;", Constants.INAPP_DATA_TAG, "Lcom/checkout/address/model/StatePickerViewState;", "getState", "()Lcom/checkout/address/model/StatePickerViewState;", "state", "La0/t;", "f", "J", "getContainerColor-0d7_KjU", "()J", "containerColor", "Lyf/L;", "", "e", "Lyf/L;", "getFilteredItems", "()Lyf/L;", "filteredItems", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatePickerViewModel extends PickerViewModel<State> {
    public static final int $stable = 8;

    /* renamed from: g */
    private static final Lazy f3824g = LazyKt.lazy(new C1589a(22));

    /* renamed from: h */
    private static final Lazy f3825h = LazyKt.lazy(new C1589a(23));

    /* renamed from: i */
    private static final Lazy f3826i = LazyKt.lazy(new C1589a(24));

    /* renamed from: a, reason: from kotlin metadata */
    private final ax country;

    /* renamed from: b */
    private final at f3828b;

    /* renamed from: c, reason: from kotlin metadata */
    private final StatePickerStyle updatedStyle;

    /* renamed from: d */
    private final StatePickerViewState state;
    private final at e;

    /* renamed from: f, reason: from kotlin metadata */
    private final long containerColor;

    public StatePickerViewModel(@NotNull Mapper<InputFieldStyle, InputFieldState> inputFieldStateMapper, @NotNull Mapper<InputFieldStyle, InputFieldViewStyle> inputFieldStyleMapper, @NotNull Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleMapper, @NotNull TextLabelStyleToStateMapper textLabelStateMapper, @NotNull StatePickerStyle style, @Nullable Country country) {
        ImageStyle imageStyle;
        Intrinsics.echo(inputFieldStateMapper, "inputFieldStateMapper");
        Intrinsics.echo(inputFieldStyleMapper, "inputFieldStyleMapper");
        Intrinsics.echo(textLabelStyleMapper, "textLabelStyleMapper");
        Intrinsics.echo(textLabelStateMapper, "textLabelStateMapper");
        Intrinsics.echo(style, "style");
        this.country = C0564b.zulu(country);
        N charlie = AbstractC3428A.charlie(a(country));
        this.f3828b = charlie;
        InputFieldStyle searchFieldStyle = style.getSearchFieldStyle();
        ImageStyle trailingIconStyle = style.getSearchFieldStyle().getTrailingIconStyle();
        if (trailingIconStyle != null) {
            imageStyle = ImageStyle.copy$default(trailingIconStyle, null, null, null, null, null, null, new C0312j0(24, this), null, 191, null);
        } else {
            imageStyle = null;
        }
        StatePickerStyle copy$default = StatePickerStyle.copy$default(style, null, null, InputFieldStyle.copy$default(searchFieldStyle, null, null, null, null, null, null, null, null, null, imageStyle, null, null, 0L, false, 15871, null), null, null, null, 0L, 0L, 0L, 507, null);
        this.updatedStyle = copy$default;
        InputFieldViewStyle map = inputFieldStyleMapper.map(copy$default.getSearchFieldStyle());
        InputFieldViewItem inputFieldViewItem = new InputFieldViewItem(inputFieldStateMapper.map(copy$default.getSearchFieldStyle()), InputFieldViewStyle.copy$default(map, AbstractC0538d.tango(map.getModifier(), 16, 12), false, false, null, null, null, null, null, null, false, 0, 0, null, null, null, 32766, null));
        TextLabelViewItem textLabelViewItem = new TextLabelViewItem(textLabelStyleMapper.map(style.getTopAppBarViewStyle().getTitleStyle()), textLabelStateMapper.map(style.getTopAppBarViewStyle().getTitleStyle()));
        TextLabelViewStyle map2 = textLabelStyleMapper.map(copy$default.getNameStyle());
        TextLabelViewStyle map3 = textLabelStyleMapper.map(copy$default.getIsoCodeStyle());
        TextLabelViewItem textLabelViewItem2 = new TextLabelViewItem(textLabelStyleMapper.map(copy$default.getNotFoundViewTitleStyle()), textLabelStateMapper.map(copy$default.getNotFoundViewTitleStyle()));
        TextLabelViewItem textLabelViewItem3 = new TextLabelViewItem(textLabelStyleMapper.map(copy$default.getNotFoundViewSubtitleStyle()), textLabelStateMapper.map(copy$default.getNotFoundViewSubtitleStyle()));
        TopAppBarViewStyle topAppBarViewStyle = copy$default.getTopAppBarViewStyle();
        Utils utils = Utils.INSTANCE;
        StatePickerViewState statePickerViewState = new StatePickerViewState(map2, map3, inputFieldViewItem, textLabelViewItem, textLabelViewItem2, textLabelViewItem3, topAppBarViewStyle, utils.m191toComposeColorvNxB06k(copy$default.getContainerColor()), utils.m191toComposeColorvNxB06k(copy$default.getSelectedRadioButtonColor()), utils.m191toComposeColorvNxB06k(copy$default.getUnSelectedRadioButtonColor()), null);
        this.state = statePickerViewState;
        this.e = charlie;
        this.containerColor = statePickerViewState.mo63getContainerColor0d7_KjU();
    }

    public static final Unit a(StatePickerViewModel statePickerViewModel) {
        statePickerViewModel.onQueryChanged("");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ a alpha() {
        return c();
    }

    public static final a b() {
        return Canada.getEntries();
    }

    public static /* synthetic */ Unit bravo(StatePickerViewModel statePickerViewModel) {
        return a(statePickerViewModel);
    }

    public static final a c() {
        return US.getEntries();
    }

    public static /* synthetic */ a charlie() {
        return a();
    }

    public static /* synthetic */ a delta() {
        return b();
    }

    public static /* synthetic */ void getCountry$address_standardRelease$annotations() {
    }

    public static /* synthetic */ void getUpdatedStyle$address_standardRelease$annotations() {
    }

    @Override // com.checkout.components.ui.picker.PickerViewModel
    /* renamed from: getContainerColor-0d7_KjU, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    @NotNull
    /* renamed from: getCountry$address_standardRelease, reason: from getter */
    public final ax getCountry() {
        return this.country;
    }

    @Override // com.checkout.components.ui.picker.PickerViewModel
    @NotNull
    public final L getFilteredItems() {
        return this.e;
    }

    @NotNull
    public final StatePickerViewState getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: getUpdatedStyle$address_standardRelease, reason: from getter */
    public final StatePickerStyle getUpdatedStyle() {
        return this.updatedStyle;
    }

    @Override // com.checkout.components.ui.picker.PickerViewModel
    public final void onBottomSheetDismissed() {
        onQueryChanged("");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public final void onQueryChanged(@NotNull String query) {
        N n5;
        Object value;
        Object a6;
        Intrinsics.echo(query, "query");
        this.state.getSearchField().getState().getText().setValue(query);
        at atVar = this.f3828b;
        do {
            n5 = (N) atVar;
            value = n5.getValue();
            if (!StringsKt.gray(query) && query.length() != 0) {
                List a8 = a((Country) this.country.getValue());
                a6 = new ArrayList();
                for (Object obj : a8) {
                    State state = (State) obj;
                    if (r.quebec(state.getCode(), query, true) || r.quebec(state.getDisplayName(), query, true)) {
                        a6.add(obj);
                    }
                }
            } else {
                a6 = a((Country) this.country.getValue());
            }
        } while (!n5.hotel(value, a6));
    }

    public final void updateCountry(@NotNull Country country) {
        N n5;
        Object value;
        Intrinsics.echo(country, "country");
        if (this.country.getValue() != country) {
            this.country.setValue(country);
            at atVar = this.f3828b;
            do {
                n5 = (N) atVar;
                value = n5.getValue();
            } while (!n5.hotel(value, a(country)));
        }
    }

    private static List a(Country country) {
        int i4 = country == null ? -1 : X.f3874a[country.ordinal()];
        if (i4 == 1) {
            return (a) f3824g.getValue();
        }
        if (i4 == 2) {
            return (a) f3825h.getValue();
        }
        if (i4 != 3) {
            return CollectionsKt.emptyList();
        }
        return (a) f3826i.getValue();
    }

    public static final a a() {
        return Australia.getEntries();
    }
}
