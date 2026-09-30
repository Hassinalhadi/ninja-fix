package com.incognia.internal;

import com.incognia.EventAddress;

/* loaded from: classes2.dex */
public final class l66 {
    public static NnB b(EventAddress eventAddress) {
        if (eventAddress == null) {
            return null;
        }
        return new NnB(eventAddress.getLatitude(), eventAddress.getLongitude(), eventAddress.getStreet(), eventAddress.getNumber(), eventAddress.getNeighborhood(), eventAddress.getCity(), null, eventAddress.getState(), eventAddress.getPostalCode(), eventAddress.getCountryName(), eventAddress.getCountryCode(), eventAddress.getAddressLine(), eventAddress.getLocale());
    }
}
