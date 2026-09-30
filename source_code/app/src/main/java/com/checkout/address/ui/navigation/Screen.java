package com.checkout.address.ui.navigation;

import Jf.d;
import Jf.e;
import Nf.C0266y;
import Nf.K;
import Nf.az;
import com.checkout.components.address.Q;
import com.checkout.components.ui.model.CountryPickerType;
import com.clevertap.android.sdk.Constants;
import d5.C1589a;
import ge.InterfaceC1772d;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2796v6;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00162\u00020\u0001:\u0004\u0017\u0018\u0019\u001aB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0003\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/checkout/address/ui/navigation/Screen;", "", "", "seen0", "", "route", "LNf/K;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;LNf/K;)V", "self", "LMf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/checkout/address/ui/navigation/Screen;LMf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "Companion", "CountryPicker", "StatePicker", "AddressEdit", "com/checkout/components/address/Q", "Lcom/checkout/address/ui/navigation/Screen$AddressEdit;", "Lcom/checkout/address/ui/navigation/Screen$CountryPicker;", "Lcom/checkout/address/ui/navigation/Screen$StatePicker;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@e
/* loaded from: classes3.dex */
public abstract class Screen {
    public static final int $stable = 0;

    @NotNull
    public static final Q Companion = new Q();

    /* renamed from: b, reason: collision with root package name */
    private static final Lazy f3817b = LazyKt.alpha(i.alpha, new C1589a(17));

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String route;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/checkout/address/ui/navigation/Screen$AddressEdit;", "Lcom/checkout/address/ui/navigation/Screen;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final /* data */ class AddressEdit extends Screen {
        public static final int $stable = 0;

        @NotNull
        public static final AddressEdit INSTANCE = new AddressEdit();

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ Lazy f3819c = LazyKt.alpha(i.alpha, new C1589a(18));

        private AddressEdit() {
            super("ckoAddressEdit", null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return new C0266y("com.checkout.address.ui.navigation.Screen.AddressEdit", INSTANCE, new Annotation[0]);
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof AddressEdit);
        }

        public final int hashCode() {
            return 1821136145;
        }

        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f3819c.getValue();
        }

        @NotNull
        public final String toString() {
            return "AddressEdit";
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0017¨\u0006)"}, d2 = {"Lcom/checkout/address/ui/navigation/Screen$CountryPicker;", "Lcom/checkout/address/ui/navigation/Screen;", "Lcom/checkout/components/ui/model/CountryPickerType;", Constants.KEY_TYPE, "<init>", "(Lcom/checkout/components/ui/model/CountryPickerType;)V", "", "seen0", "", "route", "LNf/K;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/checkout/components/ui/model/CountryPickerType;LNf/K;)V", "self", "LMf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$address_standardRelease", "(Lcom/checkout/address/ui/navigation/Screen$CountryPicker;LMf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/checkout/components/ui/model/CountryPickerType;", Constants.COPY_TYPE, "(Lcom/checkout/components/ui/model/CountryPickerType;)Lcom/checkout/address/ui/navigation/Screen$CountryPicker;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lcom/checkout/components/ui/model/CountryPickerType;", "getType", "Companion", "$serializer", "com/checkout/address/ui/navigation/b", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final /* data */ class CountryPicker extends Screen {
        public static final int $stable = 0;

        @NotNull
        public static final b Companion = new b();

        /* renamed from: d, reason: collision with root package name */
        private static final Lazy[] f3820d = {null, LazyKt.alpha(i.alpha, new C1589a(19))};

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final CountryPickerType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CountryPicker(int i4, String str, CountryPickerType countryPickerType, K k6) {
            super(i4, str, k6);
            if (3 != (i4 & 3)) {
                az.juliet(i4, 3, Screen$CountryPicker$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.type = countryPickerType;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer b() {
            CountryPickerType[] values = CountryPickerType.values();
            Intrinsics.echo(values, "values");
            return new C0266y("com.checkout.components.ui.model.CountryPickerType", (Enum[]) values);
        }

        public static CountryPicker copy$default(CountryPicker countryPicker, CountryPickerType type, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                type = countryPicker.type;
            }
            countryPicker.getClass();
            Intrinsics.echo(type, "type");
            return new CountryPicker(type);
        }

        public static final /* synthetic */ void write$Self$address_standardRelease(CountryPicker self, Mf.b output, SerialDescriptor serialDesc) {
            Screen.write$Self(self, output, serialDesc);
            ((AbstractC2796v6) output).whiskey(serialDesc, 1, (KSerializer) f3820d[1].getValue(), self.type);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CountryPickerType getType() {
            return this.type;
        }

        @NotNull
        public final CountryPicker copy(@NotNull CountryPickerType type) {
            Intrinsics.echo(type, "type");
            return new CountryPicker(type);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CountryPicker) && this.type == ((CountryPicker) other).type;
        }

        @NotNull
        public final CountryPickerType getType() {
            return this.type;
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        @NotNull
        public final String toString() {
            return "CountryPicker(type=" + this.type + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountryPicker(@NotNull CountryPickerType type) {
            super("ckoCountryPicker", null);
            Intrinsics.echo(type, "type");
            this.type = type;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/checkout/address/ui/navigation/Screen$StatePicker;", "Lcom/checkout/address/ui/navigation/Screen;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final /* data */ class StatePicker extends Screen {
        public static final int $stable = 0;

        @NotNull
        public static final StatePicker INSTANCE = new StatePicker();

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ Lazy f3822c = LazyKt.alpha(i.alpha, new C1589a(20));

        private StatePicker() {
            super("ckoStatePicker", null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return new C0266y("com.checkout.address.ui.navigation.Screen.StatePicker", INSTANCE, new Annotation[0]);
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof StatePicker);
        }

        public final int hashCode() {
            return -771726;
        }

        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f3822c.getValue();
        }

        @NotNull
        public final String toString() {
            return "StatePicker";
        }
    }

    public /* synthetic */ Screen(int i4, String str, K k6) {
        this.route = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer a() {
        v vVar = u.alpha;
        return new d("com.checkout.address.ui.navigation.Screen", vVar.bravo(Screen.class), new InterfaceC1772d[]{vVar.bravo(AddressEdit.class), vVar.bravo(CountryPicker.class), vVar.bravo(StatePicker.class)}, new KSerializer[]{new C0266y("com.checkout.address.ui.navigation.Screen.AddressEdit", AddressEdit.INSTANCE, new Annotation[0]), Screen$CountryPicker$$serializer.INSTANCE, new C0266y("com.checkout.address.ui.navigation.Screen.StatePicker", StatePicker.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(Screen self, Mf.b output, SerialDescriptor serialDesc) {
        ((AbstractC2796v6) output).xray(serialDesc, 0, self.route);
    }

    @NotNull
    public final String getRoute() {
        return this.route;
    }

    public Screen(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.route = str;
    }
}
