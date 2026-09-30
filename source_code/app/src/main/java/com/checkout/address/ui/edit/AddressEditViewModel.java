package com.checkout.address.ui.edit;

import Nd.c;
import Qd.a;
import Yb.F;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.lifecycle.T;
import androidx.lifecycle.Y;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.address.model.AddressEditScreenStyle;
import com.checkout.address.model.AddressEditState;
import com.checkout.address.model.AddressFieldItem;
import com.checkout.address.model.Australia;
import com.checkout.address.model.ButtonViewItem;
import com.checkout.address.model.Canada;
import com.checkout.address.model.State;
import com.checkout.address.model.US;
import com.checkout.address.model.validation.contract.AddressValidator;
import com.checkout.address.utils.ContactDataUtilsKt;
import com.checkout.components.address.AbstractC0873n;
import com.checkout.components.address.C0871l;
import com.checkout.components.address.C0872m;
import com.checkout.components.address.C0876q;
import com.checkout.components.address.C0877r;
import com.checkout.components.address.C0878s;
import com.checkout.components.address.C0879t;
import com.checkout.components.address.C0880u;
import com.checkout.components.interfaces.error.model.BaseOperationsError;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.model.contact.Address;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.interfaces.model.contact.Phone;
import com.checkout.components.interfaces.operations.ValidationResult;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.utils.extensions.Utils;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.y;
import kotlin.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;
import vf.ad;
import yf.AbstractC3428A;
import yf.D;
import yf.L;
import yf.N;
import yf.at;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001Bi\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0016\u0010\u0012\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020\u0011H\u0001¢\u0006\u0004\b!\u0010 J\u001f\u0010'\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b%\u0010&J%\u0010-\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110)H\u0001¢\u0006\u0004\b+\u0010,J\u0015\u00100\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b2\u00101J\u0015\u00105\u001a\u00020\u00112\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR-\u0010J\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00060C8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bI\u0010 \u001a\u0004\bG\u0010HR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00130K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001f\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030P8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR \u0010[\u001a\b\u0012\u0004\u0012\u00020\u00060V8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR \u00104\u001a\b\u0012\u0004\u0012\u00020\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010M\u001a\u0004\b]\u0010OR\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020.0K8\u0006¢\u0006\f\n\u0004\b^\u0010M\u001a\u0004\b_\u0010OR\u001d\u0010c\u001a\b\u0012\u0004\u0012\u00020.0K8\u0006¢\u0006\f\n\u0004\ba\u0010M\u001a\u0004\bb\u0010O¨\u0006d"}, d2 = {"Lcom/checkout/address/ui/edit/AddressEditViewModel;", "Landroidx/lifecycle/Y;", "Lcom/checkout/address/model/AddressEditState;", "initialState", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/interfaces/model/AddressField;", "Lcom/checkout/address/model/AddressFieldItem;", "Lcom/checkout/address/mapper/AddressFieldStyleMapper;", "addressFieldMapper", "Lcom/checkout/address/model/ButtonViewItem;", "buttonViewItem", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "titleViewItem", "Lcom/checkout/address/model/validation/contract/AddressValidator;", "addressValidator", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/model/contact/ContactData;", "", "onComplete", "", "isRTL", "Lcom/checkout/address/model/AddressEditScreenStyle;", "addressEditScreenStyle", "<init>", "(Lcom/checkout/address/model/AddressEditState;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/address/model/ButtonViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/address/model/validation/contract/AddressValidator;Lkotlin/jvm/functions/Function1;ZLcom/checkout/address/model/AddressEditScreenStyle;)V", "", "fieldPosition", "", "value", "onFieldValueChange", "(ILjava/lang/String;)V", "onConfirmButtonClick", "()V", "prepareContactData$address_standardRelease", "prepareContactData", "Lcom/checkout/components/ui/model/state/InputComponentState;", "inputComponentState", "getUpdatedZipValue$address_standardRelease", "(Ljava/lang/String;Lcom/checkout/components/ui/model/state/InputComponentState;)Ljava/lang/String;", "getUpdatedZipValue", "field", "Lcom/checkout/components/interfaces/operations/ValidationResult;", "result", "updateFieldErrorState$address_standardRelease", "(Lcom/checkout/address/model/AddressFieldItem;Lcom/checkout/components/interfaces/operations/ValidationResult;)V", "updateFieldErrorState", "Lcom/checkout/components/interfaces/model/contact/Country;", "country", "onAddressCountryUpdate", "(Lcom/checkout/components/interfaces/model/contact/Country;)V", "onPhoneDialingCodeUpdate", "Lcom/checkout/address/model/State;", "state", "onAddressStateSelected", "(Lcom/checkout/address/model/State;)V", "a", "Lcom/checkout/address/model/ButtonViewItem;", "getButtonViewItem", "()Lcom/checkout/address/model/ButtonViewItem;", "b", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "getTitleViewItem", "()Lcom/checkout/components/ui/model/TextLabelViewItem;", "f", "Lcom/checkout/address/model/AddressEditScreenStyle;", "getAddressEditScreenStyle", "()Lcom/checkout/address/model/AddressEditScreenStyle;", "", "Lcom/checkout/components/interfaces/model/AddressField$Companion$Name;", "g", "Lkotlin/Lazy;", "getAddressFieldMap$address_standardRelease", "()Ljava/util/Map;", "getAddressFieldMap$address_standardRelease$annotations", "addressFieldMap", "Lyf/L;", "o", "Lyf/L;", "isPayoutRequiredCountry", "()Lyf/L;", "Landroidx/compose/runtime/ax;", "p", "Landroidx/compose/runtime/ax;", "getSelectedState", "()Landroidx/compose/runtime/ax;", "selectedState", "", "h", "Ljava/util/List;", "getAddressFields$address_standardRelease", "()Ljava/util/List;", "addressFields", "j", "getState$address_standardRelease", "l", "getAddressCountry", "addressCountry", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, "getPhoneCountry", "phoneCountry", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressEditViewModel extends Y {
    public static final int $stable = 8;

    /* renamed from: q */
    private static final Regex f3796q = new Regex("[^0-9]");

    /* renamed from: a, reason: from kotlin metadata */
    private final ButtonViewItem buttonViewItem;

    /* renamed from: b, reason: from kotlin metadata */
    private final TextLabelViewItem titleViewItem;

    /* renamed from: c */
    private final AddressValidator f3799c;

    /* renamed from: d */
    private final Function1 f3800d;
    private final boolean e;

    /* renamed from: f, reason: from kotlin metadata */
    private final AddressEditScreenStyle addressEditScreenStyle;

    /* renamed from: g, reason: from kotlin metadata */
    private final Lazy addressFieldMap;

    /* renamed from: h */
    private final ArrayList f3803h;

    /* renamed from: i */
    private final at f3804i;

    /* renamed from: j */
    private final at f3805j;

    /* renamed from: k */
    private final at f3806k;

    /* renamed from: l */
    private final at f3807l;

    /* renamed from: m */
    private final at f3808m;

    /* renamed from: n */
    private final at f3809n;

    /* renamed from: o, reason: from kotlin metadata */
    private final L isPayoutRequiredCountry;

    /* renamed from: p, reason: from kotlin metadata */
    private final ax selectedState;

    public AddressEditViewModel(@NotNull AddressEditState initialState, @NotNull Mapper<AddressField, AddressFieldItem> addressFieldMapper, @NotNull ButtonViewItem buttonViewItem, @NotNull TextLabelViewItem titleViewItem, @NotNull AddressValidator addressValidator, @Nullable Function1<? super ContactData, Unit> function1, boolean z2, @NotNull AddressEditScreenStyle addressEditScreenStyle) {
        Country country;
        a entries;
        State state;
        Object obj;
        String str;
        Address address;
        Phone phone;
        Country country2;
        Address address2;
        Intrinsics.echo(initialState, "initialState");
        Intrinsics.echo(addressFieldMapper, "addressFieldMapper");
        Intrinsics.echo(buttonViewItem, "buttonViewItem");
        Intrinsics.echo(titleViewItem, "titleViewItem");
        Intrinsics.echo(addressValidator, "addressValidator");
        Intrinsics.echo(addressEditScreenStyle, "addressEditScreenStyle");
        this.buttonViewItem = buttonViewItem;
        this.titleViewItem = titleViewItem;
        this.f3799c = addressValidator;
        this.f3800d = function1;
        this.e = z2;
        this.addressEditScreenStyle = addressEditScreenStyle;
        Lazy alpha = LazyKt.alpha(i.purple, new F(14, initialState, addressFieldMapper));
        this.addressFieldMap = alpha;
        Map map = (Map) alpha.getValue();
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((AddressFieldItem) ((Map.Entry) it.next()).getValue());
        }
        this.f3803h = arrayList;
        N charlie = AbstractC3428A.charlie(initialState);
        this.f3804i = charlie;
        this.f3805j = charlie;
        Utils utils = Utils.INSTANCE;
        ContactData prefilledData = ((AddressEditState) charlie.getValue()).getPrefilledData();
        if (prefilledData != null && (address2 = prefilledData.getAddress()) != null) {
            country = address2.getCountry();
        } else {
            country = null;
        }
        N charlie2 = AbstractC3428A.charlie(utils.getDeviceCountry(country));
        this.f3806k = charlie2;
        this.f3807l = charlie2;
        ContactData prefilledData2 = ((AddressEditState) charlie.getValue()).getPrefilledData();
        N charlie3 = AbstractC3428A.charlie(utils.getDeviceCountry((prefilledData2 == null || (phone = prefilledData2.getPhone()) == null || (country2 = phone.getCountry()) == null) ? (Country) charlie2.getValue() : country2));
        this.f3808m = charlie3;
        this.f3809n = charlie3;
        this.isPayoutRequiredCountry = AbstractC3428A.romeo(new C0876q(charlie2), T.hotel(this), D.alpha, Boolean.valueOf(ContactDataUtilsKt.getPAYOUT_REQUIRED_COUNTRIES().contains(charlie2.getValue())));
        int i4 = AbstractC0873n.f3896a[((Country) charlie2.getValue()).ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    entries = null;
                } else {
                    entries = Australia.getEntries();
                }
            } else {
                entries = Canada.getEntries();
            }
        } else {
            entries = US.getEntries();
        }
        if (entries != null) {
            Iterator<E> it2 = entries.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    String code = ((State) obj).getCode();
                    ContactData prefilledData3 = initialState.getPrefilledData();
                    if (prefilledData3 != null && (address = prefilledData3.getAddress()) != null) {
                        str = address.getState();
                    } else {
                        str = null;
                    }
                    if (Intrinsics.areEqual(code, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            state = (State) obj;
        } else {
            state = null;
        }
        this.selectedState = C0564b.zulu(state);
        ContactData prefilledData4 = ((AddressEditState) ((N) this.f3804i).getValue()).getPrefilledData();
        if (prefilledData4 != null) {
            ContactDataUtilsKt.prefillFromContactData((Map) this.addressFieldMap.getValue(), prefilledData4);
        }
        this.buttonViewItem.getState().isEnabled().setValue(Boolean.TRUE);
        ad.zulu(T.hotel(this), null, null, new C0871l(this, null), 3);
        ad.zulu(T.hotel(this), null, null, new C0872m(this, null), 3);
    }

    public final void a(AddressField.Companion.Name name, String str) {
        InputComponentState state;
        InputFieldState inputFieldState;
        ax text;
        Object obj = ((Map) this.addressFieldMap.getValue()).get(name);
        AddressFieldItem.Standard standard = obj instanceof AddressFieldItem.Standard ? (AddressFieldItem.Standard) obj : null;
        if (standard == null || (state = standard.getState()) == null || (inputFieldState = state.getInputFieldState()) == null || (text = inputFieldState.getText()) == null) {
            return;
        }
        text.setValue(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$subscribeAddressCountryUpdated(AddressEditViewModel addressEditViewModel, c cVar) {
        C0877r c0877r;
        int i4;
        addressEditViewModel.getClass();
        if (cVar instanceof C0877r) {
            c0877r = (C0877r) cVar;
            int i5 = c0877r.f3907c;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0877r.f3907c = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0877r.f3905a;
                Od.a aVar = Od.a.alpha;
                i4 = c0877r.f3907c;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2327c.amber(obj);
                }
                ResultKt.alpha(obj);
                at atVar = addressEditViewModel.f3806k;
                C0878s c0878s = new C0878s(addressEditViewModel);
                c0877r.f3907c = 1;
                ((N) atVar).collect(c0878s, c0877r);
                return aVar;
            }
        }
        c0877r = new C0877r(addressEditViewModel, cVar);
        Object obj2 = c0877r.f3905a;
        Od.a aVar2 = Od.a.alpha;
        i4 = c0877r.f3907c;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$subscribePhoneStateUpdated(AddressEditViewModel addressEditViewModel, c cVar) {
        C0879t c0879t;
        int i4;
        addressEditViewModel.getClass();
        if (cVar instanceof C0879t) {
            c0879t = (C0879t) cVar;
            int i5 = c0879t.f3911c;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0879t.f3911c = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0879t.f3909a;
                Od.a aVar = Od.a.alpha;
                i4 = c0879t.f3911c;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2327c.amber(obj);
                }
                ResultKt.alpha(obj);
                at atVar = addressEditViewModel.f3808m;
                C0880u c0880u = new C0880u(addressEditViewModel);
                c0879t.f3911c = 1;
                ((N) atVar).collect(c0880u, c0879t);
                return aVar;
            }
        }
        c0879t = new C0879t(addressEditViewModel, cVar);
        Object obj2 = c0879t.f3909a;
        Od.a aVar2 = Od.a.alpha;
        i4 = c0879t.f3911c;
        if (i4 == 0) {
        }
    }

    public static /* synthetic */ Map alpha(AddressEditState addressEditState, Mapper mapper) {
        return a(addressEditState, mapper);
    }

    public static /* synthetic */ void getAddressFieldMap$address_standardRelease$annotations() {
    }

    @NotNull
    public final L getAddressCountry() {
        return this.f3807l;
    }

    @NotNull
    public final AddressEditScreenStyle getAddressEditScreenStyle() {
        return this.addressEditScreenStyle;
    }

    @NotNull
    public final Map<AddressField.Companion.Name, AddressFieldItem> getAddressFieldMap$address_standardRelease() {
        return (Map) this.addressFieldMap.getValue();
    }

    @NotNull
    public final List<AddressFieldItem> getAddressFields$address_standardRelease() {
        return this.f3803h;
    }

    @NotNull
    public final ButtonViewItem getButtonViewItem() {
        return this.buttonViewItem;
    }

    @NotNull
    public final L getPhoneCountry() {
        return this.f3809n;
    }

    @NotNull
    public final ax getSelectedState() {
        return this.selectedState;
    }

    @NotNull
    public final L getState$address_standardRelease() {
        return this.f3805j;
    }

    @NotNull
    public final TextLabelViewItem getTitleViewItem() {
        return this.titleViewItem;
    }

    @NotNull
    public final String getUpdatedZipValue$address_standardRelease(@NotNull String value, @NotNull InputComponentState inputComponentState) {
        Intrinsics.echo(value, "value");
        Intrinsics.echo(inputComponentState, "inputComponentState");
        if (value.length() > 9) {
            return (String) inputComponentState.getInputFieldState().getText().getValue();
        }
        return f3796q.foxtrot(value, "");
    }

    @NotNull
    /* renamed from: isPayoutRequiredCountry, reason: from getter */
    public final L getIsPayoutRequiredCountry() {
        return this.isPayoutRequiredCountry;
    }

    public final void onAddressCountryUpdate(@NotNull Country country) {
        N n5;
        Object value;
        Intrinsics.echo(country, "country");
        at atVar = this.f3806k;
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, country));
        a(AddressField.Companion.Name.State, "");
        a(AddressField.Companion.Name.Zip, "");
    }

    public final void onAddressStateSelected(@NotNull State state) {
        Intrinsics.echo(state, "state");
        a(AddressField.Companion.Name.State, state.getDisplayName());
        this.selectedState.setValue(state);
    }

    public final void onConfirmButtonClick() {
        AddressField field;
        ArrayList arrayList = this.f3803h;
        int size = arrayList.size();
        boolean z2 = true;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i10 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AddressFieldItem addressFieldItem = (AddressFieldItem) obj;
            if (!(addressFieldItem.getField() instanceof AddressField.Country)) {
                String str = (String) addressFieldItem.getState().getInputFieldState().getText().getValue();
                AddressValidator addressValidator = this.f3799c;
                if ((addressFieldItem.getField() instanceof AddressField.Zip) && ((N) this.f3807l).getValue() == ContactDataUtilsKt.getNUMBER_ONL_ZIP_COUNTRY()) {
                    field = new AddressField.Zip(addressFieldItem.getField().getIsOptional(), true);
                } else {
                    field = addressFieldItem.getField();
                }
                ValidationResult<Unit> validateField = addressValidator.validateField(field, str);
                updateFieldErrorState$address_standardRelease(addressFieldItem, validateField);
                if (validateField instanceof ValidationResult.Failure) {
                    z2 = false;
                }
            }
            i5 = i10;
        }
        if (z2) {
            prepareContactData$address_standardRelease();
            Function1 function1 = this.f3800d;
            if (function1 != null) {
                function1.invoke(((AddressEditState) ((N) this.f3804i).getValue()).getPrefilledData());
            }
        }
    }

    public final void onFieldValueChange(int fieldPosition, @NotNull String value) {
        Intrinsics.echo(value, "value");
        AddressFieldItem addressFieldItem = (AddressFieldItem) this.f3803h.get(fieldPosition);
        ax isError = addressFieldItem.getState().getInputFieldState().isError();
        Boolean bool = Boolean.FALSE;
        isError.setValue(bool);
        addressFieldItem.getState().getErrorState().isVisible().setValue(bool);
        ax text = addressFieldItem.getState().getInputFieldState().getText();
        if (addressFieldItem instanceof AddressFieldItem.Phone) {
            value = f3796q.foxtrot(value, "");
        } else if ((addressFieldItem.getField() instanceof AddressField.Zip) && ((N) this.f3807l).getValue() == ContactDataUtilsKt.getNUMBER_ONL_ZIP_COUNTRY()) {
            value = getUpdatedZipValue$address_standardRelease(value, addressFieldItem.getState());
        }
        text.setValue(value);
    }

    public final void onPhoneDialingCodeUpdate(@NotNull Country country) {
        N n5;
        Object value;
        Intrinsics.echo(country, "country");
        at atVar = this.f3808m;
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, country));
    }

    public final void prepareContactData$address_standardRelease() {
        N n5;
        Object value;
        ContactData buildContactData = ContactDataUtilsKt.buildContactData((Map) this.addressFieldMap.getValue(), (Country) ((N) this.f3808m).getValue(), (Country) ((N) this.f3806k).getValue(), (State) this.selectedState.getValue());
        at atVar = this.f3804i;
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, AddressEditState.copy$default((AddressEditState) value, null, null, null, null, buildContactData, 15, null)));
    }

    public final void updateFieldErrorState$address_standardRelease(@NotNull AddressFieldItem field, @NotNull ValidationResult<Unit> result) {
        ValidationResult.Failure failure;
        String str;
        BaseOperationsError baseOperationsError;
        Intrinsics.echo(field, "field");
        Intrinsics.echo(result, "result");
        boolean z2 = result instanceof ValidationResult.Failure;
        if (z2) {
            failure = (ValidationResult.Failure) result;
        } else {
            failure = null;
        }
        if (failure == null || (baseOperationsError = failure.getCom.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger.RESULT_ERROR java.lang.String()) == null || (str = baseOperationsError.getCom.clevertap.android.sdk.Constants.KEY_MESSAGE java.lang.String()) == null) {
            str = "";
        }
        field.getState().getInputFieldState().isError().setValue(Boolean.valueOf(z2));
        field.getState().getErrorState().isVisible().setValue(Boolean.valueOf(z2));
        if (str.length() > 0) {
            field.getState().getErrorState().getText().setValue(str);
        }
    }

    public static final Map a(AddressEditState addressEditState, Mapper mapper) {
        int collectionSizeOrDefault;
        List<AddressField> fields = addressEditState.getFields();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(fields, 10);
        int quebec = y.quebec(collectionSizeOrDefault);
        if (quebec < 16) {
            quebec = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
        for (AddressField addressField : fields) {
            Pair pair = new Pair(addressField.getName(), mapper.map(addressField));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public final String a(Country country) {
        if (this.e) {
            return ao.ad.amber(country.displayName(), "  ", country.emoji());
        }
        return ao.ad.amber(country.emoji(), "  ", country.displayName());
    }
}
