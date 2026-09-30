package com.incognia.internal;

import android.location.Address;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class ny {
    public static NnB b(Address address) {
        Locale locale;
        Double valueOf = Double.valueOf(address.getLatitude());
        Double valueOf2 = Double.valueOf(address.getLongitude());
        String thoroughfare = address.getThoroughfare();
        String subThoroughfare = address.getSubThoroughfare();
        String subLocality = address.getSubLocality();
        String locality = address.getLocality();
        String subAdminArea = address.getSubAdminArea();
        String adminArea = address.getAdminArea();
        String postalCode = address.getPostalCode();
        String countryName = address.getCountryName();
        String countryCode = address.getCountryCode();
        String addressLine = address.getAddressLine(0);
        if (address.getLocale() != null) {
            locale = address.getLocale();
        } else {
            locale = Locale.getDefault();
        }
        return new NnB(valueOf, valueOf2, thoroughfare, subThoroughfare, subLocality, locality, subAdminArea, adminArea, postalCode, countryName, countryCode, addressLine, locale);
    }
}
