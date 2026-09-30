package com.google.android.gms.common.server.response;

import V5.x;
import android.util.Base64;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.maps.android.BuildConfig;
import e6.AbstractC1630b;
import e6.AbstractC1631c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class FastSafeParcelableJsonResponse implements SafeParcelable {
    public static final Object hotel(FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        StringToIntConverter stringToIntConverter = fastJsonResponse$Field.f6655d;
        if (stringToIntConverter != null) {
            obj = (String) stringToIntConverter.red.get(((Integer) obj).intValue());
            if (obj == null && stringToIntConverter.purple.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
        }
        return obj;
    }

    public static final void india(StringBuilder sb2, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        int i4 = fastJsonResponse$Field.purple;
        if (i4 != 11) {
            if (i4 == 7) {
                sb2.append("\"");
                sb2.append(AbstractC1631c.alpha((String) obj));
                sb2.append("\"");
                return;
            }
            sb2.append(obj);
            return;
        }
        Class cls = fastJsonResponse$Field.f6652a;
        x.hotel(cls);
        sb2.append(((FastSafeParcelableJsonResponse) cls.cast(obj)).toString());
    }

    public abstract Map charlie();

    public final Object delta(FastJsonResponse$Field fastJsonResponse$Field) {
        if (fastJsonResponse$Field.f6652a != null) {
            Object echo = echo();
            String str = fastJsonResponse$Field.white;
            if (echo == null) {
                try {
                    return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            throw new IllegalStateException("Concrete field shouldn't be value object: " + str);
        }
        return echo();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Object echo() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastSafeParcelableJsonResponse fastSafeParcelableJsonResponse = (FastSafeParcelableJsonResponse) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : charlie().values()) {
            if (foxtrot(fastJsonResponse$Field)) {
                if (!fastSafeParcelableJsonResponse.foxtrot(fastJsonResponse$Field) || !x.lima(delta(fastJsonResponse$Field), fastSafeParcelableJsonResponse.delta(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (fastSafeParcelableJsonResponse.foxtrot(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    public final boolean foxtrot(FastJsonResponse$Field fastJsonResponse$Field) {
        if (fastJsonResponse$Field.silver == 11) {
            if (fastJsonResponse$Field.teal) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
            throw new UnsupportedOperationException("Concrete types not supported");
        }
        return golf();
    }

    public boolean golf() {
        return false;
    }

    public final int hashCode() {
        int i4 = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : charlie().values()) {
            if (foxtrot(fastJsonResponse$Field)) {
                Object delta = delta(fastJsonResponse$Field);
                x.hotel(delta);
                i4 = (i4 * 31) + delta.hashCode();
            }
        }
        return i4;
    }

    public String toString() {
        Map charlie = charlie();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str : charlie.keySet()) {
            FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) charlie.get(str);
            if (foxtrot(fastJsonResponse$Field)) {
                Object hotel = hotel(fastJsonResponse$Field, delta(fastJsonResponse$Field));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(Constants.SEPARATOR_COMMA);
                }
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                if (hotel == null) {
                    sb2.append(BuildConfig.TRAVIS);
                } else {
                    switch (fastJsonResponse$Field.silver) {
                        case 8:
                            sb2.append("\"");
                            sb2.append(Base64.encodeToString((byte[]) hotel, 0));
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            sb2.append(Base64.encodeToString((byte[]) hotel, 10));
                            sb2.append("\"");
                            break;
                        case 10:
                            AbstractC1630b.hotel(sb2, (HashMap) hotel);
                            break;
                        default:
                            if (fastJsonResponse$Field.red) {
                                ArrayList arrayList = (ArrayList) hotel;
                                sb2.append(Constants.AES_PREFIX);
                                int size = arrayList.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    if (i4 > 0) {
                                        sb2.append(Constants.SEPARATOR_COMMA);
                                    }
                                    Object obj = arrayList.get(i4);
                                    if (obj != null) {
                                        india(sb2, fastJsonResponse$Field, obj);
                                    }
                                }
                                sb2.append(Constants.AES_SUFFIX);
                                break;
                            } else {
                                india(sb2, fastJsonResponse$Field, hotel);
                                break;
                            }
                    }
                }
            }
        }
        if (sb2.length() > 0) {
            sb2.append("}");
        } else {
            sb2.append("{}");
        }
        return sb2.toString();
    }
}
