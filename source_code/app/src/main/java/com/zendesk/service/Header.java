package com.zendesk.service;

import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
public class Header {
    private final String name;
    private final String value;

    public Header(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Header header = (Header) obj;
            String str = this.name;
            if (str == null ? header.name != null : !str.equals(header.name)) {
                return false;
            }
            String str2 = this.value;
            String str3 = header.value;
            if (str2 == null ? str3 == null : str2.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int i4;
        String str = this.name;
        int i5 = 0;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i4 * 31;
        String str2 = this.value;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return i10 + i5;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Header{name='");
        sb2.append(this.name);
        sb2.append("', value='");
        return P0.gold(sb2, this.value, "'}");
    }
}
