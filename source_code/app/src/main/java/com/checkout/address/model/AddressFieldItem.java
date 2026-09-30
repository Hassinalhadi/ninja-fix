package com.checkout.address.model;

import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/checkout/address/model/AddressFieldItem;", "", "Lcom/checkout/components/interfaces/model/AddressField;", "getField", "()Lcom/checkout/components/interfaces/model/AddressField;", "field", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "getStyle", "()Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "style", "Lcom/checkout/components/ui/model/state/InputComponentState;", "getState", "()Lcom/checkout/components/ui/model/state/InputComponentState;", "state", "Standard", "Phone", "Lcom/checkout/address/model/AddressFieldItem$Phone;", "Lcom/checkout/address/model/AddressFieldItem$Standard;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AddressFieldItem {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0011¨\u0006."}, d2 = {"Lcom/checkout/address/model/AddressFieldItem$Phone;", "Lcom/checkout/address/model/AddressFieldItem;", "Lcom/checkout/components/interfaces/model/AddressField$Phone;", "field", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "style", "Lcom/checkout/components/ui/model/state/InputComponentState;", "state", "countryStyle", "countryState", "<init>", "(Lcom/checkout/components/interfaces/model/AddressField$Phone;Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;Lcom/checkout/components/ui/model/state/InputComponentState;Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;Lcom/checkout/components/ui/model/state/InputComponentState;)V", "component1", "()Lcom/checkout/components/interfaces/model/AddressField$Phone;", "component2", "()Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "component3", "()Lcom/checkout/components/ui/model/state/InputComponentState;", "component4", "component5", Constants.COPY_TYPE, "(Lcom/checkout/components/interfaces/model/AddressField$Phone;Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;Lcom/checkout/components/ui/model/state/InputComponentState;Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;Lcom/checkout/components/ui/model/state/InputComponentState;)Lcom/checkout/address/model/AddressFieldItem$Phone;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/model/AddressField$Phone;", "getField", "b", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "getStyle", "c", "Lcom/checkout/components/ui/model/state/InputComponentState;", "getState", Constants.INAPP_DATA_TAG, "getCountryStyle", "e", "getCountryState", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Phone extends AddressFieldItem {
        public static final int $stable;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AddressField.Phone field;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InputComponentViewStyle style;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InputComponentState state;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final InputComponentViewStyle countryStyle;

        /* renamed from: e, reason: from kotlin metadata */
        private final InputComponentState countryState;

        static {
            int i4 = InputComponentState.$stable;
            int i5 = InputComponentViewStyle.$stable;
            $stable = i4 | i4 | i5 | i5 | AddressField.Phone.$stable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Phone(@NotNull AddressField.Phone field, @NotNull InputComponentViewStyle style, @NotNull InputComponentState state, @NotNull InputComponentViewStyle countryStyle, @NotNull InputComponentState countryState) {
            super(null);
            Intrinsics.echo(field, "field");
            Intrinsics.echo(style, "style");
            Intrinsics.echo(state, "state");
            Intrinsics.echo(countryStyle, "countryStyle");
            Intrinsics.echo(countryState, "countryState");
            this.field = field;
            this.style = style;
            this.state = state;
            this.countryStyle = countryStyle;
            this.countryState = countryState;
        }

        public static /* synthetic */ Phone copy$default(Phone phone, AddressField.Phone phone2, InputComponentViewStyle inputComponentViewStyle, InputComponentState inputComponentState, InputComponentViewStyle inputComponentViewStyle2, InputComponentState inputComponentState2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                phone2 = phone.field;
            }
            if ((i4 & 2) != 0) {
                inputComponentViewStyle = phone.style;
            }
            if ((i4 & 4) != 0) {
                inputComponentState = phone.state;
            }
            if ((i4 & 8) != 0) {
                inputComponentViewStyle2 = phone.countryStyle;
            }
            if ((i4 & 16) != 0) {
                inputComponentState2 = phone.countryState;
            }
            InputComponentState inputComponentState3 = inputComponentState2;
            InputComponentState inputComponentState4 = inputComponentState;
            return phone.copy(phone2, inputComponentViewStyle, inputComponentState4, inputComponentViewStyle2, inputComponentState3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AddressField.Phone getField() {
            return this.field;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final InputComponentViewStyle getStyle() {
            return this.style;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final InputComponentState getState() {
            return this.state;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final InputComponentViewStyle getCountryStyle() {
            return this.countryStyle;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final InputComponentState getCountryState() {
            return this.countryState;
        }

        @NotNull
        public final Phone copy(@NotNull AddressField.Phone field, @NotNull InputComponentViewStyle style, @NotNull InputComponentState state, @NotNull InputComponentViewStyle countryStyle, @NotNull InputComponentState countryState) {
            Intrinsics.echo(field, "field");
            Intrinsics.echo(style, "style");
            Intrinsics.echo(state, "state");
            Intrinsics.echo(countryStyle, "countryStyle");
            Intrinsics.echo(countryState, "countryState");
            return new Phone(field, style, state, countryStyle, countryState);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) other;
            return Intrinsics.areEqual(this.field, phone.field) && Intrinsics.areEqual(this.style, phone.style) && Intrinsics.areEqual(this.state, phone.state) && Intrinsics.areEqual(this.countryStyle, phone.countryStyle) && Intrinsics.areEqual(this.countryState, phone.countryState);
        }

        @NotNull
        public final InputComponentState getCountryState() {
            return this.countryState;
        }

        @NotNull
        public final InputComponentViewStyle getCountryStyle() {
            return this.countryStyle;
        }

        @Override // com.checkout.address.model.AddressFieldItem
        @NotNull
        public final AddressField.Phone getField() {
            return this.field;
        }

        @Override // com.checkout.address.model.AddressFieldItem
        @NotNull
        public final InputComponentState getState() {
            return this.state;
        }

        @Override // com.checkout.address.model.AddressFieldItem
        @NotNull
        public final InputComponentViewStyle getStyle() {
            return this.style;
        }

        public final int hashCode() {
            return this.countryState.hashCode() + ((this.countryStyle.hashCode() + ((this.state.hashCode() + ((this.style.hashCode() + (this.field.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "Phone(field=" + this.field + ", style=" + this.style + ", state=" + this.state + ", countryStyle=" + this.countryStyle + ", countryState=" + this.countryState + ")";
        }

        @Override // com.checkout.address.model.AddressFieldItem
        public final AddressField getField() {
            return this.field;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000f¨\u0006&"}, d2 = {"Lcom/checkout/address/model/AddressFieldItem$Standard;", "Lcom/checkout/address/model/AddressFieldItem;", "Lcom/checkout/components/interfaces/model/AddressField;", "field", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "style", "Lcom/checkout/components/ui/model/state/InputComponentState;", "state", "<init>", "(Lcom/checkout/components/interfaces/model/AddressField;Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;Lcom/checkout/components/ui/model/state/InputComponentState;)V", "component1", "()Lcom/checkout/components/interfaces/model/AddressField;", "component2", "()Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "component3", "()Lcom/checkout/components/ui/model/state/InputComponentState;", Constants.COPY_TYPE, "(Lcom/checkout/components/interfaces/model/AddressField;Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;Lcom/checkout/components/ui/model/state/InputComponentState;)Lcom/checkout/address/model/AddressFieldItem$Standard;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/model/AddressField;", "getField", "b", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "getStyle", "c", "Lcom/checkout/components/ui/model/state/InputComponentState;", "getState", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Standard extends AddressFieldItem {
        public static final int $stable = (InputComponentState.$stable | InputComponentViewStyle.$stable) | AddressField.$stable;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AddressField field;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InputComponentViewStyle style;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InputComponentState state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Standard(@NotNull AddressField field, @NotNull InputComponentViewStyle style, @NotNull InputComponentState state) {
            super(null);
            Intrinsics.echo(field, "field");
            Intrinsics.echo(style, "style");
            Intrinsics.echo(state, "state");
            this.field = field;
            this.style = style;
            this.state = state;
        }

        public static /* synthetic */ Standard copy$default(Standard standard, AddressField addressField, InputComponentViewStyle inputComponentViewStyle, InputComponentState inputComponentState, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                addressField = standard.field;
            }
            if ((i4 & 2) != 0) {
                inputComponentViewStyle = standard.style;
            }
            if ((i4 & 4) != 0) {
                inputComponentState = standard.state;
            }
            return standard.copy(addressField, inputComponentViewStyle, inputComponentState);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AddressField getField() {
            return this.field;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final InputComponentViewStyle getStyle() {
            return this.style;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final InputComponentState getState() {
            return this.state;
        }

        @NotNull
        public final Standard copy(@NotNull AddressField field, @NotNull InputComponentViewStyle style, @NotNull InputComponentState state) {
            Intrinsics.echo(field, "field");
            Intrinsics.echo(style, "style");
            Intrinsics.echo(state, "state");
            return new Standard(field, style, state);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Standard)) {
                return false;
            }
            Standard standard = (Standard) other;
            return Intrinsics.areEqual(this.field, standard.field) && Intrinsics.areEqual(this.style, standard.style) && Intrinsics.areEqual(this.state, standard.state);
        }

        @Override // com.checkout.address.model.AddressFieldItem
        @NotNull
        public final AddressField getField() {
            return this.field;
        }

        @Override // com.checkout.address.model.AddressFieldItem
        @NotNull
        public final InputComponentState getState() {
            return this.state;
        }

        @Override // com.checkout.address.model.AddressFieldItem
        @NotNull
        public final InputComponentViewStyle getStyle() {
            return this.style;
        }

        public final int hashCode() {
            return this.state.hashCode() + ((this.style.hashCode() + (this.field.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "Standard(field=" + this.field + ", style=" + this.style + ", state=" + this.state + ")";
        }
    }

    public AddressFieldItem(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @NotNull
    public abstract AddressField getField();

    @NotNull
    public abstract InputComponentState getState();

    @NotNull
    public abstract InputComponentViewStyle getStyle();
}
