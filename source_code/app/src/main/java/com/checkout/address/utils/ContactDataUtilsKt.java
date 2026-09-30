package com.checkout.address.utils;

import ao.ad;
import av.q;
import com.checkout.address.model.AddressFieldItem;
import com.checkout.address.model.Australia;
import com.checkout.address.model.Canada;
import com.checkout.address.model.State;
import com.checkout.address.model.US;
import com.checkout.components.address.J;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.model.contact.Address;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.interfaces.model.contact.Name;
import com.checkout.components.interfaces.model.contact.Phone;
import h5.C1809a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\b\u001a2\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000\u001a \u0010\n\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\f\u001a\u00020\u0001H\u0000\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u0001H\u0000\u001a*\u0010\u000f\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002\u001a\"\u0010\u0012\u001a\u0004\u0018\u00010\u000e*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0002\u001a,\u0010\u0014\u001a\u0004\u0018\u00010\u000e*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002\u001a\"\u0010\u0015\u001a\u0004\u0018\u00010\u000e*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a \u0010\u0016\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0002\"!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"buildContactData", "Lcom/checkout/components/interfaces/model/contact/ContactData;", "", "Lcom/checkout/components/interfaces/model/AddressField$Companion$Name;", "Lcom/checkout/address/model/AddressFieldItem;", "phoneCountryCode", "Lcom/checkout/components/interfaces/model/contact/Country;", "addressCountry", "selectedState", "Lcom/checkout/address/model/State;", "prefillFromContactData", "", "contactData", "summary", "", "setFieldValue", "name", "value", "getFieldValue", "fieldName", "getStateFieldValue", "getZipFieldValue", "setStateAndZip", "address", "Lcom/checkout/components/interfaces/model/contact/Address;", "getStateNameForPayoutRequiredCountry", "country", "stateCode", "PAYOUT_REQUIRED_COUNTRIES", "", "getPAYOUT_REQUIRED_COUNTRIES", "()Ljava/util/Set;", "PAYOUT_REQUIRED_COUNTRIES$delegate", "Lkotlin/Lazy;", "NUMBER_ONL_ZIP_COUNTRY", "getNUMBER_ONL_ZIP_COUNTRY", "()Lcom/checkout/components/interfaces/model/contact/Country;", "address_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContactDataUtilsKt {

    @NotNull
    private static final Lazy PAYOUT_REQUIRED_COUNTRIES$delegate = LazyKt.lazy(new C1809a(3));

    @NotNull
    private static final Country NUMBER_ONL_ZIP_COUNTRY = Country.UNITED_STATES_OF_AMERICA;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set PAYOUT_REQUIRED_COUNTRIES_delegate$lambda$27() {
        return ArraysKt.g(new Country[]{Country.UNITED_STATES_OF_AMERICA, Country.CANADA, Country.AUSTRALIA});
    }

    @NotNull
    public static final ContactData buildContactData(@NotNull Map<AddressField.Companion.Name, ? extends AddressFieldItem> map, @NotNull Country phoneCountryCode, @NotNull Country addressCountry, @Nullable State state) {
        Name name;
        Intrinsics.echo(map, "<this>");
        Intrinsics.echo(phoneCountryCode, "phoneCountryCode");
        Intrinsics.echo(addressCountry, "addressCountry");
        String fieldValue = getFieldValue(map, AddressField.Companion.Name.FirstName);
        String fieldValue2 = getFieldValue(map, AddressField.Companion.Name.LastName);
        Phone phone = null;
        if (fieldValue != null && fieldValue2 != null) {
            name = new Name(fieldValue, fieldValue2);
        } else {
            name = null;
        }
        String fieldValue3 = getFieldValue(map, AddressField.Companion.Name.Email);
        Address address = new Address(addressCountry, getFieldValue(map, AddressField.Companion.Name.AddressLine1), getFieldValue(map, AddressField.Companion.Name.AddressLine2), getStateFieldValue(map, addressCountry, state), getFieldValue(map, AddressField.Companion.Name.City), getZipFieldValue(map, addressCountry));
        String fieldValue4 = getFieldValue(map, AddressField.Companion.Name.Phone);
        if (fieldValue4 != null) {
            phone = new Phone(phoneCountryCode, fieldValue4);
        }
        return new ContactData(address, phone, name, fieldValue3);
    }

    private static final String getFieldValue(Map<AddressField.Companion.Name, ? extends AddressFieldItem> map, AddressField.Companion.Name name) {
        AddressFieldItem addressFieldItem = map.get(name);
        Object obj = null;
        if (addressFieldItem == null) {
            return null;
        }
        Object value = addressFieldItem.getState().getInputFieldState().getText().getValue();
        if (!StringsKt.gray((String) value)) {
            obj = value;
        }
        return (String) obj;
    }

    @NotNull
    public static final Country getNUMBER_ONL_ZIP_COUNTRY() {
        return NUMBER_ONL_ZIP_COUNTRY;
    }

    @NotNull
    public static final Set<Country> getPAYOUT_REQUIRED_COUNTRIES() {
        return (Set) PAYOUT_REQUIRED_COUNTRIES$delegate.getValue();
    }

    private static final String getStateFieldValue(Map<AddressField.Companion.Name, ? extends AddressFieldItem> map, Country country, State state) {
        if (getPAYOUT_REQUIRED_COUNTRIES().contains(country)) {
            if (state != null) {
                return state.getCode();
            }
            return null;
        }
        return getFieldValue(map, AddressField.Companion.Name.State);
    }

    private static final String getStateNameForPayoutRequiredCountry(Country country, String str) {
        Object obj;
        Object obj2;
        Object obj3;
        int i4 = J.f3854a[country.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return null;
                }
                Iterator<E> it = Australia.getEntries().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj3 = it.next();
                        if (Intrinsics.areEqual(((Australia) obj3).getCode(), str)) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                Australia australia = (Australia) obj3;
                if (australia == null) {
                    return null;
                }
                return australia.getDisplayName();
            }
            Iterator<E> it2 = Canada.getEntries().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (Intrinsics.areEqual(((Canada) obj2).getCode(), str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            Canada canada = (Canada) obj2;
            if (canada == null) {
                return null;
            }
            return canada.getDisplayName();
        }
        Iterator<E> it3 = US.getEntries().iterator();
        while (true) {
            if (it3.hasNext()) {
                obj = it3.next();
                if (Intrinsics.areEqual(((US) obj).getCode(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        US us = (US) obj;
        if (us == null) {
            return null;
        }
        return us.getDisplayName();
    }

    private static final String getZipFieldValue(Map<AddressField.Companion.Name, ? extends AddressFieldItem> map, Country country) {
        if (country == NUMBER_ONL_ZIP_COUNTRY) {
            String fieldValue = getFieldValue(map, AddressField.Companion.Name.Zip);
            if (fieldValue != null && fieldValue.length() > 5) {
                return ad.amber(StringsKt.yellow(5, fieldValue), "-", StringsKt.blue(5, fieldValue));
            }
            return fieldValue;
        }
        return getFieldValue(map, AddressField.Companion.Name.Zip);
    }

    public static final void prefillFromContactData(@NotNull Map<AddressField.Companion.Name, ? extends AddressFieldItem> map, @NotNull ContactData contactData) {
        AddressFieldItem.Standard standard;
        Intrinsics.echo(map, "<this>");
        Intrinsics.echo(contactData, "contactData");
        Address address = contactData.getAddress();
        setFieldValue(map, AddressField.Companion.Name.AddressLine1, address.getAddressLine1());
        setFieldValue(map, AddressField.Companion.Name.AddressLine2, address.getAddressLine2());
        setFieldValue(map, AddressField.Companion.Name.City, address.getCity());
        setStateAndZip(map, address);
        Country country = address.getCountry();
        AddressFieldItem addressFieldItem = map.get(AddressField.Companion.Name.Country);
        AddressFieldItem.Phone phone = null;
        if (addressFieldItem instanceof AddressFieldItem.Standard) {
            standard = (AddressFieldItem.Standard) addressFieldItem;
        } else {
            standard = null;
        }
        if (standard != null) {
            standard.getState().getInputFieldState().getText().setValue(country.emoji() + "  " + country.displayName());
        }
        Phone phone2 = contactData.getPhone();
        if (phone2 != null) {
            AddressField.Companion.Name name = AddressField.Companion.Name.Phone;
            setFieldValue(map, name, phone2.getNumber());
            Country country2 = phone2.getCountry();
            AddressFieldItem addressFieldItem2 = map.get(name);
            if (addressFieldItem2 instanceof AddressFieldItem.Phone) {
                phone = (AddressFieldItem.Phone) addressFieldItem2;
            }
            if (phone != null) {
                phone.getCountryState().getInputFieldState().getText().setValue(country2.emoji() + "  +" + country2.getDialingCode());
            }
        }
        Name name2 = contactData.getName();
        if (name2 != null) {
            setFieldValue(map, AddressField.Companion.Name.FirstName, name2.getFirstName());
            setFieldValue(map, AddressField.Companion.Name.LastName, name2.getLastName());
        }
        setFieldValue(map, AddressField.Companion.Name.Email, contactData.getEmail());
    }

    private static final void setFieldValue(Map<AddressField.Companion.Name, ? extends AddressFieldItem> map, AddressField.Companion.Name name, String str) {
        AddressFieldItem addressFieldItem;
        if (str != null && !StringsKt.gray(str) && (addressFieldItem = map.get(name)) != null) {
            addressFieldItem.getState().getInputFieldState().getText().setValue(str);
        }
    }

    private static final void setStateAndZip(Map<AddressField.Companion.Name, ? extends AddressFieldItem> map, Address address) {
        String zip;
        String stateNameForPayoutRequiredCountry = getStateNameForPayoutRequiredCountry(address.getCountry(), address.getState());
        if (stateNameForPayoutRequiredCountry == null) {
            stateNameForPayoutRequiredCountry = address.getState();
        }
        if (address.getCountry() == NUMBER_ONL_ZIP_COUNTRY) {
            String zip2 = address.getZip();
            if (zip2 != null) {
                zip = r.oscar(zip2, "-", "");
            } else {
                zip = null;
            }
        } else {
            zip = address.getZip();
        }
        setFieldValue(map, AddressField.Companion.Name.State, stateNameForPayoutRequiredCountry);
        setFieldValue(map, AddressField.Companion.Name.Zip, zip);
    }

    @NotNull
    public static final String summary(@NotNull ContactData contactData) {
        String number;
        Intrinsics.echo(contactData, "<this>");
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        String addressLine1 = contactData.getAddress().getAddressLine1();
        Phone phone = null;
        if (addressLine1 != null) {
            if (StringsKt.gray(addressLine1)) {
                addressLine1 = null;
            }
            if (addressLine1 != null) {
                arrayList.add(addressLine1);
            }
        }
        String addressLine2 = contactData.getAddress().getAddressLine2();
        if (addressLine2 != null) {
            if (StringsKt.gray(addressLine2)) {
                addressLine2 = null;
            }
            if (addressLine2 != null) {
                arrayList.add(addressLine2);
            }
        }
        String city = contactData.getAddress().getCity();
        if (city != null) {
            if (StringsKt.gray(city)) {
                city = null;
            }
            if (city != null) {
                arrayList.add(city);
            }
        }
        String state = contactData.getAddress().getState();
        if (state != null) {
            if (StringsKt.gray(state)) {
                state = null;
            }
            if (state != null) {
                arrayList.add(state);
            }
        }
        String zip = contactData.getAddress().getZip();
        if (zip != null) {
            if (StringsKt.gray(zip)) {
                zip = null;
            }
            if (zip != null) {
                arrayList.add(zip);
            }
        }
        arrayList.add(contactData.getAddress().getCountry().displayName());
        Phone phone2 = contactData.getPhone();
        if (phone2 != null) {
            if (!StringsKt.gray(phone2.getNumber())) {
                phone = phone2;
            }
            if (phone != null) {
                if (!StringsKt.gray(phone.getCountry().getDialingCode())) {
                    number = q.foxtrot("+", phone.getCountry().getDialingCode(), " ", phone.getNumber());
                } else {
                    number = phone.getNumber();
                }
                arrayList.add(number);
            }
        }
        sb2.append(CollectionsKt.maroon(arrayList, ", ", null, null, null, 62));
        return sb2.toString();
    }
}
