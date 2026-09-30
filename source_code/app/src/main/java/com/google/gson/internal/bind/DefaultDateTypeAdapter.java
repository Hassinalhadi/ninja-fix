package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends ad {
    public static final ae DEFAULT_STYLE_FACTORY = new ae() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.1
        @Override // com.google.gson.ae
        public <T> ad create(com.google.gson.l lVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Date.class) {
                return null;
            }
            int i4 = 2;
            return new DefaultDateTypeAdapter(b.bravo, i4, i4);
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };
    private static final String SIMPLE_NAME = "DefaultDateTypeAdapter";
    private final List<DateFormat> dateFormats;
    private final b dateType;

    private Date deserializeToDate(S8.a aVar) throws IOException {
        String purple = aVar.purple();
        synchronized (this.dateFormats) {
            try {
                Iterator<DateFormat> it = this.dateFormats.iterator();
                while (it.hasNext()) {
                    DateFormat next = it.next();
                    TimeZone timeZone = next.getTimeZone();
                    try {
                        try {
                            return next.parse(purple);
                        } finally {
                            next.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        next.setTimeZone(timeZone);
                    }
                }
                try {
                    return Q8.a.bravo(purple, new ParsePosition(0));
                } catch (ParseException e) {
                    StringBuilder victor = Q0.c.victor("Failed parsing '", purple, "' as Date; at path ");
                    victor.append(aVar.beige());
                    throw new JsonSyntaxException(victor.toString(), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        DateFormat dateFormat = this.dateFormats.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.google.gson.ad
    public T read(S8.a aVar) throws IOException {
        if (aVar.white() == S8.b.f2049b) {
            aVar.peach();
            return null;
        }
        return (T) this.dateType.bravo(deserializeToDate(aVar));
    }

    @Override // com.google.gson.ad
    public void write(S8.c cVar, Date date) throws IOException {
        String format;
        if (date == null) {
            cVar.azure();
            return;
        }
        DateFormat dateFormat = this.dateFormats.get(0);
        synchronized (this.dateFormats) {
            format = dateFormat.format(date);
        }
        cVar.navy(format);
    }

    private DefaultDateTypeAdapter(b bVar, int i4, int i5) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        Objects.requireNonNull(bVar);
        this.dateType = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i4, i5, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i4, i5));
        }
        if (com.google.gson.internal.g.alpha >= 9) {
            StringBuilder sb2 = new StringBuilder();
            if (i4 == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i4 == 1) {
                str = "MMMM d, yyyy";
            } else if (i4 == 2) {
                str = "MMM d, yyyy";
            } else if (i4 == 3) {
                str = "M/d/yy";
            } else {
                throw new IllegalArgumentException(ao.ad.zulu(i4, "Unknown DateFormat style: "));
            }
            sb2.append(str);
            sb2.append(" ");
            if (i5 == 0 || i5 == 1) {
                str2 = "h:mm:ss a z";
            } else if (i5 == 2) {
                str2 = "h:mm:ss a";
            } else if (i5 == 3) {
                str2 = "h:mm a";
            } else {
                throw new IllegalArgumentException(ao.ad.zulu(i5, "Unknown DateFormat style: "));
            }
            sb2.append(str2);
            arrayList.add(new SimpleDateFormat(sb2.toString(), locale));
        }
    }

    private DefaultDateTypeAdapter(b bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        Objects.requireNonNull(bVar);
        this.dateType = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }
}
