package com.checkout.components.ui.country;

import Yb.C0312j0;
import android.text.TextUtils;
import androidx.compose.foundation.layout.AbstractC0538d;
import b.c0;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.model.CountryPickerStyle;
import com.checkout.components.ui.model.CountryPickerType;
import com.checkout.components.ui.model.CountryPickerViewState;
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
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.AbstractC3428A;
import yf.L;
import yf.N;
import yf.at;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001>Bw\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0003j\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00150&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R&\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00150-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00103\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R&\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00150-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b8\u00101R\u001a\u0010:\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/checkout/components/ui/country/CountryPickerViewModel;", "Lcom/checkout/components/ui/picker/PickerViewModel;", "Lcom/checkout/components/interfaces/model/contact/Country;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "Lcom/checkout/components/ui/model/state/InputFieldState;", "Lcom/checkout/components/ui/mapper/InputFieldStateMapper;", "inputFieldStateMapper", "Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "Lcom/checkout/components/ui/mapper/InputFieldViewStyleMapper;", "inputFieldStyleMapper", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "Lcom/checkout/components/ui/mapper/TextLabelViewStyleMapper;", "textLabelStyleMapper", "Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;", "textLabelStateMapper", "Lcom/checkout/components/ui/model/CountryPickerStyle;", "style", "", "isRTL", "", "allCountries", "<init>", "(Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;Lcom/checkout/components/ui/model/CountryPickerStyle;ZLjava/util/List;)V", "", "query", "Lcom/checkout/components/ui/model/CountryPickerType;", Constants.KEY_TYPE, "filterCountries", "(Ljava/lang/String;Lcom/checkout/components/ui/model/CountryPickerType;)Ljava/util/List;", "", "onBottomSheetDismissed", "()V", "onQueryChanged$ui_standardRelease", "(Ljava/lang/String;Lcom/checkout/components/ui/model/CountryPickerType;)V", "onQueryChanged", "Ljava/util/List;", "Lyf/at;", "_filteredCountries", "Lyf/at;", "updatedStyle", "Lcom/checkout/components/ui/model/CountryPickerStyle;", "getUpdatedStyle$ui_standardRelease", "()Lcom/checkout/components/ui/model/CountryPickerStyle;", "Lyf/L;", "filteredCountries", "Lyf/L;", "getFilteredCountries$ui_standardRelease", "()Lyf/L;", "Lcom/checkout/components/ui/model/CountryPickerViewState;", "state", "Lcom/checkout/components/ui/model/CountryPickerViewState;", "getState$ui_standardRelease", "()Lcom/checkout/components/ui/model/CountryPickerViewState;", "filteredItems", "getFilteredItems", "La0/t;", "containerColor", "J", "getContainerColor-0d7_KjU", "()J", "Companion", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CountryPickerViewModel extends PickerViewModel<Country> {

    @NotNull
    private final at _filteredCountries;

    @NotNull
    private final List<Country> allCountries;
    private final long containerColor;

    @NotNull
    private final L filteredCountries;

    @NotNull
    private final L filteredItems;

    @NotNull
    private final CountryPickerViewState state;

    @NotNull
    private final CountryPickerStyle updatedStyle;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Lazy<Qd.a> ALL_COUNTRIES$delegate = LazyKt.lazy(new c0(20));

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/ui/country/CountryPickerViewModel$Companion;", "", "<init>", "()V", "ALL_COUNTRIES", "", "Lcom/checkout/components/interfaces/model/contact/Country;", "getALL_COUNTRIES", "()Ljava/util/List;", "ALL_COUNTRIES$delegate", "Lkotlin/Lazy;", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<Country> getALL_COUNTRIES() {
            return (List) CountryPickerViewModel.ALL_COUNTRIES$delegate.getValue();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CountryPickerViewModel(Mapper mapper, Mapper mapper2, Mapper mapper3, TextLabelStyleToStateMapper textLabelStyleToStateMapper, CountryPickerStyle countryPickerStyle, boolean z2, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(mapper, mapper2, mapper3, textLabelStyleToStateMapper, countryPickerStyle, z2, (i4 & 64) != 0 ? Companion.getALL_COUNTRIES() : list);
    }

    public static final Qd.a ALL_COUNTRIES_delegate$lambda$7() {
        return Country.getEntries();
    }

    public static /* synthetic */ Unit alpha(CountryPickerViewModel countryPickerViewModel) {
        return updatedStyle$lambda$0(countryPickerViewModel);
    }

    public static /* synthetic */ Qd.a bravo() {
        return ALL_COUNTRIES_delegate$lambda$7();
    }

    private final List<Country> filterCountries(String query, CountryPickerType r82) {
        if (StringsKt.gray(query)) {
            return this.allCountries;
        }
        CountryPickerType countryPickerType = CountryPickerType.Phone;
        if (r82 == countryPickerType && TextUtils.isDigitsOnly(query)) {
            List<Country> list = this.allCountries;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (r.quebec(((Country) obj).getDialingCode(), query, true)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        if (r82 == countryPickerType && r.quebec(query, "+", false)) {
            List<Country> list2 = this.allCountries;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                String dialingCode = ((Country) obj2).getDialingCode();
                String substring = query.substring(1);
                Intrinsics.delta(substring, "substring(...)");
                if (r.quebec(dialingCode, substring, true)) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
        List<Country> list3 = this.allCountries;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list3) {
            if (r.quebec(((Country) obj3).displayName(), query, true)) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    public static final Unit updatedStyle$lambda$0(CountryPickerViewModel countryPickerViewModel) {
        countryPickerViewModel.onQueryChanged$ui_standardRelease("", null);
        return Unit.INSTANCE;
    }

    @Override // com.checkout.components.ui.picker.PickerViewModel
    /* renamed from: getContainerColor-0d7_KjU, reason: from getter */
    public long getContainerColor() {
        return this.containerColor;
    }

    @NotNull
    /* renamed from: getFilteredCountries$ui_standardRelease, reason: from getter */
    public final L getFilteredCountries() {
        return this.filteredCountries;
    }

    @Override // com.checkout.components.ui.picker.PickerViewModel
    @NotNull
    public L getFilteredItems() {
        return this.filteredItems;
    }

    @NotNull
    /* renamed from: getState$ui_standardRelease, reason: from getter */
    public final CountryPickerViewState getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: getUpdatedStyle$ui_standardRelease, reason: from getter */
    public final CountryPickerStyle getUpdatedStyle() {
        return this.updatedStyle;
    }

    @Override // com.checkout.components.ui.picker.PickerViewModel
    public void onBottomSheetDismissed() {
        onQueryChanged$ui_standardRelease("", null);
    }

    public final void onQueryChanged$ui_standardRelease(@NotNull String query, @Nullable CountryPickerType r62) {
        N n5;
        Object value;
        Intrinsics.echo(query, "query");
        this.state.getSearchField().getState().getText().setValue(query);
        at atVar = this._filteredCountries;
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, filterCountries(query, r62)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CountryPickerViewModel(@NotNull Mapper<InputFieldStyle, InputFieldState> inputFieldStateMapper, @NotNull Mapper<InputFieldStyle, InputFieldViewStyle> inputFieldStyleMapper, @NotNull Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleMapper, @NotNull TextLabelStyleToStateMapper textLabelStateMapper, @NotNull CountryPickerStyle style, boolean z2, @NotNull List<? extends Country> allCountries) {
        CountryPickerStyle copy;
        Intrinsics.echo(inputFieldStateMapper, "inputFieldStateMapper");
        Intrinsics.echo(inputFieldStyleMapper, "inputFieldStyleMapper");
        Intrinsics.echo(textLabelStyleMapper, "textLabelStyleMapper");
        Intrinsics.echo(textLabelStateMapper, "textLabelStateMapper");
        Intrinsics.echo(style, "style");
        Intrinsics.echo(allCountries, "allCountries");
        this.allCountries = allCountries;
        N charlie = AbstractC3428A.charlie(allCountries);
        this._filteredCountries = charlie;
        InputFieldStyle searchFieldStyle = style.getSearchFieldStyle();
        ImageStyle trailingIconStyle = style.getSearchFieldStyle().getTrailingIconStyle();
        copy = style.copy((r28 & 1) != 0 ? style.countryNameStyle : null, (r28 & 2) != 0 ? style.dialingCodeStyle : null, (r28 & 4) != 0 ? style.emojiStyle : null, (r28 & 8) != 0 ? style.searchFieldStyle : InputFieldStyle.copy$default(searchFieldStyle, null, null, null, null, null, null, null, null, null, trailingIconStyle != null ? ImageStyle.copy$default(trailingIconStyle, null, null, null, null, null, null, new C0312j0(17, this), null, 191, null) : null, null, null, 0L, false, 15871, null), (r28 & 16) != 0 ? style.notFoundViewTitleStyle : null, (r28 & 32) != 0 ? style.notFoundViewSubtitleStyle : null, (r28 & 64) != 0 ? style.topAppBarViewStyle : null, (r28 & 128) != 0 ? style.containerColor : 0L, (r28 & Barcode.FORMAT_QR_CODE) != 0 ? style.selectedRadioButtonColor : 0L, (r28 & 512) != 0 ? style.unSelectedRadioButtonColor : 0L);
        this.updatedStyle = copy;
        this.filteredCountries = charlie;
        InputFieldViewStyle map = inputFieldStyleMapper.map(copy.getSearchFieldStyle());
        InputFieldViewItem inputFieldViewItem = new InputFieldViewItem(inputFieldStateMapper.map(copy.getSearchFieldStyle()), InputFieldViewStyle.copy$default(map, AbstractC0538d.tango(map.getModifier(), 16, 12), false, false, null, null, null, null, null, null, false, 0, 0, null, null, null, 32766, null));
        TextLabelViewItem textLabelViewItem = new TextLabelViewItem(textLabelStyleMapper.map(style.getTopAppBarViewStyle().getTitleStyle()), textLabelStateMapper.map(style.getTopAppBarViewStyle().getTitleStyle()));
        TextLabelViewStyle map2 = textLabelStyleMapper.map(copy.getCountryNameStyle());
        TextLabelViewStyle map3 = textLabelStyleMapper.map(copy.getDialingCodeStyle());
        TextLabelViewStyle map4 = textLabelStyleMapper.map(copy.getEmojiStyle());
        TextLabelViewItem textLabelViewItem2 = new TextLabelViewItem(textLabelStyleMapper.map(copy.getNotFoundViewTitleStyle()), textLabelStateMapper.map(copy.getNotFoundViewTitleStyle()));
        TextLabelViewItem textLabelViewItem3 = new TextLabelViewItem(textLabelStyleMapper.map(copy.getNotFoundViewSubtitleStyle()), textLabelStateMapper.map(copy.getNotFoundViewSubtitleStyle()));
        TopAppBarViewStyle topAppBarViewStyle = copy.getTopAppBarViewStyle();
        Utils utils = Utils.INSTANCE;
        CountryPickerViewState countryPickerViewState = new CountryPickerViewState(map4, map2, map3, z2, inputFieldViewItem, textLabelViewItem, textLabelViewItem2, textLabelViewItem3, topAppBarViewStyle, utils.m191toComposeColorvNxB06k(copy.getContainerColor()), utils.m191toComposeColorvNxB06k(copy.getSelectedRadioButtonColor()), utils.m191toComposeColorvNxB06k(copy.getUnSelectedRadioButtonColor()), null);
        this.state = countryPickerViewState;
        this.filteredItems = charlie;
        this.containerColor = countryPickerViewState.mo63getContainerColor0d7_KjU();
    }
}
